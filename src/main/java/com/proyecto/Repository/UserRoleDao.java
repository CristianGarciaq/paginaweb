package com.proyecto.Repository;
import com.proyecto.Entity.UserRole;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleDao extends JpaRepository<UserRole, Integer>{
        List<UserRole> findByRcveserv(String Rcveserv);

}
