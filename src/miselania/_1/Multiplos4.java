package miselania._1;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Multiplos4 {

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese limite de multiplos: ");
        int multiplo = Integer.parseInt(scanner.nextLine());

        List<Integer> list = multiplos(multiplo);

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }

    private static List<Integer> multiplos(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add( 4 * i);
        }
        return list;
    }
}
