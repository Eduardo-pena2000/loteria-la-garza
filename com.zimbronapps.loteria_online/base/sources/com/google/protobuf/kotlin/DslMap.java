package com.google.protobuf.kotlin;

import Ra.a;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DslMap implements Map, a {
    private final Map delegate;

    @OnlyForUseByGeneratedProtoCode
    public DslMap(Map map) {
        t.g(map, "delegate");
        this.delegate = map;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return this.delegate.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.delegate.containsValue(obj);
    }

    public final /* bridge */ Set entrySet() {
        return getEntries();
    }

    public boolean equals(Object obj) {
        return t.c(this.delegate, obj);
    }

    public Object get(Object obj) {
        return this.delegate.get(obj);
    }

    public Set getEntries() {
        return new UnmodifiableMapEntries(this.delegate.entrySet());
    }

    public Set getKeys() {
        return new UnmodifiableSet(this.delegate.keySet());
    }

    public int getSize() {
        return this.delegate.size();
    }

    public Collection getValues() {
        return new UnmodifiableCollection(this.delegate.values());
    }

    public int hashCode() {
        return this.delegate.hashCode();
    }

    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    public final /* bridge */ Set keySet() {
        return getKeys();
    }

    public Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        return this.delegate.toString();
    }

    public final /* bridge */ Collection values() {
        return getValues();
    }

    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
