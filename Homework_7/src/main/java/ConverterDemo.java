public class ConverterDemo {

    public static void convert (Converter converter, double celsius) {
        converter.convert(celsius);
    }

    public static void main(String[] args) {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        KelvinConverter kelvinConverter = new KelvinConverter();

        convert(fahrenheitConverter, 10);
        convert(kelvinConverter, 5);
    }
}
