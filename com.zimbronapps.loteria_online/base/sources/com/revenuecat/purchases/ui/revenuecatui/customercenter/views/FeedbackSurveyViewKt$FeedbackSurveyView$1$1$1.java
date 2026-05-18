package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import Qa.l;
import b0.C0;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.FeedbackSurveyData;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FeedbackSurveyViewKt$FeedbackSurveyView$1$1$1 extends u implements l {
    final /* synthetic */ FeedbackSurveyData $data;
    final /* synthetic */ C0 $loadingOption$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackSurveyViewKt$FeedbackSurveyView$1$1$1(FeedbackSurveyData feedbackSurveyData, C0 c0) {
        super(1);
        this.$data = feedbackSurveyData;
        this.$loadingOption$delegate = c0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option) obj);
        return I.a;
    }

    public final void invoke(CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option option) {
        t.g(option, "option");
        FeedbackSurveyViewKt.access$FeedbackSurveyView$lambda$2(this.$loadingOption$delegate, option.getId());
        this.$data.getOnAnswerSubmitted().invoke(option);
        FeedbackSurveyViewKt.access$FeedbackSurveyView$lambda$2(this.$loadingOption$delegate, null);
    }
}
