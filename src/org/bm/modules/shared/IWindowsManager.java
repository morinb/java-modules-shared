package org.bm.modules.shared;

import java.util.List;

public interface IWindowsManager {

   List<ModuleFrame> getWindows();

   void removeWindow(ModuleFrame w);

   void addWindow(ModuleFrame w);

   void addModuleFrameListener(ModuleFrameListener moduleFrameListener);

   void setSelectedWindow(ModuleFrame frame);

}
