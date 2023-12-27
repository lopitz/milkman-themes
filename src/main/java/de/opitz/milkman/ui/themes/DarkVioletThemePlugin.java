package de.opitz.milkman.ui.themes;

import milkman.ui.plugin.UiThemePlugin;

public class DarkVioletThemePlugin implements UiThemePlugin {
    @Override
    public String getName() {
        return "Dark Violet";
    }

    @Override
    public String getMainCss() {
        return "/themes/dark-violet.css";
    }

    @Override
    public String getCodeCss() {
        return "/themes/dark-violet-syntax.css";
    }
}
