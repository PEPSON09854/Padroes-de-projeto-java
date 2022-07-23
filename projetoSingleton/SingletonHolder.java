package projetoSingleton;

public class SingletonHolder {
	private static SingletonHolder instancia = new SingletonHolder();
	
	private SingletonHolder() {
		super ();
	}
	
	public static SingletonHolder getInstancia() {
		return SingletonHolder.instancia;
		
		
	}

}
