package singleton;

public final class SynchronizedSingleton {

    private static SynchronizedSingleton synchronizedSingleton;

    private SynchronizedSingleton() {}

    public static synchronized SynchronizedSingleton getInstance() {
        if (synchronizedSingleton == null) {
            synchronizedSingleton = new SynchronizedSingleton();
        }
        return synchronizedSingleton;
    }

}
