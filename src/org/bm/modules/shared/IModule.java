package org.bm.modules.shared;

import javax.swing.KeyStroke;

public interface IModule {
    int MENU_FILE = 0;

    int MENU_OPTIONS = 1;

    int MENU_WINDOWS = 2;

    int MENU_HELP = 3;

    void attach();

    void deattach();

    int getMenuIndex();

    int getMenuItemIndex();

    String getName();

    boolean hasMnemonic();

    int getMnemonic();

    boolean hasAccelerator();

    KeyStroke getAccelerator();

    ModuleFrame getModuleFrame();

    String toString();
}
