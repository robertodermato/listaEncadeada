public class AppMyLinkedList {
    public static void main (String args[]){

        /*
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

        int [] listaRev = minhaLista.getBackToFrontProfessora();
        System.out.println(listaRev[0] + " " + listaRev[1] + " " + listaRev[2]);


        minhaLista.add(12);
        minhaLista.add(13);
        minhaLista.add(15);

        System.out.println(minhaLista.show());
        System.out.println(minhaLista.size());

        int el = minhaLista.get(3);

        System.out.println("Elemento do índice é: " + el);

        int indice = minhaLista.indexOf(15);
        System.out.println("Indíce do elemento é: " + indice);

        int[] novaLista = minhaLista.subList(2,4);

        System.out.println("Sublista: " + novaLista[0] + " " + novaLista[1]);

        minhaLista.reverse();

        System.out.println("Lista invertida: " + minhaLista.show());


         */

        ListaDaProfessora lista1 = new ListaDaProfessora();
        lista1.add(1);
        lista1.add(5);
        lista1.add(7);
        lista1.add(9);

        int[] lista1vet = lista1.toArray();

        for (int m=0; m<lista1vet.length;m++){
            System.out.println(lista1vet[m] + " ");
        }
    }
}
