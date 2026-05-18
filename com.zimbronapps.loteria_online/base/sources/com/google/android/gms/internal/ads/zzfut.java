package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzfut extends AsyncTask {
    private zzfuu zza;
    protected final zzful zzd;

    public zzfut(zzful zzfulVar) {
        this.zzd = zzfulVar;
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfuu zzfuuVar = this.zza;
        if (zzfuuVar != null) {
            zzfuuVar.zzb(this);
        }
    }

    public final void zzb(zzfuu zzfuuVar) {
        this.zza = zzfuuVar;
    }
}
