package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzbgj;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzehu implements zzfmu {
    private final /* synthetic */ zzehv zza;
    private final /* synthetic */ long zzb;

    public /* synthetic */ zzehu(zzehv zzehvVar, long j) {
        this.zza = zzehvVar;
        this.zzb = j;
    }

    public final /* synthetic */ Object zza(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (this.zza.zzf()) {
            return null;
        }
        long j = this.zzb;
        zzbgj.zzaf.zza.zza zzz = zzbgj.zzaf.zza.zzz();
        zzz.zzad(j);
        byte[] zzaN = ((zzbgj.zzaf.zza) zzz.zzbm()).zzaN();
        zzeic.zzf(sQLiteDatabase, false, false);
        zzeic.zze(sQLiteDatabase, j, zzaN);
        return null;
    }
}
