package org.example;

import org.withor.modding.CubePlugin;
import org.withor.modding.ThemeLoader;

public class Main implements CubePlugin {

    @Override
    public void onLoad() {

        ThemeLoader.registerTheme("test", new TestTheme());

    }
}