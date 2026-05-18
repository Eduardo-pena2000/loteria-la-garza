package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import Qa.l;
import android.app.Activity;
import androidx.lifecycle.k;
import androidx.lifecycle.r;
import b0.X;
import b0.Y;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InternalCustomerCenterKt$InternalCustomerCenter$4$1 extends u implements l {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ r $lifecycleOwner;
    final /* synthetic */ CustomerCenterViewModel $viewModel;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[k.a.values().length];
            try {
                iArr[k.a.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalCustomerCenterKt$InternalCustomerCenter$4$1(r rVar, CustomerCenterViewModel customerCenterViewModel, Activity activity) {
        super(1);
        this.$lifecycleOwner = rVar;
        this.$viewModel = customerCenterViewModel;
        this.$activity = activity;
    }

    public static /* synthetic */ void a(CustomerCenterViewModel customerCenterViewModel, Activity activity, r rVar, k.a aVar) {
        invoke$lambda$0(customerCenterViewModel, activity, rVar, aVar);
    }

    private static final void invoke$lambda$0(CustomerCenterViewModel customerCenterViewModel, Activity activity, r rVar, k.a event) {
        t.g(rVar, "<anonymous parameter 0>");
        t.g(event, "event");
        int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i == 1) {
            customerCenterViewModel.onActivityStopped(activity != null && activity.isChangingConfigurations());
        } else if (i == 2) {
            customerCenterViewModel.onActivityStarted();
        } else {
            if (i != 3) {
                return;
            }
            customerCenterViewModel.onActivityResumed();
        }
    }

    public final X invoke(Y DisposableEffect) {
        t.g(DisposableEffect, "$this$DisposableEffect");
        a aVar = new a(this.$viewModel, this.$activity);
        this.$lifecycleOwner.getLifecycle().addObserver(aVar);
        return new InternalCustomerCenterKt$InternalCustomerCenter$4$1$invoke$$inlined$onDispose$1(this.$lifecycleOwner, aVar);
    }
}
