package facade;

import subsistema1.CrmService;
import subsistema2.CepService;

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		String cidade = CepService.getInstancia().recuperarCidade(cep);
		String estado = CepService.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}

}
