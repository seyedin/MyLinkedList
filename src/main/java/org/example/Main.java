package org.example;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        // افزودن عناصر
        list.add(10);
        list.add(20);
        list.add(30);
        for(int i = 0 ; i < list.size() ; i++){
            System.out.println(list.get(i));
        }

        // حذف عنصر

        list.remove(20);
        System.out.println("20 is removed. new List is: ");
        for(int i = 0 ; i < list.size() ; i++){
            System.out.println(list.get(i));
        }

        // گرفتن عنصر بر اساس اندیس
        System.out.println("Element at index 1: " + list.get(1)); // خروجی: 30

        // تعداد عناصر
        System.out.println("Size of list: " + list.size()); // خروجی: 2
    }
}
