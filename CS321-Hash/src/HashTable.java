/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacobphillip
 */
public class HashTable<T>  {
    
    private T t;
    private double loadFactor = 0.0;
    public final int tableSize;
    private final int probType;
    private final T[] hashArray;
    
    
    
    public HashTable(Integer tableSize, Integer probType){
        this.tableSize = tableSize;
        this.probType = probType;
        this.hashArray = (T[]) new Object[tableSize];
    };
    
     public HashTable(Integer tableSize){
        this.tableSize = tableSize;
        this.probType = 1;
        this.hashArray = (T[]) new Object[tableSize];
    };


    public void addHash(T key, int index){
       HashObject newObj = new HashObject(key);
       hashArray[index] = (T) newObj;    
    }
    
    
    public void addKeyHash(T value){
        
        int index = hashFunc(value);
           
    }
    
    
    
    private int hashFunc(T value){
        int index = -1;
        boolean collision = false;
        
        do while(collision){
            collision = checkCollision(value);
        };
        
        //do first hash
            //do second hash
        
        
        
        return index;
    };
    
    private boolean checkCollision(T value){
        
        
        return true;
    }
}
