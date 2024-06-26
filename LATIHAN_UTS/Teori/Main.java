public class Main {

    // Superclass (Parent Class)
    public static class Animal {
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }

    // Subclass Dog
    public static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }
    }

    // Main method untuk menguji pewarisan
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");

        System.out.println(dog.getName());
    }
}
