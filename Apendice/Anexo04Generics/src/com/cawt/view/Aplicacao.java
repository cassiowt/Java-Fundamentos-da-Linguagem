package com.cawt.view;

import com.cawt.controller.GerenciaAparelho;
import com.cawt.model.Radio;
import com.cawt.model.Tv;

public class Aplicacao {
	public static void main(String[] args) {
		
		Tv tv = new Tv(29, 0, 0, false);
		Tv tv1 = new Tv(42, 0, 0, true);
		
		Radio radio = new Radio(88.1f, 0, Radio.FM);
		Radio radio1 = new Radio(600, 0, Radio.AM);
		
		GerenciaAparelho<Tv> aparelho1 = new GerenciaAparelho<Tv>(tv);
		GerenciaAparelho<Radio> aparelho2 = new GerenciaAparelho<Radio>(radio);

		System.out.println(aparelho1.getObjeto().getClass());
		System.out.println(aparelho2.getObjeto().getClass());
		
		aparelho1.lista();
		
		aparelho1.gravaAparelho(tv);
		aparelho1.gravaAparelho(tv1);
		aparelho1.listaAparelhos();

		aparelho2.gravaAparelho(radio);
		aparelho2.gravaAparelho(radio1);
		aparelho2.listaAparelhos();
		
		
	}
}
