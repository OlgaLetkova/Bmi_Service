public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bodyMassIndex =service.calculate(73,1.7f);
        System.out.println(bodyMassIndex);
    }
}
