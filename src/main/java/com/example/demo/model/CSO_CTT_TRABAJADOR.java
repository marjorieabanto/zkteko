
package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;


@Entity
@Table(name = "CSO_CTT_TRABAJADOR")
@Getter
@Setter
public class CSO_CTT_TRABAJADOR {

    @EmbeddedId
    private CSOCttTrabajadorId id;


    @Column(name = "FEC_EVALUACION")
    private LocalDateTime fecEvaluacion;

    @Column(name = "RUT_FIRMA_TRA")
    private String rutFirmaTra;

    @Column(name = "RUT_HUELLA_TRA")
    private String rutHuellaTra;

    @Column(name = "ID_REGISTRO_CSO")
    private Integer idRegistroCso;

    @Column(name = "IND_FACTURADO",columnDefinition = "CHAR")
    private Character indFacturado;

    @Column(name = "IND_ESTADO", columnDefinition = "CHAR")
    private Character indEstado;

    @Column(name = "COD_USUARIO_REG")
    private String codUsuarioReg;

    @Column(name = "FEC_REGISTRO")
    private LocalDateTime fecRegistro;

    @Column(name = "COD_USUARIO_MOD")
    private String codUsuarioMod;

    @Column(name = "FEC_REGISTRO_MOD")
    private LocalDateTime fecRegistroMod;

}
