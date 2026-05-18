package com.revenuecat.purchases.paywalls.components;

import kotlin.jvm.internal.k;
import ob.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
enum DestinationSurrogate {
    customer_center,
    privacy_policy,
    terms,
    url,
    sheet,
    unknown;

    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return DestinationSurrogateDeserializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
