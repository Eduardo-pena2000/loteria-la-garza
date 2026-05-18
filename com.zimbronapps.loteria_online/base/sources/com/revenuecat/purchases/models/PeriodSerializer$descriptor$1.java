package com.revenuecat.purchases.models;

import Ca.I;
import Qa.l;
import java.util.List;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import qb.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PeriodSerializer$descriptor$1 extends u implements l {
    public static final PeriodSerializer$descriptor$1 INSTANCE = new PeriodSerializer$descriptor$1();

    public PeriodSerializer$descriptor$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((a) obj);
        return I.a;
    }

    public final void invoke(a aVar) {
        t.g(aVar, "$this$buildClassSerialDescriptor");
        a.b(aVar, "value", pb.a.C(s.a).getDescriptor(), (List) null, false, 12, (Object) null);
        U u = U.a;
        a.b(aVar, "unit", pb.a.F(u).getDescriptor(), (List) null, false, 12, (Object) null);
        a.b(aVar, "iso8601", pb.a.F(u).getDescriptor(), (List) null, false, 12, (Object) null);
    }
}
