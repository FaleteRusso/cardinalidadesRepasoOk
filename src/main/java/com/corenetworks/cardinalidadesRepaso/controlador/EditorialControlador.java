package com.corenetworks.cardinalidadesRepaso.controlador;

import com.corenetworks.cardinalidadesRepaso.Servicio.EditorialServiciolmpl;
import com.corenetworks.cardinalidadesRepaso.Servicio.IEditorialServicio;
import com.corenetworks.cardinalidadesRepaso.modelo.Editorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editoriales")
public class EditorialControlador {
    @Autowired
    private IEditorialServicio servicio;
    @PostMapping
    public Editorial crear(@RequestBody Editorial e){
        return servicio.crear(e);
    }

    @PutMapping
    public Editorial modificar(@RequestBody Editorial e){
        return servicio.modificar(e);
    }

    @DeleteMapping("/{id}")
    void eliminar(@PathVariable(name = "id") int id){
        servicio.eliminar(id);
    }
    @RequestMapping("/{id}")
    public Editorial consultarUno(@PathVariable(name = "id") int id){
        return servicio.consultarUno(id);
    }
    @GetMapping
    public List<Editorial>consultaTodos(){
        return servicio.consultarTodos();
    }
    @GetMapping("/filtro/{direccion}")
    public List<Editorial>filtroDireccion(@PathVariable(name = "direccion") String direccion){
        return servicio.filtroDireccion(direccion);
    }
    @GetMapping("/filtro2/{nombre}")
    public List<Editorial>filtroNombre(@PathVariable(name = "nombre")String nombre){
        return servicio.filtroNombre(nombre);
    }


}
