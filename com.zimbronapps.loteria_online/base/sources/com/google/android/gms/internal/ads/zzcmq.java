package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcmq implements zzikg {
    private zzcmq(zzcmc zzcmcVar) {
    }

    public static zzcmq zza(zzcmc zzcmcVar) {
        return new zzcmq(zzcmcVar);
    }

    public final /* synthetic */ Object zzb() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(Uri.parse("https://play.google.com/d"));
        return intent;
    }
}
