package com.tcc.inspetor.spring;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.tcc.inspetor.spring.resources.AwsS3UploadResource;


@Configuration
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {		
		register(AwsS3UploadResource.class);
		register(MultiPartFeature.class);
		register(CORSResponseFilter.class);
	}
	
	
}
