package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.function.Function;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final /* synthetic */ class zzjq implements Function {
    private final /* synthetic */ ContentResolver zza;
    private final /* synthetic */ Uri zzb;
    private final /* synthetic */ Runnable zzc;

    public /* synthetic */ zzjq(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        this.zza = contentResolver;
        this.zzb = uri;
        this.zzc = runnable;
    }

    public final /* synthetic */ Object apply(Object obj) {
        return zzjr.zzf(this.zza, this.zzb, this.zzc, (Uri) obj);
    }
}
