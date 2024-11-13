package condicionais;
import java.util.*;

public class Swich2 {
    public static void main(String[] args) {

        int mes;
        String mensagem;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero do mes desejado: ");
        mes = entrada.nextInt();

        switch (mes){
            case 1: mensagem = "O numero um é o mes de janeiro";
                break;
            case 2: mensagem = "O numero dois é o mes de fevereiro";
                break;
            case 3: mensagem = "O numero tres é o mes de março";
                break;
            case 4: mensagem = "O numero quatro é o mes de abril";
                break;
            case 5: mensagem = "O numero cinco é o mes de maio";
                break;
            case 6: mensagem = "O numero seis é o mes de julho";
                break;
            case 7: mensagem = "O numero sete é o mes de junho";
                break;
            case 8: mensagem = "O numero oito é o mes de agosto";
                break;
            case 9: mensagem = "O numero nove é o mes de setembro";
                break;
            case 10: mensagem = "O numero dez é o mes de outubro";
                break;
            case 11: mensagem = "O numero onze é o mes de novembro";
                break;
            case 12: mensagem = "O numero doze é o mes de dezembro";
                break;
            default: mensagem = "Numero invalido";
        }
        System.out.println(mensagem);
    }
}
