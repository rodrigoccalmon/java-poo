package olimpiadas;

public class Atleta {
	public Atleta(String nome, double peso, String modalidade, int totalParticipantes) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.modalidade = modalidade;
		this.totalParticipantes = totalParticipantes;
	}
	private String nome;
	private double peso;
	private String modalidade;
	private int totalParticipantes;
	public void verificaSituacao() {
		if (this.peso > 90) {
			this.modalidade = "Peso Pesado";
			System.out.println("Participar�. ");
		} else if (this.peso > 60 && this.peso < 90) {
			this.modalidade = "Peso m�dio";
			System.out.println("Participar�. ");
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	public int getTotalParticipantes() {
		return totalParticipantes;
	}
	public void setTotalParticipantes(int totalParticipantes) {
		this.totalParticipantes = totalParticipantes;
	}
	public void status() {
		System.out.println("=========================================");
		System.out.println("OLIMP�ADA DA FUMA�A! ");
		System.out.println("Atleta: "+this.getNome());
		System.out.println("Peso: " +this.getPeso());
		System.out.println("Modalidade: "+this.getModalidade());
		System.out.println("Total de participantes: "+this.getTotalParticipantes());
		verificaSituacao();
	}
	
}
