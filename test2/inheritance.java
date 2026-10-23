class employee{
    int id;
    String name;
    double basicsalary;

    employee(int id, String name, double basicsalary){
        this.id =id;
        this.name= name;
        this.basicsalary= basicsalary;
    }

    double calcsal(){
        return basicsalary;
    }

    void display(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + basicsalary);
    }
}

class fulltime extends employee{
    fulltime(int id, String name, double salary){
        super(id, name, salary);
    }
    @Override
    double calcsal(){
        return basicsalary*0.20;
    }
}

class parttime extends employee{
    int hrs;
    double rate;
    parttime(int id, String name, double salary, int hrs, double rate){
        super(id, name, salary);
        this.hrs= hrs;
        this.rate= rate;
    }
    @Override
    double calcsal(){
        return hrs*rate;
    }
}

class inheritance{
    public static void main(String[] args){
        employee e;
        e=new fulltime(1, "Arjun", 40000);
        e.display();
        System.out.println();
        e= new parttime(3, "Priya", 12000, 9, 200);
        e.display();
    }
}