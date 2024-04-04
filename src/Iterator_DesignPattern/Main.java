package Iterator_DesignPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Define a simple container class
class Box<T> {
    private List<T> items;

    public Box() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    // Getter for the items list
    public List<T> getItems() {
        return items;
    }
}

public class Main  {
    public static void main(String[] args) {
        // Create a box and add some items to it
        Box<String> box = new Box<>();
        box.addItem("Apple");
        box.addItem("Banana");
        box.addItem("Orange");

        // Get the iterator for the box
        Iterator<String> iterator = box.getItems().iterator();

        // Iterate over the items using the iterator
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
    }
}
