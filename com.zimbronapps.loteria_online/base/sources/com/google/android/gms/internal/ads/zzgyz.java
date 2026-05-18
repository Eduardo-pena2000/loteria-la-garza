package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
abstract class zzgyz extends zzgyq {
    private List zza;

    public zzgyz(zzgub zzgubVar, boolean z) {
        super(zzgubVar, z, true);
        List emptyList = zzgubVar.isEmpty() ? Collections.emptyList() : zzgvf.zzb(zzgubVar.size());
        for (int i = 0; i < zzgubVar.size(); i++) {
            emptyList.add((Object) null);
        }
        this.zza = emptyList;
    }

    public final void zzA(int i) {
        super.zzA(i);
        this.zza = null;
    }

    public abstract Object zzD(List list);

    public final void zzw(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzgyy(obj));
        }
    }

    public final void zzx() {
        List list = this.zza;
        if (list != null) {
            zza(zzD(list));
        }
    }
}
