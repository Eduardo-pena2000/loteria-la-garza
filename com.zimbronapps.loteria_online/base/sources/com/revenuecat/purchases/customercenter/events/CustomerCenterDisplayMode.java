package com.revenuecat.purchases.customercenter.events;

import Ca.l;
import Ca.m;
import Ca.n;
import Qa.a;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;
import ob.b;
import sb.A;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public enum CustomerCenterDisplayMode {
    FULL_SCREEN;

    public static final Companion Companion = new Companion(null);
    private static final l $cachedSerializer$delegate = m.a(n.b, Companion.1.INSTANCE);

    public static final class Companion {

        public static final class 1 extends u implements a {
            public static final 1 INSTANCE = new 1();

            public 1() {
                super(0);
            }

            public final b invoke() {
                return A.a("com.revenuecat.purchases.customercenter.events.CustomerCenterDisplayMode", CustomerCenterDisplayMode.values(), new String[]{"full_screen"}, new Annotation[][]{null}, (Annotation[]) null);
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final /* synthetic */ b get$cachedSerializer() {
            return (b) CustomerCenterDisplayMode.access$get$cachedSerializer$delegate$cp().getValue();
        }

        public final b serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ l access$get$cachedSerializer$delegate$cp() {
        return $cachedSerializer$delegate;
    }
}
