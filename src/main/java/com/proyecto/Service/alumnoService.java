package com.proyecto.Service;

import com.proyecto.Entity.usuario;
import java.util.List;

public interface alumnoService {

    public usuario saveAlumno(usuario alumno);

    public usuario putMappinggAlumno(usuario alumno);

    public usuario deletMappinggcaAlumno(int id);

    public List<usuario> getAlumno();

    void addAlumno(usuario alumno);

    public usuario findByAlumno(int id);
}
