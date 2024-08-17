# Resumos java básico
## Padrão de nomeclatura
- **Arquivo.java**: Todo arquivo java deve comecar com a letra MAIÚSCULA, caso seja composta, a segunda letra também é maiúscula:
 `Calculadora.java`, `CalculadoraCientifica.java`
- **Nome da classe no arquivo**: A classe deve possuir o mesmo nome do arquivo: Ex:

```
// Arquivo CalculadoraCientifica.java

public class CalculadoraCientifica{

}

```

## Nome de variável
- Toda variável deve ser escrita com a primeira ;letra em minúscula, caso seja compasta, a segunda letra é maiúscula, exemplo: `ano` e `anoFabricacao`. Essa prática é chamada de "camalCase".
#### Orientações  
- variável em minúscula pode ser mudada;
- Caso ela for maiúscula ela é **FINAL**, ou seja, não pode ser mudada;
- Pode conter letras, underline, $ e numeros de 0 a 9;
- Sempre inicida por letras, underline ou $, **jamais por números**;
- Deve se inicia com letras menúsculas *(Boa prática)*;
- Não pode ter espaços ex: `int numero um = 1`;
- Sem palavras reservadas da linguagem;
- Nome deve ser único dentro de um escopo;

## Declarando variável e métodos

Declarando uma variável em java seguem Sempre uam estrutura:

```
// Estrutura

tipo NomeBemDefinido = Atribuição (Em algums casos)

// Exemplo

int idade = 18;
double altura = 1.75;
Dog spike;

```
Declarando métodos em java segue uma estrutura bem simples:

```
// Estrutura

TipoRetorno NomeObjetivoNoIfinitivo (Paramento(s))

// Exemplo

int somar ( int numero1, init numero2)

String formatarCep (long cep)
```

## Identação

Termo utilizado para escrever código de forma hiérarquica, facilitando a visualização e o entendimento do programa (Nivél programador).

Exemplo: 

código sem Identação

```
public class BoletimEstudantil {
 public static void main(String[] args) {
  int madiaFinal = 6;
  if (madiaFinal < 6) {
  System.out.println("Reprovado!!!");
  } else if (madiaFinal == 6) {
  System.out.println("Prova minerva!!!");
  } else {
  System.out.println("Aprovado!!!");
  }
 }
}

```
código com Identação

```
public class BoletimEstudantil {
 public static void main(String[] args) {
  int madiaFinal = 6;

  if (madiaFinal < 6) {
    System.out.println("Reprovado!!!");
  } else if (madiaFinal == 6) {
    System.out.println("Prova minerva!!!");
  } else {
    System.out.println("Aprovado!!!");
  }
 }
}

```

## Organizando Arquivos

Á medida que nosso sistema vai evoluindo, surgem novos arquivos (código fonte) em nossa estrutura de arquivos do projeto. Isso exige que seja realizado uma organização desses arquivos através de pacotes (packages). 

- Serve para orgarnizar e melhorar a visualização em um projeto;

## Java Beans 

Umas das maiores dificuldades na programação é escrever algoritimos legíveis a nível que sejam compreendidos por todo time ou por você mesmo no futuro. Para isso a linguagem java sugere, através de convenções, formas de escrita universal para nossas classes, atributos, métodos e pacotes.

#### Variável
- Uma variável deve sem clara, sem abreviações ou declarações sem sentidos;
- Sempre no singular **exceto quando se refere a um array ou coleção**;
- Defina um idioma único para suas variável. Se declarar em inglês, todas seram em inglês;

#### Métodos

- Deve ser nomeada como verbos, através de letras minúsculas e maiúsculas;
- Prática camalCase;


**Resumo feito através da aula Anatomia das classes**
## Autora

- [@laviniiabenvindo](https://www.github.com/laviniiabenvindo)

