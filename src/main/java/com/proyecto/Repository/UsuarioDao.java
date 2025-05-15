package com.proyecto.Repository;
import com.proyecto.Entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<AppUser, Long>{
    AppUser findByUacveserv(String uacveserv);
}
