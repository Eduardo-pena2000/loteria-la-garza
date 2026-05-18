package com.revenuecat.purchases.paywalls.components.properties;

import Ca.e;
import Xa.c;
import com.revenuecat.purchases.ColorAlias;
import com.revenuecat.purchases.ColorAlias$$serializer;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import ob.h;
import rb.d;
import sb.f0;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface ColorInfo {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Alias implements ColorInfo {
        public static final Companion Companion = new Companion(null);
        private final String value;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return ColorInfo$Alias$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @e
        public /* synthetic */ Alias(int i, String str, t0 t0Var, k kVar) {
            this(i, str, t0Var);
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Alias alias, d dVar, qb.e eVar) {
            dVar.k(eVar, 0, ColorAlias$$serializer.INSTANCE, ColorAlias.box-impl(alias.value));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Alias) && ColorAlias.equals-impl0(this.value, ((Alias) obj).value);
        }

        public final /* synthetic */ String getValue-671NwFM() {
            return this.value;
        }

        public int hashCode() {
            return ColorAlias.hashCode-impl(this.value);
        }

        public String toString() {
            return "Alias(value=" + ColorAlias.toString-impl(this.value) + ')';
        }

        public /* synthetic */ Alias(String str, k kVar) {
            this(str);
        }

        private Alias(int i, String str, t0 t0Var) {
            if (1 != (i & 1)) {
                f0.a(i, 1, ColorInfo$Alias$$serializer.INSTANCE.getDescriptor());
            }
            this.value = str;
        }

        private Alias(String str) {
            t.g(str, "value");
            this.value = str;
        }
    }

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final b serializer() {
            return new h("com.revenuecat.purchases.paywalls.components.properties.ColorInfo", P.b(ColorInfo.class), new c[]{P.b(Alias.class), P.b(Gradient.Linear.class), P.b(Gradient.Radial.class), P.b(Hex.class)}, new b[]{ColorInfo$Alias$$serializer.INSTANCE, ColorInfo$Gradient$Linear$$serializer.INSTANCE, ColorInfo$Gradient$Radial$$serializer.INSTANCE, ColorInfo$Hex$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    public interface Gradient extends ColorInfo {

        public static final class Radial implements Gradient {
            private final List points;
            public static final Companion Companion = new Companion(null);
            private static final b[] $childSerializers = {new sb.e(ColorInfo$Gradient$Point$$serializer.INSTANCE)};

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return ColorInfo$Gradient$Radial$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @e
            public /* synthetic */ Radial(int i, List list, t0 t0Var) {
                if (1 != (i & 1)) {
                    f0.a(i, 1, ColorInfo$Gradient$Radial$$serializer.INSTANCE.getDescriptor());
                }
                this.points = list;
            }

            public static final /* synthetic */ b[] access$get$childSerializers$cp() {
                return $childSerializers;
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Radial radial, d dVar, qb.e eVar) {
                dVar.k(eVar, 0, $childSerializers[0], radial.points);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Radial) && t.c(this.points, ((Radial) obj).points);
            }

            public final /* synthetic */ List getPoints() {
                return this.points;
            }

            public int hashCode() {
                return this.points.hashCode();
            }

            public String toString() {
                return "Radial(points=" + this.points + ')';
            }

            public Radial(List list) {
                t.g(list, "points");
                this.points = list;
            }
        }

        public static final class Linear implements Gradient {
            private final float degrees;
            private final List points;
            public static final Companion Companion = new Companion(null);
            private static final b[] $childSerializers = {null, new sb.e(ColorInfo$Gradient$Point$$serializer.INSTANCE)};

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return ColorInfo$Gradient$Linear$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public Linear(float f, List list) {
                t.g(list, "points");
                this.degrees = f;
                this.points = list;
            }

            public static final /* synthetic */ b[] access$get$childSerializers$cp() {
                return $childSerializers;
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Linear linear, d dVar, qb.e eVar) {
                ob.k[] kVarArr = $childSerializers;
                dVar.z(eVar, 0, linear.degrees);
                dVar.k(eVar, 1, kVarArr[1], linear.points);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Linear)) {
                    return false;
                }
                Linear linear = (Linear) obj;
                return Float.compare(this.degrees, linear.degrees) == 0 && t.c(this.points, linear.points);
            }

            public final /* synthetic */ float getDegrees() {
                return this.degrees;
            }

            public final /* synthetic */ List getPoints() {
                return this.points;
            }

            public int hashCode() {
                return (Float.hashCode(this.degrees) * 31) + this.points.hashCode();
            }

            public String toString() {
                return "Linear(degrees=" + this.degrees + ", points=" + this.points + ')';
            }

            @e
            public /* synthetic */ Linear(int i, float f, List list, t0 t0Var) {
                if (3 != (i & 3)) {
                    f0.a(i, 3, ColorInfo$Gradient$Linear$$serializer.INSTANCE.getDescriptor());
                }
                this.degrees = f;
                this.points = list;
            }
        }

        public static final class Point {
            public static final Companion Companion = new Companion(null);
            private final int color;
            private final float percent;

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return ColorInfo$Gradient$Point$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public Point(int i, float f) {
                this.color = i;
                this.percent = f;
            }

            public static /* synthetic */ void getColor$annotations() {
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Point point, d dVar, qb.e eVar) {
                dVar.k(eVar, 0, RgbaStringArgbColorIntDeserializer.INSTANCE, Integer.valueOf(point.color));
                dVar.z(eVar, 1, point.percent);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Point)) {
                    return false;
                }
                Point point = (Point) obj;
                return this.color == point.color && Float.compare(this.percent, point.percent) == 0;
            }

            public final /* synthetic */ int getColor() {
                return this.color;
            }

            public final /* synthetic */ float getPercent() {
                return this.percent;
            }

            public int hashCode() {
                return (this.color * 31) + Float.hashCode(this.percent);
            }

            public String toString() {
                return "Point(color=" + this.color + ", percent=" + this.percent + ')';
            }

            @e
            public /* synthetic */ Point(int i, int i2, float f, t0 t0Var) {
                if (3 != (i & 3)) {
                    f0.a(i, 3, ColorInfo$Gradient$Point$$serializer.INSTANCE.getDescriptor());
                }
                this.color = i2;
                this.percent = f;
            }
        }
    }

    public static final class Hex implements ColorInfo {
        public static final Companion Companion = new Companion(null);
        private final int value;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return ColorInfo$Hex$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Hex(int i) {
            this.value = i;
        }

        public static /* synthetic */ void getValue$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Hex hex, d dVar, qb.e eVar) {
            dVar.k(eVar, 0, RgbaStringArgbColorIntDeserializer.INSTANCE, Integer.valueOf(hex.value));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Hex) && this.value == ((Hex) obj).value;
        }

        public final /* synthetic */ int getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value;
        }

        public String toString() {
            return "Hex(value=" + this.value + ')';
        }

        @e
        public /* synthetic */ Hex(int i, int i2, t0 t0Var) {
            if (1 != (i & 1)) {
                f0.a(i, 1, ColorInfo$Hex$$serializer.INSTANCE.getDescriptor());
            }
            this.value = i2;
        }
    }
}
