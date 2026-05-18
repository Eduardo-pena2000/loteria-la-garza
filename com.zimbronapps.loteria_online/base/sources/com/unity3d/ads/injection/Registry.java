package com.unity3d.ads.injection;

import Ca.l;
import Ca.m;
import Ca.x;
import Da.Q;
import Da.S;
import Qa.a;
import fb.P;
import fb.z;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Registry {
    private final z _services = P.a(S.h());

    public static /* synthetic */ EntryKey factory$default(Registry registry, String named, a instance, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        t.g(named, "named");
        t.g(instance, "instance");
        t.l(4, "T");
        EntryKey entryKey = new EntryKey(named, kotlin.jvm.internal.P.b(Object.class));
        registry.add(entryKey, new Factory(instance));
        return entryKey;
    }

    public static /* synthetic */ Object get$default(Registry registry, String named, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        t.g(named, "named");
        t.l(4, "T");
        EntryKey entryKey = new EntryKey(named, kotlin.jvm.internal.P.b(Object.class));
        l lVar = (l) registry.getServices().get(entryKey);
        if (lVar != null) {
            Object value = lVar.getValue();
            t.l(1, "T");
            return value;
        }
        throw new IllegalStateException("No entry found for " + entryKey);
    }

    public static /* synthetic */ Object getOrNull$default(Registry registry, String named, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        t.g(named, "named");
        t.l(4, "T");
        l lVar = (l) registry.getServices().get(new EntryKey(named, kotlin.jvm.internal.P.b(Object.class)));
        if (lVar == null) {
            return null;
        }
        Object value = lVar.getValue();
        t.l(1, "T");
        return value;
    }

    public static /* synthetic */ EntryKey single$default(Registry registry, String named, a instance, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        t.g(named, "named");
        t.g(instance, "instance");
        t.l(4, "T");
        EntryKey entryKey = new EntryKey(named, kotlin.jvm.internal.P.b(Object.class));
        registry.add(entryKey, m.b(instance));
        return entryKey;
    }

    public final void add(EntryKey key, l instance) {
        Object value;
        t.g(key, "key");
        t.g(instance, "instance");
        if (getServices().containsKey(key)) {
            throw new IllegalStateException("Cannot have identical entries.");
        }
        z zVar = this._services;
        do {
            value = zVar.getValue();
        } while (!zVar.e(value, S.r((Map) value, Q.f(x.a(key, instance)))));
    }

    public final /* synthetic */ EntryKey factory(String named, a instance) {
        t.g(named, "named");
        t.g(instance, "instance");
        t.l(4, "T");
        EntryKey entryKey = new EntryKey(named, kotlin.jvm.internal.P.b(Object.class));
        add(entryKey, new Factory(instance));
        return entryKey;
    }

    public final /* synthetic */ Object get(String named) {
        t.g(named, "named");
        t.l(4, "T");
        EntryKey entryKey = new EntryKey(named, kotlin.jvm.internal.P.b(Object.class));
        l lVar = (l) getServices().get(entryKey);
        if (lVar != null) {
            Object value = lVar.getValue();
            t.l(1, "T");
            return value;
        }
        throw new IllegalStateException("No entry found for " + entryKey);
    }

    public final /* synthetic */ Object getOrNull(String named) {
        t.g(named, "named");
        t.l(4, "T");
        l lVar = (l) getServices().get(new EntryKey(named, kotlin.jvm.internal.P.b(Object.class)));
        if (lVar == null) {
            return null;
        }
        Object value = lVar.getValue();
        t.l(1, "T");
        return value;
    }

    public final Map getServices() {
        return (Map) this._services.getValue();
    }

    public final /* synthetic */ EntryKey single(String named, a instance) {
        t.g(named, "named");
        t.g(instance, "instance");
        t.l(4, "T");
        EntryKey entryKey = new EntryKey(named, kotlin.jvm.internal.P.b(Object.class));
        add(entryKey, m.b(instance));
        return entryKey;
    }
}
