class Student {  
    // Private data members  
    private String name;  
    // Setter method  
    public void setName(String name) {  
        this.name = name;  
    }  
    // Getter method  
    public String getName() {  
        return name;  
    }  
}  
public class ENCAPSULATIONex {  
    public static void main(String[] args) {  
        Student s = new Student();  
        // Setting value using setter  
        s.setName("John");  
        // Getting value using getter  
        System.out.println("Student Name: " + s.getName());  
    }  
}  