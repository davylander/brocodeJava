/*
 * Classe da aula Abstraction - Main
 * 23/03/2022
 * Todos os direitos autorais a Davi Souto & BroCode 
 */

package classAbstratction;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Main {

	public static void main(String[] args) {
		// abstract = abstract classes cannot be instantied, but they can have a subclass
		// 			  abstract mehotds are declared without a implementation
		//
		// agora eu entendi o sentido das classs Abstratas! Voc� v� um animal na mata, s� que aquele animal obrigatoriamente � de uma esp�cie n�o daria para responder a 
		// pergunta "Que animal �?" com "� o animal Animal". 
		// O mesmo serve para agentes no valorant. N�o existe agente Agente, exite agente Astra, agente Viper, agente Yoru....

		//Vehicle vehicle = new Vehicle();
		Car car = new Car();
		Motocycle moto = new Motocycle();
		Plane plane = new Plane();
		Ship galleon = new Ship();
		
		car.go();
		moto.go();
		plane.go();
		galleon.go();
		
	}

}
