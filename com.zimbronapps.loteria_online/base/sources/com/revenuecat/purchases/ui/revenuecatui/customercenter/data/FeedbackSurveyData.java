package com.revenuecat.purchases.ui.revenuecatui.customercenter.data;

import Qa.l;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FeedbackSurveyData {
    public static final int $stable = 8;
    private final CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey;
    private final l onAnswerSubmitted;

    public FeedbackSurveyData(CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey, l onAnswerSubmitted) {
        t.g(feedbackSurvey, "feedbackSurvey");
        t.g(onAnswerSubmitted, "onAnswerSubmitted");
        this.feedbackSurvey = feedbackSurvey;
        this.onAnswerSubmitted = onAnswerSubmitted;
    }

    public static /* synthetic */ FeedbackSurveyData copy$default(FeedbackSurveyData feedbackSurveyData, CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey, l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            feedbackSurvey = feedbackSurveyData.feedbackSurvey;
        }
        if ((i & 2) != 0) {
            lVar = feedbackSurveyData.onAnswerSubmitted;
        }
        return feedbackSurveyData.copy(feedbackSurvey, lVar);
    }

    public final CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey component1() {
        return this.feedbackSurvey;
    }

    public final l component2() {
        return this.onAnswerSubmitted;
    }

    public final FeedbackSurveyData copy(CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey, l onAnswerSubmitted) {
        t.g(feedbackSurvey, "feedbackSurvey");
        t.g(onAnswerSubmitted, "onAnswerSubmitted");
        return new FeedbackSurveyData(feedbackSurvey, onAnswerSubmitted);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackSurveyData)) {
            return false;
        }
        FeedbackSurveyData feedbackSurveyData = (FeedbackSurveyData) obj;
        return t.c(this.feedbackSurvey, feedbackSurveyData.feedbackSurvey) && t.c(this.onAnswerSubmitted, feedbackSurveyData.onAnswerSubmitted);
    }

    public final /* synthetic */ CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey getFeedbackSurvey() {
        return this.feedbackSurvey;
    }

    public final /* synthetic */ l getOnAnswerSubmitted() {
        return this.onAnswerSubmitted;
    }

    public int hashCode() {
        return (this.feedbackSurvey.hashCode() * 31) + this.onAnswerSubmitted.hashCode();
    }

    public String toString() {
        return "FeedbackSurveyData(feedbackSurvey=" + this.feedbackSurvey + ", onAnswerSubmitted=" + this.onAnswerSubmitted + ')';
    }
}
