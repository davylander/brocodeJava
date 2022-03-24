/*
 * Classe da aula 39 Encapsulation - Car
 * 24/03/2022
 * Todos os direitos reservados a Davi Souto Neri e BroCode
 */

package encapsulation_39;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Car {

	private String make;
	private String model;
	private int year;
	
	Car(String make, String model, int year){
		this.setMake(make);;
		this.setModel(model);;
		this.setYear(year);;
	}
	// EU AAAAAAAAAAAMOOOOOOOOOOOOOOOOOOO
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
}
