package com.revenuecat.purchases.common.events;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.DebugEvent;
import com.revenuecat.purchases.DebugEventListener;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class EventsManager$debugEventListener$callback$1$1 extends u implements l {
    final /* synthetic */ DebugEventListener $listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventsManager$debugEventListener$callback$1$1(DebugEventListener debugEventListener) {
        super(1);
        this.$listener = debugEventListener;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DebugEvent) obj);
        return I.a;
    }

    public final void invoke(DebugEvent debugEvent) {
        t.g(debugEvent, "event");
        this.$listener.onDebugEventReceived(debugEvent);
    }
}
