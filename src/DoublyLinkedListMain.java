public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();

        // Добавление элементов в список
        list.add("Элемент 1");
        list.add("Элемент 2");
        list.add("Элемент 3");

        // Вывод элементов списка в прямом порядке
        System.out.println("Элементы в листе (прямой порядок):");
        Node<String> current = list.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }

        // Вывод элементов списка в обратном порядке
        System.out.println("\n Элементы в листе (обратный порядок):");
        current = list.tail;
        while (current != null) {
            System.out.println(current.data);
            current = current.prev;
        }
    }
}

// Класс, представляющий двусвязный список
class DoublyLinkedList<T> {
    // Ссылка на голову списка
    Node<T> head;
    // Ссылка на хвост списка
    Node<T> tail;

    // Метод для добавления элемента в список
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

// Класс, представляющий узел в двусвязном списке
class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev;

    // Конструктор для создания нового узла с заданными данными
    public Node(T data) {
        this.data = data;
    }
}
