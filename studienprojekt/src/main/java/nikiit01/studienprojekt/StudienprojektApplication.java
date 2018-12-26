package nikiit01.studienprojekt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudienprojektApplication {

	@GetMapping("/")
	public String defaultStudienarbeitOutput()
	{
		return "Studienarbeit Testprojekt Nitin Kishore";
	}


	@GetMapping("/studienarbeit")
	public String spesificStudienarbeitOutput()
	{
		return "Studienarbeit DevOps Spring Boot Testprojekt Nitin Kishore";
	}
	public static void main(String[] args) {
		SpringApplication.run(StudienprojektApplication.class, args);
	}

}

