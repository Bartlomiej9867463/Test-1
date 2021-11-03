import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę naturalną");
        n = in.nextInt();
        System.out.println("Podaj "+ n+ " liczb naturalnych");
        int[] liczby= new int[n];
        for(int i =0; i<n; i++) {
            int x = in.nextInt();
            liczby[i] = x;

        }
        System.out.println(findPrimes(liczby));
    }
    public static int findPrimes(int[] list) {
        int zliczacz=-1;
        for(int element: list){
            for(int i =2; i<=(element+1); i++){
                if (element==2)
                {
                    zliczacz++;
                }
                else if(element%i==0)
                {
                    break;
                }
                else if (i==(element-1))
                {
                    //System.out.println(element);
                    zliczacz++;
                }
            }
        }
        return zliczacz;
    }
}
