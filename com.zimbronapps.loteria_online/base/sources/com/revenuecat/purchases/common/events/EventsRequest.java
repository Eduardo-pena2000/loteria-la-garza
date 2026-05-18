package com.revenuecat.purchases.common.events;

import Da.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.e;
import sb.f0;
import sb.t0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class EventsRequest {
    private final List events;
    public static final Companion Companion = new Companion(null);
    private static final b[] $childSerializers = {new e(BackendEvent.Companion.serializer())};

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return EventsRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Ca.e
    public /* synthetic */ EventsRequest(int i, List list, t0 t0Var) {
        if (1 != (i & 1)) {
            f0.a(i, 1, EventsRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.events = list;
    }

    public static final /* synthetic */ b[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(EventsRequest eventsRequest, d dVar, qb.e eVar) {
        dVar.k(eVar, 0, $childSerializers[0], eventsRequest.events);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EventsRequest) && t.c(this.events, ((EventsRequest) obj).events);
    }

    public final List getCacheKey() {
        List list = this.events;
        ArrayList arrayList = new ArrayList(w.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((BackendEvent) it.next()).hashCode()));
        }
        return arrayList;
    }

    public final List getEvents$purchases_defaultsBc8Release() {
        return this.events;
    }

    public int hashCode() {
        return this.events.hashCode();
    }

    public String toString() {
        return "EventsRequest(events=" + this.events + ')';
    }

    public EventsRequest(List list) {
        t.g(list, "events");
        this.events = list;
    }
}
