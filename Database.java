package homework;

import java.util.ArrayList;
import java.util.List;


class Database<T extends File> {
    private List<T> items;

    public Database() {
        items = new ArrayList<T>();
    }

    public void add(T item) {
        items.add(item);
    }

public void print(){
    for ( T type: items) {
        type.play();
    }
}
}







