package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class LimitedSessionTokenKt {
    public static final LimitedSessionTokenKt INSTANCE = new LimitedSessionTokenKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final UniversalRequestOuterClass.LimitedSessionToken.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.LimitedSessionToken.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(UniversalRequestOuterClass.LimitedSessionToken.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ UniversalRequestOuterClass.LimitedSessionToken _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (UniversalRequestOuterClass.LimitedSessionToken) build;
        }

        public final void clearCustomMediationName() {
            this._builder.clearCustomMediationName();
        }

        public final void clearDeviceMake() {
            this._builder.clearDeviceMake();
        }

        public final void clearDeviceModel() {
            this._builder.clearDeviceModel();
        }

        public final void clearGameId() {
            this._builder.clearGameId();
        }

        public final void clearIdfi() {
            this._builder.clearIdfi();
        }

        public final void clearMediationProvider() {
            this._builder.clearMediationProvider();
        }

        public final void clearMediationVersion() {
            this._builder.clearMediationVersion();
        }

        public final void clearOsVersion() {
            this._builder.clearOsVersion();
        }

        public final void clearPlatform() {
            this._builder.clearPlatform();
        }

        public final void clearSdkVersion() {
            this._builder.clearSdkVersion();
        }

        public final void clearSdkVersionName() {
            this._builder.clearSdkVersionName();
        }

        public final void clearSessionId() {
            this._builder.clearSessionId();
        }

        public final String getCustomMediationName() {
            String customMediationName = this._builder.getCustomMediationName();
            t.f(customMediationName, "_builder.getCustomMediationName()");
            return customMediationName;
        }

        public final String getDeviceMake() {
            String deviceMake = this._builder.getDeviceMake();
            t.f(deviceMake, "_builder.getDeviceMake()");
            return deviceMake;
        }

        public final String getDeviceModel() {
            String deviceModel = this._builder.getDeviceModel();
            t.f(deviceModel, "_builder.getDeviceModel()");
            return deviceModel;
        }

        public final String getGameId() {
            String gameId = this._builder.getGameId();
            t.f(gameId, "_builder.getGameId()");
            return gameId;
        }

        public final String getIdfi() {
            String idfi = this._builder.getIdfi();
            t.f(idfi, "_builder.getIdfi()");
            return idfi;
        }

        public final ClientInfoOuterClass.MediationProvider getMediationProvider() {
            ClientInfoOuterClass.MediationProvider mediationProvider = this._builder.getMediationProvider();
            t.f(mediationProvider, "_builder.getMediationProvider()");
            return mediationProvider;
        }

        public final int getMediationProviderValue() {
            return this._builder.getMediationProviderValue();
        }

        public final String getMediationVersion() {
            String mediationVersion = this._builder.getMediationVersion();
            t.f(mediationVersion, "_builder.getMediationVersion()");
            return mediationVersion;
        }

        public final String getOsVersion() {
            String osVersion = this._builder.getOsVersion();
            t.f(osVersion, "_builder.getOsVersion()");
            return osVersion;
        }

        public final ClientInfoOuterClass.Platform getPlatform() {
            ClientInfoOuterClass.Platform platform = this._builder.getPlatform();
            t.f(platform, "_builder.getPlatform()");
            return platform;
        }

        public final int getPlatformValue() {
            return this._builder.getPlatformValue();
        }

        public final int getSdkVersion() {
            return this._builder.getSdkVersion();
        }

        public final String getSdkVersionName() {
            String sdkVersionName = this._builder.getSdkVersionName();
            t.f(sdkVersionName, "_builder.getSdkVersionName()");
            return sdkVersionName;
        }

        public final ByteString getSessionId() {
            ByteString sessionId = this._builder.getSessionId();
            t.f(sessionId, "_builder.getSessionId()");
            return sessionId;
        }

        public final boolean hasCustomMediationName() {
            return this._builder.hasCustomMediationName();
        }

        public final boolean hasMediationVersion() {
            return this._builder.hasMediationVersion();
        }

        public final boolean hasSessionId() {
            return this._builder.hasSessionId();
        }

        public final void setCustomMediationName(String value) {
            t.g(value, "value");
            this._builder.setCustomMediationName(value);
        }

        public final void setDeviceMake(String value) {
            t.g(value, "value");
            this._builder.setDeviceMake(value);
        }

        public final void setDeviceModel(String value) {
            t.g(value, "value");
            this._builder.setDeviceModel(value);
        }

        public final void setGameId(String value) {
            t.g(value, "value");
            this._builder.setGameId(value);
        }

        public final void setIdfi(String value) {
            t.g(value, "value");
            this._builder.setIdfi(value);
        }

        public final void setMediationProvider(ClientInfoOuterClass.MediationProvider value) {
            t.g(value, "value");
            this._builder.setMediationProvider(value);
        }

        public final void setMediationProviderValue(int i) {
            this._builder.setMediationProviderValue(i);
        }

        public final void setMediationVersion(String value) {
            t.g(value, "value");
            this._builder.setMediationVersion(value);
        }

        public final void setOsVersion(String value) {
            t.g(value, "value");
            this._builder.setOsVersion(value);
        }

        public final void setPlatform(ClientInfoOuterClass.Platform value) {
            t.g(value, "value");
            this._builder.setPlatform(value);
        }

        public final void setPlatformValue(int i) {
            this._builder.setPlatformValue(i);
        }

        public final void setSdkVersion(int i) {
            this._builder.setSdkVersion(i);
        }

        public final void setSdkVersionName(String value) {
            t.g(value, "value");
            this._builder.setSdkVersionName(value);
        }

        public final void setSessionId(ByteString value) {
            t.g(value, "value");
            this._builder.setSessionId(value);
        }

        private Dsl(UniversalRequestOuterClass.LimitedSessionToken.Builder builder) {
            this._builder = builder;
        }
    }

    private LimitedSessionTokenKt() {
    }
}
