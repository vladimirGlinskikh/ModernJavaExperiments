package kz.zhelezyaka.codeTransfer;

import java.util.Arrays;
import java.util.List;

import static kz.zhelezyaka.codeTransfer.Color.*;

public class Main {
    public static void main(String[] args) {
        FilterApples apples = new FilterApples();

        List<Apple> inventory = Arrays.asList(
                new Apple(GREEN, 50),
                new Apple(GREEN, 120),
                new Apple(RED, 30),
                new Apple(RED, 60),
                new Apple(YELLOW, 160),
                new Apple(YELLOW, 80));

        System.out.println(apples.filterGreenApples(inventory));
        System.out.println(apples.filterHeavyApples(inventory));

        List<Apple> greenApple = apples.filterApples(inventory, FilterApples::isGreenApple);
        System.out.println(greenApple);

        List<Apple> heavyApple = apples.filterApples(inventory, FilterApples::isHeavyApple);
        System.out.println(heavyApple);

        System.out.println("-----------------------------");

        System.out.println(
                apples.filterApples(inventory, (Apple apple) -> GREEN.equals(apple.getColor())));

        System.out.println(
                apples.filterApples(inventory, (Apple apple) -> apple.getWeight() < 90));

        System.out.println(
                apples.filterApples(inventory, (Apple apple) -> apple.getWeight() < 60 ||
                        RED.equals(apple.getColor())));
    }
}
