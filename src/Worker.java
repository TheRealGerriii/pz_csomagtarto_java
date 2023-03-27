import java.util.Scanner;

public class Worker {

    public Worker() {
        reader();
    }

    private void reader() {
        Scanner scan = new Scanner(System.in);

        System.out.println(" Hány százalékos most a csomagtartó? ");
        String nyers_szazalekertek = "0." + scan.nextLine();
        double szazalekertek = Double.valueOf(nyers_szazalekertek);

        System.out.println("Mekkora most a csomagtartó?");
        double szazaleklab = scan.nextDouble();

        scan.close();

        matek(szazalekertek, szazaleklab);
    }

    private void matek(double szazalekertek, double szazaleklab) {
        // double pelda_szazaleklab = 0.32;
        // double pelda_szazalekertek = 25;
        double alap = szazaleklab / szazalekertek;
        System.out.println(alap);

    }
}
