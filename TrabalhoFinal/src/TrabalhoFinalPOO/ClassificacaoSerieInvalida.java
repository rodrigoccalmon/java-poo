package TrabalhoFinalPOO;

public class ClassificacaoSerieInvalida extends NumberFormatException {

	public ClassificacaoSerieInvalida (String message) {
		super("Voc� deve classificar um filme de 0 at� 5.");
	}

}
