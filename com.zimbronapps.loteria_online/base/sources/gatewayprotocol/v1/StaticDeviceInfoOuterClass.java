package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StaticDeviceInfoOuterClass {

    public static final class StaticDeviceInfo extends GeneratedMessageLite implements StaticDeviceInfoOrBuilder {
        public static final int ANDROID_FIELD_NUMBER = 19;
        public static final int APP_DEBUGGABLE_FIELD_NUMBER = 3;
        public static final int BUNDLE_ID_FIELD_NUMBER = 1;
        public static final int BUNDLE_VERSION_FIELD_NUMBER = 2;
        public static final int CPU_COUNT_FIELD_NUMBER = 17;
        public static final int CPU_MODEL_FIELD_NUMBER = 16;
        private static final StaticDeviceInfo DEFAULT_INSTANCE;
        public static final int DEVICE_MAKE_FIELD_NUMBER = 6;
        public static final int DEVICE_MODEL_FIELD_NUMBER = 7;
        public static final int GPU_MODEL_FIELD_NUMBER = 18;
        public static final int IOS_FIELD_NUMBER = 20;
        public static final int MADE_WITH_UNITY_FIELD_NUMBER = 21;
        public static final int OS_VERSION_FIELD_NUMBER = 5;
        private static volatile Parser PARSER = null;
        public static final int ROOTED_FIELD_NUMBER = 4;
        public static final int SCREEN_DENSITY_FIELD_NUMBER = 9;
        public static final int SCREEN_HEIGHT_FIELD_NUMBER = 11;
        public static final int SCREEN_SIZE_FIELD_NUMBER = 12;
        public static final int SCREEN_WIDTH_FIELD_NUMBER = 10;
        public static final int STORES_FIELD_NUMBER = 13;
        public static final int TOTAL_DISK_SPACE_FIELD_NUMBER = 14;
        public static final int TOTAL_RAM_MEMORY_FIELD_NUMBER = 15;
        public static final int WEBVIEW_UA_FIELD_NUMBER = 8;
        private boolean appDebuggable_;
        private int bitField0_;
        private long cpuCount_;
        private boolean madeWithUnity_;
        private Object platformSpecific_;
        private boolean rooted_;
        private int screenDensity_;
        private int screenHeight_;
        private int screenSize_;
        private int screenWidth_;
        private long totalDiskSpace_;
        private long totalRamMemory_;
        private int platformSpecificCase_ = 0;
        private String bundleId_ = "";
        private String bundleVersion_ = "";
        private String osVersion_ = "";
        private String deviceMake_ = "";
        private String deviceModel_ = "";
        private String webviewUa_ = "";
        private Internal.ProtobufList stores_ = GeneratedMessageLite.emptyProtobufList();
        private String cpuModel_ = "";
        private String gpuModel_ = "";

        public static final class Android extends GeneratedMessageLite implements AndroidOrBuilder {
            public static final int ANDROID_FINGERPRINT_FIELD_NUMBER = 3;
            public static final int API_LEVEL_FIELD_NUMBER = 1;
            public static final int APK_DEVELOPER_SIGNING_CERTIFICATE_HASH_FIELD_NUMBER = 5;
            public static final int APP_INSTALLER_FIELD_NUMBER = 4;
            public static final int BUILD_BOARD_FIELD_NUMBER = 6;
            public static final int BUILD_BOOTLOADER_FIELD_NUMBER = 13;
            public static final int BUILD_BRAND_FIELD_NUMBER = 7;
            public static final int BUILD_DEVICE_FIELD_NUMBER = 8;
            public static final int BUILD_DISPLAY_FIELD_NUMBER = 9;
            public static final int BUILD_FINGERPRINT_FIELD_NUMBER = 10;
            public static final int BUILD_HARDWARE_FIELD_NUMBER = 11;
            public static final int BUILD_HOST_FIELD_NUMBER = 12;
            public static final int BUILD_ID_FIELD_NUMBER = 15;
            public static final int BUILD_PRODUCT_FIELD_NUMBER = 14;
            private static final Android DEFAULT_INSTANCE;
            public static final int DISPLAY_SCREEN_DENSITY_FIELD_NUMBER = 20;
            public static final int EXTENSION_VERSION_FIELD_NUMBER = 16;
            private static volatile Parser PARSER = null;
            public static final int PHONE_TYPE_FIELD_NUMBER = 17;
            public static final int SIM_OPERATOR_FIELD_NUMBER = 18;
            public static final int TOTAL_DISK_SPACE_INTERNAL_FIELD_NUMBER = 19;
            public static final int VERSION_CODE_FIELD_NUMBER = 2;
            private int apiLevel_;
            private int bitField0_;
            private int displayScreenDensity_;
            private int extensionVersion_;
            private int phoneType_;
            private long totalDiskSpaceInternal_;
            private int versionCode_;
            private String androidFingerprint_ = "";
            private String appInstaller_ = "";
            private String apkDeveloperSigningCertificateHash_ = "";
            private String buildBoard_ = "";
            private String buildBrand_ = "";
            private String buildDevice_ = "";
            private String buildDisplay_ = "";
            private String buildFingerprint_ = "";
            private String buildHardware_ = "";
            private String buildHost_ = "";
            private String buildBootloader_ = "";
            private String buildProduct_ = "";
            private String buildId_ = "";
            private String simOperator_ = "";

            public static final class Builder extends GeneratedMessageLite.Builder implements AndroidOrBuilder {
                public /* synthetic */ Builder(a aVar) {
                    this();
                }

                public Builder clearAndroidFingerprint() {
                    copyOnWrite();
                    Android.access$600((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearApiLevel() {
                    copyOnWrite();
                    Android.access$200((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearApkDeveloperSigningCertificateHash() {
                    copyOnWrite();
                    Android.access$1200((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearAppInstaller() {
                    copyOnWrite();
                    Android.access$900((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearBuildBoard() {
                    copyOnWrite();
                    Android.access$1500((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearBuildBootloader() {
                    copyOnWrite();
                    Android.access$3600((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearBuildBrand() {
                    copyOnWrite();
                    Android.access$1800((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearBuildDevice() {
                    copyOnWrite();
                    Android.access$2100((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearBuildDisplay() {
                    copyOnWrite();
                    Android.access$2400((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearBuildFingerprint() {
                    copyOnWrite();
                    Android.access$2700((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearBuildHardware() {
                    copyOnWrite();
                    Android.access$3000((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearBuildHost() {
                    copyOnWrite();
                    Android.access$3300((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearBuildId() {
                    copyOnWrite();
                    Android.access$4200((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearBuildProduct() {
                    copyOnWrite();
                    Android.access$3900((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearDisplayScreenDensity() {
                    copyOnWrite();
                    Android.access$5400((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearExtensionVersion() {
                    copyOnWrite();
                    Android.access$4500((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearPhoneType() {
                    copyOnWrite();
                    Android.access$4700((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearSimOperator() {
                    copyOnWrite();
                    Android.access$4900((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearTotalDiskSpaceInternal() {
                    copyOnWrite();
                    Android.access$5200((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearVersionCode() {
                    copyOnWrite();
                    Android.access$400((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public String getAndroidFingerprint() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getAndroidFingerprint();
                }

                public ByteString getAndroidFingerprintBytes() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getAndroidFingerprintBytes();
                }

                public int getApiLevel() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getApiLevel();
                }

                public String getApkDeveloperSigningCertificateHash() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getApkDeveloperSigningCertificateHash();
                }

                public ByteString getApkDeveloperSigningCertificateHashBytes() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getApkDeveloperSigningCertificateHashBytes();
                }

                public String getAppInstaller() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getAppInstaller();
                }

                public ByteString getAppInstallerBytes() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getAppInstallerBytes();
                }

                public String getBuildBoard() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getBuildBoard();
                }

                public ByteString getBuildBoardBytes() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getBuildBoardBytes();
                }

                public String getBuildBootloader() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getBuildBootloader();
                }

                public ByteString getBuildBootloaderBytes() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getBuildBootloaderBytes();
                }

                public String getBuildBrand() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getBuildBrand();
                }

                public ByteString getBuildBrandBytes() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getBuildBrandBytes();
                }

                public String getBuildDevice() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getBuildDevice();
                }

                public ByteString getBuildDeviceBytes() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getBuildDeviceBytes();
                }

                public String getBuildDisplay() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getBuildDisplay();
                }

                public ByteString getBuildDisplayBytes() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getBuildDisplayBytes();
                }

                public String getBuildFingerprint() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getBuildFingerprint();
                }

                public ByteString getBuildFingerprintBytes() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getBuildFingerprintBytes();
                }

                public String getBuildHardware() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getBuildHardware();
                }

                public ByteString getBuildHardwareBytes() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getBuildHardwareBytes();
                }

                public String getBuildHost() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getBuildHost();
                }

                public ByteString getBuildHostBytes() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getBuildHostBytes();
                }

                public String getBuildId() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getBuildId();
                }

                public ByteString getBuildIdBytes() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getBuildIdBytes();
                }

                public String getBuildProduct() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getBuildProduct();
                }

                public ByteString getBuildProductBytes() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getBuildProductBytes();
                }

                public int getDisplayScreenDensity() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getDisplayScreenDensity();
                }

                public int getExtensionVersion() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getExtensionVersion();
                }

                public int getPhoneType() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getPhoneType();
                }

                public String getSimOperator() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getSimOperator();
                }

                public ByteString getSimOperatorBytes() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getSimOperatorBytes();
                }

                public long getTotalDiskSpaceInternal() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getTotalDiskSpaceInternal();
                }

                public int getVersionCode() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getVersionCode();
                }

                public boolean hasAndroidFingerprint() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasAndroidFingerprint();
                }

                public boolean hasApiLevel() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasApiLevel();
                }

                public boolean hasApkDeveloperSigningCertificateHash() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasApkDeveloperSigningCertificateHash();
                }

                public boolean hasAppInstaller() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasAppInstaller();
                }

                public boolean hasBuildBoard() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasBuildBoard();
                }

                public boolean hasBuildBootloader() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasBuildBootloader();
                }

                public boolean hasBuildBrand() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasBuildBrand();
                }

                public boolean hasBuildDevice() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasBuildDevice();
                }

                public boolean hasBuildDisplay() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasBuildDisplay();
                }

                public boolean hasBuildFingerprint() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasBuildFingerprint();
                }

                public boolean hasBuildHardware() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasBuildHardware();
                }

                public boolean hasBuildHost() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasBuildHost();
                }

                public boolean hasBuildId() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasBuildId();
                }

                public boolean hasBuildProduct() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasBuildProduct();
                }

                public boolean hasDisplayScreenDensity() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasDisplayScreenDensity();
                }

                public boolean hasExtensionVersion() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasExtensionVersion();
                }

                public boolean hasPhoneType() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasPhoneType();
                }

                public boolean hasSimOperator() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasSimOperator();
                }

                public boolean hasTotalDiskSpaceInternal() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasTotalDiskSpaceInternal();
                }

                public boolean hasVersionCode() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasVersionCode();
                }

                public Builder setAndroidFingerprint(String str) {
                    copyOnWrite();
                    Android.access$500((Android) ((GeneratedMessageLite.Builder) this).instance, str);
                    return this;
                }

                public Builder setAndroidFingerprintBytes(ByteString byteString) {
                    copyOnWrite();
                    Android.access$700((Android) ((GeneratedMessageLite.Builder) this).instance, byteString);
                    return this;
                }

                public Builder setApiLevel(int i) {
                    copyOnWrite();
                    Android.access$100((Android) ((GeneratedMessageLite.Builder) this).instance, i);
                    return this;
                }

                public Builder setApkDeveloperSigningCertificateHash(String str) {
                    copyOnWrite();
                    Android.access$1100((Android) ((GeneratedMessageLite.Builder) this).instance, str);
                    return this;
                }

                public Builder setApkDeveloperSigningCertificateHashBytes(ByteString byteString) {
                    copyOnWrite();
                    Android.access$1300((Android) ((GeneratedMessageLite.Builder) this).instance, byteString);
                    return this;
                }

                public Builder setAppInstaller(String str) {
                    copyOnWrite();
                    Android.access$800((Android) ((GeneratedMessageLite.Builder) this).instance, str);
                    return this;
                }

                public Builder setAppInstallerBytes(ByteString byteString) {
                    copyOnWrite();
                    Android.access$1000((Android) ((GeneratedMessageLite.Builder) this).instance, byteString);
                    return this;
                }

                public Builder setBuildBoard(String str) {
                    copyOnWrite();
                    Android.access$1400((Android) ((GeneratedMessageLite.Builder) this).instance, str);
                    return this;
                }

                public Builder setBuildBoardBytes(ByteString byteString) {
                    copyOnWrite();
                    Android.access$1600((Android) ((GeneratedMessageLite.Builder) this).instance, byteString);
                    return this;
                }

                public Builder setBuildBootloader(String str) {
                    copyOnWrite();
                    Android.access$3500((Android) ((GeneratedMessageLite.Builder) this).instance, str);
                    return this;
                }

                public Builder setBuildBootloaderBytes(ByteString byteString) {
                    copyOnWrite();
                    Android.access$3700((Android) ((GeneratedMessageLite.Builder) this).instance, byteString);
                    return this;
                }

                public Builder setBuildBrand(String str) {
                    copyOnWrite();
                    Android.access$1700((Android) ((GeneratedMessageLite.Builder) this).instance, str);
                    return this;
                }

                public Builder setBuildBrandBytes(ByteString byteString) {
                    copyOnWrite();
                    Android.access$1900((Android) ((GeneratedMessageLite.Builder) this).instance, byteString);
                    return this;
                }

                public Builder setBuildDevice(String str) {
                    copyOnWrite();
                    Android.access$2000((Android) ((GeneratedMessageLite.Builder) this).instance, str);
                    return this;
                }

                public Builder setBuildDeviceBytes(ByteString byteString) {
                    copyOnWrite();
                    Android.access$2200((Android) ((GeneratedMessageLite.Builder) this).instance, byteString);
                    return this;
                }

                public Builder setBuildDisplay(String str) {
                    copyOnWrite();
                    Android.access$2300((Android) ((GeneratedMessageLite.Builder) this).instance, str);
                    return this;
                }

                public Builder setBuildDisplayBytes(ByteString byteString) {
                    copyOnWrite();
                    Android.access$2500((Android) ((GeneratedMessageLite.Builder) this).instance, byteString);
                    return this;
                }

                public Builder setBuildFingerprint(String str) {
                    copyOnWrite();
                    Android.access$2600((Android) ((GeneratedMessageLite.Builder) this).instance, str);
                    return this;
                }

                public Builder setBuildFingerprintBytes(ByteString byteString) {
                    copyOnWrite();
                    Android.access$2800((Android) ((GeneratedMessageLite.Builder) this).instance, byteString);
                    return this;
                }

                public Builder setBuildHardware(String str) {
                    copyOnWrite();
                    Android.access$2900((Android) ((GeneratedMessageLite.Builder) this).instance, str);
                    return this;
                }

                public Builder setBuildHardwareBytes(ByteString byteString) {
                    copyOnWrite();
                    Android.access$3100((Android) ((GeneratedMessageLite.Builder) this).instance, byteString);
                    return this;
                }

                public Builder setBuildHost(String str) {
                    copyOnWrite();
                    Android.access$3200((Android) ((GeneratedMessageLite.Builder) this).instance, str);
                    return this;
                }

                public Builder setBuildHostBytes(ByteString byteString) {
                    copyOnWrite();
                    Android.access$3400((Android) ((GeneratedMessageLite.Builder) this).instance, byteString);
                    return this;
                }

                public Builder setBuildId(String str) {
                    copyOnWrite();
                    Android.access$4100((Android) ((GeneratedMessageLite.Builder) this).instance, str);
                    return this;
                }

                public Builder setBuildIdBytes(ByteString byteString) {
                    copyOnWrite();
                    Android.access$4300((Android) ((GeneratedMessageLite.Builder) this).instance, byteString);
                    return this;
                }

                public Builder setBuildProduct(String str) {
                    copyOnWrite();
                    Android.access$3800((Android) ((GeneratedMessageLite.Builder) this).instance, str);
                    return this;
                }

                public Builder setBuildProductBytes(ByteString byteString) {
                    copyOnWrite();
                    Android.access$4000((Android) ((GeneratedMessageLite.Builder) this).instance, byteString);
                    return this;
                }

                public Builder setDisplayScreenDensity(int i) {
                    copyOnWrite();
                    Android.access$5300((Android) ((GeneratedMessageLite.Builder) this).instance, i);
                    return this;
                }

                public Builder setExtensionVersion(int i) {
                    copyOnWrite();
                    Android.access$4400((Android) ((GeneratedMessageLite.Builder) this).instance, i);
                    return this;
                }

                public Builder setPhoneType(int i) {
                    copyOnWrite();
                    Android.access$4600((Android) ((GeneratedMessageLite.Builder) this).instance, i);
                    return this;
                }

                public Builder setSimOperator(String str) {
                    copyOnWrite();
                    Android.access$4800((Android) ((GeneratedMessageLite.Builder) this).instance, str);
                    return this;
                }

                public Builder setSimOperatorBytes(ByteString byteString) {
                    copyOnWrite();
                    Android.access$5000((Android) ((GeneratedMessageLite.Builder) this).instance, byteString);
                    return this;
                }

                public Builder setTotalDiskSpaceInternal(long j) {
                    copyOnWrite();
                    Android.access$5100((Android) ((GeneratedMessageLite.Builder) this).instance, j);
                    return this;
                }

                public Builder setVersionCode(int i) {
                    copyOnWrite();
                    Android.access$300((Android) ((GeneratedMessageLite.Builder) this).instance, i);
                    return this;
                }

                private Builder() {
                    super(Android.access$000());
                }
            }

            static {
                Android android = new Android();
                DEFAULT_INSTANCE = android;
                GeneratedMessageLite.registerDefaultInstance(Android.class, android);
            }

            private Android() {
            }

            public static /* synthetic */ Android access$000() {
                return DEFAULT_INSTANCE;
            }

            public static /* synthetic */ void access$100(Android android, int i) {
                android.setApiLevel(i);
            }

            public static /* synthetic */ void access$1000(Android android, ByteString byteString) {
                android.setAppInstallerBytes(byteString);
            }

            public static /* synthetic */ void access$1100(Android android, String str) {
                android.setApkDeveloperSigningCertificateHash(str);
            }

            public static /* synthetic */ void access$1200(Android android) {
                android.clearApkDeveloperSigningCertificateHash();
            }

            public static /* synthetic */ void access$1300(Android android, ByteString byteString) {
                android.setApkDeveloperSigningCertificateHashBytes(byteString);
            }

            public static /* synthetic */ void access$1400(Android android, String str) {
                android.setBuildBoard(str);
            }

            public static /* synthetic */ void access$1500(Android android) {
                android.clearBuildBoard();
            }

            public static /* synthetic */ void access$1600(Android android, ByteString byteString) {
                android.setBuildBoardBytes(byteString);
            }

            public static /* synthetic */ void access$1700(Android android, String str) {
                android.setBuildBrand(str);
            }

            public static /* synthetic */ void access$1800(Android android) {
                android.clearBuildBrand();
            }

            public static /* synthetic */ void access$1900(Android android, ByteString byteString) {
                android.setBuildBrandBytes(byteString);
            }

            public static /* synthetic */ void access$200(Android android) {
                android.clearApiLevel();
            }

            public static /* synthetic */ void access$2000(Android android, String str) {
                android.setBuildDevice(str);
            }

            public static /* synthetic */ void access$2100(Android android) {
                android.clearBuildDevice();
            }

            public static /* synthetic */ void access$2200(Android android, ByteString byteString) {
                android.setBuildDeviceBytes(byteString);
            }

            public static /* synthetic */ void access$2300(Android android, String str) {
                android.setBuildDisplay(str);
            }

            public static /* synthetic */ void access$2400(Android android) {
                android.clearBuildDisplay();
            }

            public static /* synthetic */ void access$2500(Android android, ByteString byteString) {
                android.setBuildDisplayBytes(byteString);
            }

            public static /* synthetic */ void access$2600(Android android, String str) {
                android.setBuildFingerprint(str);
            }

            public static /* synthetic */ void access$2700(Android android) {
                android.clearBuildFingerprint();
            }

            public static /* synthetic */ void access$2800(Android android, ByteString byteString) {
                android.setBuildFingerprintBytes(byteString);
            }

            public static /* synthetic */ void access$2900(Android android, String str) {
                android.setBuildHardware(str);
            }

            public static /* synthetic */ void access$300(Android android, int i) {
                android.setVersionCode(i);
            }

            public static /* synthetic */ void access$3000(Android android) {
                android.clearBuildHardware();
            }

            public static /* synthetic */ void access$3100(Android android, ByteString byteString) {
                android.setBuildHardwareBytes(byteString);
            }

            public static /* synthetic */ void access$3200(Android android, String str) {
                android.setBuildHost(str);
            }

            public static /* synthetic */ void access$3300(Android android) {
                android.clearBuildHost();
            }

            public static /* synthetic */ void access$3400(Android android, ByteString byteString) {
                android.setBuildHostBytes(byteString);
            }

            public static /* synthetic */ void access$3500(Android android, String str) {
                android.setBuildBootloader(str);
            }

            public static /* synthetic */ void access$3600(Android android) {
                android.clearBuildBootloader();
            }

            public static /* synthetic */ void access$3700(Android android, ByteString byteString) {
                android.setBuildBootloaderBytes(byteString);
            }

            public static /* synthetic */ void access$3800(Android android, String str) {
                android.setBuildProduct(str);
            }

            public static /* synthetic */ void access$3900(Android android) {
                android.clearBuildProduct();
            }

            public static /* synthetic */ void access$400(Android android) {
                android.clearVersionCode();
            }

            public static /* synthetic */ void access$4000(Android android, ByteString byteString) {
                android.setBuildProductBytes(byteString);
            }

            public static /* synthetic */ void access$4100(Android android, String str) {
                android.setBuildId(str);
            }

            public static /* synthetic */ void access$4200(Android android) {
                android.clearBuildId();
            }

            public static /* synthetic */ void access$4300(Android android, ByteString byteString) {
                android.setBuildIdBytes(byteString);
            }

            public static /* synthetic */ void access$4400(Android android, int i) {
                android.setExtensionVersion(i);
            }

            public static /* synthetic */ void access$4500(Android android) {
                android.clearExtensionVersion();
            }

            public static /* synthetic */ void access$4600(Android android, int i) {
                android.setPhoneType(i);
            }

            public static /* synthetic */ void access$4700(Android android) {
                android.clearPhoneType();
            }

            public static /* synthetic */ void access$4800(Android android, String str) {
                android.setSimOperator(str);
            }

            public static /* synthetic */ void access$4900(Android android) {
                android.clearSimOperator();
            }

            public static /* synthetic */ void access$500(Android android, String str) {
                android.setAndroidFingerprint(str);
            }

            public static /* synthetic */ void access$5000(Android android, ByteString byteString) {
                android.setSimOperatorBytes(byteString);
            }

            public static /* synthetic */ void access$5100(Android android, long j) {
                android.setTotalDiskSpaceInternal(j);
            }

            public static /* synthetic */ void access$5200(Android android) {
                android.clearTotalDiskSpaceInternal();
            }

            public static /* synthetic */ void access$5300(Android android, int i) {
                android.setDisplayScreenDensity(i);
            }

            public static /* synthetic */ void access$5400(Android android) {
                android.clearDisplayScreenDensity();
            }

            public static /* synthetic */ void access$600(Android android) {
                android.clearAndroidFingerprint();
            }

            public static /* synthetic */ void access$700(Android android, ByteString byteString) {
                android.setAndroidFingerprintBytes(byteString);
            }

            public static /* synthetic */ void access$800(Android android, String str) {
                android.setAppInstaller(str);
            }

            public static /* synthetic */ void access$900(Android android) {
                android.clearAppInstaller();
            }

            private void clearAndroidFingerprint() {
                this.bitField0_ &= -5;
                this.androidFingerprint_ = getDefaultInstance().getAndroidFingerprint();
            }

            private void clearApiLevel() {
                this.bitField0_ &= -2;
                this.apiLevel_ = 0;
            }

            private void clearApkDeveloperSigningCertificateHash() {
                this.bitField0_ &= -17;
                this.apkDeveloperSigningCertificateHash_ = getDefaultInstance().getApkDeveloperSigningCertificateHash();
            }

            private void clearAppInstaller() {
                this.bitField0_ &= -9;
                this.appInstaller_ = getDefaultInstance().getAppInstaller();
            }

            private void clearBuildBoard() {
                this.bitField0_ &= -33;
                this.buildBoard_ = getDefaultInstance().getBuildBoard();
            }

            private void clearBuildBootloader() {
                this.bitField0_ &= -4097;
                this.buildBootloader_ = getDefaultInstance().getBuildBootloader();
            }

            private void clearBuildBrand() {
                this.bitField0_ &= -65;
                this.buildBrand_ = getDefaultInstance().getBuildBrand();
            }

            private void clearBuildDevice() {
                this.bitField0_ &= -129;
                this.buildDevice_ = getDefaultInstance().getBuildDevice();
            }

            private void clearBuildDisplay() {
                this.bitField0_ &= -257;
                this.buildDisplay_ = getDefaultInstance().getBuildDisplay();
            }

            private void clearBuildFingerprint() {
                this.bitField0_ &= -513;
                this.buildFingerprint_ = getDefaultInstance().getBuildFingerprint();
            }

            private void clearBuildHardware() {
                this.bitField0_ &= -1025;
                this.buildHardware_ = getDefaultInstance().getBuildHardware();
            }

            private void clearBuildHost() {
                this.bitField0_ &= -2049;
                this.buildHost_ = getDefaultInstance().getBuildHost();
            }

            private void clearBuildId() {
                this.bitField0_ &= -16385;
                this.buildId_ = getDefaultInstance().getBuildId();
            }

            private void clearBuildProduct() {
                this.bitField0_ &= -8193;
                this.buildProduct_ = getDefaultInstance().getBuildProduct();
            }

            private void clearDisplayScreenDensity() {
                this.bitField0_ &= -524289;
                this.displayScreenDensity_ = 0;
            }

            private void clearExtensionVersion() {
                this.bitField0_ &= -32769;
                this.extensionVersion_ = 0;
            }

            private void clearPhoneType() {
                this.bitField0_ &= -65537;
                this.phoneType_ = 0;
            }

            private void clearSimOperator() {
                this.bitField0_ &= -131073;
                this.simOperator_ = getDefaultInstance().getSimOperator();
            }

            private void clearTotalDiskSpaceInternal() {
                this.bitField0_ &= -262145;
                this.totalDiskSpaceInternal_ = 0L;
            }

            private void clearVersionCode() {
                this.bitField0_ &= -3;
                this.versionCode_ = 0;
            }

            public static Android getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Android parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Android) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Android parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setAndroidFingerprint(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.androidFingerprint_ = str;
            }

            private void setAndroidFingerprintBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.androidFingerprint_ = byteString.toStringUtf8();
                this.bitField0_ |= 4;
            }

            private void setApiLevel(int i) {
                this.bitField0_ |= 1;
                this.apiLevel_ = i;
            }

            private void setApkDeveloperSigningCertificateHash(String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.apkDeveloperSigningCertificateHash_ = str;
            }

            private void setApkDeveloperSigningCertificateHashBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.apkDeveloperSigningCertificateHash_ = byteString.toStringUtf8();
                this.bitField0_ |= 16;
            }

            private void setAppInstaller(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.appInstaller_ = str;
            }

            private void setAppInstallerBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.appInstaller_ = byteString.toStringUtf8();
                this.bitField0_ |= 8;
            }

            private void setBuildBoard(String str) {
                str.getClass();
                this.bitField0_ |= 32;
                this.buildBoard_ = str;
            }

            private void setBuildBoardBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.buildBoard_ = byteString.toStringUtf8();
                this.bitField0_ |= 32;
            }

            private void setBuildBootloader(String str) {
                str.getClass();
                this.bitField0_ |= 4096;
                this.buildBootloader_ = str;
            }

            private void setBuildBootloaderBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.buildBootloader_ = byteString.toStringUtf8();
                this.bitField0_ |= 4096;
            }

            private void setBuildBrand(String str) {
                str.getClass();
                this.bitField0_ |= 64;
                this.buildBrand_ = str;
            }

            private void setBuildBrandBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.buildBrand_ = byteString.toStringUtf8();
                this.bitField0_ |= 64;
            }

            private void setBuildDevice(String str) {
                str.getClass();
                this.bitField0_ |= 128;
                this.buildDevice_ = str;
            }

            private void setBuildDeviceBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.buildDevice_ = byteString.toStringUtf8();
                this.bitField0_ |= 128;
            }

            private void setBuildDisplay(String str) {
                str.getClass();
                this.bitField0_ |= 256;
                this.buildDisplay_ = str;
            }

            private void setBuildDisplayBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.buildDisplay_ = byteString.toStringUtf8();
                this.bitField0_ |= 256;
            }

            private void setBuildFingerprint(String str) {
                str.getClass();
                this.bitField0_ |= 512;
                this.buildFingerprint_ = str;
            }

            private void setBuildFingerprintBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.buildFingerprint_ = byteString.toStringUtf8();
                this.bitField0_ |= 512;
            }

            private void setBuildHardware(String str) {
                str.getClass();
                this.bitField0_ |= 1024;
                this.buildHardware_ = str;
            }

            private void setBuildHardwareBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.buildHardware_ = byteString.toStringUtf8();
                this.bitField0_ |= 1024;
            }

            private void setBuildHost(String str) {
                str.getClass();
                this.bitField0_ |= 2048;
                this.buildHost_ = str;
            }

            private void setBuildHostBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.buildHost_ = byteString.toStringUtf8();
                this.bitField0_ |= 2048;
            }

            private void setBuildId(String str) {
                str.getClass();
                this.bitField0_ |= 16384;
                this.buildId_ = str;
            }

            private void setBuildIdBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.buildId_ = byteString.toStringUtf8();
                this.bitField0_ |= 16384;
            }

            private void setBuildProduct(String str) {
                str.getClass();
                this.bitField0_ |= 8192;
                this.buildProduct_ = str;
            }

            private void setBuildProductBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.buildProduct_ = byteString.toStringUtf8();
                this.bitField0_ |= 8192;
            }

            private void setDisplayScreenDensity(int i) {
                this.bitField0_ |= 524288;
                this.displayScreenDensity_ = i;
            }

            private void setExtensionVersion(int i) {
                this.bitField0_ |= 32768;
                this.extensionVersion_ = i;
            }

            private void setPhoneType(int i) {
                this.bitField0_ |= 65536;
                this.phoneType_ = i;
            }

            private void setSimOperator(String str) {
                str.getClass();
                this.bitField0_ |= 131072;
                this.simOperator_ = str;
            }

            private void setSimOperatorBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.simOperator_ = byteString.toStringUtf8();
                this.bitField0_ |= 131072;
            }

            private void setTotalDiskSpaceInternal(long j) {
                this.bitField0_ |= 262144;
                this.totalDiskSpaceInternal_ = j;
            }

            private void setVersionCode(int i) {
                this.bitField0_ |= 2;
                this.versionCode_ = i;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (a.a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Android();
                    case 2:
                        return new Builder(null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0000\u0001\u0001\u0014\u0014\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bለ\u0007\tለ\b\nለ\t\u000bለ\n\fለ\u000b\rለ\f\u000eለ\r\u000fለ\u000e\u0010ဋ\u000f\u0011င\u0010\u0012ለ\u0011\u0013ဂ\u0012\u0014ဋ\u0013", new Object[]{"bitField0_", "apiLevel_", "versionCode_", "androidFingerprint_", "appInstaller_", "apkDeveloperSigningCertificateHash_", "buildBoard_", "buildBrand_", "buildDevice_", "buildDisplay_", "buildFingerprint_", "buildHardware_", "buildHost_", "buildBootloader_", "buildProduct_", "buildId_", "extensionVersion_", "phoneType_", "simOperator_", "totalDiskSpaceInternal_", "displayScreenDensity_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            synchronized (Android.class) {
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

            public String getAndroidFingerprint() {
                return this.androidFingerprint_;
            }

            public ByteString getAndroidFingerprintBytes() {
                return ByteString.copyFromUtf8(this.androidFingerprint_);
            }

            public int getApiLevel() {
                return this.apiLevel_;
            }

            public String getApkDeveloperSigningCertificateHash() {
                return this.apkDeveloperSigningCertificateHash_;
            }

            public ByteString getApkDeveloperSigningCertificateHashBytes() {
                return ByteString.copyFromUtf8(this.apkDeveloperSigningCertificateHash_);
            }

            public String getAppInstaller() {
                return this.appInstaller_;
            }

            public ByteString getAppInstallerBytes() {
                return ByteString.copyFromUtf8(this.appInstaller_);
            }

            public String getBuildBoard() {
                return this.buildBoard_;
            }

            public ByteString getBuildBoardBytes() {
                return ByteString.copyFromUtf8(this.buildBoard_);
            }

            public String getBuildBootloader() {
                return this.buildBootloader_;
            }

            public ByteString getBuildBootloaderBytes() {
                return ByteString.copyFromUtf8(this.buildBootloader_);
            }

            public String getBuildBrand() {
                return this.buildBrand_;
            }

            public ByteString getBuildBrandBytes() {
                return ByteString.copyFromUtf8(this.buildBrand_);
            }

            public String getBuildDevice() {
                return this.buildDevice_;
            }

            public ByteString getBuildDeviceBytes() {
                return ByteString.copyFromUtf8(this.buildDevice_);
            }

            public String getBuildDisplay() {
                return this.buildDisplay_;
            }

            public ByteString getBuildDisplayBytes() {
                return ByteString.copyFromUtf8(this.buildDisplay_);
            }

            public String getBuildFingerprint() {
                return this.buildFingerprint_;
            }

            public ByteString getBuildFingerprintBytes() {
                return ByteString.copyFromUtf8(this.buildFingerprint_);
            }

            public String getBuildHardware() {
                return this.buildHardware_;
            }

            public ByteString getBuildHardwareBytes() {
                return ByteString.copyFromUtf8(this.buildHardware_);
            }

            public String getBuildHost() {
                return this.buildHost_;
            }

            public ByteString getBuildHostBytes() {
                return ByteString.copyFromUtf8(this.buildHost_);
            }

            public String getBuildId() {
                return this.buildId_;
            }

            public ByteString getBuildIdBytes() {
                return ByteString.copyFromUtf8(this.buildId_);
            }

            public String getBuildProduct() {
                return this.buildProduct_;
            }

            public ByteString getBuildProductBytes() {
                return ByteString.copyFromUtf8(this.buildProduct_);
            }

            public int getDisplayScreenDensity() {
                return this.displayScreenDensity_;
            }

            public int getExtensionVersion() {
                return this.extensionVersion_;
            }

            public int getPhoneType() {
                return this.phoneType_;
            }

            public String getSimOperator() {
                return this.simOperator_;
            }

            public ByteString getSimOperatorBytes() {
                return ByteString.copyFromUtf8(this.simOperator_);
            }

            public long getTotalDiskSpaceInternal() {
                return this.totalDiskSpaceInternal_;
            }

            public int getVersionCode() {
                return this.versionCode_;
            }

            public boolean hasAndroidFingerprint() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasApiLevel() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasApkDeveloperSigningCertificateHash() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasAppInstaller() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasBuildBoard() {
                return (this.bitField0_ & 32) != 0;
            }

            public boolean hasBuildBootloader() {
                return (this.bitField0_ & 4096) != 0;
            }

            public boolean hasBuildBrand() {
                return (this.bitField0_ & 64) != 0;
            }

            public boolean hasBuildDevice() {
                return (this.bitField0_ & 128) != 0;
            }

            public boolean hasBuildDisplay() {
                return (this.bitField0_ & 256) != 0;
            }

            public boolean hasBuildFingerprint() {
                return (this.bitField0_ & 512) != 0;
            }

            public boolean hasBuildHardware() {
                return (this.bitField0_ & 1024) != 0;
            }

            public boolean hasBuildHost() {
                return (this.bitField0_ & 2048) != 0;
            }

            public boolean hasBuildId() {
                return (this.bitField0_ & 16384) != 0;
            }

            public boolean hasBuildProduct() {
                return (this.bitField0_ & 8192) != 0;
            }

            public boolean hasDisplayScreenDensity() {
                return (this.bitField0_ & 524288) != 0;
            }

            public boolean hasExtensionVersion() {
                return (this.bitField0_ & 32768) != 0;
            }

            public boolean hasPhoneType() {
                return (this.bitField0_ & 65536) != 0;
            }

            public boolean hasSimOperator() {
                return (this.bitField0_ & 131072) != 0;
            }

            public boolean hasTotalDiskSpaceInternal() {
                return (this.bitField0_ & 262144) != 0;
            }

            public boolean hasVersionCode() {
                return (this.bitField0_ & 2) != 0;
            }

            public static Builder newBuilder(Android android) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(android);
            }

            public static Android parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Android) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Android parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Android parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Android parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Android parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Android parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Android parseFrom(InputStream inputStream) throws IOException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Android parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Android parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Android parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public interface AndroidOrBuilder extends MessageLiteOrBuilder {
            String getAndroidFingerprint();

            ByteString getAndroidFingerprintBytes();

            int getApiLevel();

            String getApkDeveloperSigningCertificateHash();

            ByteString getApkDeveloperSigningCertificateHashBytes();

            String getAppInstaller();

            ByteString getAppInstallerBytes();

            String getBuildBoard();

            ByteString getBuildBoardBytes();

            String getBuildBootloader();

            ByteString getBuildBootloaderBytes();

            String getBuildBrand();

            ByteString getBuildBrandBytes();

            String getBuildDevice();

            ByteString getBuildDeviceBytes();

            String getBuildDisplay();

            ByteString getBuildDisplayBytes();

            String getBuildFingerprint();

            ByteString getBuildFingerprintBytes();

            String getBuildHardware();

            ByteString getBuildHardwareBytes();

            String getBuildHost();

            ByteString getBuildHostBytes();

            String getBuildId();

            ByteString getBuildIdBytes();

            String getBuildProduct();

            ByteString getBuildProductBytes();

            int getDisplayScreenDensity();

            int getExtensionVersion();

            int getPhoneType();

            String getSimOperator();

            ByteString getSimOperatorBytes();

            long getTotalDiskSpaceInternal();

            int getVersionCode();

            boolean hasAndroidFingerprint();

            boolean hasApiLevel();

            boolean hasApkDeveloperSigningCertificateHash();

            boolean hasAppInstaller();

            boolean hasBuildBoard();

            boolean hasBuildBootloader();

            boolean hasBuildBrand();

            boolean hasBuildDevice();

            boolean hasBuildDisplay();

            boolean hasBuildFingerprint();

            boolean hasBuildHardware();

            boolean hasBuildHost();

            boolean hasBuildId();

            boolean hasBuildProduct();

            boolean hasDisplayScreenDensity();

            boolean hasExtensionVersion();

            boolean hasPhoneType();

            boolean hasSimOperator();

            boolean hasTotalDiskSpaceInternal();

            boolean hasVersionCode();
        }

        public static final class Builder extends GeneratedMessageLite.Builder implements StaticDeviceInfoOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder addAllStores(Iterable iterable) {
                copyOnWrite();
                StaticDeviceInfo.access$12000((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, iterable);
                return this;
            }

            public Builder addStores(String str) {
                copyOnWrite();
                StaticDeviceInfo.access$11900((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder addStoresBytes(ByteString byteString) {
                copyOnWrite();
                StaticDeviceInfo.access$12200((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder clearAndroid() {
                copyOnWrite();
                StaticDeviceInfo.access$13700((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearAppDebuggable() {
                copyOnWrite();
                StaticDeviceInfo.access$9500((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearBundleId() {
                copyOnWrite();
                StaticDeviceInfo.access$8900((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearBundleVersion() {
                copyOnWrite();
                StaticDeviceInfo.access$9200((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearCpuCount() {
                copyOnWrite();
                StaticDeviceInfo.access$13100((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearCpuModel() {
                copyOnWrite();
                StaticDeviceInfo.access$12800((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearDeviceMake() {
                copyOnWrite();
                StaticDeviceInfo.access$10200((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearDeviceModel() {
                copyOnWrite();
                StaticDeviceInfo.access$10500((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearGpuModel() {
                copyOnWrite();
                StaticDeviceInfo.access$13300((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearIos() {
                copyOnWrite();
                StaticDeviceInfo.access$14000((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearMadeWithUnity() {
                copyOnWrite();
                StaticDeviceInfo.access$14200((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearOsVersion() {
                copyOnWrite();
                StaticDeviceInfo.access$9900((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearPlatformSpecific() {
                copyOnWrite();
                StaticDeviceInfo.access$8700((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearRooted() {
                copyOnWrite();
                StaticDeviceInfo.access$9700((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearScreenDensity() {
                copyOnWrite();
                StaticDeviceInfo.access$11100((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearScreenHeight() {
                copyOnWrite();
                StaticDeviceInfo.access$11500((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearScreenSize() {
                copyOnWrite();
                StaticDeviceInfo.access$11700((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearScreenWidth() {
                copyOnWrite();
                StaticDeviceInfo.access$11300((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearStores() {
                copyOnWrite();
                StaticDeviceInfo.access$12100((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTotalDiskSpace() {
                copyOnWrite();
                StaticDeviceInfo.access$12400((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTotalRamMemory() {
                copyOnWrite();
                StaticDeviceInfo.access$12600((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearWebviewUa() {
                copyOnWrite();
                StaticDeviceInfo.access$10800((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Android getAndroid() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getAndroid();
            }

            public boolean getAppDebuggable() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getAppDebuggable();
            }

            public String getBundleId() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getBundleId();
            }

            public ByteString getBundleIdBytes() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getBundleIdBytes();
            }

            public String getBundleVersion() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getBundleVersion();
            }

            public ByteString getBundleVersionBytes() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getBundleVersionBytes();
            }

            public long getCpuCount() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getCpuCount();
            }

            public String getCpuModel() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getCpuModel();
            }

            public ByteString getCpuModelBytes() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getCpuModelBytes();
            }

            public String getDeviceMake() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getDeviceMake();
            }

            public ByteString getDeviceMakeBytes() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getDeviceMakeBytes();
            }

            public String getDeviceModel() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getDeviceModel();
            }

            public ByteString getDeviceModelBytes() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getDeviceModelBytes();
            }

            public String getGpuModel() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getGpuModel();
            }

            public ByteString getGpuModelBytes() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getGpuModelBytes();
            }

            public Ios getIos() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getIos();
            }

            public boolean getMadeWithUnity() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getMadeWithUnity();
            }

            public String getOsVersion() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getOsVersion();
            }

            public ByteString getOsVersionBytes() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getOsVersionBytes();
            }

            public PlatformSpecificCase getPlatformSpecificCase() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getPlatformSpecificCase();
            }

            public boolean getRooted() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getRooted();
            }

            public int getScreenDensity() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getScreenDensity();
            }

            public int getScreenHeight() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getScreenHeight();
            }

            public int getScreenSize() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getScreenSize();
            }

            public int getScreenWidth() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getScreenWidth();
            }

            public String getStores(int i) {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getStores(i);
            }

            public ByteString getStoresBytes(int i) {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getStoresBytes(i);
            }

            public int getStoresCount() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getStoresCount();
            }

            public List getStoresList() {
                return Collections.unmodifiableList(((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getStoresList());
            }

            public long getTotalDiskSpace() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getTotalDiskSpace();
            }

            public long getTotalRamMemory() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getTotalRamMemory();
            }

            public String getWebviewUa() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getWebviewUa();
            }

            public ByteString getWebviewUaBytes() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getWebviewUaBytes();
            }

            public boolean hasAndroid() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasAndroid();
            }

            public boolean hasAppDebuggable() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasAppDebuggable();
            }

            public boolean hasBundleId() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasBundleId();
            }

            public boolean hasBundleVersion() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasBundleVersion();
            }

            public boolean hasCpuCount() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasCpuCount();
            }

            public boolean hasCpuModel() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasCpuModel();
            }

            public boolean hasDeviceMake() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasDeviceMake();
            }

            public boolean hasDeviceModel() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasDeviceModel();
            }

            public boolean hasGpuModel() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasGpuModel();
            }

            public boolean hasIos() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasIos();
            }

            public boolean hasMadeWithUnity() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasMadeWithUnity();
            }

            public boolean hasOsVersion() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasOsVersion();
            }

            public boolean hasRooted() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasRooted();
            }

            public boolean hasScreenDensity() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasScreenDensity();
            }

            public boolean hasScreenHeight() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasScreenHeight();
            }

            public boolean hasScreenSize() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasScreenSize();
            }

            public boolean hasScreenWidth() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasScreenWidth();
            }

            public boolean hasTotalDiskSpace() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasTotalDiskSpace();
            }

            public boolean hasTotalRamMemory() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasTotalRamMemory();
            }

            public boolean hasWebviewUa() {
                return ((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasWebviewUa();
            }

            public Builder mergeAndroid(Android android) {
                copyOnWrite();
                StaticDeviceInfo.access$13600((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, android);
                return this;
            }

            public Builder mergeIos(Ios ios) {
                copyOnWrite();
                StaticDeviceInfo.access$13900((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, ios);
                return this;
            }

            public Builder setAndroid(Android android) {
                copyOnWrite();
                StaticDeviceInfo.access$13500((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, android);
                return this;
            }

            public Builder setAppDebuggable(boolean z) {
                copyOnWrite();
                StaticDeviceInfo.access$9400((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setBundleId(String str) {
                copyOnWrite();
                StaticDeviceInfo.access$8800((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setBundleIdBytes(ByteString byteString) {
                copyOnWrite();
                StaticDeviceInfo.access$9000((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setBundleVersion(String str) {
                copyOnWrite();
                StaticDeviceInfo.access$9100((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setBundleVersionBytes(ByteString byteString) {
                copyOnWrite();
                StaticDeviceInfo.access$9300((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setCpuCount(long j) {
                copyOnWrite();
                StaticDeviceInfo.access$13000((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, j);
                return this;
            }

            public Builder setCpuModel(String str) {
                copyOnWrite();
                StaticDeviceInfo.access$12700((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setCpuModelBytes(ByteString byteString) {
                copyOnWrite();
                StaticDeviceInfo.access$12900((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setDeviceMake(String str) {
                copyOnWrite();
                StaticDeviceInfo.access$10100((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setDeviceMakeBytes(ByteString byteString) {
                copyOnWrite();
                StaticDeviceInfo.access$10300((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setDeviceModel(String str) {
                copyOnWrite();
                StaticDeviceInfo.access$10400((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setDeviceModelBytes(ByteString byteString) {
                copyOnWrite();
                StaticDeviceInfo.access$10600((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setGpuModel(String str) {
                copyOnWrite();
                StaticDeviceInfo.access$13200((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setGpuModelBytes(ByteString byteString) {
                copyOnWrite();
                StaticDeviceInfo.access$13400((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setIos(Ios ios) {
                copyOnWrite();
                StaticDeviceInfo.access$13800((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, ios);
                return this;
            }

            public Builder setMadeWithUnity(boolean z) {
                copyOnWrite();
                StaticDeviceInfo.access$14100((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setOsVersion(String str) {
                copyOnWrite();
                StaticDeviceInfo.access$9800((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setOsVersionBytes(ByteString byteString) {
                copyOnWrite();
                StaticDeviceInfo.access$10000((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setRooted(boolean z) {
                copyOnWrite();
                StaticDeviceInfo.access$9600((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setScreenDensity(int i) {
                copyOnWrite();
                StaticDeviceInfo.access$11000((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setScreenHeight(int i) {
                copyOnWrite();
                StaticDeviceInfo.access$11400((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setScreenSize(int i) {
                copyOnWrite();
                StaticDeviceInfo.access$11600((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setScreenWidth(int i) {
                copyOnWrite();
                StaticDeviceInfo.access$11200((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setStores(int i, String str) {
                copyOnWrite();
                StaticDeviceInfo.access$11800((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, i, str);
                return this;
            }

            public Builder setTotalDiskSpace(long j) {
                copyOnWrite();
                StaticDeviceInfo.access$12300((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, j);
                return this;
            }

            public Builder setTotalRamMemory(long j) {
                copyOnWrite();
                StaticDeviceInfo.access$12500((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, j);
                return this;
            }

            public Builder setWebviewUa(String str) {
                copyOnWrite();
                StaticDeviceInfo.access$10700((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setWebviewUaBytes(ByteString byteString) {
                copyOnWrite();
                StaticDeviceInfo.access$10900((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            private Builder() {
                super(StaticDeviceInfo.access$8600());
            }

            public Builder setAndroid(Android.Builder builder) {
                copyOnWrite();
                StaticDeviceInfo.access$13500((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, (Android) builder.build());
                return this;
            }

            public Builder setIos(Ios.Builder builder) {
                copyOnWrite();
                StaticDeviceInfo.access$13800((StaticDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, (Ios) builder.build());
                return this;
            }
        }

        public static final class Ios extends GeneratedMessageLite implements IosOrBuilder {
            public static final int BUILT_SDK_VERSION_FIELD_NUMBER = 3;
            public static final int BUNDLE_VERSION_FULL_FIELD_NUMBER = 10;
            public static final int CAN_MAKE_PAYMENTS_FIELD_NUMBER = 6;
            private static final Ios DEFAULT_INSTANCE;
            private static volatile Parser PARSER = null;
            public static final int SCREEN_SCALE_FIELD_NUMBER = 5;
            public static final int SIMULATOR_FIELD_NUMBER = 2;
            public static final int SKADNETWORK_ID_FIELD_NUMBER = 4;
            public static final int SYSTEM_BOOT_TIME_FIELD_NUMBER = 1;
            public static final int XCODE_BUILD_VERSION_FIELD_NUMBER = 8;
            public static final int XCODE_SDK_BUILD_VERSION_FIELD_NUMBER = 9;
            public static final int XCODE_VERSION_FIELD_NUMBER = 7;
            private int bitField0_;
            private boolean canMakePayments_;
            private int screenScale_;
            private boolean simulator_;
            private long systemBootTime_;
            private String builtSdkVersion_ = "";
            private Internal.ProtobufList skadnetworkId_ = GeneratedMessageLite.emptyProtobufList();
            private String xcodeVersion_ = "";
            private String xcodeBuildVersion_ = "";
            private String xcodeSdkBuildVersion_ = "";
            private String bundleVersionFull_ = "";

            public static final class Builder extends GeneratedMessageLite.Builder implements IosOrBuilder {
                public /* synthetic */ Builder(a aVar) {
                    this();
                }

                public Builder addAllSkadnetworkId(Iterable iterable) {
                    copyOnWrite();
                    Ios.access$6600((Ios) ((GeneratedMessageLite.Builder) this).instance, iterable);
                    return this;
                }

                public Builder addSkadnetworkId(String str) {
                    copyOnWrite();
                    Ios.access$6500((Ios) ((GeneratedMessageLite.Builder) this).instance, str);
                    return this;
                }

                public Builder addSkadnetworkIdBytes(ByteString byteString) {
                    copyOnWrite();
                    Ios.access$6800((Ios) ((GeneratedMessageLite.Builder) this).instance, byteString);
                    return this;
                }

                public Builder clearBuiltSdkVersion() {
                    copyOnWrite();
                    Ios.access$6200((Ios) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearBundleVersionFull() {
                    copyOnWrite();
                    Ios.access$8300((Ios) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearCanMakePayments() {
                    copyOnWrite();
                    Ios.access$7200((Ios) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearScreenScale() {
                    copyOnWrite();
                    Ios.access$7000((Ios) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearSimulator() {
                    copyOnWrite();
                    Ios.access$6000((Ios) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearSkadnetworkId() {
                    copyOnWrite();
                    Ios.access$6700((Ios) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearSystemBootTime() {
                    copyOnWrite();
                    Ios.access$5800((Ios) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearXcodeBuildVersion() {
                    copyOnWrite();
                    Ios.access$7700((Ios) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearXcodeSdkBuildVersion() {
                    copyOnWrite();
                    Ios.access$8000((Ios) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearXcodeVersion() {
                    copyOnWrite();
                    Ios.access$7400((Ios) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public String getBuiltSdkVersion() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getBuiltSdkVersion();
                }

                public ByteString getBuiltSdkVersionBytes() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getBuiltSdkVersionBytes();
                }

                public String getBundleVersionFull() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getBundleVersionFull();
                }

                public ByteString getBundleVersionFullBytes() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getBundleVersionFullBytes();
                }

                public boolean getCanMakePayments() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getCanMakePayments();
                }

                public int getScreenScale() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getScreenScale();
                }

                public boolean getSimulator() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getSimulator();
                }

                public String getSkadnetworkId(int i) {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getSkadnetworkId(i);
                }

                public ByteString getSkadnetworkIdBytes(int i) {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getSkadnetworkIdBytes(i);
                }

                public int getSkadnetworkIdCount() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getSkadnetworkIdCount();
                }

                public List getSkadnetworkIdList() {
                    return Collections.unmodifiableList(((Ios) ((GeneratedMessageLite.Builder) this).instance).getSkadnetworkIdList());
                }

                public long getSystemBootTime() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getSystemBootTime();
                }

                public String getXcodeBuildVersion() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getXcodeBuildVersion();
                }

                public ByteString getXcodeBuildVersionBytes() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getXcodeBuildVersionBytes();
                }

                public String getXcodeSdkBuildVersion() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getXcodeSdkBuildVersion();
                }

                public ByteString getXcodeSdkBuildVersionBytes() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getXcodeSdkBuildVersionBytes();
                }

                public String getXcodeVersion() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getXcodeVersion();
                }

                public ByteString getXcodeVersionBytes() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getXcodeVersionBytes();
                }

                public boolean hasBuiltSdkVersion() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).hasBuiltSdkVersion();
                }

                public boolean hasBundleVersionFull() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).hasBundleVersionFull();
                }

                public boolean hasCanMakePayments() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).hasCanMakePayments();
                }

                public boolean hasScreenScale() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).hasScreenScale();
                }

                public boolean hasSimulator() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).hasSimulator();
                }

                public boolean hasSystemBootTime() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).hasSystemBootTime();
                }

                public boolean hasXcodeBuildVersion() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).hasXcodeBuildVersion();
                }

                public boolean hasXcodeSdkBuildVersion() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).hasXcodeSdkBuildVersion();
                }

                public boolean hasXcodeVersion() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).hasXcodeVersion();
                }

                public Builder setBuiltSdkVersion(String str) {
                    copyOnWrite();
                    Ios.access$6100((Ios) ((GeneratedMessageLite.Builder) this).instance, str);
                    return this;
                }

                public Builder setBuiltSdkVersionBytes(ByteString byteString) {
                    copyOnWrite();
                    Ios.access$6300((Ios) ((GeneratedMessageLite.Builder) this).instance, byteString);
                    return this;
                }

                public Builder setBundleVersionFull(String str) {
                    copyOnWrite();
                    Ios.access$8200((Ios) ((GeneratedMessageLite.Builder) this).instance, str);
                    return this;
                }

                public Builder setBundleVersionFullBytes(ByteString byteString) {
                    copyOnWrite();
                    Ios.access$8400((Ios) ((GeneratedMessageLite.Builder) this).instance, byteString);
                    return this;
                }

                public Builder setCanMakePayments(boolean z) {
                    copyOnWrite();
                    Ios.access$7100((Ios) ((GeneratedMessageLite.Builder) this).instance, z);
                    return this;
                }

                public Builder setScreenScale(int i) {
                    copyOnWrite();
                    Ios.access$6900((Ios) ((GeneratedMessageLite.Builder) this).instance, i);
                    return this;
                }

                public Builder setSimulator(boolean z) {
                    copyOnWrite();
                    Ios.access$5900((Ios) ((GeneratedMessageLite.Builder) this).instance, z);
                    return this;
                }

                public Builder setSkadnetworkId(int i, String str) {
                    copyOnWrite();
                    Ios.access$6400((Ios) ((GeneratedMessageLite.Builder) this).instance, i, str);
                    return this;
                }

                public Builder setSystemBootTime(long j) {
                    copyOnWrite();
                    Ios.access$5700((Ios) ((GeneratedMessageLite.Builder) this).instance, j);
                    return this;
                }

                public Builder setXcodeBuildVersion(String str) {
                    copyOnWrite();
                    Ios.access$7600((Ios) ((GeneratedMessageLite.Builder) this).instance, str);
                    return this;
                }

                public Builder setXcodeBuildVersionBytes(ByteString byteString) {
                    copyOnWrite();
                    Ios.access$7800((Ios) ((GeneratedMessageLite.Builder) this).instance, byteString);
                    return this;
                }

                public Builder setXcodeSdkBuildVersion(String str) {
                    copyOnWrite();
                    Ios.access$7900((Ios) ((GeneratedMessageLite.Builder) this).instance, str);
                    return this;
                }

                public Builder setXcodeSdkBuildVersionBytes(ByteString byteString) {
                    copyOnWrite();
                    Ios.access$8100((Ios) ((GeneratedMessageLite.Builder) this).instance, byteString);
                    return this;
                }

                public Builder setXcodeVersion(String str) {
                    copyOnWrite();
                    Ios.access$7300((Ios) ((GeneratedMessageLite.Builder) this).instance, str);
                    return this;
                }

                public Builder setXcodeVersionBytes(ByteString byteString) {
                    copyOnWrite();
                    Ios.access$7500((Ios) ((GeneratedMessageLite.Builder) this).instance, byteString);
                    return this;
                }

                private Builder() {
                    super(Ios.access$5600());
                }
            }

            static {
                Ios ios = new Ios();
                DEFAULT_INSTANCE = ios;
                GeneratedMessageLite.registerDefaultInstance(Ios.class, ios);
            }

            private Ios() {
            }

            public static /* synthetic */ Ios access$5600() {
                return DEFAULT_INSTANCE;
            }

            public static /* synthetic */ void access$5700(Ios ios, long j) {
                ios.setSystemBootTime(j);
            }

            public static /* synthetic */ void access$5800(Ios ios) {
                ios.clearSystemBootTime();
            }

            public static /* synthetic */ void access$5900(Ios ios, boolean z) {
                ios.setSimulator(z);
            }

            public static /* synthetic */ void access$6000(Ios ios) {
                ios.clearSimulator();
            }

            public static /* synthetic */ void access$6100(Ios ios, String str) {
                ios.setBuiltSdkVersion(str);
            }

            public static /* synthetic */ void access$6200(Ios ios) {
                ios.clearBuiltSdkVersion();
            }

            public static /* synthetic */ void access$6300(Ios ios, ByteString byteString) {
                ios.setBuiltSdkVersionBytes(byteString);
            }

            public static /* synthetic */ void access$6400(Ios ios, int i, String str) {
                ios.setSkadnetworkId(i, str);
            }

            public static /* synthetic */ void access$6500(Ios ios, String str) {
                ios.addSkadnetworkId(str);
            }

            public static /* synthetic */ void access$6600(Ios ios, Iterable iterable) {
                ios.addAllSkadnetworkId(iterable);
            }

            public static /* synthetic */ void access$6700(Ios ios) {
                ios.clearSkadnetworkId();
            }

            public static /* synthetic */ void access$6800(Ios ios, ByteString byteString) {
                ios.addSkadnetworkIdBytes(byteString);
            }

            public static /* synthetic */ void access$6900(Ios ios, int i) {
                ios.setScreenScale(i);
            }

            public static /* synthetic */ void access$7000(Ios ios) {
                ios.clearScreenScale();
            }

            public static /* synthetic */ void access$7100(Ios ios, boolean z) {
                ios.setCanMakePayments(z);
            }

            public static /* synthetic */ void access$7200(Ios ios) {
                ios.clearCanMakePayments();
            }

            public static /* synthetic */ void access$7300(Ios ios, String str) {
                ios.setXcodeVersion(str);
            }

            public static /* synthetic */ void access$7400(Ios ios) {
                ios.clearXcodeVersion();
            }

            public static /* synthetic */ void access$7500(Ios ios, ByteString byteString) {
                ios.setXcodeVersionBytes(byteString);
            }

            public static /* synthetic */ void access$7600(Ios ios, String str) {
                ios.setXcodeBuildVersion(str);
            }

            public static /* synthetic */ void access$7700(Ios ios) {
                ios.clearXcodeBuildVersion();
            }

            public static /* synthetic */ void access$7800(Ios ios, ByteString byteString) {
                ios.setXcodeBuildVersionBytes(byteString);
            }

            public static /* synthetic */ void access$7900(Ios ios, String str) {
                ios.setXcodeSdkBuildVersion(str);
            }

            public static /* synthetic */ void access$8000(Ios ios) {
                ios.clearXcodeSdkBuildVersion();
            }

            public static /* synthetic */ void access$8100(Ios ios, ByteString byteString) {
                ios.setXcodeSdkBuildVersionBytes(byteString);
            }

            public static /* synthetic */ void access$8200(Ios ios, String str) {
                ios.setBundleVersionFull(str);
            }

            public static /* synthetic */ void access$8300(Ios ios) {
                ios.clearBundleVersionFull();
            }

            public static /* synthetic */ void access$8400(Ios ios, ByteString byteString) {
                ios.setBundleVersionFullBytes(byteString);
            }

            private void addAllSkadnetworkId(Iterable iterable) {
                ensureSkadnetworkIdIsMutable();
                AbstractMessageLite.addAll(iterable, this.skadnetworkId_);
            }

            private void addSkadnetworkId(String str) {
                str.getClass();
                ensureSkadnetworkIdIsMutable();
                this.skadnetworkId_.add(str);
            }

            private void addSkadnetworkIdBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                ensureSkadnetworkIdIsMutable();
                this.skadnetworkId_.add(byteString.toStringUtf8());
            }

            private void clearBuiltSdkVersion() {
                this.bitField0_ &= -5;
                this.builtSdkVersion_ = getDefaultInstance().getBuiltSdkVersion();
            }

            private void clearBundleVersionFull() {
                this.bitField0_ &= -257;
                this.bundleVersionFull_ = getDefaultInstance().getBundleVersionFull();
            }

            private void clearCanMakePayments() {
                this.bitField0_ &= -17;
                this.canMakePayments_ = false;
            }

            private void clearScreenScale() {
                this.bitField0_ &= -9;
                this.screenScale_ = 0;
            }

            private void clearSimulator() {
                this.bitField0_ &= -3;
                this.simulator_ = false;
            }

            private void clearSkadnetworkId() {
                this.skadnetworkId_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearSystemBootTime() {
                this.bitField0_ &= -2;
                this.systemBootTime_ = 0L;
            }

            private void clearXcodeBuildVersion() {
                this.bitField0_ &= -65;
                this.xcodeBuildVersion_ = getDefaultInstance().getXcodeBuildVersion();
            }

            private void clearXcodeSdkBuildVersion() {
                this.bitField0_ &= -129;
                this.xcodeSdkBuildVersion_ = getDefaultInstance().getXcodeSdkBuildVersion();
            }

            private void clearXcodeVersion() {
                this.bitField0_ &= -33;
                this.xcodeVersion_ = getDefaultInstance().getXcodeVersion();
            }

            private void ensureSkadnetworkIdIsMutable() {
                Internal.ProtobufList protobufList = this.skadnetworkId_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.skadnetworkId_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static Ios getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Ios parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Ios) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Ios parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setBuiltSdkVersion(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.builtSdkVersion_ = str;
            }

            private void setBuiltSdkVersionBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.builtSdkVersion_ = byteString.toStringUtf8();
                this.bitField0_ |= 4;
            }

            private void setBundleVersionFull(String str) {
                str.getClass();
                this.bitField0_ |= 256;
                this.bundleVersionFull_ = str;
            }

            private void setBundleVersionFullBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.bundleVersionFull_ = byteString.toStringUtf8();
                this.bitField0_ |= 256;
            }

            private void setCanMakePayments(boolean z) {
                this.bitField0_ |= 16;
                this.canMakePayments_ = z;
            }

            private void setScreenScale(int i) {
                this.bitField0_ |= 8;
                this.screenScale_ = i;
            }

            private void setSimulator(boolean z) {
                this.bitField0_ |= 2;
                this.simulator_ = z;
            }

            private void setSkadnetworkId(int i, String str) {
                str.getClass();
                ensureSkadnetworkIdIsMutable();
                this.skadnetworkId_.set(i, str);
            }

            private void setSystemBootTime(long j) {
                this.bitField0_ |= 1;
                this.systemBootTime_ = j;
            }

            private void setXcodeBuildVersion(String str) {
                str.getClass();
                this.bitField0_ |= 64;
                this.xcodeBuildVersion_ = str;
            }

            private void setXcodeBuildVersionBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.xcodeBuildVersion_ = byteString.toStringUtf8();
                this.bitField0_ |= 64;
            }

            private void setXcodeSdkBuildVersion(String str) {
                str.getClass();
                this.bitField0_ |= 128;
                this.xcodeSdkBuildVersion_ = str;
            }

            private void setXcodeSdkBuildVersionBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.xcodeSdkBuildVersion_ = byteString.toStringUtf8();
                this.bitField0_ |= 128;
            }

            private void setXcodeVersion(String str) {
                str.getClass();
                this.bitField0_ |= 32;
                this.xcodeVersion_ = str;
            }

            private void setXcodeVersionBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.xcodeVersion_ = byteString.toStringUtf8();
                this.bitField0_ |= 32;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (a.a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Ios();
                    case 2:
                        return new Builder(null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ለ\u0002\u0004Ț\u0005ဋ\u0003\u0006ဇ\u0004\u0007ለ\u0005\bለ\u0006\tለ\u0007\nለ\b", new Object[]{"bitField0_", "systemBootTime_", "simulator_", "builtSdkVersion_", "skadnetworkId_", "screenScale_", "canMakePayments_", "xcodeVersion_", "xcodeBuildVersion_", "xcodeSdkBuildVersion_", "bundleVersionFull_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            synchronized (Ios.class) {
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

            public String getBuiltSdkVersion() {
                return this.builtSdkVersion_;
            }

            public ByteString getBuiltSdkVersionBytes() {
                return ByteString.copyFromUtf8(this.builtSdkVersion_);
            }

            public String getBundleVersionFull() {
                return this.bundleVersionFull_;
            }

            public ByteString getBundleVersionFullBytes() {
                return ByteString.copyFromUtf8(this.bundleVersionFull_);
            }

            public boolean getCanMakePayments() {
                return this.canMakePayments_;
            }

            public int getScreenScale() {
                return this.screenScale_;
            }

            public boolean getSimulator() {
                return this.simulator_;
            }

            public String getSkadnetworkId(int i) {
                return (String) this.skadnetworkId_.get(i);
            }

            public ByteString getSkadnetworkIdBytes(int i) {
                return ByteString.copyFromUtf8((String) this.skadnetworkId_.get(i));
            }

            public int getSkadnetworkIdCount() {
                return this.skadnetworkId_.size();
            }

            public List getSkadnetworkIdList() {
                return this.skadnetworkId_;
            }

            public long getSystemBootTime() {
                return this.systemBootTime_;
            }

            public String getXcodeBuildVersion() {
                return this.xcodeBuildVersion_;
            }

            public ByteString getXcodeBuildVersionBytes() {
                return ByteString.copyFromUtf8(this.xcodeBuildVersion_);
            }

            public String getXcodeSdkBuildVersion() {
                return this.xcodeSdkBuildVersion_;
            }

            public ByteString getXcodeSdkBuildVersionBytes() {
                return ByteString.copyFromUtf8(this.xcodeSdkBuildVersion_);
            }

            public String getXcodeVersion() {
                return this.xcodeVersion_;
            }

            public ByteString getXcodeVersionBytes() {
                return ByteString.copyFromUtf8(this.xcodeVersion_);
            }

            public boolean hasBuiltSdkVersion() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasBundleVersionFull() {
                return (this.bitField0_ & 256) != 0;
            }

            public boolean hasCanMakePayments() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasScreenScale() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasSimulator() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasSystemBootTime() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasXcodeBuildVersion() {
                return (this.bitField0_ & 64) != 0;
            }

            public boolean hasXcodeSdkBuildVersion() {
                return (this.bitField0_ & 128) != 0;
            }

            public boolean hasXcodeVersion() {
                return (this.bitField0_ & 32) != 0;
            }

            public static Builder newBuilder(Ios ios) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(ios);
            }

            public static Ios parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Ios) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Ios parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Ios parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Ios parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Ios parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Ios parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Ios parseFrom(InputStream inputStream) throws IOException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Ios parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Ios parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Ios parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public interface IosOrBuilder extends MessageLiteOrBuilder {
            String getBuiltSdkVersion();

            ByteString getBuiltSdkVersionBytes();

            String getBundleVersionFull();

            ByteString getBundleVersionFullBytes();

            boolean getCanMakePayments();

            int getScreenScale();

            boolean getSimulator();

            String getSkadnetworkId(int i);

            ByteString getSkadnetworkIdBytes(int i);

            int getSkadnetworkIdCount();

            List getSkadnetworkIdList();

            long getSystemBootTime();

            String getXcodeBuildVersion();

            ByteString getXcodeBuildVersionBytes();

            String getXcodeSdkBuildVersion();

            ByteString getXcodeSdkBuildVersionBytes();

            String getXcodeVersion();

            ByteString getXcodeVersionBytes();

            boolean hasBuiltSdkVersion();

            boolean hasBundleVersionFull();

            boolean hasCanMakePayments();

            boolean hasScreenScale();

            boolean hasSimulator();

            boolean hasSystemBootTime();

            boolean hasXcodeBuildVersion();

            boolean hasXcodeSdkBuildVersion();

            boolean hasXcodeVersion();
        }

        public enum PlatformSpecificCase {
            ANDROID(19),
            IOS(20),
            PLATFORMSPECIFIC_NOT_SET(0);

            private final int value;

            PlatformSpecificCase(int i) {
                this.value = i;
            }

            public static PlatformSpecificCase forNumber(int i) {
                if (i == 0) {
                    return PLATFORMSPECIFIC_NOT_SET;
                }
                if (i == 19) {
                    return ANDROID;
                }
                if (i != 20) {
                    return null;
                }
                return IOS;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static PlatformSpecificCase valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            StaticDeviceInfo staticDeviceInfo = new StaticDeviceInfo();
            DEFAULT_INSTANCE = staticDeviceInfo;
            GeneratedMessageLite.registerDefaultInstance(StaticDeviceInfo.class, staticDeviceInfo);
        }

        private StaticDeviceInfo() {
        }

        public static /* synthetic */ void access$10000(StaticDeviceInfo staticDeviceInfo, ByteString byteString) {
            staticDeviceInfo.setOsVersionBytes(byteString);
        }

        public static /* synthetic */ void access$10100(StaticDeviceInfo staticDeviceInfo, String str) {
            staticDeviceInfo.setDeviceMake(str);
        }

        public static /* synthetic */ void access$10200(StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.clearDeviceMake();
        }

        public static /* synthetic */ void access$10300(StaticDeviceInfo staticDeviceInfo, ByteString byteString) {
            staticDeviceInfo.setDeviceMakeBytes(byteString);
        }

        public static /* synthetic */ void access$10400(StaticDeviceInfo staticDeviceInfo, String str) {
            staticDeviceInfo.setDeviceModel(str);
        }

        public static /* synthetic */ void access$10500(StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.clearDeviceModel();
        }

        public static /* synthetic */ void access$10600(StaticDeviceInfo staticDeviceInfo, ByteString byteString) {
            staticDeviceInfo.setDeviceModelBytes(byteString);
        }

        public static /* synthetic */ void access$10700(StaticDeviceInfo staticDeviceInfo, String str) {
            staticDeviceInfo.setWebviewUa(str);
        }

        public static /* synthetic */ void access$10800(StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.clearWebviewUa();
        }

        public static /* synthetic */ void access$10900(StaticDeviceInfo staticDeviceInfo, ByteString byteString) {
            staticDeviceInfo.setWebviewUaBytes(byteString);
        }

        public static /* synthetic */ void access$11000(StaticDeviceInfo staticDeviceInfo, int i) {
            staticDeviceInfo.setScreenDensity(i);
        }

        public static /* synthetic */ void access$11100(StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.clearScreenDensity();
        }

        public static /* synthetic */ void access$11200(StaticDeviceInfo staticDeviceInfo, int i) {
            staticDeviceInfo.setScreenWidth(i);
        }

        public static /* synthetic */ void access$11300(StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.clearScreenWidth();
        }

        public static /* synthetic */ void access$11400(StaticDeviceInfo staticDeviceInfo, int i) {
            staticDeviceInfo.setScreenHeight(i);
        }

        public static /* synthetic */ void access$11500(StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.clearScreenHeight();
        }

        public static /* synthetic */ void access$11600(StaticDeviceInfo staticDeviceInfo, int i) {
            staticDeviceInfo.setScreenSize(i);
        }

        public static /* synthetic */ void access$11700(StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.clearScreenSize();
        }

        public static /* synthetic */ void access$11800(StaticDeviceInfo staticDeviceInfo, int i, String str) {
            staticDeviceInfo.setStores(i, str);
        }

        public static /* synthetic */ void access$11900(StaticDeviceInfo staticDeviceInfo, String str) {
            staticDeviceInfo.addStores(str);
        }

        public static /* synthetic */ void access$12000(StaticDeviceInfo staticDeviceInfo, Iterable iterable) {
            staticDeviceInfo.addAllStores(iterable);
        }

        public static /* synthetic */ void access$12100(StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.clearStores();
        }

        public static /* synthetic */ void access$12200(StaticDeviceInfo staticDeviceInfo, ByteString byteString) {
            staticDeviceInfo.addStoresBytes(byteString);
        }

        public static /* synthetic */ void access$12300(StaticDeviceInfo staticDeviceInfo, long j) {
            staticDeviceInfo.setTotalDiskSpace(j);
        }

        public static /* synthetic */ void access$12400(StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.clearTotalDiskSpace();
        }

        public static /* synthetic */ void access$12500(StaticDeviceInfo staticDeviceInfo, long j) {
            staticDeviceInfo.setTotalRamMemory(j);
        }

        public static /* synthetic */ void access$12600(StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.clearTotalRamMemory();
        }

        public static /* synthetic */ void access$12700(StaticDeviceInfo staticDeviceInfo, String str) {
            staticDeviceInfo.setCpuModel(str);
        }

        public static /* synthetic */ void access$12800(StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.clearCpuModel();
        }

        public static /* synthetic */ void access$12900(StaticDeviceInfo staticDeviceInfo, ByteString byteString) {
            staticDeviceInfo.setCpuModelBytes(byteString);
        }

        public static /* synthetic */ void access$13000(StaticDeviceInfo staticDeviceInfo, long j) {
            staticDeviceInfo.setCpuCount(j);
        }

        public static /* synthetic */ void access$13100(StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.clearCpuCount();
        }

        public static /* synthetic */ void access$13200(StaticDeviceInfo staticDeviceInfo, String str) {
            staticDeviceInfo.setGpuModel(str);
        }

        public static /* synthetic */ void access$13300(StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.clearGpuModel();
        }

        public static /* synthetic */ void access$13400(StaticDeviceInfo staticDeviceInfo, ByteString byteString) {
            staticDeviceInfo.setGpuModelBytes(byteString);
        }

        public static /* synthetic */ void access$13500(StaticDeviceInfo staticDeviceInfo, Android android) {
            staticDeviceInfo.setAndroid(android);
        }

        public static /* synthetic */ void access$13600(StaticDeviceInfo staticDeviceInfo, Android android) {
            staticDeviceInfo.mergeAndroid(android);
        }

        public static /* synthetic */ void access$13700(StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.clearAndroid();
        }

        public static /* synthetic */ void access$13800(StaticDeviceInfo staticDeviceInfo, Ios ios) {
            staticDeviceInfo.setIos(ios);
        }

        public static /* synthetic */ void access$13900(StaticDeviceInfo staticDeviceInfo, Ios ios) {
            staticDeviceInfo.mergeIos(ios);
        }

        public static /* synthetic */ void access$14000(StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.clearIos();
        }

        public static /* synthetic */ void access$14100(StaticDeviceInfo staticDeviceInfo, boolean z) {
            staticDeviceInfo.setMadeWithUnity(z);
        }

        public static /* synthetic */ void access$14200(StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.clearMadeWithUnity();
        }

        public static /* synthetic */ StaticDeviceInfo access$8600() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$8700(StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.clearPlatformSpecific();
        }

        public static /* synthetic */ void access$8800(StaticDeviceInfo staticDeviceInfo, String str) {
            staticDeviceInfo.setBundleId(str);
        }

        public static /* synthetic */ void access$8900(StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.clearBundleId();
        }

        public static /* synthetic */ void access$9000(StaticDeviceInfo staticDeviceInfo, ByteString byteString) {
            staticDeviceInfo.setBundleIdBytes(byteString);
        }

        public static /* synthetic */ void access$9100(StaticDeviceInfo staticDeviceInfo, String str) {
            staticDeviceInfo.setBundleVersion(str);
        }

        public static /* synthetic */ void access$9200(StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.clearBundleVersion();
        }

        public static /* synthetic */ void access$9300(StaticDeviceInfo staticDeviceInfo, ByteString byteString) {
            staticDeviceInfo.setBundleVersionBytes(byteString);
        }

        public static /* synthetic */ void access$9400(StaticDeviceInfo staticDeviceInfo, boolean z) {
            staticDeviceInfo.setAppDebuggable(z);
        }

        public static /* synthetic */ void access$9500(StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.clearAppDebuggable();
        }

        public static /* synthetic */ void access$9600(StaticDeviceInfo staticDeviceInfo, boolean z) {
            staticDeviceInfo.setRooted(z);
        }

        public static /* synthetic */ void access$9700(StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.clearRooted();
        }

        public static /* synthetic */ void access$9800(StaticDeviceInfo staticDeviceInfo, String str) {
            staticDeviceInfo.setOsVersion(str);
        }

        public static /* synthetic */ void access$9900(StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.clearOsVersion();
        }

        private void addAllStores(Iterable iterable) {
            ensureStoresIsMutable();
            AbstractMessageLite.addAll(iterable, this.stores_);
        }

        private void addStores(String str) {
            str.getClass();
            ensureStoresIsMutable();
            this.stores_.add(str);
        }

        private void addStoresBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureStoresIsMutable();
            this.stores_.add(byteString.toStringUtf8());
        }

        private void clearAndroid() {
            if (this.platformSpecificCase_ == 19) {
                this.platformSpecificCase_ = 0;
                this.platformSpecific_ = null;
            }
        }

        private void clearAppDebuggable() {
            this.bitField0_ &= -5;
            this.appDebuggable_ = false;
        }

        private void clearBundleId() {
            this.bitField0_ &= -2;
            this.bundleId_ = getDefaultInstance().getBundleId();
        }

        private void clearBundleVersion() {
            this.bitField0_ &= -3;
            this.bundleVersion_ = getDefaultInstance().getBundleVersion();
        }

        private void clearCpuCount() {
            this.bitField0_ &= -32769;
            this.cpuCount_ = 0L;
        }

        private void clearCpuModel() {
            this.bitField0_ &= -16385;
            this.cpuModel_ = getDefaultInstance().getCpuModel();
        }

        private void clearDeviceMake() {
            this.bitField0_ &= -33;
            this.deviceMake_ = getDefaultInstance().getDeviceMake();
        }

        private void clearDeviceModel() {
            this.bitField0_ &= -65;
            this.deviceModel_ = getDefaultInstance().getDeviceModel();
        }

        private void clearGpuModel() {
            this.bitField0_ &= -65537;
            this.gpuModel_ = getDefaultInstance().getGpuModel();
        }

        private void clearIos() {
            if (this.platformSpecificCase_ == 20) {
                this.platformSpecificCase_ = 0;
                this.platformSpecific_ = null;
            }
        }

        private void clearMadeWithUnity() {
            this.bitField0_ &= -131073;
            this.madeWithUnity_ = false;
        }

        private void clearOsVersion() {
            this.bitField0_ &= -17;
            this.osVersion_ = getDefaultInstance().getOsVersion();
        }

        private void clearPlatformSpecific() {
            this.platformSpecificCase_ = 0;
            this.platformSpecific_ = null;
        }

        private void clearRooted() {
            this.bitField0_ &= -9;
            this.rooted_ = false;
        }

        private void clearScreenDensity() {
            this.bitField0_ &= -257;
            this.screenDensity_ = 0;
        }

        private void clearScreenHeight() {
            this.bitField0_ &= -1025;
            this.screenHeight_ = 0;
        }

        private void clearScreenSize() {
            this.bitField0_ &= -2049;
            this.screenSize_ = 0;
        }

        private void clearScreenWidth() {
            this.bitField0_ &= -513;
            this.screenWidth_ = 0;
        }

        private void clearStores() {
            this.stores_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearTotalDiskSpace() {
            this.bitField0_ &= -4097;
            this.totalDiskSpace_ = 0L;
        }

        private void clearTotalRamMemory() {
            this.bitField0_ &= -8193;
            this.totalRamMemory_ = 0L;
        }

        private void clearWebviewUa() {
            this.bitField0_ &= -129;
            this.webviewUa_ = getDefaultInstance().getWebviewUa();
        }

        private void ensureStoresIsMutable() {
            Internal.ProtobufList protobufList = this.stores_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.stores_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static StaticDeviceInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeAndroid(Android android) {
            android.getClass();
            if (this.platformSpecificCase_ != 19 || this.platformSpecific_ == Android.getDefaultInstance()) {
                this.platformSpecific_ = android;
            } else {
                this.platformSpecific_ = ((Android.Builder) Android.newBuilder((Android) this.platformSpecific_).mergeFrom(android)).buildPartial();
            }
            this.platformSpecificCase_ = 19;
        }

        private void mergeIos(Ios ios) {
            ios.getClass();
            if (this.platformSpecificCase_ != 20 || this.platformSpecific_ == Ios.getDefaultInstance()) {
                this.platformSpecific_ = ios;
            } else {
                this.platformSpecific_ = ((Ios.Builder) Ios.newBuilder((Ios) this.platformSpecific_).mergeFrom(ios)).buildPartial();
            }
            this.platformSpecificCase_ = 20;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static StaticDeviceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StaticDeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StaticDeviceInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAndroid(Android android) {
            android.getClass();
            this.platformSpecific_ = android;
            this.platformSpecificCase_ = 19;
        }

        private void setAppDebuggable(boolean z) {
            this.bitField0_ |= 4;
            this.appDebuggable_ = z;
        }

        private void setBundleId(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.bundleId_ = str;
        }

        private void setBundleIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.bundleId_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setBundleVersion(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.bundleVersion_ = str;
        }

        private void setBundleVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.bundleVersion_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        private void setCpuCount(long j) {
            this.bitField0_ |= 32768;
            this.cpuCount_ = j;
        }

        private void setCpuModel(String str) {
            str.getClass();
            this.bitField0_ |= 16384;
            this.cpuModel_ = str;
        }

        private void setCpuModelBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.cpuModel_ = byteString.toStringUtf8();
            this.bitField0_ |= 16384;
        }

        private void setDeviceMake(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.deviceMake_ = str;
        }

        private void setDeviceMakeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.deviceMake_ = byteString.toStringUtf8();
            this.bitField0_ |= 32;
        }

        private void setDeviceModel(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.deviceModel_ = str;
        }

        private void setDeviceModelBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.deviceModel_ = byteString.toStringUtf8();
            this.bitField0_ |= 64;
        }

        private void setGpuModel(String str) {
            str.getClass();
            this.bitField0_ |= 65536;
            this.gpuModel_ = str;
        }

        private void setGpuModelBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.gpuModel_ = byteString.toStringUtf8();
            this.bitField0_ |= 65536;
        }

        private void setIos(Ios ios) {
            ios.getClass();
            this.platformSpecific_ = ios;
            this.platformSpecificCase_ = 20;
        }

        private void setMadeWithUnity(boolean z) {
            this.bitField0_ |= 131072;
            this.madeWithUnity_ = z;
        }

        private void setOsVersion(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.osVersion_ = str;
        }

        private void setOsVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.osVersion_ = byteString.toStringUtf8();
            this.bitField0_ |= 16;
        }

        private void setRooted(boolean z) {
            this.bitField0_ |= 8;
            this.rooted_ = z;
        }

        private void setScreenDensity(int i) {
            this.bitField0_ |= 256;
            this.screenDensity_ = i;
        }

        private void setScreenHeight(int i) {
            this.bitField0_ |= 1024;
            this.screenHeight_ = i;
        }

        private void setScreenSize(int i) {
            this.bitField0_ |= 2048;
            this.screenSize_ = i;
        }

        private void setScreenWidth(int i) {
            this.bitField0_ |= 512;
            this.screenWidth_ = i;
        }

        private void setStores(int i, String str) {
            str.getClass();
            ensureStoresIsMutable();
            this.stores_.set(i, str);
        }

        private void setTotalDiskSpace(long j) {
            this.bitField0_ |= 4096;
            this.totalDiskSpace_ = j;
        }

        private void setTotalRamMemory(long j) {
            this.bitField0_ |= 8192;
            this.totalRamMemory_ = j;
        }

        private void setWebviewUa(String str) {
            str.getClass();
            this.bitField0_ |= 128;
            this.webviewUa_ = str;
        }

        private void setWebviewUaBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.webviewUa_ = byteString.toStringUtf8();
            this.bitField0_ |= 128;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new StaticDeviceInfo();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0015\u0001\u0001\u0001\u0015\u0015\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bለ\u0007\tဋ\b\nဋ\t\u000bဋ\n\fဋ\u000b\rȚ\u000eဂ\f\u000fဂ\r\u0010ለ\u000e\u0011ဂ\u000f\u0012ለ\u0010\u0013<\u0000\u0014<\u0000\u0015ဇ\u0011", new Object[]{"platformSpecific_", "platformSpecificCase_", "bitField0_", "bundleId_", "bundleVersion_", "appDebuggable_", "rooted_", "osVersion_", "deviceMake_", "deviceModel_", "webviewUa_", "screenDensity_", "screenWidth_", "screenHeight_", "screenSize_", "stores_", "totalDiskSpace_", "totalRamMemory_", "cpuModel_", "cpuCount_", "gpuModel_", Android.class, Ios.class, "madeWithUnity_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (StaticDeviceInfo.class) {
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

        public Android getAndroid() {
            return this.platformSpecificCase_ == 19 ? (Android) this.platformSpecific_ : Android.getDefaultInstance();
        }

        public boolean getAppDebuggable() {
            return this.appDebuggable_;
        }

        public String getBundleId() {
            return this.bundleId_;
        }

        public ByteString getBundleIdBytes() {
            return ByteString.copyFromUtf8(this.bundleId_);
        }

        public String getBundleVersion() {
            return this.bundleVersion_;
        }

        public ByteString getBundleVersionBytes() {
            return ByteString.copyFromUtf8(this.bundleVersion_);
        }

        public long getCpuCount() {
            return this.cpuCount_;
        }

        public String getCpuModel() {
            return this.cpuModel_;
        }

        public ByteString getCpuModelBytes() {
            return ByteString.copyFromUtf8(this.cpuModel_);
        }

        public String getDeviceMake() {
            return this.deviceMake_;
        }

        public ByteString getDeviceMakeBytes() {
            return ByteString.copyFromUtf8(this.deviceMake_);
        }

        public String getDeviceModel() {
            return this.deviceModel_;
        }

        public ByteString getDeviceModelBytes() {
            return ByteString.copyFromUtf8(this.deviceModel_);
        }

        public String getGpuModel() {
            return this.gpuModel_;
        }

        public ByteString getGpuModelBytes() {
            return ByteString.copyFromUtf8(this.gpuModel_);
        }

        public Ios getIos() {
            return this.platformSpecificCase_ == 20 ? (Ios) this.platformSpecific_ : Ios.getDefaultInstance();
        }

        public boolean getMadeWithUnity() {
            return this.madeWithUnity_;
        }

        public String getOsVersion() {
            return this.osVersion_;
        }

        public ByteString getOsVersionBytes() {
            return ByteString.copyFromUtf8(this.osVersion_);
        }

        public PlatformSpecificCase getPlatformSpecificCase() {
            return PlatformSpecificCase.forNumber(this.platformSpecificCase_);
        }

        public boolean getRooted() {
            return this.rooted_;
        }

        public int getScreenDensity() {
            return this.screenDensity_;
        }

        public int getScreenHeight() {
            return this.screenHeight_;
        }

        public int getScreenSize() {
            return this.screenSize_;
        }

        public int getScreenWidth() {
            return this.screenWidth_;
        }

        public String getStores(int i) {
            return (String) this.stores_.get(i);
        }

        public ByteString getStoresBytes(int i) {
            return ByteString.copyFromUtf8((String) this.stores_.get(i));
        }

        public int getStoresCount() {
            return this.stores_.size();
        }

        public List getStoresList() {
            return this.stores_;
        }

        public long getTotalDiskSpace() {
            return this.totalDiskSpace_;
        }

        public long getTotalRamMemory() {
            return this.totalRamMemory_;
        }

        public String getWebviewUa() {
            return this.webviewUa_;
        }

        public ByteString getWebviewUaBytes() {
            return ByteString.copyFromUtf8(this.webviewUa_);
        }

        public boolean hasAndroid() {
            return this.platformSpecificCase_ == 19;
        }

        public boolean hasAppDebuggable() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasBundleId() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasBundleVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasCpuCount() {
            return (this.bitField0_ & 32768) != 0;
        }

        public boolean hasCpuModel() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasDeviceMake() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasDeviceModel() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasGpuModel() {
            return (this.bitField0_ & 65536) != 0;
        }

        public boolean hasIos() {
            return this.platformSpecificCase_ == 20;
        }

        public boolean hasMadeWithUnity() {
            return (this.bitField0_ & 131072) != 0;
        }

        public boolean hasOsVersion() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasRooted() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasScreenDensity() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasScreenHeight() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasScreenSize() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasScreenWidth() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasTotalDiskSpace() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasTotalRamMemory() {
            return (this.bitField0_ & 8192) != 0;
        }

        public boolean hasWebviewUa() {
            return (this.bitField0_ & 128) != 0;
        }

        public static Builder newBuilder(StaticDeviceInfo staticDeviceInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(staticDeviceInfo);
        }

        public static StaticDeviceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StaticDeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StaticDeviceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static StaticDeviceInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StaticDeviceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StaticDeviceInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StaticDeviceInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StaticDeviceInfo parseFrom(InputStream inputStream) throws IOException {
            return (StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StaticDeviceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StaticDeviceInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StaticDeviceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface StaticDeviceInfoOrBuilder extends MessageLiteOrBuilder {
        StaticDeviceInfo.Android getAndroid();

        boolean getAppDebuggable();

        String getBundleId();

        ByteString getBundleIdBytes();

        String getBundleVersion();

        ByteString getBundleVersionBytes();

        long getCpuCount();

        String getCpuModel();

        ByteString getCpuModelBytes();

        String getDeviceMake();

        ByteString getDeviceMakeBytes();

        String getDeviceModel();

        ByteString getDeviceModelBytes();

        String getGpuModel();

        ByteString getGpuModelBytes();

        StaticDeviceInfo.Ios getIos();

        boolean getMadeWithUnity();

        String getOsVersion();

        ByteString getOsVersionBytes();

        StaticDeviceInfo.PlatformSpecificCase getPlatformSpecificCase();

        boolean getRooted();

        int getScreenDensity();

        int getScreenHeight();

        int getScreenSize();

        int getScreenWidth();

        String getStores(int i);

        ByteString getStoresBytes(int i);

        int getStoresCount();

        List getStoresList();

        long getTotalDiskSpace();

        long getTotalRamMemory();

        String getWebviewUa();

        ByteString getWebviewUaBytes();

        boolean hasAndroid();

        boolean hasAppDebuggable();

        boolean hasBundleId();

        boolean hasBundleVersion();

        boolean hasCpuCount();

        boolean hasCpuModel();

        boolean hasDeviceMake();

        boolean hasDeviceModel();

        boolean hasGpuModel();

        boolean hasIos();

        boolean hasMadeWithUnity();

        boolean hasOsVersion();

        boolean hasRooted();

        boolean hasScreenDensity();

        boolean hasScreenHeight();

        boolean hasScreenSize();

        boolean hasScreenWidth();

        boolean hasTotalDiskSpace();

        boolean hasTotalRamMemory();

        boolean hasWebviewUa();
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

    private StaticDeviceInfoOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
