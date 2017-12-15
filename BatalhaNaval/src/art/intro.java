package art;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class intro {

    public static void printBatalhaNaval() throws FileNotFoundException, IOException, InterruptedException {

        try (BufferedReader br = new BufferedReader(new FileReader("resources/intro_batalha_naval.txt"))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                Thread.sleep(100);
            }
        }
    }
}
