package org.apache.tika.extractor;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.config.ServiceLoader;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.utils.ServiceLoaderUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class DefaultEmbeddedStreamTranslator implements EmbeddedStreamTranslator {
    final List translators;

    public DefaultEmbeddedStreamTranslator() {
        this(getDefaultFilters(new ServiceLoader()));
    }

    private static List getDefaultFilters(ServiceLoader serviceLoader) {
        List loadServiceProviders = serviceLoader.loadServiceProviders(EmbeddedStreamTranslator.class);
        ServiceLoaderUtils.sortLoadedClasses(loadServiceProviders);
        return loadServiceProviders;
    }

    public boolean shouldTranslate(InputStream inputStream, Metadata metadata) throws IOException {
        Iterator it = this.translators.iterator();
        while (it.hasNext()) {
            if (((EmbeddedStreamTranslator) it.next()).shouldTranslate(inputStream, metadata)) {
                return true;
            }
        }
        return false;
    }

    public InputStream translate(InputStream inputStream, Metadata metadata) throws IOException {
        Iterator it = this.translators.iterator();
        while (it.hasNext()) {
            InputStream translate = ((EmbeddedStreamTranslator) it.next()).translate(inputStream, metadata);
            if (translate != null) {
                return translate;
            }
        }
        return inputStream;
    }

    private DefaultEmbeddedStreamTranslator(List list) {
        this.translators = list;
    }
}
