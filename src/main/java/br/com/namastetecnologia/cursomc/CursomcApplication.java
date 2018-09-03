package br.com.namastetecnologia.cursomc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import br.com.namastetecnologia.cursomc.services.S3Service;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan("br.com.namastetecnologia.cursomc.domain")
public class CursomcApplication implements CommandLineRunner {

	@Autowired
	private S3Service s3Service;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		s3Service.uploadFile("C:\\Temp\\imagens\\darkSideOfTheMoon.jpg");
	}
}
