package springmvc.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by Rosteach
 * 
 This class show the same configuration as applecation-context.xml or
 dispatcher-servlet, but inside class!!! 
 */
@EnableWebMvc
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter{
	//more custom rules/beans
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// index mapping like (/ ->index.jsp)
		registry.addViewController("/").setViewName("index");
	}
	@Bean
	public InternalResourceViewResolver InternalResourceViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		//success from a controller ->prefix/success/suffix
		resolver.setPrefix("/WEB-INF/");
		resolver.setSuffix(".jsp");
		return resolver;
		
	}
}
