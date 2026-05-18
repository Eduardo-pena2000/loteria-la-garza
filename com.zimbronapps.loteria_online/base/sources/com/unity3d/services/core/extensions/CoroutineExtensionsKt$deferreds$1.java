package com.unity3d.services.core.extensions;

import cb.W;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CoroutineExtensionsKt$deferreds$1 extends LinkedHashMap {
    public CoroutineExtensionsKt$deferreds$1() {
        super(101);
    }

    public /* bridge */ boolean containsValue(W w) {
        return super.containsValue(w);
    }

    public final /* bridge */ Set entrySet() {
        return getEntries();
    }

    public /* bridge */ Set getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super/*java.util.AbstractMap*/.size();
    }

    public /* bridge */ Collection getValues() {
        return super.values();
    }

    public final /* bridge */ Set keySet() {
        return getKeys();
    }

    public /* bridge */ boolean remove(Object obj, W w) {
        return super/*java.util.HashMap*/.remove(obj, w);
    }

    public boolean removeEldestEntry(Map.Entry eldest) {
        t.g(eldest, "eldest");
        return size() > 100;
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* bridge */ Collection values() {
        return getValues();
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof W) {
            return containsValue((W) obj);
        }
        return false;
    }

    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (obj != null && (obj2 instanceof W)) {
            return remove(obj, (W) obj2);
        }
        return false;
    }
}
