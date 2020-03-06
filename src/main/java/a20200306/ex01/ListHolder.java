package a20200306.ex01;

import java.util.ArrayList;
import java.util.List;

public class ListHolder {
    private List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public String itemAt(int index) {
        return items.get(index);
    }

    public List<String> getItems() {
        items.sort(String::compareTo);
        return items;
    }
}
