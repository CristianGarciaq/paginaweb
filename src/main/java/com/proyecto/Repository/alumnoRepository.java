package com.proyecto.Repository;
import com.proyecto.Entity.usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface alumnoRepository extends JpaRepository<usuario, Integer> {
    
}
