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

    public void add(int element){
        Node n = new Node (element);
        if (head==null) {head=n; tail=n;}
        if (count==1) {head=n; n.next=tail;}
        if (count>1) {head=n; n.next=head.next;}
            count ++;
    }

    public void add(int index, int element){
        Node n = new Node (element);
        if (index>=count+1) return;
        if (count==0) {head=n; tail=n;}
        if (count==1 && index==0) {head=n; n.next=tail;}
        if (count==1 && index==1) {head.next=n; tail=n;}
        if (count>1) {
            Node anterior = head;
            Node posterior= head.next;
            for (int i=0; i<index-1; i++){
                anterior=anterior.next;
                posterior=posterior.next;
            }
            anterior.next=n;
            n.next=posterior;
        }
        if (index==0) head=n;
        if (index==count) tail=n;
        count++;
    }

    public int get(int index){

    }

    int set(int index, int element)

    boolean remove(int element)

    int removeByIndex(int index)

    boolean isEmpty()

    int size()

    boolean contains(int element)

    int indexOf(int element)

    void clear()

}
