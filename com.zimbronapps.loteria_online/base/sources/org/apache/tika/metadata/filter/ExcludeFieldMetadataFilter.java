package org.apache.tika.metadata.filter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.tika.config.Field;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ExcludeFieldMetadataFilter extends MetadataFilter {
    private final Set excludeSet;

    public ExcludeFieldMetadataFilter() {
        this(new HashSet());
    }

    public void filter(Metadata metadata) throws TikaException {
        Iterator it = this.excludeSet.iterator();
        while (it.hasNext()) {
            metadata.remove((String) it.next());
        }
    }

    public List getExclude() {
        return new ArrayList(this.excludeSet);
    }

    @Field
    public void setExclude(List list) {
        this.excludeSet.addAll(list);
    }

    public ExcludeFieldMetadataFilter(Set set) {
        this.excludeSet = set;
    }
}
