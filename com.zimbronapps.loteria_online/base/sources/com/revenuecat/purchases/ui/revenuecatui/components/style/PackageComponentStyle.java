package com.revenuecat.purchases.ui.revenuecatui.components.style;

import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PackageComponentStyle implements ComponentStyle {
    public static final int $stable = 0;
    private final boolean isSelectable;
    private final boolean isSelectedByDefault;
    private final Package rcPackage;
    private final ResolvedOffer resolvedOffer;
    private final Size size;
    private final StackComponentStyle stackComponentStyle;
    private final boolean visible;

    public PackageComponentStyle(Package rcPackage, boolean z, StackComponentStyle stackComponentStyle, boolean z2, ResolvedOffer resolvedOffer) {
        t.g(rcPackage, "rcPackage");
        t.g(stackComponentStyle, "stackComponentStyle");
        this.rcPackage = rcPackage;
        this.isSelectedByDefault = z;
        this.stackComponentStyle = stackComponentStyle;
        this.isSelectable = z2;
        this.resolvedOffer = resolvedOffer;
        this.visible = stackComponentStyle.getVisible();
        this.size = stackComponentStyle.getSize();
    }

    public static /* synthetic */ PackageComponentStyle copy$default(PackageComponentStyle packageComponentStyle, Package r4, boolean z, StackComponentStyle stackComponentStyle, boolean z2, ResolvedOffer resolvedOffer, int i, Object obj) {
        if ((i & 1) != 0) {
            r4 = packageComponentStyle.rcPackage;
        }
        if ((i & 2) != 0) {
            z = packageComponentStyle.isSelectedByDefault;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            stackComponentStyle = packageComponentStyle.stackComponentStyle;
        }
        StackComponentStyle stackComponentStyle2 = stackComponentStyle;
        if ((i & 8) != 0) {
            z2 = packageComponentStyle.isSelectable;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            resolvedOffer = packageComponentStyle.resolvedOffer;
        }
        return packageComponentStyle.copy(r4, z3, stackComponentStyle2, z4, resolvedOffer);
    }

    public final Package component1() {
        return this.rcPackage;
    }

    public final boolean component2() {
        return this.isSelectedByDefault;
    }

    public final StackComponentStyle component3() {
        return this.stackComponentStyle;
    }

    public final boolean component4() {
        return this.isSelectable;
    }

    public final ResolvedOffer component5() {
        return this.resolvedOffer;
    }

    public final PackageComponentStyle copy(Package rcPackage, boolean z, StackComponentStyle stackComponentStyle, boolean z2, ResolvedOffer resolvedOffer) {
        t.g(rcPackage, "rcPackage");
        t.g(stackComponentStyle, "stackComponentStyle");
        return new PackageComponentStyle(rcPackage, z, stackComponentStyle, z2, resolvedOffer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageComponentStyle)) {
            return false;
        }
        PackageComponentStyle packageComponentStyle = (PackageComponentStyle) obj;
        return t.c(this.rcPackage, packageComponentStyle.rcPackage) && this.isSelectedByDefault == packageComponentStyle.isSelectedByDefault && t.c(this.stackComponentStyle, packageComponentStyle.stackComponentStyle) && this.isSelectable == packageComponentStyle.isSelectable && t.c(this.resolvedOffer, packageComponentStyle.resolvedOffer);
    }

    public final /* synthetic */ Package getRcPackage() {
        return this.rcPackage;
    }

    public final /* synthetic */ ResolvedOffer getResolvedOffer() {
        return this.resolvedOffer;
    }

    public Size getSize() {
        return this.size;
    }

    public final /* synthetic */ StackComponentStyle getStackComponentStyle() {
        return this.stackComponentStyle;
    }

    public final /* synthetic */ String getUniqueId() {
        SubscriptionOption option;
        ResolvedOffer resolvedOffer = this.resolvedOffer;
        String str = null;
        ResolvedOffer.ConfiguredOffer configuredOffer = resolvedOffer instanceof ResolvedOffer.ConfiguredOffer ? (ResolvedOffer.ConfiguredOffer) resolvedOffer : null;
        if (configuredOffer != null && (option = configuredOffer.getOption()) != null) {
            str = option.getId();
        }
        if (str == null) {
            return this.rcPackage.getIdentifier();
        }
        return this.rcPackage.getIdentifier() + ':' + str;
    }

    public boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int hashCode = ((((((this.rcPackage.hashCode() * 31) + Boolean.hashCode(this.isSelectedByDefault)) * 31) + this.stackComponentStyle.hashCode()) * 31) + Boolean.hashCode(this.isSelectable)) * 31;
        ResolvedOffer resolvedOffer = this.resolvedOffer;
        return hashCode + (resolvedOffer == null ? 0 : resolvedOffer.hashCode());
    }

    public final /* synthetic */ boolean isSelectable() {
        return this.isSelectable;
    }

    public final /* synthetic */ boolean isSelectedByDefault() {
        return this.isSelectedByDefault;
    }

    public String toString() {
        return "PackageComponentStyle(rcPackage=" + this.rcPackage + ", isSelectedByDefault=" + this.isSelectedByDefault + ", stackComponentStyle=" + this.stackComponentStyle + ", isSelectable=" + this.isSelectable + ", resolvedOffer=" + this.resolvedOffer + ')';
    }

    public /* synthetic */ PackageComponentStyle(Package r7, boolean z, StackComponentStyle stackComponentStyle, boolean z2, ResolvedOffer resolvedOffer, int i, k kVar) {
        this(r7, z, stackComponentStyle, z2, (i & 16) != 0 ? null : resolvedOffer);
    }
}
