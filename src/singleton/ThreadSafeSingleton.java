package singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    protected static String getPresident(){
      return "The President";
    }

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
