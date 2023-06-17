package com.cistech.javafs.training.week3;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InterfaceMain {

    public static void main(String[] args) {
        Person person = new Person();
        Consumer<Person> pI =new Consumer<Person>(){
            @Override
            public void accept(Person per) {
                System.out.print(per.toString());
            }
        };
        pI.accept(person);

        Consumer lambda = (er) -> System.out.print(er.toString());
         lambda.accept(person);
        lambda.accept(new Account());

        // Supplier- > takes no arguements and returns a value
        // Consumer -> takes an argument and return nothing ( void)
        // Predicate -> takes an arguemnt and returns boolean
        // Function -> takes an argument and returns an argument

        Supplier<Person> randomPerson = () -> new Person();
        Function<Integer, String> functionLambda = (age) -> Integer.toString(age);
        Predicate<Integer> predicateLambda= (age) -> age == 100;

        // Streams
        // passing code as method arguments

        // search, sort,  max, min, sum
        // add, delete, modify, ->
// functional programming

        // functional interface
        // Lambda -> () -> {}

        Integer[] numbers = new Integer[100];

        // search for 80
        find80(numbers);

       Stream<Integer> numbersStream =  Stream.of(numbers);
        Arrays.stream(numbers);

        numbersStream.filter(i -> i %2 == 0)
                .sorted()
                .map(i -> String.valueOf(i))
                // .forEach(i -> System.out.println(i));
                // .collect(() -> new String[]);
                .toArray();
        // intermediate operations
        //  filter, sort, map, limit

        // terminal operations
        // min, max , avg, sum, findFirst, count, forEach, collect, toArray


        Arrays.stream(numbers).parallel()
                .mapToInt(i -> i).average();

        // :: -> method reference

    }
    // {} <> () :: ; -> ? , .^

    private static int find80(Integer[] numbers){
        for(int i: numbers){
            if(i ==80)
                return i;
        }
        return 0;
    }

    class PersonPrinterImpl implements PersonPrinter{

        @Override
        public void printPerson(Person p) {
            System.out.print(p.toString());
        }
    }


}
