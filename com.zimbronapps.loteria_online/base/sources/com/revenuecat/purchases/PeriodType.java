package com.revenuecat.purchases;

import Ca.n;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.u;
import sb.A;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public enum PeriodType {
    NORMAL,
    INTRO,
    TRIAL,
    PREPAID;

    public static final Companion Companion = new Companion(null);
    private static final Ca.l $cachedSerializer$delegate = Ca.m.a(n.b, Companion.1.INSTANCE);

    public static final class Companion {

        public static final class 1 extends u implements Qa.a {
            public static final 1 INSTANCE = new 1();

            public 1() {
                super(0);
            }

            public final ob.b invoke() {
                return A.a("com.revenuecat.purchases.PeriodType", PeriodType.values(), new String[]{"normal", "intro", "trial", "prepaid"}, new Annotation[][]{null, null, null, null}, (Annotation[]) null);
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        private final /* synthetic */ ob.b get$cachedSerializer() {
            return (ob.b) PeriodType.access$get$cachedSerializer$delegate$cp().getValue();
        }

        public final ob.b serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ Ca.l access$get$cachedSerializer$delegate$cp() {
        return $cachedSerializer$delegate;
    }
}
