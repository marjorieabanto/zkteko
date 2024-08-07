package com.example.demo.service;

import com.example.demo.model.CSOCttTrabajadorId;
import com.example.demo.model.CSO_CTT_TRABAJADOR;

import java.util.List;

public interface CsoCttTrabajadorService {

    public CSO_CTT_TRABAJADOR save(CSO_CTT_TRABAJADOR trabajador);

    public CSO_CTT_TRABAJADOR updateFingerprintPath(CSOCttTrabajadorId id, String fingerprintPath);

    public List<CSO_CTT_TRABAJADOR> getAllTrabajadores();
}
