import java.io.IOException;
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

            for (int i = 0; i < numBrowsers; i++) {
                myProcess = pb.start();
                browsers.add(myProcess);
            }

            for (int i = 0; i < browsers.size(); i++) {
                Process process = browsers.get(i);
                while (process.isAlive());
            }

            myProcess.waitFor();

        } catch (IOException | InterruptedException e) {
            System.out.println("Error");
           e.printStackTrace();
        }
    }
}