package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbac {
    private List zza = Collections.emptyList();

    public final void zza(List list) {
        this.zza = new ArrayList(list);
    }

    public final List zzb() {
        List list = this.zza;
        this.zza = Collections.emptyList();
        return list;
    }
}
