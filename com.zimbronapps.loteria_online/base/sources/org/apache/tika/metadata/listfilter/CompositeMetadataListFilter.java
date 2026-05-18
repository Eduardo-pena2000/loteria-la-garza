package org.apache.tika.metadata.listfilter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.exception.TikaException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class CompositeMetadataListFilter extends MetadataListFilter {
    private List filters;

    public CompositeMetadataListFilter() {
        this.filters = new ArrayList();
    }

    public List filter(List list) throws TikaException {
        Iterator it = this.filters.iterator();
        while (it.hasNext()) {
            list = ((MetadataListFilter) it.next()).filter(list);
        }
        return list;
    }

    public List getFilters() {
        return this.filters;
    }

    public void setFilters(List list) {
        this.filters.clear();
        this.filters.addAll(list);
    }

    public String toString() {
        return "CompositeMetadataListFilter{filters=" + String.valueOf(this.filters) + "}";
    }

    public CompositeMetadataListFilter(List list) {
        this.filters = list;
    }
}
