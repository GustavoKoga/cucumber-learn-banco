package cucumber.teste;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

// Informa ao JUnit que o cucumber se incumbirá a executar os testes
@RunWith(Cucumber.class)
/*
 * CucumberOptions: Parâmetros de execução de testes
 * Features: Localizar as features
 * Tags: Informar quais tags executar, pois podem ser executadas conjuntos de arquivos
 * Glue: Localizar os testes de aceitação
 * Monochrome: Formatação dos resultados no console
 * DryRun: TRUE: Verifica se cada etapa possui código correspondente. Caso não encontrado, criar
 * 		   FALSE: Não verifica
 */
@CucumberOptions(features = "classpath:caracteristicas", tags = "@ContaTeste", 
glue = "cucumber.teste.passos", monochrome = true, dryRun = false)
public class ContaTeste {

}
