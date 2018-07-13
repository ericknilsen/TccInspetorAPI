package com.tcc.inspetor.spring.services;

import java.io.InputStream;

import org.springframework.stereotype.Component;

public interface UploadService {
	
	public String uploadToS3(InputStream inputStream, String fileName);

}
