package singleton;

public class ThreadSafeSingletonPatternExample {

    public static void main(String[] args) {
        ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
        System.out.println("Presidents name: " + singleton.getPresident());
    }
}
