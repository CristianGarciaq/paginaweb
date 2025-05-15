package com.proyecto.Repository;
import com.proyecto.Entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AppUserDao extends JpaRepository<AppUser, String> {

}
