import java.util.Scanner;

public class quest02 {

    public static boolean verificaFibonacci(int num){
        int fibonacci01 = 0;
        int fibonacci02 = 1;

        while(fibonacci02 <= num){
            if(num == fibonacci02){
                return true;
            }

            int proximoNum = fibonacci01 + fibonacci02;
            fibonacci01 = fibonacci02;
            fibonacci02 = proximoNum;
        }
        return false;
     }


	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 int valor = 0;

         System.out.println("Digite o número para verificar se pertence à sequência de Fibonacci");
         valor = sc.nextInt();

         if(verificaFibonacci(valor)){
            System.out.println("O número: " +valor + " pertence à sequência de Fibonacci!" );
         }else{
            System.out.println("O número: " +valor + " não pertence à sequência de Fibonacci!" );
         }


	}

}