package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.f0;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class TabControlToggleComponent implements PaywallComponent {
    public static final Companion Companion = new Companion(null);
    private final boolean defaultValue;
    private final ColorScheme thumbColorOff;
    private final ColorScheme thumbColorOn;
    private final ColorScheme trackColorOff;
    private final ColorScheme trackColorOn;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return TabControlToggleComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @e
    public /* synthetic */ TabControlToggleComponent(int i, boolean z, ColorScheme colorScheme, ColorScheme colorScheme2, ColorScheme colorScheme3, ColorScheme colorScheme4, t0 t0Var) {
        if (31 != (i & 31)) {
            f0.a(i, 31, TabControlToggleComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.defaultValue = z;
        this.thumbColorOn = colorScheme;
        this.thumbColorOff = colorScheme2;
        this.trackColorOn = colorScheme3;
        this.trackColorOff = colorScheme4;
    }

    public static /* synthetic */ void getDefaultValue$annotations() {
    }

    public static /* synthetic */ void getThumbColorOff$annotations() {
    }

    public static /* synthetic */ void getThumbColorOn$annotations() {
    }

    public static /* synthetic */ void getTrackColorOff$annotations() {
    }

    public static /* synthetic */ void getTrackColorOn$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(TabControlToggleComponent tabControlToggleComponent, d dVar, qb.e eVar) {
        dVar.B(eVar, 0, tabControlToggleComponent.defaultValue);
        ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
        dVar.k(eVar, 1, colorScheme$$serializer, tabControlToggleComponent.thumbColorOn);
        dVar.k(eVar, 2, colorScheme$$serializer, tabControlToggleComponent.thumbColorOff);
        dVar.k(eVar, 3, colorScheme$$serializer, tabControlToggleComponent.trackColorOn);
        dVar.k(eVar, 4, colorScheme$$serializer, tabControlToggleComponent.trackColorOff);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabControlToggleComponent)) {
            return false;
        }
        TabControlToggleComponent tabControlToggleComponent = (TabControlToggleComponent) obj;
        return this.defaultValue == tabControlToggleComponent.defaultValue && t.c(this.thumbColorOn, tabControlToggleComponent.thumbColorOn) && t.c(this.thumbColorOff, tabControlToggleComponent.thumbColorOff) && t.c(this.trackColorOn, tabControlToggleComponent.trackColorOn) && t.c(this.trackColorOff, tabControlToggleComponent.trackColorOff);
    }

    public final /* synthetic */ boolean getDefaultValue() {
        return this.defaultValue;
    }

    public final /* synthetic */ ColorScheme getThumbColorOff() {
        return this.thumbColorOff;
    }

    public final /* synthetic */ ColorScheme getThumbColorOn() {
        return this.thumbColorOn;
    }

    public final /* synthetic */ ColorScheme getTrackColorOff() {
        return this.trackColorOff;
    }

    public final /* synthetic */ ColorScheme getTrackColorOn() {
        return this.trackColorOn;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.defaultValue) * 31) + this.thumbColorOn.hashCode()) * 31) + this.thumbColorOff.hashCode()) * 31) + this.trackColorOn.hashCode()) * 31) + this.trackColorOff.hashCode();
    }

    public String toString() {
        return "TabControlToggleComponent(defaultValue=" + this.defaultValue + ", thumbColorOn=" + this.thumbColorOn + ", thumbColorOff=" + this.thumbColorOff + ", trackColorOn=" + this.trackColorOn + ", trackColorOff=" + this.trackColorOff + ')';
    }

    public TabControlToggleComponent(boolean z, ColorScheme colorScheme, ColorScheme colorScheme2, ColorScheme colorScheme3, ColorScheme colorScheme4) {
        t.g(colorScheme, "thumbColorOn");
        t.g(colorScheme2, "thumbColorOff");
        t.g(colorScheme3, "trackColorOn");
        t.g(colorScheme4, "trackColorOff");
        this.defaultValue = z;
        this.thumbColorOn = colorScheme;
        this.thumbColorOff = colorScheme2;
        this.trackColorOn = colorScheme3;
        this.trackColorOff = colorScheme4;
    }
}
