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

O foco do projeto é praticar **boas práticas de orientação a objetos**, como encapsulamento, abstração, herança e polimorfismo.

---

## 🧠 Conceitos de POO Aplicados

### ✔ Encapsulamento

* Atributos privados/protegidos
* Controle de acesso via métodos
* Regras de negócio protegidas dentro das classes

### ✔ Abstração

* Classe abstrata `ContaBancaria`
* Métodos genéricos como:

  * `depositar()`
  * `sacar()`

### ✔ Herança

* `ContaCorrente` e `ContaPoupanca` herdam de `ContaBancaria`

### ✔ Polimorfismo

* Implementação diferente de saque e depósito em cada tipo de conta

---

src/
 ├── model/
 │    ├── ContaBancaria (abstract)
 │    ├── ContaCorrente
 │    ├── ContaPoupanca
 │    ├── StatusConta (enum)
 │
 ├── services/
 │    ├── BancoService (lógica de negócio e controle das operações)
 │
 ├── ui/
 │    ├── Menu (interface de interação com o usuário via terminal)

---

## 📊 Regras de Negócio

* Contas são criadas automaticamente com status **ATIVA**
* Saldo inicial é sempre **0**
* Valores de operações devem ser positivos
* Contas inativas ou bloqueadas não podem realizar operações
* Conta corrente possui limite para saque
* Conta poupança permite aplicação de juros

---

## 🏦 Tipos de Conta

### ✔ Conta Corrente

* Possui limite adicional de saque
* Permite saldo negativo dentro do limite definido

### ✔ Conta Poupança

* Possui taxa de juros
* Método `aplicarJuros()` para rendimento do saldo

---

## ⚙️ Funcionalidades Implementadas

* Criar contas (corrente e poupança)
* Depositar valores
* Sacar valores
* Validação de operações
* Aplicação de juros (poupança)
* Controle de status da conta

---

## 🛠️ Tecnologias Utilizadas

* Java 17+
* Programação Orientada a Objetos (POO)
* ArrayList (planejado para uso futuro)
* Scanner (planejado para interface via terminal)
* Visual Studio Code
* Estrutura manual de pastas (sem Maven ou frameworks)

---

## 🚀 Melhorias Futuras

O projeto ainda está em evolução e será expandido com:

### 🔜 Camada de serviço (BancoService)

* Centralizar regras de negócio
* Gerenciar fluxo das operações

### 🔜 Interface de usuário (Console Menu)

* Menu interativo no terminal:

  * Criar conta
  * Depositar
  * Sacar
  * Aplicar juros

### 🔜 Evoluções planejadas

* Histórico de transações
* Transferência entre contas
* Persistência de dados (arquivo)
* Separação em camadas mais avançadas (Controller/Service)
* Melhor tratamento de erros

---

## ⚠️ Observações

Este projeto é **100% baseado em terminal**, sem uso de frameworks ou dependências externas.

O foco é aprendizado dos fundamentos de Java antes de evoluir para tecnologias como Spring Boot.

---

## 👨‍💻 Autor

Desenvolvido por **Arthur Mitsuo Yamamoto**

---


