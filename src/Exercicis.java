import javax.crypto.SecretKey;

public class Exercicis {

    public static void main(String[] args) {
        SecretKey secretKey = UtilitatsXifrar.keygenKeyGeneration(128);

        String text = "Exercici 5";
        byte[] textoCifrado = UtilitatsXifrar.encryptData(secretKey, text.getBytes());
        byte[] textoDescifrado = UtilitatsXifrar.decryptData(secretKey, textoCifrado);
        String Resultat = new String(textoDescifrado);

        System.out.println("Exercici 5: "+Resultat);

        SecretKey passwordKeyGeneration = UtilitatsXifrar.passwordKeyGeneration("password", 128);

        String text2 = "Exercici 6";
        byte[] encryptedData = UtilitatsXifrar.encryptData(passwordKeyGeneration, texto2.getBytes());
        byte[] decryptedData = UtilitatsXifrar.decryptData(passwordKeyGeneration, encryptedData);
        String decryptedText = new String(decryptedData);

        System.out.println("\nEjercicio 6: "+decryptedText);
}
