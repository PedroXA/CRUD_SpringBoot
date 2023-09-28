Projeto de CRUD em Java Spring
Este é um projeto de exemplo de um CRUD (Create, Read, Update, Delete) em Java Spring, desenvolvido como parte de um curso ou aula. O projeto utiliza as seguintes tecnologias:

Java Spring: Um framework Java que simplifica o desenvolvimento de aplicativos web.
H2 Database: Um banco de dados em memória que é útil para desenvolvimento e testes.
Thymeleaf: Um mecanismo de template para criar páginas HTML em aplicativos web Java.
JPA (Java Persistence API): Uma API de persistência Java que simplifica o acesso a banco de dados relacional.
Funcionalidades
O objetivo deste projeto é demonstrar as operações básicas de um CRUD:

Create (Criar): Adicionar novos registros ao banco de dados.
Read (Ler): Recuperar e exibir informações armazenadas no banco de dados.
Update (Atualizar): Modificar registros existentes no banco de dados.
Delete (Excluir): Remover registros do banco de dados.
Configuração
Antes de executar o projeto, certifique-se de ter as seguintes ferramentas instaladas:

Java: Link para download
Maven: Link para download
Executando o Projeto
Siga estas etapas para executar o projeto em sua máquina:

Clone o repositório para sua máquina:

bash
Copy code
git clone https://github.com/seu-usuario/seu-projeto.git
Navegue até o diretório do projeto:

bash
Copy code
cd seu-projeto
Execute o projeto usando o Maven:

bash
Copy code
mvn spring-boot:run
O aplicativo estará acessível em http://localhost:8080 no seu navegador.

Banco de Dados
Este projeto utiliza o H2 Database em modo de armazenamento em memória. Isso significa que os dados serão perdidos quando o aplicativo for encerrado. Você pode acessar o console de administração do H2 Database em http://localhost:8080/h2-console (as credenciais podem ser configuradas no arquivo application.properties).

Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests para melhorar este projeto.

Licença
Este projeto é licenciado sob a Licença MIT.
