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
    public boolean insere(Integer valor){
        if (pertence(valor)) return false;


        return true;
    }

    // Retorna true se v pertence ao conjunto
    public boolean pertence(Integer valor){
        Node aux = head;
        for (int i=0; i<count; i++){
            if (aux.element==valor) return true;
            aux=aux.next;
        }
        return false;
    }

    // Retorna true se removeu v do conjunto
    public boolean retira(Integer valor){return true;}

    // Retorna a intersecção de s com o conjunto corrente
    //    Set interseccao(Set s)
}
