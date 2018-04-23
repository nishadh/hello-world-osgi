package com.warycoder.examples.osgi.helloworld;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Created by nishadh on 23/04/18.
 */
public class Activator implements BundleActivator {

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println("Hello World!");
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("Goodbye!");
    }
}
