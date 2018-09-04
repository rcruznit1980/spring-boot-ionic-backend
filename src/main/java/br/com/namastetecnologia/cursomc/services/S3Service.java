package br.com.namastetecnologia.cursomc.services;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;
<<<<<<< HEAD

import br.com.namastetecnologia.cursomc.services.exceptions.FileException;
=======
import com.amazonaws.util.IOUtils;
>>>>>>> origin/master

@Service
public class S3Service {

	private Logger LOG = LoggerFactory.getLogger(S3Service.class);

	@Autowired
	private AmazonS3 s3client;

	@Value("${s3.bucket}")
	private String bucketName;

	public URI uploadFile(MultipartFile multipartFile) {
		try {
			String fileName = multipartFile.getOriginalFilename();
			InputStream is = multipartFile.getInputStream();
			String contentType = multipartFile.getContentType();

			return uploadFile(is, fileName, contentType);
		} catch (IOException e) {
<<<<<<< HEAD
			throw new FileException("Erro de IO: " + e.getMessage());
=======
			throw new RuntimeException("Erro de IO: " + e.getMessage());
>>>>>>> origin/master
		}

	}

	public URI uploadFile(InputStream is, String fileName, String contentType) {
		try {
			ObjectMetadata meta = new ObjectMetadata();
			meta.setContentType(contentType);
<<<<<<< HEAD

=======
					
>>>>>>> origin/master
			LOG.info("Iniciando Upload");
			s3client.putObject(bucketName, fileName, is, meta);
			LOG.info("Upload Finalizado");

			return s3client.getUrl(bucketName, fileName).toURI();
		} catch (URISyntaxException e) {
<<<<<<< HEAD
			throw new FileException("Erro ao converter URL para URI");
=======
			throw new RuntimeException("Erro ao converter URL para URI");
>>>>>>> origin/master
//		} catch (IOException e) {
//			throw new RuntimeException("Erro ao converter URL para URI");
		}
	}
}
