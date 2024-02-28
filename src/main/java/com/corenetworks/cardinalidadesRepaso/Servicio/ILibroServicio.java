package com.corenetworks.cardinalidadesRepaso.Servicio;

import com.corenetworks.cardinalidadesRepaso.dto.LibroDTO;
import com.corenetworks.cardinalidadesRepaso.dto.LibroEditorialDTO;
import com.corenetworks.cardinalidadesRepaso.modelo.Libro;

import java.util.List;

public interface ILibroServicio {
    List<Libro>ejemploJoin();

List<LibroDTO> usarDTO();

List<LibroEditorialDTO>usarDtoJoin(int id);
}
