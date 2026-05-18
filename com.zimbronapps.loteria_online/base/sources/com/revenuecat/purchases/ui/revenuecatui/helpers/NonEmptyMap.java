package com.revenuecat.purchases.ui.revenuecatui.helpers;

import Ca.q;
import Ca.x;
import Da.D;
import Da.Q;
import Da.S;
import Qa.l;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class NonEmptyMap implements Map, Ra.a {
    public static final int $stable = 8;
    private final Map all;
    private final Map.Entry entry;
    private final NonEmptySet keys;

    private NonEmptyMap(Map.Entry entry, Map map) {
        this.entry = entry;
        this.all = map;
        this.keys = new NonEmptySet(entry.getKey(), map.keySet());
    }

    public static final /* synthetic */ Map access$getAll$p(NonEmptyMap nonEmptyMap) {
        return nonEmptyMap.all;
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
        return this.all.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.all.containsValue(obj);
    }

    public final /* bridge */ Set entrySet() {
        return getEntries();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof NonEmptyMap)) {
            return t.c(this.all, obj);
        }
        NonEmptyMap nonEmptyMap = (NonEmptyMap) obj;
        return t.c(this.entry, nonEmptyMap.entry) && t.c(this.all, nonEmptyMap.all);
    }

    public Object get(Object obj) {
        return this.all.get(obj);
    }

    public Set getEntries() {
        return this.all.entrySet();
    }

    public final /* synthetic */ Map.Entry getEntry() {
        return this.entry;
    }

    public NonEmptySet getKeys() {
        return this.keys;
    }

    public int getSize() {
        return this.all.size();
    }

    public Collection getValues() {
        return this.all.values();
    }

    public int hashCode() {
        return this.all.hashCode();
    }

    public /* synthetic */ boolean isEmpty() {
        return false;
    }

    public final /* bridge */ NonEmptySet keySet() {
        return getKeys();
    }

    public final /* synthetic */ NonEmptyMap mapKeys(l transform) {
        t.g(transform, "transform");
        Object invoke = transform.invoke(getEntry());
        Map access$getAll$p = access$getAll$p(this);
        LinkedHashMap linkedHashMap = new LinkedHashMap(Q.e(access$getAll$p.size()));
        for (Map.Entry entry : access$getAll$p.entrySet()) {
            linkedHashMap.put(t.c(entry.getKey(), getEntry().getKey()) ? invoke : transform.invoke(entry), entry.getValue());
        }
        return NonEmptyMapKt.nonEmptyMapOf(x.a(invoke, S.i(linkedHashMap, invoke)), (Map) linkedHashMap);
    }

    public final /* synthetic */ NonEmptyMap mapValues(l transform) {
        t.g(transform, "transform");
        Map access$getAll$p = access$getAll$p(this);
        LinkedHashMap linkedHashMap = new LinkedHashMap(Q.e(access$getAll$p.size()));
        for (Object obj : access$getAll$p.entrySet()) {
            linkedHashMap.put(((Map.Entry) obj).getKey(), transform.invoke(obj));
        }
        return NonEmptyMapKt.nonEmptyMapOf(x.a(getEntry().getKey(), S.i(linkedHashMap, getEntry().getKey())), (Map) linkedHashMap);
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

    public final /* synthetic */ Map toMap() {
        return this.all;
    }

    public String toString() {
        return "NonEmptyMap(" + D.n0(this.all.entrySet(), null, null, null, 0, null, null, 63, null) + ')';
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NonEmptyMap(q entry, Map tail) {
        this((Map.Entry) D.e0(Q.f(entry).entrySet()), S.q(tail, entry));
        t.g(entry, "entry");
        t.g(tail, "tail");
    }
}
