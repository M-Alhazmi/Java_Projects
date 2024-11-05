/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author moham
 */
public class Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int threadCount=2;
    int[] x = {1,2,3,4,5,6,7,8};
    int[] y = new int[x.length];
    ExecutorService ex = Executors.newFixedThreadPool(threadCount);
    ex.execute(new matrix_multiplcation(x,y,0,2));
        ex.execute(new matrix_multiplcation(x,y,1,2));
ex.shutdown();
    System.out.print("y: ");
    for (int i=0; i<y.length; i++){
        System.out.printf("%5d", y[i]);
    }
    System.out.println();
  }
}
   
class matrix_multiplcation implements Runnable {
  int[] x;
  int[] y;
  int threadRank;
  int threadCount;
  
  public matrix_multiplcation(int[] x, int[] y, int threadRank, int threadCount) {
    this.x = x;
    this.y= y;
    this.threadRank = threadRank;
    this.threadCount = threadCount;
  }

  @Override /** Override the run() method to tell the system what the task to perform*/
  public void run() {
      if(threadRank==0){
          for(int i =0;i<5;i++){
              y[i]=x[i]*100;
          }
          
      }
  

      if(threadRank==1){
          for(int i =5;i<8;i++){
              y[i]=x[i]*100;
          }
  }
  }
}

