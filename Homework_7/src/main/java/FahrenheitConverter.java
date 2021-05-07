/**
 * 2) Create a new interface "Converter". This interface should have one method "convert(double celsius)".
 *  Provide several implementations of the "Converter" interface like "KelvinConverter" and "FahrenheitConverter"
 *  which convert celsius degrees to kelvins or fahrenheits accordingly.
 */


public class FahrenheitConverter implements Converter{
    @Override
    public void convert(double celsius) {
        //(1 °C × 9/5) + 32 = 33,8 °F
        System.out.println(celsius +" °C = "+ ((celsius * 9/5) + 32) + " °F");
    }
}
