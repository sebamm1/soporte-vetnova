package com.soporte.soporte.dto;

import lombok.Data;

@Data
public class SoporteDTO {
    private String asunto;
    private String descripcion;
    private String estado;
    private Long usuarioId;
}