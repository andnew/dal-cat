package org.dal.cat.module;

import org.unidal.initialization.AbstractModule;
import org.unidal.initialization.Module;
import org.unidal.initialization.ModuleContext;
import org.unidal.lookup.annotation.Named;
import org.unidal.lookup.logging.LoggerManager;

@Named(type = Module.class, value = DatHomeModule.ID)
public class DatHomeModule extends AbstractModule {
    public static final String ID = "dat-home";

    @Override
    protected void execute(ModuleContext ctx) throws Exception {
        ctx.lookup(LoggerManager.class);
    }

    @Override
    public Module[] getDependencies(ModuleContext ctx) {
        return null;
    }
}
