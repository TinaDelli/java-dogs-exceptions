package com.lambdaschool.dogsinitial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DogsinitialApplication
{

    public static DogList ourDogList;
    public static void main(String[] args)
    {
        ourDogList = new DogList();
        SpringApplication.run(DogsinitialApplication.class, args);
    }

}

