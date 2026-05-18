package org.apache.tika.metadata.writefilter;

import java.io.Serializable;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface MetadataWriteFilter extends Serializable {
    void add(String str, String str2, Map map);

    void filterExisting(Map map);

    void set(String str, String str2, Map map);
}
