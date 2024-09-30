package dio.primeiros_passos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);
		
		Calculadora calculadora = new Calculadora();

		System.out.println(calculadora.somar(2, 7));
	}

}
