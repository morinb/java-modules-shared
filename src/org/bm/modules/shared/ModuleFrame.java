package org.bm.modules.shared;

import javax.swing.JInternalFrame;

public class ModuleFrame extends JInternalFrame {
   protected IComponentContainer componentContainer;

   public void setComponentContainer(IComponentContainer componentContainer) {
      this.componentContainer = componentContainer;
   }

   public IComponentContainer getComponentContainer() {
      return componentContainer;
   }

   public void initComponents() {}
}
