# Exercícios para Fixação de Conceitos de POO

Este repositório contém três exercícios para praticar os conceitos de **Herança**, **Polimorfismo**, **Composição** e **Encapsulamento** aplicados em sistemas simulados reais.

---

## Exercício 1 — Sistema de Mercado de Basquete

### Descrição
Simule o mercado de negociação de jogadores de basquete, considerando características específicas de cada tipo de jogador e regras de negócio para negociação entre times.

### Classes Principais
- **JogadorBasquete** (superclasse)
- **Armador, Ala, Pivô** (subclasses com regras específicas)
- **TimeBasquete**
- **NegociacaoBasquete**

### Regras de Negócio
- Jogadores só aceitam trocar para times com reputação maior que a do atual, salvo se estiverem sem time.
- O salário do jogador pode ser ajustado conforme o tipo e atributos do jogador.
- O time comprador deve ter saldo suficiente para pagar o salário final do jogador.
- Ao negociar, atualiza o time do jogador e saldo do time comprador.

### Testes Obrigatórios
- `deveCalcularSalarioFinalDoArmadorComAssistencias`
- `naoDevePermitirNegociacaoSeSaldoInsuficiente`
- `deveAtualizarTimeDoJogadorAoNegociar`

---

## Exercício 2 — Sistema de Biblioteca

### Descrição
Gerencie empréstimos de livros para sócios, respeitando limites e multas para atrasos.

### Classes Principais
- **Livro**
- **Socio**
- **Emprestimo** (composição entre Livro e Socio)

### Regras de Negócio
- Sócios não podem emprestar livros se tiverem multa pendente.
- Só podem ter até 5 livros emprestados simultaneamente.
- Multa de R$ 2 por dia em caso de atraso na devolução.

### Testes Obrigatórios
- `devePermitirEmprestimoSeNaoTemMulta`
- `naoDevePermitirEmprestimoSeLimiteAtingido`
- `deveCalcularMultaCorretaParaEmprestimoAtrasado`

---

## Exercício 3 — Sistema de Restaurante

### Descrição
Controle pedidos em restaurante com pratos principais e sobremesas, aplicando regras de preços diferentes por tipo e características.

### Classes Principais
- **Prato** (classe abstrata)
- **PratoPrincipal**, **Sobremesa** (subclasses)
- **Pedido** (composição de vários pratos)

### Regras de Negócio
- PratoPrincipal com acompanhamento tem acréscimo de 20% no preço.
- Sobremesa tem preço variável por tamanho (Pequeno, Médio, Grande).
- Pedido soma o preço final de todos os pratos.

### Testes Obrigatórios
- `deveCalcularPrecoFinalDoPratoPrincipalComAcompanhamento`
- `deveCalcularPrecoFinalDaSobremesaGrande`
- `deveCalcularTotalDoPedidoComMultiplosPratos`

---

## Como Usar

1. Implemente as classes seguindo as regras de cada exercício.  
2. Crie testes unitários que validem as regras de negócio, incluindo os testes obrigatórios mencionados.  
3. Utilize boas práticas de POO, como encapsulamento, herança, polimorfismo e composição.

---

## Exemplos de Testes (Resumo)

# 🧠 Exercícios de Fixação — POO (Herança, Polimorfismo, Encapsulamento e Composição)

Este repositório contém três exercícios de fixação para praticar os conceitos de **POO**, com foco em herança, polimorfismo, encapsulamento e composição.

## 📦 Exercícios

---

### 🏀 Exercício 1 — Mercado de Basquete

Simula o mercado de transferências da NBA com base em reputação, salário e estatísticas do jogador.

#### Classes principais:
- `JogadorBasquete` (classe base)
- Tipos de jogador: `Armador`, `Ala`, `Pivô`
- `TimeBasquete`
- `NegociacaoBasquete`

#### Regras:
- Jogador só aceita mudar para um time com reputação maior que o atual (ou se estiver sem time).
- Cada tipo de jogador ajusta seu salário final de forma diferente.
- A negociação só ocorre se o time tiver saldo para pagar o salário.

---

### 📚 Exercício 2 — Sistema de Biblioteca

Gerencia empréstimos de livros, controle de multas e regras de limite.

#### Classes principais:
- `Livro`
- `Socio`
- `Emprestimo`

#### Regras:
- Sócios com multa não podem pegar livros.
- Máximo de 5 empréstimos simultâneos.
- Multa de R$ 2 por dia de atraso.

---

### 🍽️ Exercício 3 — Sistema de Restaurante

Calcula o valor final de pedidos com pratos de diferentes categorias.

#### Classes principais:
- `Prato` (abstrata)
- Tipos: `PratoPrincipal`, `Sobremesa`
- `Pedido` (composição de pratos)

#### Regras:
- Prato principal com acompanhamento → +20%.
- Sobremesa:
  - Pequeno = preço base
  - Médio = +10%
  - Grande = +20%

---

## ✅ Exemplos de Testes Unitários

### 🏀 Mercado de Basquete

```java
@Test
public void deveCalcularSalarioFinalDoArmadorComAssistencias() {
    Armador armador = new Armador("Stephen Curry", 34, null, 9, new BigDecimal("10000"), 5);
    BigDecimal salarioFinal = armador.calcularSalarioFinal();

    // 5 assistências = +5% -> 10.000 + 5% = 10.500
    Assert.assertEquals(new BigDecimal("10500.00"), salarioFinal);
}

