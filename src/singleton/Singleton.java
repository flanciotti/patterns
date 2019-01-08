package singleton;

public class Singleton {
    private static String data;
    private static Singleton uniqueInstance = null;

    public static Singleton getInstance( String data ){
        if( uniqueInstance == null ) {
            try {
                uniqueInstance = new Singleton(data);
            }
            catch( SingletonException se )
            {
                System.out.println( se.getMessage() );
            }
        }

        return uniqueInstance;
    }

    private Singleton( String data ) throws SingletonException {
        if( uniqueInstance != null )
            throw new SingletonException();

        this.data = data;
    }

    public String getData(){
        return this.data;
    }
}
