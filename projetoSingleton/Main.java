package projetoSingleton;

import facade.Facade;
import projetoStrategy.Comportamento;
import projetoStrategy.ComportamentoAgressivo;
import projetoStrategy.ComportamentoDefensivo;
import projetoStrategy.ComportamentoNormal;
import projetoStrategy.Robo;

public class Main {
	public static void main(String[] args) {
		
		//testes relacionados ao Design Pattern Singleton
		System.out.println("------Singleton----------------------\n");
		Singleton single = Singleton.getInstancia();
		System.out.println(single);
		single = Singleton.getInstancia();
		System.out.println(single + "\n");
		
		SingletonApressado apressado = SingletonApressado.getInstancia();
		System.out.println(apressado);
		apressado = SingletonApressado.getInstancia();
		System.out.println(apressado + "\n");
		
		SingletonHolder holder = SingletonHolder.getInstancia();
		System.out.println(holder);
		holder = SingletonHolder.getInstancia();
		System.out.println(holder + "\n");
		
		//Strategy
		System.out.println("-------Strategy----------------------\n");
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		
		robo.setComportamento(normal);
		robo.mover();
		
		
		robo.setComportamento(defensivo);
		robo.mover();
		robo.mover();
		
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		//Facade
		System.out.println("-------Facade----------------------\n");
		Facade facade = new Facade();
		facade.migrarCliente("Nome: Pepson Anderson\n", "Cep: 45668-432\n");
	}

}
