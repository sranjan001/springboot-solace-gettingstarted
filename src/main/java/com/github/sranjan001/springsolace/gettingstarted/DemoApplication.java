package com.github.sranjan001.springsolace.gettingstarted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public Function<String, String> uppercase(){
        return v -> {
            System.out.println("Uppercasing: " + v);
            return v.toUpperCase();
        };
    }

    @Bean
    public Function<String, String> reverse() {
        return v -> {
            System.out.println("Reversing: " + v);
            return new StringBuilder(v).reverse().toString();
        };
    }
}
