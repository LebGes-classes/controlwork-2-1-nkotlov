import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DoublyLinkedListTest {

    // Тест для метода add класса DoublyLinkedList
    @Test
    public void testAdd() {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();

        list.add("Hello");
        list.add("World");

        // Проверка, что головной элемент списка содержит "Hello"
        assertEquals("Hello", list.head.data);

        // Проверка, что последний элемент списка содержит "World"
        assertEquals("World", list.tail.data);

        // Проверка, что у головного элемента списка нет предыдущего элемента
        assertNull(list.head.prev);

        // Проверка, что у последнего элемента списка нет следующего элемента
        assertNull(list.tail.next);
    }
}