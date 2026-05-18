package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.provider.Settings;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzetv implements Callable {
    private final /* synthetic */ ContentResolver zza;

    public /* synthetic */ zzetv(ContentResolver contentResolver) {
        this.zza = contentResolver;
    }

    public final /* synthetic */ Object call() {
        ContentResolver contentResolver = this.zza;
        return new zzetx(Settings.Secure.getString(contentResolver, "advertising_id"), Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 0) == 1);
    }
}
