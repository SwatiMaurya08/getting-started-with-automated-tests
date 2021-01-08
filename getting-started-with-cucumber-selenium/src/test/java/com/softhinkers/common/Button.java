package com.softhinkers.common;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.common
 * @date 1/7/2021
 */
public enum Button {
    LOGIN("login"),
    SUBMIT("submit"),
    PROJECTS("projects"),
    ANDROID("android");

    String name;

    Button(String button) {
        this.name = button;
    }

    public static Button getButtonEnum(String button) {
        for (Button buttons : Button.values()) {
            if (button.toLowerCase().equals(buttons.name().toLowerCase())) {
                return buttons;
            }
        }
        return null;
    }

    public static String getButtonName(Button button) {
        return button.name();
    }

}
