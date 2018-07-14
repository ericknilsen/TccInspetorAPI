package com.tcc.inspetor.spring.services;

import java.io.InputStream;

import com.tcc.inspetor.spring.model.Response;

public interface UploadService {
	
	public Response uploadToS3(InputStream inputStream, String fileName);

}
