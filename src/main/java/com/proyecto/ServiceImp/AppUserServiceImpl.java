package com.proyecto.ServiceImp;
import com.proyecto.Entity.AppUser;
import com.proyecto.Repository.AppUserDao;
import com.proyecto.Service.AppUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserServiceImpl implements AppUserService {

 @Autowired
    private AppUserDao appUserDao;

    @Override
    public List<AppUser> listarUsuarios() {
        return appUserDao.findAll();
    }



    
}
