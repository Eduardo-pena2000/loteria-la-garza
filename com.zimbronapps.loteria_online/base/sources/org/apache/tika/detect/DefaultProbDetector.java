package org.apache.tika.detect;

import java.util.List;
import org.apache.tika.config.ServiceLoader;
import org.apache.tika.mime.MimeTypes;
import org.apache.tika.mime.ProbabilisticMimeDetectionSelector;
import org.apache.tika.utils.ServiceLoaderUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class DefaultProbDetector extends CompositeDetector {
    private static final long serialVersionUID = -8836240060532323352L;
    private final transient ServiceLoader loader;

    public DefaultProbDetector(ProbabilisticMimeDetectionSelector probabilisticMimeDetectionSelector, ServiceLoader serviceLoader) {
        super(probabilisticMimeDetectionSelector.getMediaTypeRegistry(), getDefaultDetectors(probabilisticMimeDetectionSelector, serviceLoader));
        this.loader = serviceLoader;
    }

    private static List getDefaultDetectors(ProbabilisticMimeDetectionSelector probabilisticMimeDetectionSelector, ServiceLoader serviceLoader) {
        List loadStaticServiceProviders = serviceLoader.loadStaticServiceProviders(Detector.class);
        ServiceLoaderUtils.sortLoadedClasses(loadStaticServiceProviders);
        loadStaticServiceProviders.add(probabilisticMimeDetectionSelector);
        return loadStaticServiceProviders;
    }

    public List getDetectors() {
        ServiceLoader serviceLoader = this.loader;
        if (serviceLoader == null) {
            return super.getDetectors();
        }
        List loadDynamicServiceProviders = serviceLoader.loadDynamicServiceProviders(Detector.class);
        loadDynamicServiceProviders.addAll(super.getDetectors());
        return loadDynamicServiceProviders;
    }

    public DefaultProbDetector(ProbabilisticMimeDetectionSelector probabilisticMimeDetectionSelector, ClassLoader classLoader) {
        this(probabilisticMimeDetectionSelector, new ServiceLoader(classLoader));
    }

    public DefaultProbDetector(ClassLoader classLoader) {
        this(new ProbabilisticMimeDetectionSelector(), classLoader);
    }

    public DefaultProbDetector(MimeTypes mimeTypes) {
        this(new ProbabilisticMimeDetectionSelector(mimeTypes), new ServiceLoader());
    }

    public DefaultProbDetector() {
        this(MimeTypes.getDefaultMimeTypes());
    }
}
