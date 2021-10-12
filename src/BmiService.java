public class BmiService {
    public double calculate(double weight, double height) {
        double index = weight / (height * height);

        return (index);
    }
}
