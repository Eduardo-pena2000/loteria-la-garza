package com.google.android.gms.internal.common;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzaf extends zzah {
    private final transient zzah zza;

    public zzaf(zzah zzahVar) {
        this.zza = zzahVar;
    }

    private final int zzs(int i) {
        return (this.zza.size() - 1) - i;
    }

    public final boolean contains(Object obj) {
        return this.zza.contains(obj);
    }

    public final Object get(int i) {
        zzah zzahVar = this.zza;
        zzr.zzb(i, zzahVar.size(), "index");
        return zzahVar.get(zzs(i));
    }

    public final int indexOf(Object obj) {
        int lastIndexOf = this.zza.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return zzs(lastIndexOf);
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        int indexOf = this.zza.indexOf(obj);
        if (indexOf >= 0) {
            return zzs(indexOf);
        }
        return -1;
    }

    public final int size() {
        return this.zza.size();
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return zzi(i, i2);
    }

    public final boolean zzf() {
        return this.zza.zzf();
    }

    public final zzah zzh() {
        return this.zza;
    }

    public final zzah zzi(int i, int i2) {
        zzah zzahVar = this.zza;
        zzr.zzd(i, i2, zzahVar.size());
        return zzahVar.zzi(zzahVar.size() - i2, zzahVar.size() - i).zzh();
    }
}
