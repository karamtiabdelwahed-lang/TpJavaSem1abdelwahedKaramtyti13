import java.util.Scanner;
public class exercie1 {
  public static int lecturen(){
    Scanner sc=new Scanner(System.in);
    int n;
    do{
      System.out.print("donner n");
      n=sc.nextInt();
    }
    while(n<=0);
    return n ;


  }
public static boolean estpaire(int n){
  return(n%2==0);

}
public static void main(String[]args){
  int x;
  for(int i=0;i<10;i++){
    x=lecturen();
    if(estpaire(x)==true){
      System.out.println("paire");
    }
  }
}
}




     
      

 