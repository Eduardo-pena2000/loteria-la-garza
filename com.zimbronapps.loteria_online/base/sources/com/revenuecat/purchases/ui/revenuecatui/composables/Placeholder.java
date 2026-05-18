package com.revenuecat.purchases.ui.revenuecatui.composables;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;
import n1.t;
import u0.l;
import u0.m;
import v0.E1;
import v0.Q;
import v0.i1;
import v0.j0;
import v0.k1;
import v0.l1;
import v0.r0;
import v0.t1;
import x0.c;
import z.a;
import z.b;
import z.h0;
import z.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Placeholder {
    public static final int $stable = 0;
    private final long color;
    private final a contentAlpha;
    private final Qa.a contentFadeTransitionSpec;
    private final PlaceholderHighlight highlight;
    private final a highlightProgress;
    private t lastLayoutDirection;
    private i1 lastOutline;
    private l lastSize;
    private final k1 paint;
    private final a placeholderAlpha;
    private final Qa.a placeholderFadeTransitionSpec;
    private final E1 shape;
    private final boolean visible;

    public static final class 1 extends u implements Qa.a {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(0);
        }

        public final h0 invoke() {
            return j.h(0.0f, 0.0f, (Object) null, 7, (Object) null);
        }
    }

    public static final class 2 extends u implements Qa.a {
        public static final 2 INSTANCE = new 2();

        public 2() {
            super(0);
        }

        public final h0 invoke() {
            return j.h(0.0f, 0.0f, (Object) null, 7, (Object) null);
        }
    }

    public /* synthetic */ Placeholder(boolean z, long j, E1 e1, PlaceholderHighlight placeholderHighlight, Qa.a aVar, Qa.a aVar2, k kVar) {
        this(z, j, e1, placeholderHighlight, aVar, aVar2);
    }

    private final boolean component1() {
        return this.visible;
    }

    private final long component2-0d7_KjU() {
        return this.color;
    }

    private final E1 component3() {
        return this.shape;
    }

    private final PlaceholderHighlight component4() {
        return this.highlight;
    }

    private final Qa.a component5() {
        return this.placeholderFadeTransitionSpec;
    }

    private final Qa.a component6() {
        return this.contentFadeTransitionSpec;
    }

    public static /* synthetic */ Placeholder copy-3IgeMak$default(Placeholder placeholder, boolean z, long j, E1 e1, PlaceholderHighlight placeholderHighlight, Qa.a aVar, Qa.a aVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = placeholder.visible;
        }
        if ((i & 2) != 0) {
            j = placeholder.color;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            e1 = placeholder.shape;
        }
        E1 e12 = e1;
        if ((i & 8) != 0) {
            placeholderHighlight = placeholder.highlight;
        }
        PlaceholderHighlight placeholderHighlight2 = placeholderHighlight;
        if ((i & 16) != 0) {
            aVar = placeholder.placeholderFadeTransitionSpec;
        }
        Qa.a aVar3 = aVar;
        if ((i & 32) != 0) {
            aVar2 = placeholder.contentFadeTransitionSpec;
        }
        return placeholder.copy-3IgeMak(z, j2, e12, placeholderHighlight2, aVar3, aVar2);
    }

    public final Placeholder copy-3IgeMak(boolean z, long j, E1 shape, PlaceholderHighlight placeholderHighlight, Qa.a placeholderFadeTransitionSpec, Qa.a contentFadeTransitionSpec) {
        kotlin.jvm.internal.t.g(shape, "shape");
        kotlin.jvm.internal.t.g(placeholderFadeTransitionSpec, "placeholderFadeTransitionSpec");
        kotlin.jvm.internal.t.g(contentFadeTransitionSpec, "contentFadeTransitionSpec");
        return new Placeholder(z, j, shape, placeholderHighlight, placeholderFadeTransitionSpec, contentFadeTransitionSpec, null);
    }

    public final void draw$revenuecatui_defaultsBc8Release(c cVar) {
        kotlin.jvm.internal.t.g(cVar, "<this>");
        float floatValue = ((Number) this.placeholderAlpha.m()).floatValue();
        float floatValue2 = ((Number) this.contentAlpha.m()).floatValue();
        if (floatValue2 > 0.01f) {
            this.paint.d(floatValue2);
            k1 k1Var = this.paint;
            j0 f = cVar.m1().f();
            f.w(m.c(cVar.e()), k1Var);
            cVar.B1();
            f.k();
        }
        if (floatValue > 0.01f) {
            this.paint.d(floatValue);
            k1 k1Var2 = this.paint;
            j0 f2 = cVar.m1().f();
            f2.w(m.c(cVar.e()), k1Var2);
            this.lastOutline = PlaceholderKt.access$drawPlaceholder-hpmOzss(cVar, this.shape, this.color, this.highlight, ((Number) this.highlightProgress.m()).floatValue(), this.lastOutline, this.lastLayoutDirection, this.lastSize);
            f2.k();
        }
        this.lastSize = l.c(cVar.e());
        this.lastLayoutDirection = cVar.getLayoutDirection();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) obj;
        return this.visible == placeholder.visible && r0.s(this.color, placeholder.color) && kotlin.jvm.internal.t.c(this.shape, placeholder.shape) && kotlin.jvm.internal.t.c(this.highlight, placeholder.highlight) && kotlin.jvm.internal.t.c(this.placeholderFadeTransitionSpec, placeholder.placeholderFadeTransitionSpec) && kotlin.jvm.internal.t.c(this.contentFadeTransitionSpec, placeholder.contentFadeTransitionSpec);
    }

    public int hashCode() {
        int hashCode = ((((Boolean.hashCode(this.visible) * 31) + r0.y(this.color)) * 31) + this.shape.hashCode()) * 31;
        PlaceholderHighlight placeholderHighlight = this.highlight;
        return ((((hashCode + (placeholderHighlight == null ? 0 : placeholderHighlight.hashCode())) * 31) + this.placeholderFadeTransitionSpec.hashCode()) * 31) + this.contentFadeTransitionSpec.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object startAnimation$revenuecatui_defaultsBc8Release(Ga.e r21) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.Placeholder.startAnimation$revenuecatui_defaultsBc8Release(Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object stopAnimation$revenuecatui_defaultsBc8Release(Ga.e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.revenuecat.purchases.ui.revenuecatui.composables.Placeholder$stopAnimation$1
            if (r0 == 0) goto L13
            r0 = r7
            com.revenuecat.purchases.ui.revenuecatui.composables.Placeholder$stopAnimation$1 r0 = (com.revenuecat.purchases.ui.revenuecatui.composables.Placeholder$stopAnimation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revenuecat.purchases.ui.revenuecatui.composables.Placeholder$stopAnimation$1 r0 = new com.revenuecat.purchases.ui.revenuecatui.composables.Placeholder$stopAnimation$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            Ca.t.b(r7)
            goto L73
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.L$0
            com.revenuecat.purchases.ui.revenuecatui.composables.Placeholder r2 = (com.revenuecat.purchases.ui.revenuecatui.composables.Placeholder) r2
            Ca.t.b(r7)
            goto L65
        L3f:
            java.lang.Object r2 = r0.L$0
            com.revenuecat.purchases.ui.revenuecatui.composables.Placeholder r2 = (com.revenuecat.purchases.ui.revenuecatui.composables.Placeholder) r2
            Ca.t.b(r7)
            goto L58
        L47:
            Ca.t.b(r7)
            z.a r7 = r6.placeholderAlpha
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r7.t(r0)
            if (r7 != r1) goto L57
            return r1
        L57:
            r2 = r6
        L58:
            z.a r7 = r2.contentAlpha
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r7 = r7.t(r0)
            if (r7 != r1) goto L65
            return r1
        L65:
            z.a r7 = r2.highlightProgress
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r7 = r7.t(r0)
            if (r7 != r1) goto L73
            return r1
        L73:
            Ca.I r7 = Ca.I.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.Placeholder.stopAnimation$revenuecatui_defaultsBc8Release(Ga.e):java.lang.Object");
    }

    public String toString() {
        return "Placeholder(visible=" + this.visible + ", color=" + r0.z(this.color) + ", shape=" + this.shape + ", highlight=" + this.highlight + ", placeholderFadeTransitionSpec=" + this.placeholderFadeTransitionSpec + ", contentFadeTransitionSpec=" + this.contentFadeTransitionSpec + ')';
    }

    private Placeholder(boolean z, long j, E1 shape, PlaceholderHighlight placeholderHighlight, Qa.a placeholderFadeTransitionSpec, Qa.a contentFadeTransitionSpec) {
        kotlin.jvm.internal.t.g(shape, "shape");
        kotlin.jvm.internal.t.g(placeholderFadeTransitionSpec, "placeholderFadeTransitionSpec");
        kotlin.jvm.internal.t.g(contentFadeTransitionSpec, "contentFadeTransitionSpec");
        this.visible = z;
        this.color = j;
        this.shape = shape;
        this.highlight = placeholderHighlight;
        this.placeholderFadeTransitionSpec = placeholderFadeTransitionSpec;
        this.contentFadeTransitionSpec = contentFadeTransitionSpec;
        this.placeholderAlpha = b.b(z ? 1.0f : 0.0f, 0.0f, 2, (Object) null);
        this.contentAlpha = b.b(z ? 0.0f : 1.0f, 0.0f, 2, (Object) null);
        this.highlightProgress = b.b(0.0f, 0.0f, 2, (Object) null);
        k1 a = Q.a();
        a.k(true);
        a.z(l1.a.a());
        a.b(a.j());
        this.paint = a;
    }

    public /* synthetic */ Placeholder(boolean z, long j, E1 e1, PlaceholderHighlight placeholderHighlight, Qa.a aVar, Qa.a aVar2, int i, k kVar) {
        this(z, j, (i & 4) != 0 ? t1.a() : e1, (i & 8) != 0 ? null : placeholderHighlight, (i & 16) != 0 ? 1.INSTANCE : aVar, (i & 32) != 0 ? 2.INSTANCE : aVar2, null);
    }
}
