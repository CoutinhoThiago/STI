package cucumber.processo;

import cucumber.interessado.Interessado;

public class ProcessoSigiloso  extends Processo {
	private String hipoteseLegal;
	private String grauDeSigilo;
	public ProcessoSigiloso(String assuntoDoProcessoCONARQ, boolean processoEletronico, String naturezaDoProcesso,
			String observação, Interessado interessado, String hipoteseLegal, String grauDeSigilo) {
		super(assuntoDoProcessoCONARQ, processoEletronico, naturezaDoProcesso, observação, interessado);
		this.hipoteseLegal = hipoteseLegal;
		this.grauDeSigilo = grauDeSigilo;
	}
}
