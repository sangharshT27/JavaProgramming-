
package thread.synchronization.bank;


public class Bank {
    public static void main(String[] args) {
        Account acc=new Account();
        
        Customer c1=new Customer("Ramesh",acc);
        Customer c2=new Customer("Suresh",acc);
        
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        
        t1.start();
        t2.start();
        
        
        
    }
            
}
