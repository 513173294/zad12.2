import java.util.Queue;
import java.util.Scanner;

public class Metody {
    static Scanner scanner = new Scanner(System.in);

    public static void dodajDoKolejki(Queue queue) {

        int i = 0;
        while (!queue.isEmpty()) {
            if (i == 9) {
                break;
            }
            System.out.println("podaj liczbe");
            int liczba = scanner.nextInt();
            queue.offer(liczba);
            i++;
        }
    }

    //    int suma = 0;
    public static void zliczWyswietlSume(Queue queue) {
        int suma = 0;
        int i = 0;
        while (!queue.isEmpty()) {



            Integer que = (Integer) queue.poll();
            suma += que;
            if (i == 9) {
                System.out.print(que+" = "+suma);
                break;
            }
            System.out.print(que + " + ");
            i++;
        }
    }
}
