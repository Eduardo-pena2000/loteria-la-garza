package com.revenuecat.purchases.common.events;

import Qa.l;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class EventsManager$Companion$adEvents$2 extends u implements l {
    public static final EventsManager$Companion$adEvents$2 INSTANCE = new EventsManager$Companion$adEvents$2();

    public EventsManager$Companion$adEvents$2() {
        super(1);
    }

    public final BackendStoredEvent invoke(String str) {
        t.g(str, "jsonString");
        return (BackendStoredEvent) EventsManager.access$getJson$cp().d(BackendStoredEvent.Companion.serializer(), str);
    }
}
