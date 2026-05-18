package com.google.android.gms.internal.firebase-auth-api;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
abstract class zzd implements Iterator {
    private int zza = 2;
    private Object zzb;

    public final boolean hasNext() {
        int i = this.zza;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int i2 = i - 1;
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.zza = 4;
            this.zzb = zza();
            if (this.zza != 3) {
                this.zza = 1;
                return true;
            }
        }
        return false;
    }

    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.zza = 2;
        Object obj = this.zzb;
        this.zzb = null;
        return obj;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public abstract Object zza();

    public final Object zzb() {
        this.zza = 3;
        return null;
    }
}
