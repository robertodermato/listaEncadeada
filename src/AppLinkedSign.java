public class AppLinkedSign {

    public static void main (String args[]){

        LinkedListSign lista = new LinkedListSign();

        lista.add(1);
        lista.add(0);
        lista.add(-1);
        lista.add(3);
        lista.add(5);
        lista.add(-10);
        lista.add(-7);
        lista.add(8);

        System.out.println(lista);

        System.out.println(lista.soPositivos());

        System.out.println(lista.soNegativos());





    }
}
