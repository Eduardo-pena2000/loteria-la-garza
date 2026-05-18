package com.google.android.gms.internal.firebase-auth-api;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzao {
    zzan zza;
    private Object[] zzb;
    private int zzc;

    public zzao() {
        this(4);
    }

    public final zzao zza(Iterable iterable) {
        if (iterable instanceof Collection) {
            zza(this.zzc + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            zza(this.zzc + 1);
            zzae.zza(key, value);
            Object[] objArr = this.zzb;
            int i = this.zzc;
            objArr[i * 2] = key;
            objArr[(i * 2) + 1] = value;
            this.zzc = i + 1;
        }
        return this;
    }

    public zzao(int i) {
        this.zzb = new Object[i * 2];
        this.zzc = 0;
    }

    public final zzal zza() {
        zzan zzanVar = this.zza;
        if (zzanVar == null) {
            zzas zza = zzas.zza(this.zzc, this.zzb, this);
            zzan zzanVar2 = this.zza;
            if (zzanVar2 == null) {
                return zza;
            }
            throw zzanVar2.zza();
        }
        throw zzanVar.zza();
    }

    private final void zza(int i) {
        int i2 = i << 1;
        Object[] objArr = this.zzb;
        if (i2 > objArr.length) {
            this.zzb = Arrays.copyOf(objArr, zzai.zza(objArr.length, i2));
        }
    }
}
