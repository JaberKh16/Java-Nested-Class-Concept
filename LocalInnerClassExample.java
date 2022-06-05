/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanestedclass.localinnerclass;


public class LocalInnerClassExample 
{
    private int data = 30;
    
    void display()
    {
        int value = 20;
        class LocalInner  // declared class inside a method is Local Inner Class
        {
            void message()
            {
                System.out.println("Value is : " + value);
                System.out.println("Outer Class variable value is: " + LocalInnerClassExample.this.data);
            }
        }
        
        // creating an object of LocalInner
        LocalInner ln = new LocalInner();
        ln.message(); // accessing LocalInner Class method - message()
    }
    
    public static void main(String [] args)
    {
        LocalInnerClassExample lcm = new LocalInnerClassExample();
        lcm.display();
    }
}
