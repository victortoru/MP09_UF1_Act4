import javax.crypto.SecretKey;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TextamagatEx {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("src/clausA4.txt");
        Scanner sc = new Scanner(fileReader);

        Path path = Paths.get("src/textamagat.crypt");
        byte[] textabytes = Files.readAllBytes(path);

        while (sc.hasNext()){
            String línia = sc.nextLine();
            try {
                SecretKey secretKey = UtilitatsXifrar.passwordKeyGeneration(línia, 128);
                byte[] decryptedData = UtilitatsXifrar.decryptDataSinException(secretKey, textabytes);
                String textDesencriptat = new String(decryptedData);
                System.out.println("La contrasenya correcta es: "+línia+"\nText desencriptat: "+textDesencriptat);
            }catch (Exception e){
            }
        }
    }
}
