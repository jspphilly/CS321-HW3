
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
        
        
        
//        if(1){
//            HashTable<String> newHash = new HashTable<>(1,2);
//        }
        
        
         int[] primes = Util.findPrimes(95500, 96000);
         
         System.out.println(Arrays.toString(primes));
        
     }
}
