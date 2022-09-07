package cn.netty.c1;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class TestByteBuffer {

    /**
     * ByteBuffer正确使用姿势
     * 1.向buffer写入数据，例如调用channel.read(buffer)
     * 2.调用flip()切换至读模式
     * 3.从buffer读取数据，例如调用buffer.get()
     * 4.调用clear()或compact()切换至写模式
     * 5.重复1~4步骤
     *
     * @param args
     */

    public static void main(String[] args) {
        // 1.输入输出流 2.RandomAccessFile
        try (FileChannel channel = new FileInputStream("data.txt").getChannel()) {
            // 准备缓冲区
            ByteBuffer byteBuffer = ByteBuffer.allocate(10);
            while (true) {
                // 从channel中读取数据，向buffer写数据
                int len = channel.read(byteBuffer);
                if (len == -1) {
                    break;
                }
                // 打印buffer的内容
                byteBuffer.flip(); // 切换为读模式
                while (byteBuffer.hasRemaining()) { // 是否还有剩余数据
                    byte b = byteBuffer.get();
                    System.out.println((char) b);
                }
                byteBuffer.clear(); // 切换为写模式
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
