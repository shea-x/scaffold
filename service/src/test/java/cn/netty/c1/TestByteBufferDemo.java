package cn.netty.c1;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class TestByteBufferDemo {
    public static void main(String[] args) {
        try (FileChannel channel = new FileInputStream("data.txt").getChannel()) {
            ByteBuffer byteBuffer = ByteBuffer.allocate(5);
            while (true) {
                int length = channel.read(byteBuffer);
                if (length == -1) {
                    break;
                }
                // 切换为读模式
                byteBuffer.flip();
                while (byteBuffer.hasRemaining()) {
                    byte b = byteBuffer.get();
                    System.out.println((char) b);
                }
                //切换为读模式
                byteBuffer.clear();
            }
        } catch (IOException e) {
        }
    }
}
