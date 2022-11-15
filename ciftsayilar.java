import java.util.Scanner;

    public class ciftsayilar {
    
        public static void main(String[] args) {
         Scanner inp =new Scanner(System.in);
         
         int sayı;
	
	System.out.print("Sayı giriniz :");		

            sayı =inp.nextInt();
       
    for (int index = 0; index <=sayı ; index+=12) {System.out.println(index+",");
        
    }
        }
    }   
