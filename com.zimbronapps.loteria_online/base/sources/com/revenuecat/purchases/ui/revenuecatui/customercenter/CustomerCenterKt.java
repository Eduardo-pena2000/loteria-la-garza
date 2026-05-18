package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import Ca.I;
import Qa.p;
import androidx.compose.ui.e;
import b0.g1;
import b0.m;
import b0.w;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CustomerCenterKt {

    public static final class 1 extends u implements p {
        final /* synthetic */ e $modifier;
        final /* synthetic */ Qa.a $onDismiss;
        final /* synthetic */ CustomerCenterOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(e eVar, CustomerCenterOptions customerCenterOptions, Qa.a aVar) {
            super(2);
            this.$modifier = eVar;
            this.$options = customerCenterOptions;
            this.$onDismiss = aVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(-676995342, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenter.<anonymous> (CustomerCenter.kt:30)");
            }
            InternalCustomerCenterKt.InternalCustomerCenter(this.$modifier, this.$options.getListener$revenuecatui_defaultsBc8Release(), null, this.$onDismiss, mVar, 0, 4);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ Qa.a $onDismiss;
        final /* synthetic */ CustomerCenterOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(e eVar, CustomerCenterOptions customerCenterOptions, Qa.a aVar, int i, int i2) {
            super(2);
            this.$modifier = eVar;
            this.$options = customerCenterOptions;
            this.$onDismiss = aVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            CustomerCenterKt.CustomerCenter(this.$modifier, this.$options, this.$onDismiss, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CustomerCenter(androidx.compose.ui.e r7, com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterOptions r8, Qa.a r9, b0.m r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterKt.CustomerCenter(androidx.compose.ui.e, com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterOptions, Qa.a, b0.m, int, int):void");
    }
}
