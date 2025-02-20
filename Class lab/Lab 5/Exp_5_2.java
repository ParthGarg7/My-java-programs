public class Exp_5_2{
    public static void main(String[] args) {

        Player.Play();
        Player.Train();
        
        Cricket_Player p1 = new Cricket_Player();
        p1.Name = "Rohit";
        p1.Age = 30;
        p1.Country = "India";
        p1.Position = "Captain";
        p1.Display_Cricket_Player();

        Hockey_Player p2 = new Hockey_Player("Dhyan Chand" , 31 ,"India" ,"Centre-forward" );
        p2.Display_Hockey_Player();


        Football_Player p3 = new Football_Player("India" ,"Forward");
        p3.Name = "Sunil Chhetri";
        p3.Age = 35;
        p3.Display_Football_Player();
    }
}

class Player{
    String Name;
    int Age;
    String Position;
    String Country;

    Player() {
    }

    static void Play(){
        System.out.println("Lets play a game");
    }

    static void Train(){
        System.out.println("Training is very important");
    }

}

class Cricket_Player extends Player{

    void Display_Cricket_Player(){
     System.out.println("Cricket_Player: ");
     System.out.println("Name: " + Name);
     System.out.println("Age: " + Age);
     System.out.println("Position: " + Position);
     System.out.println("Country: " + Country);
     System.out.println();
    }

  
}

class Hockey_Player extends Player{

    Hockey_Player(String a , int b , String c , String d) {
        Name = a;
        Age = b;
        Position = c;
        Country = d;
    }

    void Display_Hockey_Player(){
     System.out.println("Hockey_Player: ");
     System.out.println("Name: " + Name);
     System.out.println("Age: " + Age);
     System.out.println("Position: " + Position);
     System.out.println("Country: " + Country);
     System.out.println();
    }


}


class Football_Player extends Player{

    Football_Player(String Country , String Position) {
        this.Country = Country;
        this.Position = Position;
    } 
     
    void Display_Football_Player(){
     System.out.println("Football_Player: ");
     System.out.println("Name: " + Name);
     System.out.println("Age: " + Age);
     System.out.println("Position: " + Position);
     System.out.println("Country: " + Country);
     System.out.println();
    }



}






