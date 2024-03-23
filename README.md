<h1 align="center">Projeto MongoDB com Spring Boot</h1>

<p>Este é um projeto Java utilizando Spring Boot e MongoDB para demonstrar a implementação de um sistema de Web Services.  O projeto inclui operações de CRUD (Create, Retrieve, Update, Delete) com tratamento de exceções, seguindo o paradigma orientado a documentos. O objetivo é mostrar como criar e manipular coleções de documentos no MongoDB, incluindo operações de associação entre objetos, consultas com Spring Data e MongoRepository, e outras funcionalidades avançadas oferecidas pelo MongoDB</p>

## Objetivos
- [x] Compreender as principais diferenças entre paradigma orientado a documentos e relacional
- [x] Implementar operações de CRUD
- [x] Refletir sobre decisões de design para um banco de dados orientado a documentos
- [x] Implementar associações entre objetos
    -  Objetos aninhados
    - Referências
- [x] Realizar consultas com Spring Data e MongoRepository

## Tecnologias Utilizadas

 - Java
 - Spring Boot
 - MongoDB
 - Spring Data MongoDB
 - Maven
 - Postman
   
  <img height = 100 hidht = 120 src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original-wordmark.svg" /> <img height = 100 hidht = 120 src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/spring/spring-original-wordmark.svg" />   <img height = 100 hidht = 120img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/mongodb/mongodb-original-wordmark.svg" /> <img height = 130 hidht = 120 src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/postman/postman-original-wordmark.svg" />   <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/maven/maven-original-wordmark.svg" /> 
            
       
                
## Estrutura do Dominio

<img src =https://r2.easyimg.io/vn0arpmjl/mongo.png  />


## Estrutura do Projeto
  * **Camada de Resource**: Responsável por expor os endpoints RESTful da aplicação. Aqui são implementados os controllers que recebem as requisições HTTP e chamam os métodos apropriados na camada de serviço.
 
  * **Camada de Service**: Responsável pela lógica de negócio da aplicação. Nesta camada, são implementados os serviços que realizam as operações específicas da aplicação, como cadastro, atualização, remoção e consulta de dados.

  * **Camada de Repository**: Responsável pela interação com o banco de dados. Aqui são implementados os repositórios que utilizam o Spring Data MongoDB para realizar operações de CRUD no banco de dados.
 
  * **Camada de Entiteis**: Representam os objetos de domínio da aplicação e são mapeadas para tabelas no banco de dados. As entidades geralmente possuem anotações do JPA para configurar o mapeamento para o banco de dados.


## Uso
Para executar o projeto, você pode utilizar a IDE de sua preferência com suporte ao Spring Boot ou utilizar o Maven. Certifique-se de ter o MongoDB instalado e em execução na porta padrão (27017).

1. Clone o repositório do projeto:
   ```bash
   git clone https://github.com/MarcoTamassia01/workshop-springboot-mongodb.git

2. Importe o projeto em sua IDE como um projeto Maven existente.

3. Execute a aplicação. A aplicação será iniciada e estará disponível em http://localhost:8080.

4. Utilize o Postman ou qualquer outra ferramenta de teste de APIs para testar os endpoints expostos pela aplicação.



## Créditos

Agradecimentos especiais ao Professor Nelio Alves por sua contribuição.

## Contato

Para mais informações, entre em contato em marco.a.s.tamassia@gmail.com.
