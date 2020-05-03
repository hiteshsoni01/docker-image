
package hitesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages ={"hitesh.com.quiz.*"})
@EntityScan(basePackages ={"hitesh.com.quiz.*"})
@ComponentScan(basePackages ={"hitesh.com.quiz.*"})
@SpringBootApplication
public class ExamApiApplication {
	public static void main(String[] args) {
		System.out.println("Exam-Api Service Started...");
		SpringApplication.run(ExamApiApplication.class, args);
	}
}
