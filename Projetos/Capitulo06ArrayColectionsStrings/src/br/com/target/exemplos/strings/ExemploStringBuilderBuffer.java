package br.com.target.exemplos.strings;

public class ExemploStringBuilderBuffer {

	public static void main(String[] args) {
		testaString();
		testaStringBuilder();
		testaStringBuffer();
	}

	public static void testaString() {
		String s = new String();
		System.out.println(s.hashCode());
		s =     "Java J2EE\n";
		System.out.println(s.hashCode());
		s = s + "Oracle\n";
		System.out.println(s.hashCode());
		s = s + "PostgreSQL\n";
		System.out.println(s.hashCode());
		System.out.println(s);
	}
	
	public static void testaStringBuilder() {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.hashCode());
		sb.append("Java J2EE\n");
		System.out.println(sb.hashCode());
		sb.append("Oracle\n");
		System.out.println(sb.hashCode());
		sb.append("PostgreSQL\n");
		System.out.println(sb.hashCode());
		System.out.println(sb);
	}

	public static void testaStringBuffer() {
		StringBuffer sbf= new StringBuffer( "Java J2EE\n");
		System.out.println(sbf.hashCode());
		sbf.append( "Oracle\n" );
		System.out.println(sbf.hashCode());
		sbf.append( "PostgreSQL\n" );
		System.out.println(sbf.hashCode());
		System.out.println(sbf);
	}
	
}
