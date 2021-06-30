package singleton;

public final class BadSingleton {

    private static BadSingleton basicSingleton;

    private BadSingleton() {}

    public static BadSingleton getInstance() {
        /**
         * 동시성 제어 불가능.
         */
        if (basicSingleton == null) {
            basicSingleton = new BadSingleton();
        }
        return basicSingleton;
    }

}
