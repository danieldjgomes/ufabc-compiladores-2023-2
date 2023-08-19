# IsidroLang - Compiladores Q2 2023

Este projeto foi desenvolvido para a matéria de compiladores na UFABC.

## Como compilar o projeto

### Requisitos

 - `maven`
 - `java`

### Instalar as dependências

```bash
mvn install
```

### Compilar o projeto

```bash
mvn compile
```

### Gerar o .jar

```bash
mvn package
```

## Como usar

### Overview

`java -jar target/compiladores-2023-0.1.jar [FILE] [-o OUT_FILE]`

### Exemplos

```bash
java -jar target/compiladores-2023-0.1.jar examples/helloWorld.isi
```

```bash
java -jar target/compiladores-2023-0.1.jar examples/helloWorld.isi -o helloWorld
```