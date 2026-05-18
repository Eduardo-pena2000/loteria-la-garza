package org.apache.tika.metadata.filter;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class NoOpFilter extends MetadataFilter {
    public static final NoOpFilter NOOP_FILTER = new NoOpFilter();

    public void filter(Metadata metadata) throws TikaException {
    }
}
