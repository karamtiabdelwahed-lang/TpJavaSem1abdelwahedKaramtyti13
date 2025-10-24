public class Operation{
    public static void main(String[] args) {
        int A,B;
        A = 7;
        B = 18;
    System.out.println("A=" +A+" B=" +B);/*A= 7 B=18 */
        A+=B;
 System.out.println("A=" +A+" B=" +B);/*A= 25 B=18 */
 B-=8;
  System.out.println("A=" +A+" B=" +B);/*A= 25 B=10 */
  A*=B;
   System.out.println("A=" +A+" B=" +B);/*A= 250 B=10 */
A/=2;
 System.out.println("A=" +A+" B=" +B);/*A= 125 B=10 */
A%=2;
    }
}