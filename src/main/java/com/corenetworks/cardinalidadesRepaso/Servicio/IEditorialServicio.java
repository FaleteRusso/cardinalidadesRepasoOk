package com.corenetworks.cardinalidadesRepaso.Servicio;

import com.corenetworks.cardinalidadesRepaso.modelo.Editorial;

import java.util.List;

public interface IEditorialServicio {
    Editorial crear(Editorial e);
    Editorial modificar(Editorial e);
    void  eliminar(int id);
    Editorial consultarUno(int id);
    List<Editorial>consultarTodos();

    List<Editorial>filtroDireccion(String direccion);
    List<Editorial>filtroNombre(String nombre);

}
