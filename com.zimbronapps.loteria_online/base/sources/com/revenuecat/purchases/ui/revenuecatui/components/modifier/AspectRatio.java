package com.revenuecat.purchases.ui.revenuecatui.components.modifier;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AspectRatio {
    public static final int $stable = 0;
    private final boolean matchHeightConstraintsFirst;
    private final float ratio;

    public AspectRatio(float f, boolean z) {
        this.ratio = f;
        this.matchHeightConstraintsFirst = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AspectRatio)) {
            return false;
        }
        AspectRatio aspectRatio = (AspectRatio) obj;
        return Float.compare(this.ratio, aspectRatio.ratio) == 0 && this.matchHeightConstraintsFirst == aspectRatio.matchHeightConstraintsFirst;
    }

    public final /* synthetic */ boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    public final /* synthetic */ float getRatio() {
        return this.ratio;
    }

    public int hashCode() {
        return (Float.hashCode(this.ratio) * 31) + Boolean.hashCode(this.matchHeightConstraintsFirst);
    }

    public String toString() {
        return "AspectRatio(ratio=" + this.ratio + ", matchHeightConstraintsFirst=" + this.matchHeightConstraintsFirst + ')';
    }
}
