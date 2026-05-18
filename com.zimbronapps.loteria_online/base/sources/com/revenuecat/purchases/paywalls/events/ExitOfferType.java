package com.revenuecat.purchases.paywalls.events;

import Ca.l;
import Ca.m;
import Ca.n;
import Qa.a;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;
import ob.b;
import sb.A;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public enum ExitOfferType {
    DISMISS("dismiss");

    private final String value;
    public static final Companion Companion = new Companion(null);
    private static final l $cachedSerializer$delegate = m.a(n.b, Companion.1.INSTANCE);

    public static final class Companion {

        public static final class 1 extends u implements a {
            public static final 1 INSTANCE = new 1();

            public 1() {
                super(0);
            }

            public final b invoke() {
                return A.b("com.revenuecat.purchases.paywalls.events.ExitOfferType", ExitOfferType.values());
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final /* synthetic */ b get$cachedSerializer() {
            return (b) ExitOfferType.access$get$cachedSerializer$delegate$cp().getValue();
        }

        public final b serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    ExitOfferType(String str) {
        this.value = str;
    }

    public static final /* synthetic */ l access$get$cachedSerializer$delegate$cp() {
        return $cachedSerializer$delegate;
    }

    public final String getValue() {
        return this.value;
    }
}
