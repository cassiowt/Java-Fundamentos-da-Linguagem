package com.target.thread;

public class TesteThread {
	   public static void main(String[] args) {
	 
		   // testeUm();
		   testeDois();
		   testeTres();
	    
	   }

	private static void testeDois() {
		Time p1 = new Time();  
	     p1.setId(2);
	     p1.setNome("VERMELHO");
	     
	     Titulo tt = new Titulo();
	     tt.setTime(p1);
	     tt.addTitulo("Campe�o do Mundo");
	     tt.addTitulo("Campe�o de Tudo");
	     tt.addTitulo("BiCampe�o da Libertadores da  Am�rica");
	 
	   //  System.out.println(tt.toString());
	     Thread t = new Thread(tt);
	     t.start();        
	}

	private static void testeTres() {
		Time p1 = new Time();  
	     p1.setId(2);
	     p1.setNome("Azul");
	     
	     Titulo tt = new Titulo();
	     tt.setTime(p1);
	     tt.addTitulo("Campe�o Ta�a Toyota");
	     tt.addTitulo("BiCampe�o da Libertadores da  Am�rica");
	 
	   //  System.out.println(tt.toString());
	     Thread t = new Thread(tt);
	     t.start();        
	}

	
	private static void testeUm() {
		 Time p1 = new Time();  
	     p1.setId(2);
	     p1.setNome("AZUL");
	 
	     Thread t1 = new Thread(p1);
	     t1.start();
	 
	     Time p2 = new Time();  
	     p2.setId(1);
	     p2.setNome("VERMELHO");
	 
	     Thread t2 = new Thread(p2);
	     t2.start();        
	      
	    //System.out.println("\t*** EXECUTA A QUALQUER MOMENTO ***");
		
	}
	 }