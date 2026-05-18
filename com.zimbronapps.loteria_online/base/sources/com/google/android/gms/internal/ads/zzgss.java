package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
class zzgss extends AbstractCollection {
    final Object zza;
    Collection zzb;
    final zzgss zzc;
    final Collection zzd;
    final /* synthetic */ zzgsv zze;

    public zzgss(zzgsv zzgsvVar, Object obj, Collection collection, zzgss zzgssVar) {
        Objects.requireNonNull(zzgsvVar);
        this.zze = zzgsvVar;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzgssVar;
        this.zzd = zzgssVar == null ? null : zzgssVar.zzb;
    }

    public final boolean add(Object obj) {
        zza();
        boolean isEmpty = this.zzb.isEmpty();
        boolean add = this.zzb.add(obj);
        if (add) {
            zzgsv zzgsvVar = this.zze;
            zzgsvVar.zzq(zzgsvVar.zzp() + 1);
            if (isEmpty) {
                zzc();
                return true;
            }
        }
        return add;
    }

    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.zzb.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.zzb.size();
        zzgsv zzgsvVar = this.zze;
        zzgsvVar.zzq(zzgsvVar.zzp() + (size2 - size));
        if (size != 0) {
            return addAll;
        }
        zzc();
        return true;
    }

    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.zzb.clear();
        zzgsv zzgsvVar = this.zze;
        zzgsvVar.zzq(zzgsvVar.zzp() - size);
        zzb();
    }

    public final boolean contains(Object obj) {
        zza();
        return this.zzb.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        zza();
        return this.zzb.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zza();
        return this.zzb.equals(obj);
    }

    public final int hashCode() {
        zza();
        return this.zzb.hashCode();
    }

    public final Iterator iterator() {
        zza();
        return new zzgsr(this);
    }

    public final boolean remove(Object obj) {
        zza();
        boolean remove = this.zzb.remove(obj);
        if (remove) {
            this.zze.zzq(r0.zzp() - 1);
            zzb();
        }
        return remove;
    }

    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.zzb.removeAll(collection);
        if (removeAll) {
            int size2 = this.zzb.size();
            zzgsv zzgsvVar = this.zze;
            zzgsvVar.zzq(zzgsvVar.zzp() + (size2 - size));
            zzb();
        }
        return removeAll;
    }

    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.zzb.retainAll(collection);
        if (retainAll) {
            int size2 = this.zzb.size();
            zzgsv zzgsvVar = this.zze;
            zzgsvVar.zzq(zzgsvVar.zzp() + (size2 - size));
            zzb();
        }
        return retainAll;
    }

    public final int size() {
        zza();
        return this.zzb.size();
    }

    public final String toString() {
        zza();
        return this.zzb.toString();
    }

    public final void zza() {
        zzgss zzgssVar = this.zzc;
        if (zzgssVar != null) {
            zzgssVar.zza();
            if (zzgssVar.zzb != this.zzd) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.zzb.isEmpty()) {
            zzgsv zzgsvVar = this.zze;
            Collection collection = (Collection) zzgsvVar.zzo().get(this.zza);
            if (collection != null) {
                this.zzb = collection;
            }
        }
    }

    public final void zzb() {
        zzgss zzgssVar = this.zzc;
        if (zzgssVar != null) {
            zzgssVar.zzb();
        } else if (this.zzb.isEmpty()) {
            zzgsv zzgsvVar = this.zze;
            zzgsvVar.zzo().remove(this.zza);
        }
    }

    public final void zzc() {
        zzgss zzgssVar = this.zzc;
        if (zzgssVar != null) {
            zzgssVar.zzc();
            return;
        }
        zzgsv zzgsvVar = this.zze;
        zzgsvVar.zzo().put(this.zza, this.zzb);
    }
}
