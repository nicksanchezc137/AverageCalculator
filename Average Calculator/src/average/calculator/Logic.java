/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package average.calculator;

/**
 *
 * @author nderi
 */
public class Logic {
    public double average;
    
    public double calculateAverage(){
        double total = 0;
        
        for(int i = 0; i < AverageCalculator.arr_num; i++ ){
           total +=  AverageCalculator.data[i];
        }
        return total/AverageCalculator.arr_num;
    }
    
}
