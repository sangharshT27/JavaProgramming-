package iotest.neotest;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyAndMove {
    public static void main(String[] args) {
        try{
            Path path=Paths.get("C:\\Users\\stamg\\Downloads\\OOPS Day 15.zip\\OOPS Day 15\\iotest\\niotest\\CopyAndMove.java");
            Path pathCopy=Paths.get("C:\\Users\\stamg\\Downloads\\OOPS Day 15.zip\\OOPS Day 15\\iotest\\niotest\\C.java");
            Files.move(path, pathCopy);
            System.out.println("Copied");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

