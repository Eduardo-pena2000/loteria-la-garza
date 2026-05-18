package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
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
import gatewayprotocol.v1.ClientInfoOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializationRequestOuterClass {

    public static final class InitializationDeviceInfo extends GeneratedMessageLite implements InitializationDeviceInfoOrBuilder {
        public static final int BATTERY_LEVEL_FIELD_NUMBER = 11;
        public static final int BATTERY_STATUS_FIELD_NUMBER = 12;
        public static final int BUNDLE_ID_FIELD_NUMBER = 1;
        public static final int CONNECTION_TYPE_FIELD_NUMBER = 16;
        public static final int CURRENT_UI_THEME_FIELD_NUMBER = 9;
        private static final InitializationDeviceInfo DEFAULT_INSTANCE;
        public static final int DEVICE_MAKE_FIELD_NUMBER = 2;
        public static final int DEVICE_MODEL_FIELD_NUMBER = 3;
        public static final int HASHED_DEVICE_NAME_FIELD_NUMBER = 8;
        public static final int LANGUAGE_FIELD_NUMBER = 14;
        public static final int LOCAL_LIST_FIELD_NUMBER = 15;
        public static final int NETWORK_OPERATOR_FIELD_NUMBER = 10;
        public static final int OS_VERSION_FIELD_NUMBER = 4;
        private static volatile Parser PARSER = null;
        public static final int SYSTEM_BOOT_TIME_FIELD_NUMBER = 13;
        public static final int TOTAL_DISK_SPACE_FIELD_NUMBER = 6;
        public static final int TOTAL_RAM_MEMORY_FIELD_NUMBER = 7;
        public static final int TRACKING_AUTH_STATUS_FIELD_NUMBER = 5;
        private double batteryLevel_;
        private int batteryStatus_;
        private int bitField0_;
        private long currentUiTheme_;
        private long systemBootTime_;
        private long totalDiskSpace_;
        private long totalRamMemory_;
        private int trackingAuthStatus_;
        private String bundleId_ = "";
        private String deviceMake_ = "";
        private String deviceModel_ = "";
        private String osVersion_ = "";
        private String hashedDeviceName_ = "";
        private String networkOperator_ = "";
        private String language_ = "";
        private String localList_ = "";
        private String connectionType_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder implements InitializationDeviceInfoOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearBatteryLevel() {
                copyOnWrite();
                InitializationDeviceInfo.access$2800((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearBatteryStatus() {
                copyOnWrite();
                InitializationDeviceInfo.access$3000((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearBundleId() {
                copyOnWrite();
                InitializationDeviceInfo.access$200((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearConnectionType() {
                copyOnWrite();
                InitializationDeviceInfo.access$4000((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearCurrentUiTheme() {
                copyOnWrite();
                InitializationDeviceInfo.access$2300((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearDeviceMake() {
                copyOnWrite();
                InitializationDeviceInfo.access$500((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearDeviceModel() {
                copyOnWrite();
                InitializationDeviceInfo.access$800((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearHashedDeviceName() {
                copyOnWrite();
                InitializationDeviceInfo.access$2000((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearLanguage() {
                copyOnWrite();
                InitializationDeviceInfo.access$3400((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearLocalList() {
                copyOnWrite();
                InitializationDeviceInfo.access$3700((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearNetworkOperator() {
                copyOnWrite();
                InitializationDeviceInfo.access$2500((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearOsVersion() {
                copyOnWrite();
                InitializationDeviceInfo.access$1100((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearSystemBootTime() {
                copyOnWrite();
                InitializationDeviceInfo.access$3200((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTotalDiskSpace() {
                copyOnWrite();
                InitializationDeviceInfo.access$1600((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTotalRamMemory() {
                copyOnWrite();
                InitializationDeviceInfo.access$1800((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTrackingAuthStatus() {
                copyOnWrite();
                InitializationDeviceInfo.access$1400((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public double getBatteryLevel() {
                return ((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getBatteryLevel();
            }

            public int getBatteryStatus() {
                return ((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getBatteryStatus();
            }

            public String getBundleId() {
                return ((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getBundleId();
            }

            public ByteString getBundleIdBytes() {
                return ((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getBundleIdBytes();
            }

            public String getConnectionType() {
                return ((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getConnectionType();
            }

            public ByteString getConnectionTypeBytes() {
                return ((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getConnectionTypeBytes();
            }

            public long getCurrentUiTheme() {
                return ((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getCurrentUiTheme();
            }

            public String getDeviceMake() {
                return ((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getDeviceMake();
            }

            public ByteString getDeviceMakeBytes() {
                return ((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getDeviceMakeBytes();
            }

            public String getDeviceModel() {
                return ((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getDeviceModel();
            }

            public ByteString getDeviceModelBytes() {
                return ((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getDeviceModelBytes();
            }

            public String getHashedDeviceName() {
                return ((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getHashedDeviceName();
            }

            public ByteString getHashedDeviceNameBytes() {
                return ((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getHashedDeviceNameBytes();
            }

            public String getLanguage() {
                return ((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getLanguage();
            }

            public ByteString getLanguageBytes() {
                return ((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getLanguageBytes();
            }

            public String getLocalList() {
                return ((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getLocalList();
            }

            public ByteString getLocalListBytes() {
                return ((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getLocalListBytes();
            }

            public String getNetworkOperator() {
                return ((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getNetworkOperator();
            }

            public ByteString getNetworkOperatorBytes() {
                return ((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getNetworkOperatorBytes();
            }

            public String getOsVersion() {
                return ((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getOsVersion();
            }

            public ByteString getOsVersionBytes() {
                return ((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getOsVersionBytes();
            }

            public long getSystemBootTime() {
                return ((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getSystemBootTime();
            }

            public long getTotalDiskSpace() {
                return ((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getTotalDiskSpace();
            }

            public long getTotalRamMemory() {
                return ((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getTotalRamMemory();
            }

            public int getTrackingAuthStatus() {
                return ((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getTrackingAuthStatus();
            }

            public boolean hasTrackingAuthStatus() {
                return ((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasTrackingAuthStatus();
            }

            public Builder setBatteryLevel(double d) {
                copyOnWrite();
                InitializationDeviceInfo.access$2700((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, d);
                return this;
            }

            public Builder setBatteryStatus(int i) {
                copyOnWrite();
                InitializationDeviceInfo.access$2900((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setBundleId(String str) {
                copyOnWrite();
                InitializationDeviceInfo.access$100((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setBundleIdBytes(ByteString byteString) {
                copyOnWrite();
                InitializationDeviceInfo.access$300((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setConnectionType(String str) {
                copyOnWrite();
                InitializationDeviceInfo.access$3900((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setConnectionTypeBytes(ByteString byteString) {
                copyOnWrite();
                InitializationDeviceInfo.access$4100((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setCurrentUiTheme(long j) {
                copyOnWrite();
                InitializationDeviceInfo.access$2200((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, j);
                return this;
            }

            public Builder setDeviceMake(String str) {
                copyOnWrite();
                InitializationDeviceInfo.access$400((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setDeviceMakeBytes(ByteString byteString) {
                copyOnWrite();
                InitializationDeviceInfo.access$600((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setDeviceModel(String str) {
                copyOnWrite();
                InitializationDeviceInfo.access$700((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setDeviceModelBytes(ByteString byteString) {
                copyOnWrite();
                InitializationDeviceInfo.access$900((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setHashedDeviceName(String str) {
                copyOnWrite();
                InitializationDeviceInfo.access$1900((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setHashedDeviceNameBytes(ByteString byteString) {
                copyOnWrite();
                InitializationDeviceInfo.access$2100((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setLanguage(String str) {
                copyOnWrite();
                InitializationDeviceInfo.access$3300((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setLanguageBytes(ByteString byteString) {
                copyOnWrite();
                InitializationDeviceInfo.access$3500((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setLocalList(String str) {
                copyOnWrite();
                InitializationDeviceInfo.access$3600((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setLocalListBytes(ByteString byteString) {
                copyOnWrite();
                InitializationDeviceInfo.access$3800((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setNetworkOperator(String str) {
                copyOnWrite();
                InitializationDeviceInfo.access$2400((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setNetworkOperatorBytes(ByteString byteString) {
                copyOnWrite();
                InitializationDeviceInfo.access$2600((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setOsVersion(String str) {
                copyOnWrite();
                InitializationDeviceInfo.access$1000((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setOsVersionBytes(ByteString byteString) {
                copyOnWrite();
                InitializationDeviceInfo.access$1200((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setSystemBootTime(long j) {
                copyOnWrite();
                InitializationDeviceInfo.access$3100((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, j);
                return this;
            }

            public Builder setTotalDiskSpace(long j) {
                copyOnWrite();
                InitializationDeviceInfo.access$1500((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, j);
                return this;
            }

            public Builder setTotalRamMemory(long j) {
                copyOnWrite();
                InitializationDeviceInfo.access$1700((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, j);
                return this;
            }

            public Builder setTrackingAuthStatus(int i) {
                copyOnWrite();
                InitializationDeviceInfo.access$1300((InitializationDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            private Builder() {
                super(InitializationDeviceInfo.access$000());
            }
        }

        static {
            InitializationDeviceInfo initializationDeviceInfo = new InitializationDeviceInfo();
            DEFAULT_INSTANCE = initializationDeviceInfo;
            GeneratedMessageLite.registerDefaultInstance(InitializationDeviceInfo.class, initializationDeviceInfo);
        }

        private InitializationDeviceInfo() {
        }

        public static /* synthetic */ InitializationDeviceInfo access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(InitializationDeviceInfo initializationDeviceInfo, String str) {
            initializationDeviceInfo.setBundleId(str);
        }

        public static /* synthetic */ void access$1000(InitializationDeviceInfo initializationDeviceInfo, String str) {
            initializationDeviceInfo.setOsVersion(str);
        }

        public static /* synthetic */ void access$1100(InitializationDeviceInfo initializationDeviceInfo) {
            initializationDeviceInfo.clearOsVersion();
        }

        public static /* synthetic */ void access$1200(InitializationDeviceInfo initializationDeviceInfo, ByteString byteString) {
            initializationDeviceInfo.setOsVersionBytes(byteString);
        }

        public static /* synthetic */ void access$1300(InitializationDeviceInfo initializationDeviceInfo, int i) {
            initializationDeviceInfo.setTrackingAuthStatus(i);
        }

        public static /* synthetic */ void access$1400(InitializationDeviceInfo initializationDeviceInfo) {
            initializationDeviceInfo.clearTrackingAuthStatus();
        }

        public static /* synthetic */ void access$1500(InitializationDeviceInfo initializationDeviceInfo, long j) {
            initializationDeviceInfo.setTotalDiskSpace(j);
        }

        public static /* synthetic */ void access$1600(InitializationDeviceInfo initializationDeviceInfo) {
            initializationDeviceInfo.clearTotalDiskSpace();
        }

        public static /* synthetic */ void access$1700(InitializationDeviceInfo initializationDeviceInfo, long j) {
            initializationDeviceInfo.setTotalRamMemory(j);
        }

        public static /* synthetic */ void access$1800(InitializationDeviceInfo initializationDeviceInfo) {
            initializationDeviceInfo.clearTotalRamMemory();
        }

        public static /* synthetic */ void access$1900(InitializationDeviceInfo initializationDeviceInfo, String str) {
            initializationDeviceInfo.setHashedDeviceName(str);
        }

        public static /* synthetic */ void access$200(InitializationDeviceInfo initializationDeviceInfo) {
            initializationDeviceInfo.clearBundleId();
        }

        public static /* synthetic */ void access$2000(InitializationDeviceInfo initializationDeviceInfo) {
            initializationDeviceInfo.clearHashedDeviceName();
        }

        public static /* synthetic */ void access$2100(InitializationDeviceInfo initializationDeviceInfo, ByteString byteString) {
            initializationDeviceInfo.setHashedDeviceNameBytes(byteString);
        }

        public static /* synthetic */ void access$2200(InitializationDeviceInfo initializationDeviceInfo, long j) {
            initializationDeviceInfo.setCurrentUiTheme(j);
        }

        public static /* synthetic */ void access$2300(InitializationDeviceInfo initializationDeviceInfo) {
            initializationDeviceInfo.clearCurrentUiTheme();
        }

        public static /* synthetic */ void access$2400(InitializationDeviceInfo initializationDeviceInfo, String str) {
            initializationDeviceInfo.setNetworkOperator(str);
        }

        public static /* synthetic */ void access$2500(InitializationDeviceInfo initializationDeviceInfo) {
            initializationDeviceInfo.clearNetworkOperator();
        }

        public static /* synthetic */ void access$2600(InitializationDeviceInfo initializationDeviceInfo, ByteString byteString) {
            initializationDeviceInfo.setNetworkOperatorBytes(byteString);
        }

        public static /* synthetic */ void access$2700(InitializationDeviceInfo initializationDeviceInfo, double d) {
            initializationDeviceInfo.setBatteryLevel(d);
        }

        public static /* synthetic */ void access$2800(InitializationDeviceInfo initializationDeviceInfo) {
            initializationDeviceInfo.clearBatteryLevel();
        }

        public static /* synthetic */ void access$2900(InitializationDeviceInfo initializationDeviceInfo, int i) {
            initializationDeviceInfo.setBatteryStatus(i);
        }

        public static /* synthetic */ void access$300(InitializationDeviceInfo initializationDeviceInfo, ByteString byteString) {
            initializationDeviceInfo.setBundleIdBytes(byteString);
        }

        public static /* synthetic */ void access$3000(InitializationDeviceInfo initializationDeviceInfo) {
            initializationDeviceInfo.clearBatteryStatus();
        }

        public static /* synthetic */ void access$3100(InitializationDeviceInfo initializationDeviceInfo, long j) {
            initializationDeviceInfo.setSystemBootTime(j);
        }

        public static /* synthetic */ void access$3200(InitializationDeviceInfo initializationDeviceInfo) {
            initializationDeviceInfo.clearSystemBootTime();
        }

        public static /* synthetic */ void access$3300(InitializationDeviceInfo initializationDeviceInfo, String str) {
            initializationDeviceInfo.setLanguage(str);
        }

        public static /* synthetic */ void access$3400(InitializationDeviceInfo initializationDeviceInfo) {
            initializationDeviceInfo.clearLanguage();
        }

        public static /* synthetic */ void access$3500(InitializationDeviceInfo initializationDeviceInfo, ByteString byteString) {
            initializationDeviceInfo.setLanguageBytes(byteString);
        }

        public static /* synthetic */ void access$3600(InitializationDeviceInfo initializationDeviceInfo, String str) {
            initializationDeviceInfo.setLocalList(str);
        }

        public static /* synthetic */ void access$3700(InitializationDeviceInfo initializationDeviceInfo) {
            initializationDeviceInfo.clearLocalList();
        }

        public static /* synthetic */ void access$3800(InitializationDeviceInfo initializationDeviceInfo, ByteString byteString) {
            initializationDeviceInfo.setLocalListBytes(byteString);
        }

        public static /* synthetic */ void access$3900(InitializationDeviceInfo initializationDeviceInfo, String str) {
            initializationDeviceInfo.setConnectionType(str);
        }

        public static /* synthetic */ void access$400(InitializationDeviceInfo initializationDeviceInfo, String str) {
            initializationDeviceInfo.setDeviceMake(str);
        }

        public static /* synthetic */ void access$4000(InitializationDeviceInfo initializationDeviceInfo) {
            initializationDeviceInfo.clearConnectionType();
        }

        public static /* synthetic */ void access$4100(InitializationDeviceInfo initializationDeviceInfo, ByteString byteString) {
            initializationDeviceInfo.setConnectionTypeBytes(byteString);
        }

        public static /* synthetic */ void access$500(InitializationDeviceInfo initializationDeviceInfo) {
            initializationDeviceInfo.clearDeviceMake();
        }

        public static /* synthetic */ void access$600(InitializationDeviceInfo initializationDeviceInfo, ByteString byteString) {
            initializationDeviceInfo.setDeviceMakeBytes(byteString);
        }

        public static /* synthetic */ void access$700(InitializationDeviceInfo initializationDeviceInfo, String str) {
            initializationDeviceInfo.setDeviceModel(str);
        }

        public static /* synthetic */ void access$800(InitializationDeviceInfo initializationDeviceInfo) {
            initializationDeviceInfo.clearDeviceModel();
        }

        public static /* synthetic */ void access$900(InitializationDeviceInfo initializationDeviceInfo, ByteString byteString) {
            initializationDeviceInfo.setDeviceModelBytes(byteString);
        }

        private void clearBatteryLevel() {
            this.batteryLevel_ = 0.0d;
        }

        private void clearBatteryStatus() {
            this.batteryStatus_ = 0;
        }

        private void clearBundleId() {
            this.bundleId_ = getDefaultInstance().getBundleId();
        }

        private void clearConnectionType() {
            this.connectionType_ = getDefaultInstance().getConnectionType();
        }

        private void clearCurrentUiTheme() {
            this.currentUiTheme_ = 0L;
        }

        private void clearDeviceMake() {
            this.deviceMake_ = getDefaultInstance().getDeviceMake();
        }

        private void clearDeviceModel() {
            this.deviceModel_ = getDefaultInstance().getDeviceModel();
        }

        private void clearHashedDeviceName() {
            this.hashedDeviceName_ = getDefaultInstance().getHashedDeviceName();
        }

        private void clearLanguage() {
            this.language_ = getDefaultInstance().getLanguage();
        }

        private void clearLocalList() {
            this.localList_ = getDefaultInstance().getLocalList();
        }

        private void clearNetworkOperator() {
            this.networkOperator_ = getDefaultInstance().getNetworkOperator();
        }

        private void clearOsVersion() {
            this.osVersion_ = getDefaultInstance().getOsVersion();
        }

        private void clearSystemBootTime() {
            this.systemBootTime_ = 0L;
        }

        private void clearTotalDiskSpace() {
            this.totalDiskSpace_ = 0L;
        }

        private void clearTotalRamMemory() {
            this.totalRamMemory_ = 0L;
        }

        private void clearTrackingAuthStatus() {
            this.bitField0_ &= -2;
            this.trackingAuthStatus_ = 0;
        }

        public static InitializationDeviceInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static InitializationDeviceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitializationDeviceInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setBatteryLevel(double d) {
            this.batteryLevel_ = d;
        }

        private void setBatteryStatus(int i) {
            this.batteryStatus_ = i;
        }

        private void setBundleId(String str) {
            str.getClass();
            this.bundleId_ = str;
        }

        private void setBundleIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.bundleId_ = byteString.toStringUtf8();
        }

        private void setConnectionType(String str) {
            str.getClass();
            this.connectionType_ = str;
        }

        private void setConnectionTypeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.connectionType_ = byteString.toStringUtf8();
        }

        private void setCurrentUiTheme(long j) {
            this.currentUiTheme_ = j;
        }

        private void setDeviceMake(String str) {
            str.getClass();
            this.deviceMake_ = str;
        }

        private void setDeviceMakeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.deviceMake_ = byteString.toStringUtf8();
        }

        private void setDeviceModel(String str) {
            str.getClass();
            this.deviceModel_ = str;
        }

        private void setDeviceModelBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.deviceModel_ = byteString.toStringUtf8();
        }

        private void setHashedDeviceName(String str) {
            str.getClass();
            this.hashedDeviceName_ = str;
        }

        private void setHashedDeviceNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.hashedDeviceName_ = byteString.toStringUtf8();
        }

        private void setLanguage(String str) {
            str.getClass();
            this.language_ = str;
        }

        private void setLanguageBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.language_ = byteString.toStringUtf8();
        }

        private void setLocalList(String str) {
            str.getClass();
            this.localList_ = str;
        }

        private void setLocalListBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.localList_ = byteString.toStringUtf8();
        }

        private void setNetworkOperator(String str) {
            str.getClass();
            this.networkOperator_ = str;
        }

        private void setNetworkOperatorBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.networkOperator_ = byteString.toStringUtf8();
        }

        private void setOsVersion(String str) {
            str.getClass();
            this.osVersion_ = str;
        }

        private void setOsVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.osVersion_ = byteString.toStringUtf8();
        }

        private void setSystemBootTime(long j) {
            this.systemBootTime_ = j;
        }

        private void setTotalDiskSpace(long j) {
            this.totalDiskSpace_ = j;
        }

        private void setTotalRamMemory(long j) {
            this.totalRamMemory_ = j;
        }

        private void setTrackingAuthStatus(int i) {
            this.bitField0_ |= 1;
            this.trackingAuthStatus_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new InitializationDeviceInfo();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005င\u0000\u0006\u0002\u0007\u0002\bȈ\t\u0002\nȈ\u000b\u0000\f\u0004\r\u0002\u000eȈ\u000fȈ\u0010Ȉ", new Object[]{"bitField0_", "bundleId_", "deviceMake_", "deviceModel_", "osVersion_", "trackingAuthStatus_", "totalDiskSpace_", "totalRamMemory_", "hashedDeviceName_", "currentUiTheme_", "networkOperator_", "batteryLevel_", "batteryStatus_", "systemBootTime_", "language_", "localList_", "connectionType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (InitializationDeviceInfo.class) {
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

        public double getBatteryLevel() {
            return this.batteryLevel_;
        }

        public int getBatteryStatus() {
            return this.batteryStatus_;
        }

        public String getBundleId() {
            return this.bundleId_;
        }

        public ByteString getBundleIdBytes() {
            return ByteString.copyFromUtf8(this.bundleId_);
        }

        public String getConnectionType() {
            return this.connectionType_;
        }

        public ByteString getConnectionTypeBytes() {
            return ByteString.copyFromUtf8(this.connectionType_);
        }

        public long getCurrentUiTheme() {
            return this.currentUiTheme_;
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

        public String getHashedDeviceName() {
            return this.hashedDeviceName_;
        }

        public ByteString getHashedDeviceNameBytes() {
            return ByteString.copyFromUtf8(this.hashedDeviceName_);
        }

        public String getLanguage() {
            return this.language_;
        }

        public ByteString getLanguageBytes() {
            return ByteString.copyFromUtf8(this.language_);
        }

        public String getLocalList() {
            return this.localList_;
        }

        public ByteString getLocalListBytes() {
            return ByteString.copyFromUtf8(this.localList_);
        }

        public String getNetworkOperator() {
            return this.networkOperator_;
        }

        public ByteString getNetworkOperatorBytes() {
            return ByteString.copyFromUtf8(this.networkOperator_);
        }

        public String getOsVersion() {
            return this.osVersion_;
        }

        public ByteString getOsVersionBytes() {
            return ByteString.copyFromUtf8(this.osVersion_);
        }

        public long getSystemBootTime() {
            return this.systemBootTime_;
        }

        public long getTotalDiskSpace() {
            return this.totalDiskSpace_;
        }

        public long getTotalRamMemory() {
            return this.totalRamMemory_;
        }

        public int getTrackingAuthStatus() {
            return this.trackingAuthStatus_;
        }

        public boolean hasTrackingAuthStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(InitializationDeviceInfo initializationDeviceInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(initializationDeviceInfo);
        }

        public static InitializationDeviceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InitializationDeviceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static InitializationDeviceInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static InitializationDeviceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static InitializationDeviceInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static InitializationDeviceInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static InitializationDeviceInfo parseFrom(InputStream inputStream) throws IOException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitializationDeviceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InitializationDeviceInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static InitializationDeviceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface InitializationDeviceInfoOrBuilder extends MessageLiteOrBuilder {
        double getBatteryLevel();

        int getBatteryStatus();

        String getBundleId();

        ByteString getBundleIdBytes();

        String getConnectionType();

        ByteString getConnectionTypeBytes();

        long getCurrentUiTheme();

        String getDeviceMake();

        ByteString getDeviceMakeBytes();

        String getDeviceModel();

        ByteString getDeviceModelBytes();

        String getHashedDeviceName();

        ByteString getHashedDeviceNameBytes();

        String getLanguage();

        ByteString getLanguageBytes();

        String getLocalList();

        ByteString getLocalListBytes();

        String getNetworkOperator();

        ByteString getNetworkOperatorBytes();

        String getOsVersion();

        ByteString getOsVersionBytes();

        long getSystemBootTime();

        long getTotalDiskSpace();

        long getTotalRamMemory();

        int getTrackingAuthStatus();

        boolean hasTrackingAuthStatus();
    }

    public static final class InitializationRequest extends GeneratedMessageLite implements InitializationRequestOrBuilder {
        public static final int ANALYTICS_USER_ID_FIELD_NUMBER = 8;
        public static final int AUID_FIELD_NUMBER = 7;
        public static final int AUID_STRING_FIELD_NUMBER = 11;
        public static final int CACHE_FIELD_NUMBER = 5;
        public static final int CLIENT_INFO_FIELD_NUMBER = 1;
        private static final InitializationRequest DEFAULT_INSTANCE;
        public static final int DEVICE_INFO_FIELD_NUMBER = 9;
        public static final int EXTERNAL_USER_IDENTIFIER_FIELD_NUMBER = 15;
        public static final int EXTRAS_FIELD_NUMBER = 16;
        public static final int IDFI_FIELD_NUMBER = 3;
        public static final int IS_FIRST_INIT_FIELD_NUMBER = 10;
        public static final int LEGACY_FLOW_USER_CONSENT_FIELD_NUMBER = 6;
        private static volatile Parser PARSER = null;
        public static final int PRIVACY_FIELD_NUMBER = 2;
        public static final int SESSION_ID_FIELD_NUMBER = 4;
        public static final int UADS_INIT_BLOB_FIELD_NUMBER = 12;
        public static final int UNITY_BUILD_GUID_FIELD_NUMBER = 17;
        public static final int UNITY_INSTALLATION_ID_FIELD_NUMBER = 13;
        public static final int UNITY_MEGA_SESSION_ID_FIELD_NUMBER = 14;
        private String analyticsUserId_;
        private String auidString_;
        private ByteString auid_;
        private int bitField0_;
        private ByteString cache_;
        private ClientInfoOuterClass.ClientInfo clientInfo_;
        private InitializationDeviceInfo deviceInfo_;
        private String externalUserIdentifier_;
        private MapFieldLite extras_ = MapFieldLite.emptyMapField();
        private String idfi_;
        private boolean isFirstInit_;
        private String legacyFlowUserConsent_;
        private ByteString privacy_;
        private ByteString sessionId_;
        private ByteString uadsInitBlob_;
        private String unityBuildGuid_;
        private ByteString unityInstallationId_;
        private ByteString unityMegaSessionId_;

        public static final class Builder extends GeneratedMessageLite.Builder implements InitializationRequestOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearAnalyticsUserId() {
                copyOnWrite();
                InitializationRequest.access$6200((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearAuid() {
                copyOnWrite();
                InitializationRequest.access$6000((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearAuidString() {
                copyOnWrite();
                InitializationRequest.access$7000((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearCache() {
                copyOnWrite();
                InitializationRequest.access$5500((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearClientInfo() {
                copyOnWrite();
                InitializationRequest.access$4600((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearDeviceInfo() {
                copyOnWrite();
                InitializationRequest.access$6600((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearExternalUserIdentifier() {
                copyOnWrite();
                InitializationRequest.access$7900((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearExtras() {
                copyOnWrite();
                InitializationRequest.access$8100((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).clear();
                return this;
            }

            public Builder clearIdfi() {
                copyOnWrite();
                InitializationRequest.access$5000((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearIsFirstInit() {
                copyOnWrite();
                InitializationRequest.access$6800((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearLegacyFlowUserConsent() {
                copyOnWrite();
                InitializationRequest.access$5700((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearPrivacy() {
                copyOnWrite();
                InitializationRequest.access$4800((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                InitializationRequest.access$5300((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearUadsInitBlob() {
                copyOnWrite();
                InitializationRequest.access$7300((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearUnityBuildGuid() {
                copyOnWrite();
                InitializationRequest.access$8300((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearUnityInstallationId() {
                copyOnWrite();
                InitializationRequest.access$7500((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearUnityMegaSessionId() {
                copyOnWrite();
                InitializationRequest.access$7700((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public boolean containsExtras(String str) {
                str.getClass();
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).getExtrasMap().containsKey(str);
            }

            public String getAnalyticsUserId() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).getAnalyticsUserId();
            }

            public ByteString getAnalyticsUserIdBytes() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).getAnalyticsUserIdBytes();
            }

            public ByteString getAuid() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).getAuid();
            }

            public String getAuidString() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).getAuidString();
            }

            public ByteString getAuidStringBytes() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).getAuidStringBytes();
            }

            public ByteString getCache() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).getCache();
            }

            public ClientInfoOuterClass.ClientInfo getClientInfo() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).getClientInfo();
            }

            public InitializationDeviceInfo getDeviceInfo() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).getDeviceInfo();
            }

            public String getExternalUserIdentifier() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).getExternalUserIdentifier();
            }

            public ByteString getExternalUserIdentifierBytes() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).getExternalUserIdentifierBytes();
            }

            @Deprecated
            public Map getExtras() {
                return getExtrasMap();
            }

            public int getExtrasCount() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).getExtrasMap().size();
            }

            public Map getExtrasMap() {
                return Collections.unmodifiableMap(((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).getExtrasMap());
            }

            public String getExtrasOrDefault(String str, String str2) {
                str.getClass();
                Map extrasMap = ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).getExtrasMap();
                return extrasMap.containsKey(str) ? (String) extrasMap.get(str) : str2;
            }

            public String getExtrasOrThrow(String str) {
                str.getClass();
                Map extrasMap = ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).getExtrasMap();
                if (extrasMap.containsKey(str)) {
                    return (String) extrasMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            public String getIdfi() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).getIdfi();
            }

            public ByteString getIdfiBytes() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).getIdfiBytes();
            }

            public boolean getIsFirstInit() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).getIsFirstInit();
            }

            public String getLegacyFlowUserConsent() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).getLegacyFlowUserConsent();
            }

            public ByteString getLegacyFlowUserConsentBytes() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).getLegacyFlowUserConsentBytes();
            }

            public ByteString getPrivacy() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).getPrivacy();
            }

            public ByteString getSessionId() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).getSessionId();
            }

            public ByteString getUadsInitBlob() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).getUadsInitBlob();
            }

            public String getUnityBuildGuid() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).getUnityBuildGuid();
            }

            public ByteString getUnityBuildGuidBytes() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).getUnityBuildGuidBytes();
            }

            public ByteString getUnityInstallationId() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).getUnityInstallationId();
            }

            public ByteString getUnityMegaSessionId() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).getUnityMegaSessionId();
            }

            public boolean hasAnalyticsUserId() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).hasAnalyticsUserId();
            }

            public boolean hasAuid() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).hasAuid();
            }

            public boolean hasAuidString() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).hasAuidString();
            }

            public boolean hasCache() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).hasCache();
            }

            public boolean hasClientInfo() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).hasClientInfo();
            }

            public boolean hasDeviceInfo() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).hasDeviceInfo();
            }

            public boolean hasExternalUserIdentifier() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).hasExternalUserIdentifier();
            }

            public boolean hasLegacyFlowUserConsent() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).hasLegacyFlowUserConsent();
            }

            public boolean hasPrivacy() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).hasPrivacy();
            }

            public boolean hasUadsInitBlob() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).hasUadsInitBlob();
            }

            public boolean hasUnityBuildGuid() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).hasUnityBuildGuid();
            }

            public boolean hasUnityInstallationId() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).hasUnityInstallationId();
            }

            public boolean hasUnityMegaSessionId() {
                return ((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).hasUnityMegaSessionId();
            }

            public Builder mergeClientInfo(ClientInfoOuterClass.ClientInfo clientInfo) {
                copyOnWrite();
                InitializationRequest.access$4500((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance, clientInfo);
                return this;
            }

            public Builder mergeDeviceInfo(InitializationDeviceInfo initializationDeviceInfo) {
                copyOnWrite();
                InitializationRequest.access$6500((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance, initializationDeviceInfo);
                return this;
            }

            public Builder putAllExtras(Map map) {
                copyOnWrite();
                InitializationRequest.access$8100((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).putAll(map);
                return this;
            }

            public Builder putExtras(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                InitializationRequest.access$8100((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).put(str, str2);
                return this;
            }

            public Builder removeExtras(String str) {
                str.getClass();
                copyOnWrite();
                InitializationRequest.access$8100((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance).remove(str);
                return this;
            }

            public Builder setAnalyticsUserId(String str) {
                copyOnWrite();
                InitializationRequest.access$6100((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setAnalyticsUserIdBytes(ByteString byteString) {
                copyOnWrite();
                InitializationRequest.access$6300((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setAuid(ByteString byteString) {
                copyOnWrite();
                InitializationRequest.access$5900((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setAuidString(String str) {
                copyOnWrite();
                InitializationRequest.access$6900((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setAuidStringBytes(ByteString byteString) {
                copyOnWrite();
                InitializationRequest.access$7100((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setCache(ByteString byteString) {
                copyOnWrite();
                InitializationRequest.access$5400((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setClientInfo(ClientInfoOuterClass.ClientInfo clientInfo) {
                copyOnWrite();
                InitializationRequest.access$4400((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance, clientInfo);
                return this;
            }

            public Builder setDeviceInfo(InitializationDeviceInfo initializationDeviceInfo) {
                copyOnWrite();
                InitializationRequest.access$6400((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance, initializationDeviceInfo);
                return this;
            }

            public Builder setExternalUserIdentifier(String str) {
                copyOnWrite();
                InitializationRequest.access$7800((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setExternalUserIdentifierBytes(ByteString byteString) {
                copyOnWrite();
                InitializationRequest.access$8000((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setIdfi(String str) {
                copyOnWrite();
                InitializationRequest.access$4900((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setIdfiBytes(ByteString byteString) {
                copyOnWrite();
                InitializationRequest.access$5100((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setIsFirstInit(boolean z) {
                copyOnWrite();
                InitializationRequest.access$6700((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setLegacyFlowUserConsent(String str) {
                copyOnWrite();
                InitializationRequest.access$5600((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setLegacyFlowUserConsentBytes(ByteString byteString) {
                copyOnWrite();
                InitializationRequest.access$5800((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setPrivacy(ByteString byteString) {
                copyOnWrite();
                InitializationRequest.access$4700((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setSessionId(ByteString byteString) {
                copyOnWrite();
                InitializationRequest.access$5200((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setUadsInitBlob(ByteString byteString) {
                copyOnWrite();
                InitializationRequest.access$7200((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setUnityBuildGuid(String str) {
                copyOnWrite();
                InitializationRequest.access$8200((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setUnityBuildGuidBytes(ByteString byteString) {
                copyOnWrite();
                InitializationRequest.access$8400((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setUnityInstallationId(ByteString byteString) {
                copyOnWrite();
                InitializationRequest.access$7400((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setUnityMegaSessionId(ByteString byteString) {
                copyOnWrite();
                InitializationRequest.access$7600((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            private Builder() {
                super(InitializationRequest.access$4300());
            }

            public Builder setClientInfo(ClientInfoOuterClass.ClientInfo.Builder builder) {
                copyOnWrite();
                InitializationRequest.access$4400((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance, (ClientInfoOuterClass.ClientInfo) builder.build());
                return this;
            }

            public Builder setDeviceInfo(InitializationDeviceInfo.Builder builder) {
                copyOnWrite();
                InitializationRequest.access$6400((InitializationRequest) ((GeneratedMessageLite.Builder) this).instance, (InitializationDeviceInfo) builder.build());
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
            InitializationRequest initializationRequest = new InitializationRequest();
            DEFAULT_INSTANCE = initializationRequest;
            GeneratedMessageLite.registerDefaultInstance(InitializationRequest.class, initializationRequest);
        }

        private InitializationRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.privacy_ = byteString;
            this.idfi_ = "";
            this.sessionId_ = byteString;
            this.cache_ = byteString;
            this.legacyFlowUserConsent_ = "";
            this.auid_ = byteString;
            this.analyticsUserId_ = "";
            this.auidString_ = "";
            this.uadsInitBlob_ = byteString;
            this.unityInstallationId_ = byteString;
            this.unityMegaSessionId_ = byteString;
            this.externalUserIdentifier_ = "";
            this.unityBuildGuid_ = "";
        }

        public static /* synthetic */ InitializationRequest access$4300() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$4400(InitializationRequest initializationRequest, ClientInfoOuterClass.ClientInfo clientInfo) {
            initializationRequest.setClientInfo(clientInfo);
        }

        public static /* synthetic */ void access$4500(InitializationRequest initializationRequest, ClientInfoOuterClass.ClientInfo clientInfo) {
            initializationRequest.mergeClientInfo(clientInfo);
        }

        public static /* synthetic */ void access$4600(InitializationRequest initializationRequest) {
            initializationRequest.clearClientInfo();
        }

        public static /* synthetic */ void access$4700(InitializationRequest initializationRequest, ByteString byteString) {
            initializationRequest.setPrivacy(byteString);
        }

        public static /* synthetic */ void access$4800(InitializationRequest initializationRequest) {
            initializationRequest.clearPrivacy();
        }

        public static /* synthetic */ void access$4900(InitializationRequest initializationRequest, String str) {
            initializationRequest.setIdfi(str);
        }

        public static /* synthetic */ void access$5000(InitializationRequest initializationRequest) {
            initializationRequest.clearIdfi();
        }

        public static /* synthetic */ void access$5100(InitializationRequest initializationRequest, ByteString byteString) {
            initializationRequest.setIdfiBytes(byteString);
        }

        public static /* synthetic */ void access$5200(InitializationRequest initializationRequest, ByteString byteString) {
            initializationRequest.setSessionId(byteString);
        }

        public static /* synthetic */ void access$5300(InitializationRequest initializationRequest) {
            initializationRequest.clearSessionId();
        }

        public static /* synthetic */ void access$5400(InitializationRequest initializationRequest, ByteString byteString) {
            initializationRequest.setCache(byteString);
        }

        public static /* synthetic */ void access$5500(InitializationRequest initializationRequest) {
            initializationRequest.clearCache();
        }

        public static /* synthetic */ void access$5600(InitializationRequest initializationRequest, String str) {
            initializationRequest.setLegacyFlowUserConsent(str);
        }

        public static /* synthetic */ void access$5700(InitializationRequest initializationRequest) {
            initializationRequest.clearLegacyFlowUserConsent();
        }

        public static /* synthetic */ void access$5800(InitializationRequest initializationRequest, ByteString byteString) {
            initializationRequest.setLegacyFlowUserConsentBytes(byteString);
        }

        public static /* synthetic */ void access$5900(InitializationRequest initializationRequest, ByteString byteString) {
            initializationRequest.setAuid(byteString);
        }

        public static /* synthetic */ void access$6000(InitializationRequest initializationRequest) {
            initializationRequest.clearAuid();
        }

        public static /* synthetic */ void access$6100(InitializationRequest initializationRequest, String str) {
            initializationRequest.setAnalyticsUserId(str);
        }

        public static /* synthetic */ void access$6200(InitializationRequest initializationRequest) {
            initializationRequest.clearAnalyticsUserId();
        }

        public static /* synthetic */ void access$6300(InitializationRequest initializationRequest, ByteString byteString) {
            initializationRequest.setAnalyticsUserIdBytes(byteString);
        }

        public static /* synthetic */ void access$6400(InitializationRequest initializationRequest, InitializationDeviceInfo initializationDeviceInfo) {
            initializationRequest.setDeviceInfo(initializationDeviceInfo);
        }

        public static /* synthetic */ void access$6500(InitializationRequest initializationRequest, InitializationDeviceInfo initializationDeviceInfo) {
            initializationRequest.mergeDeviceInfo(initializationDeviceInfo);
        }

        public static /* synthetic */ void access$6600(InitializationRequest initializationRequest) {
            initializationRequest.clearDeviceInfo();
        }

        public static /* synthetic */ void access$6700(InitializationRequest initializationRequest, boolean z) {
            initializationRequest.setIsFirstInit(z);
        }

        public static /* synthetic */ void access$6800(InitializationRequest initializationRequest) {
            initializationRequest.clearIsFirstInit();
        }

        public static /* synthetic */ void access$6900(InitializationRequest initializationRequest, String str) {
            initializationRequest.setAuidString(str);
        }

        public static /* synthetic */ void access$7000(InitializationRequest initializationRequest) {
            initializationRequest.clearAuidString();
        }

        public static /* synthetic */ void access$7100(InitializationRequest initializationRequest, ByteString byteString) {
            initializationRequest.setAuidStringBytes(byteString);
        }

        public static /* synthetic */ void access$7200(InitializationRequest initializationRequest, ByteString byteString) {
            initializationRequest.setUadsInitBlob(byteString);
        }

        public static /* synthetic */ void access$7300(InitializationRequest initializationRequest) {
            initializationRequest.clearUadsInitBlob();
        }

        public static /* synthetic */ void access$7400(InitializationRequest initializationRequest, ByteString byteString) {
            initializationRequest.setUnityInstallationId(byteString);
        }

        public static /* synthetic */ void access$7500(InitializationRequest initializationRequest) {
            initializationRequest.clearUnityInstallationId();
        }

        public static /* synthetic */ void access$7600(InitializationRequest initializationRequest, ByteString byteString) {
            initializationRequest.setUnityMegaSessionId(byteString);
        }

        public static /* synthetic */ void access$7700(InitializationRequest initializationRequest) {
            initializationRequest.clearUnityMegaSessionId();
        }

        public static /* synthetic */ void access$7800(InitializationRequest initializationRequest, String str) {
            initializationRequest.setExternalUserIdentifier(str);
        }

        public static /* synthetic */ void access$7900(InitializationRequest initializationRequest) {
            initializationRequest.clearExternalUserIdentifier();
        }

        public static /* synthetic */ void access$8000(InitializationRequest initializationRequest, ByteString byteString) {
            initializationRequest.setExternalUserIdentifierBytes(byteString);
        }

        public static /* synthetic */ Map access$8100(InitializationRequest initializationRequest) {
            return initializationRequest.getMutableExtrasMap();
        }

        public static /* synthetic */ void access$8200(InitializationRequest initializationRequest, String str) {
            initializationRequest.setUnityBuildGuid(str);
        }

        public static /* synthetic */ void access$8300(InitializationRequest initializationRequest) {
            initializationRequest.clearUnityBuildGuid();
        }

        public static /* synthetic */ void access$8400(InitializationRequest initializationRequest, ByteString byteString) {
            initializationRequest.setUnityBuildGuidBytes(byteString);
        }

        private void clearAnalyticsUserId() {
            this.bitField0_ &= -33;
            this.analyticsUserId_ = getDefaultInstance().getAnalyticsUserId();
        }

        private void clearAuid() {
            this.bitField0_ &= -17;
            this.auid_ = getDefaultInstance().getAuid();
        }

        private void clearAuidString() {
            this.bitField0_ &= -129;
            this.auidString_ = getDefaultInstance().getAuidString();
        }

        private void clearCache() {
            this.bitField0_ &= -5;
            this.cache_ = getDefaultInstance().getCache();
        }

        private void clearClientInfo() {
            this.clientInfo_ = null;
            this.bitField0_ &= -2;
        }

        private void clearDeviceInfo() {
            this.deviceInfo_ = null;
            this.bitField0_ &= -65;
        }

        private void clearExternalUserIdentifier() {
            this.bitField0_ &= -2049;
            this.externalUserIdentifier_ = getDefaultInstance().getExternalUserIdentifier();
        }

        private void clearIdfi() {
            this.idfi_ = getDefaultInstance().getIdfi();
        }

        private void clearIsFirstInit() {
            this.isFirstInit_ = false;
        }

        private void clearLegacyFlowUserConsent() {
            this.bitField0_ &= -9;
            this.legacyFlowUserConsent_ = getDefaultInstance().getLegacyFlowUserConsent();
        }

        private void clearPrivacy() {
            this.bitField0_ &= -3;
            this.privacy_ = getDefaultInstance().getPrivacy();
        }

        private void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        private void clearUadsInitBlob() {
            this.bitField0_ &= -257;
            this.uadsInitBlob_ = getDefaultInstance().getUadsInitBlob();
        }

        private void clearUnityBuildGuid() {
            this.bitField0_ &= -4097;
            this.unityBuildGuid_ = getDefaultInstance().getUnityBuildGuid();
        }

        private void clearUnityInstallationId() {
            this.bitField0_ &= -513;
            this.unityInstallationId_ = getDefaultInstance().getUnityInstallationId();
        }

        private void clearUnityMegaSessionId() {
            this.bitField0_ &= -1025;
            this.unityMegaSessionId_ = getDefaultInstance().getUnityMegaSessionId();
        }

        public static InitializationRequest getDefaultInstance() {
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

        private void mergeDeviceInfo(InitializationDeviceInfo initializationDeviceInfo) {
            initializationDeviceInfo.getClass();
            InitializationDeviceInfo initializationDeviceInfo2 = this.deviceInfo_;
            if (initializationDeviceInfo2 == null || initializationDeviceInfo2 == InitializationDeviceInfo.getDefaultInstance()) {
                this.deviceInfo_ = initializationDeviceInfo;
            } else {
                this.deviceInfo_ = (InitializationDeviceInfo) ((InitializationDeviceInfo.Builder) InitializationDeviceInfo.newBuilder(this.deviceInfo_).mergeFrom(initializationDeviceInfo)).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static InitializationRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (InitializationRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitializationRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAnalyticsUserId(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.analyticsUserId_ = str;
        }

        private void setAnalyticsUserIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.analyticsUserId_ = byteString.toStringUtf8();
            this.bitField0_ |= 32;
        }

        private void setAuid(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 16;
            this.auid_ = byteString;
        }

        private void setAuidString(String str) {
            str.getClass();
            this.bitField0_ |= 128;
            this.auidString_ = str;
        }

        private void setAuidStringBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.auidString_ = byteString.toStringUtf8();
            this.bitField0_ |= 128;
        }

        private void setCache(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 4;
            this.cache_ = byteString;
        }

        private void setClientInfo(ClientInfoOuterClass.ClientInfo clientInfo) {
            clientInfo.getClass();
            this.clientInfo_ = clientInfo;
            this.bitField0_ |= 1;
        }

        private void setDeviceInfo(InitializationDeviceInfo initializationDeviceInfo) {
            initializationDeviceInfo.getClass();
            this.deviceInfo_ = initializationDeviceInfo;
            this.bitField0_ |= 64;
        }

        private void setExternalUserIdentifier(String str) {
            str.getClass();
            this.bitField0_ |= 2048;
            this.externalUserIdentifier_ = str;
        }

        private void setExternalUserIdentifierBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.externalUserIdentifier_ = byteString.toStringUtf8();
            this.bitField0_ |= 2048;
        }

        private void setIdfi(String str) {
            str.getClass();
            this.idfi_ = str;
        }

        private void setIdfiBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.idfi_ = byteString.toStringUtf8();
        }

        private void setIsFirstInit(boolean z) {
            this.isFirstInit_ = z;
        }

        private void setLegacyFlowUserConsent(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.legacyFlowUserConsent_ = str;
        }

        private void setLegacyFlowUserConsentBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.legacyFlowUserConsent_ = byteString.toStringUtf8();
            this.bitField0_ |= 8;
        }

        private void setPrivacy(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 2;
            this.privacy_ = byteString;
        }

        private void setSessionId(ByteString byteString) {
            byteString.getClass();
            this.sessionId_ = byteString;
        }

        private void setUadsInitBlob(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 256;
            this.uadsInitBlob_ = byteString;
        }

        private void setUnityBuildGuid(String str) {
            str.getClass();
            this.bitField0_ |= 4096;
            this.unityBuildGuid_ = str;
        }

        private void setUnityBuildGuidBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.unityBuildGuid_ = byteString.toStringUtf8();
            this.bitField0_ |= 4096;
        }

        private void setUnityInstallationId(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 512;
            this.unityInstallationId_ = byteString;
        }

        private void setUnityMegaSessionId(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 1024;
            this.unityMegaSessionId_ = byteString;
        }

        public boolean containsExtras(String str) {
            str.getClass();
            return internalGetExtras().containsKey(str);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new InitializationRequest();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0001\u0001\u0011\u0011\u0001\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003Ȉ\u0004\n\u0005ည\u0002\u0006ለ\u0003\u0007ည\u0004\bለ\u0005\tဉ\u0006\n\u0007\u000bለ\u0007\fည\b\rည\t\u000eည\n\u000fለ\u000b\u00102\u0011ለ\f", new Object[]{"bitField0_", "clientInfo_", "privacy_", "idfi_", "sessionId_", "cache_", "legacyFlowUserConsent_", "auid_", "analyticsUserId_", "deviceInfo_", "isFirstInit_", "auidString_", "uadsInitBlob_", "unityInstallationId_", "unityMegaSessionId_", "externalUserIdentifier_", "extras_", a.a, "unityBuildGuid_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (InitializationRequest.class) {
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

        public String getAnalyticsUserId() {
            return this.analyticsUserId_;
        }

        public ByteString getAnalyticsUserIdBytes() {
            return ByteString.copyFromUtf8(this.analyticsUserId_);
        }

        public ByteString getAuid() {
            return this.auid_;
        }

        public String getAuidString() {
            return this.auidString_;
        }

        public ByteString getAuidStringBytes() {
            return ByteString.copyFromUtf8(this.auidString_);
        }

        public ByteString getCache() {
            return this.cache_;
        }

        public ClientInfoOuterClass.ClientInfo getClientInfo() {
            ClientInfoOuterClass.ClientInfo clientInfo = this.clientInfo_;
            return clientInfo == null ? ClientInfoOuterClass.ClientInfo.getDefaultInstance() : clientInfo;
        }

        public InitializationDeviceInfo getDeviceInfo() {
            InitializationDeviceInfo initializationDeviceInfo = this.deviceInfo_;
            return initializationDeviceInfo == null ? InitializationDeviceInfo.getDefaultInstance() : initializationDeviceInfo;
        }

        public String getExternalUserIdentifier() {
            return this.externalUserIdentifier_;
        }

        public ByteString getExternalUserIdentifierBytes() {
            return ByteString.copyFromUtf8(this.externalUserIdentifier_);
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

        public String getIdfi() {
            return this.idfi_;
        }

        public ByteString getIdfiBytes() {
            return ByteString.copyFromUtf8(this.idfi_);
        }

        public boolean getIsFirstInit() {
            return this.isFirstInit_;
        }

        public String getLegacyFlowUserConsent() {
            return this.legacyFlowUserConsent_;
        }

        public ByteString getLegacyFlowUserConsentBytes() {
            return ByteString.copyFromUtf8(this.legacyFlowUserConsent_);
        }

        public ByteString getPrivacy() {
            return this.privacy_;
        }

        public ByteString getSessionId() {
            return this.sessionId_;
        }

        public ByteString getUadsInitBlob() {
            return this.uadsInitBlob_;
        }

        public String getUnityBuildGuid() {
            return this.unityBuildGuid_;
        }

        public ByteString getUnityBuildGuidBytes() {
            return ByteString.copyFromUtf8(this.unityBuildGuid_);
        }

        public ByteString getUnityInstallationId() {
            return this.unityInstallationId_;
        }

        public ByteString getUnityMegaSessionId() {
            return this.unityMegaSessionId_;
        }

        public boolean hasAnalyticsUserId() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasAuid() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasAuidString() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasCache() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasClientInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasDeviceInfo() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasExternalUserIdentifier() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasLegacyFlowUserConsent() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasPrivacy() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasUadsInitBlob() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasUnityBuildGuid() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasUnityInstallationId() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasUnityMegaSessionId() {
            return (this.bitField0_ & 1024) != 0;
        }

        public static Builder newBuilder(InitializationRequest initializationRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(initializationRequest);
        }

        public static InitializationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InitializationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static InitializationRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static InitializationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static InitializationRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static InitializationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static InitializationRequest parseFrom(InputStream inputStream) throws IOException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitializationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InitializationRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static InitializationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface InitializationRequestOrBuilder extends MessageLiteOrBuilder {
        boolean containsExtras(String str);

        String getAnalyticsUserId();

        ByteString getAnalyticsUserIdBytes();

        ByteString getAuid();

        String getAuidString();

        ByteString getAuidStringBytes();

        ByteString getCache();

        ClientInfoOuterClass.ClientInfo getClientInfo();

        InitializationDeviceInfo getDeviceInfo();

        String getExternalUserIdentifier();

        ByteString getExternalUserIdentifierBytes();

        @Deprecated
        Map getExtras();

        int getExtrasCount();

        Map getExtrasMap();

        String getExtrasOrDefault(String str, String str2);

        String getExtrasOrThrow(String str);

        String getIdfi();

        ByteString getIdfiBytes();

        boolean getIsFirstInit();

        String getLegacyFlowUserConsent();

        ByteString getLegacyFlowUserConsentBytes();

        ByteString getPrivacy();

        ByteString getSessionId();

        ByteString getUadsInitBlob();

        String getUnityBuildGuid();

        ByteString getUnityBuildGuidBytes();

        ByteString getUnityInstallationId();

        ByteString getUnityMegaSessionId();

        boolean hasAnalyticsUserId();

        boolean hasAuid();

        boolean hasAuidString();

        boolean hasCache();

        boolean hasClientInfo();

        boolean hasDeviceInfo();

        boolean hasExternalUserIdentifier();

        boolean hasLegacyFlowUserConsent();

        boolean hasPrivacy();

        boolean hasUadsInitBlob();

        boolean hasUnityBuildGuid();

        boolean hasUnityInstallationId();

        boolean hasUnityMegaSessionId();
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

    private InitializationRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
