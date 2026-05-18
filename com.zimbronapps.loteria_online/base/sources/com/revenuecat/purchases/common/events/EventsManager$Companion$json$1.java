package com.revenuecat.purchases.common.events;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.common.events.BackendStoredEvent;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import tb.e;
import vb.b;
import vb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class EventsManager$Companion$json$1 extends u implements l {
    public static final EventsManager$Companion$json$1 INSTANCE = new EventsManager$Companion$json$1();

    public EventsManager$Companion$json$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((e) obj);
        return I.a;
    }

    public final void invoke(e eVar) {
        t.g(eVar, "$this$Json");
        f fVar = new f();
        b bVar = new b(P.b(BackendStoredEvent.class), (ob.b) null);
        bVar.b(P.b(BackendStoredEvent.CustomerCenter.class), BackendStoredEvent.CustomerCenter.Companion.serializer());
        bVar.b(P.b(BackendStoredEvent.Paywalls.class), BackendStoredEvent.Paywalls.Companion.serializer());
        bVar.b(P.b(BackendStoredEvent.Ad.class), BackendStoredEvent.Ad.Companion.serializer());
        bVar.b(P.b(BackendStoredEvent.CustomPaywall.class), BackendStoredEvent.CustomPaywall.Companion.serializer());
        bVar.a(fVar);
        eVar.g(fVar.f());
        eVar.e(false);
    }
}
