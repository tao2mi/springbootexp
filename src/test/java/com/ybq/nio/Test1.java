package com.ybq.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Test1 {
    public static void mains(String[] args) throws IOException {
        RandomAccessFile aFile = new RandomAccessFile("d:/a", "rw");
        FileChannel inChannel = aFile.getChannel();
        System.out.println("size:" + inChannel.size());

//create buffer with capacity of 48 bytes
        ByteBuffer buf = ByteBuffer.allocate(100);

        int bytesRead = inChannel.read(buf); //read into buffer.
        while (bytesRead != -1) {

            buf.flip();  //make buffer ready for read

            while (buf.hasRemaining()) {
                System.out.print((char) buf.get()); // read 1 byte at a time
            }

            buf.clear(); //make buffer ready for writing
            bytesRead = inChannel.read(buf);
        }
        aFile.close();
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        Path path = Paths.get("d:/a");
        System.out.println(path.getFileName());
        List<String> lines = Files.readAllLines(Paths.get("d:/a"), Charset.forName("utf-8"));
        lines.stream().forEach(System.out::println);

    }
}
