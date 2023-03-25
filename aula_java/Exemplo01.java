public class Exemplo01{

   public static void main (String[] args){
   
  double N1, N2, N3, N4, Res;
  
   System.out.println("Digite a primeira nota:");
   N1 = Double.parseDouble(System.console().readLine());
   
   System.out.println("Digite a segunda nota:");
   N2 = Double.parseDouble(System.console().readLine());
   
   System.out.println("Digite a terceira nota:");
   N3 = Double.parseDouble(System.console().readLine());
   
   System.out.println("Digite a quarta nota:");
   N4 = Double.parseDouble(System.console().readLine());
      
   Res = (N1 + N2 + N3 + N4) / 4;
   
   
   System.out.println("A sua media é: " + Res);

   
   
   }

}