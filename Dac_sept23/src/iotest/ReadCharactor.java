
package iotest;

import java.io.*;


public class ReadCharactor {
    void readCharactor() throws IOException
    {
        char c;
        BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
        System.out.println("provide sentence to read its characters ");
       do
        {
            c=(char)br.read();
            System.out.println(c);
            
        }
        while(c!='q');
    }
    public static void main(String[] args) throws IOException
    {
        ReadCharactor rd= new ReadCharactor();
        rd.readCharactor();
    }
            
}
