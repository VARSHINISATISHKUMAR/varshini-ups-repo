class AnimalNew {
    void eat() {
        System.out.println("Eating");
    }
    void sleep() {
        System.out.println("Sleeping");
    }
    void sound() {
        System.out.println("Animal sounds");
    }
    String name;
    String breed;

    public AnimalNew(String name, String breed) {
        this.name=name;
        this.breed=breed;   
    }

}

//constructor for child class using super keyword
//init with values in the psvm for child

class Dog extends AnimalNew {
    void run() {
        System.out.println("Running");
    }
    public Dog(String name, String breed){
        super(name, breed);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");

        dog.eat();
        dog.sleep();
        dog.sound();
        dog.run();
    }
}
