package OBLIG2;
import static javax.swing.JOptionPane.*;


class Tallspill {
     public static int Tall;

    public static int nyttTall() {


        return (int) (Math.random() * 201);
    }

    public static void visMelding(String melding){
        showMessageDialog(null, melding);
    }

    private static void forLite(int tall){
        visMelding("The number" + tall +" is smaller than the game number" + "\n" + "try a greater nnumber");
   }

    private static void forStort(int tall) {
        visMelding("The number " + tall +" is greater than the game number" + "\n" + "try a smaller nnumber");

    }

    public static void avsluttRunde(int antall, int gjetning) {
        visMelding("the number you guesse " + gjetning + " is correct" + "\n" + "you needed "+ antall+ " tries");
    }

    public static void kjørSpill() {

        Tall =   nyttTall();

        int s , t =0;
       while(true){
           try{
               s = Integer.parseInt(showInputDialog("Guess the number"));

           }catch (Exception e){
               s=-1;
           }
           if(s == -1){

               visMelding("The number you entered is unrecognized");
               continue;
           }

               if(s > Tall){
               forStort(s);
           }
           else if(s<Tall){
               forLite(s);
           }
           else (s==Tall){
               avsluttRunde(t , s);
               break;
           }

        t++;


       }
    }
}
public class oppgave2 {
    public static void main(String args []){
    int s , o=0;


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
