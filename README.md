# Spring Toys

## Como rodar o projeto
Primeiramente certifique-se que seu computador possui o Java 17 instalado, assim como a versão mais recente do Maven.

Clone este repositório na sua pasta de preferência. Utilizando um terminal, digite o seguinte comando:

    mvn spring-boot:run

Caso esteja usando uma IDE, abra o projeto na seu editor de preferência, localize a classe **SpringToysApplication** e execute o projeto através do método main localizado nesta classe.

## IDE utilizado para elaboração do projeto: IntelliJ.

## Utilizamos o Render para criar uma instância do PostgreSQL e também fazer o Deploy : https://spring-toys-mvc.onrender.com/

## Endpoints: Brinquedos

### Lista de brinquedos
_**/brinquedos/list**_

**https://spring-toys-mvc.onrender.com/brinquedos/list**

Retorna uma página web com a lista de brinquedos cadastrados e os seus detalhes.

### Exemplo de tela

![image](https://github.com/user-attachments/assets/16602275-5342-4ea2-9242-ae284c4ea854)

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
![image](https://github.com/user-attachments/assets/2543cbe2-6c5d-4ef3-b60b-237fe4854a97)


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
![image](https://github.com/user-attachments/assets/0ea89f5e-49f6-41f9-b8be-41a5eb3c541b)


---

### Excluir um brinquedo
_**/brinquedos/delete/{id}**_

**https://spring-toys-mvc.onrender.com/brinquedos/delete/61**

Faz a exclusão de um brinquedo de id passado através do endereço da requisição. Usuário é redirecionado para a listagem de brinquedos.


---
# Implementação das telas de Login e Signup

### Primeiramente adicionamos o Spring Secutiry ao nosso projeto:
![Captura de tela 2024-10-09 181114](https://github.com/user-attachments/assets/70f628f5-7dc7-4163-aba0-42eb872c5942)

### Logo após criamos e configuramos a classe de configuração do Spring Security:
![Captura de tela 2024-10-09 181222](https://github.com/user-attachments/assets/f253adbc-f211-4620-8463-94b557da2033)


### Criamos os controllers necessários para receber as requisições de login e signup:
![Captura de tela 2024-10-09 181323](https://github.com/user-attachments/assets/bf97bab6-3bf7-4c71-b616-98ecd996a753)
![Captura de tela 2024-10-09 181401](https://github.com/user-attachments/assets/b76d1e3d-4949-4746-ad10-619fc1991027)


### Criamos o html de login , responsável por fazer as requisições para a autenticação:
![Captura de tela 2024-10-09 181721](https://github.com/user-attachments/assets/b3f0a5bc-def5-4772-9528-ac5e4a45a919)
![Captura de tela 2024-10-09 181735](https://github.com/user-attachments/assets/f4fc32c4-a447-4931-a621-db7b99a0e3d6)

### E por fim criamos o html para as requisições de signup:
![Captura de tela 2024-10-09 181755](https://github.com/user-attachments/assets/9cef5848-0023-418f-a11b-91c751ee83f3)

### Preview do resultado das telas de login e signup:
![Captura de tela 2024-10-09 190001](https://github.com/user-attachments/assets/c358a716-2bc4-4c7f-b76d-b9d527268619)
![Captura de tela 2024-10-09 190015](https://github.com/user-attachments/assets/d983ef3b-3c4f-4abb-844c-66b06ee2407c)


### Configuração final do Spring Initializr
![Captura de tela 2024-10-09 180647](https://github.com/user-attachments/assets/56f74fb7-2e2f-4551-8755-21eedd2cc02b)
![Captura de tela 2024-10-09 180738](https://github.com/user-attachments/assets/3879e02a-cc96-4270-a7c5-1010720609b4)










