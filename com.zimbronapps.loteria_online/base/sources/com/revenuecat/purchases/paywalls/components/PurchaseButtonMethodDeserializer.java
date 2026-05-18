package com.revenuecat.purchases.paywalls.components;

import Ca.q;
import Ca.x;
import Da.S;
import Qa.a;
import Qa.l;
import com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent;
import com.revenuecat.purchases.utils.serializers.SealedDeserializerWithDefault;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ob.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchaseButtonMethodDeserializer extends SealedDeserializerWithDefault {
    public static final PurchaseButtonMethodDeserializer INSTANCE = new PurchaseButtonMethodDeserializer();

    public static final class 1 extends u implements a {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(0);
        }

        public final b invoke() {
            return PurchaseButtonComponent.Method.InAppCheckout.INSTANCE.serializer();
        }
    }

    public static final class 2 extends u implements a {
        public static final 2 INSTANCE = new 2();

        public 2() {
            super(0);
        }

        public final b invoke() {
            return PurchaseButtonComponent.Method.WebCheckout.Companion.serializer();
        }
    }

    public static final class 3 extends u implements a {
        public static final 3 INSTANCE = new 3();

        public 3() {
            super(0);
        }

        public final b invoke() {
            return PurchaseButtonComponent.Method.WebProductSelection.Companion.serializer();
        }
    }

    public static final class 4 extends u implements a {
        public static final 4 INSTANCE = new 4();

        public 4() {
            super(0);
        }

        public final b invoke() {
            return PurchaseButtonComponent.Method.CustomWebCheckout.Companion.serializer();
        }
    }

    public static final class 5 extends u implements l {
        public static final 5 INSTANCE = new 5();

        public 5() {
            super(1);
        }

        public final PurchaseButtonComponent.Method invoke(String str) {
            t.g(str, "it");
            return PurchaseButtonComponent.Method.Unknown.INSTANCE;
        }
    }

    private PurchaseButtonMethodDeserializer() {
        super("Method", S.l(new q[]{x.a("in_app_checkout", 1.INSTANCE), x.a("web_checkout", 2.INSTANCE), x.a("web_product_selection", 3.INSTANCE), x.a("custom_web_checkout", 4.INSTANCE)}), 5.INSTANCE, (String) null, 8, (k) null);
    }
}
