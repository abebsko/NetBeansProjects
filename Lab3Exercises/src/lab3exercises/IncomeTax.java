/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3exercises;

import javax.swing.JOptionPane;

/**
 *
 * @author seyib
 */
public class IncomeTax {
    public static void main( String[] args) {
        
        String strAnnualIncome = JOptionPane.showInputDialog(null, "What is your annual income?"); 
        double annualIncome = Double.parseDouble(strAnnualIncome);
        double taxToPay= 0.0;
        int limit0 = 10600; // 0% on £10600 or lower
        int limit20 = 42385; // 20% between £10000 and £42385
        int limit40 = 160600; // 40% between £42385 and £160600
        double taxable = annualIncome - limit0;
        
        if( annualIncome <= limit0) {
        taxToPay = 0; 
        } 
        else if (annualIncome > limit0 && annualIncome < limit20 ) {    
        taxToPay = (annualIncome- limit0)* 0.2;       
        } 
        else if ( annualIncome > limit20 && annualIncome < limit40){   
            taxToPay = (limit20*0.2) + ((taxable- limit20) *0.4); 
       
        } else if ( annualIncome > limit40){
          taxToPay = (limit20*0.2) + ((taxable- limit20) *0.4) + ((taxable - limit40)* 0.45); 
        } 
               
        JOptionPane.showMessageDialog(null,"Tax to pay is equal to £" + taxToPay);
    }
}
