package org.enset.Model.Ex1;
import java.util.ArrayList;
import java.util.List;
public class StorageGenerique<T>{
    private List<T> elements;
    public StorageGenerique() {
        this.elements = new ArrayList<>();
    }

    public void addElement(T o) {
        elements.add(o);
    }

    public T getElement(int index) {
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public void removeElement(int index) {
        if (index >= 0 && index < elements.size()) {
            elements.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }
    public int getSize() {
        return elements.size();
    }
}
