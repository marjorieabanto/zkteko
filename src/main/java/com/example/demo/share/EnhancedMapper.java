package com.example.demo.share;



import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class EnhancedMapper extends ModelMapper {

    public EnhancedMapper() {
        super();
    }

    public <S, T> List<T> mapList(List<S> sourceList, Class<T> targetClass) {
        return sourceList.stream().map(item -> this.map(item, targetClass)).collect(Collectors.toList());
    }
}