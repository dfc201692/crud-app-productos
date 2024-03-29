package com.example.crud_app.repository;

import com.example.crud_app.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    // Puedes agregar métodos personalizados según sea necesario
}

