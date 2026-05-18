package com.revenuecat.purchases.hybridcommon.mappers;

import Ca.q;
import Ca.x;
import Da.S;
import com.revenuecat.purchases.common.events.FeatureEvent;
import com.revenuecat.purchases.customercenter.events.CustomerCenterImpressionEvent;
import com.revenuecat.purchases.customercenter.events.CustomerCenterSurveyOptionChosenEvent;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import java.util.Map;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class FeatureEventMapperKt {
    public static final Map toMap(FeatureEvent featureEvent) {
        t.g(featureEvent, "<this>");
        if (featureEvent instanceof PaywallEvent) {
            PaywallEvent paywallEvent = (PaywallEvent) featureEvent;
            return S.l(new q[]{x.a("discriminator", "paywalls"), x.a("type", paywallEvent.getType().getValue()), x.a("id", paywallEvent.getCreationData().getId().toString()), x.a("timestamp", Long.valueOf(paywallEvent.getCreationData().getDate().getTime())), x.a("offering_id", paywallEvent.getData().getPresentedOfferingContext().getOfferingIdentifier()), x.a("paywall_revision", Integer.valueOf(paywallEvent.getData().getPaywallRevision())), x.a("session_id", paywallEvent.getData().getSessionIdentifier().toString()), x.a("display_mode", paywallEvent.getData().getDisplayMode()), x.a("locale", paywallEvent.getData().getLocaleIdentifier()), x.a("dark_mode", Boolean.valueOf(paywallEvent.getData().getDarkMode()))});
        }
        if (featureEvent instanceof CustomerCenterImpressionEvent) {
            CustomerCenterImpressionEvent customerCenterImpressionEvent = (CustomerCenterImpressionEvent) featureEvent;
            return S.l(new q[]{x.a("discriminator", "customer_center"), x.a("type", "customer_center_impression"), x.a("id", customerCenterImpressionEvent.getCreationData().getId().toString()), x.a("timestamp", Long.valueOf(customerCenterImpressionEvent.getCreationData().getDate().getTime())), x.a("dark_mode", Boolean.valueOf(customerCenterImpressionEvent.getData().getDarkMode())), x.a("locale", customerCenterImpressionEvent.getData().getLocale()), x.a("display_mode", customerCenterImpressionEvent.getData().getDisplayMode().name()), x.a("revision_id", Integer.valueOf(customerCenterImpressionEvent.getData().getRevisionID()))});
        }
        if (!(featureEvent instanceof CustomerCenterSurveyOptionChosenEvent)) {
            return S.l(new q[]{x.a("discriminator", "unknown"), x.a("type", "unknown"), x.a("class_name", P.b(featureEvent.getClass()).e())});
        }
        CustomerCenterSurveyOptionChosenEvent customerCenterSurveyOptionChosenEvent = (CustomerCenterSurveyOptionChosenEvent) featureEvent;
        return S.l(new q[]{x.a("discriminator", "customer_center"), x.a("type", "customer_center_survey_option_chosen"), x.a("id", customerCenterSurveyOptionChosenEvent.getCreationData().getId().toString()), x.a("timestamp", Long.valueOf(customerCenterSurveyOptionChosenEvent.getCreationData().getDate().getTime())), x.a("dark_mode", Boolean.valueOf(customerCenterSurveyOptionChosenEvent.getData().getDarkMode())), x.a("locale", customerCenterSurveyOptionChosenEvent.getData().getLocale()), x.a("display_mode", customerCenterSurveyOptionChosenEvent.getData().getDisplayMode().name()), x.a("survey_option_id", customerCenterSurveyOptionChosenEvent.getData().getSurveyOptionID()), x.a("path", customerCenterSurveyOptionChosenEvent.getData().getPath().name()), x.a("url", customerCenterSurveyOptionChosenEvent.getData().getUrl()), x.a("revision_id", Integer.valueOf(customerCenterSurveyOptionChosenEvent.getData().getRevisionID()))});
    }
}
