/**
 * 2) Create a new interface "Converter". This interface should have one method "convert(double celsius)".
 *  Provide several implementations of the "Converter" interface like "KelvinConverter" and "FahrenheitConverter"
 *  which convert celsius degrees to kelvins or fahrenheits accordingly.
 */



public class KelvinConverter implements Converter{
    @Override
    public void convert(double celsius) {
        //0 °C + 273,15 = 273,15 K
        System.out.println(celsius +" °C = "+ (celsius + 273.15) + " K");
    }
}
