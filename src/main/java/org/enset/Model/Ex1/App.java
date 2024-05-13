package org.enset.Model.Ex1;

public class App {
    public static void main(String[] args) {
        // Test with Integer
        StorageGenerique<Integer> intStorage = new StorageGenerique<>();
        intStorage.addElement(1);
        intStorage.addElement(2);
        intStorage.addElement(3);
        System.out.println("Integer Storage Size: " + intStorage.getSize());
        System.out.println("Element at index 1: " + intStorage.getElement(1));
        intStorage.removeElement(1);
        System.out.println("Integer Storage Size after removal: " + intStorage.getSize());

        // Test with String
        StorageGenerique<String> stringStorage = new StorageGenerique<>();
        stringStorage.addElement("Hello");
        stringStorage.addElement("World");
        System.out.println("\nString Storage Size: " + stringStorage.getSize());
        System.out.println("Element at index 0: " + stringStorage.getElement(0));

        // Test with Double
        StorageGenerique<Double> doubleStorage = new StorageGenerique<>();
        doubleStorage.addElement(3.14);
        doubleStorage.addElement(2.718);
        System.out.println("\nDouble Storage Size: " + doubleStorage.getSize());
        System.out.println("Element at index 1: " + doubleStorage.getElement(1));
    }
}
