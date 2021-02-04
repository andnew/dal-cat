package org.dal.cat.plexus.build;

import org.dal.cat.plexus.impl.HelloWorldImpl3;
import org.unidal.lookup.configuration.AbstractResourceConfigurator;
import org.unidal.lookup.configuration.Component;

import java.util.ArrayList;
import java.util.List;

public class DalCatConfigurator extends AbstractResourceConfigurator {

    @Override
    public List<Component> defineComponents() {

        List<Component> all = new ArrayList<Component>();

        all.add(A(HelloWorldImpl3.class));

        return all;
    }
}
