package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbbf extends zzbby {
    private final Map zzh;
    private final View zzi;
    private final Context zzj;

    public zzbbf(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2, Map map, View view, Context context) {
        super(zzbakVar, "mWKvHkCTlhia7UFG1tX8rmkp9AizD6H5C2Y+fxk0U+Y2fZze528QNyV6FTMftwOj", "NhSpQvE4PaXaFqOsSIcuQESqMAyvT+VdhFhpwrR61iU=", zzawgVar, i, 85);
        this.zzh = map;
        this.zzi = view;
        this.zzj = context;
    }

    private final long zzb(int i) {
        Map map = this.zzh;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return ((Long) map.get(valueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = {zzb(1), zzb(2)};
        Context context = this.zzj;
        if (context == null) {
            context = this.zza.zzb();
        }
        long[] jArr2 = (long[]) this.zze.invoke((Object) null, new Object[]{jArr, context, this.zzi});
        long j = jArr2[0];
        Map map = this.zzh;
        map.put(1, Long.valueOf(jArr2[1]));
        long j2 = jArr2[2];
        map.put(2, Long.valueOf(jArr2[3]));
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            zzawgVar.zzY(j);
            zzawgVar.zzZ(j2);
        }
    }
}
