package Application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;


public class Program {
	public static void main(String[] args) {
		
	DateTimeFormatter tmf = DateTimeFormatter.ofPattern("dd/MM/yyy");

	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	System.out.println("Entre com os dados do contrato: ");
	System.out.print("Numero: ");
	int numeroContrato = sc.nextInt();
	System.out.println("Data (dd/MM/yyyy): ");
	LocalDate data = LocalDate.parse(sc.next(), tmf);
	System.out.print("Valor do contrato: ");
	double valorContrato = sc.nextDouble();
	Contract contract = new Contract(numeroContrato, data, valorContrato);
	
	
	System.out.print("Entre com o numero de parcelas: ");
	int n = sc.nextInt();
	
	ContractService contractService = new ContractService(new PaypalService());
	
	contractService.processContract(contract, n);
	
	System.out.println("Parcelas:");
	for (Installment installment : contract.getInstallments()) {
		System.out.println(installment);
	}
	
	
	sc.close();
	}
}
