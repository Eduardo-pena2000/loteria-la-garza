package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import cb.O;
import cb.Q;
import cb.i;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzfw {
    private final WebView zza;
    private final O zzb;

    public zzfw(WebView webView, O o) {
        this.zza = webView;
        this.zzb = o;
    }

    public static final /* synthetic */ WebView zza(zzfw zzfwVar) {
        return zzfwVar.zza;
    }

    public final void zzb(String str, String... strArr) {
        i.d(this.zzb, (Ga.i) null, (Q) null, new zzfv((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3, (Object) null);
    }
}
