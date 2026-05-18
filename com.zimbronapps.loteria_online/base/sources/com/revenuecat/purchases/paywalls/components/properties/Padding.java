package com.revenuecat.purchases.paywalls.components.properties;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.k;
import ob.b;
import qb.e;
import rb.d;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Padding {
    private final double bottom;
    private final double leading;
    private final double top;
    private final double trailing;
    public static final Companion Companion = new Companion(null);
    private static final Padding zero = new Padding(0.0d, 0.0d, 0.0d, 0.0d);
    private static final Padding default = new Padding(10.0d, 10.0d, 20.0d, 20.0d);

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final /* synthetic */ Padding getDefault() {
            return Padding.access$getDefault$cp();
        }

        public final /* synthetic */ Padding getZero() {
            return Padding.access$getZero$cp();
        }

        public final b serializer() {
            return Padding$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Padding() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 15, (k) null);
    }

    public static final /* synthetic */ Padding access$getDefault$cp() {
        return default;
    }

    public static final /* synthetic */ Padding access$getZero$cp() {
        return zero;
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Padding padding, d dVar, e eVar) {
        if (dVar.e(eVar, 0) || Double.compare(padding.top, 0.0d) != 0) {
            dVar.q(eVar, 0, padding.top);
        }
        if (dVar.e(eVar, 1) || Double.compare(padding.bottom, 0.0d) != 0) {
            dVar.q(eVar, 1, padding.bottom);
        }
        if (dVar.e(eVar, 2) || Double.compare(padding.leading, 0.0d) != 0) {
            dVar.q(eVar, 2, padding.leading);
        }
        if (!dVar.e(eVar, 3) && Double.compare(padding.trailing, 0.0d) == 0) {
            return;
        }
        dVar.q(eVar, 3, padding.trailing);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Padding)) {
            return false;
        }
        Padding padding = (Padding) obj;
        return Double.compare(this.top, padding.top) == 0 && Double.compare(this.bottom, padding.bottom) == 0 && Double.compare(this.leading, padding.leading) == 0 && Double.compare(this.trailing, padding.trailing) == 0;
    }

    public final /* synthetic */ double getBottom() {
        return this.bottom;
    }

    public final /* synthetic */ double getLeading() {
        return this.leading;
    }

    public final /* synthetic */ double getTop() {
        return this.top;
    }

    public final /* synthetic */ double getTrailing() {
        return this.trailing;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.top) * 31) + Double.hashCode(this.bottom)) * 31) + Double.hashCode(this.leading)) * 31) + Double.hashCode(this.trailing);
    }

    public String toString() {
        return "Padding(top=" + this.top + ", bottom=" + this.bottom + ", leading=" + this.leading + ", trailing=" + this.trailing + ')';
    }

    public Padding(double d, double d2, double d3, double d4) {
        this.top = d;
        this.bottom = d2;
        this.leading = d3;
        this.trailing = d4;
    }

    @Ca.e
    public /* synthetic */ Padding(int i, double d, double d2, double d3, double d4, t0 t0Var) {
        if ((i & 1) == 0) {
            this.top = 0.0d;
        } else {
            this.top = d;
        }
        if ((i & 2) == 0) {
            this.bottom = 0.0d;
        } else {
            this.bottom = d2;
        }
        if ((i & 4) == 0) {
            this.leading = 0.0d;
        } else {
            this.leading = d3;
        }
        if ((i & 8) == 0) {
            this.trailing = 0.0d;
        } else {
            this.trailing = d4;
        }
    }

    public /* synthetic */ Padding(double d, double d2, double d3, double d4, int i, k kVar) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) == 0 ? d4 : 0.0d);
    }
}
