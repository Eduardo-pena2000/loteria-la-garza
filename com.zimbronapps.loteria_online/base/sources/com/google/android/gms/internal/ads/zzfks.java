package com.google.android.gms.internal.ads;

import S5.c1;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfks implements zzdbi {
    private final HashSet zza = new HashSet();
    private final Context zzb;
    private final zzcdz zzc;

    public zzfks(Context context, zzcdz zzcdzVar) {
        this.zzb = context;
        this.zzc = zzcdzVar;
    }

    public final synchronized void zzb(HashSet hashSet) {
        HashSet hashSet2 = this.zza;
        hashSet2.clear();
        hashSet2.addAll(hashSet);
    }

    public final Bundle zzc() {
        return this.zzc.zzo(this.zzb, this);
    }

    public final synchronized void zzdI(c1 c1Var) {
        if (c1Var.a != 3) {
            this.zzc.zzc(this.zza);
        }
    }
}
