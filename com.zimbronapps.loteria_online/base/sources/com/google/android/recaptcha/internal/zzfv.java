package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.t;
import Da.D;
import Ga.e;
import Ia.l;
import Qa.p;
import android.webkit.ValueCallback;
import cb.O;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzfv extends l implements p {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzfw zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfv(String[] strArr, zzfw zzfwVar, String str, e eVar) {
        super(2, eVar);
        this.zza = strArr;
        this.zzb = zzfwVar;
        this.zzc = str;
    }

    public final e create(Object obj, e eVar) {
        return new zzfv(this.zza, this.zzb, this.zzc, eVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((O) obj, (e) obj2).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Ha.c.f();
        t.b(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("\"" + str + "\"");
        }
        zzfw.zza(this.zzb).evaluateJavascript(this.zzc + "(" + D.n0(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Qa.l) null, 62, (Object) null) + ")", (ValueCallback) null);
        return I.a;
    }
}
