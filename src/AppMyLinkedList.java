public class AppMyLinkedList {
    public static void main (String args[]){

        MyLinkedList minhaLista = new MyLinkedList();

        minhaLista.add(2);
        minhaLista.add(3);
        minhaLista.add(5);

        minhaLista.add(1,4);
        minhaLista.add(0,8);

        System.out.println(minhaLista.show());
        System.out.println(minhaLista.size());

        int i = minhaLista.set(2, 6);

        System.out.println(minhaLista.show());
        System.out.println(minhaLista.size());

        boolean rem = minhaLista.remove(8);


        System.out.println(minhaLista.show());
        System.out.println(minhaLista.size());

        int j = minhaLista.removeByIndex(3);

        System.out.println(minhaLista.show());
        System.out.println(minhaLista.size());

        minhaLista.add(12);
        minhaLista.add(13);
        minhaLista.add(15);

        System.out.println(minhaLista.show());
        System.out.println(minhaLista.size());

        int el = minhaLista.get(3);

        System.out.println(el);

    }
}
