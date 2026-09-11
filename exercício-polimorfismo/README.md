# 🏷️ Exercício de Fixação: Herança e Polimorfismo em Java

Projeto desenvolvido para exercitar conceitos fundamentais da **Programação Orientada a Objetos (POO)** em Java, abordando **Herança**, **Polimorfismo**, **Sobrescrita de Métodos (`@Override`)** e manipulação de datas.

---

## 📌 Sobre o Projeto

O programa simula o cadastro de produtos em uma loja, onde cada produto pode ser **Comum**, **Importado** ou **Usado**:

* **Produto Comum (`Product`):** Exibe apenas nome e preço.
* **Produto Importado (`ImportedProduct`):** Herda de `Product`, acrescenta a taxa de alfândega (*customs fee*) e calcula o preço total.
* **Produto Usado (`UsedProduct`):** Herda de `Product`, acrescenta a data de fabricação (*manufacture date*) e exibe o selo `(used)` junto ao nome.

Ao final da leitura dos dados, o sistema utiliza o **polimorfismo** para percorrer a lista de produtos e imprimir a etiqueta de preço de cada um através do método `priceTag()`.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java
* **IDE:** Spring Tool Suite (STS) / Eclipse
* **Controle de Versão:** Git & GitHub

---

## 📐 Diagrama de Classes (UML)

```text
       ┌────────────────────────┐
       │        Product         │
       ├────────────────────────┤
       │ - name: String         │
       │ - price: Double        │
       ├────────────────────────┤
       │ + priceTag(): String   │
       └───────────▲────────────┘
                   │
         ┌─────────┴─────────┐
         │                   │
┌────────┴─────────┐ ┌───────┴───────────────┐
│  ImportedProduct │ │      UsedProduct      │
├──────────────────┤ ├───────────────────────┤
│ - customsFee     │ │ - manufactureDate     │
├──────────────────┤ ├───────────────────────┤
│ + totalPrice()   │ │ + priceTag(): String  │
│ + priceTag()     │ └───────────────────────┘
└──────────────────┘
🖥️ Exemplo de Execução
Entrada no console:

Plaintext
Enter the number of products: 3
Product #1 data:
Common, used or imported (c/u/i)? i
Name: Tablet
Price: 260.00
Customs fee: 20.00

Product #2 data:
Common, used or imported (c/u/i)? c
Name: Notebook
Price: 1100.00

Product #3 data:
Common, used or imported (c/u/i)? u
Name: Iphone
Price: 400.00
Manufacture date (DD/MM/YYYY): 15/03/2017
Saída esperada (PRICE TAGS):

Plaintext
PRICE TAGS:
Tablet $280.00 (Customs fee:$ 20.00)
Notebook $ 1100.00
Iphone (used) $ 400.00 (Manufacture date: 15/03/2017)
🚀 Como Executar o Projeto
Clone o repositório.

Abra o projeto em sua IDE Java preferida (STS, Eclipse, VS Code ou IntelliJ).

Execute o arquivo Program.java localizado no pacote application.


---

### Passo 3: Salvar e Enviar para o GitHub pelo Terminal

No mesmo terminal que você já está usando dentro do STS (`cmd.exe`), digite estes comandos:

```cmd
git add README.md
git commit -m "Add README do projeto"
git push