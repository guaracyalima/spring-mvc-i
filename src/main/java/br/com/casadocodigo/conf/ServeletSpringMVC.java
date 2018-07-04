package br.com.casadocodigo.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServeletSpringMVC  extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// diz para o spring qual controller via ser utilizado
		return new Class[] {AppWebConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {

		//diz para o servidor que daqui pra frente as requisicoes sao g
		//gerenciadas pelo Spring
		return new String[] {"/"};
	}
	
	
}
