package com.google.android.gms.internal.fido;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzck extends zzcf implements NavigableSet, zzda {
    final transient Comparator zza;
    transient zzck zzb;

    public zzck(Comparator comparator) {
        this.zza = comparator;
    }

    public static zzcv zzs(Comparator comparator) {
        if (zzcq.zza.equals(comparator)) {
            return zzcv.zzc;
        }
        int i = zzcc.zzd;
        return new zzcv(zzct.zza, comparator);
    }

    @Deprecated
    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Object ceiling(Object obj) {
        obj.getClass();
        return zzcl.zza(zzr(obj, true), null);
    }

    public final Comparator comparator() {
        return this.zza;
    }

    public Object first() {
        return iterator().next();
    }

    public Object floor(Object obj) {
        obj.getClass();
        return zzcn.zza(zzo(obj, true).descendingIterator(), null);
    }

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    public final /* synthetic */ SortedSet headSet(Object obj) {
        obj.getClass();
        return zzo(obj, false);
    }

    public Object higher(Object obj) {
        obj.getClass();
        return zzcl.zza(zzr(obj, false), null);
    }

    public Object last() {
        return descendingIterator().next();
    }

    public Object lower(Object obj) {
        obj.getClass();
        return zzcn.zza(zzo(obj, false).descendingIterator(), null);
    }

    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final /* synthetic */ SortedSet tailSet(Object obj) {
        obj.getClass();
        return zzr(obj, true);
    }

    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public abstract zzdc iterator();

    public abstract zzck zzf();

    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final zzck descendingSet() {
        zzck zzckVar = this.zzb;
        if (zzckVar != null) {
            return zzckVar;
        }
        zzck zzf = zzf();
        this.zzb = zzf;
        zzf.zzb = this;
        return zzf;
    }

    public abstract zzck zzo(Object obj, boolean z);

    /* renamed from: zzp, reason: merged with bridge method [inline-methods] */
    public final zzck subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        zzbm.zzc(this.zza.compare(obj, obj2) <= 0);
        return zzq(obj, z, obj2, z2);
    }

    public abstract zzck zzq(Object obj, boolean z, Object obj2, boolean z2);

    public abstract zzck zzr(Object obj, boolean z);

    /* renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public abstract zzdc descendingIterator();

    public final /* synthetic */ NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        return zzo(obj, z);
    }

    public final /* synthetic */ NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        return zzr(obj, z);
    }
}
