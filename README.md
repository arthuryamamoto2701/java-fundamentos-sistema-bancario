---

## ☕ Java Fundamentals – Sistema Bancário (Console)

Este projeto foi desenvolvido para praticar e consolidar conceitos fundamentais de Java e Programação Orientada a Objetos (POO), através de um sistema bancário simples executado via terminal.

---

## 🎯 Objetivo

Simular um sistema bancário básico aplicando POO em um cenário realista.

O sistema modela contas bancárias e suas regras de negócio, permitindo operações como:

* Depósito
* Saque
* Aplicação de juros (conta poupança)
* Validações de operações financeiras

O foco do projeto é praticar **boas práticas de orientação a objetos**, organização de código e separação de responsabilidades.

---

## 🧠 Conceitos de POO Aplicados

### ✔ Encapsulamento
* Atributos private/protected
* Controle de acesso via getters/setters
* Regras protegidas dentro das entidades

### ✔ Abstração
* Classe abstrata `ContaBancaria`
* Métodos genéricos:
  * `depositar()`
  * `sacar()`

### ✔ Herança
* `ContaCorrente` e `ContaPoupanca` herdam de `ContaBancaria`

### ✔ Polimorfismo
* Cada tipo de conta possui sua própria implementação de saque e depósito

---

## 🧱 Arquitetura do Projeto

```

src/
├── model/
│    ├── ContaBancaria (abstract) --> SuperClasse
│    ├── ContaCorrente --> filha
│    ├── ContaPoupanca --> filha
│    ├── StatusConta (enum)
│
├── validations/
│    ├── ContaValidations (regras de validação)
│
├── exceptions/
│    ├── SaldoInsuficienteException
│    ├── ContaInativaException
│    ├── ValorInvalidoException
│
├── services/
│    ├── BancoService (crud)
│
├── ui/
│    ├── Menu (interface via terminal)

```

---

## 🧠 Separação de Responsabilidades

* **model** → Representa entidades do sistema e Regras de negócio
* **validations** → Centraliza regras de validação
* **exceptions** → Representa erros específicos do domínio
* **services** → Crud
* **ui** → Interação com usuário e fluxo da aplicação (console)

---

## 📊 Regras de Negócio

* Contas iniciam como **ATIVA**
* Saldo inicial = **0**
* Operações exigem valores positivos
* Contas inativas/bloqueadas não operam
* Conta corrente permite limite de saque
* Conta poupança possui taxa de juros
* Validações são centralizadas na camada `validations`

---

## ⚠️ Tratamento de Erros

O sistema utiliza **exceções customizadas** para representar regras de negócio:

* `SaldoInsuficienteException`
* `ContaInativaException`
* `ValorInvalidoException`

Isso melhora:
* Clareza do código
* Manutenção
* Leitura das regras

---

## 🏦 Tipos de Conta

### ✔ Conta Corrente
* Possui limite de saque
* Permite saldo negativo dentro do limite

### ✔ Conta Poupança
* Possui taxa de juros
* Método `aplicarJuros()`

---

## ⚙️ Funcionalidades Implementadas

* Criar contas
* Depositar valores
* Sacar valores
* Aplicar juros
* Validação de operações
* Controle de status

---

## 🛠️ Tecnologias Utilizadas

* Java 17+
* POO (Programação Orientada a Objetos)
* Estrutura modular (packages)
* Scanner (console input)
* Visual Studio Code

---

## 🚀 Melhorias Futuras

* Menu interativo completo
* Persistência de dados
* Transferência entre contas
* Histórico de transações
* Arquitetura em camadas (Controller/Service)

---

## ⚠️ Observações

Projeto focado em aprendizado, sem frameworks (Spring, etc).

Objetivo: dominar base antes de avançar.

---

## 👨‍💻 Autor

Desenvolvido por **Arthur Mitsuo Yamamoto**

---
