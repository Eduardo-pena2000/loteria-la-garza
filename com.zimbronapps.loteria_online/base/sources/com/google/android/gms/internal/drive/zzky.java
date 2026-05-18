package com.google.android.gms.internal.drive;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzky extends zziw implements zzkz, RandomAccess {
    private static final zzky zztk;
    private static final zzkz zztl;
    private final List zziu;

    static {
        zzky zzkyVar = new zzky();
        zztk = zzkyVar;
        zzkyVar.zzbp();
        zztl = zzkyVar;
    }

    public zzky() {
        this(10);
    }

    private static String zzf(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzjc ? ((zzjc) obj).zzbt() : zzkm.zze((byte[]) obj);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        zzbq();
        this.zziu.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public final void clear() {
        zzbq();
        this.zziu.clear();
        ((AbstractList) this).modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.zziu.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzjc) {
            zzjc zzjcVar = (zzjc) obj;
            String zzbt = zzjcVar.zzbt();
            if (zzjcVar.zzbu()) {
                this.zziu.set(i, zzbt);
            }
            return zzbt;
        }
        byte[] bArr = (byte[]) obj;
        String zze = zzkm.zze(bArr);
        if (zzkm.zzd(bArr)) {
            this.zziu.set(i, zze);
        }
        return zze;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        zzbq();
        return zzf(this.zziu.set(i, (String) obj));
    }

    public final int size() {
        return this.zziu.size();
    }

    public final Object zzao(int i) {
        return this.zziu.get(i);
    }

    public final /* bridge */ /* synthetic */ boolean zzbo() {
        return super.zzbo();
    }

    public final List zzdr() {
        return Collections.unmodifiableList(this.zziu);
    }

    public final zzkz zzds() {
        return zzbo() ? new zzna(this) : this;
    }

    public final /* synthetic */ zzkp zzr(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.zziu);
        return new zzky(arrayList);
    }

    public zzky(int i) {
        this(new ArrayList(i));
    }

    public final boolean addAll(int i, Collection collection) {
        zzbq();
        if (collection instanceof zzkz) {
            collection = ((zzkz) collection).zzdr();
        }
        boolean addAll = this.zziu.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public final /* synthetic */ Object remove(int i) {
        zzbq();
        Object remove = this.zziu.remove(i);
        ((AbstractList) this).modCount++;
        return zzf(remove);
    }

    private zzky(ArrayList arrayList) {
        this.zziu = arrayList;
    }
}
