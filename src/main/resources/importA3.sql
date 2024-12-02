insert  into editora (id,contato, end_editora, nome) values 
(1, 'contato@intrinseca.com.br', 'Av. das Américas, 500 - Bl. 12 - Sala 303 - Barra da Tijuca - Rio de Janeiro - RJ', 'Intrinseca'),
(2, 'sac@companhiadasletras.com.br', 'Rua Bandeira Paulista, 702 – Cj. 32 – Itaim Bibi – São Paulo - SP', 'Companhia das Letras'),
(3, 'livraria@editoradialetica.com', 'Avenida Brigadeiro Faria Lima, 4.221 - 1 andar, Itaim Bibi, São Paulo - SP', 'Editora Dialética'),
(4, 'mdireto@record.com.br', 'Rua Dr. Pereira, 296, Centro Histórico, Paraty - RJ', 'Grupo Editorial Record'),
(5, 'sac@rocco.com.br', 'Rua Júlio Diniz, 56 - 5th floor - Vila Olímpia - Brooklin Novo, São Paulo - SP', 'Rocco');

insert into genero (id, gen_nome) values
(1, 'Aventura'),
(2, 'Drama'),
(3, 'Romance'),
(4, 'Terror'),
(5, 'Ficção'),
(6, 'Gastronomia');

insert into autor (id, contato_autor, nascionalidade, nasc_autor, nome) values 
(1, 'susan.wiggs@hotmail.com', 'Americana', '1958-05-17', 'Susan Wiggs'),
(2, 'jay.asher@outlook.com', 'Americano', '1975-09-30', 'Jay Asher'),
(3, 'colleen.hover@gmail.com', 'Americana', '1979-12-11', 'Colleen Hover'),
(4, 'taylor.reid@outlook.com', 'Americana', '1973-12-20', 'Taylor Jenkins Reid'),
(5, 'rafael.montes@yahoo.com', 'Brasileiro', '1990-09-22', 'Rafael Montes');

insert into usuario (id, email, end, nasc, nome, senha) values 
(3, '111111111@ulife.com.br', 'R. umdois, 202', '2001-02-02', 'Ana Clara Silva', 'senha123'),
(4, '222222222@ulife.com.br', 'R. tresquatro, 203', '1999-12-02', 'Pablo Maia', 'senha234'),
(5, '333333333@ulife.com.br', 'R. cincoseis, 204', '2003-03-10', 'Talles Costa', 'senha345'),
(6, '444444444@ulife.com.br', 'R. seteoito, 205', '2002-03-03', 'Fernanda Palermo', 'senha456'),
(7, '555555555@ulife.com.br', 'R. novedez, 206', '1998-05-05', 'Ariel Godói', 'senha567');

insert into livro (isbn, data_lanc, titulo, qtd_disp, image_dir, descr, cod_autor_id, cod_editora_id, cod_gen_id) values 
(1132, '2020-11-16', 'A Livraria dos Achados e Perdidos', 5, 'assets/images/dramapage/alivrariadosachadoseperdidos_resized.jpg', 'Capa de A Livraria dos Achados e Perdidos', 1, 5, 2),
(7107, '2018-06-12', 'Antes que as luzes se apaguem', 4, 'assets/images/livroaqalsa/aqalsabordaarredondada.svg', 'Capa de Antes que as luzes se apaguem', 2, 2, 2),
(2514, '2016-02-29', 'É assim que acaba: 1', 5, 'assets/images/dramapage/eassimqueacaba_resized.jpg', 'Capa de É assim que acaba: 1', 3, 2, 2),
(1397, '2022-10-18', 'É assim que começa (Vol.2 É assim que acaba)', 1, 'assets/images/dramapage/eassimquecomeca_resized.jpg', 'Capa de É assim que começa (Vol.2 É assim que acaba)', 3, 2, 2),
(7915, '2018-07-17', 'Todas as suas (im)perfeições', 3, 'assets/images/dramapage/todasassuasimperfeicoes_resized.jpg', 'Capa de Todas as suas (im)perfeições', 3, 5, 2),
(5737, '2017-06-13', 'Os sete maridos de Evenlyn Hugo', 7, 'assets/images/dramapage/ossetemaridosdeevelynhugo_resized.jpg', 'Capa de Os sete maridos de Evenlyn Hugo', 4, 1, 2);

insert into emprestimo (id, data_fim, data_ini, fk_livro_isbn, fk_usuario_id) values 
(1, '2023-05-15', '2023-05-15', 7107, 4),
(2, '2023-06-02', '2023-06-02', 7915, 3),
(3, '2023-07-21', '2023-07-21', 5737, 5),
(4, '2023-08-29', '2023-08-28', 1132, 6),
(5, '2023-05-15', '2023-05-15', 5737, 7);
