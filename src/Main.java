public class Main {
    public static void main(String[] args) {
        BodyMassIndexService bmi = new BodyMassIndexService();
        String myIndex = bmi.calculate(1.93f, 100);
        System.out.println(myIndex);

        String myIndex2 = bmi.calculate(1.93f, 50);
        System.out.println(myIndex2);
    }

}
