///over laoding
///overloading --  same method name, diff parameters, diff return type, diff sequence of parameters

class StudentOverloading{
    void display(String name) {
        System.out.println(name);
    }
    void display(String name, int age) {
        System.out.println(name + " is " + age + " years old ");
    }

    public static void main(String[] args) {
        StudentOverloading s = new StudentOverloading();
        s.display("Arun");
        s.display("Priya", 20);
    }
}

