package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
class zzgsq extends zzgsl implements SortedSet {
    final /* synthetic */ zzgsv zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgsq(zzgsv zzgsvVar, SortedMap sortedMap) {
        super(zzgsvVar, sortedMap);
        Objects.requireNonNull(zzgsvVar);
        this.zzc = zzgsvVar;
    }

    public final Comparator comparator() {
        return zza().comparator();
    }

    public final Object first() {
        return zza().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new zzgsq(this.zzc, zza().headMap(obj));
    }

    public final Object last() {
        return zza().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new zzgsq(this.zzc, zza().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new zzgsq(this.zzc, zza().tailMap(obj));
    }

    public SortedMap zza() {
        return this.zzd;
    }
}
