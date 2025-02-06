
 public  class lab4_1{
    public static void main(String[] args) {

    //    Student S1 = new Student();
    //    S1.Name = "Ansh";
    //    S1.Age = 20;
       Student S2 = new Student("Parth" , 19);

    //    S1.Print();
       S2.Print();

    }
    


 }

class Student
{
    String Name;
    int Age;
 
    Student(String name , int age)
    {
           Name = name;
           Age = age;
    }

    // Student() {
    // }

    
    void Print()
    {
       System.out.println("The of the Student is " + Name + " and the age of the student is " + Age);
    }
    
}