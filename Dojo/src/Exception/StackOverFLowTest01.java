package Exception;

public class StackOverFLowTest01 {
	public static void main(String[] args) {
		recursividade();
	}
	
	public static void recursividade() {
		recursividade();
	}
}
//at Exception.StackOverFLowTest01.
//recursividade(StackOverFLowTest01.java:9)
//erro � algo que acontece na JVM.
//Solu��o � arrumar o c�digo ou tirar a recursividade. 
