package controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="CalculadoraBean")
@RequestScoped
public class CalculadoraBean {
	
	private double valor1;
	private double valor2;
	private double resultado;

	public void somar() {
		this.resultado = this.valor1 + this.valor2;
		System.out.println("To aqui no somar ------");
	}
	
	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

}
