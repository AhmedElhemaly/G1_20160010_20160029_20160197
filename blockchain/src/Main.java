import java.util.ArrayList;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner cin=new Scanner (System.in);
    	String Transaction = "mohamed sent 100 coin to ahmed",T;
        Blockchain bc=new Blockchain(Transaction);
        for (int i=0;i<3;i++)
        {
            block b=new block();
            T=cin.nextLine();
            bc.addBlock(b,T);
        }

        for (int i=0;i<bc.blocks.size();i++)
        	System.out.println(bc.blocks.get(i).hashCode());
    }
}