package com.corenetworks.cardinalidadesRepaso.repository;

import com.corenetworks.cardinalidadesRepaso.dto.LibroDTO;
import com.corenetworks.cardinalidadesRepaso.dto.LibroEditorialDTO;
import com.corenetworks.cardinalidadesRepaso.modelo.Libro;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ILibroRepo extends JpaRepository<Libro,String> {
    @Query("SELECT l FROM Libro l JOIN FETCH l.editorial")
    List<Libro> obtenerLibrosEditorial();

    @Query("SELECT new com.corenetworks.cardinalidadesRepaso.dto.LibroDTO(l.isbn,l.titulo) FROM Libro l")
    List<LibroDTO> usarDTO();
    @Query("SELECT new com.corenetworks.cardinalidadesRepaso.dto.LibroEditorialDTO(l.isbn, l.titulo, l.editorial.nombre, l.editorial.direccion)" +
            "FROM Libro l JOIN l.editorial WHERE l.editorial.idEditorial = :id")
    List<LibroEditorialDTO>usarDtoJoin(@Value("id") int id);
}
