package com.revenuecat.purchases.paywalls.components.common;

import Ca.q;
import Ca.x;
import Da.S;
import Qa.a;
import Qa.l;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.utils.serializers.SealedDeserializerWithDefault;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ob.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ConditionSerializer extends SealedDeserializerWithDefault {
    public static final ConditionSerializer INSTANCE = new ConditionSerializer();

    public static final class 1 extends u implements a {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(0);
        }

        public final b invoke() {
            return ComponentOverride.Condition.Compact.INSTANCE.serializer();
        }
    }

    public static final class 10 extends u implements a {
        public static final 10 INSTANCE = new 10();

        public 10() {
            super(0);
        }

        public final b invoke() {
            return ComponentOverride.Condition.SelectedPackage.Companion.serializer();
        }
    }

    public static final class 11 extends u implements a {
        public static final 11 INSTANCE = new 11();

        public 11() {
            super(0);
        }

        public final b invoke() {
            return ComponentOverride.Condition.Variable.Companion.serializer();
        }
    }

    public static final class 12 extends u implements l {
        public static final 12 INSTANCE = new 12();

        public 12() {
            super(1);
        }

        public final ComponentOverride.Condition invoke(String str) {
            t.g(str, "it");
            return ComponentOverride.Condition.Unsupported.INSTANCE;
        }
    }

    public static final class 2 extends u implements a {
        public static final 2 INSTANCE = new 2();

        public 2() {
            super(0);
        }

        public final b invoke() {
            return ComponentOverride.Condition.Medium.INSTANCE.serializer();
        }
    }

    public static final class 3 extends u implements a {
        public static final 3 INSTANCE = new 3();

        public 3() {
            super(0);
        }

        public final b invoke() {
            return ComponentOverride.Condition.Expanded.INSTANCE.serializer();
        }
    }

    public static final class 4 extends u implements a {
        public static final 4 INSTANCE = new 4();

        public 4() {
            super(0);
        }

        public final b invoke() {
            return ComponentOverride.Condition.IntroOffer.INSTANCE.serializer();
        }
    }

    public static final class 5 extends u implements a {
        public static final 5 INSTANCE = new 5();

        public 5() {
            super(0);
        }

        public final b invoke() {
            return ComponentOverride.Condition.IntroOfferRule.Companion.serializer();
        }
    }

    public static final class 6 extends u implements a {
        public static final 6 INSTANCE = new 6();

        public 6() {
            super(0);
        }

        public final b invoke() {
            return ComponentOverride.Condition.MultiplePhaseOffers.INSTANCE.serializer();
        }
    }

    public static final class 7 extends u implements a {
        public static final 7 INSTANCE = new 7();

        public 7() {
            super(0);
        }

        public final b invoke() {
            return ComponentOverride.Condition.Selected.INSTANCE.serializer();
        }
    }

    public static final class 8 extends u implements a {
        public static final 8 INSTANCE = new 8();

        public 8() {
            super(0);
        }

        public final b invoke() {
            return ComponentOverride.Condition.PromoOffer.INSTANCE.serializer();
        }
    }

    public static final class 9 extends u implements a {
        public static final 9 INSTANCE = new 9();

        public 9() {
            super(0);
        }

        public final b invoke() {
            return ComponentOverride.Condition.PromoOfferRule.Companion.serializer();
        }
    }

    private ConditionSerializer() {
        super("Condition", S.l(new q[]{x.a("compact", 1.INSTANCE), x.a("medium", 2.INSTANCE), x.a("expanded", 3.INSTANCE), x.a("intro_offer", 4.INSTANCE), x.a("intro_offer_condition", 5.INSTANCE), x.a("multiple_intro_offers", 6.INSTANCE), x.a("selected", 7.INSTANCE), x.a("promo_offer", 8.INSTANCE), x.a("promo_offer_condition", 9.INSTANCE), x.a("selected_package_condition", 10.INSTANCE), x.a("variable_condition", 11.INSTANCE)}), 12.INSTANCE, (String) null, 8, (k) null);
    }
}
