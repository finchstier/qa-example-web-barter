package co.getbarter.qa;

import net.thucydides.core.guice.Injectors;
import net.thucydides.core.util.EnvironmentVariables;

public class Properties {
    private static final EnvironmentVariables vars = Injectors.getInjector().getProvider(EnvironmentVariables.class).get();

    public static String getUrl() {
        String url = vars.getProperty("url", "");
        if (!"".equals(url)) return url;

        return url;
    }
}
