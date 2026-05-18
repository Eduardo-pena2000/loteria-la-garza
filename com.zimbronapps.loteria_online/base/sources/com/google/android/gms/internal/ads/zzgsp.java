package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
class zzgsp extends zzgsi implements SortedMap {
    SortedSet zzd;
    final /* synthetic */ zzgsv zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgsp(zzgsv zzgsvVar, SortedMap sortedMap) {
        super(zzgsvVar, sortedMap);
        Objects.requireNonNull(zzgsvVar);
        this.zze = zzgsvVar;
    }

    public final Comparator comparator() {
        return zzg().comparator();
    }

    public final Object firstKey() {
        return zzg().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new zzgsp(this.zze, zzg().headMap(obj));
    }

    public final Object lastKey() {
        return zzg().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzgsp(this.zze, zzg().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzgsp(this.zze, zzg().tailMap(obj));
    }

    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public SortedSet zzh() {
        return new zzgsq(this.zze, zzg());
    }

    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.zzd;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet zzh = zzh();
        this.zzd = zzh;
        return zzh;
    }

    public SortedMap zzg() {
        return ((zzgsi) this).zza;
    }
}
