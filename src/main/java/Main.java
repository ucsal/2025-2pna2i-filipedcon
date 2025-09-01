import br.com.mariojp.solid.isp.*;

public class Main {
	public static void main(String[] args) {
		OfficeService svc = new OfficeService(new SimplePrinter());
		// Estado inicial: vai lançar UnsupportedOperationException por causa do scan
		// desnecessário
		svc.printReport("Relatório do Dia");
	}
}

