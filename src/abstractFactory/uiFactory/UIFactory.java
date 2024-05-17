package abstractFactory.uiFactory;

import abstractFactory.Button;
import abstractFactory.CheckBox;


public interface UIFactory {

    Button createButton();
    CheckBox createCheckBox();
}
