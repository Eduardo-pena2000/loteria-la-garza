package com.revenuecat.purchases.paywalls.components.properties;

import Ca.l;
import Ca.m;
import Ca.n;
import Qa.a;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ob.b;
import qb.e;
import rb.d;
import sb.c0;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface MaskShape {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Circle implements MaskShape {
        public static final Circle INSTANCE = new Circle();
        private static final /* synthetic */ l $cachedSerializer$delegate = m.a(n.b, 1.INSTANCE);

        public static final class 1 extends u implements a {
            public static final 1 INSTANCE = new 1();

            public 1() {
                super(0);
            }

            public final b invoke() {
                return new c0("com.revenuecat.purchases.paywalls.components.properties.MaskShape.Circle", Circle.INSTANCE, new Annotation[0]);
            }
        }

        private Circle() {
        }

        private final /* synthetic */ b get$cachedSerializer() {
            return (b) $cachedSerializer$delegate.getValue();
        }

        public final b serializer() {
            return get$cachedSerializer();
        }
    }

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final b serializer() {
            return MaskShapeDeserializer.INSTANCE;
        }
    }

    public static final class Concave implements MaskShape {
        public static final Concave INSTANCE = new Concave();
        private static final /* synthetic */ l $cachedSerializer$delegate = m.a(n.b, 1.INSTANCE);

        public static final class 1 extends u implements a {
            public static final 1 INSTANCE = new 1();

            public 1() {
                super(0);
            }

            public final b invoke() {
                return new c0("com.revenuecat.purchases.paywalls.components.properties.MaskShape.Concave", Concave.INSTANCE, new Annotation[0]);
            }
        }

        private Concave() {
        }

        private final /* synthetic */ b get$cachedSerializer() {
            return (b) $cachedSerializer$delegate.getValue();
        }

        public final b serializer() {
            return get$cachedSerializer();
        }
    }

    public static final class Convex implements MaskShape {
        public static final Convex INSTANCE = new Convex();
        private static final /* synthetic */ l $cachedSerializer$delegate = m.a(n.b, 1.INSTANCE);

        public static final class 1 extends u implements a {
            public static final 1 INSTANCE = new 1();

            public 1() {
                super(0);
            }

            public final b invoke() {
                return new c0("com.revenuecat.purchases.paywalls.components.properties.MaskShape.Convex", Convex.INSTANCE, new Annotation[0]);
            }
        }

        private Convex() {
        }

        private final /* synthetic */ b get$cachedSerializer() {
            return (b) $cachedSerializer$delegate.getValue();
        }

        public final b serializer() {
            return get$cachedSerializer();
        }
    }

    public static final class Rectangle implements MaskShape {
        public static final Companion Companion = new Companion(null);
        private final CornerRadiuses corners;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return MaskShape$Rectangle$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Rectangle() {
            this((CornerRadiuses) null, 1, (k) null);
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Rectangle rectangle, d dVar, e eVar) {
            if (!dVar.e(eVar, 0) && rectangle.corners == null) {
                return;
            }
            dVar.j(eVar, 0, CornerRadiusesSerializer.INSTANCE, rectangle.corners);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Rectangle) && t.c(this.corners, ((Rectangle) obj).corners);
        }

        public final /* synthetic */ CornerRadiuses getCorners() {
            return this.corners;
        }

        public int hashCode() {
            CornerRadiuses cornerRadiuses = this.corners;
            if (cornerRadiuses == null) {
                return 0;
            }
            return cornerRadiuses.hashCode();
        }

        public String toString() {
            return "Rectangle(corners=" + this.corners + ')';
        }

        @Ca.e
        public /* synthetic */ Rectangle(int i, CornerRadiuses cornerRadiuses, t0 t0Var) {
            if ((i & 1) == 0) {
                this.corners = null;
            } else {
                this.corners = cornerRadiuses;
            }
        }

        public Rectangle(CornerRadiuses cornerRadiuses) {
            this.corners = cornerRadiuses;
        }

        public /* synthetic */ Rectangle(CornerRadiuses cornerRadiuses, int i, k kVar) {
            this((i & 1) != 0 ? null : cornerRadiuses);
        }
    }
}
