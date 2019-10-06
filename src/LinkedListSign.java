//Uma classe LinkedListSign implementa uma lista encadeada de números inteiros. Porém, os nodos desta lista, além do
//dado (número inteiro) e da referência para o próximo nodo, armazenam também uma referência para o próximo valor
//positivo e para o próximo valor negativo da lista, conforme ilustra a figura a seguir. O método add acrescenta elementos no
//final da lista. O método soPositivos retorna uma string com todos os valores positivos armazenados na lista e o método
//soNegativos retorna uma string com todos os valores negativos armazenados na lista. Explorando os links extras
//disponibilizados na classe Node, implemente o código dos métodos add, soPositivos e soNegativos. Escreva um exemplo
//de uso que utilize os métodos criados.

public class LinkedListSign {

    class Node {
        Integer dado;
        Node prox;
        Node proxPos;
        Node proxNeg;

        Node(int d) {
            dado = d;
            prox = null;
            proxPos = null;
            proxNeg = null;
        }
    }

    Node prim;
    Node ult;
    int count;

    public LinkedListSign() {
        prim = null;
        ult = null;
        count = 0;
    }

    public void add(Integer i) {
        Node aux = new Node(i);
        if (prim == null) {
            prim = aux;
        } else {
            ult.prox = aux;
        }
        ult = aux;
        count++;
    }

    public String soPositivos() {
        StringBuilder s = new StringBuilder();

        Node aux = prim;

        if (aux.dado > 0) s.append(aux.dado.toString());

        while (aux != null) {
            aux = aux.proxPos;
            s.append(aux.dado.toString());
            s.append("\n");
        }

        return s.toString();
    }

    public String soNegativos() {
        StringBuilder s = new StringBuilder();

        Node aux = prim;

        if (aux.dado < 0) s.append(aux.dado.toString());

        while (aux != null) {
            aux = aux.proxNeg;
            s.append(aux.dado.toString());
            s.append("\n");
        }

        return s.toString();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        Node aux = prim;

        while (aux != null) {
            s.append(aux.dado.toString());
            s.append("\n");
            aux = aux.prox;
        }

        return s.toString();
    }

}
