/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanestedclass.anonymousclass;

abstract class Person
{
    String name;
    Person(String name)
    {
        this.name = name;
    }
    static int b = 12;
    abstract void eat();
}

public class AnonymousClass {
    public static void main(String [] args)
    {
        Person person = new Person("Jaber") {
            @Override
            void eat() {
                System.out.println( this.name + " eats a lot");
            }
            
            void getNumber()
            {
                System.out.println("Static Member Variable values is: " + Person.b);
            }
        };
        
        person.eat(); 
        
    }
}
