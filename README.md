---

# ☕ Java Fundamentals – Sistema Bancário (Console)

Este projeto foi criado para praticar e fortalecer conceitos fundamentais de Java e Programação Orientada a Objetos (POO) através de um sistema bancário simples baseado em terminal.

---

## 🎯 Objetivo

O objetivo deste projeto é simular um sistema bancário básico, aplicando conceitos de POO em um cenário prático.

O sistema modela entidades do mundo real como contas bancárias, saldo e operações financeiras, permitindo funcionalidades como depósito, saque e consulta de saldo.

Além disso, o projeto busca reforçar boas práticas como organização de código, legibilidade e separação de responsabilidades, mantendo a implementação simples e totalmente baseada em terminal.

---

## 🧠 Conceitos de POO Aplicados

O projeto foi desenvolvido utilizando os seguintes princípios:

### Encapsulamento

* Os dados da conta (saldo, número da conta, etc.) são encapsulados dentro de classes
* O acesso é feito por métodos controlados

### Abstração

* As operações bancárias são expostas através de métodos claros, como:
  
  - `depositar()`
  - `sacar()`
  - `consultarSaldo()`

### Modularidade / Separação de Responsabilidades

O sistema é organizado em camadas:

* `model` → Account → Representa os dados (entidade)
* `ui` → Menu → Responsável pela interação com o usuário
* `services` → BankingService → Contém a lógica de negócio e fluxo da aplicação

Essa separação melhora a manutenção e prepara o sistema para evoluções futuras.

---

## 📊 Regras de Negócio

O sistema segue algumas regras básicas:

* Não é possível sacar um valor maior que o saldo disponível
* Depósitos devem ser valores positivos
* Entradas inválidas são tratadas (evita que o programa quebre)
* Todas as operações passam por validação

---

## 🛠️ Funcionalidades

O sistema possui:

* Criar conta bancária
* Depositar dinheiro
* Sacar dinheiro
* Consultar saldo
* Validação de entrada do usuário
* Menu interativo via terminal

---

## 🏗️ Estrutura do Projeto

* `model` → Conta → Representação da entidade
* `ui` → Menu → Interface de interação com o usuário
* `services` → BancoService → Lógica de negócio e fluxo principal

---

## 🛠️ Tecnologias Utilizadas

* Java 17+
* Apache Maven (gerenciamento de build e estrutura do projeto)
* ArrayList (armazenamento em memória)
* Scanner (entrada de dados via terminal)
* Visual Studio Code

---

## 🚀 Aprendizados

* Aplicação prática de POO
* Manipulação de coleções (`ArrayList`)
* Construção de aplicações interativas via terminal
* Validação de entrada do usuário
* Organização de código em camadas

---

## 🔮 Melhorias Futuras

Este projeto foi pensado para evoluir. Algumas melhorias possíveis:

* Sistema de login e cadastro de usuários
* Suporte a múltiplas contas
* Histórico de transações
* Persistência de dados (arquivo ou banco de dados)
* Melhor tratamento de erros e validações
* Evolução para arquitetura em camadas (Controller / Service / Repository)

---

## ⚠️ Observações

Este é um projeto **100% baseado em terminal**, sem uso de frameworks ou APIs externas.

O foco está no aprendizado dos fundamentos antes de avançar para tecnologias como Spring Boot.

---

## 👨‍💻 Autor

Desenvolvido por **Arthur Mitsuo Yamamoto**

---

## 📌 Nota

Este projeto faz parte da minha jornada de aprendizado em Java e continuará evoluindo conforme novos conceitos forem sendo aplicados.

---
