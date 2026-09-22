class C    
{    
public void disp()    
{    
System.out.println("C");    
}    
}    
class A extends C    
{    
public void disp()    
{    
System.out.println("A");    
}    
}    
class B extends C    
{    
public void disp()    
{    
System.out.println("B");    
}       
}    
public class hybridd extends A    
{    
public void disp()    
{    
System.out.println("D");    
}    
public static void main(String args[])    
{    
hybridd obj = new hybridd();    
obj.disp();    
}    
}    