package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
class zzgsu extends zzgss implements List {
    final /* synthetic */ zzgsv zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgsu(zzgsv zzgsvVar, Object obj, List list, zzgss zzgssVar) {
        super(zzgsvVar, obj, list, zzgssVar);
        Objects.requireNonNull(zzgsvVar);
        this.zzf = zzgsvVar;
    }

    public final void add(int i, Object obj) {
        zza();
        boolean isEmpty = this.zzb.isEmpty();
        this.zzb.add(i, obj);
        zzgsv zzgsvVar = this.zzf;
        zzgsvVar.zzq(zzgsvVar.zzp() + 1);
        if (isEmpty) {
            zzc();
        }
    }

    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.zzb.addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.zzb.size();
        zzgsv zzgsvVar = this.zzf;
        zzgsvVar.zzq(zzgsvVar.zzp() + (size2 - size));
        if (size != 0) {
            return addAll;
        }
        zzc();
        return true;
    }

    public final Object get(int i) {
        zza();
        return this.zzb.get(i);
    }

    public final int indexOf(Object obj) {
        zza();
        return this.zzb.indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        zza();
        return this.zzb.lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        zza();
        return new zzgst(this);
    }

    public final Object remove(int i) {
        zza();
        Object remove = this.zzb.remove(i);
        this.zzf.zzq(r0.zzp() - 1);
        zzb();
        return remove;
    }

    public final Object set(int i, Object obj) {
        zza();
        return this.zzb.set(i, obj);
    }

    public final List subList(int i, int i2) {
        zza();
        List subList = this.zzb.subList(i, i2);
        zzgss zzgssVar = this.zzc;
        if (zzgssVar == null) {
            zzgssVar = this;
        }
        return this.zzf.zzg(this.zza, subList, zzgssVar);
    }

    public final ListIterator listIterator(int i) {
        zza();
        return new zzgst(this, i);
    }
}
