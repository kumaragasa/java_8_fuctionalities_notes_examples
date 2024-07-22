package com.java8.javafunctional.chapter8_methodreference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceExample4{

        public static void main(String[] args) {
            // Lambda expression
            Supplier<Person> personSupplierLambda = () -> new Person();

            // Constructor reference
            Supplier<Person> personSupplierMethodRef = Person::new;

            Person person = personSupplierMethodRef.get();
            System.out.println(person);

            // Lambda expression with arguments
            Function<String, Person> personFunctionLambda = name -> new Person(name);

            // Constructor reference with arguments
            Function<String, Person> personFunctionMethodRef = Person::new;

            Person personWithName = personFunctionMethodRef.apply("John");
            System.out.println(personWithName.getName());  // Output: John
        }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Person {
    private String name="Default Name";


}
