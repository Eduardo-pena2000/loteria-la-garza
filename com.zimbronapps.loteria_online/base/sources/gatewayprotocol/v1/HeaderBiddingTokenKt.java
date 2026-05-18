package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import gatewayprotocol.v1.InitializationDataOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TestDataOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class HeaderBiddingTokenKt {
    public static final HeaderBiddingTokenKt INSTANCE = new HeaderBiddingTokenKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public static final class ExtrasProxy extends DslProxy {
            private ExtrasProxy() {
            }
        }

        public /* synthetic */ Dsl(HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ HeaderBiddingTokenOuterClass.HeaderBiddingToken _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (HeaderBiddingTokenOuterClass.HeaderBiddingToken) build;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearCampaignState() {
            this._builder.clearCampaignState();
        }

        public final void clearClientInfo() {
            this._builder.clearClientInfo();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final /* synthetic */ void clearExtras(DslMap dslMap) {
            t.g(dslMap, "<this>");
            this._builder.clearExtras();
        }

        public final void clearInitializationData() {
            this._builder.clearInitializationData();
        }

        public final void clearLimitedSessionToken() {
            this._builder.clearLimitedSessionToken();
        }

        public final void clearMediationInfo() {
            this._builder.clearMediationInfo();
        }

        public final void clearOfferwallEnabled() {
            this._builder.clearOfferwallEnabled();
        }

        public final void clearPii() {
            this._builder.clearPii();
        }

        public final void clearScarSignalsCollected() {
            this._builder.clearScarSignalsCollected();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearSessionToken() {
            this._builder.clearSessionToken();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final void clearTcf() {
            this._builder.clearTcf();
        }

        public final void clearTestData() {
            this._builder.clearTestData();
        }

        public final void clearTimestamps() {
            this._builder.clearTimestamps();
        }

        public final void clearTokenCounters() {
            this._builder.clearTokenCounters();
        }

        public final void clearTokenId() {
            this._builder.clearTokenId();
        }

        public final void clearTokenNumber() {
            this._builder.clearTokenNumber();
        }

        public final AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            t.f(adFormat, "_builder.getAdFormat()");
            return adFormat;
        }

        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        public final CampaignStateOuterClass.CampaignState getCampaignState() {
            CampaignStateOuterClass.CampaignState campaignState = this._builder.getCampaignState();
            t.f(campaignState, "_builder.getCampaignState()");
            return campaignState;
        }

        public final ClientInfoOuterClass.ClientInfo getClientInfo() {
            ClientInfoOuterClass.ClientInfo clientInfo = this._builder.getClientInfo();
            t.f(clientInfo, "_builder.getClientInfo()");
            return clientInfo;
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            t.f(dynamicDeviceInfo, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfo;
        }

        public final /* synthetic */ DslMap getExtrasMap() {
            Map extrasMap = this._builder.getExtrasMap();
            t.f(extrasMap, "_builder.getExtrasMap()");
            return new DslMap(extrasMap);
        }

        public final InitializationDataOuterClass.InitializationData getInitializationData() {
            InitializationDataOuterClass.InitializationData initializationData = this._builder.getInitializationData();
            t.f(initializationData, "_builder.getInitializationData()");
            return initializationData;
        }

        public final InitializationDataOuterClass.InitializationData getInitializationDataOrNull(Dsl dsl) {
            t.g(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getInitializationDataOrNull(dsl._builder);
        }

        public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken() {
            UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken = this._builder.getLimitedSessionToken();
            t.f(limitedSessionToken, "_builder.getLimitedSessionToken()");
            return limitedSessionToken;
        }

        public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(Dsl dsl) {
            t.g(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getLimitedSessionTokenOrNull(dsl._builder);
        }

        public final MediationInfoOuterClass.MediationInfo getMediationInfo() {
            MediationInfoOuterClass.MediationInfo mediationInfo = this._builder.getMediationInfo();
            t.f(mediationInfo, "_builder.getMediationInfo()");
            return mediationInfo;
        }

        public final MediationInfoOuterClass.MediationInfo getMediationInfoOrNull(Dsl dsl) {
            t.g(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getMediationInfoOrNull(dsl._builder);
        }

        public final boolean getOfferwallEnabled() {
            return this._builder.getOfferwallEnabled();
        }

        public final PiiOuterClass.Pii getPii() {
            PiiOuterClass.Pii pii = this._builder.getPii();
            t.f(pii, "_builder.getPii()");
            return pii;
        }

        public final PiiOuterClass.Pii getPiiOrNull(Dsl dsl) {
            t.g(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getPiiOrNull(dsl._builder);
        }

        public final boolean getScarSignalsCollected() {
            return this._builder.getScarSignalsCollected();
        }

        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this._builder.getSessionCounters();
            t.f(sessionCounters, "_builder.getSessionCounters()");
            return sessionCounters;
        }

        public final ByteString getSessionToken() {
            ByteString sessionToken = this._builder.getSessionToken();
            t.f(sessionToken, "_builder.getSessionToken()");
            return sessionToken;
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            t.f(staticDeviceInfo, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfo;
        }

        public final ByteString getTcf() {
            ByteString tcf = this._builder.getTcf();
            t.f(tcf, "_builder.getTcf()");
            return tcf;
        }

        public final TestDataOuterClass.TestData getTestData() {
            TestDataOuterClass.TestData testData = this._builder.getTestData();
            t.f(testData, "_builder.getTestData()");
            return testData;
        }

        public final TestDataOuterClass.TestData getTestDataOrNull(Dsl dsl) {
            t.g(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getTestDataOrNull(dsl._builder);
        }

        public final TimestampsOuterClass.Timestamps getTimestamps() {
            TimestampsOuterClass.Timestamps timestamps = this._builder.getTimestamps();
            t.f(timestamps, "_builder.getTimestamps()");
            return timestamps;
        }

        public final HeaderBiddingTokenOuterClass.TokenCounters getTokenCounters() {
            HeaderBiddingTokenOuterClass.TokenCounters tokenCounters = this._builder.getTokenCounters();
            t.f(tokenCounters, "_builder.getTokenCounters()");
            return tokenCounters;
        }

        public final HeaderBiddingTokenOuterClass.TokenCounters getTokenCountersOrNull(Dsl dsl) {
            t.g(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getTokenCountersOrNull(dsl._builder);
        }

        public final ByteString getTokenId() {
            ByteString tokenId = this._builder.getTokenId();
            t.f(tokenId, "_builder.getTokenId()");
            return tokenId;
        }

        public final int getTokenNumber() {
            return this._builder.getTokenNumber();
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasCampaignState() {
            return this._builder.hasCampaignState();
        }

        public final boolean hasClientInfo() {
            return this._builder.hasClientInfo();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasInitializationData() {
            return this._builder.hasInitializationData();
        }

        public final boolean hasLimitedSessionToken() {
            return this._builder.hasLimitedSessionToken();
        }

        public final boolean hasMediationInfo() {
            return this._builder.hasMediationInfo();
        }

        public final boolean hasOfferwallEnabled() {
            return this._builder.hasOfferwallEnabled();
        }

        public final boolean hasPii() {
            return this._builder.hasPii();
        }

        public final boolean hasScarSignalsCollected() {
            return this._builder.hasScarSignalsCollected();
        }

        public final boolean hasSessionCounters() {
            return this._builder.hasSessionCounters();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final boolean hasTcf() {
            return this._builder.hasTcf();
        }

        public final boolean hasTestData() {
            return this._builder.hasTestData();
        }

        public final boolean hasTimestamps() {
            return this._builder.hasTimestamps();
        }

        public final boolean hasTokenCounters() {
            return this._builder.hasTokenCounters();
        }

        public final /* synthetic */ void putAllExtras(DslMap dslMap, Map map) {
            t.g(dslMap, "<this>");
            t.g(map, "map");
            this._builder.putAllExtras(map);
        }

        public final void putExtras(DslMap dslMap, String key, String value) {
            t.g(dslMap, "<this>");
            t.g(key, "key");
            t.g(value, "value");
            this._builder.putExtras(key, value);
        }

        public final /* synthetic */ void removeExtras(DslMap dslMap, String key) {
            t.g(dslMap, "<this>");
            t.g(key, "key");
            this._builder.removeExtras(key);
        }

        public final void setAdFormat(AdFormatOuterClass.AdFormat value) {
            t.g(value, "value");
            this._builder.setAdFormat(value);
        }

        public final void setAdFormatValue(int i) {
            this._builder.setAdFormatValue(i);
        }

        public final void setCampaignState(CampaignStateOuterClass.CampaignState value) {
            t.g(value, "value");
            this._builder.setCampaignState(value);
        }

        public final void setClientInfo(ClientInfoOuterClass.ClientInfo value) {
            t.g(value, "value");
            this._builder.setClientInfo(value);
        }

        public final void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo value) {
            t.g(value, "value");
            this._builder.setDynamicDeviceInfo(value);
        }

        public final /* synthetic */ void setExtras(DslMap dslMap, String key, String value) {
            t.g(dslMap, "<this>");
            t.g(key, "key");
            t.g(value, "value");
            putExtras(dslMap, key, value);
        }

        public final void setInitializationData(InitializationDataOuterClass.InitializationData value) {
            t.g(value, "value");
            this._builder.setInitializationData(value);
        }

        public final void setLimitedSessionToken(UniversalRequestOuterClass.LimitedSessionToken value) {
            t.g(value, "value");
            this._builder.setLimitedSessionToken(value);
        }

        public final void setMediationInfo(MediationInfoOuterClass.MediationInfo value) {
            t.g(value, "value");
            this._builder.setMediationInfo(value);
        }

        public final void setOfferwallEnabled(boolean z) {
            this._builder.setOfferwallEnabled(z);
        }

        public final void setPii(PiiOuterClass.Pii value) {
            t.g(value, "value");
            this._builder.setPii(value);
        }

        public final void setScarSignalsCollected(boolean z) {
            this._builder.setScarSignalsCollected(z);
        }

        public final void setSessionCounters(SessionCountersOuterClass.SessionCounters value) {
            t.g(value, "value");
            this._builder.setSessionCounters(value);
        }

        public final void setSessionToken(ByteString value) {
            t.g(value, "value");
            this._builder.setSessionToken(value);
        }

        public final void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo value) {
            t.g(value, "value");
            this._builder.setStaticDeviceInfo(value);
        }

        public final void setTcf(ByteString value) {
            t.g(value, "value");
            this._builder.setTcf(value);
        }

        public final void setTestData(TestDataOuterClass.TestData value) {
            t.g(value, "value");
            this._builder.setTestData(value);
        }

        public final void setTimestamps(TimestampsOuterClass.Timestamps value) {
            t.g(value, "value");
            this._builder.setTimestamps(value);
        }

        public final void setTokenCounters(HeaderBiddingTokenOuterClass.TokenCounters value) {
            t.g(value, "value");
            this._builder.setTokenCounters(value);
        }

        public final void setTokenId(ByteString value) {
            t.g(value, "value");
            this._builder.setTokenId(value);
        }

        public final void setTokenNumber(int i) {
            this._builder.setTokenNumber(i);
        }

        private Dsl(HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder) {
            this._builder = builder;
        }
    }

    private HeaderBiddingTokenKt() {
    }
}
