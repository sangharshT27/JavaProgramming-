
package dateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DateManupulationn {
     public static void main(String[] args) 
     {
        
             /*
             Date d=new Date();
             System.out.println(d);
             
             SimpleDateFormat sdf=new SimpleDateFormat("dd,MMM,yyyy hh:mm:ss");
             //for converting fate to string
             String strDate=sdf.format(d);
             
             System.out.println(strDate);*/
            
             String sDate="2023/20/23";
             SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
             try {  
             Date dt=sdf.parse(sDate);
                 System.out.println(dt);
         } catch (ParseException ex) {
             
         }
   
     }          
}
