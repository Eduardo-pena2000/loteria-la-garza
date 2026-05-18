package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AdRequestOuterClass {

    public static final class AdRequest extends GeneratedMessageLite implements AdRequestOrBuilder {
        public static final int AD_FORMAT_FIELD_NUMBER = 13;
        public static final int AD_REQUEST_TYPE_FIELD_NUMBER = 11;
        public static final int BANNER_SIZE_FIELD_NUMBER = 12;
        public static final int CAMPAIGN_STATE_FIELD_NUMBER = 4;
        private static final AdRequest DEFAULT_INSTANCE;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 3;
        public static final int EXTRAS_FIELD_NUMBER = 15;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 5;
        public static final int MEDIATION_AD_UNIT_ID_FIELD_NUMBER = 14;
        public static final int MEDIATION_INFO_FIELD_NUMBER = 16;
        private static volatile Parser PARSER = null;
        public static final int PLACEMENT_ID_FIELD_NUMBER = 6;
        public static final int REQUEST_IMPRESSION_CONFIGURATION_FIELD_NUMBER = 7;
        public static final int SCAR_SIGNAL_FIELD_NUMBER = 8;
        public static final int SESSION_COUNTERS_FIELD_NUMBER = 1;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 2;
        public static final int TCF_FIELD_NUMBER = 10;
        public static final int WEBVIEW_VERSION_FIELD_NUMBER = 9;
        private int adFormat_;
        private int adRequestType_;
        private BannerSize bannerSize_;
        private int bitField0_;
        private CampaignStateOuterClass.CampaignState campaignState_;
        private DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo_;
        private MapFieldLite extras_ = MapFieldLite.emptyMapField();
        private ByteString impressionOpportunityId_;
        private String mediationAdUnitId_;
        private MediationInfoOuterClass.MediationInfo mediationInfo_;
        private String placementId_;
        private boolean requestImpressionConfiguration_;
        private ByteString scarSignal_;
        private SessionCountersOuterClass.SessionCounters sessionCounters_;
        private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_;
        private ByteString tcf_;
        private int webviewVersion_;

        public static final class Builder extends GeneratedMessageLite.Builder implements AdRequestOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearAdFormat() {
                copyOnWrite();
                AdRequest.access$4000((AdRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearAdRequestType() {
                copyOnWrite();
                AdRequest.access$3400((AdRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearBannerSize() {
                copyOnWrite();
                AdRequest.access$3700((AdRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearCampaignState() {
                copyOnWrite();
                AdRequest.access$1800((AdRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearDynamicDeviceInfo() {
                copyOnWrite();
                AdRequest.access$1500((AdRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearExtras() {
                copyOnWrite();
                AdRequest.access$4400((AdRequest) ((GeneratedMessageLite.Builder) this).instance).clear();
                return this;
            }

            public Builder clearImpressionOpportunityId() {
                copyOnWrite();
                AdRequest.access$2000((AdRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearMediationAdUnitId() {
                copyOnWrite();
                AdRequest.access$4200((AdRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearMediationInfo() {
                copyOnWrite();
                AdRequest.access$4700((AdRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearPlacementId() {
                copyOnWrite();
                AdRequest.access$2200((AdRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearRequestImpressionConfiguration() {
                copyOnWrite();
                AdRequest.access$2500((AdRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearScarSignal() {
                copyOnWrite();
                AdRequest.access$2700((AdRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearSessionCounters() {
                copyOnWrite();
                AdRequest.access$900((AdRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearStaticDeviceInfo() {
                copyOnWrite();
                AdRequest.access$1200((AdRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTcf() {
                copyOnWrite();
                AdRequest.access$3100((AdRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearWebviewVersion() {
                copyOnWrite();
                AdRequest.access$2900((AdRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public boolean containsExtras(String str) {
                str.getClass();
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).getExtrasMap().containsKey(str);
            }

            public AdFormatOuterClass.AdFormat getAdFormat() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).getAdFormat();
            }

            public int getAdFormatValue() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).getAdFormatValue();
            }

            public AdRequestType getAdRequestType() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).getAdRequestType();
            }

            public int getAdRequestTypeValue() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).getAdRequestTypeValue();
            }

            public BannerSize getBannerSize() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).getBannerSize();
            }

            public CampaignStateOuterClass.CampaignState getCampaignState() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).getCampaignState();
            }

            public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).getDynamicDeviceInfo();
            }

            @Deprecated
            public Map getExtras() {
                return getExtrasMap();
            }

            public int getExtrasCount() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).getExtrasMap().size();
            }

            public Map getExtrasMap() {
                return Collections.unmodifiableMap(((AdRequest) ((GeneratedMessageLite.Builder) this).instance).getExtrasMap());
            }

            public String getExtrasOrDefault(String str, String str2) {
                str.getClass();
                Map extrasMap = ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).getExtrasMap();
                return extrasMap.containsKey(str) ? (String) extrasMap.get(str) : str2;
            }

            public String getExtrasOrThrow(String str) {
                str.getClass();
                Map extrasMap = ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).getExtrasMap();
                if (extrasMap.containsKey(str)) {
                    return (String) extrasMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            public ByteString getImpressionOpportunityId() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).getImpressionOpportunityId();
            }

            public String getMediationAdUnitId() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).getMediationAdUnitId();
            }

            public ByteString getMediationAdUnitIdBytes() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).getMediationAdUnitIdBytes();
            }

            public MediationInfoOuterClass.MediationInfo getMediationInfo() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).getMediationInfo();
            }

            public String getPlacementId() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).getPlacementId();
            }

            public ByteString getPlacementIdBytes() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).getPlacementIdBytes();
            }

            public boolean getRequestImpressionConfiguration() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).getRequestImpressionConfiguration();
            }

            public ByteString getScarSignal() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).getScarSignal();
            }

            public SessionCountersOuterClass.SessionCounters getSessionCounters() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).getSessionCounters();
            }

            public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).getStaticDeviceInfo();
            }

            public ByteString getTcf() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).getTcf();
            }

            public int getWebviewVersion() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).getWebviewVersion();
            }

            public boolean hasAdFormat() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).hasAdFormat();
            }

            public boolean hasAdRequestType() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).hasAdRequestType();
            }

            public boolean hasBannerSize() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).hasBannerSize();
            }

            public boolean hasCampaignState() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).hasCampaignState();
            }

            public boolean hasDynamicDeviceInfo() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).hasDynamicDeviceInfo();
            }

            public boolean hasMediationAdUnitId() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).hasMediationAdUnitId();
            }

            public boolean hasMediationInfo() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).hasMediationInfo();
            }

            public boolean hasSessionCounters() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).hasSessionCounters();
            }

            public boolean hasStaticDeviceInfo() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).hasStaticDeviceInfo();
            }

            public boolean hasTcf() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).hasTcf();
            }

            public boolean hasWebviewVersion() {
                return ((AdRequest) ((GeneratedMessageLite.Builder) this).instance).hasWebviewVersion();
            }

            public Builder mergeBannerSize(BannerSize bannerSize) {
                copyOnWrite();
                AdRequest.access$3600((AdRequest) ((GeneratedMessageLite.Builder) this).instance, bannerSize);
                return this;
            }

            public Builder mergeCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
                copyOnWrite();
                AdRequest.access$1700((AdRequest) ((GeneratedMessageLite.Builder) this).instance, campaignState);
                return this;
            }

            public Builder mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                AdRequest.access$1400((AdRequest) ((GeneratedMessageLite.Builder) this).instance, dynamicDeviceInfo);
                return this;
            }

            public Builder mergeMediationInfo(MediationInfoOuterClass.MediationInfo mediationInfo) {
                copyOnWrite();
                AdRequest.access$4600((AdRequest) ((GeneratedMessageLite.Builder) this).instance, mediationInfo);
                return this;
            }

            public Builder mergeSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                AdRequest.access$800((AdRequest) ((GeneratedMessageLite.Builder) this).instance, sessionCounters);
                return this;
            }

            public Builder mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                AdRequest.access$1100((AdRequest) ((GeneratedMessageLite.Builder) this).instance, staticDeviceInfo);
                return this;
            }

            public Builder putAllExtras(Map map) {
                copyOnWrite();
                AdRequest.access$4400((AdRequest) ((GeneratedMessageLite.Builder) this).instance).putAll(map);
                return this;
            }

            public Builder putExtras(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                AdRequest.access$4400((AdRequest) ((GeneratedMessageLite.Builder) this).instance).put(str, str2);
                return this;
            }

            public Builder removeExtras(String str) {
                str.getClass();
                copyOnWrite();
                AdRequest.access$4400((AdRequest) ((GeneratedMessageLite.Builder) this).instance).remove(str);
                return this;
            }

            public Builder setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
                copyOnWrite();
                AdRequest.access$3900((AdRequest) ((GeneratedMessageLite.Builder) this).instance, adFormat);
                return this;
            }

            public Builder setAdFormatValue(int i) {
                copyOnWrite();
                AdRequest.access$3800((AdRequest) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setAdRequestType(AdRequestType adRequestType) {
                copyOnWrite();
                AdRequest.access$3300((AdRequest) ((GeneratedMessageLite.Builder) this).instance, adRequestType);
                return this;
            }

            public Builder setAdRequestTypeValue(int i) {
                copyOnWrite();
                AdRequest.access$3200((AdRequest) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setBannerSize(BannerSize bannerSize) {
                copyOnWrite();
                AdRequest.access$3500((AdRequest) ((GeneratedMessageLite.Builder) this).instance, bannerSize);
                return this;
            }

            public Builder setCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
                copyOnWrite();
                AdRequest.access$1600((AdRequest) ((GeneratedMessageLite.Builder) this).instance, campaignState);
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                AdRequest.access$1300((AdRequest) ((GeneratedMessageLite.Builder) this).instance, dynamicDeviceInfo);
                return this;
            }

            public Builder setImpressionOpportunityId(ByteString byteString) {
                copyOnWrite();
                AdRequest.access$1900((AdRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setMediationAdUnitId(String str) {
                copyOnWrite();
                AdRequest.access$4100((AdRequest) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setMediationAdUnitIdBytes(ByteString byteString) {
                copyOnWrite();
                AdRequest.access$4300((AdRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setMediationInfo(MediationInfoOuterClass.MediationInfo mediationInfo) {
                copyOnWrite();
                AdRequest.access$4500((AdRequest) ((GeneratedMessageLite.Builder) this).instance, mediationInfo);
                return this;
            }

            public Builder setPlacementId(String str) {
                copyOnWrite();
                AdRequest.access$2100((AdRequest) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setPlacementIdBytes(ByteString byteString) {
                copyOnWrite();
                AdRequest.access$2300((AdRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setRequestImpressionConfiguration(boolean z) {
                copyOnWrite();
                AdRequest.access$2400((AdRequest) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setScarSignal(ByteString byteString) {
                copyOnWrite();
                AdRequest.access$2600((AdRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                AdRequest.access$700((AdRequest) ((GeneratedMessageLite.Builder) this).instance, sessionCounters);
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                AdRequest.access$1000((AdRequest) ((GeneratedMessageLite.Builder) this).instance, staticDeviceInfo);
                return this;
            }

            public Builder setTcf(ByteString byteString) {
                copyOnWrite();
                AdRequest.access$3000((AdRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setWebviewVersion(int i) {
                copyOnWrite();
                AdRequest.access$2800((AdRequest) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            private Builder() {
                super(AdRequest.access$600());
            }

            public Builder setBannerSize(BannerSize.Builder builder) {
                copyOnWrite();
                AdRequest.access$3500((AdRequest) ((GeneratedMessageLite.Builder) this).instance, (BannerSize) builder.build());
                return this;
            }

            public Builder setCampaignState(CampaignStateOuterClass.CampaignState.Builder builder) {
                copyOnWrite();
                AdRequest.access$1600((AdRequest) ((GeneratedMessageLite.Builder) this).instance, (CampaignStateOuterClass.CampaignState) builder.build());
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                copyOnWrite();
                AdRequest.access$1300((AdRequest) ((GeneratedMessageLite.Builder) this).instance, (DynamicDeviceInfoOuterClass.DynamicDeviceInfo) builder.build());
                return this;
            }

            public Builder setMediationInfo(MediationInfoOuterClass.MediationInfo.Builder builder) {
                copyOnWrite();
                AdRequest.access$4500((AdRequest) ((GeneratedMessageLite.Builder) this).instance, (MediationInfoOuterClass.MediationInfo) builder.build());
                return this;
            }

            public Builder setSessionCounters(SessionCountersOuterClass.SessionCounters.Builder builder) {
                copyOnWrite();
                AdRequest.access$700((AdRequest) ((GeneratedMessageLite.Builder) this).instance, (SessionCountersOuterClass.SessionCounters) builder.build());
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                copyOnWrite();
                AdRequest.access$1000((AdRequest) ((GeneratedMessageLite.Builder) this).instance, (StaticDeviceInfoOuterClass.StaticDeviceInfo) builder.build());
                return this;
            }
        }

        public static final class a {
            public static final MapEntryLite a;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                a = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
            }
        }

        static {
            AdRequest adRequest = new AdRequest();
            DEFAULT_INSTANCE = adRequest;
            GeneratedMessageLite.registerDefaultInstance(AdRequest.class, adRequest);
        }

        private AdRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.impressionOpportunityId_ = byteString;
            this.placementId_ = "";
            this.scarSignal_ = byteString;
            this.tcf_ = byteString;
            this.mediationAdUnitId_ = "";
        }

        public static /* synthetic */ void access$1000(AdRequest adRequest, StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            adRequest.setStaticDeviceInfo(staticDeviceInfo);
        }

        public static /* synthetic */ void access$1100(AdRequest adRequest, StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            adRequest.mergeStaticDeviceInfo(staticDeviceInfo);
        }

        public static /* synthetic */ void access$1200(AdRequest adRequest) {
            adRequest.clearStaticDeviceInfo();
        }

        public static /* synthetic */ void access$1300(AdRequest adRequest, DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            adRequest.setDynamicDeviceInfo(dynamicDeviceInfo);
        }

        public static /* synthetic */ void access$1400(AdRequest adRequest, DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            adRequest.mergeDynamicDeviceInfo(dynamicDeviceInfo);
        }

        public static /* synthetic */ void access$1500(AdRequest adRequest) {
            adRequest.clearDynamicDeviceInfo();
        }

        public static /* synthetic */ void access$1600(AdRequest adRequest, CampaignStateOuterClass.CampaignState campaignState) {
            adRequest.setCampaignState(campaignState);
        }

        public static /* synthetic */ void access$1700(AdRequest adRequest, CampaignStateOuterClass.CampaignState campaignState) {
            adRequest.mergeCampaignState(campaignState);
        }

        public static /* synthetic */ void access$1800(AdRequest adRequest) {
            adRequest.clearCampaignState();
        }

        public static /* synthetic */ void access$1900(AdRequest adRequest, ByteString byteString) {
            adRequest.setImpressionOpportunityId(byteString);
        }

        public static /* synthetic */ void access$2000(AdRequest adRequest) {
            adRequest.clearImpressionOpportunityId();
        }

        public static /* synthetic */ void access$2100(AdRequest adRequest, String str) {
            adRequest.setPlacementId(str);
        }

        public static /* synthetic */ void access$2200(AdRequest adRequest) {
            adRequest.clearPlacementId();
        }

        public static /* synthetic */ void access$2300(AdRequest adRequest, ByteString byteString) {
            adRequest.setPlacementIdBytes(byteString);
        }

        public static /* synthetic */ void access$2400(AdRequest adRequest, boolean z) {
            adRequest.setRequestImpressionConfiguration(z);
        }

        public static /* synthetic */ void access$2500(AdRequest adRequest) {
            adRequest.clearRequestImpressionConfiguration();
        }

        public static /* synthetic */ void access$2600(AdRequest adRequest, ByteString byteString) {
            adRequest.setScarSignal(byteString);
        }

        public static /* synthetic */ void access$2700(AdRequest adRequest) {
            adRequest.clearScarSignal();
        }

        public static /* synthetic */ void access$2800(AdRequest adRequest, int i) {
            adRequest.setWebviewVersion(i);
        }

        public static /* synthetic */ void access$2900(AdRequest adRequest) {
            adRequest.clearWebviewVersion();
        }

        public static /* synthetic */ void access$3000(AdRequest adRequest, ByteString byteString) {
            adRequest.setTcf(byteString);
        }

        public static /* synthetic */ void access$3100(AdRequest adRequest) {
            adRequest.clearTcf();
        }

        public static /* synthetic */ void access$3200(AdRequest adRequest, int i) {
            adRequest.setAdRequestTypeValue(i);
        }

        public static /* synthetic */ void access$3300(AdRequest adRequest, AdRequestType adRequestType) {
            adRequest.setAdRequestType(adRequestType);
        }

        public static /* synthetic */ void access$3400(AdRequest adRequest) {
            adRequest.clearAdRequestType();
        }

        public static /* synthetic */ void access$3500(AdRequest adRequest, BannerSize bannerSize) {
            adRequest.setBannerSize(bannerSize);
        }

        public static /* synthetic */ void access$3600(AdRequest adRequest, BannerSize bannerSize) {
            adRequest.mergeBannerSize(bannerSize);
        }

        public static /* synthetic */ void access$3700(AdRequest adRequest) {
            adRequest.clearBannerSize();
        }

        public static /* synthetic */ void access$3800(AdRequest adRequest, int i) {
            adRequest.setAdFormatValue(i);
        }

        public static /* synthetic */ void access$3900(AdRequest adRequest, AdFormatOuterClass.AdFormat adFormat) {
            adRequest.setAdFormat(adFormat);
        }

        public static /* synthetic */ void access$4000(AdRequest adRequest) {
            adRequest.clearAdFormat();
        }

        public static /* synthetic */ void access$4100(AdRequest adRequest, String str) {
            adRequest.setMediationAdUnitId(str);
        }

        public static /* synthetic */ void access$4200(AdRequest adRequest) {
            adRequest.clearMediationAdUnitId();
        }

        public static /* synthetic */ void access$4300(AdRequest adRequest, ByteString byteString) {
            adRequest.setMediationAdUnitIdBytes(byteString);
        }

        public static /* synthetic */ Map access$4400(AdRequest adRequest) {
            return adRequest.getMutableExtrasMap();
        }

        public static /* synthetic */ void access$4500(AdRequest adRequest, MediationInfoOuterClass.MediationInfo mediationInfo) {
            adRequest.setMediationInfo(mediationInfo);
        }

        public static /* synthetic */ void access$4600(AdRequest adRequest, MediationInfoOuterClass.MediationInfo mediationInfo) {
            adRequest.mergeMediationInfo(mediationInfo);
        }

        public static /* synthetic */ void access$4700(AdRequest adRequest) {
            adRequest.clearMediationInfo();
        }

        public static /* synthetic */ AdRequest access$600() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$700(AdRequest adRequest, SessionCountersOuterClass.SessionCounters sessionCounters) {
            adRequest.setSessionCounters(sessionCounters);
        }

        public static /* synthetic */ void access$800(AdRequest adRequest, SessionCountersOuterClass.SessionCounters sessionCounters) {
            adRequest.mergeSessionCounters(sessionCounters);
        }

        public static /* synthetic */ void access$900(AdRequest adRequest) {
            adRequest.clearSessionCounters();
        }

        private void clearAdFormat() {
            this.bitField0_ &= -257;
            this.adFormat_ = 0;
        }

        private void clearAdRequestType() {
            this.bitField0_ &= -65;
            this.adRequestType_ = 0;
        }

        private void clearBannerSize() {
            this.bannerSize_ = null;
            this.bitField0_ &= -129;
        }

        private void clearCampaignState() {
            this.campaignState_ = null;
            this.bitField0_ &= -9;
        }

        private void clearDynamicDeviceInfo() {
            this.dynamicDeviceInfo_ = null;
            this.bitField0_ &= -5;
        }

        private void clearImpressionOpportunityId() {
            this.impressionOpportunityId_ = getDefaultInstance().getImpressionOpportunityId();
        }

        private void clearMediationAdUnitId() {
            this.bitField0_ &= -513;
            this.mediationAdUnitId_ = getDefaultInstance().getMediationAdUnitId();
        }

        private void clearMediationInfo() {
            this.mediationInfo_ = null;
            this.bitField0_ &= -1025;
        }

        private void clearPlacementId() {
            this.placementId_ = getDefaultInstance().getPlacementId();
        }

        private void clearRequestImpressionConfiguration() {
            this.requestImpressionConfiguration_ = false;
        }

        private void clearScarSignal() {
            this.scarSignal_ = getDefaultInstance().getScarSignal();
        }

        private void clearSessionCounters() {
            this.sessionCounters_ = null;
            this.bitField0_ &= -2;
        }

        private void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
            this.bitField0_ &= -3;
        }

        private void clearTcf() {
            this.bitField0_ &= -33;
            this.tcf_ = getDefaultInstance().getTcf();
        }

        private void clearWebviewVersion() {
            this.bitField0_ &= -17;
            this.webviewVersion_ = 0;
        }

        public static AdRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private Map getMutableExtrasMap() {
            return internalGetMutableExtras();
        }

        private MapFieldLite internalGetExtras() {
            return this.extras_;
        }

        private MapFieldLite internalGetMutableExtras() {
            if (!this.extras_.isMutable()) {
                this.extras_ = this.extras_.mutableCopy();
            }
            return this.extras_;
        }

        private void mergeBannerSize(BannerSize bannerSize) {
            bannerSize.getClass();
            BannerSize bannerSize2 = this.bannerSize_;
            if (bannerSize2 == null || bannerSize2 == BannerSize.getDefaultInstance()) {
                this.bannerSize_ = bannerSize;
            } else {
                this.bannerSize_ = (BannerSize) ((BannerSize.Builder) BannerSize.newBuilder(this.bannerSize_).mergeFrom(bannerSize)).buildPartial();
            }
            this.bitField0_ |= 128;
        }

        private void mergeCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
            campaignState.getClass();
            CampaignStateOuterClass.CampaignState campaignState2 = this.campaignState_;
            if (campaignState2 == null || campaignState2 == CampaignStateOuterClass.CampaignState.getDefaultInstance()) {
                this.campaignState_ = campaignState;
            } else {
                this.campaignState_ = (CampaignStateOuterClass.CampaignState) ((CampaignStateOuterClass.CampaignState.Builder) CampaignStateOuterClass.CampaignState.newBuilder(this.campaignState_).mergeFrom(campaignState)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        private void mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo2 = this.dynamicDeviceInfo_;
            if (dynamicDeviceInfo2 == null || dynamicDeviceInfo2 == DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance()) {
                this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            } else {
                this.dynamicDeviceInfo_ = (DynamicDeviceInfoOuterClass.DynamicDeviceInfo) ((DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder) DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder(this.dynamicDeviceInfo_).mergeFrom(dynamicDeviceInfo)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        private void mergeMediationInfo(MediationInfoOuterClass.MediationInfo mediationInfo) {
            mediationInfo.getClass();
            MediationInfoOuterClass.MediationInfo mediationInfo2 = this.mediationInfo_;
            if (mediationInfo2 == null || mediationInfo2 == MediationInfoOuterClass.MediationInfo.getDefaultInstance()) {
                this.mediationInfo_ = mediationInfo;
            } else {
                this.mediationInfo_ = (MediationInfoOuterClass.MediationInfo) ((MediationInfoOuterClass.MediationInfo.Builder) MediationInfoOuterClass.MediationInfo.newBuilder(this.mediationInfo_).mergeFrom(mediationInfo)).buildPartial();
            }
            this.bitField0_ |= 1024;
        }

        private void mergeSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
            sessionCounters.getClass();
            SessionCountersOuterClass.SessionCounters sessionCounters2 = this.sessionCounters_;
            if (sessionCounters2 == null || sessionCounters2 == SessionCountersOuterClass.SessionCounters.getDefaultInstance()) {
                this.sessionCounters_ = sessionCounters;
            } else {
                this.sessionCounters_ = (SessionCountersOuterClass.SessionCounters) ((SessionCountersOuterClass.SessionCounters.Builder) SessionCountersOuterClass.SessionCounters.newBuilder(this.sessionCounters_).mergeFrom(sessionCounters)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo2 = this.staticDeviceInfo_;
            if (staticDeviceInfo2 == null || staticDeviceInfo2 == StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance()) {
                this.staticDeviceInfo_ = staticDeviceInfo;
            } else {
                this.staticDeviceInfo_ = (StaticDeviceInfoOuterClass.StaticDeviceInfo) ((StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder) StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder(this.staticDeviceInfo_).mergeFrom(staticDeviceInfo)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static AdRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
            this.adFormat_ = adFormat.getNumber();
            this.bitField0_ |= 256;
        }

        private void setAdFormatValue(int i) {
            this.bitField0_ |= 256;
            this.adFormat_ = i;
        }

        private void setAdRequestType(AdRequestType adRequestType) {
            this.adRequestType_ = adRequestType.getNumber();
            this.bitField0_ |= 64;
        }

        private void setAdRequestTypeValue(int i) {
            this.bitField0_ |= 64;
            this.adRequestType_ = i;
        }

        private void setBannerSize(BannerSize bannerSize) {
            bannerSize.getClass();
            this.bannerSize_ = bannerSize;
            this.bitField0_ |= 128;
        }

        private void setCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
            campaignState.getClass();
            this.campaignState_ = campaignState;
            this.bitField0_ |= 8;
        }

        private void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            this.bitField0_ |= 4;
        }

        private void setImpressionOpportunityId(ByteString byteString) {
            byteString.getClass();
            this.impressionOpportunityId_ = byteString;
        }

        private void setMediationAdUnitId(String str) {
            str.getClass();
            this.bitField0_ |= 512;
            this.mediationAdUnitId_ = str;
        }

        private void setMediationAdUnitIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.mediationAdUnitId_ = byteString.toStringUtf8();
            this.bitField0_ |= 512;
        }

        private void setMediationInfo(MediationInfoOuterClass.MediationInfo mediationInfo) {
            mediationInfo.getClass();
            this.mediationInfo_ = mediationInfo;
            this.bitField0_ |= 1024;
        }

        private void setPlacementId(String str) {
            str.getClass();
            this.placementId_ = str;
        }

        private void setPlacementIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.placementId_ = byteString.toStringUtf8();
        }

        private void setRequestImpressionConfiguration(boolean z) {
            this.requestImpressionConfiguration_ = z;
        }

        private void setScarSignal(ByteString byteString) {
            byteString.getClass();
            this.scarSignal_ = byteString;
        }

        private void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
            sessionCounters.getClass();
            this.sessionCounters_ = sessionCounters;
            this.bitField0_ |= 1;
        }

        private void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            this.staticDeviceInfo_ = staticDeviceInfo;
            this.bitField0_ |= 2;
        }

        private void setTcf(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 32;
            this.tcf_ = byteString;
        }

        private void setWebviewVersion(int i) {
            this.bitField0_ |= 16;
            this.webviewVersion_ = i;
        }

        public boolean containsExtras(String str) {
            str.getClass();
            return internalGetExtras().containsKey(str);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AdRequest();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0001\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\n\u0006Ȉ\u0007\u0007\b\n\tင\u0004\nည\u0005\u000bဌ\u0006\fဉ\u0007\rဌ\b\u000eለ\t\u000f2\u0010ဉ\n", new Object[]{"bitField0_", "sessionCounters_", "staticDeviceInfo_", "dynamicDeviceInfo_", "campaignState_", "impressionOpportunityId_", "placementId_", "requestImpressionConfiguration_", "scarSignal_", "webviewVersion_", "tcf_", "adRequestType_", "bannerSize_", "adFormat_", "mediationAdUnitId_", "extras_", a.a, "mediationInfo_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (AdRequest.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } finally {
                            }
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat forNumber = AdFormatOuterClass.AdFormat.forNumber(this.adFormat_);
            return forNumber == null ? AdFormatOuterClass.AdFormat.UNRECOGNIZED : forNumber;
        }

        public int getAdFormatValue() {
            return this.adFormat_;
        }

        public AdRequestType getAdRequestType() {
            AdRequestType forNumber = AdRequestType.forNumber(this.adRequestType_);
            return forNumber == null ? AdRequestType.UNRECOGNIZED : forNumber;
        }

        public int getAdRequestTypeValue() {
            return this.adRequestType_;
        }

        public BannerSize getBannerSize() {
            BannerSize bannerSize = this.bannerSize_;
            return bannerSize == null ? BannerSize.getDefaultInstance() : bannerSize;
        }

        public CampaignStateOuterClass.CampaignState getCampaignState() {
            CampaignStateOuterClass.CampaignState campaignState = this.campaignState_;
            return campaignState == null ? CampaignStateOuterClass.CampaignState.getDefaultInstance() : campaignState;
        }

        public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.dynamicDeviceInfo_;
            return dynamicDeviceInfo == null ? DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance() : dynamicDeviceInfo;
        }

        @Deprecated
        public Map getExtras() {
            return getExtrasMap();
        }

        public int getExtrasCount() {
            return internalGetExtras().size();
        }

        public Map getExtrasMap() {
            return Collections.unmodifiableMap(internalGetExtras());
        }

        public String getExtrasOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite internalGetExtras = internalGetExtras();
            return internalGetExtras.containsKey(str) ? (String) internalGetExtras.get(str) : str2;
        }

        public String getExtrasOrThrow(String str) {
            str.getClass();
            MapFieldLite internalGetExtras = internalGetExtras();
            if (internalGetExtras.containsKey(str)) {
                return (String) internalGetExtras.get(str);
            }
            throw new IllegalArgumentException();
        }

        public ByteString getImpressionOpportunityId() {
            return this.impressionOpportunityId_;
        }

        public String getMediationAdUnitId() {
            return this.mediationAdUnitId_;
        }

        public ByteString getMediationAdUnitIdBytes() {
            return ByteString.copyFromUtf8(this.mediationAdUnitId_);
        }

        public MediationInfoOuterClass.MediationInfo getMediationInfo() {
            MediationInfoOuterClass.MediationInfo mediationInfo = this.mediationInfo_;
            return mediationInfo == null ? MediationInfoOuterClass.MediationInfo.getDefaultInstance() : mediationInfo;
        }

        public String getPlacementId() {
            return this.placementId_;
        }

        public ByteString getPlacementIdBytes() {
            return ByteString.copyFromUtf8(this.placementId_);
        }

        public boolean getRequestImpressionConfiguration() {
            return this.requestImpressionConfiguration_;
        }

        public ByteString getScarSignal() {
            return this.scarSignal_;
        }

        public SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this.sessionCounters_;
            return sessionCounters == null ? SessionCountersOuterClass.SessionCounters.getDefaultInstance() : sessionCounters;
        }

        public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this.staticDeviceInfo_;
            return staticDeviceInfo == null ? StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance() : staticDeviceInfo;
        }

        public ByteString getTcf() {
            return this.tcf_;
        }

        public int getWebviewVersion() {
            return this.webviewVersion_;
        }

        public boolean hasAdFormat() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasAdRequestType() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasBannerSize() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasCampaignState() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasDynamicDeviceInfo() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasMediationAdUnitId() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasMediationInfo() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasSessionCounters() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasStaticDeviceInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasTcf() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasWebviewVersion() {
            return (this.bitField0_ & 16) != 0;
        }

        public static Builder newBuilder(AdRequest adRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(adRequest);
        }

        public static AdRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AdRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AdRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AdRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AdRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AdRequest parseFrom(InputStream inputStream) throws IOException {
            return (AdRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AdRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AdRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface AdRequestOrBuilder extends MessageLiteOrBuilder {
        boolean containsExtras(String str);

        AdFormatOuterClass.AdFormat getAdFormat();

        int getAdFormatValue();

        AdRequestType getAdRequestType();

        int getAdRequestTypeValue();

        BannerSize getBannerSize();

        CampaignStateOuterClass.CampaignState getCampaignState();

        DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

        @Deprecated
        Map getExtras();

        int getExtrasCount();

        Map getExtrasMap();

        String getExtrasOrDefault(String str, String str2);

        String getExtrasOrThrow(String str);

        ByteString getImpressionOpportunityId();

        String getMediationAdUnitId();

        ByteString getMediationAdUnitIdBytes();

        MediationInfoOuterClass.MediationInfo getMediationInfo();

        String getPlacementId();

        ByteString getPlacementIdBytes();

        boolean getRequestImpressionConfiguration();

        ByteString getScarSignal();

        SessionCountersOuterClass.SessionCounters getSessionCounters();

        StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo();

        ByteString getTcf();

        int getWebviewVersion();

        boolean hasAdFormat();

        boolean hasAdRequestType();

        boolean hasBannerSize();

        boolean hasCampaignState();

        boolean hasDynamicDeviceInfo();

        boolean hasMediationAdUnitId();

        boolean hasMediationInfo();

        boolean hasSessionCounters();

        boolean hasStaticDeviceInfo();

        boolean hasTcf();

        boolean hasWebviewVersion();
    }

    public enum AdRequestType implements Internal.EnumLite {
        AD_REQUEST_TYPE_UNSPECIFIED(0),
        AD_REQUEST_TYPE_FULLSCREEN(1),
        AD_REQUEST_TYPE_BANNER(2),
        UNRECOGNIZED(-1);

        public static final int AD_REQUEST_TYPE_BANNER_VALUE = 2;
        public static final int AD_REQUEST_TYPE_FULLSCREEN_VALUE = 1;
        public static final int AD_REQUEST_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AdRequestType findValueByNumber(int i) {
                return AdRequestType.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier a = new b();

            public boolean isInRange(int i) {
                return AdRequestType.forNumber(i) != null;
            }
        }

        AdRequestType(int i) {
            this.value = i;
        }

        public static AdRequestType forNumber(int i) {
            if (i == 0) {
                return AD_REQUEST_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return AD_REQUEST_TYPE_FULLSCREEN;
            }
            if (i != 2) {
                return null;
            }
            return AD_REQUEST_TYPE_BANNER;
        }

        public static Internal.EnumLiteMap internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.a;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static AdRequestType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class BannerSize extends GeneratedMessageLite implements BannerSizeOrBuilder {
        private static final BannerSize DEFAULT_INSTANCE;
        public static final int HEIGHT_FIELD_NUMBER = 2;
        private static volatile Parser PARSER = null;
        public static final int WIDTH_FIELD_NUMBER = 1;
        private int height_;
        private int width_;

        public static final class Builder extends GeneratedMessageLite.Builder implements BannerSizeOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearHeight() {
                copyOnWrite();
                BannerSize.access$400((BannerSize) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearWidth() {
                copyOnWrite();
                BannerSize.access$200((BannerSize) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public int getHeight() {
                return ((BannerSize) ((GeneratedMessageLite.Builder) this).instance).getHeight();
            }

            public int getWidth() {
                return ((BannerSize) ((GeneratedMessageLite.Builder) this).instance).getWidth();
            }

            public Builder setHeight(int i) {
                copyOnWrite();
                BannerSize.access$300((BannerSize) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setWidth(int i) {
                copyOnWrite();
                BannerSize.access$100((BannerSize) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            private Builder() {
                super(BannerSize.access$000());
            }
        }

        static {
            BannerSize bannerSize = new BannerSize();
            DEFAULT_INSTANCE = bannerSize;
            GeneratedMessageLite.registerDefaultInstance(BannerSize.class, bannerSize);
        }

        private BannerSize() {
        }

        public static /* synthetic */ BannerSize access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(BannerSize bannerSize, int i) {
            bannerSize.setWidth(i);
        }

        public static /* synthetic */ void access$200(BannerSize bannerSize) {
            bannerSize.clearWidth();
        }

        public static /* synthetic */ void access$300(BannerSize bannerSize, int i) {
            bannerSize.setHeight(i);
        }

        public static /* synthetic */ void access$400(BannerSize bannerSize) {
            bannerSize.clearHeight();
        }

        private void clearHeight() {
            this.height_ = 0;
        }

        private void clearWidth() {
            this.width_ = 0;
        }

        public static BannerSize getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BannerSize parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BannerSize) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BannerSize parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setHeight(int i) {
            this.height_ = i;
        }

        private void setWidth(int i) {
            this.width_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new BannerSize();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"width_", "height_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (BannerSize.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } finally {
                            }
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getHeight() {
            return this.height_;
        }

        public int getWidth() {
            return this.width_;
        }

        public static Builder newBuilder(BannerSize bannerSize) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bannerSize);
        }

        public static BannerSize parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BannerSize) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BannerSize parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BannerSize parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BannerSize parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BannerSize parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BannerSize parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BannerSize parseFrom(InputStream inputStream) throws IOException {
            return (BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BannerSize parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BannerSize parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BannerSize parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface BannerSizeOrBuilder extends MessageLiteOrBuilder {
        int getHeight();

        int getWidth();
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private AdRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
