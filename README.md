# Projeto de CRUD em Java Spring

Este é um projeto de exemplo de um CRUD (Create, Read, Update, Delete) em Java Spring, desenvolvido como parte de uma atividade em sala de aula. O projeto utiliza as seguintes tecnologias:

- **Java Spring**: [Link para download](https://spring.io/projects/spring-framework)
- **H2 Database**: [Link para download](https://www.h2database.com/html/main.html)
- **Thymeleaf**: [Link para documentação](https://www.thymeleaf.org/documentation.html)
- **JPA (Java Persistence API)**: [Link para documentação](https://docs.oracle.com/javaee/7/api/javax/persistence/package-summary.html)

## Funcionalidades

O objetivo deste projeto é demonstrar as operações básicas de um CRUD:

- **Create (Criar)**: Adicionar novos registros ao banco de dados.
- **Read (Ler)**: Recuperar e exibir informações armazenadas no banco de dados.
- **Update (Atualizar)**: Modificar registros existentes no banco de dados.
- **Delete (Excluir)**: Remover registros do banco de dados.

## Configuração

Antes de executar o projeto, certifique-se de ter as seguintes ferramentas instaladas:

- **Java**: [Link para download](https://www.oracle.com/java/technologies/javase-downloads.html)
- **Maven**: [Link para download](https://maven.apache.org/download.cgi)

## Executando o Projeto

Siga estas etapas para executar o projeto em sua máquina:

1. Clone o repositório para sua máquina:

   ```bash
   git clone https://github.com/PedroXA/CRUD-Java-Spring-Boot

## Executando o Projeto

Para executar o projeto em sua máquina, siga estas etapas:

```bash
cd nome-do-projeto
```

Em seguida, execute o projeto usando o Maven:

```bash
mvn spring-boot:run
```

O aplicativo estará acessível em http://localhost:8080 no seu navegador.

## Banco de Dados
Este projeto utiliza o H2 Database em modo de armazenamento em memória. Isso significa que os dados serão perdidos quando o aplicativo for encerrado. Você pode acessar o console de administração do H2 Database em http://localhost:8080/h2-console (as credenciais podem ser configuradas no arquivo application.properties).

## Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests para melhorar este projeto.

## Licença
Este projeto é licenciado sob a Licença MIT.
