package com.target.testarcomandos;

import java.text.SimpleDateFormat;
import com.target.dados.*;

public class TestaForEach {
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");

	public static void main(String[] args) {

		try {
			Consulta c  = new Consulta(sdf.parse("12/12/2014 08:00"), false);
			Consulta c1 = new Consulta(sdf.parse("01/08/2014 09:00"), false);
			Consulta c2 = new Consulta(sdf.parse("20/06/2014 08:30"), false);

			Animal cao = new Animal("REX");
			cao.getConsultas().add(c);
			cao.getConsultas().add(c1);
			cao.getConsultas().add(c2);
			
			System.out.println("Relatorio de Consultas do: " + cao.getApelido());
			
			for (Consulta con : cao.getConsultas()) {
				System.out.println(sdf.format(con.getDataConsulta()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
