package com.proyecto.ServiceImp;
import com.proyecto.Entity.usuario;
import com.proyecto.Repository.alumnoRepository;
import com.proyecto.Service.alumnoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class alumnoServiceImpl implements alumnoService {
    @Autowired
    alumnoRepository ralumrepos;
    @Override
    public usuario saveAlumno(usuario alumno) {
        return ralumrepos.save(alumno);
    }
    @Override
    public usuario putMappinggAlumno(usuario alumno) {
        return (usuario) ralumrepos.findAll();
    }
    @Override
    public usuario deletMappinggcaAlumno(int id) {
        if (ralumrepos.existsById(id)) {
            Optional<usuario> optionaltiket = ralumrepos.findById(id);
            usuario dateAlumno = optionaltiket.get();
            ralumrepos.deleteById(id);
            return dateAlumno;
        }
        return null;
    }
    @Override
    public List<usuario> getAlumno() {
        return ralumrepos.findAll();
    }
    @Override
    public void addAlumno(usuario staTicket) {
        ralumrepos.save(staTicket);
    }
    @Override
    public usuario findByAlumno(int id) {
        return ralumrepos.findById(id).orElse(null);
    }
}
