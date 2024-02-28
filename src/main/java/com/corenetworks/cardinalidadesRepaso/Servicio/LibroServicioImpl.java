package com.corenetworks.cardinalidadesRepaso.Servicio;

import com.corenetworks.cardinalidadesRepaso.dto.LibroDTO;
import com.corenetworks.cardinalidadesRepaso.dto.LibroEditorialDTO;
import com.corenetworks.cardinalidadesRepaso.modelo.Libro;
import com.corenetworks.cardinalidadesRepaso.repository.ILibroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LibroServicioImpl implements ILibroServicio{

    @Autowired
    private ILibroRepo repo;
    @Override
    public List<Libro> ejemploJoin() {
        return repo.obtenerLibrosEditorial();
    }

    @Override
    public List<LibroDTO> usarDTO() {
        return repo.usarDTO();
    }

    @Override
    public List<LibroEditorialDTO> usarDtoJoin(int id) {
        return repo.usarDtoJoin(id);
    }
}
