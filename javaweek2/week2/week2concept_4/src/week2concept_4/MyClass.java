package week2concept_4;

public class MyClass {

}

class Test { 
    MyClass doSomething() {
    MyClass b = new MyClass(); //6��° ��
    return b; 
} 
    public static void main (String args[]) { 
    Test t = new Test(); 
    MyClass newObj = t.doSomething(); 
    newObj = new MyClass(); //13��° ��
    } 
}

