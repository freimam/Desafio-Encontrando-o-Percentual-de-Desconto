import java.util.*;
 
public class Main{

public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
		
    int M = input.nextInt();
    int S = input.nextInt();  
    
    //TODO:  Retorne o percentual de desconto que foi aplicado no produto
      
    int desconto = 0;
    
    desconto = 100 - (S * 100 / M);
   System.out.print("O desconto foi de " + desconto + "%");
  
}
}