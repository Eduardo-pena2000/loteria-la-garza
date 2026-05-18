package com.revenuecat.purchases.ui.revenuecatui.components.style;

import Ca.o;
import Da.D;
import Da.S;
import Qa.l;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.components.PackageComponent;
import com.revenuecat.purchases.paywalls.components.PaywallComponent;
import com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StyleFactory$createPackageComponentStyle$1$1 extends u implements l {
    final /* synthetic */ PackageComponent $component;
    final /* synthetic */ Package $rcPackage;
    final /* synthetic */ ResolvedOffer $resolvedOffer;
    final /* synthetic */ StyleFactory this$0;

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(1);
        }

        public final Boolean invoke(PaywallComponent it) {
            t.g(it, "it");
            return Boolean.valueOf(it instanceof PurchaseButtonComponent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyleFactory$createPackageComponentStyle$1$1(StyleFactory styleFactory, PackageComponent packageComponent, Package r3, ResolvedOffer resolvedOffer) {
        super(1);
        this.this$0 = styleFactory;
        this.$component = packageComponent;
        this.$rcPackage = r3;
        this.$resolvedOffer = resolvedOffer;
    }

    public final Result invoke(StyleFactory.StyleFactoryScope withSelectedScope) {
        t.g(withSelectedScope, "$this$withSelectedScope");
        1 r0 = 1.INSTANCE;
        StyleFactory styleFactory = this.this$0;
        PackageComponent packageComponent = this.$component;
        Integer r02 = D.r0(StyleFactory.StyleFactoryScope.access$getCountPredicates$p(withSelectedScope).keySet());
        int intValue = (r02 != null ? r02.intValue() : -1) + 1;
        StyleFactory.StyleFactoryScope.access$getCountPredicates$p(withSelectedScope).put(Integer.valueOf(intValue), r0);
        StyleFactory.StyleFactoryScope.access$getCountValues$p(withSelectedScope).put(Integer.valueOf(intValue), 0);
        StyleFactory.StyleFactoryScope.WithCount withCount = new StyleFactory.StyleFactoryScope.WithCount(StyleFactory.access$createStackComponentStyle(styleFactory, withSelectedScope, packageComponent.getStack()), ((Number) S.i(StyleFactory.StyleFactoryScope.access$getCountValues$p(withSelectedScope), Integer.valueOf(intValue))).intValue());
        StyleFactory.StyleFactoryScope.access$getCountPredicates$p(withSelectedScope).remove(Integer.valueOf(intValue));
        StyleFactory.StyleFactoryScope.access$getCountValues$p(withSelectedScope).remove(Integer.valueOf(intValue));
        Result result = (Result) withCount.component1();
        int component2 = withCount.component2();
        PackageComponent packageComponent2 = this.$component;
        Package r8 = this.$rcPackage;
        ResolvedOffer resolvedOffer = this.$resolvedOffer;
        if (result instanceof Result.Success) {
            return new Result.Success(new PackageComponentStyle(r8, packageComponent2.isSelectedByDefault(), (StackComponentStyle) ((Result.Success) result).getValue(), component2 == 0, resolvedOffer));
        }
        if (result instanceof Result.Error) {
            return result;
        }
        throw new o();
    }
}
