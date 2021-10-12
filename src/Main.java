public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 64;
        double height = 1.71;
        double index = service.calculate(weight, height);
        
        System.out.println("Индекс массы тела: " + Math.round(index * 100) / 100D);
    }
}
