public class GoodDoor extends Door{
    boolean keypad = false;
    String code = "";

    void Door( int hinges, int handle, double height,
                      double width, double thickness, boolean keyhole,
                      String material, String type, boolean keypad, String code,
               boolean emergencyHandle, boolean hinged) {
        this.hinges = hinges;
        this.handle = handle;
        this.height = height;
        this.width = width;
        this.thickness = thickness;
        this.keyhole = keyhole;
        this.material = material;
        this.type = type;
        this.emergencyHandle = emergencyHandle;
        this.hinged = hinged;
        this.keypad = keypad;
        this.code = code;
    }

    void Door(){};
}
