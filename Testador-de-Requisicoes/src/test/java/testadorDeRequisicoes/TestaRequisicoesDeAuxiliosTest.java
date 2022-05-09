package testadorDeRequisicoes;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import jxl.Cell;
import jxl.NumberCell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import javax.swing.JOptionPane;


public class TestaRequisicoesDeAuxiliosTest {
	private TestaRequisicoesDeAuxilioPage testa;
	public String usuario = "tcoutinho";
	public String senha = "Coutinho.123";

	@Before
	public void beforeEach() 
	{
		//this.testa = new TestaRequisicoesDeAuxilioPage(null);
	}

	@After
	public void afterEach() 
	{
		//this.testa.fechar();
	}
	
	@Test
	public void DeveEfetuarLoginCorretamenteComDadosValidos () throws BiffException, IOException, InterruptedException 
	{
		this.testa = new TestaRequisicoesDeAuxilioPage(null);
		this.testa.preencherFormularioDeLogin(usuario, senha);
		
		this.testa.logarComoCarina();
		
		this.testa.caminhoParaRequisicaoDeAuxilio();
		
		this.testa.selecionaTipoDeAuxilio();
		
		Workbook workbook = Workbook.getWorkbook(new File("tabelas/lista_de_alunos_pos.xls"));
	
		Sheet sheet = workbook.getSheet(0);
		int linhas = sheet.getRows();
		
		int i = 0;
		int numeroDeLinhas = 3; //30525;
		for (i=1;i<linhas+1 ;i++) {
			Cell a1 = sheet.getCell(0, i);
			String as1 = a1.getContents();
			System.out.println(as1);
			Cell a2 = sheet.getCell(1, i);
			String as2 = a2.getContents();
			System.out.println(as2);
			
			String mensagem = this.testa.tesatarNumeroDeMatriculas(as2);
			System.out.println(mensagem);
			Thread.sleep(500);
			//Assert.assertTrue(mensagem.equals("Proponente não informado ou a matrícula informada é inválida."));
			
			//this.testa.fechar();
		}
	}
}
