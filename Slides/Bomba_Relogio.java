import java.util.concurrent.TimeUnit;

public class Bomba_Relogio {

	public static void main(String[] args) throws InterruptedException  {
		
		int contador = 10;
				
		while (contador > 0)
		{
			System.out.println("Detonacao em: " + contador);
			contador = contador - 1;
			TimeUnit.SECONDS.sleep(1);
			
		}
		System.out.println("BOOM!!!");

	}

}
