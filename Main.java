import SingletonPattern.Logger;

public class Main {
    public static void main(String[] args){
        System.out.println("Hi...I am working");
        Logger.GetInstance().log("Hi, Logger");
    }
}
