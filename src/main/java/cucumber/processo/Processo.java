package cucumber.processo;

import cucumber.interessado.Interessado;

public class Processo {
	protected String assuntoDoProcessoCONARQ;
	protected boolean processoEletronico;
	protected String naturezaDoProcesso;
		//protected int naturezaDoProcesso;
		//OSTENSIVO = @value = 1
		//RESTRITO = @value = 5
		//SIGILOSO = @value = 6
	protected String observação;
	
	protected Interessado interessado;

	public Processo(String assuntoDoProcessoCONARQ, boolean processoEletronico, String naturezaDoProcesso, String observação, Interessado interessado) {
		super();
		this.assuntoDoProcessoCONARQ = assuntoDoProcessoCONARQ;
		this.processoEletronico = processoEletronico;
		this.naturezaDoProcesso = naturezaDoProcesso;
		this.observação = observação;
		this.interessado = interessado;
	}

	public String getAssuntoDoProcessoCONARQ() {
		return assuntoDoProcessoCONARQ;
	}

	public void setAssuntoDoProcessoCONARQ(String assuntoDoProcessoCONARQ) {
		this.assuntoDoProcessoCONARQ = assuntoDoProcessoCONARQ;
	}

	public boolean isProcessoEletronico() {
		return processoEletronico;
	}

	public void setProcessoEletronico(boolean processoEletronico) {
		this.processoEletronico = processoEletronico;
	}

	public String getNaturezaDoProcesso() {
		return naturezaDoProcesso;
	}

	public void setNaturezaDoProcesso(String naturezaDoProcesso) {
		this.naturezaDoProcesso = naturezaDoProcesso;
	}

	public String getObservação() {
		return observação;
	}

	public void setObservação(String observação) {
		this.observação = observação;
	}

	public Interessado getInteressado() {
		return interessado;
	}

	public void setInteressado(Interessado interessado) {
		this.interessado = interessado;
	}
}
