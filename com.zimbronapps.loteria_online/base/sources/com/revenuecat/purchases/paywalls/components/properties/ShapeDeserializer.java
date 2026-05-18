package com.revenuecat.purchases.paywalls.components.properties;

import Ca.q;
import Ca.x;
import Da.S;
import Qa.a;
import Qa.l;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.utils.serializers.SealedDeserializerWithDefault;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ob.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ShapeDeserializer extends SealedDeserializerWithDefault {
    public static final ShapeDeserializer INSTANCE = new ShapeDeserializer();

    public static final class 1 extends u implements a {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(0);
        }

        public final b invoke() {
            return Shape.Rectangle.Companion.serializer();
        }
    }

    public static final class 2 extends u implements a {
        public static final 2 INSTANCE = new 2();

        public 2() {
            super(0);
        }

        public final b invoke() {
            return Shape.Pill.INSTANCE.serializer();
        }
    }

    public static final class 3 extends u implements l {
        public static final 3 INSTANCE = new 3();

        public 3() {
            super(1);
        }

        public final Shape invoke(String str) {
            t.g(str, "it");
            return new Shape.Rectangle((CornerRadiuses) null, 1, (k) null);
        }
    }

    private ShapeDeserializer() {
        super("Shape", S.l(new q[]{x.a("rectangle", 1.INSTANCE), x.a("pill", 2.INSTANCE)}), 3.INSTANCE, (String) null, 8, (k) null);
    }
}
