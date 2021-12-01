package pruebaRetryMain;

public class Retry {
	public Retry() {
	}
	public void prueba() {
		int numeroprueba=10;
		int numerrores=0;
		for (int num=0;0<numeroprueba;num++) {
			if(num%numeroprueba==0) {
				
			}else if(numerrores<3){
				System.out.println("No tiene resto 0");
				numerrores++;
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				System.out.println("Numero de errores maximos");
				break;
			}
		}
	}
}
