package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
class zzgtc extends AbstractCollection {
    final Collection zza;
    final zzgrd zzb;

    public zzgtc(Collection collection, zzgrd zzgrdVar) {
        this.zza = collection;
        this.zzb = zzgrdVar;
    }

    public final boolean add(Object obj) {
        zzgrc.zza(this.zzb.zza(obj));
        return this.zza.add(obj);
    }

    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zzgrc.zza(this.zzb.zza(it.next()));
        }
        return this.zza.addAll(collection);
    }

    public final void clear() {
        zzgut.zza(this.zza, this.zzb);
    }

    public final boolean contains(Object obj) {
        if (zzgtd.zza(this.zza, obj)) {
            return this.zzb.zza(obj);
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        zzgrd zzgrdVar = this.zzb;
        Iterator it = this.zza.iterator();
        zzgrc.zzk(zzgrdVar, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (zzgrdVar.zza(it.next())) {
                return i == -1;
            }
            i++;
        }
        return true;
    }

    public final Iterator iterator() {
        Iterator it = this.zza.iterator();
        it.getClass();
        zzgrd zzgrdVar = this.zzb;
        zzgrdVar.getClass();
        return new zzguu(it, zzgrdVar);
    }

    public final boolean remove(Object obj) {
        return contains(obj) && this.zza.remove(obj);
    }

    public final boolean removeAll(Collection collection) {
        Iterator it = this.zza.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.zzb.zza(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        Iterator it = this.zza.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.zzb.zza(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        Iterator it = this.zza.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.zzb.zza(it.next())) {
                i++;
            }
        }
        return i;
    }

    public final Object[] toArray() {
        return zzgvf.zza(iterator()).toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        return zzgvf.zza(iterator()).toArray(objArr);
    }
}
