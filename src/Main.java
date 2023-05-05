import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {





    public void checkPassword() {
        String password = JOptionPane.showInputDialog("Geef uw wachtwoord.");
        String letters[] = password.split("");
        System.out.println(password);
        System.out.println(letters);

        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }
        if (letters.length<=8){
            System.out.println("“Password must be at least 8 characters”");
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.checkPassword();
    }
/*
    public String letters() {
        String dier = JOptionPane.showInputDialog("Geef het eerste dier.");
        String zin = "";
        int score = 0;
        boolean naam = true;
        boolean gezegd = true;
        dieren.add(dier);
        String lijstje = "De opgenoemde dieren zijn :\n" + dier;
        lijst.setText(lijstje);
        System.out.println(dieren);
        String dier2 = JOptionPane.showInputDialog("Geef het volgende dier dat begint met de laatste letter van de vorige.");
        dieren.add(dier2);
        lijstje = "De opgenoemde dieren zijn :\n" + dier + ", " + dier2;
        System.out.println(dieren);

        while (naam == true && gezegd == true) {
            lijst.setText(lijstje);
            String letters1[] = dier.split("");
            String letters2[] = dier2.split("");
            String letter1 = letters1[letters1.length - 1];
            String letter2 = letters2[0];
            String einde = dier + " " + letter2 + " " + letter1 + " " + dier2 + "\n";
            if (letter1.equals(letter2) && isStringOnlyAlphabet(letter1)==true && isStringOnlyAlphabet(letter2)== true) {
                naam = true;
                System.out.println("juist");
                booleanTextField.setText("juist");
                booleanTextField.setBackground(Color.green);
                booleanTextField.setForeground(Color.BLACK);
            } else {
                naam = false;
                System.out.println("fout, dit dier begint met de verkeerde letter of bevat een symbool dat geen letter is.");
                booleanTextField.setText("fout, dit dier begint met de verkeerde letter of bevat een symbool dat geen letter is.");
                booleanTextField.setBackground(Color.RED);
                booleanTextField.setForeground(Color.BLACK);
            }
            System.out.println(einde);
            dier = dier2;
            dier2 = JOptionPane.showInputDialog("Geef het volgende dier dat begint met de laatste letter van de vorige.");
            for (int i = 0; i < dieren.size(); i++) {

                if (dieren.contains(dier2)) {
                    gezegd = false;
                    System.out.println("fout, dit dier is al opgenoemd");
                    booleanTextField.setText("fout, dit dier is al opgenoemd");
                    booleanTextField.setBackground(Color.RED);
                    booleanTextField.setForeground(Color.BLACK);
                } else {
                    gezegd = true;
                    booleanTextField.setText("juist");
                    System.out.println("juist");
                    booleanTextField.setBackground(Color.green);
                    booleanTextField.setForeground(Color.BLACK);
                }
                score = i + 1;
                System.out.println(score);
                scoreTextField.setText("De score is " + score);
            }
            dieren.add(dier2);
            lijstje = lijstje + ", " + dier2;
            System.out.println(dieren);

        }
        return zin;
    }
    public static boolean isStringOnlyAlphabet(String letter)
    {

        return ((letter != null) && (!letter.equals(""))
                && (letter.matches("^[a-zA-Z]*$")));
    }
    /*/

}