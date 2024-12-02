package br.com.bibliotecaA3.service;

import br.com.bibliotecaA3.model.Livro;

public class LivroArvore {
	
    private LivroNode root;

    public boolean isEmpty() {
        return root == null;
    }

    //método de adicionar um livro na árvore
    public boolean add(Livro livro) {
        LivroNode newNode = new LivroNode(livro);

        if (isEmpty()) {
            root = newNode;
            return true;
        }

        LivroNode aux = root;
        while (aux != null) {
            LivroNode previous = aux;
            int comparison = aux.compareTo(livro.getTitulo());

            if (comparison == 0) {
                return false;
            }

            if (comparison > 0) {  
                aux = aux.getLeft();
                if (aux == null) {
                    previous.setLeft(newNode);
                    return true;
                }
            } else {  
                aux = aux.getRight();
                if (aux == null) {
                    previous.setRight(newNode);
                    return true;
                }
            }
        }
        return false;
    }

    // Método de busca
    public boolean exists(String title) {
        LivroNode aux = root;
        while (aux != null) {
            int comparison = aux.compareTo(title);

            if (comparison == 0) {
                return true; 
            }

            if (comparison > 0) {
                aux = aux.getLeft();
            } else {
                aux = aux.getRight();
            }
        }
        return false; 
    }
    
    // Método para obter um livro pelo título
    public Livro getLivroPorTitulo(String title) {
        LivroNode aux = root;
        while (aux != null) {
            int comparison = aux.compareTo(title);

            if (comparison == 0) {
                return aux.getLivro(); // Retorna o livro encontrado
            }

            if (comparison > 0) {
                aux = aux.getLeft();
            } else {
                aux = aux.getRight();
            }
        }
        return null; // Caso o livro não seja encontrado
    }

   
    public String inOrder() {
        return inOrder(root);
    }

    private String inOrder(LivroNode node) {
        if (node == null) return "";

        String out = "";
        out += inOrder(node.getLeft());
        out += node.getLivro().getTitulo() + " ";
        out += inOrder(node.getRight());
        return out;
    }
    
}