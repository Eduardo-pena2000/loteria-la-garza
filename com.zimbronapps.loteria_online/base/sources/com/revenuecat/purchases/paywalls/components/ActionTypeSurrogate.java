package com.revenuecat.purchases.paywalls.components;

import kotlin.jvm.internal.k;
import ob.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
enum ActionTypeSurrogate {
    restore_purchases,
    navigate_back,
    navigate_to,
    unknown;

    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return ActionTypeSurrogateDeserializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
