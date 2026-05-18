package com.revenuecat.purchases.paywalls.components.properties;

import Ca.e;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.f0;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Size {
    public static final Companion Companion = new Companion(null);
    private final SizeConstraint height;
    private final SizeConstraint width;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return Size$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @e
    public /* synthetic */ Size(int i, SizeConstraint sizeConstraint, SizeConstraint sizeConstraint2, t0 t0Var) {
        if (3 != (i & 3)) {
            f0.a(i, 3, Size$$serializer.INSTANCE.getDescriptor());
        }
        this.width = sizeConstraint;
        this.height = sizeConstraint2;
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Size size, d dVar, qb.e eVar) {
        SizeConstraintDeserializer sizeConstraintDeserializer = SizeConstraintDeserializer.INSTANCE;
        dVar.k(eVar, 0, sizeConstraintDeserializer, size.width);
        dVar.k(eVar, 1, sizeConstraintDeserializer, size.height);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return t.c(this.width, size.width) && t.c(this.height, size.height);
    }

    public final /* synthetic */ SizeConstraint getHeight() {
        return this.height;
    }

    public final /* synthetic */ SizeConstraint getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (this.width.hashCode() * 31) + this.height.hashCode();
    }

    public String toString() {
        return "Size(width=" + this.width + ", height=" + this.height + ')';
    }

    public Size(SizeConstraint sizeConstraint, SizeConstraint sizeConstraint2) {
        t.g(sizeConstraint, "width");
        t.g(sizeConstraint2, "height");
        this.width = sizeConstraint;
        this.height = sizeConstraint2;
    }
}
