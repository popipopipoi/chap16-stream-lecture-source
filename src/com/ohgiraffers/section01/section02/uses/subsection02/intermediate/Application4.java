package com.ohgiraffers.section01.section02.uses.subsection02.intermediate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application4 {
    public static void main(String[] args) {
        /* 스트림의 중계 연산 중 하나인 sorted에 대해 이해하고 사용할 수 있다.
        * Stream<T> sorted();
        * Stream<T> sorted(Comparator<? super T> comparator);
        * 인자 없이 호출할 경우 오름차순으로 자동 정렬한다. 별도의 비교 로직을 구현하고 싶으면 comparator를 인자로 넘겨준다.
        * */

        List<Integer> integerList = IntStream.of(5, 10, 99, 2, 1, 35)
                .boxed()
                .sorted((a, b) -> b - a)   //내림차순 람다식
                .collect(Collectors.toList());

        System.out.println("integerList = " + integerList);
    }
}
