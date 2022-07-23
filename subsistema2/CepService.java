package subsistema2;


public class CepService {
	
    private static CepService instancia = new CepService();;
	
	private CepService() {
		super ();
	}
	
	public static CepService getInstancia() {
		return instancia;
			
	}
	
	public String recuperarCidade(String cep) {
		return "Cidade: Nova Serrana\n";
	}
	
	public String recuperarEstado(String cep) {
		return "Estado: MG";
	}


}
