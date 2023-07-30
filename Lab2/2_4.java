package Lab2;							
public class 2_4{							
public static void main(String[] args){							
//Object of MyClass derived from Q24 interface assigned to Q24 object							
Q24 test1 = new MyClass();							
test1.method1();							
test1.method2();							
}							
}							
File 2_4.java (interface)							
package Lab2;							
public interface 2_4 {							
void method1();							
void method2();							
}							
class MyClass implements 2_4 {							
@Override							
public void method1() {							
System.out.println("This message from overridden method-1 of MyClass derived from Q24 interface");							
}							
@Override							
public void method2() {							
System.out.println("This message from overridden method-2 of MyClass derived from Q24 interface");							
}							
}