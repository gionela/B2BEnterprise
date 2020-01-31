package gr.codehub.B2BEnterprise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;

@SpringBootApplication
@RestController
public class B2BEnterpriseApplication {

	public static void main(String[] args) throws IOException {

		SpringApplication.run(B2BEnterpriseApplication.class, args);

	}
}


