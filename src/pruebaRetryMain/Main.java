package pruebaRetryMain;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		//Prueba Retry
		Retry retry=new Retry();
		retry.prueba();
		
		
		
		//Prueba de CircuitBreaker
		for (int b=0;b<3;b++) {
			if(CiurcuitBreaker.errores>2&&CiurcuitBreaker.errores<5) {
				CiurcuitBreaker.open();
			}
			if(CiurcuitBreaker.errores==5) {
				CiurcuitBreaker.close();
			}
			
		}
	}

}
