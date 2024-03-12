import java.util.Scanner;
public class quest05 {
    
    public static String invertString(String palavra){
        char[] letras = palavra.toCharArray();
        

        for(int i = 0; i < letras.length / 2; i++){
            char temp = letras[i];
            letras[i] = letras[letras.length - 1 - i];
            letras[letras.length - 1 - i] = temp;
        }

        return new String(letras);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palavra, invertedString;

        System.out.println("Digite uma palavra: ");
        palavra = sc.nextLine();

        invertedString = invertString(palavra);

        System.out.println("Palavra invertida: " + invertedString);

        sc.close();

    }
}
