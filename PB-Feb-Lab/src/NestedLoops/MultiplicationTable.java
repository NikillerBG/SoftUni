package NestedLoops;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (var i = 1; i <= 10; i++) {
            for (var j = 1; j <= 10; j++) {
                var result = i * j;
                System.out.printf("%d * %d = %d %n", i, j, result);
            }
        }
    }
}
