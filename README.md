# 📦 StockTrack
API REST para gerenciamento de estoque e cadastre de produtos, utilizando
banco de dados relacional.

## 🎯 Objetivo do Projeto
O projeto StockTrack foi desenvolvido com objetivo de facilitar o controle
de cadastro de produtos e estoque, utilizando um banco de dados relacional,
como o PostgreSQL.
Além disso, o projeto tem como finalidade a prática 
e o aprimoramento das habilidades em Java com o 
framework **Spring Boot** no desenvolvimento de APIs RESTful.

Com esta API, é possível:

- 📌 **Cadastrar produtos**, como, nome, preço, quantidade

- 📋 **Listar todos os produtos** cadastrados

- 📝 **Atualizar informações** de um produto

- 🗑️ **Deletar um produto** do estoque

- 📦 **Listar o total de itens no estoque**

- 💵 **Calcular o valor total do estoque**

## 🧠 Sobre a Modelagem

![modelagem](./images/image.png)

A modelagem foi feita de forma bem simples, sem foco em validações ou relacionamentos com outras entidades. O objetivo é armazenar dados de forma direta e objetiva, facilitando a manipulação das informações do produtos.

## 📁 Estrtura do Projeto
```
src/main/java/com/stockTrack/
├── controller                # Endpoints da aplicação
├── model                     # Entidades e classes de domínio
├── repository                # Interface JPA para acesso ao banco
├── service                   # Lógica de negócio

src/main/resources/
├── db
│   ├── migration             # Modelagem do banco
├── application.properties    # Configurações da aplicação
```


## 🔗 Como Executar o Projeto

### ✅ Pré-requisitos
- Java JDK 17
- Git
- Intellij IDEA
- Um cliente HTTP( como POSTMAN, Insomnia, ThunderCLient)

**💡 Neste projeto foi utilizado o Postman, mas você pode utilizar o cliente HTTP de sua preferência.**

## 💻 Execução Local

1.Clone o repositório: 
```bash

```