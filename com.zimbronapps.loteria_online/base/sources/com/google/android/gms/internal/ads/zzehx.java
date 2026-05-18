package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzbgj;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzehx implements zzfmu {
    private final /* synthetic */ zzehy zza;
    private final /* synthetic */ boolean zzb;
    private final /* synthetic */ ArrayList zzc;
    private final /* synthetic */ zzbgj.zzab zzd;
    private final /* synthetic */ zzbgj.zzaf.zzd zze;

    public /* synthetic */ zzehx(zzehy zzehyVar, boolean z, ArrayList arrayList, zzbgj.zzab zzabVar, zzbgj.zzaf.zzd zzdVar) {
        this.zza = zzehyVar;
        this.zzb = z;
        this.zzc = arrayList;
        this.zzd = zzabVar;
        this.zze = zzdVar;
    }

    public final /* synthetic */ Object zza(Object obj) {
        zzehz zzehzVar = this.zza.zzb;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (zzehzVar.zzf()) {
            return null;
        }
        zzbgj.zzaf.zzd zzdVar = this.zze;
        zzbgj.zzab zzabVar = this.zzd;
        ArrayList arrayList = this.zzc;
        boolean z = this.zzb;
        byte[] zzc = zzehzVar.zzc(z, arrayList, zzabVar, zzdVar);
        zzeic.zzf(sQLiteDatabase, z, true);
        zzeic.zze(sQLiteDatabase, zzehzVar.zzd().zzb(), zzc);
        return null;
    }
}
