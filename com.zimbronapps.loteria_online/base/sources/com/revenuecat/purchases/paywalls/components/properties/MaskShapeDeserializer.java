package com.revenuecat.purchases.paywalls.components.properties;

import Ca.q;
import Ca.x;
import Da.S;
import Qa.a;
import Qa.l;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape;
import com.revenuecat.purchases.utils.serializers.SealedDeserializerWithDefault;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ob.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class MaskShapeDeserializer extends SealedDeserializerWithDefault {
    public static final MaskShapeDeserializer INSTANCE = new MaskShapeDeserializer();

    public static final class 1 extends u implements a {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(0);
        }

        public final b invoke() {
            return MaskShape.Rectangle.Companion.serializer();
        }
    }

    public static final class 2 extends u implements a {
        public static final 2 INSTANCE = new 2();

        public 2() {
            super(0);
        }

        public final b invoke() {
            return MaskShape.Concave.INSTANCE.serializer();
        }
    }

    public static final class 3 extends u implements a {
        public static final 3 INSTANCE = new 3();

        public 3() {
            super(0);
        }

        public final b invoke() {
            return MaskShape.Convex.INSTANCE.serializer();
        }
    }

    public static final class 4 extends u implements a {
        public static final 4 INSTANCE = new 4();

        public 4() {
            super(0);
        }

        public final b invoke() {
            return MaskShape.Circle.INSTANCE.serializer();
        }
    }

    public static final class 5 extends u implements l {
        public static final 5 INSTANCE = new 5();

        public 5() {
            super(1);
        }

        public final MaskShape invoke(String str) {
            t.g(str, "it");
            return new MaskShape.Rectangle((CornerRadiuses) null, 1, (k) null);
        }
    }

    private MaskShapeDeserializer() {
        super("MaskShape", S.l(new q[]{x.a("rectangle", 1.INSTANCE), x.a("concave", 2.INSTANCE), x.a("convex", 3.INSTANCE), x.a("circle", 4.INSTANCE)}), 5.INSTANCE, (String) null, 8, (k) null);
    }
}
