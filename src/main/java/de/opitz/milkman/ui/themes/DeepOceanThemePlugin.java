package de.opitz.milkman.ui.themes;

import milkman.ui.plugin.UiThemePlugin;

public class DeepOceanThemePlugin implements UiThemePlugin {
    @Override
    public String getName() {
        return "Deep Ocean";
    }

    @Override
    public String getMainCss() {
        return "/themes/deep-ocean.css";
    }

    @Override
    public String getCodeCss() {
        return "/themes/deep-ocean-syntax.css";
    }
}
