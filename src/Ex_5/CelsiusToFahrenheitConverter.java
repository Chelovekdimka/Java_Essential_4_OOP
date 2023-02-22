package Ex_5;

public class CelsiusToFahrenheitConverter implements Converter{
    @Override
    public double convert (double temperature){
        return temperature * 1.8 + 32;
    }
}
