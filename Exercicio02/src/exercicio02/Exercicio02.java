package exercicio02;

import java.util.Scanner;

/**
 *
 * @author welliington F.
 */
public class Exercicio02 {

    public static void main(String[] args) {
        float totDistancia;
        float totCombustivel;
        float totConsumo;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Qual a distância total percorrida pelo carro(km): ");
        totDistancia = leitor.nextFloat();
        System.out.print("Qual o total de litros de combustível gasto: ");
        totCombustivel = leitor.nextFloat();
        totConsumo = totDistancia / totCombustivel;

        System.out.println("O consumo médio do automóvel foi de " + totConsumo
                + " km/l");
    }

}
