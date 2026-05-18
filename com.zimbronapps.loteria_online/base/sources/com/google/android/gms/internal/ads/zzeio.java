package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzeio implements Runnable {
    private final /* synthetic */ SQLiteDatabase zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ W5.v zzc;

    public /* synthetic */ zzeio(SQLiteDatabase sQLiteDatabase, String str, W5.v vVar) {
        this.zza = sQLiteDatabase;
        this.zzb = str;
        this.zzc = vVar;
    }

    public final /* synthetic */ void run() {
        zzeiu.zzg(this.zza, this.zzb, this.zzc);
    }
}
