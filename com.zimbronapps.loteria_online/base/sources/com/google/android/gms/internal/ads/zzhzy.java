package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzhzy implements zzidk {
    static {
        int i = zzibb.zzb;
        int i2 = zziaa.zza;
    }

    public final /* synthetic */ Object zza(InputStream inputStream, zzibb zzibbVar) throws zzicg {
        zziee zzaU;
        zziaq zzF = zziaq.zzF(inputStream, 4096);
        zzidc zzidcVar = (zzidc) zzb(zzF, zzibbVar);
        zzF.zzb(0);
        if (zzidcVar == null || zzidcVar.zzbi()) {
            return zzidcVar;
        }
        if (zzidcVar instanceof zzhzw) {
            zzaU = ((zzhzw) zzidcVar).zzaU();
        } else {
            if (zzidcVar instanceof zzhzx) {
                throw null;
            }
            zzaU = new zziee(zzidcVar);
        }
        throw zzaU.zza();
    }
}
