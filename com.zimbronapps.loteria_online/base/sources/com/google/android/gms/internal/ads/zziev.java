package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zziev implements Map, Ra.a {
    private final Map zza;

    public zziev(Map map) {
        kotlin.jvm.internal.t.g(map, "delegate");
        this.zza = map;
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsKey(Object obj) {
        return this.zza.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        return this.zza.containsValue(obj);
    }

    public final /* bridge */ Set entrySet() {
        return new zziez(this.zza.entrySet());
    }

    public final boolean equals(Object obj) {
        return kotlin.jvm.internal.t.c(this.zza, obj);
    }

    public final Object get(Object obj) {
        return this.zza.get(obj);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    public final /* bridge */ Set keySet() {
        return new zzifb(this.zza.keySet());
    }

    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return this.zza.size();
    }

    public final String toString() {
        return this.zza.toString();
    }

    public final /* bridge */ Collection values() {
        return new zziew(this.zza.values());
    }

    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
