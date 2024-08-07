package com.example.demo.repository;

import com.example.demo.model.CSOCttTrabajadorId;
import com.example.demo.model.CSO_CTT_TRABAJADOR;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CsoCttTrabajadorRepository extends JpaRepository<CSO_CTT_TRABAJADOR, CSOCttTrabajadorId> {

}
