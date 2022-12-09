# Repetição

```
1. inicialização
2. verificação
3. atualização
```

## Estrutura `While`

```java
// inicialização
int count = 0; 

// verificação
while(count <= 10) {
  // faz algo
  System.out.println(i);

  // atualização
  count++;
}
```

## Estrutura `for`

```java
for(/*inicialização*/;/*verificação*/;/*atualização*/){

}
```

```java
for(int i = 0; i <= 10; i++) {
  System.out.println(i);
}
```

```java
int pacoteCompraLoja = 5;
int pacoteVendaLoja = 2;

while(estoque != 0){
  if(estoque > 0) {
      System.out.println("Continuo vendendo... | excesso = "  + estoque);
      estoque -= pacoteVenda;
  } else {
      System.out.println("Continuo comprando... | para repor = "  + Math.abs(estoque));
      estoque += pacoteCompraLoja;
  }
}
```


## Enhanced for - `for each`

enhanced: melhorado, encantado

```java
  int[] array = new int[] {1, 2, 3, 4};

  for(int elemento : array) {
    elemento = 3;
    System.out.println(elemento);
  }
```

```java
 String fizzBuzz(int number){
      if(number%15 == 0)
          return "FizzBuzz";

      if(number%3 == 0)
          return "Fizz";

      if(number%5 == 0)
          return "Buzz";

      return "";
  }
```