package org.apache.tika.metadata.filter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class CompositeMetadataFilter extends MetadataFilter {
    private List filters;

    public CompositeMetadataFilter() {
        this.filters = new ArrayList();
    }

    public void filter(Metadata metadata) throws TikaException {
        Iterator it = this.filters.iterator();
        while (it.hasNext()) {
            ((MetadataFilter) it.next()).filter(metadata);
        }
    }

    public List getFilters() {
        return this.filters;
    }

    public void setFilters(List list) {
        this.filters.clear();
        this.filters.addAll(list);
    }

    public String toString() {
        return "CompositeMetadataFilter{filters=" + String.valueOf(this.filters) + "}";
    }

    public CompositeMetadataFilter(List list) {
        this.filters = list;
    }
}
