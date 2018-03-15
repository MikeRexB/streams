package ejemplo;

import java.util.*;

public class HolaMundo {
  
    public static void main(String... args) {
    
        List<String> frase = new ArrayList<String>();
        frase.add("Hola ");
	frase.add("Miguel");
	frase.add(",");
	frase.add("Como ");
	frase.add("estas?"+'\n');

	frase
	   .stream()
	   .forEach(e -> System.out.print(e)); 
    }
}
