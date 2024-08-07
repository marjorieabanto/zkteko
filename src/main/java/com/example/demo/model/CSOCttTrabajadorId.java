package com.example.demo.model;


import jakarta.persistence.Embeddable;
import jakarta.persistence.IdClass;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class CSOCttTrabajadorId implements Serializable {


    private Integer id_contrato;

    private Integer id_protocolo;
    private Integer id_persona_tra;

    public CSOCttTrabajadorId() {
    }

    public CSOCttTrabajadorId(Integer idContrato, Integer idProtocolo, Integer idPersonaTra) {
        this.id_contrato = idContrato;
        this.id_protocolo = idProtocolo;
        this.id_persona_tra = idPersonaTra;
    }
    // Equals y hashCode methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CSOCttTrabajadorId that = (CSOCttTrabajadorId) o;
        return Objects.equals(id_contrato, that.id_contrato) &&
                Objects.equals(id_protocolo, that.id_protocolo) &&
                Objects.equals(id_persona_tra, that.id_persona_tra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_contrato, id_protocolo, id_persona_tra);
    }
}
