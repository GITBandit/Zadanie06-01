import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        int[] tablica = new int[10];

        for (int i = 0; i< tablica.length; i++){
            tablica[i] = random.nextInt();
        }
        for (int tab : tablica)
        System.out.println(tab);

        for (int a = 0; a<(tablica.length*2); a++){
            if(a<tablica.length) {
                System.out.print(tablica[a]+" ");
            } else if(a>=tablica.length){
                System.out.print(tablica[(tablica.length*2)-a-1]+" ");
            }

        }


    }
}
