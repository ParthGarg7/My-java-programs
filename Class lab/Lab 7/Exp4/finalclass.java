public class finalclass{
    public static void main(String[] args){
        Logger obj1 = new Logger();
        obj1.logMessage("Hi");
    }
}


// A final class can not be inherited means a child of final class not be created
final class Logger{
    Logger(){
    }
     
    void logMessage(String message){
       System.out.println(message + " Inside the final class");    
    }
}

/*  

class ExtendedLogger extends Logger{

}

*/
