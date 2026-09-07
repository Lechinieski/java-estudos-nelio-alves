# ☕ Java Completo - Exercícios e Projetos de Estudos

Este repositório contém a resolução dos exercícios práticos e projetos desenvolvidos durante os estudos da linguagem Java, focando em Programação Orientada a Objetos (POO), estruturas de dados, manipulação de datas e boas práticas.

---

## 📌 Exercícios e Projetos em Destaque

### 🛍️ Sistema de Pedidos - Composição de Objetos e Enum
* **Pasta:** `exercicio-composition`
* **Descrição:** Aplicação Java que simula um sistema completo de compras. Lê os dados de um cliente, registra um pedido com múltiplos itens (produtos, quantidades e preços) e gera um sumário detalhado do pedido com o valor total formatado.
* **🛠️ Conceitos aplicados:**
  * Composição de objetos complexa (`Order` -> `Client`, `Order` -> `OrderItem` -> `Product`)
  * Controle de estado com Enumerações (`OrderStatus`)
  * Concatenação e formatação eficiente com `StringBuilder` no `toString()`
  * Tratamento e alinhamento de precisão decimal com `String.format()`

---

### 💼 Composição de Objetos e Enum (Worker & Contracts)
* **Pasta:** `Enum`
* **Descrição:** Aplicação Java para gerenciamento de contratos de trabalhadores e cálculo de renda baseada em mês e ano informados. Utiliza enumerações para representar o nível do trabalhador e composição de objetos para relacionar trabalhador, departamento e seus respectivos contratos de horas.
* **🛠️ Conceitos aplicados:**
  * Enumerações (`WorkerLevel`)
  * Composição de objetos (`Worker` possui `Department` e lista `List<HourContract>`)
  * Filtragem de datas com `Calendar` por mês e ano
  * Tratativa de entrada de dados no console (`Scanner`, `.trim()`)

---

### 📝 Composição de Objetos e StringBuilder (Post & Comment)
* **Pasta:** `Compositon_2`
* **Descrição:** Aplicação Java que simula um sistema de postagens e comentários (estilo rede social). Demonstra a aplicação de composição do tipo "um para muitos" (um `Post` possui vários `Comment`) e a otimização de concatenação de textos.
* **🛠️ Conceitos aplicados:**
  * Composição de objetos (`Post` com `List<Comment>`)
  * Otimização de Strings com `StringBuilder`
  * Formatação de datas (`dd/MM/yyyy HH:mm:ss`) usando `SimpleDateFormat`
  * Métodos de delegação para gestão de coleções (`addComment`, `removeComment`)

---

### 📋 Gerenciamento de Funcionários - Lista e Busca
* **Pasta:** `exercicio-fixacao-lista`
* **Descrição:** Aplicação Java para gerenciamento de funcionários usando `List` (`ArrayList`). Permite cadastrar funcionários, buscar por ID e aplicar aumento percentual ao salário com validação de existência.
* **🛠️ Conceitos aplicados:**
  * Encapsulamento (Getters/Setters, Construtores)
  * Estrutura de dados com `List<T>` / `ArrayList`
  * Busca e manipulação de elementos em lista
  * Formatação de saída com `Locale.US`

---

### 🔲 Matrizes - Busca e Vizinhos
* **Pasta:** `ExercícioDeFixacao.aula31`
* **Descrição:** Aplicação Java que lê as dimensões $M \times N$ de uma matriz, preenche seus valores e busca por um número $X$. Para cada ocorrência de $X$, exibe suas coordenadas e os valores vizinhos (esquerda, acima, direita e abaixo) tratando limites das bordas.

---

### ⏳ Manipulação de Data-Hora (API Moderna java.time)
* **Pasta:** `data-hora`
* **Descrição:** Exercícios focados em manipulação de datas, horas e conversão de fusos horários no Java moderno (`java.time`). Inclui testes com datas locais, instantes globais em UTC e conversão entre fusos horários.
* **🛠️ Conceitos aplicados:**
  * Uso de `LocalDate`, `LocalDateTime` e `Instant`
  * Manipulação de fusos horários com `ZoneId`
  * Conversão de instantes globais para datas locais com `LocalDate.ofInstant()`
  * Formatação e parse de datas em formato ISO-8601

---

### 📅 Manipulação de Datas Legadas (Calendar & Date)
* **Pasta:** `Calendar`
* **Descrição:** Exercícios focados no tratamento legado de datas e horários utilizando `Calendar` e `Date`. Explora operações como adição/subtração de tempo e extração de componentes específicos.
* **🛠️ Conceitos aplicados:**
  * Manipulação com `java.util.Calendar` e `java.util.Date`
  * Adição de tempo com `calendar.add()`
  * Extração de partes da data com `calendar.get()`
  * Formatação com `SimpleDateFormat`

---

## 🛠️ Tecnologias e Ferramentas

* **Linguagem:** Java (JDK 25)
* **IDE:** Spring Tools Suite (STS) / Eclipse
* **Controle de Versão:** Git & GitHub

---

## 🚀 Como executar os projetos localmente

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/Lechinieski/java-estudos-nelio-alves.git](https://github.com/Lechinieski/java-estudos-nelio-alves.git)
