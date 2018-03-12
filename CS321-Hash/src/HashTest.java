
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacobphillip
 */
public class HashTest {
    
    
     public static void main(String[] args){
         
         //validate arguments
//        if (args.length != 3)
//        {
//            System.out.println
//                ("Usage: java CPUScheduling <max-process-time> <max-level> <time-to-increment-priority> <simulation-time> <process arrival rate>");
//            System.out.println
//                ("<max-process-time>: max number of unit time for executing a process.");
//            System.out.println
//                ("<max-level>: priority levels are 1, 2, .. <max-level>");
//
//            System.exit(1);
//        }
        int tableType = 1;
        int probType = 1;
        HashTable hash;
       
 
        int[] primes = Util.findPrimes(95500, 96000);
         
        
        switch(tableType){
            
            case 1:
                hash = new HashTable(primes[1], 1);
                break;
                
            case 2:
                hash = new HashTable(primes[1], 1);
                break;
                
                
            case 3:
                hash = new HashTable(primes[1], 1);
                break;
        }
       
    
        
         System.out.println(Arrays.toString(primes));
        
     }
}
