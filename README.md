# 🚀 Spring Dojo - Consumo de API Externa (SWAPI)

> Projeto criado como parte de estudos em desenvolvimento backend com foco em integração com APIs externas utilizando Spring Boot.

---

## 📚 Objetivo

Este projeto foi desenvolvido com o objetivo de:

* Praticar consumo de APIs externas em aplicações Spring Boot
* Entender o funcionamento do `RestTemplate`
* Explorar conceitos de IoC (Inversão de Controle)
* Criar endpoints REST simples
* Testar integrações com APIs públicas

---

## 🌌 API utilizada

A aplicação consome dados da API pública:

👉 https://swapi.info/

Exemplo de requisição:

GET https://swapi.info/api/people/1

---

## 🛠️ Tecnologias utilizadas

* Java 17+
* Spring Boot
* Maven
* RestTemplate
* IntelliJ IDEA

---

## 🏗️ Estrutura do projeto

```
src/
 └── main/
     └── java/
         └── com.swapi.dojo/
             ├── controller
             ├── service
             ├── configuration
             └── ...
```

---

## ⚙️ Como rodar o projeto

### 1. Clonar o repositório

```
git clone https://github.com/Izah-Silva/spring-dojo.git
```

### 2. Entrar na pasta do projeto

```
cd spring-dojo
```

### 3. Rodar a aplicação

```
./mvnw spring-boot:run
```

Ou pela IDE (IntelliJ):

* Execute a classe principal anotada com `@SpringBootApplication`

---

## 🔌 Endpoint disponível

Exemplo de endpoint criado:

```
GET http://localhost:8080/people/1
```

Esse endpoint:

* Faz uma chamada para a API externa (SWAPI)
* Retorna os dados da pessoa

---

## 🧠 Conceitos praticados

* Inversão de Controle (IoC)
* Injeção de Dependência
* Configuração de Beans (`@Configuration`, `@Bean`)
* Consumo de API externa
* Arquitetura em camadas (Controller, Service)

---

## ⚠️ Observações

* Projeto com fins educacionais
* Pode conter simplificações propositalmente para aprendizado

---
