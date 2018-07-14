# TccInspetorAPI

- É uma API em Java que disponibiliza um método para fazer upload de objetos em um Bucket da Amazon S3.
- Feita em Spring Boot, Jersey e Maven.
- Implantada no Heroku.

## Configuração

A implantação no Heroku é feita da seguinte forma:

- Crie uma aplicação no Heroku 
- Na aba _Deploy_ configure a conexão com este repositório
- Habilite o deploy automático ou manual

Como a API deve fazer o upload de arquivos em um bucket S3 privado, devem ser disponibilizadas as credencias de acesso para o código da API. Por motivo de segurança, os valores das credenciais devem ser configurados no próprio Heroku, de modo que não fiquem visíveis publicamente no repositório do GitHub.

- Na aba _Settings_ inclua os pares _KEY_ e _VALUE_ em _Config Vars_.
- As entradas de _KEY_ devem ser: _AWS_ACCESS_KEY_ID_, _AWS_BUCKET_NAME_, _AWS_REGION_, _AWS_SECRET_ACCESS_KEY_
- Os entradas de _VALUE_ devem corresponder aos valores definidos na conta da AWS.




