package com.revenuecat.purchases.hybridcommon.mappers;

import Ca.x;
import Da.Q;
import Da.S;
import com.revenuecat.purchases.DebugEvent;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DebugEventMapperKt {
    public static final Map toMap(DebugEvent debugEvent) {
        t.g(debugEvent, "<this>");
        return S.r(Q.f(x.a("type", debugEvent.getName().name())), debugEvent.getProperties());
    }
}
