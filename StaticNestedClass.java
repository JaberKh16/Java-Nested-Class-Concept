/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanestedclass.staticnestedclass;

public class StaticNestedClass 
{
    static int data = 30;
    
    static class InsidalStaticClass
    {
        int data = 20;
        
        static void getValue() // static method so can only access static members or methods
        {
            System.out.println("Static Class Data Variable Value is : " + StaticNestedClass.data);
        }
        
        void getValueInt() // non-static method can access instances members
        {
            System.out.println("Static Class Data Variable Value is : "  + this.data);
        }
        
        static void message(String msg)
        {
            System.out.println("Message is: " + msg);
        }
    }
    
    public static void main(String [] args)
    {
        StaticNestedClass.InsidalStaticClass isc = new StaticNestedClass.InsidalStaticClass();
        isc.getValueInt(); // calling static class non-static method
        StaticNestedClass.InsidalStaticClass.getValue();  // calling static class static method
        StaticNestedClass.InsidalStaticClass.message("Hello");                
    }
    
}
