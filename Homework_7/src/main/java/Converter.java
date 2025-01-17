/**
 * 2) Create a new interface "Converter". This interface should have one method "convert(double celsius)".
 *  Provide several implementations of the "Converter" interface like "KelvinConverter" and "FahrenheitConverter"
 *  which convert celsius degrees to kelvins or fahrenheits accordingly.
 */


public interface Converter {
    void convert(double celsius);
}
