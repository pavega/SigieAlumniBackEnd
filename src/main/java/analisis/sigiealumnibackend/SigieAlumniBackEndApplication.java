package analisis.sigiealumnibackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"analisis.sigiealumnibackend.*"})
@ComponentScan({"analisis.sigiealumnibackend.restcontroller", "analisis.sigiealumnibackend.repository", "analisis.sigiealumnibackend.service",
		"analisis.sigiealumnibackend.domain"})
@EntityScan("analisis.sigiealumnibackend.domain")
@EnableJpaRepositories("analisis.sigiealumnibackend.repository")
public class SigieAlumniBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(SigieAlumniBackEndApplication.class, args);
	}

}
