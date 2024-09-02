package logica;

import java.util.Scanner;

public class Desafio {
 public static void main(String[] args) {
  try (Scanner leitorDeEntrada = new Scanner(System.in)) {
   System.out.println("Digite seu salário:");
   float valorSalario = leitorDeEntrada.nextFloat();
   System.out.println("Digite o valor do beneficio:");
   float valorBeneficios = leitorDeEntrada.nextFloat();

   float valorImposto = 0;
   if (valorSalario >= 0 && valorSalario <= 1100) {
    valorImposto = 0.05F * valorSalario;
   } else if (valorSalario >= 1100.01 && valorSalario <= 2500.0) {
    valorImposto = 0.10F * valorSalario;
   } else {
    valorImposto = 0.15F * valorSalario;
   }

   float saida = (valorSalario - valorImposto) + valorBeneficios;

   System.out.println(String.format("Valor é %.2f", saida));
  }
 }
}