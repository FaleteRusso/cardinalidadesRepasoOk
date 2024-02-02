package com.corenetworks.cardinalidadesRepaso.repository;

import com.corenetworks.cardinalidadesRepaso.modelo.Editorial;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IEditorialRepo extends JpaRepository<Editorial,Integer> {
    @Query("from Editorial e where e.direccion= :direccion")
   List<Editorial>filtroDireccion(@Value("direccion") String direccion);

    @Query(value = "Select e.id_editorial, direccion, nombre from editoriales e where e.nombre = :nombre",
            nativeQuery = true)
    List<Editorial>filtroNombre(@Value("nombre") String nombre);

}


