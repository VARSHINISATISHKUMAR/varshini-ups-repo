class Animal {
    void eat() {
        System.out.println("Eating");
    }
    void sleep() {
        System.out.println("Sleeping");
    }
    void sound() {
        System.out.println("Animal sounds");
    }

}


class Dog extends Animal {
    void run() {
        System.out.println("Running");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.eat();
        dog.sleep();
        dog.sound();
        dog.run();
    }
}
