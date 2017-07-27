/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package average.calculator;
import java.util.Scanner;

/**
 *
 * @author nderi
 */
public class AverageCalculator {

    /**
     * @param args the command line arguments
     */
    static Scanner scanner = new Scanner(System.in);
    static  public int arr_num;
    public static  double [] data; 
    static String instructions;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        while(true){
           programLaunch();  
        }
    }
    public static void getInput(){
         System.out.println("Enter the number of entries\n");
        arr_num = scanner.nextInt();
        data  = new double[arr_num];
        
        for(int i = 0; i <arr_num; i++){
          System.out.println("Enter element " +i);
          data[i] = scanner.nextInt();
          
        }
    }
    
    public static void printOutput(){
        Logic logic = new Logic();
        
      System.out.println("The average is " + logic.calculateAverage()+"\n");  
    }
    public static void programLaunch(){
       System.out.println("What do you want to do?\n1.Get average of n numbers\n2.Instructions\n3.Exit");
       int choice = scanner.nextInt();
       switch(choice){
           case 1: {
               try{
               getInput();
               printOutput();
               }catch(Exception e){
                   System.out.println("Error");
               }
           }
           break;
           case 2: System.out.println(instructions);
           break;
           case 3: System.exit(0);
           break;
           default: System.out.println("Wrong choice entry!");
           
       }
          }
    
}
