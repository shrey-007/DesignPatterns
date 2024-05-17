package abstractFactory.uiFactory;

import abstractFactory.Button;
import abstractFactory.CheckBox;
import abstractFactory.os.win.WinButton;
import abstractFactory.os.win.WinCheckBox;


public class WinUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
