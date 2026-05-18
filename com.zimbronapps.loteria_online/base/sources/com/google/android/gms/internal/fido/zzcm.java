package com.google.android.gms.internal.fido;

import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcm extends zzdc {
    private static final Object zza = new Object();
    private Object zzb;

    public zzcm(Object obj) {
        this.zzb = obj;
    }

    public final boolean hasNext() {
        return this.zzb != zza;
    }

    public final Object next() {
        Object obj = this.zzb;
        Object obj2 = zza;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.zzb = obj2;
        return obj;
    }
}
