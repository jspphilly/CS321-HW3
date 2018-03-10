/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacobphillip
 */
public class HashObject<T> {
    
    private T key;
    public int freqCount = 0;
    
   
    public HashObject(T cKey){
        this.key = cKey;
    }
    
    public T getKey(){
         return key;
    };
    
    @Override
    public String toString(){
        
        return key.toString();
    };
    
    public boolean equals(){
        
        return true;
    }
}
