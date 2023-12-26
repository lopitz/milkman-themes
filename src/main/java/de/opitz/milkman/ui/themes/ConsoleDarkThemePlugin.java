package de.opitz.milkman.ui.themes;

import milkman.ui.plugin.UiThemePlugin;

public class ConsoleDarkThemePlugin implements UiThemePlugin {
    @Override
    public String getName() {
        return "Console Dark";
    }

    @Override
    public String getMainCss() {
        return "/themes/console-dark.css";
    }

    @Override
    public String getCodeCss() {
        return "/themes/console-dark-syntax.css";
    }
}
