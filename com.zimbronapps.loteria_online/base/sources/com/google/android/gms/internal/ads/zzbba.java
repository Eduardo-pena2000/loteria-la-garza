package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbba extends zzbby {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzbba(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2) {
        super(zzbakVar, "FynI9c5fEiMzQz2B7twhubBCGA6OmnD4m4mZd8FrJbuEtgSrrhq+E+F7XsfWYfqR", "1Y9Pw3JU+olt+lWU2l7rblcsXGsm1mQtokTJIYT27m0=", zzawgVar, i, 44);
    }

    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (Long) this.zze.invoke((Object) null, (Object[]) null);
                    }
                } finally {
                }
            }
        }
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            zzawgVar.zzB(zzh.longValue());
        }
    }
}
