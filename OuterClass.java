/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanestedclass.memberinnerclass;


public class OuterClass 
{
    String name = "Outer Class";
    private int d = 111;
    
    void display()
    {
        new InnerClass().display();
    }
    
    class InnerClass
    {
        String name = "Inner Class";
        public void display()
        {
            System.out.println(this.name + ": " + OuterClass.this.name);
        }
        
    }
    
    public static void main(String [] args)
    {
        OuterClass o = new OuterClass();
        OuterClass.InnerClass in = o.new InnerClass();
        in.display();
        //System.out.println(in);
    }
}
