package com.revenuecat.purchases.common;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.common.events.BackendEvent;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import tb.e;
import vb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class JsonProvider$Companion$defaultJson$1 extends u implements l {
    public static final JsonProvider$Companion$defaultJson$1 INSTANCE = new JsonProvider$Companion$defaultJson$1();

    public JsonProvider$Companion$defaultJson$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((e) obj);
        return I.a;
    }

    public final void invoke(e eVar) {
        t.g(eVar, "$this$Json");
        f fVar = new f();
        vb.b bVar = new vb.b(P.b(BackendEvent.class), (ob.b) null);
        bVar.b(P.b(BackendEvent.CustomerCenter.class), BackendEvent.CustomerCenter.Companion.serializer());
        bVar.b(P.b(BackendEvent.Paywalls.class), BackendEvent.Paywalls.Companion.serializer());
        bVar.a(fVar);
        eVar.g(fVar.f());
        eVar.c("discriminator");
        eVar.d(false);
        eVar.f(true);
    }
}
