package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.t;
import Ga.e;
import Ia.l;
import Qa.p;
import android.content.Context;
import android.webkit.WebView;
import cb.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzjc extends l implements p {
    final /* synthetic */ zzjd zza;
    final /* synthetic */ Context zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjc(zzjd zzjdVar, Context context, e eVar) {
        super(2, eVar);
        this.zza = zzjdVar;
        this.zzb = context;
    }

    public final e create(Object obj, e eVar) {
        return new zzjc(this.zza, this.zzb, eVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((O) obj, (e) obj2).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Ha.c.f();
        t.b(obj);
        WebView zza = zzjd.zza(this.zza);
        if (zza == null) {
            zza = new WebView(this.zzb);
        }
        zzjd.zzb(this.zza, zza);
        return zza;
    }
}
