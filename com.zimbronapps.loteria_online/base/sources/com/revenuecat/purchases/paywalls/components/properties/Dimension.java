package com.revenuecat.purchases.paywalls.components.properties;

import Ca.e;
import Xa.c;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import java.lang.annotation.Annotation;
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
public interface Dimension {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final b serializer() {
            return new h("com.revenuecat.purchases.paywalls.components.properties.Dimension", P.b(Dimension.class), new c[]{P.b(Horizontal.class), P.b(Vertical.class), P.b(ZLayer.class)}, new b[]{Dimension$Horizontal$$serializer.INSTANCE, Dimension$Vertical$$serializer.INSTANCE, Dimension$ZLayer$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    public static final class Horizontal implements Dimension {
        public static final Companion Companion = new Companion(null);
        private final VerticalAlignment alignment;
        private final FlexDistribution distribution;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return Dimension$Horizontal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @e
        public /* synthetic */ Horizontal(int i, VerticalAlignment verticalAlignment, FlexDistribution flexDistribution, t0 t0Var) {
            if (3 != (i & 3)) {
                f0.a(i, 3, Dimension$Horizontal$$serializer.INSTANCE.getDescriptor());
            }
            this.alignment = verticalAlignment;
            this.distribution = flexDistribution;
        }

        public static /* synthetic */ Horizontal copy$default(Horizontal horizontal, VerticalAlignment verticalAlignment, FlexDistribution flexDistribution, int i, Object obj) {
            if ((i & 1) != 0) {
                verticalAlignment = horizontal.alignment;
            }
            if ((i & 2) != 0) {
                flexDistribution = horizontal.distribution;
            }
            return horizontal.copy(verticalAlignment, flexDistribution);
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Horizontal horizontal, d dVar, qb.e eVar) {
            dVar.k(eVar, 0, VerticalAlignmentDeserializer.INSTANCE, horizontal.alignment);
            dVar.k(eVar, 1, FlexDistributionDeserializer.INSTANCE, horizontal.distribution);
        }

        public final VerticalAlignment component1() {
            return this.alignment;
        }

        public final FlexDistribution component2() {
            return this.distribution;
        }

        public final Horizontal copy(VerticalAlignment verticalAlignment, FlexDistribution flexDistribution) {
            t.g(verticalAlignment, "alignment");
            t.g(flexDistribution, "distribution");
            return new Horizontal(verticalAlignment, flexDistribution);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Horizontal)) {
                return false;
            }
            Horizontal horizontal = (Horizontal) obj;
            return this.alignment == horizontal.alignment && this.distribution == horizontal.distribution;
        }

        public final /* synthetic */ VerticalAlignment getAlignment() {
            return this.alignment;
        }

        public final /* synthetic */ FlexDistribution getDistribution() {
            return this.distribution;
        }

        public int hashCode() {
            return (this.alignment.hashCode() * 31) + this.distribution.hashCode();
        }

        public String toString() {
            return "Horizontal(alignment=" + this.alignment + ", distribution=" + this.distribution + ')';
        }

        public Horizontal(VerticalAlignment verticalAlignment, FlexDistribution flexDistribution) {
            t.g(verticalAlignment, "alignment");
            t.g(flexDistribution, "distribution");
            this.alignment = verticalAlignment;
            this.distribution = flexDistribution;
        }
    }

    public static final class Vertical implements Dimension {
        public static final Companion Companion = new Companion(null);
        private final HorizontalAlignment alignment;
        private final FlexDistribution distribution;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return Dimension$Vertical$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @e
        public /* synthetic */ Vertical(int i, HorizontalAlignment horizontalAlignment, FlexDistribution flexDistribution, t0 t0Var) {
            if (3 != (i & 3)) {
                f0.a(i, 3, Dimension$Vertical$$serializer.INSTANCE.getDescriptor());
            }
            this.alignment = horizontalAlignment;
            this.distribution = flexDistribution;
        }

        public static /* synthetic */ Vertical copy$default(Vertical vertical, HorizontalAlignment horizontalAlignment, FlexDistribution flexDistribution, int i, Object obj) {
            if ((i & 1) != 0) {
                horizontalAlignment = vertical.alignment;
            }
            if ((i & 2) != 0) {
                flexDistribution = vertical.distribution;
            }
            return vertical.copy(horizontalAlignment, flexDistribution);
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Vertical vertical, d dVar, qb.e eVar) {
            dVar.k(eVar, 0, HorizontalAlignmentDeserializer.INSTANCE, vertical.alignment);
            dVar.k(eVar, 1, FlexDistributionDeserializer.INSTANCE, vertical.distribution);
        }

        public final HorizontalAlignment component1() {
            return this.alignment;
        }

        public final FlexDistribution component2() {
            return this.distribution;
        }

        public final Vertical copy(HorizontalAlignment horizontalAlignment, FlexDistribution flexDistribution) {
            t.g(horizontalAlignment, "alignment");
            t.g(flexDistribution, "distribution");
            return new Vertical(horizontalAlignment, flexDistribution);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Vertical)) {
                return false;
            }
            Vertical vertical = (Vertical) obj;
            return this.alignment == vertical.alignment && this.distribution == vertical.distribution;
        }

        public final /* synthetic */ HorizontalAlignment getAlignment() {
            return this.alignment;
        }

        public final /* synthetic */ FlexDistribution getDistribution() {
            return this.distribution;
        }

        public int hashCode() {
            return (this.alignment.hashCode() * 31) + this.distribution.hashCode();
        }

        public String toString() {
            return "Vertical(alignment=" + this.alignment + ", distribution=" + this.distribution + ')';
        }

        public Vertical(HorizontalAlignment horizontalAlignment, FlexDistribution flexDistribution) {
            t.g(horizontalAlignment, "alignment");
            t.g(flexDistribution, "distribution");
            this.alignment = horizontalAlignment;
            this.distribution = flexDistribution;
        }
    }

    public static final class ZLayer implements Dimension {
        public static final Companion Companion = new Companion(null);
        private final TwoDimensionalAlignment alignment;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return Dimension$ZLayer$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @e
        public /* synthetic */ ZLayer(int i, TwoDimensionalAlignment twoDimensionalAlignment, t0 t0Var) {
            if (1 != (i & 1)) {
                f0.a(i, 1, Dimension$ZLayer$$serializer.INSTANCE.getDescriptor());
            }
            this.alignment = twoDimensionalAlignment;
        }

        public static /* synthetic */ ZLayer copy$default(ZLayer zLayer, TwoDimensionalAlignment twoDimensionalAlignment, int i, Object obj) {
            if ((i & 1) != 0) {
                twoDimensionalAlignment = zLayer.alignment;
            }
            return zLayer.copy(twoDimensionalAlignment);
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(ZLayer zLayer, d dVar, qb.e eVar) {
            dVar.k(eVar, 0, TwoDimensionalAlignmentDeserializer.INSTANCE, zLayer.alignment);
        }

        public final TwoDimensionalAlignment component1() {
            return this.alignment;
        }

        public final ZLayer copy(TwoDimensionalAlignment twoDimensionalAlignment) {
            t.g(twoDimensionalAlignment, "alignment");
            return new ZLayer(twoDimensionalAlignment);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ZLayer) && this.alignment == ((ZLayer) obj).alignment;
        }

        public final /* synthetic */ TwoDimensionalAlignment getAlignment() {
            return this.alignment;
        }

        public int hashCode() {
            return this.alignment.hashCode();
        }

        public String toString() {
            return "ZLayer(alignment=" + this.alignment + ')';
        }

        public ZLayer(TwoDimensionalAlignment twoDimensionalAlignment) {
            t.g(twoDimensionalAlignment, "alignment");
            this.alignment = twoDimensionalAlignment;
        }
    }
}
