package com.applovin.impl.mediation;

import com.applovin.impl.c5;
import com.applovin.impl.d5;
import com.applovin.impl.s4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class k implements s4.b {
    public final /* synthetic */ MediationServiceImpl a;
    public final /* synthetic */ long b;
    public final /* synthetic */ h c;
    public final /* synthetic */ String d;
    public final /* synthetic */ d5 e;
    public final /* synthetic */ MaxAdFormat f;
    public final /* synthetic */ c5.a g;

    public /* synthetic */ k(MediationServiceImpl mediationServiceImpl, long j, h hVar, String str, d5 d5Var, MaxAdFormat maxAdFormat, c5.a aVar) {
        this.a = mediationServiceImpl;
        this.b = j;
        this.c = hVar;
        this.d = str;
        this.e = d5Var;
        this.f = maxAdFormat;
        this.g = aVar;
    }

    public final void a(boolean z, Object obj, Object obj2) {
        MediationServiceImpl.f(this.a, this.b, this.c, this.d, this.e, this.f, this.g, z, (String) obj, (MaxError) obj2);
    }
}
