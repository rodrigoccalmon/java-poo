
public class Caneta {

	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	void status () {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Qual � a ponta? " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Est� tampada? " + this.tampada);
	}
	
	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO! N�o posso rabiscar. ");
		} else {
			System.out.println("Pode rabiscar a vontade. ");
		}
	}
	void tampar() {
		this.tampada = true;
	}
	void destampar() {
		this.tampada = false;
	}
	
}
