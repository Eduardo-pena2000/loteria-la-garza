package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import Ca.I;
import Ca.o;
import M.e;
import M.i;
import Qa.q;
import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import kotlin.jvm.internal.u;
import n1.h;
import n1.t;
import u0.l;
import v0.E1;
import v0.m1;
import v0.t1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class ShapeKt {
    private static final float SCALE_Y_OFFSET_CONCAVE_CONVEX = 0.1f;

    public static final class 1 extends u implements q {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(3);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke-12SF9DM((m1) obj, ((l) obj2).m(), (t) obj3);
            return I.a;
        }

        public final void invoke-12SF9DM(m1 $receiver, long j, t tVar) {
            kotlin.jvm.internal.t.g($receiver, "$this$$receiver");
            kotlin.jvm.internal.t.g(tVar, "<anonymous parameter 1>");
            float g = l.g(j) * 0.1f * 2.0f;
            $receiver.s(0.0f, 0.0f);
            $receiver.w(l.i(j), 0.0f);
            $receiver.w(l.i(j), l.g(j));
            $receiver.k(l.i(j) / 2, l.g(j) - g, 0.0f, l.g(j));
            $receiver.w(0.0f, 0.0f);
        }
    }

    public static final class 2 extends u implements q {
        public static final 2 INSTANCE = new 2();

        public 2() {
            super(3);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke-12SF9DM((m1) obj, ((l) obj2).m(), (t) obj3);
            return I.a;
        }

        public final void invoke-12SF9DM(m1 $receiver, long j, t tVar) {
            kotlin.jvm.internal.t.g($receiver, "$this$$receiver");
            kotlin.jvm.internal.t.g(tVar, "<anonymous parameter 1>");
            float g = l.g(j) * 0.1f;
            $receiver.s(0.0f, 0.0f);
            $receiver.w(l.i(j), 0.0f);
            $receiver.w(l.i(j), l.g(j) - g);
            $receiver.k(l.i(j) / 2, l.g(j) + g, 0.0f, l.g(j) - g);
            $receiver.w(0.0f, 0.0f);
        }
    }

    private static final E1 convertCornerRadiusesToShape(CornerRadiuses cornerRadiuses) {
        if (cornerRadiuses instanceof CornerRadiuses.Percentage) {
            CornerRadiuses.Percentage percentage = (CornerRadiuses.Percentage) cornerRadiuses;
            return i.b(percentage.getTopLeading(), percentage.getTopTrailing(), percentage.getBottomTrailing(), percentage.getBottomLeading());
        }
        if (!(cornerRadiuses instanceof CornerRadiuses.Dp)) {
            throw new o();
        }
        CornerRadiuses.Dp dp = (CornerRadiuses.Dp) cornerRadiuses;
        return i.e(h.g((float) dp.getTopLeading()), h.g((float) dp.getTopTrailing()), h.g((float) dp.getBottomTrailing()), h.g((float) dp.getBottomLeading()));
    }

    public static final /* synthetic */ E1 toShape(Shape shape) {
        kotlin.jvm.internal.t.g(shape, "<this>");
        return convertCornerRadiusesToShape(shape.getCornerRadiuses());
    }

    public static final /* synthetic */ E1 toShape(MaskShape maskShape) {
        E1 convertCornerRadiusesToShape;
        kotlin.jvm.internal.t.g(maskShape, "<this>");
        if (maskShape instanceof MaskShape.Rectangle) {
            CornerRadiuses corners = ((MaskShape.Rectangle) maskShape).getCorners();
            return (corners == null || (convertCornerRadiusesToShape = convertCornerRadiusesToShape(corners)) == null) ? t1.a() : convertCornerRadiusesToShape;
        }
        if (maskShape instanceof MaskShape.Concave) {
            return new e(1.INSTANCE);
        }
        if (maskShape instanceof MaskShape.Convex) {
            return new e(2.INSTANCE);
        }
        if (maskShape instanceof MaskShape.Circle) {
            return i.g();
        }
        throw new o();
    }
}
