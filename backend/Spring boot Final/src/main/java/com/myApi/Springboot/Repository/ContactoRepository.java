
package com.myApi.Springboot.Repository;

import com.myApi.Springboot.Model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Long>{
    
}
