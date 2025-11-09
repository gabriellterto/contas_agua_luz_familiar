# 💧 Calculadora de Contas Familiar

Aplicação em **Java** desenvolvida para calcular o valor das **contas de água e luz** entre casas da família de forma proporcional e justa.  
O sistema considera o **número de pessoas** e os **dias de permanência** de cada uma durante o mês, além dos valores de **luz individual de cada casa**.

---

## 🧩 Objetivo do Projeto
O projeto tem como finalidade automatizar o cálculo mensal das contas compartilhadas, evitando erros e facilitando a divisão justa entre as casas.  
Além de servir para aprendizado prático de **Java**, **POO** e **organização de projetos com Git**.

---

## ⚙️ Funcionalidades
- Cálculo da **conta de água** proporcional por **pessoa/dia**.  
- Cálculo da **conta de luz** individual de cada casa.  
- Exibição do **valor total por casa** (água + luz).  
- Possibilidade de definir:
  - Número de casas;
  - Quantidade de pessoas por casa;
  - Dias de permanência de cada pessoa.  
- Relatório com totais e médias.

---

## 🧮 Regras de Cálculo

### 💧 Conta de Água
1. O valor total da conta é dividido pela soma de todos os **dias de permanência** das pessoas.  
2. O resultado define o **valor por pessoa/dia**.  
3. Cada casa paga a soma dos dias de suas pessoas multiplicada por esse valor.

**Exemplo:**
| Casa | Pessoas e dias | Total de dias | Valor (R$) |
|------|----------------|----------------|-------------|
| 1 | 2 pessoas (30 e 25 dias) | 55 | 110,00 |
| 2 | 3 pessoas (30, 30, 20 dias) | 80 | 160,00 |
| 3 | 1 pessoa (15 dias) | 15 | 30,00 |
| **Total** | — | **150** | **300,00** |

Valor por pessoa/dia = 300 ÷ 150 = **R$ 2,00**

---

### ⚡ Conta de Luz
Cada casa possui um valor de luz independente, que é **somado ao valor de água calculado**.


---

## 🚀 Etapas de Desenvolvimento

| Versão | Descrição |
|--------|------------|
| **1.0** | Cálculo básico via console |
| **2.0** | Adição de múltiplas casas e pessoas |
| **3.0** | Validações e arredondamento de valores |
| **4.0** | Interface gráfica (Swing ou JavaFX) |
| **5.0** | Histórico e exportação para arquivos |

---

## 💻 Tecnologias Utilizadas
- **Java 21**
- **Paradigma de Programação Orientada a Objetos (POO)**
- **Git / GitHub** para versionamento

---

## 🎯 Aprendizado Envolvido
Durante o desenvolvimento deste projeto, serão praticados:
- Leitura e entrada de dados com `Scanner`;
- Estruturas condicionais e de repetição;
- Criação de classes e métodos;
- Encapsulamento e POO básica;
- Formatação numérica e arredondamento;
- Manipulação de arquivos e persistência de dados;
- Interface gráfica com JavaFX (futuramente).

---

## 📅 Próximos Passos
1. Criar a versão inicial (console) e testar os cálculos;
2. Implementar classes `Casa` e `Pessoa`;
3. Adicionar validações e formatação;
4. Evoluir para interface gráfica;
5. Registrar cada etapa com commits descritivos.

---

## 🧠 Autor
**Gabriel Terto**  
Desenvolvedor Júnior em formação, estudando **Java Full Stack** e desenvolvendo projetos práticos para aprimorar suas habilidades em **POO** e **automação com Java**.

---

## 🗂️ Licença
Este projeto é de uso pessoal e educacional, mas pode ser adaptado livremente para fins de aprendizado.

---
