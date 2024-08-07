package com.example.demo.mapping;


import com.example.demo.model.Fingerprint;
import com.example.demo.resource.CreateFingerResource;
import com.example.demo.share.EnhancedMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public class FingerprintMapping implements Serializable {

    @Autowired
    protected EnhancedMapper mapper;

    public Fingerprint toModel(CreateFingerResource resource) { return this.mapper.map(resource, Fingerprint.class); }


}