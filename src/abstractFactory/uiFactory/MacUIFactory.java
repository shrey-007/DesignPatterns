package abstractFactory.uiFactory;

import abstractFactory.Button;
import abstractFactory.CheckBox;
import abstractFactory.os.mac.MacButton;
import abstractFactory.os.mac.MacCheckBox;

public class MacUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }


    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
