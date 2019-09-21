public class AppMyLinkedList {
    public static void main (String args[]){

        MyLinkedList minhaLista = new MyLinkedList();

        minhaLista.add(2);
        minhaLista.add(3);
        minhaLista.add(5);

        minhaLista.add(1,4);
        minhaLista.add(0,8);


        System.out.println(minhaLista.show());


    }
}
