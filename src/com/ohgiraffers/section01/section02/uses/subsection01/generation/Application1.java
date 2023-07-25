package com.ohgiraffers.section01.section02.uses.subsection01.generation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {

    public static void main(String[] args) {
        /* 배열이나 컬렉션을 이용하여 스트림을 생성하는 방법을 이해하고 사용할 수 있다. */

        /* 배열 스트림 생성 */
        String[] sarr = new String[] {"java" , "oracle", "jdbc"};
        Stream<String> stringStream1 = Arrays.stream(sarr);
        stringStream1.forEach(System.out::println);

        Stream<String> stringStream2 = Arrays.stream(sarr,0,2);
        stringStream2.forEach(System.out::println);

        /* 컬렉션 스트림 생성 */
        List<String> stringList = Arrays.asList("html", "css", "javascript");
        Stream<String> stringStream3 = stringList.stream();
        stringStream3.forEach(System.out::println);

        /* Builder를 활용한 스트림 생성 */
        Stream<String> builderstream = Stream.<String>builder()
                .add("홍길동")
                .add("유관순")
                .add("윤봉길")
                .build();

        builderstream.forEach(System.out::println);

        /* iterator()를 활용하여 수열 형태의 스트림을 생성할 수 있다. */
        Stream<Integer> intStream = Stream.iterate(10, value -> value*2).limit(10);
        intStream.forEach(value -> System.out.print(value + " "));

    }
}
