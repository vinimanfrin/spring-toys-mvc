# Spring Toys

## Como rodar o projeto
Primeiramente certifique-se que seu computador possui o Java 17 instalado, assim como a versão mais recente do Maven.

Clone este repositório na sua pasta de preferência. Utilizando um terminal, digite o seguinte comando:

    mvn spring-boot:run

Caso esteja usando uma IDE, abra o projeto na seu editor de preferência, localize a classe **SpringToysApplication** e execute o projeto através do método main localizado nesta classe.

## IDE utilizado para elaboração do projeto: IntelliJ.

## Deploy no Render: https://spring-toys-mvc.onrender.com/

## Endpoints: Brinquedos

### Lista de brinquedos
_**/brinquedos/list**_

**https://spring-toys-mvc.onrender.com/brinquedos/list**

Retorna uma página web com a lista de brinquedos cadastrados e os seus detalhes.

### Exemplo de tela
inserir foto aqui

---
### Editar detalhes de um brinquedo
_**/brinquedos/edit/{id}**_

**https://spring-toys-mvc.onrender.com/brinquedos/edit/61**

Retorna uma página web com a tela de edição de um produto especificado no endereço.

| campo       | obrigatório | descrição
|-------------|------------|-----------
| nome        | sim        | nome do brinquedo
| tipo       | sim        | tipo do brinquedo
| classificacao | sim        | classificação do brinquedo
| tamanho | sim       | tamanho do brinquedo
| preco | sim       | preço do brinquedo

### Exemplo de tela
inserir foto aqui

---
### Cadastrar um novo brinquedo
_**/brinquedos/create**_

**https://spring-toys-mvc.onrender.com/brinquedos/create**

Retorna uma página web com a tela de cadastro de um novo produto.

| campo       | obrigatório | descrição
|-------------|------------|-----------
| nome        | sim        | nome do brinquedo
| tipo       | sim        | tipo do brinquedo
| classificacao | sim        | classificação do brinquedo
| tamanho | sim       | tamanho do brinquedo
| preco | sim       | preço do brinquedo

### Exemplo de tela
inserir foto aqui

---

### Excluir um brinquedo
_**/brinquedos/delete/{id}**_

**https://spring-toys-mvc.onrender.com/brinquedos/delete/61**

Faz a exclusão de um brinquedo de id passado através do endereço da requisição. Usuário é redirecionado para a listagem de brinquedos.