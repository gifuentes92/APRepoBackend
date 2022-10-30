
package com.myApi.miportfolio.Service;

import com.myApi.miportfolio.Model.Educacion;
import com.myApi.miportfolio.Repository.EducacionRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionServicio {
    @Autowired
    EducacionRepositorio educacionRepo;

 public void crearEducacion(Educacion educacion)
    {
        educacionRepo.save(educacion);
    }
    
    public void borrarEducacion(Long id){
        educacionRepo.deleteById(id);
    }
    
    public List<Educacion> mostrarEducacion(){
      return  educacionRepo.findAll();
    }

    public Educacion encontrarEducacion(Long id){
        Educacion educacion = educacionRepo.findById(id).orElse(null);
        return educacion;
    }
    
}
