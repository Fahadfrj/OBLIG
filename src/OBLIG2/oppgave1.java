package OBLIG2;
import static javax.swing.JOptionPane.*;
public class oppgave1 {

    public static void main(String [] args){

        int o= -1,n=0,sum=0;




        while(o<n){
            try{
                o = Integer.parseInt(showInputDialog("Enter the first number"));
                n = Integer.parseInt(showInputDialog("Enter the second number"));


            } catch (Exception e){
                o =0;
                n =0;

            }

            if(o<=n){

              showMessageDialog(null, "The first number should be higher than the second one");
              continue;
            }


        }
        for(int i=n ; i<=o; i++){
            if(i==o){
                sum+=i;
                System.out.print(" "+i + " = " + sum);
                continue;
            }
            System.out.print(" "+i + " +");
            sum+=i;
        }


    }
}
