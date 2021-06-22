package com.example.batch.repository;

import com.example.batch.model.Utenti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtentiRepository extends JpaRepository<Utenti,Integer> {

    List<Utenti> findAll();

    Utenti getUtentiById(int id);
}
