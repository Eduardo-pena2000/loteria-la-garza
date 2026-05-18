package org.apache.tika.detect;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.config.ServiceLoader;
import org.apache.tika.mime.MimeTypes;
import org.apache.tika.utils.ServiceLoaderUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class DefaultDetector extends CompositeDetector {
    private static final long serialVersionUID = -8170114575326908027L;
    private final transient ServiceLoader loader;

    public DefaultDetector(MimeTypes mimeTypes, ServiceLoader serviceLoader, Collection collection) {
        super(mimeTypes.getMediaTypeRegistry(), getDefaultDetectors(mimeTypes, serviceLoader, collection));
        this.loader = serviceLoader;
    }

    private static List getDefaultDetectors(MimeTypes mimeTypes, ServiceLoader serviceLoader, Collection collection) {
        List loadStaticServiceProviders = serviceLoader.loadStaticServiceProviders(Detector.class, collection);
        ServiceLoaderUtils.sortLoadedClasses(loadStaticServiceProviders);
        Iterator it = loadStaticServiceProviders.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((Detector) it.next()) instanceof OverrideDetector) {
                break;
            }
            i++;
        }
        if (i > -1) {
            loadStaticServiceProviders.add(0, (Detector) loadStaticServiceProviders.remove(i));
        }
        loadStaticServiceProviders.add(mimeTypes);
        return loadStaticServiceProviders;
    }

    public List getDetectors() {
        ServiceLoader serviceLoader = this.loader;
        if (serviceLoader == null || !serviceLoader.isDynamic()) {
            return super.getDetectors();
        }
        List loadDynamicServiceProviders = this.loader.loadDynamicServiceProviders(Detector.class);
        if (loadDynamicServiceProviders.size() <= 0) {
            return super.getDetectors();
        }
        loadDynamicServiceProviders.addAll(super.getDetectors());
        return loadDynamicServiceProviders;
    }

    public DefaultDetector(MimeTypes mimeTypes, ServiceLoader serviceLoader) {
        this(mimeTypes, serviceLoader, Collections.EMPTY_SET);
    }

    public DefaultDetector(MimeTypes mimeTypes, ClassLoader classLoader) {
        this(mimeTypes, new ServiceLoader(classLoader));
    }

    public DefaultDetector(ClassLoader classLoader) {
        this(MimeTypes.getDefaultMimeTypes(), classLoader);
    }

    public DefaultDetector(MimeTypes mimeTypes) {
        this(mimeTypes, new ServiceLoader());
    }

    public DefaultDetector() {
        this(MimeTypes.getDefaultMimeTypes());
    }
}
