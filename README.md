Claro! Aqui vai um README bem organizado para você colocar no GitHub:

---

# 📦 Projeto Java: Classes `Bemtevi` e `Produto`

Este projeto contém exemplos simples em Java demonstrando:

* Uso de **construtores sobrecarregados**
* Encadeamento de construtores com `this()`
* Encapsulamento com **getters e setters**
* Método `toString()` para exibição de objetos

---

## 🧱 Estrutura do Projeto

O projeto possui três classes principais:

### 1. `Bemtevi`

Classe de exemplo focada em construtores sobrecarregados.

#### Atributos:

* `String bloco`
* `float num`

#### Construtores:

* `Bemtevi(String bloco, float num)` → construtor principal
* `Bemtevi(String bloco)` → chama o principal com valores padrão
* `Bemtevi(float num)` → também chama o principal com valores padrão

📌 Demonstra o uso de `this()` para reaproveitamento de código.

---

### 2. `Produto`

Classe que representa um cliente/produto com nome e CPF.

#### Atributos:

* `String nome`
* `String cpf`

#### Construtores:

* `Produto(String nome, String cpf)`
* `Produto(String nome)` → CPF vazio
* `Produto()` → nome e CPF vazios

#### Métodos:

* `setNome(String nome)`
* `getNome()`
* `setCpf(String cpf)`
* `getCpf()`
* `toString()` → retorna uma string formatada com os dados

---

### 3. `DemoProduto`

Classe principal com o método `main`, usada para testar a classe `Produto`.

#### Funcionalidades:

* Cria 3 objetos:

  * Um com nome e CPF
  * Outro com nome e CPF
  * Um vazio
* Exibe os dados usando `System.out.println`

---

## ▶️ Exemplo de Saída

```
Cliente 1:
Nome:Cauê
Cpf:060.060.160-7

Cliente 2:
Nome:Fernanda
Cpf:160.717.042-5

Cliente 3:
Nome:
Cpf:
```

---

## 🚀 Como Executar

1. Salve os arquivos:

   * `Bemtevi.java`
   * `Produto.java`
   * `DemoProduto.java`

2. Compile:

```bash
javac *.java
```

3. Execute:

```bash
java DemoProduto
```

---

## 🎯 Objetivo

Este projeto é voltado para iniciantes em Java e tem como objetivo praticar:

* Orientação a Objetos (POO)
* Organização de classes
* Boas práticas básicas de código

---

## 📌 Observações

* A classe `Bemtevi` não é utilizada no `main`, mas serve como exemplo de construtores.
* O nome `Produto` está sendo usado como modelo de cliente (nome + CPF).

---

Se quiser, posso deixar esse README mais bonito com badges, emojis mais avançados ou versão em inglês 
