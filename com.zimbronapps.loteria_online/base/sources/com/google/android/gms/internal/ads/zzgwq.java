package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgwq extends zzgup {
    final transient Object zza;

    public zzgwq(Object obj) {
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
        return new zzgux(this.zza);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append("[");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    public final zzgwt zza() {
        return new zzgux(this.zza);
    }

    public final zzguf zze() {
        return zzguf.zzj(this.zza);
    }

    public final boolean zzf() {
        return false;
    }

    public final int zzg(Object[] objArr, int i) {
        objArr[i] = this.zza;
        return i + 1;
    }
}
