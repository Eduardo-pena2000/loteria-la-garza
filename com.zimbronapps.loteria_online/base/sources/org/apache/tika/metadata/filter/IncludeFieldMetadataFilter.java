package org.apache.tika.metadata.filter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.tika.config.Field;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class IncludeFieldMetadataFilter extends MetadataFilter {
    private final Set includeSet;

    public IncludeFieldMetadataFilter() {
        this(new HashSet());
    }

    public void filter(Metadata metadata) throws TikaException {
        for (String str : metadata.names()) {
            if (!this.includeSet.contains(str)) {
                metadata.remove(str);
            }
        }
    }

    public List getInclude() {
        return new ArrayList(this.includeSet);
    }

    @Field
    public void setInclude(List list) {
        this.includeSet.addAll(list);
    }

    public IncludeFieldMetadataFilter(Set set) {
        this.includeSet = set;
    }
}
