package driver;
import util.*;
public class Main {
    public static void main(String[] args) {
	System.out.println("Scenario #1 for SSQueue: ");
	for(int n: new int[]{20,50,100,1000,10000,100000,1000000}){

	     SSQueue queue = new SSQueue(n);

	     long startTime = System.nanoTime();
	     for(int i = 0; i < n;i++)
	          queue.enqueue(i);
	     for(int i = 0;i < n;i++) {
	          queue.enqueue(n+i);
	          queue.dequeue();
	     }
	     long endTime = System.nanoTime();
	     long totalTime = endTime - startTime;
	     System.out.println(n + "," + totalTime);
	}
	System.out.println("Scenario #1 for CAQueue: ");
	for(int n: new int[]{20,50,100,1000,10000,100000,1000000}){

	     CAQueue queue = new CAQueue(n);

	     long startTime = System.nanoTime();
	     for(int i = 0; i < n;i++)
	          queue.enqueue(i);
	     for(int i = 0;i < n;i++){
	          queue.enqueue(n+i);
	          queue.dequeue();
	     }
	     long endTime = System.nanoTime();
	     long totalTime = endTime - startTime;
	     System.out.println(n + "," + totalTime);
	}
	System.out.println("Scenario #2 for SSQueue: ");
	for(int n: new int[]{20,50,100,1000,10000,100000,1000000}){

	     SSQueue queue = new SSQueue(n);

	     long startTime = System.nanoTime();
	     for(int i = 0; i < n;i++)
	          queue.enqueue(i);
	     for(int i = 0;i < n;i++)
	          if(Math.random()<.5)
	               queue.enqueue(n+i);
	          else
	               queue.dequeue();
	     long endTime = System.nanoTime();
	     long totalTime = endTime - startTime;
	     System.out.println(n + "," + totalTime);
	}
	System.out.println("Scenario #2 for CAQueue: ");
	for(int n: new int[]{20,50,100,1000,10000,100000,1000000}){

	     CAQueue queue = new CAQueue(n);

	     long startTime = System.nanoTime();
	     for(int i = 0; i < n;i++)
	          queue.enqueue(i);
	     for(int i = 0;i < n;i++)
	          if(Math.random()<.5)
	               queue.enqueue(n+i);
	          else
	               queue.dequeue();
	     long endTime = System.nanoTime();
	     long totalTime = endTime - startTime;
	     System.out.println(n + "," + totalTime);
	}
    }
}
