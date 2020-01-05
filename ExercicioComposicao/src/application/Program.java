package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("nome do departamento: ");
		String departamento = sc.nextLine();
		System.out.println("dados do trabalhador: ");
		System.out.println("Nome:");
		String nome = sc.nextLine();
		System.out.println("Level:");
		String level = sc.nextLine();
		System.out.println("salário base:");
		Double salarioBase = sc.nextDouble();
		Worker worker = new Worker(nome, WorkerLevel.valueOf(level), salarioBase,  new Department(departamento));
		
		System.out.println("quantos contratos esse trabalhador tera? ");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			System.out.print("contrato #"+i+" data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contratoData = sdf.parse(sc.next());
			System.out.print("valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("duração (horas): ");
			int horas = sc.nextInt();
			HourContract contrato = new HourContract(contratoData, valorPorHora, horas);
			worker.addContract(contrato);
		}
		
		System.out.println();
		System.out.print("entre com o mes e ano para calculo (MM/YYYY): ");
		String mesAno = sc.next();
		/*
		 *estou recortando a variavel mesAno para pegar so o mes e atribuir a variavel mes e tbm recortando o ano para
		 *a variavel ano 
		 */
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		
		System.out.println("NOME = " + worker.getName());
		System.out.println("Departamento = " + worker.getDepartment().getName());
		System.out.println("renda para "+ mesAno + ": " + String.format("%.2f",  worker.income(ano, mes)));
		
		sc.close();
	}
}
