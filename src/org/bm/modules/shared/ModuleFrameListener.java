package org.bm.modules.shared;

import java.util.EventListener;


public interface ModuleFrameListener extends EventListener {
   public void windowAdded(ModuleFrame frame);

   public void windowRemoved(ModuleFrame frame);
}
