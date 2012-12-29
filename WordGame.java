import java.io.*;
import java.util.Scanner;

class WirdGame
{

    public static void main(String[] abc)
    {

        Scanner myscan=new Scanner(System.in);
        final String mast="UNIVERSAL";
        int count=3;
        int point=100;
        boolean flag;            
        String ch;
        char choice=' ';

        System.out.println("                Welcome to Word Game             ");
        System.out.println("                 --------------------            ");


        do
        {
            if(count > 0 && point > 0)
            {

                System.out.println("Try your Luck by Guessing a Character -- You Have   : " + count);
                ch=myscan.next();

                flag=mast.contains(ch);
                if(flag)
                {
                    System.out.println(" Correct you are Rewarded 10 Points ");
                    point+=10;
                }
                else
                {
                    point-=10;
                    System.out.println("\n Incorrect you loose 10 Points\n");
                    count--;
                }

            }
            else
            {
                System.out.println("  Oops...Game Over!!!!!!!!1 /n You have " +point+ "Points");
                System.exit(0);
            }

            System.out.println("\n Do you Want to continue...........Y Or N");

            //choice=myscan.nextLine();
            try {
                choice=(char)System.in.read();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }while(choice != 'N');

        if(choice == 'N')
        {
            System.out.println(" \n"+ point + "Points");
            System.exit(0);
        }            
    }            

}
