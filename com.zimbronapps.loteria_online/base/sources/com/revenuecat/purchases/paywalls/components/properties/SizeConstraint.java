package com.revenuecat.purchases.paywalls.components.properties;

import Ca.A;
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
import rb.d;
import sb.H0;
import sb.c0;
import sb.f0;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface SizeConstraint {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final b serializer() {
            return SizeConstraintDeserializer.INSTANCE;
        }
    }

    public static final class Fill implements SizeConstraint {
        public static final Fill INSTANCE = new Fill();
        private static final /* synthetic */ l $cachedSerializer$delegate = m.a(n.b, 1.INSTANCE);

        public static final class 1 extends u implements a {
            public static final 1 INSTANCE = new 1();

            public 1() {
                super(0);
            }

            public final b invoke() {
                return new c0("com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fill", Fill.INSTANCE, new Annotation[0]);
            }
        }

        private Fill() {
        }

        private final /* synthetic */ b get$cachedSerializer() {
            return (b) $cachedSerializer$delegate.getValue();
        }

        public final b serializer() {
            return get$cachedSerializer();
        }
    }

    public static final class Fit implements SizeConstraint {
        public static final Fit INSTANCE = new Fit();
        private static final /* synthetic */ l $cachedSerializer$delegate = m.a(n.b, 1.INSTANCE);

        public static final class 1 extends u implements a {
            public static final 1 INSTANCE = new 1();

            public 1() {
                super(0);
            }

            public final b invoke() {
                return new c0("com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fit", Fit.INSTANCE, new Annotation[0]);
            }
        }

        private Fit() {
        }

        private final /* synthetic */ b get$cachedSerializer() {
            return (b) $cachedSerializer$delegate.getValue();
        }

        public final b serializer() {
            return get$cachedSerializer();
        }
    }

    public static final class Fixed implements SizeConstraint {
        public static final Companion Companion = new Companion(null);
        private final int value;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return SizeConstraint$Fixed$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @e
        public /* synthetic */ Fixed(int i, A a, t0 t0Var, k kVar) {
            this(i, a, t0Var);
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Fixed fixed, d dVar, qb.e eVar) {
            dVar.k(eVar, 0, H0.a, A.a(fixed.value));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fixed) && this.value == ((Fixed) obj).value;
        }

        public final /* synthetic */ int getValue-pVg5ArA() {
            return this.value;
        }

        public int hashCode() {
            return this.value;
        }

        public String toString() {
            return "Fixed(value=" + A.e(this.value) + ')';
        }

        public /* synthetic */ Fixed(int i, k kVar) {
            this(i);
        }

        private Fixed(int i) {
            this.value = i;
        }

        private Fixed(int i, A a, t0 t0Var) {
            if (1 != (i & 1)) {
                f0.a(i, 1, SizeConstraint$Fixed$$serializer.INSTANCE.getDescriptor());
            }
            this.value = a.f();
        }
    }
}
