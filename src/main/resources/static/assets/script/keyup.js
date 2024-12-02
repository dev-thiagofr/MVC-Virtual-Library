
	function keyup() {
	           let busca = $('#arvore').val();
	           if (busca.length >= 3) {  // Somente realiza a busca com 3 ou mais caracteres
	               $.ajax({
	                   url: '/buscarLivro',
	                   method: 'GET',
	                   data: { titulo: busca },
	                   success: function (data) {
	                       // Atualiza a lista com os livros encontrados
	                       let listaLivros = '';
	                       data.forEach(function (livro) {
	                           listaLivros += `
	                               <div class="livro-item">
	                                   <a href="/detalheLivro/${livro.id}">
	                                       <h3>${livro.titulo}</h3>
	                                       <p>${livro.autor}</p>
	                                   </a>
	                               </div>
	                           `;
	                       });
	                       $('#resultado').html(listaLivros);
	                   }
	               });
	           } else {
	               // Limpa os resultados se a busca for menor que 3 caracteres
	               $('#resultado').html('');
	           }
	       }
