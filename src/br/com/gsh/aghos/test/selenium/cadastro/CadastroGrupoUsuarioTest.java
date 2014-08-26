package br.com.gsh.aghos.test.selenium.cadastro;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import br.com.gsh.aghos.test.selenium.config.SeleniumConfig;
import br.com.gsh.aghos.test.selenium.config.SeleniumTest;

public class CadastroGrupoUsuarioTest extends SeleniumTest {

	@Test
	public void cadastroGrupoUsuarioTest() throws Exception {
		testCadastroGrupoUsuario();
	}

	public void testCadastroGrupoUsuario() throws Exception {
		driver.get(SeleniumConfig.SERVER + "/usuario/grupos/");
	    driver.findElement(By.linkText("Novo")).click();
	    driver.findElement(By.id("descricao")).clear();
	    driver.findElement(By.id("descricao")).sendKeys("Grupo teste aghos");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
		assertTrue(isElementPresent(By.className("success")));
	}

}
