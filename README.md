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

- Mercado de Basquete:

```java
@Test
public void deveCalcularSalarioFinalDoArmadorComAssistencias() {
    // implementar
}
Biblioteca:

java
Copy
Edit
@Test
public void devePermitirEmprestimoSeNaoTemMulta() {
    // implementar
}
Restaurante:

java
Copy
Edit
@Test
public void deveCalcularPrecoFinalDoPratoPrincipalComAcompanhamento() {
    // implementar
}
