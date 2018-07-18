# TccInspetorAPI

- It's a Java API that provides a method for uploading objects to an Amazon S3 Bucket. Corresponds to the **TccInspetorAPI** component of the following architecture: 

![](https://github.com/ericknilsen/TccInspetorCore/blob/master/docs/Arquitetura_TccInspetor.png)

- It was developed in Spring Boot, Jersey and Maven.
- It is deployed in Heroku.

## Setup

### Deployment Environment

The deployment in Heroku is done as follows:

- Create an application on Heroku 
- On the _Deploy_ tab configure the connection to this repository
- Enable automatic or manual deploy

The credentials to access the bucket must be configured in the API code because the API has to upload files to a private S3 bucket. For security reasons, the credentials must be set in Heroku itself so that they are not publicly visible in the GitHub repository.

- In the _Settings_ tab, include the pairs _KEY_ and _VALUE_ in _Config Vars_
- The values of _KEY_ must be: _AWS_ACCESS_KEY_ID_, _AWS_BUCKET_NAME_, _AWS_REGION_ and _AWS_SECRET_ACCESS_KEY_
- The values of _VALUE_ must match the values set in the AWS account

### Development Environment

- Clone the repository:
```shell
$ git clone https://github.com/ericknilsen/TccInspetorAPI
```

- Open Eclipse
- Import an existing Maven project
- Import the TccInspetorAPI project directory
- Execute the class _Main.java_ as a Java Application.
- Remember that the code references the values set in Heroku. This means that the values of the S3 variables in the _UploadServiceImpl.java_ class must be modified
- Upload a file via Postman to test the URL http://localhost:8080/upload
