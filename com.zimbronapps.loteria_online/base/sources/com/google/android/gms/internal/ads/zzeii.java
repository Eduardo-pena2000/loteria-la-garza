package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.internal.ads.zzbgj;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeii {
    private final zzbgd zza;
    private final Context zzb;
    private final zzehn zzc;
    private final W5.a zzd;

    public zzeii(Context context, W5.a aVar, zzbgd zzbgdVar, zzehn zzehnVar) {
        this.zzb = context;
        this.zzd = aVar;
        this.zza = zzbgdVar;
        this.zzc = zzehnVar;
    }

    public final void zza(boolean z) {
        try {
            this.zzc.zza(new zzeih(this, z));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            int i = o0.b;
            W5.p.c("Error in offline signals database startup: ".concat(valueOf));
        }
    }

    public final /* synthetic */ Void zzb(boolean z, SQLiteDatabase sQLiteDatabase) {
        if (z) {
            this.zzb.deleteDatabase("OfflineUpload.db");
        } else {
            Iterable arrayList = new ArrayList();
            Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            while (query.moveToNext()) {
                try {
                    arrayList.add(zzbgj.zzaf.zza.zzk(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzicg e) {
                    int i = o0.b;
                    W5.p.c("Unable to deserialize proto from offline signals database:");
                    W5.p.c(e.getMessage());
                }
            }
            query.close();
            Context context = this.zzb;
            zzbgj.zzaf.zzc zzB = zzbgj.zzaf.zzB();
            zzB.zzB(context.getPackageName());
            zzB.zzH(Build.MODEL);
            zzB.zzo(zzeic.zzc(sQLiteDatabase, 0));
            zzB.zzj(arrayList);
            zzB.zzs(zzeic.zzc(sQLiteDatabase, 1));
            zzB.zzQ(zzeic.zzc(sQLiteDatabase, 3));
            zzB.zzw(R5.t.o().a());
            zzB.zzM(zzeic.zzd(sQLiteDatabase, 2));
            zzbgj.zzaf zzafVar = (zzbgj.zzaf) zzB.zzbm();
            int size = arrayList.size();
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                zzbgj.zzaf.zza zzaVar = (zzbgj.zzaf.zza) arrayList.get(i2);
                if (zzaVar.zzf() == zzbgj.zzq.zzb && zzaVar.zzb() > j) {
                    j = zzaVar.zzb();
                }
            }
            if (j != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", Long.valueOf(j));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", (String[]) null);
            }
            zzbgd zzbgdVar = this.zza;
            zzbgdVar.zzb(new zzeif(zzafVar));
            W5.a aVar = this.zzd;
            zzbgj.zzar.zza zzs = zzbgj.zzar.zzs();
            zzs.zzc(aVar.b);
            zzs.zzg(aVar.c);
            zzs.zzk(true == aVar.d ? 0 : 2);
            zzbgdVar.zzb(new zzeig((zzbgj.zzar) zzs.zzbm()));
            zzbgdVar.zzc(10004);
            zzeic.zzb(sQLiteDatabase);
        }
        return null;
    }
}
