

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

	
	//obteniendo variables de ambiente
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
	
	   //properties es una clase que almacena atributos en clave valor, imprimo todo el Properties
		Properties props = System.getProperties();
		props.list(System.out);

	}

}


package com.bc.pm;

/**
 * @author EAMV
 * @apiNote codigo ejemplo BC
 * @version 1.0
 */

  
public class Ejemplos {  
	
		  public static void main(String args[]) {
		    int a, b;

		    a = 1;
		    b = 2;

		    if(a < b) System.out.println("a es menor que b");
		    
		    a = a * 2;
		    if(a == b) System.out.println("a es igual a b");

		    a = a * 2;
		    if(a > b) System.out.println("a es mayor que b");

		 
		    if(a == b) System.out.println("no se visualiza");
		  }
		}
 
  
package com.bc.pm;

/**
 * @author EAMV
 * @apiNote codigo ejemplo BC
 * @version 1.0
 */

  public class Ejemplos {  
	
		  public static void main(String args[]) {
		   //ciclo for
			   int y;
			   
			    for(y = 0; y<45; y = y+1)
			      System.out.println("valor de y : " + y);
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
 * @apiNote codigo ejemplo BC
 * @version 1.0
 */

public class Ejemplos {

	public static void main(String args[]) {

		// imprimiendo fecha sin format
		LocalDate fecha = LocalDate.of(2020, Month.JANUARY, 20);
		System.out.println("fecha : " + fecha);
		
	}
}


------------------
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
		Mensajeable s = () -> {

			return "Hola Mundo";
		};
		System.out.println(s.saludar());
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






