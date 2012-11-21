package org.bm.modules.shared;

import java.util.Collection;

public interface IComponentContainer {
    IWindowsManager getWindowManager();

    void setWindowManager(IWindowsManager wm);

    Collection<IModule> getModulesList();
}
