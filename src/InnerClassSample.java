public class InnerClassSample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal.Dog dog = animal.new Dog();

    }
}


class Animal {

    String name;

    class Dog {
        String name;

        public void eating() {
            eat();
        }

        public void getName(String name) {
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Animal.this.name);
        }

    }






    
    public void eat() {
        System.out.println("eat");
    }

}

