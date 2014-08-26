package br.com.gsh.aghos.test.selenium.cadastro;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import br.com.gsh.aghos.test.selenium.config.SeleniumConfig;
import br.com.gsh.aghos.test.selenium.config.SeleniumTest;

public class TesteDeTela extends SeleniumTest {

	@Test
	public void testeDeTela() throws Exception {
		//abaTelaPessoaFisica();
		abaTelaProntuario();
	}

	private void abaTelaPessoaFisica() throws InterruptedException {
		driver.get(SeleniumConfig.SERVER + "/pessoa/");
		driver.findElement(By.id("nome_pessoa")).clear();
		driver.findElement(By.id("nome_pessoa")).sendKeys("teste");
		driver.findElement(By.id("cartao_sus_pessoa")).clear();
		driver.findElement(By.id("cartao_sus_pessoa")).sendKeys("65465465");
		driver.findElement(By.id("rg_pessoa")).clear();
		driver.findElement(By.id("rg_pessoa")).sendKeys("6654");
		driver.findElement(By.id("nascimento")).clear();
		driver.findElement(By.id("nascimento")).sendKeys("15/10/1979");
		driver.findElement(By.id("nome_mae_pessoa")).clear();
		driver.findElement(By.id("nome_mae_pessoa")).sendKeys("asd");
		driver.findElement(By.id("nome_pai_pessoa")).clear();
		driver.findElement(By.id("nome_pai_pessoa")).sendKeys("asdf");
		new Select(driver.findElement(By.id("selectSexo"))).selectByVisibleText("Ambos os sexos");
		driver.findElement(By.id("btLimparProntuario")).click();
		// não esta limpando os edits.
		driver.get(SeleniumConfig.SERVER + "/pessoa/");	
		driver.findElement(By.id("buscar")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP+3000);
		driver.findElement(By.linkText("Ações")).click();
		driver.findElement(By.linkText("Visualizar")).click();
		driver.findElement(By.linkText("Voltar")).click();
		driver.findElement(By.linkText("Ações")).click();
		driver.findElement(By.linkText("Editar")).click();
		driver.findElement(By.linkText("Naturalidade")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.linkText("Município de Trabalho")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.cssSelector("#consultarMunicipioTrabalho > span.add-on.data")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.id("btnPesquisarMunicipioTrabalho")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.xpath("//tbody[@id='resultadosMunicipioTrabalho']/tr[4]/td[2]")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.linkText("Nacionalidade")).click();
		new Select(driver.findElement(By.name("pessoa.nacionalidade.id"))).selectByVisibleText("ALBÂNIA");
		driver.findElement(By.id("enderecoCollapse")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.linkText("Ocupação")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.cssSelector("#consultarOcupacao > span.add-on.data")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.id("btnPesquisarOcupacao")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.xpath("//tbody[@id='resultadosOcupacao']/tr[6]/td[2]")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.linkText("Ocupação Auxiliar")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.cssSelector("#consultarOcupacaoAuxiliar > span.add-on.data")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.id("btnPesquisarOcupacaoAuxiliar")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.xpath("//tbody[@id='resultadosOcupacaoAuxiliar']/tr/td[2]")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.linkText("Responsáveis")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.cssSelector("#consultarResponsavel1 > span.add-on.data > span.icon-white.icon-search")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.id("btnPesquisarPessoa")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP + 3000);
		driver.findElement(By.id("btnLimparPessoa")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.cssSelector("#dialogPessoa > div.modal-header > button.close")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.linkText("Domicílio")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		new Select(driver.findElement(By.id("energia"))).selectByVisibleText("Sim");
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		new Select(driver.findElement(By.id("tipoDomicilio"))).selectByVisibleText("APARTAMENTO");
		new Select(driver.findElement(By.id("tipoDestinoLixo"))).selectByVisibleText("QUEIMADO/ENTERRADO");
		new Select(driver.findElement(By.id("tipoEsgoto"))).selectByVisibleText("FOSSA");
		new Select(driver.findElement(By.id("tipoAbastecimentoAgua"))).selectByVisibleText("OUTROS");
		new Select(driver.findElement(By.id("tipoTratamentoAgua"))).selectByVisibleText("FILTRADA");
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.linkText("Documentos")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		new Select(driver.findElement(By.id("ufIdentidade"))).selectByVisibleText("AC");
		new Select(driver.findElement(By.id("tipoIdentidade"))).selectByVisibleText("OM");

		// driver.findElement(By.linkText("Telefones")).click();
		// new Select(driver.findElement(By.id("tipoDeTelefone"))).selectByVisibleText("COMERCIAL");
		// driver.findElement(By.id("campoTelefone")).sendKeys("1111111111");
		// driver.findElement(By.id("adicionarTelefone")).click();

		driver.findElement(By.linkText("E-mails")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.id("campoEmail")).clear();
		driver.findElement(By.id("campoEmail")).sendKeys("pinheiro.ras@gmail.com");
		driver.findElement(By.id("adicionarEmail")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.linkText("Deficiências")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		new Select(driver.findElement(By.id("tipoDeDeficiencia"))).selectByVisibleText("Auditiva");
		driver.findElement(By.id("descricaoDeficiencia")).clear();
		driver.findElement(By.id("descricaoDeficiencia")).sendKeys("asdf");
		driver.findElement(By.id("adicionarDeficiencia")).click();

		// Não deveria incluir os numeros de cartão invalido.
		// driver.findElement(By.linkText("Cartões do SUS")).click();
		// driver.findElement(By.id("cartaoSus")).sendKeys("111111111111111");
		// driver.findElement(By.id("adicionarCartaoSus")).click();

		driver.findElement(By.linkText("Foto")).click();
		driver.findElement(By.linkText("Foto")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Informações\n								Complementares')]")).click();
		new Select(driver.findElement(By.id("escolaridade"))).selectByVisibleText("5ª À 8 SÉRIE INCOMPLETA DO EF");
		driver.findElement(By.id("frequentaEscola1")).click();
		new Select(driver.findElement(By.id("situacaoMercadoTrabalho"))).selectByVisibleText("ASSALARIADO COM CARTEIRA DE TRABALHO");
		driver.findElement(By.id("situacaoRua1")).click();
		new Select(driver.findElement(By.id("tempoSituacaoRua"))).selectByVisibleText("< 6 MESES");
		new Select(driver.findElement(By.id("criancaQuemFica"))).selectByVisibleText("Adolescente");
		driver.findElement(By.id("informacaoOrientacaoSexual1")).click();
		new Select(driver.findElement(By.id("orientacaoSexual"))).selectByVisibleText("GAY");
		new Select(driver.findElement(By.id("orientacaoSexual"))).selectByVisibleText("TRANSSEXUAL");
		driver.get(SeleniumConfig.SERVER + "/pessoa/");
	}

	private void abaTelaProntuario() throws InterruptedException {
		// Botão limpar prontuario não esta funcionando.
		driver.get(SeleniumConfig.SERVER + "/prontuario/");
		driver.findElement(By.cssSelector("#consultarUnidade > span.add-on")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.id("btnPesquisarUnidade")).click();
		driver.findElement(By.xpath("(//input[@name='selectUnidadeDeSaude'])[3]")).click();
		driver.findElement(By.id("prontuario_codigo")).clear();
		driver.findElement(By.id("prontuario_codigo")).sendKeys("123");
		driver.findElement(By.id("cartao_sus_prontuario")).clear();
		driver.findElement(By.id("cartao_sus_prontuario")).sendKeys("111");
		driver.findElement(By.id("rg_prontuario")).clear();
		driver.findElement(By.id("rg_prontuario")).sendKeys("111");
		driver.findElement(By.id("nome_prontuario")).clear();
		driver.findElement(By.id("nome_prontuario")).sendKeys("asdfa");
		driver.findElement(By.id("nome_mae_prontuario")).clear();
		driver.findElement(By.id("nome_mae_prontuario")).sendKeys("asdf");
		driver.findElement(By.id("nome_pai_prontuario")).clear();
		driver.findElement(By.id("nome_pai_prontuario")).sendKeys("asdf");
		new Select(driver.findElement(By.id("selectSexo"))).selectByVisibleText("Masculino");
		driver.findElement(By.id("btLimparProntuario")).click();
		driver.findElement(By.id("buscar")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP+1000);
		driver.findElement(By.id("btLimparProntuario")).click();
		driver.findElement(By.id("nome_prontuario")).clear();
		driver.findElement(By.id("buscar")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP+1000);
		driver.findElement(By.xpath("//tbody[@id='prontuariosEncontrados']/tr/td[7]/div/a/span")).click();
		driver.findElement(By.linkText("Visualizar")).click();
		driver.findElement(By.linkText("Voltar")).click();
		driver.findElement(By.id("buscar")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP+1000);
		driver.findElement(By.linkText("Ações")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.linkText("Visualizar")).click();
		driver.findElement(By.linkText("Visualizar Pessoa")).click();
		driver.findElement(By.linkText("Voltar")).click();
		driver.findElement(By.linkText("Voltar")).click();
		driver.findElement(By.id("buscar")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP+1000);
		driver.findElement(By.xpath("(//a[contains(text(),'Ações')])[2]")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.xpath("(//a[contains(text(),'Editar')])[3]")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.cssSelector("#consultarUnidade > span.add-on")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.id("btnPesquisarUnidade")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.xpath("//tbody[@id='resultadosUnidadeDeSaude']/tr[10]/td[3]")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
		driver.findElement(By.id("cancelar")).click();
	}

}
