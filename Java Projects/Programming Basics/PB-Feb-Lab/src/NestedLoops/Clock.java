package NestedLoops;

public class Clock {
    public static void main(String[] args) {
        for (var h = 0; h < 24; h++) {
            for (var m = 0; m < 60; m++) {
                System.out.printf("%d:%d %n", h, m);
            }
        }
    }
}
