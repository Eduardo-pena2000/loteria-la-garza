package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbbc extends zzbby {
    private static volatile String zzh;
    private static final Object zzi = new Object();

    public zzbbc(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2) {
        super(zzbakVar, "r3bKg5w0nz7IjZtWNMiPOsvB0VlHAYkN7VnU6Stu7HeDf3C1E2T8lLdAdxjkOACh", "v3VfjQtThhKzeCR8emHmzxqnaN2SnNbSp/OAufPeGKA=", zzawgVar, i, 82);
    }

    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (String) this.zze.invoke((Object) null, (Object[]) null);
                    }
                } finally {
                }
            }
        }
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            zzawgVar.zzV(zzh);
        }
    }
}
