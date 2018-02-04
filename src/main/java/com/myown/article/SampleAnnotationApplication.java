package com.myown.article;

import com.myown.article.mapper.CityMapper;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by abelard on 2/5/18.
 */
@SpringBootApplication
public class SampleAnnotationApplication implements CommandLineRunner{

    public static void main(String[] args) {
       // System.out.println("hello world");
        SpringApplication.run(SampleAnnotationApplication.class, args);
    }

    final private CityMapper cityMapper;

    public SampleAnnotationApplication(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    //@Override
    public void run(String... args) throws Exception {
        System.out.println(this.cityMapper.findByState("CA"));
    }
}
