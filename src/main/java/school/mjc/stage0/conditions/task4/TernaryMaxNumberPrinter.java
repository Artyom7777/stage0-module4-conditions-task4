package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int result;
        result = first >= second ? (first >= third ? first : third) : second;
        System.out.println(result);

    }
}
