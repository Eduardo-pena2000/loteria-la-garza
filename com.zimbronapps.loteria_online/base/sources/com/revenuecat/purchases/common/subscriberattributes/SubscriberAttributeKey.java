package com.revenuecat.purchases.common.subscriberattributes;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class SubscriberAttributeKey {
    private final String backendKey;

    public static abstract class AttributionIds extends SubscriberAttributeKey {

        public static final class Adjust extends AttributionIds {
            public static final Adjust INSTANCE = new Adjust();

            private Adjust() {
                super(ReservedSubscriberAttribute.ADJUST_ID, null);
            }
        }

        public static final class Airbridge extends AttributionIds {
            public static final Airbridge INSTANCE = new Airbridge();

            private Airbridge() {
                super(ReservedSubscriberAttribute.AIRBRIDGE_DEVICE_ID, null);
            }
        }

        public static final class AppsFlyer extends AttributionIds {
            public static final AppsFlyer INSTANCE = new AppsFlyer();

            private AppsFlyer() {
                super(ReservedSubscriberAttribute.APPSFLYER_ID, null);
            }
        }

        public static final class Appstack extends AttributionIds {
            public static final Appstack INSTANCE = new Appstack();

            private Appstack() {
                super(ReservedSubscriberAttribute.APPSTACK_ID, null);
            }
        }

        public static final class CleverTap extends AttributionIds {
            public static final CleverTap INSTANCE = new CleverTap();

            private CleverTap() {
                super(ReservedSubscriberAttribute.CLEVER_TAP_ID, null);
            }
        }

        public static final class Facebook extends AttributionIds {
            public static final Facebook INSTANCE = new Facebook();

            private Facebook() {
                super(ReservedSubscriberAttribute.FB_ANON_ID, null);
            }
        }

        public static final class Kochava extends AttributionIds {
            public static final Kochava INSTANCE = new Kochava();

            private Kochava() {
                super(ReservedSubscriberAttribute.KOCHAVA_DEVICE_ID, null);
            }
        }

        public static final class Mparticle extends AttributionIds {
            public static final Mparticle INSTANCE = new Mparticle();

            private Mparticle() {
                super(ReservedSubscriberAttribute.MPARTICLE_ID, null);
            }
        }

        public static final class SolarEngineAccountId extends AttributionIds {
            public static final SolarEngineAccountId INSTANCE = new SolarEngineAccountId();

            private SolarEngineAccountId() {
                super(ReservedSubscriberAttribute.SOLAR_ENGINE_ACCOUNT_ID, null);
            }
        }

        public static final class SolarEngineDistinctId extends AttributionIds {
            public static final SolarEngineDistinctId INSTANCE = new SolarEngineDistinctId();

            private SolarEngineDistinctId() {
                super(ReservedSubscriberAttribute.SOLAR_ENGINE_DISTINCT_ID, null);
            }
        }

        public static final class SolarEngineVisitorId extends AttributionIds {
            public static final SolarEngineVisitorId INSTANCE = new SolarEngineVisitorId();

            private SolarEngineVisitorId() {
                super(ReservedSubscriberAttribute.SOLAR_ENGINE_VISITOR_ID, null);
            }
        }

        public /* synthetic */ AttributionIds(ReservedSubscriberAttribute reservedSubscriberAttribute, k kVar) {
            this(reservedSubscriberAttribute);
        }

        private AttributionIds(ReservedSubscriberAttribute reservedSubscriberAttribute) {
            super(reservedSubscriberAttribute.getValue(), null);
        }
    }

    public static abstract class CampaignParameters extends SubscriberAttributeKey {

        public static final class Ad extends CampaignParameters {
            public static final Ad INSTANCE = new Ad();

            private Ad() {
                super(ReservedSubscriberAttribute.AD, null);
            }
        }

        public static final class AdGroup extends CampaignParameters {
            public static final AdGroup INSTANCE = new AdGroup();

            private AdGroup() {
                super(ReservedSubscriberAttribute.AD_GROUP, null);
            }
        }

        public static final class Campaign extends CampaignParameters {
            public static final Campaign INSTANCE = new Campaign();

            private Campaign() {
                super(ReservedSubscriberAttribute.CAMPAIGN, null);
            }
        }

        public static final class Creative extends CampaignParameters {
            public static final Creative INSTANCE = new Creative();

            private Creative() {
                super(ReservedSubscriberAttribute.CREATIVE, null);
            }
        }

        public static final class Keyword extends CampaignParameters {
            public static final Keyword INSTANCE = new Keyword();

            private Keyword() {
                super(ReservedSubscriberAttribute.KEYWORD, null);
            }
        }

        public static final class MediaSource extends CampaignParameters {
            public static final MediaSource INSTANCE = new MediaSource();

            private MediaSource() {
                super(ReservedSubscriberAttribute.MEDIA_SOURCE, null);
            }
        }

        public /* synthetic */ CampaignParameters(ReservedSubscriberAttribute reservedSubscriberAttribute, k kVar) {
            this(reservedSubscriberAttribute);
        }

        private CampaignParameters(ReservedSubscriberAttribute reservedSubscriberAttribute) {
            super(reservedSubscriberAttribute.getValue(), null);
        }
    }

    public static final class Custom extends SubscriberAttributeKey {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Custom(String str) {
            super(str, null);
            t.g(str, "value");
        }
    }

    public static abstract class DeviceIdentifiers {

        public static final class AmazonAdID extends SubscriberAttributeKey {
            public static final AmazonAdID INSTANCE = new AmazonAdID();

            private AmazonAdID() {
                super(ReservedSubscriberAttribute.AMAZON_AD_ID.getValue(), null);
            }
        }

        public static final class DeviceVersion extends SubscriberAttributeKey {
            public static final DeviceVersion INSTANCE = new DeviceVersion();

            private DeviceVersion() {
                super(ReservedSubscriberAttribute.DEVICE_VERSION.getValue(), null);
            }
        }

        public static final class GPSAdID extends SubscriberAttributeKey {
            public static final GPSAdID INSTANCE = new GPSAdID();

            private GPSAdID() {
                super(ReservedSubscriberAttribute.GPS_AD_ID.getValue(), null);
            }
        }

        public static final class IP extends SubscriberAttributeKey {
            public static final IP INSTANCE = new IP();

            private IP() {
                super(ReservedSubscriberAttribute.IP.getValue(), null);
            }
        }

        public /* synthetic */ DeviceIdentifiers(k kVar) {
            this();
        }

        private DeviceIdentifiers() {
        }
    }

    public static final class DisplayName extends SubscriberAttributeKey {
        public static final DisplayName INSTANCE = new DisplayName();

        private DisplayName() {
            super(ReservedSubscriberAttribute.DISPLAY_NAME.getValue(), null);
        }
    }

    public static final class Email extends SubscriberAttributeKey {
        public static final Email INSTANCE = new Email();

        private Email() {
            super(ReservedSubscriberAttribute.EMAIL.getValue(), null);
        }
    }

    public static final class FCMTokens extends SubscriberAttributeKey {
        public static final FCMTokens INSTANCE = new FCMTokens();

        private FCMTokens() {
            super(ReservedSubscriberAttribute.FCM_TOKENS.getValue(), null);
        }
    }

    public static abstract class IntegrationIds extends SubscriberAttributeKey {

        public static final class Airship extends IntegrationIds {
            public static final Airship INSTANCE = new Airship();

            private Airship() {
                super(ReservedSubscriberAttribute.AIRSHIP_CHANNEL_ID, null);
            }
        }

        public static final class FirebaseAppInstanceId extends IntegrationIds {
            public static final FirebaseAppInstanceId INSTANCE = new FirebaseAppInstanceId();

            private FirebaseAppInstanceId() {
                super(ReservedSubscriberAttribute.FIREBASE_APP_INSTANCE_ID, null);
            }
        }

        public static final class MixpanelDistinctId extends IntegrationIds {
            public static final MixpanelDistinctId INSTANCE = new MixpanelDistinctId();

            private MixpanelDistinctId() {
                super(ReservedSubscriberAttribute.MIXPANEL_DISTINCT_ID, null);
            }
        }

        public static final class OneSignal extends IntegrationIds {
            public static final OneSignal INSTANCE = new OneSignal();

            private OneSignal() {
                super(ReservedSubscriberAttribute.ONESIGNAL_ID, null);
            }
        }

        public static final class OneSignalUserId extends IntegrationIds {
            public static final OneSignalUserId INSTANCE = new OneSignalUserId();

            private OneSignalUserId() {
                super(ReservedSubscriberAttribute.ONESIGNAL_USER_ID, null);
            }
        }

        public static final class PostHogUserId extends IntegrationIds {
            public static final PostHogUserId INSTANCE = new PostHogUserId();

            private PostHogUserId() {
                super(ReservedSubscriberAttribute.POSTHOG_USER_ID, null);
            }
        }

        public static final class TenjinAnalyticsInstallationId extends IntegrationIds {
            public static final TenjinAnalyticsInstallationId INSTANCE = new TenjinAnalyticsInstallationId();

            private TenjinAnalyticsInstallationId() {
                super(ReservedSubscriberAttribute.TENJIN_ANALYTICS_INSTALLATION_ID, null);
            }
        }

        public /* synthetic */ IntegrationIds(ReservedSubscriberAttribute reservedSubscriberAttribute, k kVar) {
            this(reservedSubscriberAttribute);
        }

        private IntegrationIds(ReservedSubscriberAttribute reservedSubscriberAttribute) {
            super(reservedSubscriberAttribute.getValue(), null);
        }
    }

    public static final class PhoneNumber extends SubscriberAttributeKey {
        public static final PhoneNumber INSTANCE = new PhoneNumber();

        private PhoneNumber() {
            super(ReservedSubscriberAttribute.PHONE_NUMBER.getValue(), null);
        }
    }

    public /* synthetic */ SubscriberAttributeKey(String str, k kVar) {
        this(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.c(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.e(obj, "null cannot be cast to non-null type com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey");
        return t.c(this.backendKey, ((SubscriberAttributeKey) obj).backendKey);
    }

    public final String getBackendKey() {
        return this.backendKey;
    }

    public int hashCode() {
        return this.backendKey.hashCode();
    }

    public String toString() {
        return "SubscriberAttributeKey('" + this.backendKey + "')";
    }

    private SubscriberAttributeKey(String str) {
        this.backendKey = str;
    }
}
