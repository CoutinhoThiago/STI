package testes.processo;

import testes.interessado.Interessado;

public class ProcessoOstensivo extends Processo {

	public ProcessoOstensivo(String assuntoDoProcessoCONARQ, boolean processoEletronico, String naturezaDoProcesso, String observação, Interessado interessado) {
		super(assuntoDoProcessoCONARQ, processoEletronico, naturezaDoProcesso, observação, interessado);
	}
}
