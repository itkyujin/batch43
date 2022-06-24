package inheritence;

public class Singleton {

    private static Singleton instnace = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return instnace;

    }
}
