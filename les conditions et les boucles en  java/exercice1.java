

import java.util.Scanner;
public class exercice1 {
    public static void main(String[] args) {
        float t;
        System.out.println("enter temperature=");
         Scanner sc=new Scanner(System.in);
        t=sc.nextFloat();
        if(t<0){System.out.println("glace");
    }
    else if(t>0 && t<100){System.out.println("eau");}
    else{System.out.println("vapeur");}
    sc.close();


        
    }

}
