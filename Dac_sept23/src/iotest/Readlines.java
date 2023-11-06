
package iotest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Readlines 
{
  

    void readlines() throws IOException
    {
        String  str;
        BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
        System.out.println("provide sentence to read its lines ");
       do
        {
            str=br.readLine();
            System.out.println(str);
            
        }
        while(!str.equals("stop"));
    }
    public static void main(String[] args) throws IOException
    {
        Readlines rd= new Readlines();
              rd.readlines();
    }
}
