package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcjd implements DialogInterface.OnCancelListener {
    final /* synthetic */ JsResult zza;

    public zzcjd(JsResult jsResult) {
        this.zza = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.zza.cancel();
    }
}
