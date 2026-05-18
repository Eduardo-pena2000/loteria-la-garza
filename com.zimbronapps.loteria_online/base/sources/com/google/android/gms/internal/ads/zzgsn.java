package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgsn extends zzgsq implements NavigableSet {
    final /* synthetic */ zzgsv zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgsn(zzgsv zzgsvVar, NavigableMap navigableMap) {
        super(zzgsvVar, navigableMap);
        Objects.requireNonNull(zzgsvVar);
        this.zzb = zzgsvVar;
    }

    public final Object ceiling(Object obj) {
        return ((SortedMap) this.zzd).ceilingKey(obj);
    }

    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    public final NavigableSet descendingSet() {
        return new zzgsn(this.zzb, ((SortedMap) this.zzd).descendingMap());
    }

    public final Object floor(Object obj) {
        return ((SortedMap) this.zzd).floorKey(obj);
    }

    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    public final Object higher(Object obj) {
        return ((SortedMap) this.zzd).higherKey(obj);
    }

    public final Object lower(Object obj) {
        return ((SortedMap) this.zzd).lowerKey(obj);
    }

    public final Object pollFirst() {
        return zzguy.zza(iterator());
    }

    public final Object pollLast() {
        return zzguy.zza(descendingIterator());
    }

    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    public final /* synthetic */ SortedMap zza() {
        return (SortedMap) this.zzd;
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return new zzgsn(this.zzb, ((SortedMap) this.zzd).headMap(obj, z));
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new zzgsn(this.zzb, ((SortedMap) this.zzd).subMap(obj, z, obj2, z2));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return new zzgsn(this.zzb, ((SortedMap) this.zzd).tailMap(obj, z));
    }
}
