import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Kolejka {
    public static void main(String[] args) {

        Queue<Integer> kolejkaLiczb = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int liczba = scanner.nextInt();
        kolejkaLiczb.offer(liczba);


        Metody.dodajDoKolejki(kolejkaLiczb);
        System.out.println(kolejkaLiczb.size());
        Metody.zliczWyswietlSume(kolejkaLiczb);
    }
}