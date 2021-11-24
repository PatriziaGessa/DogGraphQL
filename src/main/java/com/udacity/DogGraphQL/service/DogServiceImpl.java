package com.udacity.DogGraphQL.service;

import com.udacity.DogGraphQL.entity.Dog;
import com.udacity.DogGraphQL.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImpl implements  DogService{
    @Autowired
    DogRepository dogRepository;

    public List<Dog> retrieveDogs() {
        return (List<Dog>) dogRepository.findAll();

    }

}
