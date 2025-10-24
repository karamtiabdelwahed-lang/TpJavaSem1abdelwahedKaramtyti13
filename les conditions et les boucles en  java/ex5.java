import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m; int a ; int j=0 ;
       
        System.out.println("donner le mois");
        

        m=sc.nextInt();
         System.out.println("donner l'annee");
        a=sc.nextInt();
     //   j=sc.nextInt();
        while (m>12 || m<1){
             System.out.println("donner le mois");
            m=sc.nextInt();



        
    }
    switch (m) {
        case 1,3,5,7,8,10,12:
        j=31;
            
            break;
            case 4,6,9,11:
             j=30;
             break;
        case 2:
        if((a%4==0)&&(a%100 !=0)||(a%400==0)){
            j=29;
        }
        else{
            j=28;
        }
        break;


    
        
    }
    System.out.println("en "+a+" le mois numero "+m+"a "  +j);
    
}
}
