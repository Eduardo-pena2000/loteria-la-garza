package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FeedbackSurveyViewKt$FeedbackSurveyButtonsView$1$1$1$1 extends u implements Qa.a {
    final /* synthetic */ l $onAnswerSubmit;
    final /* synthetic */ CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option $option;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackSurveyViewKt$FeedbackSurveyButtonsView$1$1$1$1(l lVar, CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option option) {
        super(0);
        this.$onAnswerSubmit = lVar;
        this.$option = option;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        this.$onAnswerSubmit.invoke(this.$option);
    }
}
