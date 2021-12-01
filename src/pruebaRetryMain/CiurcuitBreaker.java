package pruebaRetryMain;

public class CiurcuitBreaker {
	public static int errores;
	public static void open() {
		System.out.println("Contraseña incorrecta prueba otra vez");
		try {
			Thread.sleep(5000);
			half_open();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void close() {
		System.out.println("Demasiados intentos");
	}
	public static void half_open() {
		if(errores==5) {
			close();
		}else {
			open();
			errores++;
		}
	}
}
