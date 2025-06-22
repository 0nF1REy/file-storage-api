package br.com.alanryan.file_storage_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProperties.class
})
public class FileStorageApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileStorageApiApplication.class, args);
	}

}