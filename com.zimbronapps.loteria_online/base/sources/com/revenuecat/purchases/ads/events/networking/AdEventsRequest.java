package com.revenuecat.purchases.ads.events.networking;

import Da.w;
import com.revenuecat.purchases.common.events.BackendEvent;
import com.revenuecat.purchases.common.events.BackendEvent$Ad$$serializer;
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
public final class AdEventsRequest {
    private final List events;
    public static final Companion Companion = new Companion(null);
    private static final b[] $childSerializers = {new e(BackendEvent$Ad$$serializer.INSTANCE)};

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return AdEventsRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Ca.e
    public /* synthetic */ AdEventsRequest(int i, List list, t0 t0Var) {
        if (1 != (i & 1)) {
            f0.a(i, 1, AdEventsRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.events = list;
    }

    public static final /* synthetic */ b[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ AdEventsRequest copy$default(AdEventsRequest adEventsRequest, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = adEventsRequest.events;
        }
        return adEventsRequest.copy(list);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(AdEventsRequest adEventsRequest, d dVar, qb.e eVar) {
        dVar.k(eVar, 0, $childSerializers[0], adEventsRequest.events);
    }

    public final List component1() {
        return this.events;
    }

    public final AdEventsRequest copy(List list) {
        t.g(list, "events");
        return new AdEventsRequest(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdEventsRequest) && t.c(this.events, ((AdEventsRequest) obj).events);
    }

    public final List getCacheKey() {
        List list = this.events;
        ArrayList arrayList = new ArrayList(w.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((BackendEvent.Ad) it.next()).hashCode()));
        }
        return arrayList;
    }

    public final List getEvents() {
        return this.events;
    }

    public int hashCode() {
        return this.events.hashCode();
    }

    public String toString() {
        return "AdEventsRequest(events=" + this.events + ')';
    }

    public AdEventsRequest(List list) {
        t.g(list, "events");
        this.events = list;
    }
}
