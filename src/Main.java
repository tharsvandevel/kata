import javax.swing.*;

public class Main {

    public void checkPassword() {
        String password = JOptionPane.showInputDialog("Geef uw wachtwoord.");
        String letters[] = password.split("");
        System.out.println(password);

        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }
        if (letters.length<=8){
            System.out.println("“Password must be at least 8 characters”");
        }
        else {
            System.out.println(password +" is valid");
        }
        //ik heb de rest niet kunnen laten werken dus heb ik het verwijdert
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.checkPassword();
    }

}