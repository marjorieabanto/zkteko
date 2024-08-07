package com.example.demo.mapping;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("fingerprintMappingConfiguration")
public class MappingConfiguration {
    @Bean
    public FingerprintMapping fingerprintMapper(){ return new FingerprintMapping(); }


}