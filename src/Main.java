import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ProcessBuilder pb = new ProcessBuilder("open", "-a", "Safari");
        Process myProcess = null;
        ArrayList<Process> browsers = new ArrayList<>();

        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el número de procesos");
            int numBrowsers = sc.nextInt();



        } catch () {

        }

    }
}