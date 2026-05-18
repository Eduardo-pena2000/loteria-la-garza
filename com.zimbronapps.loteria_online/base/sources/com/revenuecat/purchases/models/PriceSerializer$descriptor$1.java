package com.revenuecat.purchases.models;

import Ca.I;
import Qa.l;
import java.util.List;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v;
import qb.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PriceSerializer$descriptor$1 extends u implements l {
    public static final PriceSerializer$descriptor$1 INSTANCE = new PriceSerializer$descriptor$1();

    public PriceSerializer$descriptor$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((a) obj);
        return I.a;
    }

    public final void invoke(a aVar) {
        t.g(aVar, "$this$buildClassSerialDescriptor");
        U u = U.a;
        a.b(aVar, "formatted", pb.a.F(u).getDescriptor(), (List) null, false, 12, (Object) null);
        a.b(aVar, "amount_micros", pb.a.D(v.a).getDescriptor(), (List) null, false, 12, (Object) null);
        a.b(aVar, "currency_code", pb.a.F(u).getDescriptor(), (List) null, false, 12, (Object) null);
    }
}
