package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.t;
import Ga.e;
import Ia.l;
import Qa.p;
import cb.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzbg extends l implements p {
    public zzbg(e eVar) {
        super(2, eVar);
    }

    public final e create(Object obj, e eVar) {
        return new zzbg(eVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((O) obj, (e) obj2).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Ha.c.f();
        t.b(obj);
        Thread.currentThread().setPriority(8);
        return I.a;
    }
}
