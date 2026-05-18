package com.revenuecat.purchases.ui.revenuecatui.composables;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import v0.F1;
import v0.h0;
import v0.r0;
import z.M;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Fade implements PlaceholderHighlight {
    public static final int $stable = M.d;
    private final M animationSpec;
    private final F1 brush;
    private final long highlightColor;

    public /* synthetic */ Fade(long j, M m, k kVar) {
        this(j, m);
    }

    private final long component1-0d7_KjU() {
        return this.highlightColor;
    }

    public static /* synthetic */ Fade copy-DxMtmZc$default(Fade fade, long j, M m, int i, Object obj) {
        if ((i & 1) != 0) {
            j = fade.highlightColor;
        }
        if ((i & 2) != 0) {
            m = fade.animationSpec;
        }
        return fade.copy-DxMtmZc(j, m);
    }

    public float alpha(float f) {
        return f;
    }

    public h0 brush-d16Qtg0(float f, long j) {
        return this.brush;
    }

    public final M component2() {
        return this.animationSpec;
    }

    public final Fade copy-DxMtmZc(long j, M animationSpec) {
        t.g(animationSpec, "animationSpec");
        return new Fade(j, animationSpec, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fade)) {
            return false;
        }
        Fade fade = (Fade) obj;
        return r0.s(this.highlightColor, fade.highlightColor) && t.c(this.animationSpec, fade.animationSpec);
    }

    public M getAnimationSpec() {
        return this.animationSpec;
    }

    public int hashCode() {
        return (r0.y(this.highlightColor) * 31) + this.animationSpec.hashCode();
    }

    public String toString() {
        return "Fade(highlightColor=" + r0.z(this.highlightColor) + ", animationSpec=" + this.animationSpec + ')';
    }

    private Fade(long j, M animationSpec) {
        t.g(animationSpec, "animationSpec");
        this.highlightColor = j;
        this.animationSpec = animationSpec;
        this.brush = new F1(j, (k) null);
    }
}
