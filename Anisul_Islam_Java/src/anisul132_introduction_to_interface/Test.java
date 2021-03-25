
package anisul132_introduction_to_interface;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        
        Cat c = new Cat();
        c.eat();
        
    }
}
// There is not possible to create object of interface like bellow
// Interface can be implements only
// Animal a = new Animal;