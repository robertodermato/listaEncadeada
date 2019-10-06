public class AppSext {
    public static void main (String args[]){

        Set set1 = new Set();
        Set set2 = new Set();

        boolean r = set1.insere(1);

        r= set1.insere(2);
        r= set1.insere(3);
        r= set1.insere(4);
        r= set1.insere(5);

        r= set2.insere(3);
        r= set2.insere(4);
        r= set2.insere(6);
        r= set2.insere(7);

      Set intereseccao = set1.interseccao(set2);

    System.out.println(intereseccao);



    }
}
