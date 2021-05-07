/**
 * Write an abstract class TVDevice which will be implementing interfaces Volume and Device and has the fields String
 *  modelName and boolean isOn (Tip: You don't need to implement methods from the interface if your class is abstract).
 */

abstract class TVDevice implements Volume, Device {
    protected String modelName;
    protected boolean isOn = false;
}
