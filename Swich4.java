package condicionais;
import java.util.*;

public class Swich4 {
    public static void main(String[] args) {
        String profissao;
        float salario = 0;
        int cargo;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o número do cargo:");
        System.out.println("1 - Programador Estagiário");
        System.out.println("2 - Programador Júnior");
        System.out.println("3 - Programador Pleno");
        System.out.println("4 - Programador Sênior");
        System.out.println("5 - Programador Master");
        cargo = entrada.nextInt();

        switch (cargo) {
            case 1:
                profissao = "Programador Estagiário";
                salario = 1540;
                break;
            case 2:
                profissao = "Programador Júnior";
                salario = 3360;
                break;
            case 3:
                profissao = "Programador Pleno";
                salario = 6215;
                break;
            case 4:
                profissao = "Programador Sênior";
                salario = 9200;
                break;
            case 5:
                profissao = "Programador Master";
                salario = 14160;
                break;
            default:
                profissao = "Cargo Inválido";
                System.out.println(profissao);
                return;
        }
        System.out.println(profissao);
        System.out.println("R$ " + salario);

    }
}
