package com.revenuecat.purchases.common.events;

import Qa.l;
import com.revenuecat.purchases.paywalls.events.PaywallStoredEvent;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public /* synthetic */ class EventsManager$Companion$paywalls$2 extends q implements l {
    public EventsManager$Companion$paywalls$2(Object obj) {
        super(1, obj, PaywallStoredEvent.Companion.class, "fromString", "fromString(Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", 0);
    }

    public final PaywallStoredEvent invoke(String str) {
        t.g(str, "p0");
        return ((PaywallStoredEvent.Companion) ((f) this).receiver).fromString(str);
    }
}
