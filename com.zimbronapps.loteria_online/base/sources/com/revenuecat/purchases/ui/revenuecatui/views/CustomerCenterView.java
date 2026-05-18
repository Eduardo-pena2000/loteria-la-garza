package com.revenuecat.purchases.ui.revenuecatui.views;

import Ca.I;
import Qa.a;
import Qa.p;
import android.content.Context;
import android.util.AttributeSet;
import b0.m;
import b0.w;
import com.revenuecat.purchases.customercenter.CustomerCenterListener;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterOptions;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import j0.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CustomerCenterView extends CompatComposeView {
    public static final int $stable = 8;
    private CustomerCenterListener customerCenterListener;
    private final CustomerCenterOptions customerCenterOptions;
    private a dismissHandler;
    private final CustomerCenterView$internalListener$1 internalListener;

    public static final class 1 extends u implements p {
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
                w.U(1061986288, i, -1, "com.revenuecat.purchases.ui.revenuecatui.views.CustomerCenterView.Content.<anonymous> (CustomerCenterView.kt:119)");
            }
            CustomerCenterOptions access$getCustomerCenterOptions$p = CustomerCenterView.access$getCustomerCenterOptions$p(CustomerCenterView.this);
            mVar.V(573865204);
            boolean E = mVar.E(CustomerCenterView.this);
            CustomerCenterView customerCenterView = CustomerCenterView.this;
            Object C = mVar.C();
            if (E || C == m.a.a()) {
                C = new CustomerCenterView$Content$1$1$1(customerCenterView);
                mVar.t(C);
            }
            mVar.P();
            CustomerCenterKt.CustomerCenter(null, access$getCustomerCenterOptions$p, (a) C, mVar, 0, 1);
            if (w.L()) {
                w.T();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomerCenterView(Context context) {
        this(context, null, null, 6, null);
        t.g(context, "context");
    }

    public static final /* synthetic */ void access$dismiss(CustomerCenterView customerCenterView) {
        customerCenterView.dismiss();
    }

    public static final /* synthetic */ CustomerCenterListener access$getCustomerCenterListener$p(CustomerCenterView customerCenterView) {
        return customerCenterView.customerCenterListener;
    }

    public static final /* synthetic */ CustomerCenterOptions access$getCustomerCenterOptions$p(CustomerCenterView customerCenterView) {
        return customerCenterView.customerCenterOptions;
    }

    private final void dismiss() {
        a aVar = this.dismissHandler;
        if (aVar != null) {
            aVar.invoke();
        }
        destroy();
    }

    private final void init() {
        Logger.INSTANCE.d("Initialized CustomerCenterView");
    }

    public void Content(m mVar, int i) {
        mVar.V(1372663828);
        if (w.L()) {
            w.U(1372663828, i, -1, "com.revenuecat.purchases.ui.revenuecatui.views.CustomerCenterView.Content (CustomerCenterView.kt:117)");
        }
        RevenueCatThemeKt.RevenueCatTheme(i.d(1061986288, true, new 1(), mVar, 54), mVar, 6);
        if (w.L()) {
            w.T();
        }
        mVar.P();
    }

    public void onBackPressed() {
        I i;
        if (this.dismissHandler != null) {
            dismiss();
            i = I.a;
        } else {
            i = null;
        }
        if (i == null) {
            super.onBackPressed();
        }
    }

    public final void setCustomerCenterListener(CustomerCenterListener customerCenterListener) {
        this.customerCenterListener = customerCenterListener;
    }

    public final void setDismissHandler(a aVar) {
        this.dismissHandler = aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomerCenterView(Context context, CustomerCenterListener customerCenterListener) {
        this(context, customerCenterListener, null, 4, null);
        t.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerCenterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        t.g(context, "context");
        CustomerCenterView$internalListener$1 customerCenterView$internalListener$1 = new CustomerCenterView$internalListener$1(this);
        this.internalListener = customerCenterView$internalListener$1;
        this.customerCenterOptions = new CustomerCenterOptions.Builder().setListener(customerCenterView$internalListener$1).build();
        init();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerCenterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        t.g(context, "context");
        CustomerCenterView$internalListener$1 customerCenterView$internalListener$1 = new CustomerCenterView$internalListener$1(this);
        this.internalListener = customerCenterView$internalListener$1;
        this.customerCenterOptions = new CustomerCenterOptions.Builder().setListener(customerCenterView$internalListener$1).build();
        init();
    }

    public /* synthetic */ CustomerCenterView(Context context, a aVar, int i, k kVar) {
        this(context, (i & 2) != 0 ? null : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomerCenterView(Context context, a aVar) {
        this(context, (CustomerCenterListener) null, aVar);
        t.g(context, "context");
    }

    public /* synthetic */ CustomerCenterView(Context context, CustomerCenterListener customerCenterListener, a aVar, int i, k kVar) {
        this(context, (i & 2) != 0 ? null : customerCenterListener, (i & 4) != 0 ? null : aVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerCenterView(Context context, CustomerCenterListener customerCenterListener, a aVar) {
        super(context, null, 0, 6, null);
        t.g(context, "context");
        CustomerCenterView$internalListener$1 customerCenterView$internalListener$1 = new CustomerCenterView$internalListener$1(this);
        this.internalListener = customerCenterView$internalListener$1;
        this.customerCenterOptions = new CustomerCenterOptions.Builder().setListener(customerCenterView$internalListener$1).build();
        this.customerCenterListener = customerCenterListener;
        this.dismissHandler = aVar;
        init();
    }
}
