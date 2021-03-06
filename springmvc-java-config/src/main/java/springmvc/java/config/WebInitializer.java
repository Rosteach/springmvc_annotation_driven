package springmvc.java.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Created by Rosteach
 * 
 This class show the same configuration as web.xml, but inside class!!! 
 */
public class WebInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext container) throws ServletException {
		
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(WebConfig.class);
		container.addListener(new ContextLoaderListener(rootContext));
		DispatcherServlet dispServlet = new DispatcherServlet(rootContext);
		ServletRegistration.Dynamic reg = container.addServlet("dispatcherServlet", dispServlet);
		reg.setLoadOnStartup(1);
		reg.addMapping("/");
	}

}
