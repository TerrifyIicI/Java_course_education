/**
 * @author Arina
 */
public class Outer {
    public int publicField = 1;
    protected int protectedField = 2;
    int defaultField = 3;
    private int privateField = 4;
    
    public void publicMethod() {
        System.out.println("public method");
    }
    
    protected void protectedMethod() {
        System.out.println("protected method");
    }
    
    void defaultMethod() {
        System.out.println("default method");
    }
    
    private void privateMethod() {
        System.out.println("private method");
    }
    
    public class Inner {
        public void accessOuter() {
            // Внутренний класс имеет доступ ко ВСЕМ членам внешнего класса,
            // включая private!
            
            System.out.println("publicField: " + publicField);
            System.out.println("protectedField: " + protectedField);
            System.out.println("defaultField: " + defaultField);
            System.out.println("privateField: " + privateField);  // Доступен!
            
            publicMethod();
            protectedMethod();
            defaultMethod();
            privateMethod();  // Доступен
        }
        
        // Доступ к внешнему классу через Outer.this
        public void showOuterThis() {
            System.out.println("Outer.this.privateField: " + Outer.this.privateField);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.accessOuter();
        inner.showOuterThis();
    }
}
