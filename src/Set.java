public class Set {

    // Classe interna Node
    private class Node {

        public Integer element;
        public Node next;

        public Node(Integer element) {
            this.element = element;
            next = null;
        }
    }

    private Node head;
    private Node tail;
    private int count;

    public Set() {
        head = null;
        tail = null;
        count = 0;
    }

    // O SetTAD modela um conjunto, que é uma estrutura que armazena uma coleção de elementos que não aceita elementos
    // repetidos. Os métodos do TAD conjunto para números inteiros são apresentados a seguir. Escreva os algoritmos para a
    // classe Set que utilizem estruturas encadeadas.

    //   class Set
    //Retorna false se v ja pertence ao conjunto
    public boolean insere(Integer valor) {
        if (pertence(valor)) return false;
        Node novo = new Node(valor);
        if (count == 0) {
            head = novo;
        }
        tail.next = novo;
        tail = novo;
        count++;
        return true;
    }

    // Retorna true se v pertence ao conjunto
    public boolean pertence(Integer valor) {
        Node aux = head;
        for (int i = 0; i < count; i++) {
            if (aux.element == valor) return true;
            aux = aux.next;
        }
        return false;
    }

    // Retorna true se removeu v do conjunto
    public boolean retira(Integer valor) {
        if (pertence(valor) == false) return false;
        if (valor == null) {
            return false;
        }

        if (head.element == valor) { // remocao do primeiro
            head = head.next;
            if (count == 1) { // se havia so um elemento na lista
                tail = null;
            }
            count--;
            return true;
        }

        Node ant = head;
        Node aux = head.next;

        for (int i = 1; i < count; i++) {
            if (aux.element == valor) {
                if (aux == tail) { // remocao do ultimo
                    tail = ant;
                    tail.next = null;
                } else { // remocao do meio
                    ant.next = aux.next;
                }
                count--;
                return true;
            }
            ant = ant.next;
            aux = aux.next;
        }
        return false;
    }

    // Retorna a intersecção de s com o conjunto corrente
    public Set interseccao(Set s) {
        Set intersec = new Set();
        Node aux = head;
        for (int i = 0; i < count; i++) {
            if (s.pertence(aux.element)) {
                intersec.insere(aux.element);
            }
            aux = aux.next;
        }
        return intersec;
    }

}
