package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializationDeviceInfoKt {
    public static final InitializationDeviceInfoKt INSTANCE = new InitializationDeviceInfoKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationRequestOuterClass.InitializationDeviceInfo.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationRequestOuterClass.InitializationDeviceInfo.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(InitializationRequestOuterClass.InitializationDeviceInfo.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationRequestOuterClass.InitializationDeviceInfo _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (InitializationRequestOuterClass.InitializationDeviceInfo) build;
        }

        public final void clearBatteryLevel() {
            this._builder.clearBatteryLevel();
        }

        public final void clearBatteryStatus() {
            this._builder.clearBatteryStatus();
        }

        public final void clearBundleId() {
            this._builder.clearBundleId();
        }

        public final void clearConnectionType() {
            this._builder.clearConnectionType();
        }

        public final void clearCurrentUiTheme() {
            this._builder.clearCurrentUiTheme();
        }

        public final void clearDeviceMake() {
            this._builder.clearDeviceMake();
        }

        public final void clearDeviceModel() {
            this._builder.clearDeviceModel();
        }

        public final void clearHashedDeviceName() {
            this._builder.clearHashedDeviceName();
        }

        public final void clearLanguage() {
            this._builder.clearLanguage();
        }

        public final void clearLocalList() {
            this._builder.clearLocalList();
        }

        public final void clearNetworkOperator() {
            this._builder.clearNetworkOperator();
        }

        public final void clearOsVersion() {
            this._builder.clearOsVersion();
        }

        public final void clearSystemBootTime() {
            this._builder.clearSystemBootTime();
        }

        public final void clearTotalDiskSpace() {
            this._builder.clearTotalDiskSpace();
        }

        public final void clearTotalRamMemory() {
            this._builder.clearTotalRamMemory();
        }

        public final void clearTrackingAuthStatus() {
            this._builder.clearTrackingAuthStatus();
        }

        public final double getBatteryLevel() {
            return this._builder.getBatteryLevel();
        }

        public final int getBatteryStatus() {
            return this._builder.getBatteryStatus();
        }

        public final String getBundleId() {
            String bundleId = this._builder.getBundleId();
            t.f(bundleId, "_builder.getBundleId()");
            return bundleId;
        }

        public final String getConnectionType() {
            String connectionType = this._builder.getConnectionType();
            t.f(connectionType, "_builder.getConnectionType()");
            return connectionType;
        }

        public final long getCurrentUiTheme() {
            return this._builder.getCurrentUiTheme();
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

        public final String getHashedDeviceName() {
            String hashedDeviceName = this._builder.getHashedDeviceName();
            t.f(hashedDeviceName, "_builder.getHashedDeviceName()");
            return hashedDeviceName;
        }

        public final String getLanguage() {
            String language = this._builder.getLanguage();
            t.f(language, "_builder.getLanguage()");
            return language;
        }

        public final String getLocalList() {
            String localList = this._builder.getLocalList();
            t.f(localList, "_builder.getLocalList()");
            return localList;
        }

        public final String getNetworkOperator() {
            String networkOperator = this._builder.getNetworkOperator();
            t.f(networkOperator, "_builder.getNetworkOperator()");
            return networkOperator;
        }

        public final String getOsVersion() {
            String osVersion = this._builder.getOsVersion();
            t.f(osVersion, "_builder.getOsVersion()");
            return osVersion;
        }

        public final long getSystemBootTime() {
            return this._builder.getSystemBootTime();
        }

        public final long getTotalDiskSpace() {
            return this._builder.getTotalDiskSpace();
        }

        public final long getTotalRamMemory() {
            return this._builder.getTotalRamMemory();
        }

        public final int getTrackingAuthStatus() {
            return this._builder.getTrackingAuthStatus();
        }

        public final boolean hasTrackingAuthStatus() {
            return this._builder.hasTrackingAuthStatus();
        }

        public final void setBatteryLevel(double d) {
            this._builder.setBatteryLevel(d);
        }

        public final void setBatteryStatus(int i) {
            this._builder.setBatteryStatus(i);
        }

        public final void setBundleId(String value) {
            t.g(value, "value");
            this._builder.setBundleId(value);
        }

        public final void setConnectionType(String value) {
            t.g(value, "value");
            this._builder.setConnectionType(value);
        }

        public final void setCurrentUiTheme(long j) {
            this._builder.setCurrentUiTheme(j);
        }

        public final void setDeviceMake(String value) {
            t.g(value, "value");
            this._builder.setDeviceMake(value);
        }

        public final void setDeviceModel(String value) {
            t.g(value, "value");
            this._builder.setDeviceModel(value);
        }

        public final void setHashedDeviceName(String value) {
            t.g(value, "value");
            this._builder.setHashedDeviceName(value);
        }

        public final void setLanguage(String value) {
            t.g(value, "value");
            this._builder.setLanguage(value);
        }

        public final void setLocalList(String value) {
            t.g(value, "value");
            this._builder.setLocalList(value);
        }

        public final void setNetworkOperator(String value) {
            t.g(value, "value");
            this._builder.setNetworkOperator(value);
        }

        public final void setOsVersion(String value) {
            t.g(value, "value");
            this._builder.setOsVersion(value);
        }

        public final void setSystemBootTime(long j) {
            this._builder.setSystemBootTime(j);
        }

        public final void setTotalDiskSpace(long j) {
            this._builder.setTotalDiskSpace(j);
        }

        public final void setTotalRamMemory(long j) {
            this._builder.setTotalRamMemory(j);
        }

        public final void setTrackingAuthStatus(int i) {
            this._builder.setTrackingAuthStatus(i);
        }

        private Dsl(InitializationRequestOuterClass.InitializationDeviceInfo.Builder builder) {
            this._builder = builder;
        }
    }

    private InitializationDeviceInfoKt() {
    }
}
