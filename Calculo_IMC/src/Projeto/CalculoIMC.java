package Projeto;
import java.util.Scanner;

public class CalculoIMC {
	
	public static void main(String[] args) {
		//Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
		// É calculado dividindo o peso (em kg) pela altura ao quadrado (em metros).
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe sua altura");
        double altura = entrada.nextDouble();
		
		System.out.println("Informe seu peso");
		double peso = entrada.nextDouble();{
			
	double multAltura = (altura * altura);
	double imc= peso/multAltura;
	
	System.out.printf("O seu IMC é de %.2f\n",imc);
	
	if( imc >= 0 && imc <= 18.5) {
		System.out.println("Abaixo do peso");}
	if( imc >= 18.6 && imc <= 24.9) {
		System.out.println("Peso normal");}
	if( imc >= 25.0 && imc <= 29.9) {
		System.out.println("Pré-obesidade");}
	if( imc >= 30.0 && imc <= 34.9) {
		System.out.println("Obesidade Grau 1");}
	if( imc >= 35.00 && imc <= 39.9) {
		System.out.println("Obesidade Grau 2 ");}
	if( imc >= 40.0) {
		System.out.println("Obesidade Grau 3");}	
}
}
}