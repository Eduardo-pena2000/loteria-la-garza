package org.apache.tika.metadata.filter;

import java.util.List;
import org.apache.tika.config.ServiceLoader;
import org.apache.tika.utils.ServiceLoaderUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class DefaultMetadataFilter extends CompositeMetadataFilter {
    public DefaultMetadataFilter(ServiceLoader serviceLoader) {
        super(getDefaultFilters(serviceLoader));
    }

    private static List getDefaultFilters(ServiceLoader serviceLoader) {
        List loadStaticServiceProviders = serviceLoader.loadStaticServiceProviders(MetadataFilter.class);
        ServiceLoaderUtils.sortLoadedClasses(loadStaticServiceProviders);
        return loadStaticServiceProviders;
    }

    public DefaultMetadataFilter(List list) {
        super(list);
    }

    public DefaultMetadataFilter() {
        this(new ServiceLoader());
    }
}
