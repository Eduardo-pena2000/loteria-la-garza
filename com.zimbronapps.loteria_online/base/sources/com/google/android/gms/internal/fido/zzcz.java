package com.google.android.gms.internal.fido;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcz extends zzcf {
    final transient Object zza;

    public zzcz(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzcm(this.zza);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        return "[" + this.zza.toString() + "]";
    }

    public final int zza(Object[] objArr, int i) {
        objArr[0] = this.zza;
        return 1;
    }

    public final zzdc zzd() {
        return new zzcm(this.zza);
    }

    public final zzcc zzi() {
        return zzcc.zzj(this.zza);
    }
}
