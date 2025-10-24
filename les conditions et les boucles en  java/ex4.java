import java.util.Scanner;
public class ex4 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x , i , f;
        System.out.println("donner un entier positif");
        x=sc.nextInt();
        while (x<0){
            System.out.println("donner un entier positif");
            x=sc.nextInt();
            
        }
        if (x==0) {
            System.out.println("le fectoriel de 0 est 1"); 
        }
        else{
            f=1;
            for(i=1 ;i<=x;i++ ){
                f=f*i;
            }
            System.out.println(x+"!="+f);
        }
    }
}

    

