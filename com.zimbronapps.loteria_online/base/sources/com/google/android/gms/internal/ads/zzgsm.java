package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgsm extends zzgsp implements NavigableMap {
    final /* synthetic */ zzgsv zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgsm(zzgsv zzgsvVar, NavigableMap navigableMap) {
        super(zzgsvVar, navigableMap);
        Objects.requireNonNull(zzgsvVar);
        this.zzc = zzgsvVar;
    }

    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = ((SortedMap) ((zzgsi) this).zza).ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return zzb(ceilingEntry);
    }

    public final Object ceilingKey(Object obj) {
        return ((SortedMap) ((zzgsi) this).zza).ceilingKey(obj);
    }

    public final NavigableSet descendingKeySet() {
        return super.keySet();
    }

    public final NavigableMap descendingMap() {
        return new zzgsm(this.zzc, ((SortedMap) ((zzgsi) this).zza).descendingMap());
    }

    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = ((SortedMap) ((zzgsi) this).zza).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return zzb(firstEntry);
    }

    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = ((SortedMap) ((zzgsi) this).zza).floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return zzb(floorEntry);
    }

    public final Object floorKey(Object obj) {
        return ((SortedMap) ((zzgsi) this).zza).floorKey(obj);
    }

    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = ((SortedMap) ((zzgsi) this).zza).higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return zzb(higherEntry);
    }

    public final Object higherKey(Object obj) {
        return ((SortedMap) ((zzgsi) this).zza).higherKey(obj);
    }

    public final /* synthetic */ Set keySet() {
        return super.keySet();
    }

    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = ((SortedMap) ((zzgsi) this).zza).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return zzb(lastEntry);
    }

    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = ((SortedMap) ((zzgsi) this).zza).lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return zzb(lowerEntry);
    }

    public final Object lowerKey(Object obj) {
        return ((SortedMap) ((zzgsi) this).zza).lowerKey(obj);
    }

    public final NavigableSet navigableKeySet() {
        return super.keySet();
    }

    public final Map.Entry pollFirstEntry() {
        return zzc(entrySet().iterator());
    }

    public final Map.Entry pollLastEntry() {
        return zzc(descendingMap().entrySet().iterator());
    }

    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    public final Map.Entry zzc(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        zzgsv zzgsvVar = this.zzc;
        Collection zzc = zzgsvVar.zzc();
        zzc.addAll((Collection) entry.getValue());
        it.remove();
        return new AbstractMap.SimpleImmutableEntry(entry.getKey(), zzgsvVar.zza(zzc));
    }

    /* renamed from: zzd, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final NavigableSet zzh() {
        return new zzgsn(this.zzc, (SortedMap) ((zzgsi) this).zza);
    }

    public final /* synthetic */ SortedSet zzf() {
        return super.keySet();
    }

    public final /* synthetic */ SortedMap zzg() {
        return (SortedMap) ((zzgsi) this).zza;
    }

    public final NavigableMap headMap(Object obj, boolean z) {
        return new zzgsm(this.zzc, ((SortedMap) ((zzgsi) this).zza).headMap(obj, z));
    }

    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new zzgsm(this.zzc, ((SortedMap) ((zzgsi) this).zza).subMap(obj, z, obj2, z2));
    }

    public final NavigableMap tailMap(Object obj, boolean z) {
        return new zzgsm(this.zzc, ((SortedMap) ((zzgsi) this).zza).tailMap(obj, z));
    }
}
