package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgwc extends zzgup {
    private final transient zzgui zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzgwc(zzgui zzguiVar, Object[] objArr, int i, int i2) {
        this.zza = zzguiVar;
        this.zzb = objArr;
        this.zzc = i2;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ Iterator iterator() {
        return zze().listIterator(0);
    }

    public final int size() {
        return this.zzc;
    }

    public final zzgwt zza() {
        return zze().listIterator(0);
    }

    public final boolean zzf() {
        return true;
    }

    public final int zzg(Object[] objArr, int i) {
        return zze().zzg(objArr, i);
    }

    public final zzguf zzr() {
        return new zzgwb(this);
    }

    public final /* synthetic */ Object[] zzv() {
        return this.zzb;
    }

    public final /* synthetic */ int zzw() {
        return this.zzc;
    }
}
