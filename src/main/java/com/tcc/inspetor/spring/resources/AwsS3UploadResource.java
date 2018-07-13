package com.tcc.inspetor.spring.resources;

import java.io.InputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tcc.inspetor.spring.services.UploadService;

@Component
@Path("/upload")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AwsS3UploadResource {
	
	@Autowired
	private UploadService uploadService;

	@POST
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces("text/plain")
	public String handleUpload(@FormDataParam("file") InputStream in,
			@FormDataParam("file") FormDataContentDisposition fileDetail)
			throws Exception {

			
		return this.uploadService.uploadToS3(in, fileDetail.getFileName());	

	}
	
	@GET
	public String test() {
		return "Hello";
	}

}
