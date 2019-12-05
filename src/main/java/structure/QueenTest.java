package structure;

import java.util.LinkedList;
import java.util.Queue;

public class QueenTest  {
   public static void main(String[] args) {
    Queue<Long> queue = new LinkedList<Long>();
     long i = 1;
    while (true){

     boolean isFull = queue.add(i);
     if (!isFull){
      break;
     }
     i++;
    }

    System.out.println(i);


   }
}
