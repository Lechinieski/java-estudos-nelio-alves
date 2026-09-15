# Sistema de Cálculo de Impostos (Tax Calculation System)

Aplicação em Java desenvolvida para calcular o imposto de renda devido por contribuintes, sejam eles pessoas físicas (Individual) ou pessoas jurídicas (Company), aplicando os conceitos de **Polimorfismo** e **Herança**.

## 📌 Regras de Negócio

* **Pessoa Física (`Individual`):**
  * Renda anual abaixo de $ 20.000,00 paga **15%** de imposto.
  * Renda anual a partir de $ 20.000,00 paga **25%** de imposto.
  * Se houver gastos com saúde, **50%** desses gastos são deduzidos do imposto devido.

* **Pessoa Jurídica (`Company`):**
  * Empresas com mais de 10 funcionários pagam **14%** de imposto.
  * Empresas com 10 ou menos funcionários pagam **16%** de imposto.

---

## 🛠️ Tecnologias e Conceitos Utilizados

* **Linguagem:** Java (versão 17+)
* **Paradigma:** Programação Orientada a Objetos (POO)
* **Conceitos:**
  * Classes Abstratas e Métodos Abstratos (`TaxPayer`)
  * Herança (`Individual` e `Company` estendem `TaxPayer`)
  * Polimorfismo e Sobrescrita de Métodos (`@Override`)
  * Listas dinâmicas (`List<TaxPayer>`)

---

## 💻 Exemplo de Uso

**Entrada no console:**

```text
Enter the number of tax payers: 3
Tax payer #1 data:
Individual or company (i/c)? i
Name: Alex
Anual income: 50000.00
Health expenditures: 2000.00

Tax payer #2 data:
Individual or company (i/c)? c
Name: SoftTech
Anual income: 400000.00
Number of employees: 25

Tax payer #3 data:
Individual or company (i/c)? i
Name: Bob
Anual income: 120000.00
Health expenditures: 1000.00
Saída no console:

Plaintext
TAXES PAID:
Alex: $ 11500.00
SoftTech: $ 56000.00
Bob: $ 29500.00

TOTAL TAXES: $ 97000.00