package com.proyecto.Comtroller;
import com.proyecto.Entity.usuario;
import com.proyecto.Service.alumnoService;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
@Slf4j
public class alumnoController {
    @Autowired
    private alumnoService alumnserv;
    @GetMapping("/estadoRes")
public String inicioo(Model model) {
    List<usuario> alumnooo = new ArrayList<>();
    alumnooo = alumnserv.getAlumno();
    model.addAttribute("alumn", alumnooo);
    return "estRes";
}
    @GetMapping("/editarNuevo/{id}")
    public String editarr(@PathVariable int id, Model model) {
        usuario alumnooo = alumnserv.findByAlumno(id);
        model.addAttribute("alumn", alumnooo);
        return "formularioAlumno";
    }
     @PostMapping("/guardarNuevo")
    public String guardarr(@ModelAttribute usuario estResguar) {
        alumnserv.addAlumno(estResguar);
        return "redirect:/estResg";
    }
    @GetMapping("/eliminarNuevo/{id}")
    public String eliminarr(@PathVariable int id) {
        alumnserv.deletMappinggcaAlumno(id);
        return "redirect:/estResg";
    }
}
