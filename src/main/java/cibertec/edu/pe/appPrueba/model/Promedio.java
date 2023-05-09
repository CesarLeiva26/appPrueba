package cibertec.edu.pe.appPrueba.model;

public class Promedio {

	private Integer nota1;
	private Integer nota2;
	private Integer nota3;
 
	public Promedio(Integer nota1, Integer nota2, Integer nota3 ) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public Integer getNota1() {
		return nota1;
	}

	public void setNota1(Integer nota1) {
		this.nota1 = nota1;
	}

	public Integer getNota2() {
		return nota2;
	}

	public void setNota2(Integer nota2) {
		this.nota2 = nota2;
	}

	public Integer getNota3() {
		return nota3;
	}

	public Integer notaFinal() {
		return  (nota1 + nota2 + nota3) / 3  ;
	}
}