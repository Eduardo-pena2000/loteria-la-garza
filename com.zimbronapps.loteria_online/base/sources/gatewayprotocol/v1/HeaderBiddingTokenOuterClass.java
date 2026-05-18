package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.InitializationDataOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TestDataOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class HeaderBiddingTokenOuterClass {

    public static final class HeaderBiddingToken extends GeneratedMessageLite implements HeaderBiddingTokenOrBuilder {
        public static final int AD_FORMAT_FIELD_NUMBER = 15;
        public static final int CAMPAIGN_STATE_FIELD_NUMBER = 10;
        public static final int CLIENT_INFO_FIELD_NUMBER = 4;
        private static final HeaderBiddingToken DEFAULT_INSTANCE;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 8;
        public static final int EXTRAS_FIELD_NUMBER = 19;
        public static final int INITIALIZATION_DATA_FIELD_NUMBER = 14;
        public static final int LIMITED_SESSION_TOKEN_FIELD_NUMBER = 13;
        public static final int MEDIATION_INFO_FIELD_NUMBER = 20;
        public static final int OFFERWALL_ENABLED_FIELD_NUMBER = 18;
        private static volatile Parser PARSER = null;
        public static final int PII_FIELD_NUMBER = 9;
        public static final int SCAR_SIGNALS_COLLECTED_FIELD_NUMBER = 12;
        public static final int SESSION_COUNTERS_FIELD_NUMBER = 6;
        public static final int SESSION_TOKEN_FIELD_NUMBER = 3;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 7;
        public static final int TCF_FIELD_NUMBER = 11;
        public static final int TEST_DATA_FIELD_NUMBER = 16;
        public static final int TIMESTAMPS_FIELD_NUMBER = 5;
        public static final int TOKEN_COUNTERS_FIELD_NUMBER = 17;
        public static final int TOKEN_ID_FIELD_NUMBER = 1;
        public static final int TOKEN_NUMBER_FIELD_NUMBER = 2;
        private int adFormat_;
        private int bitField0_;
        private CampaignStateOuterClass.CampaignState campaignState_;
        private ClientInfoOuterClass.ClientInfo clientInfo_;
        private DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo_;
        private MapFieldLite extras_ = MapFieldLite.emptyMapField();
        private InitializationDataOuterClass.InitializationData initializationData_;
        private UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken_;
        private MediationInfoOuterClass.MediationInfo mediationInfo_;
        private boolean offerwallEnabled_;
        private PiiOuterClass.Pii pii_;
        private boolean scarSignalsCollected_;
        private SessionCountersOuterClass.SessionCounters sessionCounters_;
        private ByteString sessionToken_;
        private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_;
        private ByteString tcf_;
        private TestDataOuterClass.TestData testData_;
        private TimestampsOuterClass.Timestamps timestamps_;
        private TokenCounters tokenCounters_;
        private ByteString tokenId_;
        private int tokenNumber_;

        public static final class Builder extends GeneratedMessageLite.Builder implements HeaderBiddingTokenOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearAdFormat() {
                copyOnWrite();
                HeaderBiddingToken.access$4800((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearCampaignState() {
                copyOnWrite();
                HeaderBiddingToken.access$3500((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearClientInfo() {
                copyOnWrite();
                HeaderBiddingToken.access$1700((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearDynamicDeviceInfo() {
                copyOnWrite();
                HeaderBiddingToken.access$2900((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearExtras() {
                copyOnWrite();
                HeaderBiddingToken.access$5700((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).clear();
                return this;
            }

            public Builder clearInitializationData() {
                copyOnWrite();
                HeaderBiddingToken.access$4500((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearLimitedSessionToken() {
                copyOnWrite();
                HeaderBiddingToken.access$4200((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearMediationInfo() {
                copyOnWrite();
                HeaderBiddingToken.access$6000((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearOfferwallEnabled() {
                copyOnWrite();
                HeaderBiddingToken.access$5600((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearPii() {
                copyOnWrite();
                HeaderBiddingToken.access$3200((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearScarSignalsCollected() {
                copyOnWrite();
                HeaderBiddingToken.access$3900((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearSessionCounters() {
                copyOnWrite();
                HeaderBiddingToken.access$2300((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearSessionToken() {
                copyOnWrite();
                HeaderBiddingToken.access$1400((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearStaticDeviceInfo() {
                copyOnWrite();
                HeaderBiddingToken.access$2600((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTcf() {
                copyOnWrite();
                HeaderBiddingToken.access$3700((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTestData() {
                copyOnWrite();
                HeaderBiddingToken.access$5100((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTimestamps() {
                copyOnWrite();
                HeaderBiddingToken.access$2000((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTokenCounters() {
                copyOnWrite();
                HeaderBiddingToken.access$5400((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTokenId() {
                copyOnWrite();
                HeaderBiddingToken.access$1000((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTokenNumber() {
                copyOnWrite();
                HeaderBiddingToken.access$1200((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public boolean containsExtras(String str) {
                str.getClass();
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).getExtrasMap().containsKey(str);
            }

            public AdFormatOuterClass.AdFormat getAdFormat() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).getAdFormat();
            }

            public int getAdFormatValue() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).getAdFormatValue();
            }

            public CampaignStateOuterClass.CampaignState getCampaignState() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).getCampaignState();
            }

            public ClientInfoOuterClass.ClientInfo getClientInfo() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).getClientInfo();
            }

            public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).getDynamicDeviceInfo();
            }

            @Deprecated
            public Map getExtras() {
                return getExtrasMap();
            }

            public int getExtrasCount() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).getExtrasMap().size();
            }

            public Map getExtrasMap() {
                return Collections.unmodifiableMap(((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).getExtrasMap());
            }

            public String getExtrasOrDefault(String str, String str2) {
                str.getClass();
                Map extrasMap = ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).getExtrasMap();
                return extrasMap.containsKey(str) ? (String) extrasMap.get(str) : str2;
            }

            public String getExtrasOrThrow(String str) {
                str.getClass();
                Map extrasMap = ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).getExtrasMap();
                if (extrasMap.containsKey(str)) {
                    return (String) extrasMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            public InitializationDataOuterClass.InitializationData getInitializationData() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).getInitializationData();
            }

            public UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).getLimitedSessionToken();
            }

            public MediationInfoOuterClass.MediationInfo getMediationInfo() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).getMediationInfo();
            }

            public boolean getOfferwallEnabled() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).getOfferwallEnabled();
            }

            public PiiOuterClass.Pii getPii() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).getPii();
            }

            public boolean getScarSignalsCollected() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).getScarSignalsCollected();
            }

            public SessionCountersOuterClass.SessionCounters getSessionCounters() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).getSessionCounters();
            }

            public ByteString getSessionToken() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).getSessionToken();
            }

            public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).getStaticDeviceInfo();
            }

            public ByteString getTcf() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).getTcf();
            }

            public TestDataOuterClass.TestData getTestData() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).getTestData();
            }

            public TimestampsOuterClass.Timestamps getTimestamps() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).getTimestamps();
            }

            public TokenCounters getTokenCounters() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).getTokenCounters();
            }

            public ByteString getTokenId() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).getTokenId();
            }

            public int getTokenNumber() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).getTokenNumber();
            }

            public boolean hasAdFormat() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).hasAdFormat();
            }

            public boolean hasCampaignState() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).hasCampaignState();
            }

            public boolean hasClientInfo() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).hasClientInfo();
            }

            public boolean hasDynamicDeviceInfo() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).hasDynamicDeviceInfo();
            }

            public boolean hasInitializationData() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).hasInitializationData();
            }

            public boolean hasLimitedSessionToken() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).hasLimitedSessionToken();
            }

            public boolean hasMediationInfo() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).hasMediationInfo();
            }

            public boolean hasOfferwallEnabled() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).hasOfferwallEnabled();
            }

            public boolean hasPii() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).hasPii();
            }

            public boolean hasScarSignalsCollected() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).hasScarSignalsCollected();
            }

            public boolean hasSessionCounters() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).hasSessionCounters();
            }

            public boolean hasStaticDeviceInfo() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).hasStaticDeviceInfo();
            }

            public boolean hasTcf() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).hasTcf();
            }

            public boolean hasTestData() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).hasTestData();
            }

            public boolean hasTimestamps() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).hasTimestamps();
            }

            public boolean hasTokenCounters() {
                return ((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).hasTokenCounters();
            }

            public Builder mergeCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
                copyOnWrite();
                HeaderBiddingToken.access$3400((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, campaignState);
                return this;
            }

            public Builder mergeClientInfo(ClientInfoOuterClass.ClientInfo clientInfo) {
                copyOnWrite();
                HeaderBiddingToken.access$1600((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, clientInfo);
                return this;
            }

            public Builder mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                HeaderBiddingToken.access$2800((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, dynamicDeviceInfo);
                return this;
            }

            public Builder mergeInitializationData(InitializationDataOuterClass.InitializationData initializationData) {
                copyOnWrite();
                HeaderBiddingToken.access$4400((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, initializationData);
                return this;
            }

            public Builder mergeLimitedSessionToken(UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken) {
                copyOnWrite();
                HeaderBiddingToken.access$4100((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, limitedSessionToken);
                return this;
            }

            public Builder mergeMediationInfo(MediationInfoOuterClass.MediationInfo mediationInfo) {
                copyOnWrite();
                HeaderBiddingToken.access$5900((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, mediationInfo);
                return this;
            }

            public Builder mergePii(PiiOuterClass.Pii pii) {
                copyOnWrite();
                HeaderBiddingToken.access$3100((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, pii);
                return this;
            }

            public Builder mergeSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                HeaderBiddingToken.access$2200((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, sessionCounters);
                return this;
            }

            public Builder mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                HeaderBiddingToken.access$2500((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, staticDeviceInfo);
                return this;
            }

            public Builder mergeTestData(TestDataOuterClass.TestData testData) {
                copyOnWrite();
                HeaderBiddingToken.access$5000((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, testData);
                return this;
            }

            public Builder mergeTimestamps(TimestampsOuterClass.Timestamps timestamps) {
                copyOnWrite();
                HeaderBiddingToken.access$1900((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, timestamps);
                return this;
            }

            public Builder mergeTokenCounters(TokenCounters tokenCounters) {
                copyOnWrite();
                HeaderBiddingToken.access$5300((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, tokenCounters);
                return this;
            }

            public Builder putAllExtras(Map map) {
                copyOnWrite();
                HeaderBiddingToken.access$5700((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).putAll(map);
                return this;
            }

            public Builder putExtras(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                HeaderBiddingToken.access$5700((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).put(str, str2);
                return this;
            }

            public Builder removeExtras(String str) {
                str.getClass();
                copyOnWrite();
                HeaderBiddingToken.access$5700((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance).remove(str);
                return this;
            }

            public Builder setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
                copyOnWrite();
                HeaderBiddingToken.access$4700((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, adFormat);
                return this;
            }

            public Builder setAdFormatValue(int i) {
                copyOnWrite();
                HeaderBiddingToken.access$4600((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
                copyOnWrite();
                HeaderBiddingToken.access$3300((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, campaignState);
                return this;
            }

            public Builder setClientInfo(ClientInfoOuterClass.ClientInfo clientInfo) {
                copyOnWrite();
                HeaderBiddingToken.access$1500((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, clientInfo);
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                HeaderBiddingToken.access$2700((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, dynamicDeviceInfo);
                return this;
            }

            public Builder setInitializationData(InitializationDataOuterClass.InitializationData initializationData) {
                copyOnWrite();
                HeaderBiddingToken.access$4300((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, initializationData);
                return this;
            }

            public Builder setLimitedSessionToken(UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken) {
                copyOnWrite();
                HeaderBiddingToken.access$4000((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, limitedSessionToken);
                return this;
            }

            public Builder setMediationInfo(MediationInfoOuterClass.MediationInfo mediationInfo) {
                copyOnWrite();
                HeaderBiddingToken.access$5800((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, mediationInfo);
                return this;
            }

            public Builder setOfferwallEnabled(boolean z) {
                copyOnWrite();
                HeaderBiddingToken.access$5500((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setPii(PiiOuterClass.Pii pii) {
                copyOnWrite();
                HeaderBiddingToken.access$3000((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, pii);
                return this;
            }

            public Builder setScarSignalsCollected(boolean z) {
                copyOnWrite();
                HeaderBiddingToken.access$3800((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                HeaderBiddingToken.access$2100((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, sessionCounters);
                return this;
            }

            public Builder setSessionToken(ByteString byteString) {
                copyOnWrite();
                HeaderBiddingToken.access$1300((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                HeaderBiddingToken.access$2400((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, staticDeviceInfo);
                return this;
            }

            public Builder setTcf(ByteString byteString) {
                copyOnWrite();
                HeaderBiddingToken.access$3600((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setTestData(TestDataOuterClass.TestData testData) {
                copyOnWrite();
                HeaderBiddingToken.access$4900((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, testData);
                return this;
            }

            public Builder setTimestamps(TimestampsOuterClass.Timestamps timestamps) {
                copyOnWrite();
                HeaderBiddingToken.access$1800((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, timestamps);
                return this;
            }

            public Builder setTokenCounters(TokenCounters tokenCounters) {
                copyOnWrite();
                HeaderBiddingToken.access$5200((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, tokenCounters);
                return this;
            }

            public Builder setTokenId(ByteString byteString) {
                copyOnWrite();
                HeaderBiddingToken.access$900((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setTokenNumber(int i) {
                copyOnWrite();
                HeaderBiddingToken.access$1100((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            private Builder() {
                super(HeaderBiddingToken.access$800());
            }

            public Builder setCampaignState(CampaignStateOuterClass.CampaignState.Builder builder) {
                copyOnWrite();
                HeaderBiddingToken.access$3300((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, (CampaignStateOuterClass.CampaignState) builder.build());
                return this;
            }

            public Builder setClientInfo(ClientInfoOuterClass.ClientInfo.Builder builder) {
                copyOnWrite();
                HeaderBiddingToken.access$1500((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, (ClientInfoOuterClass.ClientInfo) builder.build());
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                copyOnWrite();
                HeaderBiddingToken.access$2700((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, (DynamicDeviceInfoOuterClass.DynamicDeviceInfo) builder.build());
                return this;
            }

            public Builder setInitializationData(InitializationDataOuterClass.InitializationData.Builder builder) {
                copyOnWrite();
                HeaderBiddingToken.access$4300((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, (InitializationDataOuterClass.InitializationData) builder.build());
                return this;
            }

            public Builder setLimitedSessionToken(UniversalRequestOuterClass.LimitedSessionToken.Builder builder) {
                copyOnWrite();
                HeaderBiddingToken.access$4000((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, (UniversalRequestOuterClass.LimitedSessionToken) builder.build());
                return this;
            }

            public Builder setMediationInfo(MediationInfoOuterClass.MediationInfo.Builder builder) {
                copyOnWrite();
                HeaderBiddingToken.access$5800((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, (MediationInfoOuterClass.MediationInfo) builder.build());
                return this;
            }

            public Builder setPii(PiiOuterClass.Pii.Builder builder) {
                copyOnWrite();
                HeaderBiddingToken.access$3000((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, (PiiOuterClass.Pii) builder.build());
                return this;
            }

            public Builder setSessionCounters(SessionCountersOuterClass.SessionCounters.Builder builder) {
                copyOnWrite();
                HeaderBiddingToken.access$2100((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, (SessionCountersOuterClass.SessionCounters) builder.build());
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                copyOnWrite();
                HeaderBiddingToken.access$2400((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, (StaticDeviceInfoOuterClass.StaticDeviceInfo) builder.build());
                return this;
            }

            public Builder setTestData(TestDataOuterClass.TestData.Builder builder) {
                copyOnWrite();
                HeaderBiddingToken.access$4900((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, (TestDataOuterClass.TestData) builder.build());
                return this;
            }

            public Builder setTimestamps(TimestampsOuterClass.Timestamps.Builder builder) {
                copyOnWrite();
                HeaderBiddingToken.access$1800((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, (TimestampsOuterClass.Timestamps) builder.build());
                return this;
            }

            public Builder setTokenCounters(TokenCounters.Builder builder) {
                copyOnWrite();
                HeaderBiddingToken.access$5200((HeaderBiddingToken) ((GeneratedMessageLite.Builder) this).instance, (TokenCounters) builder.build());
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
            HeaderBiddingToken headerBiddingToken = new HeaderBiddingToken();
            DEFAULT_INSTANCE = headerBiddingToken;
            GeneratedMessageLite.registerDefaultInstance(HeaderBiddingToken.class, headerBiddingToken);
        }

        private HeaderBiddingToken() {
            ByteString byteString = ByteString.EMPTY;
            this.tokenId_ = byteString;
            this.sessionToken_ = byteString;
            this.tcf_ = byteString;
        }

        public static /* synthetic */ void access$1000(HeaderBiddingToken headerBiddingToken) {
            headerBiddingToken.clearTokenId();
        }

        public static /* synthetic */ void access$1100(HeaderBiddingToken headerBiddingToken, int i) {
            headerBiddingToken.setTokenNumber(i);
        }

        public static /* synthetic */ void access$1200(HeaderBiddingToken headerBiddingToken) {
            headerBiddingToken.clearTokenNumber();
        }

        public static /* synthetic */ void access$1300(HeaderBiddingToken headerBiddingToken, ByteString byteString) {
            headerBiddingToken.setSessionToken(byteString);
        }

        public static /* synthetic */ void access$1400(HeaderBiddingToken headerBiddingToken) {
            headerBiddingToken.clearSessionToken();
        }

        public static /* synthetic */ void access$1500(HeaderBiddingToken headerBiddingToken, ClientInfoOuterClass.ClientInfo clientInfo) {
            headerBiddingToken.setClientInfo(clientInfo);
        }

        public static /* synthetic */ void access$1600(HeaderBiddingToken headerBiddingToken, ClientInfoOuterClass.ClientInfo clientInfo) {
            headerBiddingToken.mergeClientInfo(clientInfo);
        }

        public static /* synthetic */ void access$1700(HeaderBiddingToken headerBiddingToken) {
            headerBiddingToken.clearClientInfo();
        }

        public static /* synthetic */ void access$1800(HeaderBiddingToken headerBiddingToken, TimestampsOuterClass.Timestamps timestamps) {
            headerBiddingToken.setTimestamps(timestamps);
        }

        public static /* synthetic */ void access$1900(HeaderBiddingToken headerBiddingToken, TimestampsOuterClass.Timestamps timestamps) {
            headerBiddingToken.mergeTimestamps(timestamps);
        }

        public static /* synthetic */ void access$2000(HeaderBiddingToken headerBiddingToken) {
            headerBiddingToken.clearTimestamps();
        }

        public static /* synthetic */ void access$2100(HeaderBiddingToken headerBiddingToken, SessionCountersOuterClass.SessionCounters sessionCounters) {
            headerBiddingToken.setSessionCounters(sessionCounters);
        }

        public static /* synthetic */ void access$2200(HeaderBiddingToken headerBiddingToken, SessionCountersOuterClass.SessionCounters sessionCounters) {
            headerBiddingToken.mergeSessionCounters(sessionCounters);
        }

        public static /* synthetic */ void access$2300(HeaderBiddingToken headerBiddingToken) {
            headerBiddingToken.clearSessionCounters();
        }

        public static /* synthetic */ void access$2400(HeaderBiddingToken headerBiddingToken, StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            headerBiddingToken.setStaticDeviceInfo(staticDeviceInfo);
        }

        public static /* synthetic */ void access$2500(HeaderBiddingToken headerBiddingToken, StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            headerBiddingToken.mergeStaticDeviceInfo(staticDeviceInfo);
        }

        public static /* synthetic */ void access$2600(HeaderBiddingToken headerBiddingToken) {
            headerBiddingToken.clearStaticDeviceInfo();
        }

        public static /* synthetic */ void access$2700(HeaderBiddingToken headerBiddingToken, DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            headerBiddingToken.setDynamicDeviceInfo(dynamicDeviceInfo);
        }

        public static /* synthetic */ void access$2800(HeaderBiddingToken headerBiddingToken, DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            headerBiddingToken.mergeDynamicDeviceInfo(dynamicDeviceInfo);
        }

        public static /* synthetic */ void access$2900(HeaderBiddingToken headerBiddingToken) {
            headerBiddingToken.clearDynamicDeviceInfo();
        }

        public static /* synthetic */ void access$3000(HeaderBiddingToken headerBiddingToken, PiiOuterClass.Pii pii) {
            headerBiddingToken.setPii(pii);
        }

        public static /* synthetic */ void access$3100(HeaderBiddingToken headerBiddingToken, PiiOuterClass.Pii pii) {
            headerBiddingToken.mergePii(pii);
        }

        public static /* synthetic */ void access$3200(HeaderBiddingToken headerBiddingToken) {
            headerBiddingToken.clearPii();
        }

        public static /* synthetic */ void access$3300(HeaderBiddingToken headerBiddingToken, CampaignStateOuterClass.CampaignState campaignState) {
            headerBiddingToken.setCampaignState(campaignState);
        }

        public static /* synthetic */ void access$3400(HeaderBiddingToken headerBiddingToken, CampaignStateOuterClass.CampaignState campaignState) {
            headerBiddingToken.mergeCampaignState(campaignState);
        }

        public static /* synthetic */ void access$3500(HeaderBiddingToken headerBiddingToken) {
            headerBiddingToken.clearCampaignState();
        }

        public static /* synthetic */ void access$3600(HeaderBiddingToken headerBiddingToken, ByteString byteString) {
            headerBiddingToken.setTcf(byteString);
        }

        public static /* synthetic */ void access$3700(HeaderBiddingToken headerBiddingToken) {
            headerBiddingToken.clearTcf();
        }

        public static /* synthetic */ void access$3800(HeaderBiddingToken headerBiddingToken, boolean z) {
            headerBiddingToken.setScarSignalsCollected(z);
        }

        public static /* synthetic */ void access$3900(HeaderBiddingToken headerBiddingToken) {
            headerBiddingToken.clearScarSignalsCollected();
        }

        public static /* synthetic */ void access$4000(HeaderBiddingToken headerBiddingToken, UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken) {
            headerBiddingToken.setLimitedSessionToken(limitedSessionToken);
        }

        public static /* synthetic */ void access$4100(HeaderBiddingToken headerBiddingToken, UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken) {
            headerBiddingToken.mergeLimitedSessionToken(limitedSessionToken);
        }

        public static /* synthetic */ void access$4200(HeaderBiddingToken headerBiddingToken) {
            headerBiddingToken.clearLimitedSessionToken();
        }

        public static /* synthetic */ void access$4300(HeaderBiddingToken headerBiddingToken, InitializationDataOuterClass.InitializationData initializationData) {
            headerBiddingToken.setInitializationData(initializationData);
        }

        public static /* synthetic */ void access$4400(HeaderBiddingToken headerBiddingToken, InitializationDataOuterClass.InitializationData initializationData) {
            headerBiddingToken.mergeInitializationData(initializationData);
        }

        public static /* synthetic */ void access$4500(HeaderBiddingToken headerBiddingToken) {
            headerBiddingToken.clearInitializationData();
        }

        public static /* synthetic */ void access$4600(HeaderBiddingToken headerBiddingToken, int i) {
            headerBiddingToken.setAdFormatValue(i);
        }

        public static /* synthetic */ void access$4700(HeaderBiddingToken headerBiddingToken, AdFormatOuterClass.AdFormat adFormat) {
            headerBiddingToken.setAdFormat(adFormat);
        }

        public static /* synthetic */ void access$4800(HeaderBiddingToken headerBiddingToken) {
            headerBiddingToken.clearAdFormat();
        }

        public static /* synthetic */ void access$4900(HeaderBiddingToken headerBiddingToken, TestDataOuterClass.TestData testData) {
            headerBiddingToken.setTestData(testData);
        }

        public static /* synthetic */ void access$5000(HeaderBiddingToken headerBiddingToken, TestDataOuterClass.TestData testData) {
            headerBiddingToken.mergeTestData(testData);
        }

        public static /* synthetic */ void access$5100(HeaderBiddingToken headerBiddingToken) {
            headerBiddingToken.clearTestData();
        }

        public static /* synthetic */ void access$5200(HeaderBiddingToken headerBiddingToken, TokenCounters tokenCounters) {
            headerBiddingToken.setTokenCounters(tokenCounters);
        }

        public static /* synthetic */ void access$5300(HeaderBiddingToken headerBiddingToken, TokenCounters tokenCounters) {
            headerBiddingToken.mergeTokenCounters(tokenCounters);
        }

        public static /* synthetic */ void access$5400(HeaderBiddingToken headerBiddingToken) {
            headerBiddingToken.clearTokenCounters();
        }

        public static /* synthetic */ void access$5500(HeaderBiddingToken headerBiddingToken, boolean z) {
            headerBiddingToken.setOfferwallEnabled(z);
        }

        public static /* synthetic */ void access$5600(HeaderBiddingToken headerBiddingToken) {
            headerBiddingToken.clearOfferwallEnabled();
        }

        public static /* synthetic */ Map access$5700(HeaderBiddingToken headerBiddingToken) {
            return headerBiddingToken.getMutableExtrasMap();
        }

        public static /* synthetic */ void access$5800(HeaderBiddingToken headerBiddingToken, MediationInfoOuterClass.MediationInfo mediationInfo) {
            headerBiddingToken.setMediationInfo(mediationInfo);
        }

        public static /* synthetic */ void access$5900(HeaderBiddingToken headerBiddingToken, MediationInfoOuterClass.MediationInfo mediationInfo) {
            headerBiddingToken.mergeMediationInfo(mediationInfo);
        }

        public static /* synthetic */ void access$6000(HeaderBiddingToken headerBiddingToken) {
            headerBiddingToken.clearMediationInfo();
        }

        public static /* synthetic */ HeaderBiddingToken access$800() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$900(HeaderBiddingToken headerBiddingToken, ByteString byteString) {
            headerBiddingToken.setTokenId(byteString);
        }

        private void clearAdFormat() {
            this.bitField0_ &= -2049;
            this.adFormat_ = 0;
        }

        private void clearCampaignState() {
            this.campaignState_ = null;
            this.bitField0_ &= -65;
        }

        private void clearClientInfo() {
            this.clientInfo_ = null;
            this.bitField0_ &= -2;
        }

        private void clearDynamicDeviceInfo() {
            this.dynamicDeviceInfo_ = null;
            this.bitField0_ &= -17;
        }

        private void clearInitializationData() {
            this.initializationData_ = null;
            this.bitField0_ &= -1025;
        }

        private void clearLimitedSessionToken() {
            this.limitedSessionToken_ = null;
            this.bitField0_ &= -513;
        }

        private void clearMediationInfo() {
            this.mediationInfo_ = null;
            this.bitField0_ &= -32769;
        }

        private void clearOfferwallEnabled() {
            this.bitField0_ &= -16385;
            this.offerwallEnabled_ = false;
        }

        private void clearPii() {
            this.pii_ = null;
            this.bitField0_ &= -33;
        }

        private void clearScarSignalsCollected() {
            this.bitField0_ &= -257;
            this.scarSignalsCollected_ = false;
        }

        private void clearSessionCounters() {
            this.sessionCounters_ = null;
            this.bitField0_ &= -5;
        }

        private void clearSessionToken() {
            this.sessionToken_ = getDefaultInstance().getSessionToken();
        }

        private void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
            this.bitField0_ &= -9;
        }

        private void clearTcf() {
            this.bitField0_ &= -129;
            this.tcf_ = getDefaultInstance().getTcf();
        }

        private void clearTestData() {
            this.testData_ = null;
            this.bitField0_ &= -4097;
        }

        private void clearTimestamps() {
            this.timestamps_ = null;
            this.bitField0_ &= -3;
        }

        private void clearTokenCounters() {
            this.tokenCounters_ = null;
            this.bitField0_ &= -8193;
        }

        private void clearTokenId() {
            this.tokenId_ = getDefaultInstance().getTokenId();
        }

        private void clearTokenNumber() {
            this.tokenNumber_ = 0;
        }

        public static HeaderBiddingToken getDefaultInstance() {
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

        private void mergeCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
            campaignState.getClass();
            CampaignStateOuterClass.CampaignState campaignState2 = this.campaignState_;
            if (campaignState2 == null || campaignState2 == CampaignStateOuterClass.CampaignState.getDefaultInstance()) {
                this.campaignState_ = campaignState;
            } else {
                this.campaignState_ = (CampaignStateOuterClass.CampaignState) ((CampaignStateOuterClass.CampaignState.Builder) CampaignStateOuterClass.CampaignState.newBuilder(this.campaignState_).mergeFrom(campaignState)).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        private void mergeClientInfo(ClientInfoOuterClass.ClientInfo clientInfo) {
            clientInfo.getClass();
            ClientInfoOuterClass.ClientInfo clientInfo2 = this.clientInfo_;
            if (clientInfo2 == null || clientInfo2 == ClientInfoOuterClass.ClientInfo.getDefaultInstance()) {
                this.clientInfo_ = clientInfo;
            } else {
                this.clientInfo_ = (ClientInfoOuterClass.ClientInfo) ((ClientInfoOuterClass.ClientInfo.Builder) ClientInfoOuterClass.ClientInfo.newBuilder(this.clientInfo_).mergeFrom(clientInfo)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo2 = this.dynamicDeviceInfo_;
            if (dynamicDeviceInfo2 == null || dynamicDeviceInfo2 == DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance()) {
                this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            } else {
                this.dynamicDeviceInfo_ = (DynamicDeviceInfoOuterClass.DynamicDeviceInfo) ((DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder) DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder(this.dynamicDeviceInfo_).mergeFrom(dynamicDeviceInfo)).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        private void mergeInitializationData(InitializationDataOuterClass.InitializationData initializationData) {
            initializationData.getClass();
            InitializationDataOuterClass.InitializationData initializationData2 = this.initializationData_;
            if (initializationData2 == null || initializationData2 == InitializationDataOuterClass.InitializationData.getDefaultInstance()) {
                this.initializationData_ = initializationData;
            } else {
                this.initializationData_ = (InitializationDataOuterClass.InitializationData) ((InitializationDataOuterClass.InitializationData.Builder) InitializationDataOuterClass.InitializationData.newBuilder(this.initializationData_).mergeFrom(initializationData)).buildPartial();
            }
            this.bitField0_ |= 1024;
        }

        private void mergeLimitedSessionToken(UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken) {
            limitedSessionToken.getClass();
            UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken2 = this.limitedSessionToken_;
            if (limitedSessionToken2 == null || limitedSessionToken2 == UniversalRequestOuterClass.LimitedSessionToken.getDefaultInstance()) {
                this.limitedSessionToken_ = limitedSessionToken;
            } else {
                this.limitedSessionToken_ = (UniversalRequestOuterClass.LimitedSessionToken) ((UniversalRequestOuterClass.LimitedSessionToken.Builder) UniversalRequestOuterClass.LimitedSessionToken.newBuilder(this.limitedSessionToken_).mergeFrom(limitedSessionToken)).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        private void mergeMediationInfo(MediationInfoOuterClass.MediationInfo mediationInfo) {
            mediationInfo.getClass();
            MediationInfoOuterClass.MediationInfo mediationInfo2 = this.mediationInfo_;
            if (mediationInfo2 == null || mediationInfo2 == MediationInfoOuterClass.MediationInfo.getDefaultInstance()) {
                this.mediationInfo_ = mediationInfo;
            } else {
                this.mediationInfo_ = (MediationInfoOuterClass.MediationInfo) ((MediationInfoOuterClass.MediationInfo.Builder) MediationInfoOuterClass.MediationInfo.newBuilder(this.mediationInfo_).mergeFrom(mediationInfo)).buildPartial();
            }
            this.bitField0_ |= 32768;
        }

        private void mergePii(PiiOuterClass.Pii pii) {
            pii.getClass();
            PiiOuterClass.Pii pii2 = this.pii_;
            if (pii2 == null || pii2 == PiiOuterClass.Pii.getDefaultInstance()) {
                this.pii_ = pii;
            } else {
                this.pii_ = (PiiOuterClass.Pii) ((PiiOuterClass.Pii.Builder) PiiOuterClass.Pii.newBuilder(this.pii_).mergeFrom(pii)).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        private void mergeSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
            sessionCounters.getClass();
            SessionCountersOuterClass.SessionCounters sessionCounters2 = this.sessionCounters_;
            if (sessionCounters2 == null || sessionCounters2 == SessionCountersOuterClass.SessionCounters.getDefaultInstance()) {
                this.sessionCounters_ = sessionCounters;
            } else {
                this.sessionCounters_ = (SessionCountersOuterClass.SessionCounters) ((SessionCountersOuterClass.SessionCounters.Builder) SessionCountersOuterClass.SessionCounters.newBuilder(this.sessionCounters_).mergeFrom(sessionCounters)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        private void mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo2 = this.staticDeviceInfo_;
            if (staticDeviceInfo2 == null || staticDeviceInfo2 == StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance()) {
                this.staticDeviceInfo_ = staticDeviceInfo;
            } else {
                this.staticDeviceInfo_ = (StaticDeviceInfoOuterClass.StaticDeviceInfo) ((StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder) StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder(this.staticDeviceInfo_).mergeFrom(staticDeviceInfo)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        private void mergeTestData(TestDataOuterClass.TestData testData) {
            testData.getClass();
            TestDataOuterClass.TestData testData2 = this.testData_;
            if (testData2 == null || testData2 == TestDataOuterClass.TestData.getDefaultInstance()) {
                this.testData_ = testData;
            } else {
                this.testData_ = (TestDataOuterClass.TestData) ((TestDataOuterClass.TestData.Builder) TestDataOuterClass.TestData.newBuilder(this.testData_).mergeFrom(testData)).buildPartial();
            }
            this.bitField0_ |= 4096;
        }

        private void mergeTimestamps(TimestampsOuterClass.Timestamps timestamps) {
            timestamps.getClass();
            TimestampsOuterClass.Timestamps timestamps2 = this.timestamps_;
            if (timestamps2 == null || timestamps2 == TimestampsOuterClass.Timestamps.getDefaultInstance()) {
                this.timestamps_ = timestamps;
            } else {
                this.timestamps_ = (TimestampsOuterClass.Timestamps) ((TimestampsOuterClass.Timestamps.Builder) TimestampsOuterClass.Timestamps.newBuilder(this.timestamps_).mergeFrom(timestamps)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeTokenCounters(TokenCounters tokenCounters) {
            tokenCounters.getClass();
            TokenCounters tokenCounters2 = this.tokenCounters_;
            if (tokenCounters2 == null || tokenCounters2 == TokenCounters.getDefaultInstance()) {
                this.tokenCounters_ = tokenCounters;
            } else {
                this.tokenCounters_ = (TokenCounters) ((TokenCounters.Builder) TokenCounters.newBuilder(this.tokenCounters_).mergeFrom(tokenCounters)).buildPartial();
            }
            this.bitField0_ |= 8192;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static HeaderBiddingToken parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (HeaderBiddingToken) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeaderBiddingToken parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (HeaderBiddingToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
            this.adFormat_ = adFormat.getNumber();
            this.bitField0_ |= 2048;
        }

        private void setAdFormatValue(int i) {
            this.bitField0_ |= 2048;
            this.adFormat_ = i;
        }

        private void setCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
            campaignState.getClass();
            this.campaignState_ = campaignState;
            this.bitField0_ |= 64;
        }

        private void setClientInfo(ClientInfoOuterClass.ClientInfo clientInfo) {
            clientInfo.getClass();
            this.clientInfo_ = clientInfo;
            this.bitField0_ |= 1;
        }

        private void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            this.bitField0_ |= 16;
        }

        private void setInitializationData(InitializationDataOuterClass.InitializationData initializationData) {
            initializationData.getClass();
            this.initializationData_ = initializationData;
            this.bitField0_ |= 1024;
        }

        private void setLimitedSessionToken(UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken) {
            limitedSessionToken.getClass();
            this.limitedSessionToken_ = limitedSessionToken;
            this.bitField0_ |= 512;
        }

        private void setMediationInfo(MediationInfoOuterClass.MediationInfo mediationInfo) {
            mediationInfo.getClass();
            this.mediationInfo_ = mediationInfo;
            this.bitField0_ |= 32768;
        }

        private void setOfferwallEnabled(boolean z) {
            this.bitField0_ |= 16384;
            this.offerwallEnabled_ = z;
        }

        private void setPii(PiiOuterClass.Pii pii) {
            pii.getClass();
            this.pii_ = pii;
            this.bitField0_ |= 32;
        }

        private void setScarSignalsCollected(boolean z) {
            this.bitField0_ |= 256;
            this.scarSignalsCollected_ = z;
        }

        private void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
            sessionCounters.getClass();
            this.sessionCounters_ = sessionCounters;
            this.bitField0_ |= 4;
        }

        private void setSessionToken(ByteString byteString) {
            byteString.getClass();
            this.sessionToken_ = byteString;
        }

        private void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            this.staticDeviceInfo_ = staticDeviceInfo;
            this.bitField0_ |= 8;
        }

        private void setTcf(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 128;
            this.tcf_ = byteString;
        }

        private void setTestData(TestDataOuterClass.TestData testData) {
            testData.getClass();
            this.testData_ = testData;
            this.bitField0_ |= 4096;
        }

        private void setTimestamps(TimestampsOuterClass.Timestamps timestamps) {
            timestamps.getClass();
            this.timestamps_ = timestamps;
            this.bitField0_ |= 2;
        }

        private void setTokenCounters(TokenCounters tokenCounters) {
            tokenCounters.getClass();
            this.tokenCounters_ = tokenCounters;
            this.bitField0_ |= 8192;
        }

        private void setTokenId(ByteString byteString) {
            byteString.getClass();
            this.tokenId_ = byteString;
        }

        private void setTokenNumber(int i) {
            this.tokenNumber_ = i;
        }

        public boolean containsExtras(String str) {
            str.getClass();
            return internalGetExtras().containsKey(str);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new HeaderBiddingToken();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0000\u0001\u0001\u0014\u0014\u0001\u0000\u0000\u0001\n\u0002\u0004\u0003\n\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0007ဉ\u0003\bဉ\u0004\tဉ\u0005\nဉ\u0006\u000bည\u0007\fဇ\b\rဉ\t\u000eဉ\n\u000fဌ\u000b\u0010ဉ\f\u0011ဉ\r\u0012ဇ\u000e\u00132\u0014ဉ\u000f", new Object[]{"bitField0_", "tokenId_", "tokenNumber_", "sessionToken_", "clientInfo_", "timestamps_", "sessionCounters_", "staticDeviceInfo_", "dynamicDeviceInfo_", "pii_", "campaignState_", "tcf_", "scarSignalsCollected_", "limitedSessionToken_", "initializationData_", "adFormat_", "testData_", "tokenCounters_", "offerwallEnabled_", "extras_", a.a, "mediationInfo_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (HeaderBiddingToken.class) {
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

        public CampaignStateOuterClass.CampaignState getCampaignState() {
            CampaignStateOuterClass.CampaignState campaignState = this.campaignState_;
            return campaignState == null ? CampaignStateOuterClass.CampaignState.getDefaultInstance() : campaignState;
        }

        public ClientInfoOuterClass.ClientInfo getClientInfo() {
            ClientInfoOuterClass.ClientInfo clientInfo = this.clientInfo_;
            return clientInfo == null ? ClientInfoOuterClass.ClientInfo.getDefaultInstance() : clientInfo;
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

        public InitializationDataOuterClass.InitializationData getInitializationData() {
            InitializationDataOuterClass.InitializationData initializationData = this.initializationData_;
            return initializationData == null ? InitializationDataOuterClass.InitializationData.getDefaultInstance() : initializationData;
        }

        public UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken() {
            UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken = this.limitedSessionToken_;
            return limitedSessionToken == null ? UniversalRequestOuterClass.LimitedSessionToken.getDefaultInstance() : limitedSessionToken;
        }

        public MediationInfoOuterClass.MediationInfo getMediationInfo() {
            MediationInfoOuterClass.MediationInfo mediationInfo = this.mediationInfo_;
            return mediationInfo == null ? MediationInfoOuterClass.MediationInfo.getDefaultInstance() : mediationInfo;
        }

        public boolean getOfferwallEnabled() {
            return this.offerwallEnabled_;
        }

        public PiiOuterClass.Pii getPii() {
            PiiOuterClass.Pii pii = this.pii_;
            return pii == null ? PiiOuterClass.Pii.getDefaultInstance() : pii;
        }

        public boolean getScarSignalsCollected() {
            return this.scarSignalsCollected_;
        }

        public SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this.sessionCounters_;
            return sessionCounters == null ? SessionCountersOuterClass.SessionCounters.getDefaultInstance() : sessionCounters;
        }

        public ByteString getSessionToken() {
            return this.sessionToken_;
        }

        public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this.staticDeviceInfo_;
            return staticDeviceInfo == null ? StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance() : staticDeviceInfo;
        }

        public ByteString getTcf() {
            return this.tcf_;
        }

        public TestDataOuterClass.TestData getTestData() {
            TestDataOuterClass.TestData testData = this.testData_;
            return testData == null ? TestDataOuterClass.TestData.getDefaultInstance() : testData;
        }

        public TimestampsOuterClass.Timestamps getTimestamps() {
            TimestampsOuterClass.Timestamps timestamps = this.timestamps_;
            return timestamps == null ? TimestampsOuterClass.Timestamps.getDefaultInstance() : timestamps;
        }

        public TokenCounters getTokenCounters() {
            TokenCounters tokenCounters = this.tokenCounters_;
            return tokenCounters == null ? TokenCounters.getDefaultInstance() : tokenCounters;
        }

        public ByteString getTokenId() {
            return this.tokenId_;
        }

        public int getTokenNumber() {
            return this.tokenNumber_;
        }

        public boolean hasAdFormat() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasCampaignState() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasClientInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasDynamicDeviceInfo() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasInitializationData() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasLimitedSessionToken() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasMediationInfo() {
            return (this.bitField0_ & 32768) != 0;
        }

        public boolean hasOfferwallEnabled() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasPii() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasScarSignalsCollected() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasSessionCounters() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasStaticDeviceInfo() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasTcf() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasTestData() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasTimestamps() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasTokenCounters() {
            return (this.bitField0_ & 8192) != 0;
        }

        public static Builder newBuilder(HeaderBiddingToken headerBiddingToken) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(headerBiddingToken);
        }

        public static HeaderBiddingToken parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeaderBiddingToken) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HeaderBiddingToken parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HeaderBiddingToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static HeaderBiddingToken parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (HeaderBiddingToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static HeaderBiddingToken parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HeaderBiddingToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static HeaderBiddingToken parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (HeaderBiddingToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HeaderBiddingToken parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HeaderBiddingToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static HeaderBiddingToken parseFrom(InputStream inputStream) throws IOException {
            return (HeaderBiddingToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeaderBiddingToken parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeaderBiddingToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HeaderBiddingToken parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (HeaderBiddingToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static HeaderBiddingToken parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeaderBiddingToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface HeaderBiddingTokenOrBuilder extends MessageLiteOrBuilder {
        boolean containsExtras(String str);

        AdFormatOuterClass.AdFormat getAdFormat();

        int getAdFormatValue();

        CampaignStateOuterClass.CampaignState getCampaignState();

        ClientInfoOuterClass.ClientInfo getClientInfo();

        DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

        @Deprecated
        Map getExtras();

        int getExtrasCount();

        Map getExtrasMap();

        String getExtrasOrDefault(String str, String str2);

        String getExtrasOrThrow(String str);

        InitializationDataOuterClass.InitializationData getInitializationData();

        UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken();

        MediationInfoOuterClass.MediationInfo getMediationInfo();

        boolean getOfferwallEnabled();

        PiiOuterClass.Pii getPii();

        boolean getScarSignalsCollected();

        SessionCountersOuterClass.SessionCounters getSessionCounters();

        ByteString getSessionToken();

        StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo();

        ByteString getTcf();

        TestDataOuterClass.TestData getTestData();

        TimestampsOuterClass.Timestamps getTimestamps();

        TokenCounters getTokenCounters();

        ByteString getTokenId();

        int getTokenNumber();

        boolean hasAdFormat();

        boolean hasCampaignState();

        boolean hasClientInfo();

        boolean hasDynamicDeviceInfo();

        boolean hasInitializationData();

        boolean hasLimitedSessionToken();

        boolean hasMediationInfo();

        boolean hasOfferwallEnabled();

        boolean hasPii();

        boolean hasScarSignalsCollected();

        boolean hasSessionCounters();

        boolean hasStaticDeviceInfo();

        boolean hasTcf();

        boolean hasTestData();

        boolean hasTimestamps();

        boolean hasTokenCounters();
    }

    public static final class TokenCounters extends GeneratedMessageLite implements TokenCountersOrBuilder {
        private static final TokenCounters DEFAULT_INSTANCE;
        private static volatile Parser PARSER = null;
        public static final int SEQ_FIELD_NUMBER = 1;
        public static final int STARTS_FIELD_NUMBER = 3;
        public static final int WINS_FIELD_NUMBER = 2;
        private int seq_;
        private int starts_;
        private int wins_;

        public static final class Builder extends GeneratedMessageLite.Builder implements TokenCountersOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearSeq() {
                copyOnWrite();
                TokenCounters.access$200((TokenCounters) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearStarts() {
                copyOnWrite();
                TokenCounters.access$600((TokenCounters) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearWins() {
                copyOnWrite();
                TokenCounters.access$400((TokenCounters) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public int getSeq() {
                return ((TokenCounters) ((GeneratedMessageLite.Builder) this).instance).getSeq();
            }

            public int getStarts() {
                return ((TokenCounters) ((GeneratedMessageLite.Builder) this).instance).getStarts();
            }

            public int getWins() {
                return ((TokenCounters) ((GeneratedMessageLite.Builder) this).instance).getWins();
            }

            public Builder setSeq(int i) {
                copyOnWrite();
                TokenCounters.access$100((TokenCounters) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setStarts(int i) {
                copyOnWrite();
                TokenCounters.access$500((TokenCounters) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setWins(int i) {
                copyOnWrite();
                TokenCounters.access$300((TokenCounters) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            private Builder() {
                super(TokenCounters.access$000());
            }
        }

        static {
            TokenCounters tokenCounters = new TokenCounters();
            DEFAULT_INSTANCE = tokenCounters;
            GeneratedMessageLite.registerDefaultInstance(TokenCounters.class, tokenCounters);
        }

        private TokenCounters() {
        }

        public static /* synthetic */ TokenCounters access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(TokenCounters tokenCounters, int i) {
            tokenCounters.setSeq(i);
        }

        public static /* synthetic */ void access$200(TokenCounters tokenCounters) {
            tokenCounters.clearSeq();
        }

        public static /* synthetic */ void access$300(TokenCounters tokenCounters, int i) {
            tokenCounters.setWins(i);
        }

        public static /* synthetic */ void access$400(TokenCounters tokenCounters) {
            tokenCounters.clearWins();
        }

        public static /* synthetic */ void access$500(TokenCounters tokenCounters, int i) {
            tokenCounters.setStarts(i);
        }

        public static /* synthetic */ void access$600(TokenCounters tokenCounters) {
            tokenCounters.clearStarts();
        }

        private void clearSeq() {
            this.seq_ = 0;
        }

        private void clearStarts() {
            this.starts_ = 0;
        }

        private void clearWins() {
            this.wins_ = 0;
        }

        public static TokenCounters getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TokenCounters parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TokenCounters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TokenCounters parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TokenCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setSeq(int i) {
            this.seq_ = i;
        }

        private void setStarts(int i) {
            this.starts_ = i;
        }

        private void setWins(int i) {
            this.wins_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new TokenCounters();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"seq_", "wins_", "starts_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (TokenCounters.class) {
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

        public int getSeq() {
            return this.seq_;
        }

        public int getStarts() {
            return this.starts_;
        }

        public int getWins() {
            return this.wins_;
        }

        public static Builder newBuilder(TokenCounters tokenCounters) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tokenCounters);
        }

        public static TokenCounters parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TokenCounters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TokenCounters parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TokenCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TokenCounters parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TokenCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TokenCounters parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TokenCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TokenCounters parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TokenCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TokenCounters parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TokenCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TokenCounters parseFrom(InputStream inputStream) throws IOException {
            return (TokenCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TokenCounters parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TokenCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TokenCounters parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TokenCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TokenCounters parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TokenCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface TokenCountersOrBuilder extends MessageLiteOrBuilder {
        int getSeq();

        int getStarts();

        int getWins();
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

    private HeaderBiddingTokenOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
