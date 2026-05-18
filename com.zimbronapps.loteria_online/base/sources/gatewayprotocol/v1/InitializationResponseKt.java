package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializationResponseKt {
    public static final InitializationResponseKt INSTANCE = new InitializationResponseKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationResponseOuterClass.InitializationResponse.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationResponseOuterClass.InitializationResponse.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public static final class ScarEligibleFormatsProxy extends DslProxy {
            private ScarEligibleFormatsProxy() {
            }
        }

        public static final class ScarPlacementsProxy extends DslProxy {
            private ScarPlacementsProxy() {
            }
        }

        public /* synthetic */ Dsl(InitializationResponseOuterClass.InitializationResponse.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationResponseOuterClass.InitializationResponse _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (InitializationResponseOuterClass.InitializationResponse) build;
        }

        public final /* synthetic */ void addAllScarEligibleFormats(DslList dslList, Iterable values) {
            t.g(dslList, "<this>");
            t.g(values, "values");
            this._builder.addAllScarEligibleFormats(values);
        }

        public final /* synthetic */ void addScarEligibleFormats(DslList dslList, AdFormatOuterClass.AdFormat value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            this._builder.addScarEligibleFormats(value);
        }

        public final void clearCountOfLastShownCampaigns() {
            this._builder.clearCountOfLastShownCampaigns();
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final void clearNativeConfiguration() {
            this._builder.clearNativeConfiguration();
        }

        public final /* synthetic */ void clearScarEligibleFormats(DslList dslList) {
            t.g(dslList, "<this>");
            this._builder.clearScarEligibleFormats();
        }

        public final /* synthetic */ void clearScarPlacements(DslMap dslMap) {
            t.g(dslMap, "<this>");
            this._builder.clearScarPlacements();
        }

        public final void clearTriggerInitializationCompletedRequest() {
            this._builder.clearTriggerInitializationCompletedRequest();
        }

        public final void clearUniversalRequestUrl() {
            this._builder.clearUniversalRequestUrl();
        }

        public final int getCountOfLastShownCampaigns() {
            return this._builder.getCountOfLastShownCampaigns();
        }

        public final ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this._builder.getError();
            t.f(error, "_builder.getError()");
            return error;
        }

        public final ErrorOuterClass.Error getErrorOrNull(Dsl dsl) {
            t.g(dsl, "<this>");
            return InitializationResponseKtKt.getErrorOrNull(dsl._builder);
        }

        public final NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
            NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = this._builder.getNativeConfiguration();
            t.f(nativeConfiguration, "_builder.getNativeConfiguration()");
            return nativeConfiguration;
        }

        public final /* synthetic */ DslList getScarEligibleFormats() {
            List scarEligibleFormatsList = this._builder.getScarEligibleFormatsList();
            t.f(scarEligibleFormatsList, "_builder.getScarEligibleFormatsList()");
            return new DslList(scarEligibleFormatsList);
        }

        public final /* synthetic */ DslMap getScarPlacementsMap() {
            Map scarPlacementsMap = this._builder.getScarPlacementsMap();
            t.f(scarPlacementsMap, "_builder.getScarPlacementsMap()");
            return new DslMap(scarPlacementsMap);
        }

        public final boolean getTriggerInitializationCompletedRequest() {
            return this._builder.getTriggerInitializationCompletedRequest();
        }

        public final String getUniversalRequestUrl() {
            String universalRequestUrl = this._builder.getUniversalRequestUrl();
            t.f(universalRequestUrl, "_builder.getUniversalRequestUrl()");
            return universalRequestUrl;
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final boolean hasNativeConfiguration() {
            return this._builder.hasNativeConfiguration();
        }

        public final boolean hasUniversalRequestUrl() {
            return this._builder.hasUniversalRequestUrl();
        }

        public final /* synthetic */ void plusAssignAllScarEligibleFormats(DslList dslList, Iterable values) {
            t.g(dslList, "<this>");
            t.g(values, "values");
            addAllScarEligibleFormats(dslList, values);
        }

        public final /* synthetic */ void plusAssignScarEligibleFormats(DslList dslList, AdFormatOuterClass.AdFormat value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            addScarEligibleFormats(dslList, value);
        }

        public final /* synthetic */ void putAllScarPlacements(DslMap dslMap, Map map) {
            t.g(dslMap, "<this>");
            t.g(map, "map");
            this._builder.putAllScarPlacements(map);
        }

        public final void putScarPlacements(DslMap dslMap, String key, InitializationResponseOuterClass.Placement value) {
            t.g(dslMap, "<this>");
            t.g(key, "key");
            t.g(value, "value");
            this._builder.putScarPlacements(key, value);
        }

        public final /* synthetic */ void removeScarPlacements(DslMap dslMap, String key) {
            t.g(dslMap, "<this>");
            t.g(key, "key");
            this._builder.removeScarPlacements(key);
        }

        public final void setCountOfLastShownCampaigns(int i) {
            this._builder.setCountOfLastShownCampaigns(i);
        }

        public final void setError(ErrorOuterClass.Error value) {
            t.g(value, "value");
            this._builder.setError(value);
        }

        public final void setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration value) {
            t.g(value, "value");
            this._builder.setNativeConfiguration(value);
        }

        public final /* synthetic */ void setScarEligibleFormats(DslList dslList, int i, AdFormatOuterClass.AdFormat value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            this._builder.setScarEligibleFormats(i, value);
        }

        public final /* synthetic */ void setScarPlacements(DslMap dslMap, String key, InitializationResponseOuterClass.Placement value) {
            t.g(dslMap, "<this>");
            t.g(key, "key");
            t.g(value, "value");
            putScarPlacements(dslMap, key, value);
        }

        public final void setTriggerInitializationCompletedRequest(boolean z) {
            this._builder.setTriggerInitializationCompletedRequest(z);
        }

        public final void setUniversalRequestUrl(String value) {
            t.g(value, "value");
            this._builder.setUniversalRequestUrl(value);
        }

        private Dsl(InitializationResponseOuterClass.InitializationResponse.Builder builder) {
            this._builder = builder;
        }
    }

    private InitializationResponseKt() {
    }
}
