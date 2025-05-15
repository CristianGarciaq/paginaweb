/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.Comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author cr7ga
 */@Controller
 
public class grupoEstudioController {
  @GetMapping("/pagina")
    public String mostrarGrupoEstudio() {
        return "gruposEstudio"; 
    }

    @GetMapping("/perfil")
    public String mostrarPerfil() {
        return "perfil"; 
    }
    @GetMapping("/proyectos")
    public String mostrarProyectos() {
        return "proyectos"; 
    }
     @GetMapping("/grupo/algebra")
    public String grupoAlgebra() {
        return "algebraLineal"; 
    }

    @GetMapping("/grupo/calculo")
    public String grupoCalculo() {
        return "calculoIntegral"; 
    }

    @GetMapping("/grupo/ecuaciones")
    public String grupoEcuaciones() {
        return "ecuacionesDiferenciales"; 
    }

    @GetMapping("/grupo/telecom")
    public String grupoTelecomunicaciones() {
        return "telecomunicaciones";
    }

    @GetMapping("/grupo/so")
    public String grupoSistemasOperativos() {
        return "sistemasOperativos"; 
    }

    @GetMapping("/grupo/electricos")
    public String grupoPrincipiosElectricos() {
        return "principiosElectricos"; 
    }
}
