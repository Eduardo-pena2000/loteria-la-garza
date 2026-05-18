package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import F.V;
import Qa.l;
import Qa.q;
import X.L;
import X.m0;
import Z0.Y0;
import androidx.compose.ui.e;
import b0.m;
import b0.w;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import d1.H;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;
import l1.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FeedbackSurveyViewKt$FeedbackSurveyButtonsView$1$1$2 extends u implements q {
    final /* synthetic */ String $loadingOption;
    final /* synthetic */ CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option $option;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackSurveyViewKt$FeedbackSurveyButtonsView$1$1$2(String str, CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option option) {
        super(3);
        this.$loadingOption = str;
        this.$option = option;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((V) obj, (m) obj2, ((Number) obj3).intValue());
        return I.a;
    }

    public final void invoke(V Button, m mVar, int i) {
        t.g(Button, "$this$Button");
        if ((i & 17) == 16 && mVar.j()) {
            mVar.M();
            return;
        }
        if (w.L()) {
            w.U(-611882050, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.FeedbackSurveyButtonsView.<anonymous>.<anonymous>.<anonymous> (FeedbackSurveyView.kt:59)");
        }
        if (t.c(this.$loadingOption, this.$option.getId())) {
            mVar.V(1330910285);
            L.a((e) null, 0L, 0.0f, 0L, 0, mVar, 0, 31);
            mVar.P();
        } else {
            mVar.V(1330982422);
            m0.b(this.$option.getTitle(), (e) null, 0L, 0L, (H) null, (d1.L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, (Y0) null, mVar, 0, 0, 131070);
            mVar.P();
        }
        if (w.L()) {
            w.T();
        }
    }
}
