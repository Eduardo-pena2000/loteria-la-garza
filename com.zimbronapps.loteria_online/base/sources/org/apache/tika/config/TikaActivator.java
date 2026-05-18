package org.apache.tika.config;

import org.apache.tika.detect.Detector;
import org.apache.tika.parser.Parser;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class TikaActivator implements BundleActivator, ServiceTrackerCustomizer {
    private BundleContext bundleContext;
    private ServiceTracker detectorTracker;
    private ServiceTracker parserTracker;

    public Object addingService(ServiceReference serviceReference) {
        Object property = serviceReference.getProperty("service.ranking");
        int intValue = property instanceof Integer ? ((Integer) property).intValue() : 0;
        Object service = this.bundleContext.getService(serviceReference);
        ServiceLoader.addService(serviceReference, service, intValue);
        return service;
    }

    public void modifiedService(ServiceReference serviceReference, Object obj) {
    }

    public void removedService(ServiceReference serviceReference, Object obj) {
        ServiceLoader.removeService(serviceReference);
        this.bundleContext.ungetService(serviceReference);
    }

    public void start(BundleContext bundleContext) throws Exception {
        this.bundleContext = bundleContext;
        this.detectorTracker = new ServiceTracker(bundleContext, Detector.class.getName(), this);
        this.parserTracker = new ServiceTracker(bundleContext, Parser.class.getName(), this);
        this.detectorTracker.open();
        this.parserTracker.open();
    }

    public void stop(BundleContext bundleContext) throws Exception {
        this.parserTracker.close();
        this.detectorTracker.close();
    }
}
