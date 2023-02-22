//Напишіть на ConverterTemperature клас для конвертації з градусів за Цельсієм в Кельвіни,
//        Фаренгейти. У класу має бути метод convert, який робить конвертацію.

package Ex_5;

public class ConverterTemperature{
    public static void main(String[] args) {
        double celsius = 25.0;
        Converter kelvinConverter = new CelsiusToKelvinConverter();
        double kelvin = kelvinConverter.convert(celsius);
        System.out.println(kelvin);
        Converter fahrenheitConverter = new CelsiusToFahrenheitConverter();
        double fahr = fahrenheitConverter.convert(celsius);
        System.out.println(fahr);


    }
}
