package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdPlayerConfigRequestOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AdPlayerConfigRequestKt {
    public static final AdPlayerConfigRequestKt INSTANCE = new AdPlayerConfigRequestKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder) {
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

        public /* synthetic */ Dsl(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) build;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearConfigurationToken() {
            this._builder.clearConfigurationToken();
        }

        public final /* synthetic */ void clearExtras(DslMap dslMap) {
            t.g(dslMap, "<this>");
            this._builder.clearExtras();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final void clearMediationAdUnitId() {
            this._builder.clearMediationAdUnitId();
        }

        public final void clearMediationInfo() {
            this._builder.clearMediationInfo();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearWebviewVersion() {
            this._builder.clearWebviewVersion();
        }

        public final AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            t.f(adFormat, "_builder.getAdFormat()");
            return adFormat;
        }

        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        public final ByteString getConfigurationToken() {
            ByteString configurationToken = this._builder.getConfigurationToken();
            t.f(configurationToken, "_builder.getConfigurationToken()");
            return configurationToken;
        }

        public final /* synthetic */ DslMap getExtrasMap() {
            Map extrasMap = this._builder.getExtrasMap();
            t.f(extrasMap, "_builder.getExtrasMap()");
            return new DslMap(extrasMap);
        }

        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            t.f(impressionOpportunityId, "_builder.getImpressionOpportunityId()");
            return impressionOpportunityId;
        }

        public final String getMediationAdUnitId() {
            String mediationAdUnitId = this._builder.getMediationAdUnitId();
            t.f(mediationAdUnitId, "_builder.getMediationAdUnitId()");
            return mediationAdUnitId;
        }

        public final MediationInfoOuterClass.MediationInfo getMediationInfo() {
            MediationInfoOuterClass.MediationInfo mediationInfo = this._builder.getMediationInfo();
            t.f(mediationInfo, "_builder.getMediationInfo()");
            return mediationInfo;
        }

        public final MediationInfoOuterClass.MediationInfo getMediationInfoOrNull(Dsl dsl) {
            t.g(dsl, "<this>");
            return AdPlayerConfigRequestKtKt.getMediationInfoOrNull(dsl._builder);
        }

        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            t.f(placementId, "_builder.getPlacementId()");
            return placementId;
        }

        public final int getWebviewVersion() {
            return this._builder.getWebviewVersion();
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasMediationAdUnitId() {
            return this._builder.hasMediationAdUnitId();
        }

        public final boolean hasMediationInfo() {
            return this._builder.hasMediationInfo();
        }

        public final boolean hasWebviewVersion() {
            return this._builder.hasWebviewVersion();
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

        public final void setConfigurationToken(ByteString value) {
            t.g(value, "value");
            this._builder.setConfigurationToken(value);
        }

        public final /* synthetic */ void setExtras(DslMap dslMap, String key, String value) {
            t.g(dslMap, "<this>");
            t.g(key, "key");
            t.g(value, "value");
            putExtras(dslMap, key, value);
        }

        public final void setImpressionOpportunityId(ByteString value) {
            t.g(value, "value");
            this._builder.setImpressionOpportunityId(value);
        }

        public final void setMediationAdUnitId(String value) {
            t.g(value, "value");
            this._builder.setMediationAdUnitId(value);
        }

        public final void setMediationInfo(MediationInfoOuterClass.MediationInfo value) {
            t.g(value, "value");
            this._builder.setMediationInfo(value);
        }

        public final void setPlacementId(String value) {
            t.g(value, "value");
            this._builder.setPlacementId(value);
        }

        public final void setWebviewVersion(int i) {
            this._builder.setWebviewVersion(i);
        }

        private Dsl(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private AdPlayerConfigRequestKt() {
    }
}
