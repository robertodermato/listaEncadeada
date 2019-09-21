public class MyLinkedList {

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

    public MyLinkedList() {
        this.count = 0;
        this.head = null;
        this.tail = null;
    }

    public void add(int element) {
        Node n = new Node(element);
        if (head == null) {
            head = n;
            tail = n;
            count++;
            return;
        }
        if (count == 1) {
            head = n;
            n.next = tail;
            count++;
            return;
        }
        if (count > 1) {
            n.next = head;
            head = n;
        }
        count++;
    }

    public void add(int index, int element) {
        Node n = new Node(element);
        if (index == 0) {
            add(element);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        n.next = temp.next;
        temp.next = n;
        count++;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public int set(int index, int element) {
        Node n = head;
        for (int i = 0; i < index; i++) {
            n = n.next;
        }
        n.element = element;
        return element;
    }

    public boolean remove(int element) {
        if (isEmpty()) return false;
        Node anterior = head;
        Node posterior = head.next;
        if (anterior.element==element){
            head=posterior;
            count--;
            return true;
        }
        do {
            if (posterior.element==element){
                anterior.next=posterior.next;
                count--;
                return true;
            }
            anterior=anterior.next;
            posterior=posterior.next;
        } while (posterior.next != null);
        if (posterior.element==element){
            anterior.next=null;
            tail=anterior;
            count--;
            return true;
        }
        return false;
    }

    public int removeByIndex(int index){
        if (isEmpty()) return 1;
        if (index>=size()) return 1;

        Node anterior = head;
        Node posterior = head.next;

        if (index==0) {
            head=posterior;
            count--;
            return 1;
        }

        for (int i=0; i<index-1; i++){
            anterior=anterior.next;
            posterior=posterior.next;
        }

        anterior.next=posterior.next;
        count--;

        return 1;
    }
    /*






        boolean contains(int element)

    public int get(int index) {    }

        int indexOf(int element)
    */
    public void clear() {
        this.head = null;
        this.tail = null;
    }

    public String show() {
        if (count == 0) return "A lista está vazia";
        String lista = "";
        Node temp = head;
        int indice = 0;
        while (temp.next != null) {
            lista = lista + "\nElemento de índice (" + indice + "): " + temp.element;
            indice++;
            temp = temp.next;
        }
        lista = lista + "\nElemento de índice (" + indice + "): " + temp.element;
        return lista;
    }


}
