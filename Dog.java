class Animal
{
    String name;
    Animal(String name) {
        this.name = name;
    }
    public void move() {
        System.out.println("Animals can move");
    }
    public void show() {
        System.out.println(name);
    }
}

class Dog extends Animal {
    Dog() {
                //Using this to call current class constructor
                this("Test");
    }
    Dog(String name) {
                //Using super to invoke parent constructor
                super(name);
    }
            public void move() {
                // invokes the super class method
                super.move();
                System.out.println("Dogs can walk and run");
            }
}
class Tester
{
    public static void main(String args[])
    {
                // Animal reference but Dog object
                Animal b = new Dog("Tiger");
                b.show();
                // runs the method in Dog class
                b.move();
    }
}


