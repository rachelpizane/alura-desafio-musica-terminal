# API de Música - Terminal

## Sobre o projeto

Este projeto é uma aplicação de terminal para gerenciar artistas e músicas, utilizando Spring Boot e um banco de dados relacional.

Ele foi desenvolvido como parte do desafio do curso da Alura *Java: persistência de dados e consultas com Spring Data JPA*, 

Para mais informações sobre o desafio, acesse: [Desafio Alura - API de Música](https://github.com/alura-cursos/3355-java-desafio).

# Status
Em andamento

## Funcionalidades
- Cadastro de artistas (solo, dupla ou banda).
- Cadastro de músicas associadas a artistas.
- Listagem de músicas.
- Busca de músicas por artista.
- Consulta de informações sobre artistas.

## Requisitos
- Java 17+
- Maven 3.8+
- PostgreSQL 17

## Como baixar e executar o projeto

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/api-musica-terminal.git
   cd api-musica-terminal
   ```
    <br>

2. **Configure o banco de dados**:
   Edite o arquivo `src/main/resources/application.properties` para configurar o banco de dados (H2, MySQL, etc.).
    <br>
    
3. **Compile e execute o projeto**:
   Com o Maven instalado, execute:
   ```bash
   mvn spring-boot:run
   ```
    <br>

4. **Interaja com a aplicação**:
   A aplicação será executada no terminal, onde você poderá navegar pelo menu e utilizar as funcionalidades.
    <br>