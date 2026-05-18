package org.apache.tika.metadata.listfilter;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import org.apache.tika.config.ConfigBase;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.exception.TikaException;
import org.w3c.dom.Element;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class MetadataListFilter extends ConfigBase implements Serializable {
    public static MetadataListFilter load(Element element, boolean z) throws TikaConfigException, IOException {
        try {
            return (MetadataListFilter) ConfigBase.buildComposite("metadataListFilters", CompositeMetadataListFilter.class, "metadataListFilter", MetadataListFilter.class, element);
        } catch (TikaConfigException e) {
            if (z && e.getMessage().contains("could not find metadataListFilters")) {
                return new NoOpListFilter();
            }
            throw e;
        }
    }

    public abstract List filter(List list) throws TikaException;
}
