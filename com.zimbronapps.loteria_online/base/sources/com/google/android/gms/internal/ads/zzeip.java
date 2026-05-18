package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzeip implements zzfmu {
    private final /* synthetic */ zzeiu zza;
    private final /* synthetic */ W5.v zzb;
    private final /* synthetic */ String zzc;

    public /* synthetic */ zzeip(zzeiu zzeiuVar, W5.v vVar, String str) {
        this.zza = zzeiuVar;
        this.zzb = vVar;
        this.zzc = str;
    }

    public final /* synthetic */ Object zza(Object obj) {
        this.zza.zzb((SQLiteDatabase) obj, this.zzb, this.zzc);
        return null;
    }
}
