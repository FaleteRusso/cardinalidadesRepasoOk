package com.corenetworks.cardinalidadesRepaso.controlador;

import com.corenetworks.cardinalidadesRepaso.Servicio.ILibroServicio;
import com.corenetworks.cardinalidadesRepaso.dto.LibroDTO;
import com.corenetworks.cardinalidadesRepaso.dto.LibroEditorialDTO;
import com.corenetworks.cardinalidadesRepaso.modelo.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroControlador {
    @Autowired
    private ILibroServicio servicio;

    @GetMapping
    public List<Libro>obtenerJoin(){
        return servicio.ejemploJoin();
    }

    @GetMapping("/dto")
    public List<LibroDTO>obtenerDto(){
        return servicio.usarDTO();
    }
@GetMapping("/dtojoin/{id}")
    public List<LibroEditorialDTO>obtenerDtoJoin(@PathVariable(name = "id")int id){
        return servicio.usarDtoJoin(id);
    }
}
