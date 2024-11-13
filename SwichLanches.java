package condicionais;
import java.util.*;

public class SwichLanches {
    public static void main(String[] args) {
        int lanche;
        String mensagem;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o numero do pedido: ");
        lanche = entrada.nextInt();

        switch (lanche){
            case 1: mensagem = "Big Mac, MacFritas Grandes e Coca-Cola 500ml";
            break;
            case 2: mensagem = "Duplo Quarterão, MacFritas Média e Fanta laranja 300ml";
            break;
            case 3: mensagem = "Duplo Burger Bacon, Mega McNuggets e Coca-Cola 700ml";
            break;
            case 4: mensagem = "Triplo Burger, MacFritas Bacon Crispy e Coca-Cola Zero 700ml";
            break;
            case 5: mensagem = "Duplo Salada, Side Salad e Del Valle laranja 700ml";
            break;
            default: mensagem = "Numero invalido";
        }
        System.out.println(mensagem);

    }
}
