// License: GPL. For details, see LICENSE file.
package uberterracer;

import org.openstreetmap.josm.gui.MainApplication;
import org.openstreetmap.josm.gui.MainMenu;
import org.openstreetmap.josm.plugins.Plugin;
import org.openstreetmap.josm.plugins.PluginInformation;

/**
 * Plugin interface implementation for UberTerracer.
 *
 * @author derick - Copyright 2024
 * @author zere - Copyright 2009 CloudMade Ltd
 */
public class UberTerracerPlugin extends Plugin {
    public UberTerracerPlugin(PluginInformation info) {
        super(info);

        MainMenu.add(MainApplication.getMenu().moreToolsMenu, new UberTerracerAction());
        MainMenu.add(MainApplication.getMenu().moreToolsMenu, new ReverseTerraceAction());
    }
}
