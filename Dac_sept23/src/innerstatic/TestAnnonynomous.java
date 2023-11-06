
package innerstatic;

interface ParentOfAnnonymous{
    public void greeting();
    void show();
}
class OuterOfAnnonymous{
    ParentOfAnnonymous p2=new ParentOfAnnonymous(){
        @Override
        public void greeting() {
            throw 
new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        @Override
        public void show() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    };
    ParentOfAnnonymous p=new ParentOfAnnonymous(){
        @Override
        public void greeting() {
            System.out.println("Say Namaste...");
        }
        @Override
        public void show() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    };
} 

public class TestAnnonynomous {
    public static void main(String[] args) 
    {
        
    }
    
}
