public class Main {
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        simpleCalculator.setFirstNumber(5);
        simpleCalculator.setSecondNumber(4);

        System.out.println(simpleCalculator.getAdditionResult());
        System.out.println(simpleCalculator.getMultiplicationResult());
        System.out.println(simpleCalculator.getSubtractionResult());
        System.out.println(simpleCalculator.getDivisionResult());
    }
}