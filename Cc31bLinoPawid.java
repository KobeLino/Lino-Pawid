import java.util.Scanner;
        public class Cc31bLinoPawid{
            
            public static void main (String [] args){
                
                Scanner in=new Scanner(System.in);
                    System.out.println("Enter size of array: ");
                int size = in.nextInt();
                int num[]=new int [size];
                int mean=0;
                int i=0;
                int sum=0;
                
                for(i=0;i<num.length;i++){
                    System.out.print("Enter a number: ");
                    num [i]=in.nextInt();
                }
                System.out.println(mean(num));
            }
            
            static double mean(int []array){

                double counter=0;
                for(int i=0; i<array.length; i++){
                    counter+=array[i];
            }
            return counter/array.length;    
        }
}