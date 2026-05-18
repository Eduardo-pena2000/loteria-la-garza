package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import A.q;
import Ca.I;
import Qa.p;
import X.F;
import X.X;
import X.r0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.e;
import b0.m;
import b0.w;
import b0.y;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import com.revenuecat.purchases.ui.revenuecatui.helpers.SdkConfigurationStateKt;
import d.j;
import e.b;
import j0.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CustomerCenterActivity extends j {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_WAS_LAUNCHED_THROUGH_SDK = "was_launched_through_sdk";

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Intent createIntent$revenuecatui_defaultsBc8Release(Context context) {
            t.g(context, "context");
            Intent intent = new Intent(context, CustomerCenterActivity.class);
            intent.putExtra("was_launched_through_sdk", true);
            return intent;
        }

        private Companion() {
        }
    }

    public static final class 1 extends u implements p {

        public static final class 1 extends u implements p {
            final /* synthetic */ CustomerCenterActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(CustomerCenterActivity customerCenterActivity) {
                super(2);
                this.this$0 = customerCenterActivity;
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
                    w.U(1428363188, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterActivity.onCreate.<anonymous>.<anonymous> (CustomerCenterActivity.kt:52)");
                }
                e f = g.f(e.a, 0.0f, 1, (Object) null);
                mVar.V(1948489528);
                boolean U = mVar.U(this.this$0);
                CustomerCenterActivity customerCenterActivity = this.this$0;
                Object C = mVar.C();
                if (U || C == m.a.a()) {
                    C = new CustomerCenterActivity$onCreate$1$1$1$1(customerCenterActivity);
                    mVar.t(C);
                }
                mVar.P();
                CustomerCenterKt.CustomerCenter(f, null, (Qa.a) C, mVar, 6, 2);
                if (w.L()) {
                    w.T();
                }
            }
        }

        public 1() {
            super(2);
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
                w.U(2072096008, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterActivity.onCreate.<anonymous> (CustomerCenterActivity.kt:46)");
            }
            F.a(q.a(mVar, 0) ? X.m.e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, (Object) null) : X.m.j(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, (Object) null), (X) null, (r0) null, i.d(1428363188, true, new 1(CustomerCenterActivity.this), mVar, 54), mVar, 3072, 6);
            if (w.L()) {
                w.T();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SdkConfigurationStateKt.restoreSdkConfigurationIfNeeded(this, bundle);
        if (getIntent().getBooleanExtra("was_launched_through_sdk", false) || Purchases.Companion.isConfigured()) {
            b.b(this, (y) null, i.b(2072096008, true, new 1()), 1, (Object) null);
        } else {
            Logger.INSTANCE.e("CustomerCenterActivity was launched incorrectly. Please use ShowCustomerCenter activity result contract, CustomerCenter composable, or CustomerCenterView to display the Customer Center.");
            finish();
        }
    }

    public void onSaveInstanceState(Bundle outState) {
        t.g(outState, "outState");
        SdkConfigurationStateKt.saveSdkConfiguration(outState);
        super.onSaveInstanceState(outState);
    }
}
