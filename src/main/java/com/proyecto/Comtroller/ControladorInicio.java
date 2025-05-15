package com.proyecto.Comtroller;
import com.proyecto.Service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import lombok.extern.slf4j.Slf4j;
@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    private AppUserService appUserService;
    
    @GetMapping("/")
    public String inicio(Model model, @AuthenticationPrincipal User user){
        var usuarios = appUserService.listarUsuarios();
        model.addAttribute("personas", usuarios);  
        return "perfil";
    }
        
    @GetMapping("/prubea")
    public String fin(Model model, @AuthenticationPrincipal User user){
        
        return "prueba";
    }
}
