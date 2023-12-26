package de.opitz.milkman.ui.themes;

import milkman.ui.plugin.UiThemePlugin;

public class GitHubDarkThemePlugin implements UiThemePlugin {
    @Override
    public String getName() {
        return "GitHub Dark";
    }

    @Override
    public String getMainCss() {
        return "/themes/github-dark.css";
    }

    @Override
    public String getCodeCss() {
        return "/themes/github-dark-syntax.css";
    }
}
