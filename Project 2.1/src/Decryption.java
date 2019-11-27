import java.util.*;
class Decryption{
   public static void main(String args[]){
       Scanner s=new Scanner(System.in);
       System.out.print("Enter number for decryption: ");
       int n=s.nextInt(),e=0,i,r;
       for(i=1;i<=4;i++){
           r=(n%10)-7;
           e=(e*10)+(r+20)%10;      
           n=n/10;
       }
       n=0;
       while(e>0){
           r=e%10;
           n=(n*10)+r;
           e=e/10;
       }
       System.out.println("The Encrypted number is "+n); //printing encrypted number.

   }
}