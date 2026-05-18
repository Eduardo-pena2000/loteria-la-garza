package org.apache.tika.detect;

import java.util.Collection;
import org.apache.tika.config.ServiceLoader;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class DefaultEncodingDetector extends CompositeEncodingDetector {
    public DefaultEncodingDetector() {
        this(new ServiceLoader(DefaultEncodingDetector.class.getClassLoader()));
    }

    public DefaultEncodingDetector(ServiceLoader serviceLoader) {
        super(serviceLoader.loadServiceProviders(EncodingDetector.class));
    }

    public DefaultEncodingDetector(ServiceLoader serviceLoader, Collection collection) {
        super(serviceLoader.loadServiceProviders(EncodingDetector.class), collection);
    }
}
