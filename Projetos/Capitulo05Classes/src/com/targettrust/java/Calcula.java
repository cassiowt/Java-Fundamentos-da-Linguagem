package com.targettrust.java;

public class Calcula {
    // testa métodos quadrado sobrecarregados(Overloaded)
    public void testa() {
      System.out.println( "Usando Classe privadas");
      System.out.printf( "O quadrado do inteiro 5 é <<< %d >>>\n", calculo2( 5 ) );
      System.out.printf( "O quadrado do double 6.5 é <<< %f >>>\n", calculo2( 6.5 ) );
    }

    /*  Dica
		%s --> string 
		%c --> char 
		%f --> float 
		%d --> decimal inteiro 
     */
    
    
   // o método quadrado com argumento inteiro
   public  int calculo( int intNum ) {                                                               
      System.out.printf( "\nO método quadrado foi passado passando argumento inteiro: <<< %d >>>\n",
         intNum );                                               
      return intNum * intNum;                                  
   }

   // O método quadrado com argumento double
   public  double calculo( double doubleNum ) {                                                                  
      System.out.printf( "\nO método quadrado foi passado passando argumento double: <<< %f >>>\n",
         doubleNum );                                               
      return doubleNum / doubleNum;                               
   }
   
   int calculo2( int intNum ) {                                                               
	      return intNum * intNum;                                  
	   }

	   // O método quadrado com argumento double
   private double calculo2( double doubleNum ) {                                                                  
	      return doubleNum * doubleNum;                               
	   }

}
