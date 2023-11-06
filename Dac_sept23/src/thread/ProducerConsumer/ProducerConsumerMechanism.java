//
//package thread.ProducerConsumer;
//
//import java.util.*;
//
//
//class Producer implements Runnable{
//    private final Vector buffer;
//    private final int SIZE;
//
//   public Producer(Vector buffer,int SIZE) {
//        this.buffer = buffer;
//        this.SIZE=SIZE;
//    }
//
//    public void produce(int i) throws InterruptedException
//    {
//        if(buffer.size()==SIZE){
//            synchronized(buffer)
//            {
//               System.out.println("The Buffer is Fulland Waiting to Consume Items"+buffer.size());
//               wait();//Blocked Production
//            }
//        }  
//        
//        
//            buffer.add(i);
//            buffer.notifyAll();//Unblock Consumer
//        
//    }
//    
//    @Override
//    public void run()
//    {
//      for(int i=1;i<10;i++)
//      {
//          try {
//              produce(i);
//          } catch (InterruptedException ex) {
//              System.out.println("Produce Items"+i);
//          }
//      }
//    }
//    
//    
//}
//class Consumer implements Runnable
//{
//    private final Vector buffer;
//    private final int SIZE;
//
//   public Consumer(Vector buffer,int SIZE) {
//        this.buffer = buffer;
//        this.SIZE=SIZE;
//    }
//   
//
//   public int consume() throws InterruptedException
//   {
//       if(buffer.isEmpty())
//       {
//           synchronized(buffer){
//           System.out.println("The buffer is Empty and waiting to produce items ");
//           buffer.wait();
//           }
//       }
//       
//           buffer.notifyAll();
//           return (Integer)buffer.remove(0);
//       
//   }   
//    @Override
//       public void run()
//       {
//           while(true)
//           {
//               try {
//                   System.out.println("Consume item"+consume());
//               } catch (InterruptedException ex) {
//                   
//               }
//               
//               try {
//                   Thread.sleep(100);
//               } catch (InterruptedException ex) {
//                   
//               }
//           }
//           
//       }
//   
//}
//public class ProducerConsumerMechanism {
//    public static void main(String[] args) {
//        
//        Vector buff=new Vector();
//        int size=5;
//        
//        Producer prod=new Producer(buff,size);
//        Consumer con1=new Consumer(buff,size);
//        
//        Thread t1=new Thread(prod);
//        Thread t2=new Thread(con1);
//        
//        t1.start();
//        t2.start();
//    }
//}


package thread.ProducerConsumer;

import java.util.*;

class Producer implements Runnable {
    private final Vector buffer;
    private final int SIZE;

    public Producer(Vector buffer, int SIZE) {
        this.buffer = buffer;
        this.SIZE = SIZE;
    }

    public void produce(int i) throws InterruptedException {
        synchronized (buffer) {
            if (buffer.size() == SIZE) {
                System.out.println("The Buffer is Full and Waiting to Consume Items " + buffer.size());
                buffer.wait(); // Blocked Production
            }
            buffer.add(i);
            buffer.notifyAll(); // Unblock Consumer
        }
    }

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                produce(i);
            } catch (InterruptedException ex) {
                System.out.println("Produce Items" + i);
            }
        }
    }
}

class Consumer implements Runnable {
    private final Vector buffer;
    private final int SIZE;

    public Consumer(Vector buffer, int SIZE) {
        this.buffer = buffer;
        this.SIZE = SIZE;
    }

    public int consume() throws InterruptedException {
        synchronized (buffer) {
            if (buffer.isEmpty()) {
                System.out.println("The buffer is Empty and waiting to produce items ");
                buffer.wait();
            }
            int item = (Integer) buffer.remove(0);
            buffer.notifyAll();
            return item;
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Consume item " + consume());
            } catch (InterruptedException ex) {
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
        }
    }
}

public class ProducerConsumerMechanism {
    public static void main(String[] args) {

        Vector<Integer> buff = new Vector<>(); // Specify the type of Vector (e.g., Integer)
        int size = 5;

        Producer prod = new Producer(buff, size);
        Consumer con1 = new Consumer(buff, size);

        Thread t1 = new Thread(prod);
        Thread t2 = new Thread(con1);

        t1.start();
        t2.start();
    }
}
