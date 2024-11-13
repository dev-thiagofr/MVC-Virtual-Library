package br.com.bibliotecaA3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bibliotecaA3.model.Editora;

public interface EditoraDao extends JpaRepository<Editora, Integer> {

}
