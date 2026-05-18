package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbbr extends zzbby {
    public zzbbr(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2) {
        super(zzbakVar, "WpK2JUF8iJ/BvX1YbpvZEg/OwGEi7DqWo1w6qvQxAhqdLxv0KDJfeHynFcOHsF/r", "eAfiSXYP9RekAEzlsFTPbe7e0Y1hgLoRWRhxsNjDqkg=", zzawgVar, i, 51);
    }

    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            zzbaf zzbafVar = new zzbaf((String) this.zze.invoke((Object) null, (Object[]) null));
            zzawgVar.zzF(zzbafVar.zza.longValue());
            zzawgVar.zzG(zzbafVar.zzb.longValue());
        }
    }
}
