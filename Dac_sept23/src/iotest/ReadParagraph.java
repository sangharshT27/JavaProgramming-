
package iotest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReadParagraph 
{
    void readPara()
    throws IOException
    {
        String str[]=new String[100];
        BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
        System.out.println("provide sentence to read all lines ");
       for(int i=0;i<str.length;i++)
       {
           str[i]=br.readLine();
           if(str[i].equals("stop"))
               break;
       }
       System.out.println("\n\n provide paragraph........");
        for(int i=0;i<str.length;i++)
       {
           str[i]=br.readLine();
           if(str[i].equals("stop"))
               break;
           System.out.println(str[i]);
       }
               
    }
    public static void main(String[] args) throws IOException 
    {
        ReadParagraph rp=new ReadParagraph();
        rp.readPara();
    }
}
