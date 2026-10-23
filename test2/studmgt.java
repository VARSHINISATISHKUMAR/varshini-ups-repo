import java.util.ArrayList;


class students{
    int rollno;
    String name;
    int marks;

    students(int rollno, String name, int marks){
        this.rollno= rollno;
        this.name= name;
        this.marks= marks;
    }
}

class studmgt{
    public static void main(String[] args){

        ArrayList<students> studlst= new ArrayList<>();
        studlst.add(new students(1, "Arjun", 99));
        studlst.add(new students(3, "Priya", 9));
        studlst.add(new students(5, "John", 87));
        studlst.add(new students(6, "Sarah", 73));
        studlst.add(new students(7, "Jane", 45));

        System.out.println("Students above 75 marks are: ");
        for (students s: studlst){
            if (s.marks>75)
                System.out.println(s.rollno + " " + s.name + " " + s.marks);
        }

        int searchno= 3;
        for (students s: studlst){
            if( s.rollno==searchno){
                System.out.println("Student found: " + s.name);
            }
        }

        for (students s: studlst){
            if(s.rollno==7){
                s.marks=77;
            }
        }

        studlst.removeIf(s -> s.rollno == 5);
        studlst.sort((a, b) -> a.marks - b.marks);

        System.out.println("Stduents sorted by their marks are: ");
        for (students s: studlst){
            System.out.println(s.rollno + " " + s.name + " " + s.marks);
        }
    }
}