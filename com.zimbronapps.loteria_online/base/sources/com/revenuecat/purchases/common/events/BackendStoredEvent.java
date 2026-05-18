package com.revenuecat.purchases.common.events;

import Ca.e;
import Ca.l;
import Ca.m;
import Ca.n;
import Xa.c;
import com.revenuecat.purchases.common.events.BackendEvent;
import com.revenuecat.purchases.utils.Event;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ob.b;
import ob.h;
import rb.d;
import sb.f0;
import sb.t0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class BackendStoredEvent implements Event {
    public static final Companion Companion = new Companion(null);
    private static final l $cachedSerializer$delegate = m.a(n.b, Companion.1.INSTANCE);

    public static final class Ad extends BackendStoredEvent {
        public static final Companion Companion = new Companion(null);
        private final BackendEvent.Ad event;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return BackendStoredEvent$Ad$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @e
        public /* synthetic */ Ad(int i, BackendEvent.Ad ad, t0 t0Var) {
            super(i, t0Var);
            if (1 != (i & 1)) {
                f0.a(i, 1, BackendStoredEvent$Ad$$serializer.INSTANCE.getDescriptor());
            }
            this.event = ad;
        }

        public static /* synthetic */ Ad copy$default(Ad ad, BackendEvent.Ad ad2, int i, Object obj) {
            if ((i & 1) != 0) {
                ad2 = ad.event;
            }
            return ad.copy(ad2);
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Ad ad, d dVar, qb.e eVar) {
            BackendStoredEvent.write$Self(ad, dVar, eVar);
            dVar.k(eVar, 0, BackendEvent$Ad$$serializer.INSTANCE, ad.event);
        }

        public final BackendEvent.Ad component1() {
            return this.event;
        }

        public final Ad copy(BackendEvent.Ad ad) {
            t.g(ad, "event");
            return new Ad(ad);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ad) && t.c(this.event, ((Ad) obj).event);
        }

        public final BackendEvent.Ad getEvent() {
            return this.event;
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        public String toString() {
            return "Ad(event=" + this.event + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ad(BackendEvent.Ad ad) {
            super(null);
            t.g(ad, "event");
            this.event = ad;
        }
    }

    public static final class Companion {

        public static final class 1 extends u implements Qa.a {
            public static final 1 INSTANCE = new 1();

            public 1() {
                super(0);
            }

            public final b invoke() {
                return new h("com.revenuecat.purchases.common.events.BackendStoredEvent", P.b(BackendStoredEvent.class), new c[]{P.b(Ad.class), P.b(CustomPaywall.class), P.b(CustomerCenter.class), P.b(Paywalls.class)}, new b[]{BackendStoredEvent$Ad$$serializer.INSTANCE, BackendStoredEvent$CustomPaywall$$serializer.INSTANCE, BackendStoredEvent$CustomerCenter$$serializer.INSTANCE, BackendStoredEvent$Paywalls$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final /* synthetic */ b get$cachedSerializer() {
            return (b) BackendStoredEvent.access$get$cachedSerializer$delegate$cp().getValue();
        }

        public final b serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    public static final class CustomPaywall extends BackendStoredEvent {
        public static final Companion Companion = new Companion(null);
        private final BackendEvent.CustomPaywall event;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return BackendStoredEvent$CustomPaywall$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @e
        public /* synthetic */ CustomPaywall(int i, BackendEvent.CustomPaywall customPaywall, t0 t0Var) {
            super(i, t0Var);
            if (1 != (i & 1)) {
                f0.a(i, 1, BackendStoredEvent$CustomPaywall$$serializer.INSTANCE.getDescriptor());
            }
            this.event = customPaywall;
        }

        public static /* synthetic */ CustomPaywall copy$default(CustomPaywall customPaywall, BackendEvent.CustomPaywall customPaywall2, int i, Object obj) {
            if ((i & 1) != 0) {
                customPaywall2 = customPaywall.event;
            }
            return customPaywall.copy(customPaywall2);
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(CustomPaywall customPaywall, d dVar, qb.e eVar) {
            BackendStoredEvent.write$Self(customPaywall, dVar, eVar);
            dVar.k(eVar, 0, BackendEvent$CustomPaywall$$serializer.INSTANCE, customPaywall.event);
        }

        public final BackendEvent.CustomPaywall component1() {
            return this.event;
        }

        public final CustomPaywall copy(BackendEvent.CustomPaywall customPaywall) {
            t.g(customPaywall, "event");
            return new CustomPaywall(customPaywall);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CustomPaywall) && t.c(this.event, ((CustomPaywall) obj).event);
        }

        public final BackendEvent.CustomPaywall getEvent() {
            return this.event;
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        public String toString() {
            return "CustomPaywall(event=" + this.event + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomPaywall(BackendEvent.CustomPaywall customPaywall) {
            super(null);
            t.g(customPaywall, "event");
            this.event = customPaywall;
        }
    }

    public static final class CustomerCenter extends BackendStoredEvent {
        public static final Companion Companion = new Companion(null);
        private final BackendEvent.CustomerCenter event;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return BackendStoredEvent$CustomerCenter$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @e
        public /* synthetic */ CustomerCenter(int i, BackendEvent.CustomerCenter customerCenter, t0 t0Var) {
            super(i, t0Var);
            if (1 != (i & 1)) {
                f0.a(i, 1, BackendStoredEvent$CustomerCenter$$serializer.INSTANCE.getDescriptor());
            }
            this.event = customerCenter;
        }

        public static /* synthetic */ CustomerCenter copy$default(CustomerCenter customerCenter, BackendEvent.CustomerCenter customerCenter2, int i, Object obj) {
            if ((i & 1) != 0) {
                customerCenter2 = customerCenter.event;
            }
            return customerCenter.copy(customerCenter2);
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(CustomerCenter customerCenter, d dVar, qb.e eVar) {
            BackendStoredEvent.write$Self(customerCenter, dVar, eVar);
            dVar.k(eVar, 0, BackendEvent$CustomerCenter$$serializer.INSTANCE, customerCenter.event);
        }

        public final BackendEvent.CustomerCenter component1() {
            return this.event;
        }

        public final CustomerCenter copy(BackendEvent.CustomerCenter customerCenter) {
            t.g(customerCenter, "event");
            return new CustomerCenter(customerCenter);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CustomerCenter) && t.c(this.event, ((CustomerCenter) obj).event);
        }

        public final BackendEvent.CustomerCenter getEvent() {
            return this.event;
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        public String toString() {
            return "CustomerCenter(event=" + this.event + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomerCenter(BackendEvent.CustomerCenter customerCenter) {
            super(null);
            t.g(customerCenter, "event");
            this.event = customerCenter;
        }
    }

    public static final class Paywalls extends BackendStoredEvent {
        public static final Companion Companion = new Companion(null);
        private final BackendEvent.Paywalls event;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return BackendStoredEvent$Paywalls$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @e
        public /* synthetic */ Paywalls(int i, BackendEvent.Paywalls paywalls, t0 t0Var) {
            super(i, t0Var);
            if (1 != (i & 1)) {
                f0.a(i, 1, BackendStoredEvent$Paywalls$$serializer.INSTANCE.getDescriptor());
            }
            this.event = paywalls;
        }

        public static /* synthetic */ Paywalls copy$default(Paywalls paywalls, BackendEvent.Paywalls paywalls2, int i, Object obj) {
            if ((i & 1) != 0) {
                paywalls2 = paywalls.event;
            }
            return paywalls.copy(paywalls2);
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Paywalls paywalls, d dVar, qb.e eVar) {
            BackendStoredEvent.write$Self(paywalls, dVar, eVar);
            dVar.k(eVar, 0, BackendEvent$Paywalls$$serializer.INSTANCE, paywalls.event);
        }

        public final BackendEvent.Paywalls component1() {
            return this.event;
        }

        public final Paywalls copy(BackendEvent.Paywalls paywalls) {
            t.g(paywalls, "event");
            return new Paywalls(paywalls);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Paywalls) && t.c(this.event, ((Paywalls) obj).event);
        }

        public final BackendEvent.Paywalls getEvent() {
            return this.event;
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        public String toString() {
            return "Paywalls(event=" + this.event + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Paywalls(BackendEvent.Paywalls paywalls) {
            super(null);
            t.g(paywalls, "event");
            this.event = paywalls;
        }
    }

    public /* synthetic */ BackendStoredEvent(k kVar) {
        this();
    }

    public static final /* synthetic */ l access$get$cachedSerializer$delegate$cp() {
        return $cachedSerializer$delegate;
    }

    private BackendStoredEvent() {
    }

    @e
    public /* synthetic */ BackendStoredEvent(int i, t0 t0Var) {
    }

    public static final /* synthetic */ void write$Self(BackendStoredEvent backendStoredEvent, d dVar, qb.e eVar) {
    }
}
