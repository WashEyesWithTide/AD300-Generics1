// A generic class where T can be any type
public class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    // A generic method that can accept any type of Box
    public static void printBox(Box<?> box) {
        System.out.println("Box contains: " + box.get());
    }
}