package com.revenuecat.purchases.paywalls.components.properties;

import Ca.e;
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

@e
@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public enum FontSize {
    HEADING_XXL,
    HEADING_XL,
    HEADING_L,
    HEADING_M,
    HEADING_S,
    HEADING_XS,
    BODY_XL,
    BODY_L,
    BODY_M,
    BODY_S;

    public static final Companion Companion = new Companion(null);
    private static final l $cachedSerializer$delegate = m.a(n.b, Companion.1.INSTANCE);

    public static final class Companion {

        public static final class 1 extends u implements a {
            public static final 1 INSTANCE = new 1();

            public 1() {
                super(0);
            }

            public final b invoke() {
                return A.a("com.revenuecat.purchases.paywalls.components.properties.FontSize", FontSize.values(), new String[]{"heading_xxl", "heading_xl", "heading_l", "heading_m", "heading_s", "heading_xs", "body_xl", "body_l", "body_m", "body_s"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null}, (Annotation[]) null);
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final /* synthetic */ b get$cachedSerializer() {
            return (b) FontSize.access$get$cachedSerializer$delegate$cp().getValue();
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
