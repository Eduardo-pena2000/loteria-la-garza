package org.apache.tika.extractor;

import org.apache.tika.metadata.Metadata;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface EmbeddedBytesSelector {
    public static final EmbeddedBytesSelector ACCEPT_ALL = new AcceptAll();

    public static class AcceptAll implements EmbeddedBytesSelector {
        public boolean select(Metadata metadata) {
            return true;
        }
    }

    boolean select(Metadata metadata);
}
