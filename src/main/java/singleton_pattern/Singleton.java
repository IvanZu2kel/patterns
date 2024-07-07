package singleton_pattern;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Приватный конструктор предотвращает создание экземпляров вне класса
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}