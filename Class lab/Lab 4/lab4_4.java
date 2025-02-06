
public class lab4_4{
    public static void main(String[] args) {
     
     University_Student S1 = new University_Student(); 
     S1.Student_Name = "Parth";
     System.out.println("Student Name: " + S1.Student_Name + " University Name is ");
     University_Student.Print();

     University_Student S2 = new University_Student(); 
     S2.Student_Name = "Ansh";
     System.out.println("Student Name: " + S2.Student_Name + " University Name is ");
     University_Student.Print();

     University_Student S3 = new University_Student(); 
     S3.Student_Name = "Gaurangi";
     System.out.println("Student Name: " + S3.Student_Name + " University Name is ");
     University_Student.Print();

     University_Student S4 = new University_Student(); 
     S4.Student_Name = "Himanshi";
     System.out.println("Student Name: " + S4.Student_Name + " University Name is ");
     University_Student.Print();

     University_Student S5 = new University_Student(); 
     S5.Student_Name = "Vanshika";
     System.out.println("Student Name: " + S5.Student_Name + " University Name is ");
     University_Student.Print();

    }
}

class  University_Student{

    static String University_Name = "UPES";
    String Student_Name;

    static void Print()
    {
        System.out.println("University Name: " + University_Name);
    }


}

