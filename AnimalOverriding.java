///overriding
/// overriding --  same method name, same parameters, same return type, same sequence of parameters
/// runtime polymorphism

class Animaloverriding{
    void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animaloverriding{
    void sound() {
        System.out.println("Barking");
    }

    public static void main(String[] args){
        Dog d = new Dog();
        d.sound();
    }
}
