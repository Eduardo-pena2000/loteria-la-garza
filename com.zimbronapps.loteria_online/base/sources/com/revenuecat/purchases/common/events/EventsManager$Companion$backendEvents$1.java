package com.revenuecat.purchases.common.events;

import Qa.l;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class EventsManager$Companion$backendEvents$1 extends u implements l {
    public static final EventsManager$Companion$backendEvents$1 INSTANCE = new EventsManager$Companion$backendEvents$1();

    public EventsManager$Companion$backendEvents$1() {
        super(1);
    }

    public final String invoke(BackendStoredEvent backendStoredEvent) {
        t.g(backendStoredEvent, "event");
        return EventsManager.access$getJson$cp().b(BackendStoredEvent.Companion.serializer(), backendStoredEvent);
    }
}
