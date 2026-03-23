import java.util.ArrayList;
import java.util.List;

public class Library<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public T findItem(T item) {
        for (T i : items) {
            if (i.equals(item)) {
                return i;
            }
        }
        return null;
    }

    public List<T> getItems() {
        return items;
    }
}