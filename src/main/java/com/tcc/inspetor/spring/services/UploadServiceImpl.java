package com.tcc.inspetor.spring.services;

import java.io.InputStream;

import org.springframework.stereotype.Component;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.SdkClientException;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

@Component
public class UploadServiceImpl implements UploadService {

	@Override
	public String uploadToS3(InputStream inputStream, String fileName) {
		String clientRegion = System.getenv("AWS_REGION");
        String bucketName = System.getenv("AWS_BUCKET_NAME"); 
        String fileObjKeyName = fileName;
        
        
        ClientConfiguration cc = new ClientConfiguration();
        cc.setProxyHost("localhost");
        cc.setProxyPort(5865);

        try {
        	BasicAWSCredentials awsCreds = new BasicAWSCredentials(System.getenv("AWS_ACCESS_KEY_ID"), System.getenv("AWS_SECRET_ACCESS_KEY"));
            AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
            		.withClientConfiguration(cc)            		
                    .withRegion(clientRegion)
                    .withCredentials(new AWSStaticCredentialsProvider(awsCreds))
                    .build();
                                 
            s3Client.putObject(bucketName, fileObjKeyName, inputStream, null);
            
            return "File Uploaded!";
        
        }
        catch(AmazonServiceException e) {   
        	return e.getErrorMessage();            
        }
        catch(SdkClientException e) {
        	return e.getMessage();
        }        

	}

}
