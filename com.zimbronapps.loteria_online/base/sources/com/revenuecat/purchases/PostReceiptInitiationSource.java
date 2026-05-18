package com.revenuecat.purchases;

import Ca.n;
import Ca.o;
import kotlin.jvm.internal.u;
import sb.A;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public enum PostReceiptInitiationSource {
    RESTORE,
    PURCHASE,
    UNSYNCED_ACTIVE_PURCHASES;

    public static final Companion Companion = new Companion(null);
    private static final Ca.l $cachedSerializer$delegate = Ca.m.a(n.b, Companion.1.INSTANCE);

    public static final class Companion {

        public static final class 1 extends u implements Qa.a {
            public static final 1 INSTANCE = new 1();

            public 1() {
                super(0);
            }

            public final ob.b invoke() {
                return A.b("com.revenuecat.purchases.PostReceiptInitiationSource", PostReceiptInitiationSource.values());
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        private final /* synthetic */ ob.b get$cachedSerializer() {
            return (ob.b) PostReceiptInitiationSource.access$get$cachedSerializer$delegate$cp().getValue();
        }

        public final ob.b serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostReceiptInitiationSource.values().length];
            try {
                iArr[PostReceiptInitiationSource.RESTORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostReceiptInitiationSource.PURCHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostReceiptInitiationSource.UNSYNCED_ACTIVE_PURCHASES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ Ca.l access$get$cachedSerializer$delegate$cp() {
        return $cachedSerializer$delegate;
    }

    public final String getPostReceiptFieldValue() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return "restore";
        }
        if (i == 2) {
            return "purchase";
        }
        if (i == 3) {
            return "unsynced_active_purchases";
        }
        throw new o();
    }
}
