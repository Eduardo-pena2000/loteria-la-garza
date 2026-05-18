package com.google.android.gms.internal.fido;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzfe implements Iterator {
    final /* synthetic */ zzff zza;
    private int zzb = 0;

    public zzfe(zzff zzffVar) {
        this.zza = zzffVar;
    }

    public final boolean hasNext() {
        int i = this.zzb;
        zzff zzffVar = this.zza;
        return i < zzffVar.zza() - zzffVar.zzb();
    }

    public final Object next() {
        int i = this.zzb;
        zzff zzffVar = this.zza;
        if (i >= zzffVar.zza() - zzffVar.zzb()) {
            throw new NoSuchElementException();
        }
        zzff zzffVar2 = this.zza;
        Object obj = zzfg.zzc(zzffVar2.zzb)[zzffVar2.zzb() + i];
        this.zzb = i + 1;
        return obj;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
