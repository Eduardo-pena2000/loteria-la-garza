package com.revenuecat.purchases.ui.revenuecatui.utils;

import d1.H;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ParsedFont {
    public static final int $stable = 0;
    private final int resId;
    private final int style;
    private final int weight;

    public /* synthetic */ ParsedFont(int i, int i2, int i3, k kVar) {
        this(i, i2, i3);
    }

    public static /* synthetic */ ParsedFont copy-RetOiIg$default(ParsedFont parsedFont, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = parsedFont.resId;
        }
        if ((i4 & 2) != 0) {
            i2 = parsedFont.weight;
        }
        if ((i4 & 4) != 0) {
            i3 = parsedFont.style;
        }
        return parsedFont.copy-RetOiIg(i, i2, i3);
    }

    public final int component1() {
        return this.resId;
    }

    public final int component2() {
        return this.weight;
    }

    public final int component3-_-LCdwA() {
        return this.style;
    }

    public final ParsedFont copy-RetOiIg(int i, int i2, int i3) {
        return new ParsedFont(i, i2, i3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParsedFont)) {
            return false;
        }
        ParsedFont parsedFont = (ParsedFont) obj;
        return this.resId == parsedFont.resId && this.weight == parsedFont.weight && H.f(this.style, parsedFont.style);
    }

    public final int getResId() {
        return this.resId;
    }

    public final int getStyle-_-LCdwA() {
        return this.style;
    }

    public final int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.resId) * 31) + Integer.hashCode(this.weight)) * 31) + H.g(this.style);
    }

    public String toString() {
        return "ParsedFont(resId=" + this.resId + ", weight=" + this.weight + ", style=" + H.h(this.style) + ')';
    }

    private ParsedFont(int i, int i2, int i3) {
        this.resId = i;
        this.weight = i2;
        this.style = i3;
    }
}
