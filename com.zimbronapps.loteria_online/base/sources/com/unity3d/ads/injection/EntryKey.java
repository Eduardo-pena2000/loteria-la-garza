package com.unity3d.ads.injection;

import Xa.c;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class EntryKey {
    private final c instanceClass;
    private final String named;

    public EntryKey(String named, c instanceClass) {
        t.g(named, "named");
        t.g(instanceClass, "instanceClass");
        this.named = named;
        this.instanceClass = instanceClass;
    }

    public static /* synthetic */ EntryKey copy$default(EntryKey entryKey, String str, c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = entryKey.named;
        }
        if ((i & 2) != 0) {
            cVar = entryKey.instanceClass;
        }
        return entryKey.copy(str, cVar);
    }

    public final String component1() {
        return this.named;
    }

    public final c component2() {
        return this.instanceClass;
    }

    public final EntryKey copy(String named, c instanceClass) {
        t.g(named, "named");
        t.g(instanceClass, "instanceClass");
        return new EntryKey(named, instanceClass);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntryKey)) {
            return false;
        }
        EntryKey entryKey = (EntryKey) obj;
        return t.c(this.named, entryKey.named) && t.c(this.instanceClass, entryKey.instanceClass);
    }

    public final c getInstanceClass() {
        return this.instanceClass;
    }

    public final String getNamed() {
        return this.named;
    }

    public int hashCode() {
        return (this.named.hashCode() * 31) + this.instanceClass.hashCode();
    }

    public String toString() {
        return "EntryKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ')';
    }

    public /* synthetic */ EntryKey(String str, c cVar, int i, k kVar) {
        this((i & 1) != 0 ? "" : str, cVar);
    }
}
