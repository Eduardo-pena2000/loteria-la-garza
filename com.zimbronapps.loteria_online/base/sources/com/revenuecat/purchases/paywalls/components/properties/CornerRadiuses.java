package com.revenuecat.purchases.paywalls.components.properties;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.k;
import ob.b;
import qb.e;
import rb.d;
import sb.f0;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface CornerRadiuses {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final b serializer() {
            return CornerRadiusesSerializer.INSTANCE;
        }
    }

    public static final class Dp implements CornerRadiuses {
        public static final Companion Companion = new Companion(null);
        private static final Dp default;
        private static final Dp zero;
        private final double bottomLeading;
        private final double bottomTrailing;
        private final double topLeading;
        private final double topTrailing;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dp getDefault() {
                return Dp.access$getDefault$cp();
            }

            public final /* synthetic */ Dp getZero() {
                return Dp.access$getZero$cp();
            }

            public final b serializer() {
                return CornerRadiuses$Dp$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        static {
            Dp dp = new Dp(0.0d, 0.0d, 0.0d, 0.0d);
            zero = dp;
            default = dp;
        }

        public Dp(double d, double d2, double d3, double d4) {
            this.topLeading = d;
            this.topTrailing = d2;
            this.bottomLeading = d3;
            this.bottomTrailing = d4;
        }

        public static final /* synthetic */ Dp access$getDefault$cp() {
            return default;
        }

        public static final /* synthetic */ Dp access$getZero$cp() {
            return zero;
        }

        public static /* synthetic */ Dp copy$default(Dp dp, double d, double d2, double d3, double d4, int i, Object obj) {
            return dp.copy((i & 1) != 0 ? dp.topLeading : d, (i & 2) != 0 ? dp.topTrailing : d2, (i & 4) != 0 ? dp.bottomLeading : d3, (i & 8) != 0 ? dp.bottomTrailing : d4);
        }

        public static /* synthetic */ void getBottomLeading$annotations() {
        }

        public static /* synthetic */ void getBottomTrailing$annotations() {
        }

        public static /* synthetic */ void getTopLeading$annotations() {
        }

        public static /* synthetic */ void getTopTrailing$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Dp dp, d dVar, e eVar) {
            dVar.q(eVar, 0, dp.topLeading);
            dVar.q(eVar, 1, dp.topTrailing);
            dVar.q(eVar, 2, dp.bottomLeading);
            dVar.q(eVar, 3, dp.bottomTrailing);
        }

        public final Dp copy(double d, double d2, double d3, double d4) {
            return new Dp(d, d2, d3, d4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dp)) {
                return false;
            }
            Dp dp = (Dp) obj;
            return Double.compare(this.topLeading, dp.topLeading) == 0 && Double.compare(this.topTrailing, dp.topTrailing) == 0 && Double.compare(this.bottomLeading, dp.bottomLeading) == 0 && Double.compare(this.bottomTrailing, dp.bottomTrailing) == 0;
        }

        public final /* synthetic */ double getBottomLeading() {
            return this.bottomLeading;
        }

        public final /* synthetic */ double getBottomTrailing() {
            return this.bottomTrailing;
        }

        public final /* synthetic */ double getTopLeading() {
            return this.topLeading;
        }

        public final /* synthetic */ double getTopTrailing() {
            return this.topTrailing;
        }

        public int hashCode() {
            return (((((Double.hashCode(this.topLeading) * 31) + Double.hashCode(this.topTrailing)) * 31) + Double.hashCode(this.bottomLeading)) * 31) + Double.hashCode(this.bottomTrailing);
        }

        public String toString() {
            return "Dp(topLeading=" + this.topLeading + ", topTrailing=" + this.topTrailing + ", bottomLeading=" + this.bottomLeading + ", bottomTrailing=" + this.bottomTrailing + ')';
        }

        @Ca.e
        public /* synthetic */ Dp(int i, double d, double d2, double d3, double d4, t0 t0Var) {
            if (15 != (i & 15)) {
                f0.a(i, 15, CornerRadiuses$Dp$$serializer.INSTANCE.getDescriptor());
            }
            this.topLeading = d;
            this.topTrailing = d2;
            this.bottomLeading = d3;
            this.bottomTrailing = d4;
        }

        public Dp(double d) {
            this(d, d, d, d);
        }
    }

    public static final class Percentage implements CornerRadiuses {
        public static final Companion Companion = new Companion(null);
        private final int bottomLeading;
        private final int bottomTrailing;
        private final int topLeading;
        private final int topTrailing;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return CornerRadiuses$Percentage$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Percentage(int i, int i2, int i3, int i4) {
            this.topLeading = i;
            this.topTrailing = i2;
            this.bottomLeading = i3;
            this.bottomTrailing = i4;
        }

        public static /* synthetic */ void getBottomLeading$annotations() {
        }

        public static /* synthetic */ void getBottomTrailing$annotations() {
        }

        public static /* synthetic */ void getTopLeading$annotations() {
        }

        public static /* synthetic */ void getTopTrailing$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Percentage percentage, d dVar, e eVar) {
            dVar.n(eVar, 0, percentage.topLeading);
            dVar.n(eVar, 1, percentage.topTrailing);
            dVar.n(eVar, 2, percentage.bottomLeading);
            dVar.n(eVar, 3, percentage.bottomTrailing);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Percentage)) {
                return false;
            }
            Percentage percentage = (Percentage) obj;
            return this.topLeading == percentage.topLeading && this.topTrailing == percentage.topTrailing && this.bottomLeading == percentage.bottomLeading && this.bottomTrailing == percentage.bottomTrailing;
        }

        public final /* synthetic */ int getBottomLeading() {
            return this.bottomLeading;
        }

        public final /* synthetic */ int getBottomTrailing() {
            return this.bottomTrailing;
        }

        public final /* synthetic */ int getTopLeading() {
            return this.topLeading;
        }

        public final /* synthetic */ int getTopTrailing() {
            return this.topTrailing;
        }

        public int hashCode() {
            return (((((this.topLeading * 31) + this.topTrailing) * 31) + this.bottomLeading) * 31) + this.bottomTrailing;
        }

        public String toString() {
            return "Percentage(topLeading=" + this.topLeading + ", topTrailing=" + this.topTrailing + ", bottomLeading=" + this.bottomLeading + ", bottomTrailing=" + this.bottomTrailing + ')';
        }

        @Ca.e
        public /* synthetic */ Percentage(int i, int i2, int i3, int i4, int i5, t0 t0Var) {
            if (15 != (i & 15)) {
                f0.a(i, 15, CornerRadiuses$Percentage$$serializer.INSTANCE.getDescriptor());
            }
            this.topLeading = i2;
            this.topTrailing = i3;
            this.bottomLeading = i4;
            this.bottomTrailing = i5;
        }

        public Percentage(int i) {
            this(i, i, i, i);
        }
    }
}
