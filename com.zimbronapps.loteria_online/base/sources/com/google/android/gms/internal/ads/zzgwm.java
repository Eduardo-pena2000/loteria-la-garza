package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgwm extends zzgwl implements SortedSet {
    public zzgwm(SortedSet sortedSet, zzgrd zzgrdVar) {
        super(sortedSet, zzgrdVar);
    }

    public final Comparator comparator() {
        return this.zza.comparator();
    }

    public final Object first() {
        Iterator it = this.zza.iterator();
        it.getClass();
        zzgrd zzgrdVar = this.zzb;
        zzgrdVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (zzgrdVar.zza(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public final SortedSet headSet(Object obj) {
        return new zzgwm(this.zza.headSet(obj), this.zzb);
    }

    public final Object last() {
        SortedSet sortedSet = this.zza;
        while (true) {
            zzgrd zzgrdVar = this.zzb;
            Object last = sortedSet.last();
            if (zzgrdVar.zza(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        return new zzgwm(this.zza.subSet(obj, obj2), this.zzb);
    }

    public final SortedSet tailSet(Object obj) {
        return new zzgwm(this.zza.tailSet(obj), this.zzb);
    }
}
