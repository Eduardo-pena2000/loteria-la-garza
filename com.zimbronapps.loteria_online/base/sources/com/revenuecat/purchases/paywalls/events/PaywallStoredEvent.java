package com.revenuecat.purchases.paywalls.events;

import Ca.e;
import com.revenuecat.purchases.common.events.BackendEvent;
import com.revenuecat.purchases.utils.Event;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import rb.d;
import sb.f0;
import sb.t0;
import tb.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallStoredEvent implements Event {
    public static final Companion Companion = new Companion(null);
    private static final b.a json = b.d;
    private final PaywallEvent event;
    private final String userID;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final PaywallStoredEvent fromString(String str) {
            t.g(str, "string");
            b.a json = getJson();
            json.a();
            return (PaywallStoredEvent) json.d(PaywallStoredEvent.Companion.serializer(), str);
        }

        public final b.a getJson() {
            return PaywallStoredEvent.access$getJson$cp();
        }

        public final ob.b serializer() {
            return PaywallStoredEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @e
    public /* synthetic */ PaywallStoredEvent(int i, PaywallEvent paywallEvent, String str, t0 t0Var) {
        if (3 != (i & 3)) {
            f0.a(i, 3, PaywallStoredEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.event = paywallEvent;
        this.userID = str;
    }

    public static final /* synthetic */ b.a access$getJson$cp() {
        return json;
    }

    public static /* synthetic */ PaywallStoredEvent copy$default(PaywallStoredEvent paywallStoredEvent, PaywallEvent paywallEvent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            paywallEvent = paywallStoredEvent.event;
        }
        if ((i & 2) != 0) {
            str = paywallStoredEvent.userID;
        }
        return paywallStoredEvent.copy(paywallEvent, str);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PaywallStoredEvent paywallStoredEvent, d dVar, qb.e eVar) {
        dVar.k(eVar, 0, PaywallEvent$$serializer.INSTANCE, paywallStoredEvent.event);
        dVar.v(eVar, 1, paywallStoredEvent.userID);
    }

    public final PaywallEvent component1() {
        return this.event;
    }

    public final String component2() {
        return this.userID;
    }

    public final PaywallStoredEvent copy(PaywallEvent paywallEvent, String str) {
        t.g(paywallEvent, "event");
        t.g(str, "userID");
        return new PaywallStoredEvent(paywallEvent, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallStoredEvent)) {
            return false;
        }
        PaywallStoredEvent paywallStoredEvent = (PaywallStoredEvent) obj;
        return t.c(this.event, paywallStoredEvent.event) && t.c(this.userID, paywallStoredEvent.userID);
    }

    public final PaywallEvent getEvent() {
        return this.event;
    }

    public final String getUserID() {
        return this.userID;
    }

    public int hashCode() {
        return (this.event.hashCode() * 31) + this.userID.hashCode();
    }

    public final BackendEvent.Paywalls toBackendEvent() {
        String uuid = this.event.getCreationData().getId().toString();
        t.f(uuid, "event.creationData.id.toString()");
        String value = this.event.getType().getValue();
        String str = this.userID;
        String uuid2 = this.event.getData().getSessionIdentifier().toString();
        t.f(uuid2, "event.data.sessionIdentifier.toString()");
        String offeringIdentifier = this.event.getData().getPresentedOfferingContext().getOfferingIdentifier();
        String paywallIdentifier = this.event.getData().getPaywallIdentifier();
        int paywallRevision = this.event.getData().getPaywallRevision();
        long time = this.event.getCreationData().getDate().getTime();
        String displayMode = this.event.getData().getDisplayMode();
        boolean darkMode = this.event.getData().getDarkMode();
        String localeIdentifier = this.event.getData().getLocaleIdentifier();
        ExitOfferType exitOfferType = this.event.getData().getExitOfferType();
        return new BackendEvent.Paywalls(uuid, 1, value, str, uuid2, offeringIdentifier, paywallIdentifier, paywallRevision, time, displayMode, darkMode, localeIdentifier, exitOfferType != null ? exitOfferType.getValue() : null, this.event.getData().getExitOfferingIdentifier(), (String) null, (String) null, (Integer) null, (String) null, 245760, (k) null);
    }

    public String toString() {
        b.a aVar = json;
        aVar.a();
        return aVar.b(Companion.serializer(), this);
    }

    public PaywallStoredEvent(PaywallEvent paywallEvent, String str) {
        t.g(paywallEvent, "event");
        t.g(str, "userID");
        this.event = paywallEvent;
        this.userID = str;
    }
}
