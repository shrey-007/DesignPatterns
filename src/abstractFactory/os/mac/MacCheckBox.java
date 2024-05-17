package abstractFactory.os.mac;

import abstractFactory.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Mac Checkbox");
    }
}
