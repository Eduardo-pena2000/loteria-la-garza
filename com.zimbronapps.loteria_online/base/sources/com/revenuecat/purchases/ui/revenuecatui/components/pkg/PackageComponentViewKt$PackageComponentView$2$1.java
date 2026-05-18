package com.revenuecat.purchases.ui.revenuecatui.components.pkg;

import Ca.I;
import Qa.a;
import Qa.l;
import W0.h;
import androidx.compose.foundation.b;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.components.style.PackageComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PackageComponentViewKt$PackageComponentView$2$1 extends u implements l {
    final /* synthetic */ PaywallState.Loaded.Components $state;
    final /* synthetic */ PackageComponentStyle $style;

    public static final class 1 extends u implements a {
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ PackageComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(PaywallState.Loaded.Components components, PackageComponentStyle packageComponentStyle) {
            super(0);
            this.$state = components;
            this.$style = packageComponentStyle;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            this.$state.update(this.$style.getUniqueId());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageComponentViewKt$PackageComponentView$2$1(PaywallState.Loaded.Components components, PackageComponentStyle packageComponentStyle) {
        super(1);
        this.$state = components;
        this.$style = packageComponentStyle;
    }

    public final e invoke(e conditional) {
        t.g(conditional, "$this$conditional");
        return b.d(conditional, !t.c(this.$state.getSelectedPackageInfo() != null ? r0.getUniqueId() : null, this.$style.getUniqueId()), (String) null, (h) null, new 1(this.$state, this.$style), 6, (Object) null);
    }
}
