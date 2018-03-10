/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacobphillip
 */
public class Util {
    
    public static int[] findPrimes(int startRange, int endRange){
        int[] primes = {0,0};
        boolean found = false;
        int i = startRange % 2 == 0 ? startRange + 1 : startRange; 
        
        
        while(i < endRange && !found){
            System.out.println("I is: " + i);
            if(checkPrime(i)){
                System.out.println("Found a prime");
                if(checkPrime(i + 2)){
                    System.out.println("Found a second prime");
                    primes[0] = i;
                    primes[1] = i + 2;  
                    found = true;
                }
            }
            else{
                i+=2;
            }
        }
        
        return primes;
    } 
    
    
    private static boolean checkPrime(int p){
        boolean returnVal = true;
        
        for(int i = 0; i < 3; i++){
            int randomNum = (int) Math.ceil(Math.random() * p);
            
            if(modExpon(randomNum, p - 1, p) != 1){
                returnVal = false;
                break;
            }
        }
          
        return returnVal;
    }
    
    
    /**
     * Computes the modulo exponentiation
     * @param base 
     * @param exponent 
     * @param mod 
     * @return res - the end result of the mod exponentiation
     */
    private static int modExpon(int base, int exponent, int mod){
        //Return immediately if something looks off
        if (base < 1 || exponent < 0 || mod < 1){
           return -1;
        }
        
        int result = 1;  
        
        for (int i = 0; i < exponent; i++)
        {
            result *= base;
            result %= mod; 
        }
        
        
///        System.out.println("we know this number is prime");
//        while (exponent > 0)
//        {
//            if((exponent % 2) == 1){
//                result = (result * base) % mod;
//            }
//            base = (base * base) % mod; 
//            exponent = exponent >> 1; 
//        }

        return (int) result % mod;
    }
}
