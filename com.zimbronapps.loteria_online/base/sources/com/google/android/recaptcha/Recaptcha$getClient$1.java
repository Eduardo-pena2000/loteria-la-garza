package com.google.android.recaptcha;

import Ca.s;
import Ga.e;
import Ha.c;
import Ia.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Recaptcha$getClient$1 extends d {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, e eVar) {
        super(eVar);
        this.zzb = recaptcha;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object obj2 = this.zzb.getClient-BWLJW6A(null, null, 0L, this);
        return obj2 == c.f() ? obj2 : s.a(obj2);
    }
}
