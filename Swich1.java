package condicionais;
import java.util.*;

public class Swich1 {
    public static void main(String[] args) {
        int farol;
        String mensagem;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        farol = entrada.nextInt();

        switch (farol){
            case 1 : mensagem = "Farol verde, prossiga!";
            break;
            case 2 : mensagem = "Farol amarelo, cuidado!";
            break;
            case 3 : mensagem = "Farol vermelho, pare!";
            break;
            default: mensagem = "Numero invalido!";
        }
        System.out.println(mensagem);
    }
}
