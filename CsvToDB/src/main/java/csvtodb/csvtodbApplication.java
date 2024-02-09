package csvtodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class csvtodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(csvtodbApplication.class, args);
	}

}
