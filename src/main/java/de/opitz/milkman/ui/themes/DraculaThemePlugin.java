package de.opitz.milkman.ui.themes;

import milkman.ui.plugin.UiThemePlugin;

public class DraculaThemePlugin implements UiThemePlugin {
    @Override
    public String getName() {
        return "Dracula";
    }

    @Override
    public String getMainCss() {
        return "/themes/dracula.css";
    }

    @Override
    public String getCodeCss() {
        return "/themes/dracula-syntax.css";
    }
}
