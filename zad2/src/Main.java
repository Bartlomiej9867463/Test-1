import java.util.Random;
public class Main {
    public static void main(String[] args) {

        zad2(20);
    }

    public static void zad2(int n) {
        int[] liczby = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            liczby[i] = (r.nextInt(100) - 50);
            System.out.println(liczby[i]);
        }
        int najmniejszy = liczby[0];
        int zliczacz = -1;
        for (int element : liczby) {
            if (element<najmniejszy)
            {
                najmniejszy =element;
                zliczacz=1;
            }
            else if (element==najmniejszy)
            {
                zliczacz++;
            }

        }
        System.out.println("najmniejszy element:"+ najmniejszy+ " ilosc:"+ zliczacz);
    }
}

