package com.revenuecat.purchases.paywalls.components.properties;

import Ca.q;
import Ca.x;
import Da.S;
import Qa.a;
import Qa.l;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.utils.serializers.SealedDeserializerWithDefault;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ob.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SizeConstraintDeserializer extends SealedDeserializerWithDefault {
    public static final SizeConstraintDeserializer INSTANCE = new SizeConstraintDeserializer();

    public static final class 1 extends u implements a {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(0);
        }

        public final b invoke() {
            return SizeConstraint.Fit.INSTANCE.serializer();
        }
    }

    public static final class 2 extends u implements a {
        public static final 2 INSTANCE = new 2();

        public 2() {
            super(0);
        }

        public final b invoke() {
            return SizeConstraint.Fill.INSTANCE.serializer();
        }
    }

    public static final class 3 extends u implements a {
        public static final 3 INSTANCE = new 3();

        public 3() {
            super(0);
        }

        public final b invoke() {
            return SizeConstraint.Fixed.Companion.serializer();
        }
    }

    public static final class 4 extends u implements l {
        public static final 4 INSTANCE = new 4();

        public 4() {
            super(1);
        }

        public final SizeConstraint invoke(String str) {
            t.g(str, "it");
            return SizeConstraint.Fit.INSTANCE;
        }
    }

    private SizeConstraintDeserializer() {
        super("SizeConstraint", S.l(new q[]{x.a("fit", 1.INSTANCE), x.a("fill", 2.INSTANCE), x.a("fixed", 3.INSTANCE)}), 4.INSTANCE, (String) null, 8, (k) null);
    }
}
