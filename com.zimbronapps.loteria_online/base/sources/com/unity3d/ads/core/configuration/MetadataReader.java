package com.unity3d.ads.core.configuration;

import com.unity3d.services.core.misc.JsonStorage;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class MetadataReader {
    private final JsonStorage jsonStorage;
    private final String key;

    public MetadataReader(JsonStorage jsonStorage, String key) {
        t.g(jsonStorage, "jsonStorage");
        t.g(key, "key");
        this.jsonStorage = jsonStorage;
        this.key = key;
    }

    public static /* synthetic */ Object read$default(MetadataReader metadataReader, Object obj, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: read");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        Object obj3 = metadataReader.getJsonStorage().get(metadataReader.getKey());
        if (obj3 == null) {
            return obj;
        }
        t.l(3, "T");
        return obj3;
    }

    public static /* synthetic */ Object readAndDelete$default(MetadataReader metadataReader, Object obj, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readAndDelete");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        Object obj3 = metadataReader.getJsonStorage().get(metadataReader.getKey());
        if (obj3 != null) {
            t.f(obj3, "get(key)");
            t.l(3, "T");
            obj = obj3;
        }
        Object obj4 = metadataReader.getJsonStorage().get(metadataReader.getKey());
        if (obj4 != null) {
            t.f(obj4, "get(key)");
            metadataReader.getJsonStorage().delete(metadataReader.getKey());
        }
        return obj;
    }

    public final JsonStorage getJsonStorage() {
        return this.jsonStorage;
    }

    public final String getKey() {
        return this.key;
    }

    public final /* synthetic */ Object read(Object obj) {
        Object obj2 = getJsonStorage().get(getKey());
        if (obj2 == null) {
            return obj;
        }
        t.l(3, "T");
        return obj2;
    }

    public final /* synthetic */ Object readAndDelete(Object obj) {
        Object obj2 = getJsonStorage().get(getKey());
        if (obj2 != null) {
            t.f(obj2, "get(key)");
            t.l(3, "T");
            obj = obj2;
        }
        Object obj3 = getJsonStorage().get(getKey());
        if (obj3 != null) {
            t.f(obj3, "get(key)");
            getJsonStorage().delete(getKey());
        }
        return obj;
    }
}
