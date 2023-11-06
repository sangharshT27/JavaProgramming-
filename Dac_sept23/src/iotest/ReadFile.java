
package iotest;

import java.io.FileInputStream;



public class ReadFile 
{ 
   
  //FileInputStream fin=null;
    void readFile()
    {
        int i;
        try( FileInputStream fin=new FileInputStream("C:\\java\\demo1.java");)
        {
            do{
            i=fin.read();
            System.out.println((char)i);
            
            }
            while(i!=-1);
        }
       catch(Exception e)
       {
             System.out.println(e.getMessage());
       }
        
    }
    public static void main(String[] args) 
    {
         ReadFile rf=new  ReadFile();
    }
}