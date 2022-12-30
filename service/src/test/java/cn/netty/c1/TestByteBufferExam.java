package cn.netty.c1;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

import static util.ByteBufferUtil.debugAll;

public class TestByteBufferExam {
    public static void main(String[] args) {
        ByteBuffer source = ByteBuffer.allocate(32);
        source.put("Hello,world\nI'm zhangsan\nHo".getBytes(StandardCharsets.UTF_8));
        spilt(source);
        source.put("w are you?\n".getBytes(StandardCharsets.UTF_8));
        spilt(source);
    }

    private static void spilt(ByteBuffer source) {
        source.flip();
        for (int i = 0; i < source.limit(); i++) {
            // 找到一条完整数据
            if (source.get(i) == '\n') {
                int length = i + 1 - source.position();
                // 把这条完整消息存入新的ByteBuffer
                ByteBuffer target = ByteBuffer.allocate(length);
                // 从source读，向target写
                for (int j = 0; j < length; j++) {
                    target.put(source.get());
                }
                debugAll(target);
            }
        }
        source.compact();

    }
}
