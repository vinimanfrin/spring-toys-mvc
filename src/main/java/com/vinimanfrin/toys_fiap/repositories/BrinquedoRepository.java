package com.vinimanfrin.toys_fiap.repositories;

import com.vinimanfrin.toys_fiap.models.Brinquedo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrinquedoRepository extends JpaRepository<Brinquedo,Long> {
}
