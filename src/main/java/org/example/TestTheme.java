package org.example;

import org.withor.modding.Theme;

import java.awt.*;

public class TestTheme implements Theme {

    @Override
    public Font getFontGeneralUI() {
        return new Font("Segoe UI", Font.PLAIN, 20);
    }

    @Override
    public Color getColorOutline() {
        return new Color(66, 250, 150);
    }

    @Override
    public Color getColorBackground() {
        return new Color(37, 250, 61);
    }

    @Override
    public Color getColorInteractive() {
        return new Color(66, 250, 150);
    }

    @Override
    public Color getColorInteractiveDarker() {
        return new Color(50, 250, 114);
    }

    @Override
    public Color getOffwhite() {
        return new Color(229, 229, 229);
    }

    @Override
    public String getButtonTextLogin() {
        return "Войти";
    }

    @Override
    public String getButtonSelectFolder() {
        return "Выбрать путь установки";
    }

    @Override
    public String getButtonTextPlay() {
        return "Играть";
    }

    @Override
    public String getPlaceholderTextUsername() {
        return "Ник";
    }

    @Override
    public String getPlaceholderTextPassword() {
        return "Пароль";
    }

    @Override
    public String getBackText() {
        return "← Вернутся";
    }

    @Override
    public String getButtonLogout() {
        return "Выйти";
    }

    @Override
    public String getToggleHideAfterLaunch() {
        return "Закрыть лаунчер после запуска";
    }

    @Override
    public String getLoginWrongText() {
        return "Неверный ник или пароль";
    }

    @Override
    public int getRoundness() {
        return 8;
    }

    @Override
    public String getPluginsEnabled() {
        return "Плагины";
    }
}