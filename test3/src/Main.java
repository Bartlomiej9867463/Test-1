import java.lang.StringBuffer;
public class Main {
    public static void main(String[] args) {

        System.out.println(delete("sdsdfasdfasfdabkdjdji","ab"));
    }

    public static String delete(String str, String substr) {
        int dlugoscstr = str.length();
        int dlugoscsubstr = substr.length();
        int indekssubstr = 0;
        String wynik="";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < dlugoscstr; i++) {
            if (str.charAt(i) == substr.charAt(indekssubstr)) {
                System.out.println("dsdfs");
                for (int j = 1; ((j < dlugoscsubstr)&&((str.charAt(i+j)==substr.charAt(j)))&&((dlugoscstr-dlugoscsubstr)>(dlugoscstr-i-1))); j++) {
                    System.out.println(j);
                    if((str.charAt(i+j)==substr.charAt(j))&&(j == (dlugoscsubstr-1)));
                    {
                        System.out.println("dsdfs");
                        i+=dlugoscsubstr;
                        break;
                    }
                }

            }
            sb.append(str.charAt(i));

        }
        wynik=sb.toString();


        return wynik;
    }
}