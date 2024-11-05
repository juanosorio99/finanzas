package com.example.finanzas.repository;

import com.example.finanzas.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Clientes, Integer> {
}
