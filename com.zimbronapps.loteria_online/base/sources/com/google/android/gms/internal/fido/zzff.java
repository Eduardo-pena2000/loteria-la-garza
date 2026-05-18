package com.google.android.gms.internal.fido;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzff extends AbstractSet {
    final int zza = -1;
    final /* synthetic */ zzfg zzb;

    public zzff(zzfg zzfgVar, int i) {
        this.zzb = zzfgVar;
    }

    public final boolean contains(Object obj) {
        return Arrays.binarySearch(zzfg.zzc(this.zzb), zzb(), zza(), obj, this.zza == -1 ? zzfg.zza() : zzfi.zzb()) >= 0;
    }

    public final Iterator iterator() {
        return new zzfe(this);
    }

    public final int size() {
        return zza() - zzb();
    }

    public final int zza() {
        return zzfg.zzb(this.zzb)[this.zza + 1];
    }

    public final int zzb() {
        if (this.zza == -1) {
            return 0;
        }
        return zzfg.zzb(this.zzb)[0];
    }
}
