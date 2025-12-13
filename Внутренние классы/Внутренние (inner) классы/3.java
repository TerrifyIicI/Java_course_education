/**
 *
 * @author Arina
 */
class Outer {
    
    public class Inner {
        public int publicField = 1;
        protected int protectedField = 2;
        int defaultField = 3;
        private int privateField = 4;
        
        public void publicMethod() {
            System.out.println("Inner public method");
        }
        
        protected void protectedMethod() {
            System.out.println("Inner protected method");
        }
        
        void defaultMethod() {
            System.out.println("Inner default method");
        }
        
        private void privateMethod() {
            System.out.println("Inner private method");
        }
    }
    
    public void accessInner() {
        Inner inner = new Inner();
        
        // Внешний класс имеет доступ ко ВСЕМ членам внутреннего класса,
        // включая private
        
        System.out.println("publicField: " + inner.publicField);
        System.out.println("protectedField: " + inner.protectedField);
        System.out.println("defaultField: " + inner.defaultField);
        System.out.println("privateField: " + inner.privateField);  // Доступен!
        
        inner.publicMethod();
        inner.protectedMethod();
        inner.defaultMethod();
        inner.privateMethod();  // Доступен
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.accessInner();
    }
}
