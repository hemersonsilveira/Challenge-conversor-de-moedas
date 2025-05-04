
# 💱 Conversor de Moedas - Java

Este é um simples conversor de moedas desenvolvido em Java que utiliza a API [ExchangeRate API](https://www.exchangerate-api.com/) para obter as taxas de câmbio em tempo real. A aplicação permite converter entre Dólar (USD), Real Brasileiro (BRL), Peso Argentino (ARS) e Peso Colombiano (COP).

## 📋 Funcionalidades

- Conversão entre:
  - Dólar ⇄ Peso Argentino
  - Dólar ⇄ Real Brasileiro
  - Dólar ⇄ Peso Colombiano
- Interface de texto interativa via terminal.
- Consumo de API para dados atualizados de câmbio.

## 📦 Estrutura do Projeto

- `Principal.java` - Classe principal com a interface de linha de comando.
- `Cambio.java` - Responsável por consultar a API e fazer os cálculos de conversão.
- `Moedas.java` - Classe modelo para mapear os dados retornados pela API.

## 🚀 Como Executar

### Pré-requisitos

- Java 11 ou superior.
- Biblioteca **Gson** da Google (para serialização/deserialização JSON).
- Conexão com a internet (para acesso à API de câmbio).

## 🔑 API Key

A chave de API (`API_KEY`) está atualmente embutida na classe `Cambio.java`. Para utilizar sua própria chave:

1. Acesse [ExchangeRate API](https://www.exchangerate-api.com/).
2. Crie uma conta gratuita e obtenha sua chave.
3. Substitua o valor de `API_KEY` na classe `Cambio`:

```java
private static final String API_KEY = "SUA_CHAVE_AQUI";
```

## 📝 Exemplo de Uso

```
*************************************************
Seja bem-vindo/a ao conversor de moedas

1) Dólar =>> Peso Argentino
2) Peso Argentino =>> Dólar
3) Dólar =>> Real brasileiro
4) Real brasileiro =>> Dólar
5) Dólar =>> Peso colombiano
6) Peso colombiano =>> Dólar
7) Sair

Escolha uma opção válida:
*************************************************
```

## 📄 Licença

Este projeto é de uso livre para fins educacionais.

