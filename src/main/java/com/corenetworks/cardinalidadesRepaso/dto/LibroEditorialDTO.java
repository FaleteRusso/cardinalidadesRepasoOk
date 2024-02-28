package com.corenetworks.cardinalidadesRepaso.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LibroEditorialDTO {
    private String isbn;
    private String titulo;
    private String nombreEditorial;
    private String direccion;
}
