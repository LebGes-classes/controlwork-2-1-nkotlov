//Котлов Никита 11-306 4 вариант

public class DoublyLinkedList_<T> {

    // Внутренний класс Node, который представляет узел в двусвязном списке
    class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        // Конструктор для создания нового узла с заданными данными
        public Node(T data) {
            this.data = data;
        }
    }

    // Ссылка на голову списка (первый узел)
    Node<T> head;
    // Ссылка на хвост списка (последний узел)
    Node<T> tail;

    // Метод для добавления нового элемента в двусвязный список
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        // Если список пуст, новый узел становится и головой, и хвостом
        if (head == null) {
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        } else {
            // Если список не пуст, новый узел добавляется в конец списка
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }
}