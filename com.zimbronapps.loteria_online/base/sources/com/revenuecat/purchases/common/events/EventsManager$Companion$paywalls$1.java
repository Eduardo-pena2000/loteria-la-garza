package com.revenuecat.purchases.common.events;

import Qa.l;
import com.revenuecat.purchases.paywalls.events.PaywallStoredEvent;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public /* synthetic */ class EventsManager$Companion$paywalls$1 extends q implements l {
    public static final EventsManager$Companion$paywalls$1 INSTANCE = new EventsManager$Companion$paywalls$1();

    public EventsManager$Companion$paywalls$1() {
        super(1, PaywallStoredEvent.class, "toString", "toString()Ljava/lang/String;", 0);
    }

    public final String invoke(PaywallStoredEvent paywallStoredEvent) {
        t.g(paywallStoredEvent, "p0");
        return paywallStoredEvent.toString();
    }
}
