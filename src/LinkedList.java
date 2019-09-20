public class LinkedList {

    //Classe Node
    private class Node {

        public Integer element;
        public Node next;

        public Node(Integer e) {
            element = e;
            next = null;
        }
    }

    //Atributos da classe linkedList
    private Node head;
    private Node tail;
    private int count;

    public LinkedList() {
        this.count = 0;
        this.head = null;
        this.tail = null;
    }



    void add(int element)

    void add(int index, int element)

    int get(int index)

    int set(int index, int element)

    boolean remove(int element)

    int removeByIndex(int index)

    boolean isEmpty()

    int size()

    boolean contains(int element)

    int indexOf(int element)

    void clear()

}
