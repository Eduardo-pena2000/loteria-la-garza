package com.revenuecat.purchases;

import Ca.I;
import Da.v;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import sb.x0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomVariableDefinitionSerializer$descriptor$1 extends u implements Qa.l {
    public static final CustomVariableDefinitionSerializer$descriptor$1 INSTANCE = new CustomVariableDefinitionSerializer$descriptor$1();

    public CustomVariableDefinitionSerializer$descriptor$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((qb.a) obj);
        return I.a;
    }

    public final void invoke(qb.a aVar) {
        t.g(aVar, "$this$buildClassSerialDescriptor");
        List n = v.n();
        x0 x0Var = x0.a;
        aVar.a("type", x0Var.getDescriptor(), n, false);
        aVar.a("default_value", x0Var.getDescriptor(), v.n(), false);
    }
}
