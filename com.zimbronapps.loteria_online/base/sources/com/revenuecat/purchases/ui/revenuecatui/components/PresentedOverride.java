package com.revenuecat.purchases.ui.revenuecatui.components;

import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PresentedOverride {
    public static final int $stable = 8;
    private final List conditions;
    private final PresentedPartial properties;

    public PresentedOverride(List conditions, PresentedPartial properties) {
        t.g(conditions, "conditions");
        t.g(properties, "properties");
        this.conditions = conditions;
        this.properties = properties;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresentedOverride)) {
            return false;
        }
        PresentedOverride presentedOverride = (PresentedOverride) obj;
        return t.c(this.conditions, presentedOverride.conditions) && t.c(this.properties, presentedOverride.properties);
    }

    public final /* synthetic */ List getConditions() {
        return this.conditions;
    }

    public final /* synthetic */ PresentedPartial getProperties() {
        return this.properties;
    }

    public int hashCode() {
        return (this.conditions.hashCode() * 31) + this.properties.hashCode();
    }

    public String toString() {
        return "PresentedOverride(conditions=" + this.conditions + ", properties=" + this.properties + ')';
    }
}
