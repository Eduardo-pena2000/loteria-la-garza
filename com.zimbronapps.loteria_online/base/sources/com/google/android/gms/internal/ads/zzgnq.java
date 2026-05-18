package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgnq implements zzgnb {
    private final List zza = new ArrayList();

    public final synchronized void zza(List list) {
        List list2 = this.zza;
        list2.clear();
        list2.addAll(list);
    }

    public final void zzb(Map map) {
    }

    public final synchronized void zzc(Map map, Context context, View view) {
        List list = this.zza;
        map.put("vst", new ArrayList(list));
        list.clear();
    }

    public final void zzd(Map map) {
    }
}
