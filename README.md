# TccInspetorAPI

- É uma API em Java que disponibiliza um método para fazer upload de objetos em um Bucket da Amazon S3.
- Feita em Spring Boot, Jersey e Maven.
- Implantada no Heroku.

## Configuração

A implantação no Heroku é feita da seguinte forma:

- Crie uma aplicação no Heroku 
- Na aba _Deploy_ configure a conexão com este repositório
- Habilite o deploy automático ou manual

Como a API deve fazer um deploy em um bucket S3 privado, devem ser disponibilizadas as credencias de acesso para o código da API. Por motivo de segurança, os valores das credenciais devem ser configurados no Heroku.

Na aba _Settings_ inclua os pares _KEY_ e _VALUE_ em _Config Vars_ conforme valores abaixo:
- _AWS_ACCESS_KEY_ID_
- _AWS_BUCKET_NAME_
- _AWS_REGION_
- _AWS_SECRET_ACCESS_KEY_





