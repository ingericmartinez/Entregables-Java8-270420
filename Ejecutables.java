//aplicaciones de prueba stand alone con las APIs que se integrarón en Java 8
package com.bc.pm;

/**
 * @author EAMV
 * @apiNote codigo ejemplo BC
 * @version 1.0
 */
public class Ejemplos {

	
	//obteniendo version de java directo de property
	public static void main(String[] args) {	
	
		System.out.println(System.getProperty("java.specification.version"));
	}

}

package com.bc.pm;

/**
 * @author EAMV
 * @apiNote codigo ejemplo BC
 * @version 1.0
 */
public class Ejemplos {

	
	//obteniendo variables de ambiente java 8
	public static void main(String[] args) {
	
		System.out.println("System.getenv(\"PATH\") = " + System.getenv("PATH"));

	}

}



package com.bc.pm;

import java.util.Properties;

/**
 * @author EAMV
 * @apiNote codigo ejemplo BC
 * @version 1.0
 */
public class Ejemplos {

	public static void main(String[] args) {
	
	        //properties es una clase que almacena atributos en clave valor
		//imprimo todo el Properties
		Properties props = System.getProperties();
		props.list(System.out);

	}

}



//paquete de Java time jsr 310
package com.bc.pm;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author EAMV
 * @apiNote codigo ejemplo BC
 * @version 1.0
 */

public class Ejemplos {

	public static void main(String args[]) {

		// el core de nuevo api TIME es localdate
		System.out.println("LocalDate : " + LocalDate.now());
		System.out.println("LocalDateTime : " + LocalDateTime.now());
	}
}



package com.bc.pm;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

/**
 * @author EAMV
 * @apiNote codigo ejemplo BC API TIME
 * @version 1.0
 */

public class Ejemplos {

	public static void main(String args[]) {

		// imprimiendo fecha sin format
		LocalDate fecha = LocalDate.of(2020, Month.JANUARY, 20);
		System.out.println("fecha : " + fecha);
		
	}
}


package com.bc.pm;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

/**
 * @author EAMV
 * @apiNote codigo ejemplo BC
 * @version 1.0
 */

public class Ejemplos {

	public static void main(String args[]) {

		//usando constructor de mes numerico
		LocalDate fecha = LocalDate.of(2020, 01, 20);
		System.out.println("fecha : " + fecha);
		LocalDate fecha2 = LocalDate.of(2020, 11, 20);
		System.out.println("fecha : " + fecha2);
		
	}
}


package com.bc.pm;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * @author EAMV
 * @apiNote codigo ejemplo BC
 * @version 1.0
 */

public class Ejemplos {

	public static void main(String args[]) {

		//usando un formateador para dia mes año
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

		  LocalDate fechaIni = LocalDate.of(2020, Month.APRIL, 26);
		  System.out.println(dateFormatter.format(fechaIni));

		  //utilizando plusDays
		  LocalDate fechaFin = fechaIni.plusDays(4);
		  System.out.println(dateFormatter.format(fechaFin));
		
	}
}



package com.bc.pm;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * @author EAMV
 * @apiNote codigo ejemplo BC
 * @version 1.0
 */

public class Ejemplos {

	public static void main(String args[]) {

		//usando un formateador para dia mes año
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

		  LocalDate fechaIni = LocalDate.of(2020, Month.APRIL, 25);
		  System.out.println(dateFormatter.format(fechaIni));

		  //utilizando plusDays, plusweeks, plusYears, plusMonth
		  LocalDate agregardias = fechaIni.plusDays(1);
		  LocalDate agregarMes = fechaIni.plusMonths(3);
		  LocalDate agregarSemanas = fechaIni.plusWeeks(2);
		  LocalDate agregarAños = fechaIni.plusYears(1);
		  System.out.println(dateFormatter.format(agregardias));
		  System.out.println(dateFormatter.format(agregarMes));
		  System.out.println(dateFormatter.format(agregarSemanas));
		  System.out.println(dateFormatter.format(agregarAños));
		  
		
	}
}

-------
// utilizando clase Optional

package com.bc.pm;

import java.util.Optional;

/**
 * @author EAMV
 * @apiNote codigo ejemplo BC
 * @version 1.0
 */

public class Ejemplos {

	public static void main(String args[]) {

		// Optional es un contenedor para objetos no nulos
		Ejemplos tester = new Ejemplos();
		
		Integer valor1 = null;
		Integer valor2 = new Integer(20);

		Optional<Integer> x = Optional.ofNullable(valor1);	
		Optional<Integer> y = Optional.of(valor2);
		
		System.out.println(tester.sum(x, y));
	}

	public Integer sum(Optional<Integer> x, Optional<Integer> y) {
	
		System.out.println("primer parametro " + x.isPresent());
		System.out.println("segundo parametro: " + y.isPresent());
		Integer valor1 = x.orElse(new Integer(0));
		Integer valor2 = y.get();
		return valor1 + valor2;
	}

}


//utilizando streams				

package com.bc.pm;

import java.util.Arrays;
import java.util.List;

/**
 * @author EAMV
 * @apiNote codigo ejemplo BC
 * @version 1.0
 */

public class Ejemplos {

	public static void main(String args[]) {

		//ejemplo de stream operacion count
		String cita = "vuela mas alto mas, mucho mas lejos mas";
        String[] token = cita.split("\\s+");

        //Coleccion a iterar
        List<String> palabras = Arrays.asList(token);

      //con iterador  
        int cont = 0;
        for(String w : palabras) {
            if(w.startsWith("a")) {
                cont++;
            }
        }
        System.out.println(cont);

     //con stream
     long resultado = palabras.stream().filter(w -> w.startsWith("a")).count();
        System.out.println(resultado);
	}
}



package com.bc.pm;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author EAMV
 * @apiNote codigo ejemplo BC
 * @version 1.0
 */

public class Ejemplos {

	public static void main(String args[]) {

		// ejemplo de stream operacion count
		String cita = "vuela mas alto mas, mucho mas lejos mas";
		String[] token = cita.split("\\s+");

		// Coleccion a iterar
		List<String> palabras = Arrays.asList(token);

		// con iterador
		int cont = 0;
		for (String w : palabras) {
			if (w.startsWith("a")) {
				cont++;
			}
		}
		System.out.println(cont);

		// con stream
		long resultado = palabras.stream().filter(w -> w.startsWith("a")).count();

		Stream<String> res = palabras.stream().filter(w -> w.startsWith("a")).distinct();
		Object ob = palabras.stream().filter(w -> w.startsWith("a")).equals(null);
		Optional opt = palabras.stream().filter(w -> w.startsWith("a")).findFirst();
		Optional opt2 = palabras.stream().filter(w -> w.startsWith("a")).findAny();
		System.out.println(resultado);
		System.out.println(res);
		System.out.println(ob);
		System.out.println(opt);
		System.out.println(opt2);
	}
}



package com.bc.pm;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author EAMV
 * @apiNote codigo ejemplo BC
 * @version 1.0
 */

public class Ejemplos {

	public static void main(String args[]) {
		// stream de filtrado, regresame los elementos que no son vacios de la

		List<String> palabras = Arrays.asList("com", "", "bc", "pm", "abd", "", "jl");

		List<String> filtrados = palabras.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println(filtrados);

		// regresame los elementos que son vacios
		List<String> strings = Arrays.asList("", "");
		List<String> filtradosDos = strings.stream().filter(string -> string.isEmpty()).collect(Collectors.toList());
		System.out.println(filtradosDos);

		//regresa un stream de numeros limitados a 20 y posteriormente se iteran
		Random rand = new Random();
		rand.ints().limit(20).forEach(System.out::println);

		List<Integer> numbers = Arrays.asList(6, 4, 4, 6, 14, 6, 10);

		// imprime cuadrados de los no repetidos utilizando map
		List<Integer> cuadrados = numbers.stream().map(j -> j * j).distinct().collect(Collectors.toList());
		System.out.println(cuadrados);

		// imprime los numeros al cubo utilizando map
		List<Integer> cubo = numbers.stream().map(j -> j * j * j).collect(Collectors.toList());
		System.out.println(cubo);

	}

}


-----

//trabajando con method references

package com.bc.pm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author EAMV
 * @apiNote codigo ejemplo BC
 * @version 1.0
 */

public class Ejemplos {

	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
	  
		//desde Java 7 podemos solo parametrizar un lado de la declaracion
		List<String> consultores = new ArrayList();
			
		consultores.add("Omar");
		consultores.add("Eric");
		consultores.add("Froilan");
		consultores.add("Gerardo");
		consultores.add("Alejandra");
		
		//method reference en la impresion	( llamar a la funcion println() por su nombre )
		consultores.forEach(System.out::println);
		
		try {
			throw new Exception("Mi excepcion generica");
		}catch(Exception e) {
			
			consultores.forEach(System.err::println);
		}
		finally {}
	}

}



// trabajando con default methods

package com.bc.pm;

import com.bc.pm.Ejemplos.Coche;
import com.bc.pm.Ejemplos.funciones;

/**
 * @author EAMV
 * @apiNote codigo ejemplo BC
 * @version 1.0
 */

public class Ejemplos {

	public static void main(String args[]) {
		Auto tesla = new Auto();
		tesla.encender();

	}

	interface funciones {

		// las default methods en interfaces permiten la implementacion de 1 metodo
		// en este caso encender

		static void acelerar() {
			System.out.println("acelerando....");
		}

		default void encender() {
			System.out.println("Hola, Soy un automovil Tesla 2021");
		}

	}
}

class Auto implements funciones {

}



package com.bc.pm;

/**
 * @author EAMV
 * @apiNote codigo ejemplo BC
 * @version 1.0
 */

public class Ejemplos implements Caminar {
	
	    public static void main(String[] args){
	    	Ejemplos humano = new Ejemplos();
	        humano.moverseAdelante();
	    }
	}


interface Caminar {
    default void moverseAdelante(){
        System.out.println("estoy moviendome...");
    }
}





// trabajando con base 64

package com.bc.pm;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author EAMV
 * @apiNote codigo ejemplo BC
 * @version 1.0
 */

public class Ejemplos {

	public static void main(String args[]) {

		// trabajando con API de BASE64

		// codificador
		Base64.Encoder codificador = Base64.getEncoder();
		String dato = "IMSW07:MYBCPASSWORD";
		String cadena64 = codificador.encodeToString(dato.getBytes(StandardCharsets.UTF_8));
		System.out.println(cadena64);

		// decodificador

		String datoadecodificar = "SU1TVzA3Ok1ZQkNQQVNTV09SRA==";
		Base64.Decoder decod = Base64.getDecoder();
		byte[] datodecodedByteArray = decod.decode(datoadecodificar);
		System.out.println(new String(datodecodedByteArray));

	}
}


------------------
	
// trabajando con expresiones lambda
	
package com.bc.pm;

/**
 * @author EAMV
 * @apiNote codigo ejemplo BC
 * @version 1.0
 */	
public class Ejemplos {


interface LambdaFunction {
    void call();
}
	
	//funcion lambda basica
	public static void main(String[] args) {	
	
		 LambdaFunct lambdaFunct = () -> System.out.println("Hola Mundo");
	        lambdaFunction.call();
	}

}



package com.bc.pm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author EAMV
 * @apiNote codigo ejemplo BC
 * @version 1.0
 */

public class Ejemplos {

	public static void main(String[] args) {

		// lambda basica
		List<String> milista = new ArrayList();
		milista.add("1");
		milista.add("2");
		milista.add("3");
		milista.add("4");
		milista.add("5");

		milista.forEach(x -> { // imprimo todos
			System.out.println(x);

			// imprimo vlores pares
			if (new Integer(x).intValue() % 2 == 0)
				System.out.println(x.toString());
		});

	}

}



package com.bc.pm;

/**
 * @author EAMV
 * @apiNote codigo ejemplo BC
 * @version 1.0
 */	

@FunctionalInterface  
interface Dibujable{  
    public void dibujar();  
}  

public class Ejemplos {



	    public static void main(String[] args) {  
	        int width=10;  
	          
	    
	        Dibujable d=()->{  
	            System.out.println("dibujando.. "+ width);  
	        };  
	        d2.dibujar();  
	    }  
	}  



package com.bc.pm;

/**
 * @author EAMV
 * @apiNote codigo ejemplo BC
 * @version 1.0
 */

@FunctionalInterface
interface Mensajeable {
	public String saludar();
}

public class Ejemplos {

	public static void main(String[] args) {
		Mensajeable m = () -> {

			return "Hola Mundo";
		};
		System.out.println(m.saludar());
	}
}




package com.bc.pm;

/**
 * @author EAMV
 * @apiNote codigo ejemplo BC
 * @version 1.0
 */

   
public class Ejemplos {  
    public static void main(String[] args) {  
          
    
    	Sumable uno=(a,b)->(a+b);  
        System.out.println(uno.agregar(1,2));  
          
  
        Sumable dos=(int a,  int b)->{ return (a+b);   
                            };  
        System.out.println(dos.agregar(45,89));  
    }  
}  

interface Sumable{  
    int agregar(int a,int b);  
} 



package com.bc.pm;

/**
 * @author EAMV
 * @apiNote codigo ejemplo BC
 * @version 1.0
 */

public class Ejemplos {

	public static void main(String[] args) {

		// ejemplos lambda

		Saludar saludar = (String nombre) -> System.out.println("Hola " + nombre);

		Prueba prueba = (int x, int y) -> {
			return x * y;
		};

		prueba.suma(1, 2);
		System.out.println(prueba.suma(1, 2));
		saludar.mensaje("Eric Martinez");

	}

}

interface Prueba {
	int suma(int x, int y);
}

interface Saludar {
	void mensaje(String nombre);
}





