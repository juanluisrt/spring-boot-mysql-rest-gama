#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "${package}.repository")
@SpringBootApplication
public class SpringBootMysqlRestGamaApplication {
	
	static ConfigurableApplicationContext context;
	
	public static void main(String[] args) {
		context=SpringApplication.run(SpringBootMysqlRestGamaApplication.class, args);
		//(context).close();
	}
}
