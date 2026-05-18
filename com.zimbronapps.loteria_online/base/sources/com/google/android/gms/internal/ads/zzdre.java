package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzdre implements zzgqt {
    private final /* synthetic */ String zza;
    private final /* synthetic */ double zzb;
    private final /* synthetic */ int zzc;
    private final /* synthetic */ int zzd;

    public /* synthetic */ zzdre(String str, double d, int i, int i2) {
        this.zza = str;
        this.zzb = d;
        this.zzc = i;
        this.zzd = i2;
    }

    public final /* synthetic */ Object apply(Object obj) {
        return new zzbkd(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(this.zza), this.zzb, this.zzc, this.zzd, null);
    }
}
