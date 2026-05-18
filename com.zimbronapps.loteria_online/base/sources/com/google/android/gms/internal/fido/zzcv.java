package com.google.android.gms.internal.fido;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcv extends zzck {
    static final zzcv zzc;
    final transient zzcc zzd;

    static {
        int i = zzcc.zzd;
        zzc = new zzcv(zzct.zza, zzcq.zza);
    }

    public zzcv(zzcc zzccVar, Comparator comparator) {
        super(comparator);
        this.zzd = zzccVar;
    }

    public final Object ceiling(Object obj) {
        zzcc zzccVar = this.zzd;
        int zzv = zzv(obj, true);
        if (zzv == zzccVar.size()) {
            return null;
        }
        return this.zzd.get(zzv);
    }

    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.zzd, obj, ((zzck) this).zza) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        if (collection instanceof zzcp) {
            collection = ((zzcp) collection).zza();
        }
        if (!zzdb.zza(((zzck) this).zza, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        zzdd listIterator = this.zzd.listIterator(0);
        Iterator it = collection.iterator();
        if (!listIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = listIterator.next();
        while (true) {
            try {
                int compare = ((zzck) this).zza.compare(next2, next);
                if (compare >= 0) {
                    if (compare != 0) {
                        break;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else {
                    if (!listIterator.hasNext()) {
                        return false;
                    }
                    next2 = listIterator.next();
                }
            } catch (NullPointerException | ClassCastException unused) {
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.zzd.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!zzdb.zza(((zzck) this).zza, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            zzdd listIterator = this.zzd.listIterator(0);
            while (listIterator.hasNext()) {
                Object next = listIterator.next();
                Object next2 = it.next();
                if (next2 == null || ((zzck) this).zza.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.zzd.get(0);
    }

    public final Object floor(Object obj) {
        int zzu = zzu(obj, true) - 1;
        if (zzu == -1) {
            return null;
        }
        return this.zzd.get(zzu);
    }

    public final Object higher(Object obj) {
        zzcc zzccVar = this.zzd;
        int zzv = zzv(obj, false);
        if (zzv == zzccVar.size()) {
            return null;
        }
        return this.zzd.get(zzv);
    }

    public final /* synthetic */ Iterator iterator() {
        return this.zzd.listIterator(0);
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.zzd.get(r0.size() - 1);
    }

    public final Object lower(Object obj) {
        int zzu = zzu(obj, false) - 1;
        if (zzu == -1) {
            return null;
        }
        return this.zzd.get(zzu);
    }

    public final int size() {
        return this.zzd.size();
    }

    public final int zza(Object[] objArr, int i) {
        return this.zzd.zza(objArr, 0);
    }

    public final int zzb() {
        return this.zzd.zzb();
    }

    public final int zzc() {
        return this.zzd.zzc();
    }

    public final zzdc zzd() {
        return this.zzd.listIterator(0);
    }

    public final Object[] zze() {
        return this.zzd.zze();
    }

    public final zzck zzf() {
        Comparator reverseOrder = Collections.reverseOrder(((zzck) this).zza);
        return isEmpty() ? zzck.zzs(reverseOrder) : new zzcv(this.zzd.zzf(), reverseOrder);
    }

    public final zzcc zzi() {
        return this.zzd;
    }

    public final zzck zzo(Object obj, boolean z) {
        return zzw(0, zzu(obj, z));
    }

    public final zzck zzq(Object obj, boolean z, Object obj2, boolean z2) {
        return zzr(obj, z).zzo(obj2, z2);
    }

    public final zzck zzr(Object obj, boolean z) {
        return zzw(zzv(obj, z), this.zzd.size());
    }

    /* renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public final zzdc descendingIterator() {
        return this.zzd.zzf().listIterator(0);
    }

    public final int zzu(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.zzd, obj, ((zzck) this).zza);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public final int zzv(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.zzd, obj, ((zzck) this).zza);
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    public final zzcv zzw(int i, int i2) {
        if (i == 0) {
            if (i2 == this.zzd.size()) {
                return this;
            }
            i = 0;
        }
        if (i >= i2) {
            return zzck.zzs(((zzck) this).zza);
        }
        zzcc zzccVar = this.zzd;
        return new zzcv(zzccVar.subList(i, i2), ((zzck) this).zza);
    }
}
