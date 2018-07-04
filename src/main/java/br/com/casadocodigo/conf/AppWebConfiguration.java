package br.com.casadocodigo.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.casadocodigo.loja.HomeController;

@EnableWebMvc
@ComponentScan(basePackageClasses= {HomeController.class})
public class AppWebConfiguration {

	//esta classe habilita o uso do Spring MVC no projeto
	@Bean //diz que é uma classe gerenciada pelo spring
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	
		//diz que a pasta onde estao as views e esta especifcada dentro dos parenteses
		resolver.setPrefix("/WEB-INF/views/");
		
		//diz que todas a views tem a extencao .jsp
		resolver.setSuffix(".jsp");
		
		return resolver;
		
	}
	
	
}
