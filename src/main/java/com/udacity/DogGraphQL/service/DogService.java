package com.udacity.DogGraphQL.service;

import com.udacity.DogGraphQL.entity.Dog;


import java.util.List;

public interface DogService {
    List<Dog> retrieveDogs();
}
