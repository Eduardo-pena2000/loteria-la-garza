package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbax extends zzbby {
    private static final zzbbz zzh = new zzbbz();
    private final Context zzi;

    public zzbax(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2, Context context) {
        super(zzbakVar, "BJ0iIx7YCr6PyW+pyNNozQaB62BBi5nixFl6WJUaFdU4X2GlfptGfOLgFJ7ri6Ag", "ovMA5nrmsfMPPc1p4911nPRjAFxE4I+3QWZwZMrn+uQ=", zzawgVar, i, 29);
        this.zzi = context;
    }

    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzp("E");
        Context context = this.zzi;
        AtomicReference zza = zzh.zza(context.getPackageName());
        if (zza.get() == null) {
            synchronized (zza) {
                try {
                    if (zza.get() == null) {
                        zza.set((String) this.zze.invoke((Object) null, new Object[]{context}));
                    }
                } finally {
                }
            }
        }
        String str = (String) zza.get();
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            zzawgVar.zzp(zzaya.zza(str.getBytes(), true));
        }
    }
}
