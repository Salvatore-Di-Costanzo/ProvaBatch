package com.example.batch.repository;

import com.example.batch.model.Utenti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtentiRepository extends JpaRepository<Utenti,Integer> {

    @Query ("select u from Utenti u")
    List<Utenti> trova();

    Utenti getUtentiById(int id);

    List<Utenti> getUtentiByNome(String name);
}
