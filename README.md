
# Exercícios para Fixação de Conceitos de POO

Este repositório contém três exercícios para praticar os conceitos de Herança, Polimorfismo, Composição e Encapsulamento aplicados em sistemas simulados reais.

---

## 🏀 Exercício 1 — Sistema de Mercado de Basquete

### Descrição
Simule o mercado de negociação de jogadores de basquete, considerando características específicas de cada tipo de jogador e regras de negócio para negociação entre times.

### Classes
- **JogadorBasquete**: classe base com nome, idade, time atual, reputação e salário base.
- **Armador**, **Ala**, **Pivô**: subclasses com regras específicas para cálculo de salário.
- **TimeBasquete**: representa os clubes, contendo nome, reputação e saldo disponível.
- **NegociacaoBasquete**: executa as regras para transferências de jogadores.

### Regras de Negócio
- Jogadores só aceitam trocar para times com reputação maior que a do atual, salvo se estiverem sem time.
- O salário final do jogador é ajustado conforme tipo e estatísticas específicas.
- O time comprador precisa ter saldo suficiente para pagar o salário final.
- A negociação atualiza o time do jogador e desconta o valor do saldo do time comprador.

### Testes Obrigatórios
- `deveCalcularSalarioFinalDoArmadorComAssistencias`
- `naoDevePermitirNegociacaoSeSaldoInsuficiente`
- `deveAtualizarTimeDoJogadorAoNegociar`

### Exemplo de Teste
```java
@Test
public void deveCalcularSalarioFinalDoArmadorComAssistencias() {
    Armador armador = new Armador("Stephen Curry", 34, null, 9, new BigDecimal("10000"), 5);
    BigDecimal salarioFinal = armador.calcularSalarioFinal();
    Assert.assertEquals(new BigDecimal("10500.00"), salarioFinal);
}
```

---

## 📚 Exercício 2 — Sistema de Biblioteca

### Descrição
Gerencie empréstimos de livros para sócios, respeitando limites de empréstimo simultâneo e aplicação de multas por atraso na devolução.

### Classes
- **Livro**: título, autor, ano, exemplares disponíveis.
- **Socio**: nome, matrícula, número de empréstimos, valor de multa.
- **Emprestimo**: composição entre Socio e Livro.

### Regras de Negócio
- Sócios com multa não podem emprestar livros.
- Sócios podem ter no máximo 5 empréstimos simultâneos.
- Atrasos geram multa de R$ 2 por dia.

### Testes Obrigatórios
- `devePermitirEmprestimoSeNaoTemMulta`
- `naoDevePermitirEmprestimoSeLimiteAtingido`
- `deveCalcularMultaCorretaParaEmprestimoAtrasado`

### Exemplo de Teste
```java
@Test
public void devePermitirEmprestimoSeNaoTemMulta() {
    Livro livro = new Livro("Clean Code", "Robert C. Martin", 2008, 3);
    Socio socio = new Socio("João", "123", 0, BigDecimal.ZERO);
    Emprestimo emprestimo = new Emprestimo(socio, livro, LocalDate.now(), LocalDate.now().plusDays(7));
    Assert.assertTrue(emprestimo.podeEmprestar());
}
```

---

## 🍽️ Exercício 3 — Sistema de Restaurante

### Descrição
Controle pedidos em restaurante com pratos principais e sobremesas, com regras específicas de preço final.

### Classes
- **Prato** (abstrata): nome e preço base.
- **PratoPrincipal**: pode ter acompanhamento (acréscimo de 20%).
- **Sobremesa**: tamanho afeta preço (Pequeno = base, Médio = +10%, Grande = +20%).
- **Pedido**: composição de vários pratos, calcula o total do pedido.

### Regras de Negócio
- PratoPrincipal com acompanhamento custa 20% a mais.
- Sobremesa tem variação de preço por tamanho.
- Pedido calcula a soma dos preços finais dos pratos.

### Testes Obrigatórios
- `deveCalcularPrecoFinalDoPratoPrincipalComAcompanhamento`
- `deveCalcularPrecoFinalDaSobremesaGrande`
- `deveCalcularTotalDoPedidoComMultiplosPratos`

### Exemplo de Teste
```java
@Test
public void deveCalcularPrecoFinalDoPratoPrincipalComAcompanhamento() {
    PratoPrincipal prato = new PratoPrincipal("Filé com Batata", new BigDecimal("50.00"), true);
    BigDecimal precoFinal = prato.calcularPrecoFinal();
    Assert.assertEquals(new BigDecimal("60.00"), precoFinal);
}
```

---

## ✅ Como Usar
1. Implemente as classes conforme as descrições de cada exercício.
2. Crie testes unitários cobrindo todas as regras de negócio.
3. Aplique os conceitos de POO: encapsulamento, herança, polimorfismo e composição.

---

## 📎 Requisitos Técnicos
- Linguagem sugerida: Java
- Recomendado uso de JUnit para testes unitários.
- Código bem estruturado, com responsabilidades separadas por classe.

---

**Bons estudos! 🚀**
