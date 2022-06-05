/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanestedclass.memberinnerclass;


public class NestedMemberInnerClass 
{
        String s1 = "Outer1";
        String s2 = "Outer2";
        public NestedMemberInnerClass()
        {
            InnerClass inner = new InnerClass();
        }
        
        class InnerClass
        {
            String s1 = "Inner1";
            String s2 = "Inner2";
            
            InnerClass()
            {
                System.out.println(NestedMemberInnerClass.this.s1);  // prints "Outer1"
                System.out.println(this.s1);  // prints "Inner1"
                System.out.println(s2);  // prints "Inner2"
                System.out.println(NestedMemberInnerClass.this.s2);  // prints "Outer2"
            }
        }
        
        public static void main(String [] args)
        {
            NestedMemberInnerClass nmc = new NestedMemberInnerClass();
            
        }
}
