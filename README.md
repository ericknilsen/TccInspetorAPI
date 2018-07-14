# TccInspetorAPI

- É uma API em Java que disponibiliza um método para fazer upload de objetos em um Bucket da Amazon S3. Corresponde ao componente de upload de arquivos da arquitetura abaixo:

![](https://github.com/ericknilsen/TccInspetor/blob/master/docs/Arquitetura_ABNT.png)


- Utiliza as tecnologias Spring Boot, Jersey e Maven.
- Está implantada no Heroku.



## Configuração

### Implantação

A implantação no Heroku é feita da seguinte forma:

- Crie uma aplicação no Heroku 
- Na aba _Deploy_ configure a conexão com este repositório
- Habilite o deploy automático ou manual

Como a API deve fazer o upload de arquivos em um bucket S3 privado, devem ser disponibilizadas as credencias de acesso para o código da API. Por motivo de segurança, os valores das credenciais devem ser configurados no próprio Heroku, de modo que não fiquem visíveis publicamente no repositório do GitHub.

- Na aba _Settings_ inclua os pares _KEY_ e _VALUE_ em _Config Vars_.
- As entradas de _KEY_ devem ser: _AWS_ACCESS_KEY_ID_, _AWS_BUCKET_NAME_, _AWS_REGION_ e _AWS_SECRET_ACCESS_KEY_.
- Os entradas de _VALUE_ devem corresponder aos valores definidos na conta da AWS.


### Desenvolvimento

- Baixe o repositório:
```shell
$ git clone https://github.com/ericknilsen/TccInspetorAPI
```

- Abra o Eclipse
- Importe um projeto Maven existente
- Aponte para o diretório do projeto TccInspetorAPI
- Execute a classe _Main.java_ como Java Application
- Modifique a forma de acesso às variáveis do S3 na classe _UploadServiceImpl.java_. O código faz referência aos valores configurados no  Heroku. Ex: _System.getenv("AWS_ACCESS_KEY_ID")_.
- Use o Postman para testar o envio de um arquivo para a url http://localhost:8080/upload




