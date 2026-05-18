package com.revenuecat.purchases.ui.revenuecatui.components.style;

import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import java.util.Date;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CountdownComponentStyle implements ComponentStyle {
    public static final int $stable = 0;
    private final CountdownComponent.CountFrom countFrom;
    private final StackComponentStyle countdownStackComponentStyle;
    private final Date date;
    private final StackComponentStyle endStackComponentStyle;
    private final StackComponentStyle fallbackStackComponentStyle;
    private final Size size;
    private final boolean visible;

    public CountdownComponentStyle(Date date, CountdownComponent.CountFrom countFrom, StackComponentStyle countdownStackComponentStyle, StackComponentStyle stackComponentStyle, StackComponentStyle stackComponentStyle2) {
        t.g(date, "date");
        t.g(countFrom, "countFrom");
        t.g(countdownStackComponentStyle, "countdownStackComponentStyle");
        this.date = date;
        this.countFrom = countFrom;
        this.countdownStackComponentStyle = countdownStackComponentStyle;
        this.endStackComponentStyle = stackComponentStyle;
        this.fallbackStackComponentStyle = stackComponentStyle2;
        this.visible = countdownStackComponentStyle.getVisible();
        this.size = countdownStackComponentStyle.getSize();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountdownComponentStyle)) {
            return false;
        }
        CountdownComponentStyle countdownComponentStyle = (CountdownComponentStyle) obj;
        return t.c(this.date, countdownComponentStyle.date) && this.countFrom == countdownComponentStyle.countFrom && t.c(this.countdownStackComponentStyle, countdownComponentStyle.countdownStackComponentStyle) && t.c(this.endStackComponentStyle, countdownComponentStyle.endStackComponentStyle) && t.c(this.fallbackStackComponentStyle, countdownComponentStyle.fallbackStackComponentStyle);
    }

    public final /* synthetic */ CountdownComponent.CountFrom getCountFrom() {
        return this.countFrom;
    }

    public final /* synthetic */ StackComponentStyle getCountdownStackComponentStyle() {
        return this.countdownStackComponentStyle;
    }

    public final /* synthetic */ Date getDate() {
        return this.date;
    }

    public final /* synthetic */ StackComponentStyle getEndStackComponentStyle() {
        return this.endStackComponentStyle;
    }

    public final /* synthetic */ StackComponentStyle getFallbackStackComponentStyle() {
        return this.fallbackStackComponentStyle;
    }

    public Size getSize() {
        return this.size;
    }

    public boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int hashCode = ((((this.date.hashCode() * 31) + this.countFrom.hashCode()) * 31) + this.countdownStackComponentStyle.hashCode()) * 31;
        StackComponentStyle stackComponentStyle = this.endStackComponentStyle;
        int hashCode2 = (hashCode + (stackComponentStyle == null ? 0 : stackComponentStyle.hashCode())) * 31;
        StackComponentStyle stackComponentStyle2 = this.fallbackStackComponentStyle;
        return hashCode2 + (stackComponentStyle2 != null ? stackComponentStyle2.hashCode() : 0);
    }

    public String toString() {
        return "CountdownComponentStyle(date=" + this.date + ", countFrom=" + this.countFrom + ", countdownStackComponentStyle=" + this.countdownStackComponentStyle + ", endStackComponentStyle=" + this.endStackComponentStyle + ", fallbackStackComponentStyle=" + this.fallbackStackComponentStyle + ')';
    }
}
