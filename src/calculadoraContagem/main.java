package calculadoraContagem;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf(" DIGITE 1 PARA CONTAGEM DE ACABADOS %n DIGITE 2 PARA CONTAGEM DE COMPONENTES %n");
        int cont = sc.nextInt();

        if (cont == 1) {

            System.out.print("CODIGO DO PRODUTO: ");
            String cod1 = sc.next();

            System.out.print("NUMERO DE CAIXAS: ");
            int caixa = sc.nextInt();

            System.out.print("QUANTIDADE POR CAIXA: ");
            int qntde = sc.nextInt();

            int acabados = caixa * qntde;
            System.out.printf("CODIGO: %s%n TOTAL = %d%n", cod1, acabados);
        } else if (cont == 2) {

        }
    }
}
