class Animals{
    void eat(){
        System.out.println("Eating");
    }
}

class Cat extends Animals{
    void noise(){
        System.out.println("Making noises");
    }
}

class Kitten extends Cat{
    void jump(){
        System.out.println("Jumping");
    }

    public static void main(String[] args){
        Kitten k= new Kitten();
        k.eat();
        k.noise();
        k.jump();
    }
}

