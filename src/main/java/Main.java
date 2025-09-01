import br.com.mariojp.solid.isp.*;

public class Main {
	public static void main(String[] args) {
		OfficeService svc = new OfficeService(new SimplePrinter());
		// Estado inicial: vai lançar UnsupportedOperationException por causa do scan
		// desnecessário
		svc.printReport("Relatório do Dia");
	}
}

//OfficeService.printReport() chama scan() desnecessariamente. SimplePrinter não suporta 
//e lança UnsupportedOperationException.
//O teste espera não lançar. Inicialmente, falha.
//Tarefa
//
//    Segregar interfaces (Printer, Scanner) e garantir que printReport use apenas Printer.
