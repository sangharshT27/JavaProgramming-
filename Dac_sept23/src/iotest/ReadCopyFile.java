
package iotest;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadCopyFile
{
    void readFile()
    {
        int i;
        try( FileInputStream fin=new FileInputStream("C:\\java\\demo1.java");
                FileOutputStream fout=new FileOutputStream("C:\\java\\demo3.java"))
        {
            do{
            i=fin.read();
            fout.write(i);
            System.out.println((char)i);
            
            }
            while(i!=-1);
        }
       catch(Exception e)
       {
             System.out.println(e.getMessage());
       }
        
    }      public static void main(String[] args) 
    {
         ReadFile rf=new  ReadFile();
    }
  }

    
