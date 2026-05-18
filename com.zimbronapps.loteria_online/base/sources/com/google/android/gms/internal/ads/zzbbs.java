package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbbs extends zzbby {
    private final zzbar zzh;
    private long zzi;

    public zzbbs(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2, zzbar zzbarVar) {
        super(zzbakVar, "X3d3ekEggpPfZcTTuZPSKX+MUCnQGNsbyccHnkW7iVTfczCTjKoxcgVjpAE8Uhyz", "I4rncSeVGoKv0gEJ8Xd0rq9G0kL2Ky2ley3iuTG83Dg=", zzawgVar, i, 53);
        this.zzh = zzbarVar;
        if (zzbarVar != null) {
            this.zzi = zzbarVar.zzc();
        }
    }

    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzh != null) {
            this.zzd.zzH(((Long) this.zze.invoke((Object) null, new Object[]{Long.valueOf(this.zzi)})).longValue());
        }
    }
}
