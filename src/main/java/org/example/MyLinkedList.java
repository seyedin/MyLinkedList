package org.example;

public class MyLinkedList <T> {
    private Node head; // اشاره به ابتدای لیست
    private int size;  // تعداد عناصر لیست

    // کلاس Node برای نگهداری داده و اشاره‌گر به گره بعدی
    private static class Node <T>{
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // سازنده
    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // متد اضافه کردن عنصر به انتهای لیست
    public void add(T data) {
        Node newNode = new Node(data);
        if (head == null) { // اگر لیست خالی است
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) { // پیمایش تا انتهای لیست
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    // متد حذف عنصر بر اساس مقدار
    public boolean remove(T data) {
        if (head == null) { // اگر لیست خالی است
            return false;
        }

        if (head.data == data) { // اگر گره سر (head) حذف شود
            head = head.next;
            size--;
            return true;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) { // حذف گره وسط یا انتها
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }

        return false; // مقدار پیدا نشد
    }

    // متد دریافت عنصر با اندیس
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        Node temp = head;
        for (int i = 0; i < index; i++) { // پیمایش تا گره مورد نظر
            temp = temp.next;
        }
        return (T) temp.data; // بازگشت مقدار گره
    }


    // گرفتن تعداد عناصر
    public int size() {
        return size;
    }
}
