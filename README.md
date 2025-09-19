Projeto Java - Tela de Login com Conexão ao Banco de Dados

Este projeto é uma aplicação Java com uma interface gráfica (Swing) para realizar login de usuários. Ele se conecta a um banco de dados MySQL para validar as credenciais de login.

Tecnologias utilizadas

Java (JDK 8 ou superior)

MySQL (ou MariaDB)

JDBC (Java Database Connectivity)

Swing (para a interface gráfica)

PreparedStatement (para consulta segura ao banco de dados)

Estrutura do Projeto

A estrutura do projeto é organizada da seguinte forma:

O projeto está dividido em três pacotes principais:

DAO: Contém as classes responsáveis pela conexão com o banco de dados e pelas operações de login.

Conexão.java: Classe que realiza a conexão com o banco MySQL usando JDBC.

ConexLogin.java: Classe que faz a validação do login consultando o banco.

DTO: Contém a classe que representa os dados do usuário para login.

TesteConexão.java: Classe que armazena o nome do usuário e a senha fornecidos na tela de login.

View: Contém a interface gráfica da aplicação.

TelaLogin.java: Tela de login construída com Swing que permite o usuário inserir nome e senha e acionar o login.

Além disso, o projeto possui:

Uma pasta para bibliotecas externas (lib/), onde deve ser colocado o driver JDBC do MySQL.

Um arquivo SQL (BancoRevisao.sql) que cria o banco de dados, a tabela de usuários e já insere um usuário para teste.

O arquivo README.md que documenta o projeto.
Requisitos

Java JDK 8 ou superior

MySQL (ou MariaDB)

IDE (Eclipse, IntelliJ IDEA, NetBeans ou qualquer outra IDE de sua escolha)

Instalação e Execução

Clone o repositório:

Abra o terminal e clone o repositório em seu ambiente local:

git clone https://github.com/seu-usuario/projeto-login-java.git


Configuração do Banco de Dados:

Instale o MySQL (ou MariaDB) em sua máquina local.

Crie um banco de dados chamado BancoRevisao e a tabela tabela para armazenar os dados de login.

Use o seguinte script SQL para criar a estrutura do banco de dados e adicionar um usuário:

CREATE DATABASE BancoRevisao;

USE BancoRevisao;

CREATE TABLE tabela (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    usuario VARCHAR(50) NOT NULL UNIQUE,
    senha VARCHAR(50) NOT NULL
);

INSERT INTO tabela (usuario, senha) VALUES ("João Porto", "12345678");


Configuração da Conexão no Código:

Abra o arquivo Conexão.java dentro do diretório DAO/ e configure as credenciais do seu banco de dados (caso necessário):

String url = "jdbc:mysql://localhost:3306/BancoRevisao";
String user = "root";  // Altere para seu usuário
String password = "root";  // Altere para sua senha


Adicionar o Driver JDBC do MySQL:

Baixe o MySQL Connector/J
 e adicione o arquivo JAR ao seu projeto (diretório lib/ ou diretamente no classpath da IDE).

Executando a Aplicação:

Abra a classe TelaLogin.java e execute a aplicação. A interface de login será exibida.

Utilize as credenciais "João Porto" e "12345678" para fazer o login com sucesso.

Tela de Login:

O sistema exibirá um ícone verde se a conexão com o banco de dados for bem-sucedida.

Caso a conexão falhe, um ícone vermelho será exibido.

Fluxo do Sistema

O usuário insere o nome de usuário e a senha na interface de login.

A aplicação verifica as credenciais inseridas comparando com as que estão no banco de dados MySQL.

Se as credenciais forem válidas, uma mensagem de "Login bem-sucedido!" será exibida. Caso contrário, uma mensagem de erro será mostrada.

Observações Importantes

Segurança: O sistema atualmente armazena as senhas em texto plano no banco de dados. Para maior segurança, considere implementar criptografia de senhas, como o uso de BCrypt.

Banco de Dados: O banco de dados utilizado é o MySQL. Certifique-se de que o MySQL está em execução na sua máquina local.

Driver JDBC: A classe Conexão.java utiliza o driver JDBC do MySQL para conectar ao banco de dados. Certifique-se de que o driver esteja corretamente configurado no seu projeto.

Tela de Login

<img width="395" height="334" alt="Captura de tela 2025-09-19 165934" src="https://github.com/user-attachments/assets/1d65eefc-4c0e-4567-95d6-a46cb1015766" />

Possíveis Melhorias

Criptografia de Senha: Usar BCrypt ou outro algoritmo de criptografia para armazenar senhas de forma segura.

Cadastro de Usuários: Adicionar uma tela para cadastrar novos usuários no sistema.

Recuperação de Senha: Implementar uma funcionalidade de recuperação de senha.

Log de Atividades: Registrar logs de tentativas de login (bem-sucedidas ou falhas).

Autor

João Porto

Email: jvpratesporto@gmail.com
