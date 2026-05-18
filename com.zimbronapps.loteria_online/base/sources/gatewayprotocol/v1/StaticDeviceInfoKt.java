package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StaticDeviceInfoKt {
    public static final StaticDeviceInfoKt INSTANCE = new StaticDeviceInfoKt();

    public static final class AndroidKt {
        public static final AndroidKt INSTANCE = new AndroidKt();

        @ProtoDslMarker
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder _builder;

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder) {
                    t.g(builder, "builder");
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder, k kVar) {
                this(builder);
            }

            public final /* synthetic */ StaticDeviceInfoOuterClass.StaticDeviceInfo.Android _build() {
                GeneratedMessageLite build = this._builder.build();
                t.f(build, "_builder.build()");
                return (StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) build;
            }

            public final void clearAndroidFingerprint() {
                this._builder.clearAndroidFingerprint();
            }

            public final void clearApiLevel() {
                this._builder.clearApiLevel();
            }

            public final void clearApkDeveloperSigningCertificateHash() {
                this._builder.clearApkDeveloperSigningCertificateHash();
            }

            public final void clearAppInstaller() {
                this._builder.clearAppInstaller();
            }

            public final void clearBuildBoard() {
                this._builder.clearBuildBoard();
            }

            public final void clearBuildBootloader() {
                this._builder.clearBuildBootloader();
            }

            public final void clearBuildBrand() {
                this._builder.clearBuildBrand();
            }

            public final void clearBuildDevice() {
                this._builder.clearBuildDevice();
            }

            public final void clearBuildDisplay() {
                this._builder.clearBuildDisplay();
            }

            public final void clearBuildFingerprint() {
                this._builder.clearBuildFingerprint();
            }

            public final void clearBuildHardware() {
                this._builder.clearBuildHardware();
            }

            public final void clearBuildHost() {
                this._builder.clearBuildHost();
            }

            public final void clearBuildId() {
                this._builder.clearBuildId();
            }

            public final void clearBuildProduct() {
                this._builder.clearBuildProduct();
            }

            public final void clearDisplayScreenDensity() {
                this._builder.clearDisplayScreenDensity();
            }

            public final void clearExtensionVersion() {
                this._builder.clearExtensionVersion();
            }

            public final void clearPhoneType() {
                this._builder.clearPhoneType();
            }

            public final void clearSimOperator() {
                this._builder.clearSimOperator();
            }

            public final void clearTotalDiskSpaceInternal() {
                this._builder.clearTotalDiskSpaceInternal();
            }

            public final void clearVersionCode() {
                this._builder.clearVersionCode();
            }

            public final String getAndroidFingerprint() {
                String androidFingerprint = this._builder.getAndroidFingerprint();
                t.f(androidFingerprint, "_builder.getAndroidFingerprint()");
                return androidFingerprint;
            }

            public final int getApiLevel() {
                return this._builder.getApiLevel();
            }

            public final String getApkDeveloperSigningCertificateHash() {
                String apkDeveloperSigningCertificateHash = this._builder.getApkDeveloperSigningCertificateHash();
                t.f(apkDeveloperSigningCertificateHash, "_builder.getApkDeveloperSigningCertificateHash()");
                return apkDeveloperSigningCertificateHash;
            }

            public final String getAppInstaller() {
                String appInstaller = this._builder.getAppInstaller();
                t.f(appInstaller, "_builder.getAppInstaller()");
                return appInstaller;
            }

            public final String getBuildBoard() {
                String buildBoard = this._builder.getBuildBoard();
                t.f(buildBoard, "_builder.getBuildBoard()");
                return buildBoard;
            }

            public final String getBuildBootloader() {
                String buildBootloader = this._builder.getBuildBootloader();
                t.f(buildBootloader, "_builder.getBuildBootloader()");
                return buildBootloader;
            }

            public final String getBuildBrand() {
                String buildBrand = this._builder.getBuildBrand();
                t.f(buildBrand, "_builder.getBuildBrand()");
                return buildBrand;
            }

            public final String getBuildDevice() {
                String buildDevice = this._builder.getBuildDevice();
                t.f(buildDevice, "_builder.getBuildDevice()");
                return buildDevice;
            }

            public final String getBuildDisplay() {
                String buildDisplay = this._builder.getBuildDisplay();
                t.f(buildDisplay, "_builder.getBuildDisplay()");
                return buildDisplay;
            }

            public final String getBuildFingerprint() {
                String buildFingerprint = this._builder.getBuildFingerprint();
                t.f(buildFingerprint, "_builder.getBuildFingerprint()");
                return buildFingerprint;
            }

            public final String getBuildHardware() {
                String buildHardware = this._builder.getBuildHardware();
                t.f(buildHardware, "_builder.getBuildHardware()");
                return buildHardware;
            }

            public final String getBuildHost() {
                String buildHost = this._builder.getBuildHost();
                t.f(buildHost, "_builder.getBuildHost()");
                return buildHost;
            }

            public final String getBuildId() {
                String buildId = this._builder.getBuildId();
                t.f(buildId, "_builder.getBuildId()");
                return buildId;
            }

            public final String getBuildProduct() {
                String buildProduct = this._builder.getBuildProduct();
                t.f(buildProduct, "_builder.getBuildProduct()");
                return buildProduct;
            }

            public final int getDisplayScreenDensity() {
                return this._builder.getDisplayScreenDensity();
            }

            public final int getExtensionVersion() {
                return this._builder.getExtensionVersion();
            }

            public final int getPhoneType() {
                return this._builder.getPhoneType();
            }

            public final String getSimOperator() {
                String simOperator = this._builder.getSimOperator();
                t.f(simOperator, "_builder.getSimOperator()");
                return simOperator;
            }

            public final long getTotalDiskSpaceInternal() {
                return this._builder.getTotalDiskSpaceInternal();
            }

            public final int getVersionCode() {
                return this._builder.getVersionCode();
            }

            public final boolean hasAndroidFingerprint() {
                return this._builder.hasAndroidFingerprint();
            }

            public final boolean hasApiLevel() {
                return this._builder.hasApiLevel();
            }

            public final boolean hasApkDeveloperSigningCertificateHash() {
                return this._builder.hasApkDeveloperSigningCertificateHash();
            }

            public final boolean hasAppInstaller() {
                return this._builder.hasAppInstaller();
            }

            public final boolean hasBuildBoard() {
                return this._builder.hasBuildBoard();
            }

            public final boolean hasBuildBootloader() {
                return this._builder.hasBuildBootloader();
            }

            public final boolean hasBuildBrand() {
                return this._builder.hasBuildBrand();
            }

            public final boolean hasBuildDevice() {
                return this._builder.hasBuildDevice();
            }

            public final boolean hasBuildDisplay() {
                return this._builder.hasBuildDisplay();
            }

            public final boolean hasBuildFingerprint() {
                return this._builder.hasBuildFingerprint();
            }

            public final boolean hasBuildHardware() {
                return this._builder.hasBuildHardware();
            }

            public final boolean hasBuildHost() {
                return this._builder.hasBuildHost();
            }

            public final boolean hasBuildId() {
                return this._builder.hasBuildId();
            }

            public final boolean hasBuildProduct() {
                return this._builder.hasBuildProduct();
            }

            public final boolean hasDisplayScreenDensity() {
                return this._builder.hasDisplayScreenDensity();
            }

            public final boolean hasExtensionVersion() {
                return this._builder.hasExtensionVersion();
            }

            public final boolean hasPhoneType() {
                return this._builder.hasPhoneType();
            }

            public final boolean hasSimOperator() {
                return this._builder.hasSimOperator();
            }

            public final boolean hasTotalDiskSpaceInternal() {
                return this._builder.hasTotalDiskSpaceInternal();
            }

            public final boolean hasVersionCode() {
                return this._builder.hasVersionCode();
            }

            public final void setAndroidFingerprint(String value) {
                t.g(value, "value");
                this._builder.setAndroidFingerprint(value);
            }

            public final void setApiLevel(int i) {
                this._builder.setApiLevel(i);
            }

            public final void setApkDeveloperSigningCertificateHash(String value) {
                t.g(value, "value");
                this._builder.setApkDeveloperSigningCertificateHash(value);
            }

            public final void setAppInstaller(String value) {
                t.g(value, "value");
                this._builder.setAppInstaller(value);
            }

            public final void setBuildBoard(String value) {
                t.g(value, "value");
                this._builder.setBuildBoard(value);
            }

            public final void setBuildBootloader(String value) {
                t.g(value, "value");
                this._builder.setBuildBootloader(value);
            }

            public final void setBuildBrand(String value) {
                t.g(value, "value");
                this._builder.setBuildBrand(value);
            }

            public final void setBuildDevice(String value) {
                t.g(value, "value");
                this._builder.setBuildDevice(value);
            }

            public final void setBuildDisplay(String value) {
                t.g(value, "value");
                this._builder.setBuildDisplay(value);
            }

            public final void setBuildFingerprint(String value) {
                t.g(value, "value");
                this._builder.setBuildFingerprint(value);
            }

            public final void setBuildHardware(String value) {
                t.g(value, "value");
                this._builder.setBuildHardware(value);
            }

            public final void setBuildHost(String value) {
                t.g(value, "value");
                this._builder.setBuildHost(value);
            }

            public final void setBuildId(String value) {
                t.g(value, "value");
                this._builder.setBuildId(value);
            }

            public final void setBuildProduct(String value) {
                t.g(value, "value");
                this._builder.setBuildProduct(value);
            }

            public final void setDisplayScreenDensity(int i) {
                this._builder.setDisplayScreenDensity(i);
            }

            public final void setExtensionVersion(int i) {
                this._builder.setExtensionVersion(i);
            }

            public final void setPhoneType(int i) {
                this._builder.setPhoneType(i);
            }

            public final void setSimOperator(String value) {
                t.g(value, "value");
                this._builder.setSimOperator(value);
            }

            public final void setTotalDiskSpaceInternal(long j) {
                this._builder.setTotalDiskSpaceInternal(j);
            }

            public final void setVersionCode(int i) {
                this._builder.setVersionCode(i);
            }

            private Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder) {
                this._builder = builder;
            }
        }

        private AndroidKt() {
        }
    }

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public static final class StoresProxy extends DslProxy {
            private StoresProxy() {
            }
        }

        public /* synthetic */ Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ StaticDeviceInfoOuterClass.StaticDeviceInfo _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (StaticDeviceInfoOuterClass.StaticDeviceInfo) build;
        }

        public final /* synthetic */ void addAllStores(DslList dslList, Iterable values) {
            t.g(dslList, "<this>");
            t.g(values, "values");
            this._builder.addAllStores(values);
        }

        public final /* synthetic */ void addStores(DslList dslList, String value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            this._builder.addStores(value);
        }

        public final void clearAndroid() {
            this._builder.clearAndroid();
        }

        public final void clearAppDebuggable() {
            this._builder.clearAppDebuggable();
        }

        public final void clearBundleId() {
            this._builder.clearBundleId();
        }

        public final void clearBundleVersion() {
            this._builder.clearBundleVersion();
        }

        public final void clearCpuCount() {
            this._builder.clearCpuCount();
        }

        public final void clearCpuModel() {
            this._builder.clearCpuModel();
        }

        public final void clearDeviceMake() {
            this._builder.clearDeviceMake();
        }

        public final void clearDeviceModel() {
            this._builder.clearDeviceModel();
        }

        public final void clearGpuModel() {
            this._builder.clearGpuModel();
        }

        public final void clearIos() {
            this._builder.clearIos();
        }

        public final void clearMadeWithUnity() {
            this._builder.clearMadeWithUnity();
        }

        public final void clearOsVersion() {
            this._builder.clearOsVersion();
        }

        public final void clearPlatformSpecific() {
            this._builder.clearPlatformSpecific();
        }

        public final void clearRooted() {
            this._builder.clearRooted();
        }

        public final void clearScreenDensity() {
            this._builder.clearScreenDensity();
        }

        public final void clearScreenHeight() {
            this._builder.clearScreenHeight();
        }

        public final void clearScreenSize() {
            this._builder.clearScreenSize();
        }

        public final void clearScreenWidth() {
            this._builder.clearScreenWidth();
        }

        public final /* synthetic */ void clearStores(DslList dslList) {
            t.g(dslList, "<this>");
            this._builder.clearStores();
        }

        public final void clearTotalDiskSpace() {
            this._builder.clearTotalDiskSpace();
        }

        public final void clearTotalRamMemory() {
            this._builder.clearTotalRamMemory();
        }

        public final void clearWebviewUa() {
            this._builder.clearWebviewUa();
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android getAndroid() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo.Android android = this._builder.getAndroid();
            t.f(android, "_builder.getAndroid()");
            return android;
        }

        public final boolean getAppDebuggable() {
            return this._builder.getAppDebuggable();
        }

        public final String getBundleId() {
            String bundleId = this._builder.getBundleId();
            t.f(bundleId, "_builder.getBundleId()");
            return bundleId;
        }

        public final String getBundleVersion() {
            String bundleVersion = this._builder.getBundleVersion();
            t.f(bundleVersion, "_builder.getBundleVersion()");
            return bundleVersion;
        }

        public final long getCpuCount() {
            return this._builder.getCpuCount();
        }

        public final String getCpuModel() {
            String cpuModel = this._builder.getCpuModel();
            t.f(cpuModel, "_builder.getCpuModel()");
            return cpuModel;
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

        public final String getGpuModel() {
            String gpuModel = this._builder.getGpuModel();
            t.f(gpuModel, "_builder.getGpuModel()");
            return gpuModel;
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios getIos() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios ios = this._builder.getIos();
            t.f(ios, "_builder.getIos()");
            return ios;
        }

        public final boolean getMadeWithUnity() {
            return this._builder.getMadeWithUnity();
        }

        public final String getOsVersion() {
            String osVersion = this._builder.getOsVersion();
            t.f(osVersion, "_builder.getOsVersion()");
            return osVersion;
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo.PlatformSpecificCase getPlatformSpecificCase() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo.PlatformSpecificCase platformSpecificCase = this._builder.getPlatformSpecificCase();
            t.f(platformSpecificCase, "_builder.getPlatformSpecificCase()");
            return platformSpecificCase;
        }

        public final boolean getRooted() {
            return this._builder.getRooted();
        }

        public final int getScreenDensity() {
            return this._builder.getScreenDensity();
        }

        public final int getScreenHeight() {
            return this._builder.getScreenHeight();
        }

        public final int getScreenSize() {
            return this._builder.getScreenSize();
        }

        public final int getScreenWidth() {
            return this._builder.getScreenWidth();
        }

        public final DslList getStores() {
            List storesList = this._builder.getStoresList();
            t.f(storesList, "_builder.getStoresList()");
            return new DslList(storesList);
        }

        public final long getTotalDiskSpace() {
            return this._builder.getTotalDiskSpace();
        }

        public final long getTotalRamMemory() {
            return this._builder.getTotalRamMemory();
        }

        public final String getWebviewUa() {
            String webviewUa = this._builder.getWebviewUa();
            t.f(webviewUa, "_builder.getWebviewUa()");
            return webviewUa;
        }

        public final boolean hasAndroid() {
            return this._builder.hasAndroid();
        }

        public final boolean hasAppDebuggable() {
            return this._builder.hasAppDebuggable();
        }

        public final boolean hasBundleId() {
            return this._builder.hasBundleId();
        }

        public final boolean hasBundleVersion() {
            return this._builder.hasBundleVersion();
        }

        public final boolean hasCpuCount() {
            return this._builder.hasCpuCount();
        }

        public final boolean hasCpuModel() {
            return this._builder.hasCpuModel();
        }

        public final boolean hasDeviceMake() {
            return this._builder.hasDeviceMake();
        }

        public final boolean hasDeviceModel() {
            return this._builder.hasDeviceModel();
        }

        public final boolean hasGpuModel() {
            return this._builder.hasGpuModel();
        }

        public final boolean hasIos() {
            return this._builder.hasIos();
        }

        public final boolean hasMadeWithUnity() {
            return this._builder.hasMadeWithUnity();
        }

        public final boolean hasOsVersion() {
            return this._builder.hasOsVersion();
        }

        public final boolean hasRooted() {
            return this._builder.hasRooted();
        }

        public final boolean hasScreenDensity() {
            return this._builder.hasScreenDensity();
        }

        public final boolean hasScreenHeight() {
            return this._builder.hasScreenHeight();
        }

        public final boolean hasScreenSize() {
            return this._builder.hasScreenSize();
        }

        public final boolean hasScreenWidth() {
            return this._builder.hasScreenWidth();
        }

        public final boolean hasTotalDiskSpace() {
            return this._builder.hasTotalDiskSpace();
        }

        public final boolean hasTotalRamMemory() {
            return this._builder.hasTotalRamMemory();
        }

        public final boolean hasWebviewUa() {
            return this._builder.hasWebviewUa();
        }

        public final /* synthetic */ void plusAssignAllStores(DslList dslList, Iterable values) {
            t.g(dslList, "<this>");
            t.g(values, "values");
            addAllStores(dslList, values);
        }

        public final /* synthetic */ void plusAssignStores(DslList dslList, String value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            addStores(dslList, value);
        }

        public final void setAndroid(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android value) {
            t.g(value, "value");
            this._builder.setAndroid(value);
        }

        public final void setAppDebuggable(boolean z) {
            this._builder.setAppDebuggable(z);
        }

        public final void setBundleId(String value) {
            t.g(value, "value");
            this._builder.setBundleId(value);
        }

        public final void setBundleVersion(String value) {
            t.g(value, "value");
            this._builder.setBundleVersion(value);
        }

        public final void setCpuCount(long j) {
            this._builder.setCpuCount(j);
        }

        public final void setCpuModel(String value) {
            t.g(value, "value");
            this._builder.setCpuModel(value);
        }

        public final void setDeviceMake(String value) {
            t.g(value, "value");
            this._builder.setDeviceMake(value);
        }

        public final void setDeviceModel(String value) {
            t.g(value, "value");
            this._builder.setDeviceModel(value);
        }

        public final void setGpuModel(String value) {
            t.g(value, "value");
            this._builder.setGpuModel(value);
        }

        public final void setIos(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios value) {
            t.g(value, "value");
            this._builder.setIos(value);
        }

        public final void setMadeWithUnity(boolean z) {
            this._builder.setMadeWithUnity(z);
        }

        public final void setOsVersion(String value) {
            t.g(value, "value");
            this._builder.setOsVersion(value);
        }

        public final void setRooted(boolean z) {
            this._builder.setRooted(z);
        }

        public final void setScreenDensity(int i) {
            this._builder.setScreenDensity(i);
        }

        public final void setScreenHeight(int i) {
            this._builder.setScreenHeight(i);
        }

        public final void setScreenSize(int i) {
            this._builder.setScreenSize(i);
        }

        public final void setScreenWidth(int i) {
            this._builder.setScreenWidth(i);
        }

        public final /* synthetic */ void setStores(DslList dslList, int i, String value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            this._builder.setStores(i, value);
        }

        public final void setTotalDiskSpace(long j) {
            this._builder.setTotalDiskSpace(j);
        }

        public final void setTotalRamMemory(long j) {
            this._builder.setTotalRamMemory(j);
        }

        public final void setWebviewUa(String value) {
            t.g(value, "value");
            this._builder.setWebviewUa(value);
        }

        private Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
            this._builder = builder;
        }
    }

    public static final class IosKt {
        public static final IosKt INSTANCE = new IosKt();

        @ProtoDslMarker
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder _builder;

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder) {
                    t.g(builder, "builder");
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public static final class SkadnetworkIdProxy extends DslProxy {
                private SkadnetworkIdProxy() {
                }
            }

            public /* synthetic */ Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder, k kVar) {
                this(builder);
            }

            public final /* synthetic */ StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios _build() {
                GeneratedMessageLite build = this._builder.build();
                t.f(build, "_builder.build()");
                return (StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) build;
            }

            public final /* synthetic */ void addAllSkadnetworkId(DslList dslList, Iterable values) {
                t.g(dslList, "<this>");
                t.g(values, "values");
                this._builder.addAllSkadnetworkId(values);
            }

            public final /* synthetic */ void addSkadnetworkId(DslList dslList, String value) {
                t.g(dslList, "<this>");
                t.g(value, "value");
                this._builder.addSkadnetworkId(value);
            }

            public final void clearBuiltSdkVersion() {
                this._builder.clearBuiltSdkVersion();
            }

            public final void clearBundleVersionFull() {
                this._builder.clearBundleVersionFull();
            }

            public final void clearCanMakePayments() {
                this._builder.clearCanMakePayments();
            }

            public final void clearScreenScale() {
                this._builder.clearScreenScale();
            }

            public final void clearSimulator() {
                this._builder.clearSimulator();
            }

            public final /* synthetic */ void clearSkadnetworkId(DslList dslList) {
                t.g(dslList, "<this>");
                this._builder.clearSkadnetworkId();
            }

            public final void clearSystemBootTime() {
                this._builder.clearSystemBootTime();
            }

            public final void clearXcodeBuildVersion() {
                this._builder.clearXcodeBuildVersion();
            }

            public final void clearXcodeSdkBuildVersion() {
                this._builder.clearXcodeSdkBuildVersion();
            }

            public final void clearXcodeVersion() {
                this._builder.clearXcodeVersion();
            }

            public final String getBuiltSdkVersion() {
                String builtSdkVersion = this._builder.getBuiltSdkVersion();
                t.f(builtSdkVersion, "_builder.getBuiltSdkVersion()");
                return builtSdkVersion;
            }

            public final String getBundleVersionFull() {
                String bundleVersionFull = this._builder.getBundleVersionFull();
                t.f(bundleVersionFull, "_builder.getBundleVersionFull()");
                return bundleVersionFull;
            }

            public final boolean getCanMakePayments() {
                return this._builder.getCanMakePayments();
            }

            public final int getScreenScale() {
                return this._builder.getScreenScale();
            }

            public final boolean getSimulator() {
                return this._builder.getSimulator();
            }

            public final DslList getSkadnetworkId() {
                List skadnetworkIdList = this._builder.getSkadnetworkIdList();
                t.f(skadnetworkIdList, "_builder.getSkadnetworkIdList()");
                return new DslList(skadnetworkIdList);
            }

            public final long getSystemBootTime() {
                return this._builder.getSystemBootTime();
            }

            public final String getXcodeBuildVersion() {
                String xcodeBuildVersion = this._builder.getXcodeBuildVersion();
                t.f(xcodeBuildVersion, "_builder.getXcodeBuildVersion()");
                return xcodeBuildVersion;
            }

            public final String getXcodeSdkBuildVersion() {
                String xcodeSdkBuildVersion = this._builder.getXcodeSdkBuildVersion();
                t.f(xcodeSdkBuildVersion, "_builder.getXcodeSdkBuildVersion()");
                return xcodeSdkBuildVersion;
            }

            public final String getXcodeVersion() {
                String xcodeVersion = this._builder.getXcodeVersion();
                t.f(xcodeVersion, "_builder.getXcodeVersion()");
                return xcodeVersion;
            }

            public final boolean hasBuiltSdkVersion() {
                return this._builder.hasBuiltSdkVersion();
            }

            public final boolean hasBundleVersionFull() {
                return this._builder.hasBundleVersionFull();
            }

            public final boolean hasCanMakePayments() {
                return this._builder.hasCanMakePayments();
            }

            public final boolean hasScreenScale() {
                return this._builder.hasScreenScale();
            }

            public final boolean hasSimulator() {
                return this._builder.hasSimulator();
            }

            public final boolean hasSystemBootTime() {
                return this._builder.hasSystemBootTime();
            }

            public final boolean hasXcodeBuildVersion() {
                return this._builder.hasXcodeBuildVersion();
            }

            public final boolean hasXcodeSdkBuildVersion() {
                return this._builder.hasXcodeSdkBuildVersion();
            }

            public final boolean hasXcodeVersion() {
                return this._builder.hasXcodeVersion();
            }

            public final /* synthetic */ void plusAssignAllSkadnetworkId(DslList dslList, Iterable values) {
                t.g(dslList, "<this>");
                t.g(values, "values");
                addAllSkadnetworkId(dslList, values);
            }

            public final /* synthetic */ void plusAssignSkadnetworkId(DslList dslList, String value) {
                t.g(dslList, "<this>");
                t.g(value, "value");
                addSkadnetworkId(dslList, value);
            }

            public final void setBuiltSdkVersion(String value) {
                t.g(value, "value");
                this._builder.setBuiltSdkVersion(value);
            }

            public final void setBundleVersionFull(String value) {
                t.g(value, "value");
                this._builder.setBundleVersionFull(value);
            }

            public final void setCanMakePayments(boolean z) {
                this._builder.setCanMakePayments(z);
            }

            public final void setScreenScale(int i) {
                this._builder.setScreenScale(i);
            }

            public final void setSimulator(boolean z) {
                this._builder.setSimulator(z);
            }

            public final /* synthetic */ void setSkadnetworkId(DslList dslList, int i, String value) {
                t.g(dslList, "<this>");
                t.g(value, "value");
                this._builder.setSkadnetworkId(i, value);
            }

            public final void setSystemBootTime(long j) {
                this._builder.setSystemBootTime(j);
            }

            public final void setXcodeBuildVersion(String value) {
                t.g(value, "value");
                this._builder.setXcodeBuildVersion(value);
            }

            public final void setXcodeSdkBuildVersion(String value) {
                t.g(value, "value");
                this._builder.setXcodeSdkBuildVersion(value);
            }

            public final void setXcodeVersion(String value) {
                t.g(value, "value");
                this._builder.setXcodeVersion(value);
            }

            private Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder) {
                this._builder = builder;
            }
        }

        private IosKt() {
        }
    }

    private StaticDeviceInfoKt() {
    }

    public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android -initializeandroid(l block) {
        t.g(block, "block");
        AndroidKt.Dsl.Companion companion = AndroidKt.Dsl.Companion;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder newBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.newBuilder();
        t.f(newBuilder, "newBuilder()");
        AndroidKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios -initializeios(l block) {
        t.g(block, "block");
        IosKt.Dsl.Companion companion = IosKt.Dsl.Companion;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder newBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.newBuilder();
        t.f(newBuilder, "newBuilder()");
        IosKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }
}
