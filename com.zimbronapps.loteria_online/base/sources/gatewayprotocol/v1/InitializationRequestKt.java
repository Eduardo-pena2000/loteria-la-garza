package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializationRequestKt {
    public static final InitializationRequestKt INSTANCE = new InitializationRequestKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationRequestOuterClass.InitializationRequest.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
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

        public /* synthetic */ Dsl(InitializationRequestOuterClass.InitializationRequest.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationRequestOuterClass.InitializationRequest _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (InitializationRequestOuterClass.InitializationRequest) build;
        }

        public final void clearAnalyticsUserId() {
            this._builder.clearAnalyticsUserId();
        }

        public final void clearAuid() {
            this._builder.clearAuid();
        }

        public final void clearAuidString() {
            this._builder.clearAuidString();
        }

        public final void clearCache() {
            this._builder.clearCache();
        }

        public final void clearClientInfo() {
            this._builder.clearClientInfo();
        }

        public final void clearDeviceInfo() {
            this._builder.clearDeviceInfo();
        }

        public final void clearExternalUserIdentifier() {
            this._builder.clearExternalUserIdentifier();
        }

        public final /* synthetic */ void clearExtras(DslMap dslMap) {
            t.g(dslMap, "<this>");
            this._builder.clearExtras();
        }

        public final void clearIdfi() {
            this._builder.clearIdfi();
        }

        public final void clearIsFirstInit() {
            this._builder.clearIsFirstInit();
        }

        public final void clearLegacyFlowUserConsent() {
            this._builder.clearLegacyFlowUserConsent();
        }

        public final void clearPrivacy() {
            this._builder.clearPrivacy();
        }

        public final void clearSessionId() {
            this._builder.clearSessionId();
        }

        public final void clearUadsInitBlob() {
            this._builder.clearUadsInitBlob();
        }

        public final void clearUnityBuildGuid() {
            this._builder.clearUnityBuildGuid();
        }

        public final void clearUnityInstallationId() {
            this._builder.clearUnityInstallationId();
        }

        public final void clearUnityMegaSessionId() {
            this._builder.clearUnityMegaSessionId();
        }

        public final String getAnalyticsUserId() {
            String analyticsUserId = this._builder.getAnalyticsUserId();
            t.f(analyticsUserId, "_builder.getAnalyticsUserId()");
            return analyticsUserId;
        }

        public final ByteString getAuid() {
            ByteString auid = this._builder.getAuid();
            t.f(auid, "_builder.getAuid()");
            return auid;
        }

        public final String getAuidString() {
            String auidString = this._builder.getAuidString();
            t.f(auidString, "_builder.getAuidString()");
            return auidString;
        }

        public final ByteString getCache() {
            ByteString cache = this._builder.getCache();
            t.f(cache, "_builder.getCache()");
            return cache;
        }

        public final ClientInfoOuterClass.ClientInfo getClientInfo() {
            ClientInfoOuterClass.ClientInfo clientInfo = this._builder.getClientInfo();
            t.f(clientInfo, "_builder.getClientInfo()");
            return clientInfo;
        }

        public final InitializationRequestOuterClass.InitializationDeviceInfo getDeviceInfo() {
            InitializationRequestOuterClass.InitializationDeviceInfo deviceInfo = this._builder.getDeviceInfo();
            t.f(deviceInfo, "_builder.getDeviceInfo()");
            return deviceInfo;
        }

        public final String getExternalUserIdentifier() {
            String externalUserIdentifier = this._builder.getExternalUserIdentifier();
            t.f(externalUserIdentifier, "_builder.getExternalUserIdentifier()");
            return externalUserIdentifier;
        }

        public final /* synthetic */ DslMap getExtrasMap() {
            Map extrasMap = this._builder.getExtrasMap();
            t.f(extrasMap, "_builder.getExtrasMap()");
            return new DslMap(extrasMap);
        }

        public final String getIdfi() {
            String idfi = this._builder.getIdfi();
            t.f(idfi, "_builder.getIdfi()");
            return idfi;
        }

        public final boolean getIsFirstInit() {
            return this._builder.getIsFirstInit();
        }

        public final String getLegacyFlowUserConsent() {
            String legacyFlowUserConsent = this._builder.getLegacyFlowUserConsent();
            t.f(legacyFlowUserConsent, "_builder.getLegacyFlowUserConsent()");
            return legacyFlowUserConsent;
        }

        public final ByteString getPrivacy() {
            ByteString privacy = this._builder.getPrivacy();
            t.f(privacy, "_builder.getPrivacy()");
            return privacy;
        }

        public final ByteString getSessionId() {
            ByteString sessionId = this._builder.getSessionId();
            t.f(sessionId, "_builder.getSessionId()");
            return sessionId;
        }

        public final ByteString getUadsInitBlob() {
            ByteString uadsInitBlob = this._builder.getUadsInitBlob();
            t.f(uadsInitBlob, "_builder.getUadsInitBlob()");
            return uadsInitBlob;
        }

        public final String getUnityBuildGuid() {
            String unityBuildGuid = this._builder.getUnityBuildGuid();
            t.f(unityBuildGuid, "_builder.getUnityBuildGuid()");
            return unityBuildGuid;
        }

        public final ByteString getUnityInstallationId() {
            ByteString unityInstallationId = this._builder.getUnityInstallationId();
            t.f(unityInstallationId, "_builder.getUnityInstallationId()");
            return unityInstallationId;
        }

        public final ByteString getUnityMegaSessionId() {
            ByteString unityMegaSessionId = this._builder.getUnityMegaSessionId();
            t.f(unityMegaSessionId, "_builder.getUnityMegaSessionId()");
            return unityMegaSessionId;
        }

        public final boolean hasAnalyticsUserId() {
            return this._builder.hasAnalyticsUserId();
        }

        public final boolean hasAuid() {
            return this._builder.hasAuid();
        }

        public final boolean hasAuidString() {
            return this._builder.hasAuidString();
        }

        public final boolean hasCache() {
            return this._builder.hasCache();
        }

        public final boolean hasClientInfo() {
            return this._builder.hasClientInfo();
        }

        public final boolean hasDeviceInfo() {
            return this._builder.hasDeviceInfo();
        }

        public final boolean hasExternalUserIdentifier() {
            return this._builder.hasExternalUserIdentifier();
        }

        public final boolean hasLegacyFlowUserConsent() {
            return this._builder.hasLegacyFlowUserConsent();
        }

        public final boolean hasPrivacy() {
            return this._builder.hasPrivacy();
        }

        public final boolean hasUadsInitBlob() {
            return this._builder.hasUadsInitBlob();
        }

        public final boolean hasUnityBuildGuid() {
            return this._builder.hasUnityBuildGuid();
        }

        public final boolean hasUnityInstallationId() {
            return this._builder.hasUnityInstallationId();
        }

        public final boolean hasUnityMegaSessionId() {
            return this._builder.hasUnityMegaSessionId();
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

        public final void setAnalyticsUserId(String value) {
            t.g(value, "value");
            this._builder.setAnalyticsUserId(value);
        }

        public final void setAuid(ByteString value) {
            t.g(value, "value");
            this._builder.setAuid(value);
        }

        public final void setAuidString(String value) {
            t.g(value, "value");
            this._builder.setAuidString(value);
        }

        public final void setCache(ByteString value) {
            t.g(value, "value");
            this._builder.setCache(value);
        }

        public final void setClientInfo(ClientInfoOuterClass.ClientInfo value) {
            t.g(value, "value");
            this._builder.setClientInfo(value);
        }

        public final void setDeviceInfo(InitializationRequestOuterClass.InitializationDeviceInfo value) {
            t.g(value, "value");
            this._builder.setDeviceInfo(value);
        }

        public final void setExternalUserIdentifier(String value) {
            t.g(value, "value");
            this._builder.setExternalUserIdentifier(value);
        }

        public final /* synthetic */ void setExtras(DslMap dslMap, String key, String value) {
            t.g(dslMap, "<this>");
            t.g(key, "key");
            t.g(value, "value");
            putExtras(dslMap, key, value);
        }

        public final void setIdfi(String value) {
            t.g(value, "value");
            this._builder.setIdfi(value);
        }

        public final void setIsFirstInit(boolean z) {
            this._builder.setIsFirstInit(z);
        }

        public final void setLegacyFlowUserConsent(String value) {
            t.g(value, "value");
            this._builder.setLegacyFlowUserConsent(value);
        }

        public final void setPrivacy(ByteString value) {
            t.g(value, "value");
            this._builder.setPrivacy(value);
        }

        public final void setSessionId(ByteString value) {
            t.g(value, "value");
            this._builder.setSessionId(value);
        }

        public final void setUadsInitBlob(ByteString value) {
            t.g(value, "value");
            this._builder.setUadsInitBlob(value);
        }

        public final void setUnityBuildGuid(String value) {
            t.g(value, "value");
            this._builder.setUnityBuildGuid(value);
        }

        public final void setUnityInstallationId(ByteString value) {
            t.g(value, "value");
            this._builder.setUnityInstallationId(value);
        }

        public final void setUnityMegaSessionId(ByteString value) {
            t.g(value, "value");
            this._builder.setUnityMegaSessionId(value);
        }

        private Dsl(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private InitializationRequestKt() {
    }
}
