package br.com.gsh.aghos.test.selenium.consulta;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import br.com.gsh.aghos.test.selenium.config.SeleniumConfig;
import br.com.gsh.aghos.test.selenium.config.SeleniumTest;

public class ConsultaPesquisaTest extends SeleniumTest {

	@Test
	public void consultaPesquisaTest() throws Exception {
/*		if (SeleniumConfig.isFirefox()) {
			testConsultaCupomSolicitacao();
			testAdicionaUpsIndicacaoConsulta();
		} else {
			testConsultaCupomSolicitacaoChrome();
			testAdicionaUpsIndicacaoConsultaChrome();
		}*/
		testConsultaCupomSolicitacao();
		//testAdicionaUpsIndicacaoConsulta();
	}


	public void testConsultaCupomSolicitacao() throws Exception {
		// o menu esta abrindo o de cima (sair)
		driver.get(SeleniumConfig.SERVER + "/atendimento/");
		driver.findElement(By.id("buscar")).click();
		//driver.findElement(By.linkText("6")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP+600);
		driver.findElement(By.xpath("(//a[contains(text(),'Ações')])[3]")).click();
		Thread.sleep(SeleniumConfig.TIMER_SLEEP);
	    driver.findElement(By.xpath("(//a[contains(text(),'Cupom Solicitação')])[3]")).click();
	    Thread.sleep(SeleniumConfig.TIMER_SLEEP + 6000);
	    driver.findElement(By.cssSelector("#relatorioModal > div.modal-header > button.close")).click();
	    Thread.sleep(SeleniumConfig.TIMER_SLEEP);
	}
	
	
	/*
	 * Esta dando acesso negao, ver o porque. 
	 */
	public void testAdicionaUpsIndicacaoConsulta() throws Exception {
	    driver.findElement(By.linkText("2")).click();	    
	    driver.findElement(By.xpath("(//a[contains(text(),'Ações')])[2]")).click();
	    driver.findElement(By.linkText("UPS Indicação Consulta")).click();
	    driver.findElement(By.cssSelector("span.icon-white.icon-search")).click();
	    driver.findElement(By.id("btnPesquisarUnidade")).click();
	    driver.findElement(By.xpath("(//input[@name='selectUnidadeDeSaude'])[11]")).click();
	    driver.findElement(By.name("nome")).click();
	    assertTrue(isElementPresent(By.className("success")));
	    driver.findElement(By.linkText("Cancelar")).click();
	    Thread.sleep(SeleniumConfig.TIMER_SLEEP + 6000);
	}

}
