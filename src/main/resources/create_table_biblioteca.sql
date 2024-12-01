-- Banco A3
CREATE DATABASE bibliotecaa3;
USE bibliotecaa3;
-- Tabela Editora
CREATE TABLE editora (
    id INT PRIMARY KEY,
    contato VARCHAR(255),
    end_editora VARCHAR(500),
    nome VARCHAR(255)
);

-- Tabela Gênero
CREATE TABLE genero (
    id INT PRIMARY KEY,
    gen_nome VARCHAR(255)
);

-- Tabela Autor
CREATE TABLE autor (
    id INT PRIMARY KEY,
    contato_autor VARCHAR(255),
    nascionalidade VARCHAR(255),
    nasc_autor DATE,
    nome VARCHAR(255)
);

-- Tabela Usuário
CREATE TABLE usuario (
    id INT PRIMARY KEY,
    email VARCHAR(255),
    end VARCHAR(255),
    nasc DATE,
    nome VARCHAR(255),
    senha VARCHAR(100)
);

-- Tabela Livro
CREATE TABLE livro (
    isbn INT PRIMARY KEY,
    data_lanc DATE,
    titulo VARCHAR(255),
    qtd_disp INT,
    image_dir varchar(120),
    descr varchar(100),
    cod_autor_id INT,
    cod_editora_id INT,
    cod_gen_id INT,
    FOREIGN KEY (cod_autor_id) REFERENCES autor (id),
    FOREIGN KEY (cod_editora_id) REFERENCES editora (id),
    FOREIGN KEY (cod_gen_id) REFERENCES genero (id)
);

-- Tabela Empréstimo
CREATE TABLE emprestimo (
    id INT PRIMARY KEY,
    data_fim DATE,
    data_ini DATE,
    fk_livro_isbn INT,
    fk_usuario_id INT,
    FOREIGN KEY (fk_livro_isbn) REFERENCES livro (isbn),
    FOREIGN KEY (fk_usuario_id) REFERENCES usuario (id)
);

