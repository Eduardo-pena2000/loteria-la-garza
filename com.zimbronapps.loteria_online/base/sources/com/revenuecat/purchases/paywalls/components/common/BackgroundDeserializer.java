package com.revenuecat.purchases.paywalls.components.common;

import Ca.q;
import Ca.x;
import Da.S;
import Qa.a;
import Qa.l;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.utils.serializers.SealedDeserializerWithDefault;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ob.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BackgroundDeserializer extends SealedDeserializerWithDefault {
    public static final BackgroundDeserializer INSTANCE = new BackgroundDeserializer();

    public static final class 1 extends u implements a {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(0);
        }

        public final b invoke() {
            return Background.Color.Companion.serializer();
        }
    }

    public static final class 2 extends u implements a {
        public static final 2 INSTANCE = new 2();

        public 2() {
            super(0);
        }

        public final b invoke() {
            return Background.Image.Companion.serializer();
        }
    }

    public static final class 3 extends u implements a {
        public static final 3 INSTANCE = new 3();

        public 3() {
            super(0);
        }

        public final b invoke() {
            return Background.Video.Companion.serializer();
        }
    }

    public static final class 4 extends u implements l {
        public static final 4 INSTANCE = new 4();

        public 4() {
            super(1);
        }

        public final Background invoke(String str) {
            t.g(str, "type");
            return new Background.Unknown(str);
        }
    }

    private BackgroundDeserializer() {
        super("Background", S.l(new q[]{x.a("color", 1.INSTANCE), x.a("image", 2.INSTANCE), x.a("video", 3.INSTANCE)}), 4.INSTANCE, (String) null, 8, (k) null);
    }
}
