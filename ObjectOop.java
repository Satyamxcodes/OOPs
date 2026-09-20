class Dog {  
    String name;  
    void bark() {  
        System.out.println(name + " says Woof!");  
    }  
}  
public class ObjectOop {  
    public static void main(String[] args) {  
        Dog myDog = new Dog();
        Dog youDog = new Dog();     // Creating an object  
        myDog.name = "Rocky";
        youDog.name ="joy" ;     // Assigning value to the object's field  
        myDog.bark();
        youDog.bark();              // Calling method on the object  
        
    }  
}  