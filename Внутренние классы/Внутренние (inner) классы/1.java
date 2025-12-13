/**
 *
 * @author Arina
 */
public class Outer {
    
    // public — доступен из любого места
    public class PublicInner {
        public void show() {
            System.out.println("PublicInner");
        }
    }
    
    // protected — доступен в том же пакете и в подклассах
    protected class ProtectedInner {
        public void show() {
            System.out.println("ProtectedInner");
        }
    }
    
    // default (package-private) — доступен только в том же пакете
    class DefaultInner {
        public void show() {
            System.out.println("DefaultInner");
        }
    }
    
    // private — доступен только внутри внешнего класса
    private class PrivateInner {
        public void show() {
            System.out.println("PrivateInner");
        }
    }
    
    // Метод для демонстрации доступа к private-классу
    public void usePrivateInner() {
        PrivateInner pi = new PrivateInner();
        pi.show();
    }
}

// Класс в том же пакете
class SamePackageClass {
    public void test() {
        Outer outer = new Outer();
        
        // public — доступен
        Outer.PublicInner publicInner = outer.new PublicInner();
        publicInner.show();
        
        // protected — доступен (тот же пакет)
        Outer.ProtectedInner protectedInner = outer.new ProtectedInner();
        protectedInner.show();
        
        // default — доступен (тот же пакет)
        Outer.DefaultInner defaultInner = outer.new DefaultInner();
        defaultInner.show();
        
        // private — НЕ доступен
        // Outer.PrivateInner privateInner = outer.new PrivateInner(); // Ошибка!
        
        // Но можно вызвать через метод внешнего класса
        outer.usePrivateInner();
    }
}

public class Main {
    public static void main(String[] args) {
        SamePackageClass test = new SamePackageClass();
        test.test();
    }
}
