package TrabalhoFinalPOO;

public class ClassificacaoForaDoRange extends NumberFormatException {
	public ClassificacaoForaDoRange (String message) {
		super("Voc� deve classificar um filme de 0 at� 5.");
	}
}
