package com.burale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet")
    public GreetResponse greet() {

        return new GreetResponse(
                "Hello World!",
                List.of("Java", "Kotlin", "Scala"),
                new Person("Ahmed Burale", 25, 30_000.00)
        );
    }


    record Person(String name, int age, double savings) {
    }

    record GreetResponse(
            String greet,
            List<String> fovProgrammingLanguages,
            Person person

    ) { }

/*
//    record GreetResponse(String greet) {
//        public String toString() {
//                return "GreetResponse{" +
//                        "greet='" + greet + '\'' +
//                        '}';
//            }
//
//            @Override
//            public boolean equals(Object o) {
//                if (this == o) return true;
//                if (o == null || getClass() != o.getClass()) return false;
//                GreetResponse that = (GreetResponse) o;
//                return Objects.equals(greet, that.greet);
//            }
//
//    }*/


}
