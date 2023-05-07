import javax.crypto.SecretKey;

public class Exercicis {

    public static void main(String[] args) {
        //Exercici 5:
        SecretKey secretKey = UtilitatsXifrar.keygenKeyGeneration(128);

        String text = "Exercici 5";
        byte[] textXifrat = UtilitatsXifrar.encryptData(secretKey, text.getBytes());
        byte[] textDesxifrat = UtilitatsXifrar.decryptData(secretKey, textXifrat);
        String Resultat = new String(textDesxifrat);

        System.out.println("Exercici 5: "+Resultat);

        //Exercici 6:
        SecretKey passwordKeyGeneration = UtilitatsXifrar.passwordKeyGeneration("password", 128);

        String text2 = "Exercici 6";
        byte[] encryptedData = UtilitatsXifrar.encryptData(passwordKeyGeneration, text2.getBytes());
        byte[] decryptedData = UtilitatsXifrar.decryptData(passwordKeyGeneration, encryptedData);
        String decryptedText = new String(decryptedData);

        System.out.println("Exercici 6: "+decryptedText);

        //Exercici 7:
        SecretKey keyGeneration2 = UtilitatsXifrar.passwordKeyGeneration("password", 128);
        System.out.println("\nExercici 7 utilitzant l'algorisme: "+keyGeneration2.getAlgorithm()+", Format a: "+ keyGeneration2.getFormat());

        //Exercici 8:
        SecretKey passwordKeycorrect = UtilitatsXifrar.passwordKeyGeneration("password", 128);
        SecretKey passwordincorrect = UtilitatsXifrar.passwordKeyGeneration("contrasenya", 128);

        String text3 = "Exercici 8";
        byte[] encryptedData2 = UtilitatsXifrar.encryptData(passwordKeycorrect, text3.getBytes());
        byte[] decryptedData2 = UtilitatsXifrar.decryptData(passwordincorrect, encryptedData2);
        String decryptedText2 = new String(decryptedData2);

        System.out.println("Exercici 8: "+decryptedText2);
    }
}
