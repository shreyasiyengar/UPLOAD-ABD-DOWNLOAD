package com.UplaodANDDownload;

import com.UplaodANDDownload.Model.FileStoragePojo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
		({
	FileStoragePojo.class
		})
public class UplaodAndDownloadApplication {

	public static void main(String[] args) {
		SpringApplication.run(UplaodAndDownloadApplication.class, args);
	}

}
