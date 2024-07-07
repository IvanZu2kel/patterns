package singleton_pattern;

public class Singleton2 {
    private Singleton2() {
        // Приватный конструктор
    }

    private static class Holder {
        private static final Singleton2 INSTANCE = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return Holder.INSTANCE;
    }
}
