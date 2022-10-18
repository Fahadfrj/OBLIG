package OBLIG2;
import static javax.swing.JOptionPane.*;


class Tallspill {
     public static int Tall;
    public static int nyttTall() {
        // Trekker og returner et slumptall mellom 0 og 200.
        // Tips bruk : (int) (Math.random() * 201), som gir verdier mellom 0 og 200

        return (int) (Math.random() * 201);
    }

    public static void visMelding(String melding){
        // Viser parameterens innhold i en meldingsboks.
    }

    private static void forLite(int tall){
    showMessageDialog(null, "The number " + tall +" is smaller than the game number" + "\n" + "try a greater nnumber" );
    }

    private static void forStort(int tall) {
        showMessageDialog(null, "The number " + tall +" is greater than the game number" + "\n" + "try a smaller nnumber" );

    }

    public static void avsluttRunde(int antall, int gjetning) {
      showMessageDialog(null, "the number you guesse " + gjetning + " is correct" + "\n" + "you needed "+ antall+ " tries");
    }

    public static void kjørSpill() {

        Tall =   nyttTall();

        int s = -1 , t =0;
       while(true){
           s = Integer.parseInt(showInputDialog("Guess the number"));
           if(s > Tall){
               forStort(s);
           }
           if(s<Tall){
               forLite(s);
           }
           if(s==Tall){
               avsluttRunde(t , s);
               break;
           }

        t++;


       }
    }
}
public class oppgave2 {
    public static void main(String args []){
    int s = -1 , o=0;


    while(true){
           //showMessageDialog(null , "To start the game write 1" + "\n" + "To restart the game write 2" + "\n"+ "To quit the game write 3"  );

        s = Integer.parseInt(showInputDialog("To start the game write 1" + "\n" + "\n"+ "To quit the game write 2"  ));

        switch (s){
            case 1 : {
                Tallspill.kjørSpill();
                break;
            }
            case 2: o=-1; break;

        }
        if(o==-1){
            break;
        }


    }




    }
}
