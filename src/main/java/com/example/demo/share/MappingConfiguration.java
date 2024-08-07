package com.example.demo.share;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("enhancedModelMapperConfiguration")
public class MappingConfiguration {

    @Bean
    public EnhancedMapper modelMapper() {
        return new EnhancedMapper();
    }
}
