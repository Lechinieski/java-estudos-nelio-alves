# ☕ Java Completo - Exercícios de Estudos

Este repositório contém a resolução dos exercícios práticos e projetos desenvolvidos durante os estudos da linguagem Java, focando em Programação Orientada a Objetos (POO), estruturas de dados e boas práticas.

---

## 📌 Exercícios em Destaque

### 📋 Exercício de Fixação - Lista de Funcionários
* **Pasta:** `Exercicio de fixação Lista`
* **Descrição:** Aplicação Java para gerenciamento de funcionários usando `List` (`ArrayList`). Permite cadastrar múltiplos funcionários, buscar um funcionário por ID e aplicar um aumento percentual ao seu salário (com verificação de existência do ID).
* **🛠️ Conceitos aplicados:**
  * Encapsulamento (Getters/Setters, Construtores)
  * Estrutura de dados com `List<T>` / `ArrayList`
  * Busca e manipulação de elementos em lista
  * Formatação de saída com `Locale.US`

---

### 🔲 Exercício de Fixação - Matrizes (Busca e Vizinhos)
* **Pasta:** `ExercicioMatriz`
* **Descrição:** Aplicação Java que lê as dimensões $M \times N$ de uma matriz, preenche seus valores e busca por um número $X$. Para cada ocorrência de $X$, o programa exibe suas coordenadas e os valores vizinhos (esquerda, acima, direita e abaixo), tratando os limites das bordas.

---

### ⏳ Manipulação de Data-Hora e Fuso Horário
* **Pasta:** `data-hora`
* **Descrição:** Exercícios focados em manipulação de datas, horas e conversão de fusos horários no Java moderno (API `java.time`). Inclui testes com datas locais, instantes globais em UTC e conversão entre fusos horários do sistema e internacionais.
* **🛠️ Conceitos aplicados:**
  * Uso de `LocalDate`, `LocalDateTime` e `Instant`
  * Manipulação de fusos horários com `ZoneId` (ex: `systemDefault()` e `Europe/Lisbon`)
  * Conversão de instantes globais para datas locais com `LocalDate.ofInstant()`
  * Formatação e parse de datas em formato ISO-8601

---

### 📅 Manipulação de Datas com Calendar e Date
* **Pasta:** `Calendar`
* **Descrição:** Exercícios focados no tratamento legado de datas e horários em Java utilizando a classe `Calendar` e `Date`. Explora operações como adição/subtração de unidades de tempo e extração de componentes específicos de uma data (minutos, mês, etc.).
* **🛠️ Conceitos aplicados:**
  * Manipulação de datas com `java.util.Calendar` e `java.util.Date`
  * Adição de tempo a uma data com `calendar.add(Calendar.HOUR_OF_DAY, n)`
  * Extração de partes da data com `calendar.get(Calendar.MINUTE)` e `calendar.get(Calendar.MONTH)`
  * Formatação e exibição com `SimpleDateFormat`

---

### 💼 Composição de Objetos e Enum (Worker & Contracts)
* **Pasta:** `Enum`
* **Descrição:** Aplicação Java para gerenciamento de contratos de trabalhadores e cálculo de renda baseada em mês e ano informados. Utiliza enumerações para representar o nível do trabalhador e composição de objetos para relacionar trabalhador, departamento e seus respectivos contratos de horas.
* **🛠️ Conceitos aplicados:**
  * Enumerações (`WorkerLevel`)
  * Composição de objetos (`Worker` possui `Department` e uma lista `List<HourContract>`)
  * Manipulação e extração de componentes de datas com `Calendar` para filtragem por mês e ano
  * Tratativa de entrada de dados no console (`Scanner`, `.trim()`, formatação)

---

## 🛠️ Tecnologias e Ferramentas

* **Linguagem:** Java
* **IDE:** Eclipse / Spring Tools Suite (STS)
* **Controle de Versão:** Git & GitHub

---

## 🚀 Como executar os projetos localmente

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/Lechinieski/java-estudos-nelio-alves.git](https://github.com/Lechinieski/java-estudos-nelio-alves.git)
