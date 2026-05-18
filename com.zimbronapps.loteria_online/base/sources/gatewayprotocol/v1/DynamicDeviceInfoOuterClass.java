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
import gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DynamicDeviceInfoOuterClass {

    public enum ConnectionType implements Internal.EnumLite {
        CONNECTION_TYPE_UNSPECIFIED(0),
        CONNECTION_TYPE_WIFI(1),
        CONNECTION_TYPE_CELLULAR(2),
        UNRECOGNIZED(-1);

        public static final int CONNECTION_TYPE_CELLULAR_VALUE = 2;
        public static final int CONNECTION_TYPE_UNSPECIFIED_VALUE = 0;
        public static final int CONNECTION_TYPE_WIFI_VALUE = 1;
        private static final Internal.EnumLiteMap internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ConnectionType findValueByNumber(int i) {
                return ConnectionType.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier a = new b();

            public boolean isInRange(int i) {
                return ConnectionType.forNumber(i) != null;
            }
        }

        ConnectionType(int i) {
            this.value = i;
        }

        public static ConnectionType forNumber(int i) {
            if (i == 0) {
                return CONNECTION_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return CONNECTION_TYPE_WIFI;
            }
            if (i != 2) {
                return null;
            }
            return CONNECTION_TYPE_CELLULAR;
        }

        public static Internal.EnumLiteMap internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.a;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static ConnectionType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class DynamicDeviceInfo extends GeneratedMessageLite implements DynamicDeviceInfoOrBuilder {
        public static final int ANDROID_FIELD_NUMBER = 12;
        public static final int APP_ACTIVE_FIELD_NUMBER = 17;
        public static final int BATTERY_LEVEL_FIELD_NUMBER = 14;
        public static final int BATTERY_STATUS_FIELD_NUMBER = 15;
        public static final int CONNECTION_TYPE_FIELD_NUMBER = 16;
        private static final DynamicDeviceInfo DEFAULT_INSTANCE;
        public static final int FREE_DISK_SPACE_FIELD_NUMBER = 5;
        public static final int FREE_RAM_MEMORY_FIELD_NUMBER = 6;
        public static final int IOS_FIELD_NUMBER = 13;
        public static final int LANGUAGE_FIELD_NUMBER = 1;
        public static final int LIMITED_OPEN_AD_TRACKING_FIELD_NUMBER = 11;
        public static final int LIMITED_TRACKING_FIELD_NUMBER = 10;
        public static final int LOW_POWER_MODE_FIELD_NUMBER = 18;
        public static final int NETWORK_OPERATOR_FIELD_NUMBER = 2;
        public static final int NETWORK_OPERATOR_NAME_FIELD_NUMBER = 3;
        private static volatile Parser PARSER = null;
        public static final int SCREEN_HEIGHT_FIELD_NUMBER = 21;
        public static final int SCREEN_WIDTH_FIELD_NUMBER = 20;
        public static final int TIME_ZONE_FIELD_NUMBER = 8;
        public static final int TIME_ZONE_OFFSET_FIELD_NUMBER = 9;
        public static final int USER_ID_FIELD_NUMBER = 19;
        public static final int WIRED_HEADSET_FIELD_NUMBER = 7;
        private boolean appActive_;
        private double batteryLevel_;
        private int batteryStatus_;
        private int bitField0_;
        private int connectionType_;
        private long freeDiskSpace_;
        private long freeRamMemory_;
        private boolean limitedOpenAdTracking_;
        private boolean limitedTracking_;
        private boolean lowPowerMode_;
        private Object platformSpecific_;
        private int screenHeight_;
        private int screenWidth_;
        private long timeZoneOffset_;
        private boolean wiredHeadset_;
        private int platformSpecificCase_ = 0;
        private String language_ = "";
        private String networkOperator_ = "";
        private String networkOperatorName_ = "";
        private String timeZone_ = "";
        private String userId_ = "";

        public static final class Android extends GeneratedMessageLite implements AndroidOrBuilder {
            public static final int ADB_ENABLED_FIELD_NUMBER = 5;
            public static final int AIRPLANE_MODE_FIELD_NUMBER = 11;
            public static final int CHARGING_TYPE_FIELD_NUMBER = 15;
            private static final Android DEFAULT_INSTANCE;
            public static final int DEVICE_ELAPSED_REALTIME_FIELD_NUMBER = 10;
            public static final int DEVICE_UP_TIME_FIELD_NUMBER = 9;
            public static final int FREE_DISK_SPACE_INTERNAL_FIELD_NUMBER = 16;
            public static final int MAX_VOLUME_FIELD_NUMBER = 8;
            public static final int NETWORK_CAPABILITY_TRANSPORTS_FIELD_NUMBER = 14;
            public static final int NETWORK_CONNECTED_FIELD_NUMBER = 1;
            public static final int NETWORK_METERED_FIELD_NUMBER = 3;
            public static final int NETWORK_TYPE_FIELD_NUMBER = 2;
            private static volatile Parser PARSER = null;
            public static final int SCREEN_BRIGHTNESS_FIELD_NUMBER = 17;
            public static final int SD_CARD_PRESENT_FIELD_NUMBER = 13;
            public static final int STAY_ON_WHILE_PLUGGED_IN_FIELD_NUMBER = 12;
            public static final int TELEPHONY_MANAGER_NETWORK_TYPE_FIELD_NUMBER = 4;
            public static final int USB_CONNECTED_FIELD_NUMBER = 6;
            public static final int VOLUME_FIELD_NUMBER = 7;
            private boolean adbEnabled_;
            private boolean airplaneMode_;
            private int bitField0_;
            private int chargingType_;
            private long deviceElapsedRealtime_;
            private long deviceUpTime_;
            private long freeDiskSpaceInternal_;
            private double maxVolume_;
            private NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports_;
            private boolean networkConnected_;
            private boolean networkMetered_;
            private int networkType_;
            private double screenBrightness_;
            private boolean sdCardPresent_;
            private boolean stayOnWhilePluggedIn_;
            private int telephonyManagerNetworkType_;
            private boolean usbConnected_;
            private double volume_;

            public static final class Builder extends GeneratedMessageLite.Builder implements AndroidOrBuilder {
                public /* synthetic */ Builder(a aVar) {
                    this();
                }

                public Builder clearAdbEnabled() {
                    copyOnWrite();
                    Android.access$1000((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearAirplaneMode() {
                    copyOnWrite();
                    Android.access$2200((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearChargingType() {
                    copyOnWrite();
                    Android.access$3100((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearDeviceElapsedRealtime() {
                    copyOnWrite();
                    Android.access$2000((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearDeviceUpTime() {
                    copyOnWrite();
                    Android.access$1800((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearFreeDiskSpaceInternal() {
                    copyOnWrite();
                    Android.access$3300((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearMaxVolume() {
                    copyOnWrite();
                    Android.access$1600((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearNetworkCapabilityTransports() {
                    copyOnWrite();
                    Android.access$2900((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearNetworkConnected() {
                    copyOnWrite();
                    Android.access$200((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearNetworkMetered() {
                    copyOnWrite();
                    Android.access$600((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearNetworkType() {
                    copyOnWrite();
                    Android.access$400((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearScreenBrightness() {
                    copyOnWrite();
                    Android.access$3500((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearSdCardPresent() {
                    copyOnWrite();
                    Android.access$2600((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearStayOnWhilePluggedIn() {
                    copyOnWrite();
                    Android.access$2400((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearTelephonyManagerNetworkType() {
                    copyOnWrite();
                    Android.access$800((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearUsbConnected() {
                    copyOnWrite();
                    Android.access$1200((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearVolume() {
                    copyOnWrite();
                    Android.access$1400((Android) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public boolean getAdbEnabled() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getAdbEnabled();
                }

                public boolean getAirplaneMode() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getAirplaneMode();
                }

                public int getChargingType() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getChargingType();
                }

                public long getDeviceElapsedRealtime() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getDeviceElapsedRealtime();
                }

                public long getDeviceUpTime() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getDeviceUpTime();
                }

                public long getFreeDiskSpaceInternal() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getFreeDiskSpaceInternal();
                }

                public double getMaxVolume() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getMaxVolume();
                }

                public NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransports() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getNetworkCapabilityTransports();
                }

                public boolean getNetworkConnected() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getNetworkConnected();
                }

                public boolean getNetworkMetered() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getNetworkMetered();
                }

                public int getNetworkType() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getNetworkType();
                }

                public double getScreenBrightness() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getScreenBrightness();
                }

                public boolean getSdCardPresent() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getSdCardPresent();
                }

                public boolean getStayOnWhilePluggedIn() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getStayOnWhilePluggedIn();
                }

                public int getTelephonyManagerNetworkType() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getTelephonyManagerNetworkType();
                }

                public boolean getUsbConnected() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getUsbConnected();
                }

                public double getVolume() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).getVolume();
                }

                public boolean hasAdbEnabled() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasAdbEnabled();
                }

                public boolean hasAirplaneMode() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasAirplaneMode();
                }

                public boolean hasChargingType() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasChargingType();
                }

                public boolean hasDeviceElapsedRealtime() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasDeviceElapsedRealtime();
                }

                public boolean hasDeviceUpTime() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasDeviceUpTime();
                }

                public boolean hasFreeDiskSpaceInternal() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasFreeDiskSpaceInternal();
                }

                public boolean hasMaxVolume() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasMaxVolume();
                }

                public boolean hasNetworkCapabilityTransports() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasNetworkCapabilityTransports();
                }

                public boolean hasNetworkConnected() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasNetworkConnected();
                }

                public boolean hasNetworkMetered() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasNetworkMetered();
                }

                public boolean hasNetworkType() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasNetworkType();
                }

                public boolean hasScreenBrightness() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasScreenBrightness();
                }

                public boolean hasSdCardPresent() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasSdCardPresent();
                }

                public boolean hasStayOnWhilePluggedIn() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasStayOnWhilePluggedIn();
                }

                public boolean hasTelephonyManagerNetworkType() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasTelephonyManagerNetworkType();
                }

                public boolean hasUsbConnected() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasUsbConnected();
                }

                public boolean hasVolume() {
                    return ((Android) ((GeneratedMessageLite.Builder) this).instance).hasVolume();
                }

                public Builder mergeNetworkCapabilityTransports(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports) {
                    copyOnWrite();
                    Android.access$2800((Android) ((GeneratedMessageLite.Builder) this).instance, networkCapabilityTransports);
                    return this;
                }

                public Builder setAdbEnabled(boolean z) {
                    copyOnWrite();
                    Android.access$900((Android) ((GeneratedMessageLite.Builder) this).instance, z);
                    return this;
                }

                public Builder setAirplaneMode(boolean z) {
                    copyOnWrite();
                    Android.access$2100((Android) ((GeneratedMessageLite.Builder) this).instance, z);
                    return this;
                }

                public Builder setChargingType(int i) {
                    copyOnWrite();
                    Android.access$3000((Android) ((GeneratedMessageLite.Builder) this).instance, i);
                    return this;
                }

                public Builder setDeviceElapsedRealtime(long j) {
                    copyOnWrite();
                    Android.access$1900((Android) ((GeneratedMessageLite.Builder) this).instance, j);
                    return this;
                }

                public Builder setDeviceUpTime(long j) {
                    copyOnWrite();
                    Android.access$1700((Android) ((GeneratedMessageLite.Builder) this).instance, j);
                    return this;
                }

                public Builder setFreeDiskSpaceInternal(long j) {
                    copyOnWrite();
                    Android.access$3200((Android) ((GeneratedMessageLite.Builder) this).instance, j);
                    return this;
                }

                public Builder setMaxVolume(double d) {
                    copyOnWrite();
                    Android.access$1500((Android) ((GeneratedMessageLite.Builder) this).instance, d);
                    return this;
                }

                public Builder setNetworkCapabilityTransports(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports) {
                    copyOnWrite();
                    Android.access$2700((Android) ((GeneratedMessageLite.Builder) this).instance, networkCapabilityTransports);
                    return this;
                }

                public Builder setNetworkConnected(boolean z) {
                    copyOnWrite();
                    Android.access$100((Android) ((GeneratedMessageLite.Builder) this).instance, z);
                    return this;
                }

                public Builder setNetworkMetered(boolean z) {
                    copyOnWrite();
                    Android.access$500((Android) ((GeneratedMessageLite.Builder) this).instance, z);
                    return this;
                }

                public Builder setNetworkType(int i) {
                    copyOnWrite();
                    Android.access$300((Android) ((GeneratedMessageLite.Builder) this).instance, i);
                    return this;
                }

                public Builder setScreenBrightness(double d) {
                    copyOnWrite();
                    Android.access$3400((Android) ((GeneratedMessageLite.Builder) this).instance, d);
                    return this;
                }

                public Builder setSdCardPresent(boolean z) {
                    copyOnWrite();
                    Android.access$2500((Android) ((GeneratedMessageLite.Builder) this).instance, z);
                    return this;
                }

                public Builder setStayOnWhilePluggedIn(boolean z) {
                    copyOnWrite();
                    Android.access$2300((Android) ((GeneratedMessageLite.Builder) this).instance, z);
                    return this;
                }

                public Builder setTelephonyManagerNetworkType(int i) {
                    copyOnWrite();
                    Android.access$700((Android) ((GeneratedMessageLite.Builder) this).instance, i);
                    return this;
                }

                public Builder setUsbConnected(boolean z) {
                    copyOnWrite();
                    Android.access$1100((Android) ((GeneratedMessageLite.Builder) this).instance, z);
                    return this;
                }

                public Builder setVolume(double d) {
                    copyOnWrite();
                    Android.access$1300((Android) ((GeneratedMessageLite.Builder) this).instance, d);
                    return this;
                }

                private Builder() {
                    super(Android.access$000());
                }

                public Builder setNetworkCapabilityTransports(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder builder) {
                    copyOnWrite();
                    Android.access$2700((Android) ((GeneratedMessageLite.Builder) this).instance, (NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) builder.build());
                    return this;
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

            public static /* synthetic */ void access$100(Android android, boolean z) {
                android.setNetworkConnected(z);
            }

            public static /* synthetic */ void access$1000(Android android) {
                android.clearAdbEnabled();
            }

            public static /* synthetic */ void access$1100(Android android, boolean z) {
                android.setUsbConnected(z);
            }

            public static /* synthetic */ void access$1200(Android android) {
                android.clearUsbConnected();
            }

            public static /* synthetic */ void access$1300(Android android, double d) {
                android.setVolume(d);
            }

            public static /* synthetic */ void access$1400(Android android) {
                android.clearVolume();
            }

            public static /* synthetic */ void access$1500(Android android, double d) {
                android.setMaxVolume(d);
            }

            public static /* synthetic */ void access$1600(Android android) {
                android.clearMaxVolume();
            }

            public static /* synthetic */ void access$1700(Android android, long j) {
                android.setDeviceUpTime(j);
            }

            public static /* synthetic */ void access$1800(Android android) {
                android.clearDeviceUpTime();
            }

            public static /* synthetic */ void access$1900(Android android, long j) {
                android.setDeviceElapsedRealtime(j);
            }

            public static /* synthetic */ void access$200(Android android) {
                android.clearNetworkConnected();
            }

            public static /* synthetic */ void access$2000(Android android) {
                android.clearDeviceElapsedRealtime();
            }

            public static /* synthetic */ void access$2100(Android android, boolean z) {
                android.setAirplaneMode(z);
            }

            public static /* synthetic */ void access$2200(Android android) {
                android.clearAirplaneMode();
            }

            public static /* synthetic */ void access$2300(Android android, boolean z) {
                android.setStayOnWhilePluggedIn(z);
            }

            public static /* synthetic */ void access$2400(Android android) {
                android.clearStayOnWhilePluggedIn();
            }

            public static /* synthetic */ void access$2500(Android android, boolean z) {
                android.setSdCardPresent(z);
            }

            public static /* synthetic */ void access$2600(Android android) {
                android.clearSdCardPresent();
            }

            public static /* synthetic */ void access$2700(Android android, NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports) {
                android.setNetworkCapabilityTransports(networkCapabilityTransports);
            }

            public static /* synthetic */ void access$2800(Android android, NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports) {
                android.mergeNetworkCapabilityTransports(networkCapabilityTransports);
            }

            public static /* synthetic */ void access$2900(Android android) {
                android.clearNetworkCapabilityTransports();
            }

            public static /* synthetic */ void access$300(Android android, int i) {
                android.setNetworkType(i);
            }

            public static /* synthetic */ void access$3000(Android android, int i) {
                android.setChargingType(i);
            }

            public static /* synthetic */ void access$3100(Android android) {
                android.clearChargingType();
            }

            public static /* synthetic */ void access$3200(Android android, long j) {
                android.setFreeDiskSpaceInternal(j);
            }

            public static /* synthetic */ void access$3300(Android android) {
                android.clearFreeDiskSpaceInternal();
            }

            public static /* synthetic */ void access$3400(Android android, double d) {
                android.setScreenBrightness(d);
            }

            public static /* synthetic */ void access$3500(Android android) {
                android.clearScreenBrightness();
            }

            public static /* synthetic */ void access$400(Android android) {
                android.clearNetworkType();
            }

            public static /* synthetic */ void access$500(Android android, boolean z) {
                android.setNetworkMetered(z);
            }

            public static /* synthetic */ void access$600(Android android) {
                android.clearNetworkMetered();
            }

            public static /* synthetic */ void access$700(Android android, int i) {
                android.setTelephonyManagerNetworkType(i);
            }

            public static /* synthetic */ void access$800(Android android) {
                android.clearTelephonyManagerNetworkType();
            }

            public static /* synthetic */ void access$900(Android android, boolean z) {
                android.setAdbEnabled(z);
            }

            private void clearAdbEnabled() {
                this.bitField0_ &= -17;
                this.adbEnabled_ = false;
            }

            private void clearAirplaneMode() {
                this.bitField0_ &= -1025;
                this.airplaneMode_ = false;
            }

            private void clearChargingType() {
                this.bitField0_ &= -16385;
                this.chargingType_ = 0;
            }

            private void clearDeviceElapsedRealtime() {
                this.bitField0_ &= -513;
                this.deviceElapsedRealtime_ = 0L;
            }

            private void clearDeviceUpTime() {
                this.bitField0_ &= -257;
                this.deviceUpTime_ = 0L;
            }

            private void clearFreeDiskSpaceInternal() {
                this.bitField0_ &= -32769;
                this.freeDiskSpaceInternal_ = 0L;
            }

            private void clearMaxVolume() {
                this.bitField0_ &= -129;
                this.maxVolume_ = 0.0d;
            }

            private void clearNetworkCapabilityTransports() {
                this.networkCapabilityTransports_ = null;
                this.bitField0_ &= -8193;
            }

            private void clearNetworkConnected() {
                this.bitField0_ &= -2;
                this.networkConnected_ = false;
            }

            private void clearNetworkMetered() {
                this.bitField0_ &= -5;
                this.networkMetered_ = false;
            }

            private void clearNetworkType() {
                this.bitField0_ &= -3;
                this.networkType_ = 0;
            }

            private void clearScreenBrightness() {
                this.bitField0_ &= -65537;
                this.screenBrightness_ = 0.0d;
            }

            private void clearSdCardPresent() {
                this.bitField0_ &= -4097;
                this.sdCardPresent_ = false;
            }

            private void clearStayOnWhilePluggedIn() {
                this.bitField0_ &= -2049;
                this.stayOnWhilePluggedIn_ = false;
            }

            private void clearTelephonyManagerNetworkType() {
                this.bitField0_ &= -9;
                this.telephonyManagerNetworkType_ = 0;
            }

            private void clearUsbConnected() {
                this.bitField0_ &= -33;
                this.usbConnected_ = false;
            }

            private void clearVolume() {
                this.bitField0_ &= -65;
                this.volume_ = 0.0d;
            }

            public static Android getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeNetworkCapabilityTransports(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports) {
                networkCapabilityTransports.getClass();
                NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports2 = this.networkCapabilityTransports_;
                if (networkCapabilityTransports2 == null || networkCapabilityTransports2 == NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getDefaultInstance()) {
                    this.networkCapabilityTransports_ = networkCapabilityTransports;
                } else {
                    this.networkCapabilityTransports_ = (NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) ((NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder) NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.newBuilder(this.networkCapabilityTransports_).mergeFrom(networkCapabilityTransports)).buildPartial();
                }
                this.bitField0_ |= 8192;
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

            private void setAdbEnabled(boolean z) {
                this.bitField0_ |= 16;
                this.adbEnabled_ = z;
            }

            private void setAirplaneMode(boolean z) {
                this.bitField0_ |= 1024;
                this.airplaneMode_ = z;
            }

            private void setChargingType(int i) {
                this.bitField0_ |= 16384;
                this.chargingType_ = i;
            }

            private void setDeviceElapsedRealtime(long j) {
                this.bitField0_ |= 512;
                this.deviceElapsedRealtime_ = j;
            }

            private void setDeviceUpTime(long j) {
                this.bitField0_ |= 256;
                this.deviceUpTime_ = j;
            }

            private void setFreeDiskSpaceInternal(long j) {
                this.bitField0_ |= 32768;
                this.freeDiskSpaceInternal_ = j;
            }

            private void setMaxVolume(double d) {
                this.bitField0_ |= 128;
                this.maxVolume_ = d;
            }

            private void setNetworkCapabilityTransports(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports) {
                networkCapabilityTransports.getClass();
                this.networkCapabilityTransports_ = networkCapabilityTransports;
                this.bitField0_ |= 8192;
            }

            private void setNetworkConnected(boolean z) {
                this.bitField0_ |= 1;
                this.networkConnected_ = z;
            }

            private void setNetworkMetered(boolean z) {
                this.bitField0_ |= 4;
                this.networkMetered_ = z;
            }

            private void setNetworkType(int i) {
                this.bitField0_ |= 2;
                this.networkType_ = i;
            }

            private void setScreenBrightness(double d) {
                this.bitField0_ |= 65536;
                this.screenBrightness_ = d;
            }

            private void setSdCardPresent(boolean z) {
                this.bitField0_ |= 4096;
                this.sdCardPresent_ = z;
            }

            private void setStayOnWhilePluggedIn(boolean z) {
                this.bitField0_ |= 2048;
                this.stayOnWhilePluggedIn_ = z;
            }

            private void setTelephonyManagerNetworkType(int i) {
                this.bitField0_ |= 8;
                this.telephonyManagerNetworkType_ = i;
            }

            private void setUsbConnected(boolean z) {
                this.bitField0_ |= 32;
                this.usbConnected_ = z;
            }

            private void setVolume(double d) {
                this.bitField0_ |= 64;
                this.volume_ = d;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (a.a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Android();
                    case 2:
                        return new Builder(null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007က\u0006\bက\u0007\tဂ\b\nဂ\t\u000bဇ\n\fဇ\u000b\rဇ\f\u000eဉ\r\u000fင\u000e\u0010ဂ\u000f\u0011က\u0010", new Object[]{"bitField0_", "networkConnected_", "networkType_", "networkMetered_", "telephonyManagerNetworkType_", "adbEnabled_", "usbConnected_", "volume_", "maxVolume_", "deviceUpTime_", "deviceElapsedRealtime_", "airplaneMode_", "stayOnWhilePluggedIn_", "sdCardPresent_", "networkCapabilityTransports_", "chargingType_", "freeDiskSpaceInternal_", "screenBrightness_"});
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

            public boolean getAdbEnabled() {
                return this.adbEnabled_;
            }

            public boolean getAirplaneMode() {
                return this.airplaneMode_;
            }

            public int getChargingType() {
                return this.chargingType_;
            }

            public long getDeviceElapsedRealtime() {
                return this.deviceElapsedRealtime_;
            }

            public long getDeviceUpTime() {
                return this.deviceUpTime_;
            }

            public long getFreeDiskSpaceInternal() {
                return this.freeDiskSpaceInternal_;
            }

            public double getMaxVolume() {
                return this.maxVolume_;
            }

            public NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransports() {
                NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports = this.networkCapabilityTransports_;
                return networkCapabilityTransports == null ? NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getDefaultInstance() : networkCapabilityTransports;
            }

            public boolean getNetworkConnected() {
                return this.networkConnected_;
            }

            public boolean getNetworkMetered() {
                return this.networkMetered_;
            }

            public int getNetworkType() {
                return this.networkType_;
            }

            public double getScreenBrightness() {
                return this.screenBrightness_;
            }

            public boolean getSdCardPresent() {
                return this.sdCardPresent_;
            }

            public boolean getStayOnWhilePluggedIn() {
                return this.stayOnWhilePluggedIn_;
            }

            public int getTelephonyManagerNetworkType() {
                return this.telephonyManagerNetworkType_;
            }

            public boolean getUsbConnected() {
                return this.usbConnected_;
            }

            public double getVolume() {
                return this.volume_;
            }

            public boolean hasAdbEnabled() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasAirplaneMode() {
                return (this.bitField0_ & 1024) != 0;
            }

            public boolean hasChargingType() {
                return (this.bitField0_ & 16384) != 0;
            }

            public boolean hasDeviceElapsedRealtime() {
                return (this.bitField0_ & 512) != 0;
            }

            public boolean hasDeviceUpTime() {
                return (this.bitField0_ & 256) != 0;
            }

            public boolean hasFreeDiskSpaceInternal() {
                return (this.bitField0_ & 32768) != 0;
            }

            public boolean hasMaxVolume() {
                return (this.bitField0_ & 128) != 0;
            }

            public boolean hasNetworkCapabilityTransports() {
                return (this.bitField0_ & 8192) != 0;
            }

            public boolean hasNetworkConnected() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasNetworkMetered() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasNetworkType() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasScreenBrightness() {
                return (this.bitField0_ & 65536) != 0;
            }

            public boolean hasSdCardPresent() {
                return (this.bitField0_ & 4096) != 0;
            }

            public boolean hasStayOnWhilePluggedIn() {
                return (this.bitField0_ & 2048) != 0;
            }

            public boolean hasTelephonyManagerNetworkType() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasUsbConnected() {
                return (this.bitField0_ & 32) != 0;
            }

            public boolean hasVolume() {
                return (this.bitField0_ & 64) != 0;
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
            boolean getAdbEnabled();

            boolean getAirplaneMode();

            int getChargingType();

            long getDeviceElapsedRealtime();

            long getDeviceUpTime();

            long getFreeDiskSpaceInternal();

            double getMaxVolume();

            NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransports();

            boolean getNetworkConnected();

            boolean getNetworkMetered();

            int getNetworkType();

            double getScreenBrightness();

            boolean getSdCardPresent();

            boolean getStayOnWhilePluggedIn();

            int getTelephonyManagerNetworkType();

            boolean getUsbConnected();

            double getVolume();

            boolean hasAdbEnabled();

            boolean hasAirplaneMode();

            boolean hasChargingType();

            boolean hasDeviceElapsedRealtime();

            boolean hasDeviceUpTime();

            boolean hasFreeDiskSpaceInternal();

            boolean hasMaxVolume();

            boolean hasNetworkCapabilityTransports();

            boolean hasNetworkConnected();

            boolean hasNetworkMetered();

            boolean hasNetworkType();

            boolean hasScreenBrightness();

            boolean hasSdCardPresent();

            boolean hasStayOnWhilePluggedIn();

            boolean hasTelephonyManagerNetworkType();

            boolean hasUsbConnected();

            boolean hasVolume();
        }

        public static final class Builder extends GeneratedMessageLite.Builder implements DynamicDeviceInfoOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearAndroid() {
                copyOnWrite();
                DynamicDeviceInfo.access$11500((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearAppActive() {
                copyOnWrite();
                DynamicDeviceInfo.access$10300((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearBatteryLevel() {
                copyOnWrite();
                DynamicDeviceInfo.access$9600((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearBatteryStatus() {
                copyOnWrite();
                DynamicDeviceInfo.access$9800((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearConnectionType() {
                copyOnWrite();
                DynamicDeviceInfo.access$10100((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearFreeDiskSpace() {
                copyOnWrite();
                DynamicDeviceInfo.access$8100((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearFreeRamMemory() {
                copyOnWrite();
                DynamicDeviceInfo.access$8300((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearIos() {
                copyOnWrite();
                DynamicDeviceInfo.access$11800((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearLanguage() {
                copyOnWrite();
                DynamicDeviceInfo.access$7200((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearLimitedOpenAdTracking() {
                copyOnWrite();
                DynamicDeviceInfo.access$9400((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearLimitedTracking() {
                copyOnWrite();
                DynamicDeviceInfo.access$9200((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearLowPowerMode() {
                copyOnWrite();
                DynamicDeviceInfo.access$10500((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearNetworkOperator() {
                copyOnWrite();
                DynamicDeviceInfo.access$7500((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearNetworkOperatorName() {
                copyOnWrite();
                DynamicDeviceInfo.access$7800((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearPlatformSpecific() {
                copyOnWrite();
                DynamicDeviceInfo.access$7000((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearScreenHeight() {
                copyOnWrite();
                DynamicDeviceInfo.access$11200((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearScreenWidth() {
                copyOnWrite();
                DynamicDeviceInfo.access$11000((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTimeZone() {
                copyOnWrite();
                DynamicDeviceInfo.access$8700((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTimeZoneOffset() {
                copyOnWrite();
                DynamicDeviceInfo.access$9000((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                DynamicDeviceInfo.access$10700((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearWiredHeadset() {
                copyOnWrite();
                DynamicDeviceInfo.access$8500((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Android getAndroid() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getAndroid();
            }

            public boolean getAppActive() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getAppActive();
            }

            public double getBatteryLevel() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getBatteryLevel();
            }

            public int getBatteryStatus() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getBatteryStatus();
            }

            public ConnectionType getConnectionType() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getConnectionType();
            }

            public int getConnectionTypeValue() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getConnectionTypeValue();
            }

            public long getFreeDiskSpace() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getFreeDiskSpace();
            }

            public long getFreeRamMemory() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getFreeRamMemory();
            }

            public Ios getIos() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getIos();
            }

            public String getLanguage() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getLanguage();
            }

            public ByteString getLanguageBytes() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getLanguageBytes();
            }

            public boolean getLimitedOpenAdTracking() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getLimitedOpenAdTracking();
            }

            public boolean getLimitedTracking() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getLimitedTracking();
            }

            public boolean getLowPowerMode() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getLowPowerMode();
            }

            public String getNetworkOperator() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getNetworkOperator();
            }

            public ByteString getNetworkOperatorBytes() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getNetworkOperatorBytes();
            }

            public String getNetworkOperatorName() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getNetworkOperatorName();
            }

            public ByteString getNetworkOperatorNameBytes() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getNetworkOperatorNameBytes();
            }

            public PlatformSpecificCase getPlatformSpecificCase() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getPlatformSpecificCase();
            }

            public int getScreenHeight() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getScreenHeight();
            }

            public int getScreenWidth() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getScreenWidth();
            }

            public String getTimeZone() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getTimeZone();
            }

            public ByteString getTimeZoneBytes() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getTimeZoneBytes();
            }

            public long getTimeZoneOffset() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getTimeZoneOffset();
            }

            public String getUserId() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getUserId();
            }

            public ByteString getUserIdBytes() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getUserIdBytes();
            }

            public boolean getWiredHeadset() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).getWiredHeadset();
            }

            public boolean hasAndroid() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasAndroid();
            }

            public boolean hasAppActive() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasAppActive();
            }

            public boolean hasBatteryLevel() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasBatteryLevel();
            }

            public boolean hasBatteryStatus() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasBatteryStatus();
            }

            public boolean hasConnectionType() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasConnectionType();
            }

            public boolean hasFreeDiskSpace() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasFreeDiskSpace();
            }

            public boolean hasFreeRamMemory() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasFreeRamMemory();
            }

            public boolean hasIos() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasIos();
            }

            public boolean hasLanguage() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasLanguage();
            }

            public boolean hasLimitedOpenAdTracking() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasLimitedOpenAdTracking();
            }

            public boolean hasLimitedTracking() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasLimitedTracking();
            }

            public boolean hasLowPowerMode() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasLowPowerMode();
            }

            public boolean hasNetworkOperator() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasNetworkOperator();
            }

            public boolean hasNetworkOperatorName() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasNetworkOperatorName();
            }

            public boolean hasScreenHeight() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasScreenHeight();
            }

            public boolean hasScreenWidth() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasScreenWidth();
            }

            public boolean hasTimeZone() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasTimeZone();
            }

            public boolean hasTimeZoneOffset() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasTimeZoneOffset();
            }

            public boolean hasUserId() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasUserId();
            }

            public boolean hasWiredHeadset() {
                return ((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance).hasWiredHeadset();
            }

            public Builder mergeAndroid(Android android) {
                copyOnWrite();
                DynamicDeviceInfo.access$11400((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, android);
                return this;
            }

            public Builder mergeIos(Ios ios) {
                copyOnWrite();
                DynamicDeviceInfo.access$11700((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, ios);
                return this;
            }

            public Builder setAndroid(Android android) {
                copyOnWrite();
                DynamicDeviceInfo.access$11300((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, android);
                return this;
            }

            public Builder setAppActive(boolean z) {
                copyOnWrite();
                DynamicDeviceInfo.access$10200((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setBatteryLevel(double d) {
                copyOnWrite();
                DynamicDeviceInfo.access$9500((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, d);
                return this;
            }

            public Builder setBatteryStatus(int i) {
                copyOnWrite();
                DynamicDeviceInfo.access$9700((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setConnectionType(ConnectionType connectionType) {
                copyOnWrite();
                DynamicDeviceInfo.access$10000((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, connectionType);
                return this;
            }

            public Builder setConnectionTypeValue(int i) {
                copyOnWrite();
                DynamicDeviceInfo.access$9900((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setFreeDiskSpace(long j) {
                copyOnWrite();
                DynamicDeviceInfo.access$8000((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, j);
                return this;
            }

            public Builder setFreeRamMemory(long j) {
                copyOnWrite();
                DynamicDeviceInfo.access$8200((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, j);
                return this;
            }

            public Builder setIos(Ios ios) {
                copyOnWrite();
                DynamicDeviceInfo.access$11600((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, ios);
                return this;
            }

            public Builder setLanguage(String str) {
                copyOnWrite();
                DynamicDeviceInfo.access$7100((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setLanguageBytes(ByteString byteString) {
                copyOnWrite();
                DynamicDeviceInfo.access$7300((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setLimitedOpenAdTracking(boolean z) {
                copyOnWrite();
                DynamicDeviceInfo.access$9300((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setLimitedTracking(boolean z) {
                copyOnWrite();
                DynamicDeviceInfo.access$9100((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setLowPowerMode(boolean z) {
                copyOnWrite();
                DynamicDeviceInfo.access$10400((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setNetworkOperator(String str) {
                copyOnWrite();
                DynamicDeviceInfo.access$7400((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setNetworkOperatorBytes(ByteString byteString) {
                copyOnWrite();
                DynamicDeviceInfo.access$7600((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setNetworkOperatorName(String str) {
                copyOnWrite();
                DynamicDeviceInfo.access$7700((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setNetworkOperatorNameBytes(ByteString byteString) {
                copyOnWrite();
                DynamicDeviceInfo.access$7900((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setScreenHeight(int i) {
                copyOnWrite();
                DynamicDeviceInfo.access$11100((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setScreenWidth(int i) {
                copyOnWrite();
                DynamicDeviceInfo.access$10900((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setTimeZone(String str) {
                copyOnWrite();
                DynamicDeviceInfo.access$8600((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setTimeZoneBytes(ByteString byteString) {
                copyOnWrite();
                DynamicDeviceInfo.access$8800((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setTimeZoneOffset(long j) {
                copyOnWrite();
                DynamicDeviceInfo.access$8900((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, j);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                DynamicDeviceInfo.access$10600((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                DynamicDeviceInfo.access$10800((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setWiredHeadset(boolean z) {
                copyOnWrite();
                DynamicDeviceInfo.access$8400((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            private Builder() {
                super(DynamicDeviceInfo.access$6900());
            }

            public Builder setAndroid(Android.Builder builder) {
                copyOnWrite();
                DynamicDeviceInfo.access$11300((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, (Android) builder.build());
                return this;
            }

            public Builder setIos(Ios.Builder builder) {
                copyOnWrite();
                DynamicDeviceInfo.access$11600((DynamicDeviceInfo) ((GeneratedMessageLite.Builder) this).instance, (Ios) builder.build());
                return this;
            }
        }

        public static final class Ios extends GeneratedMessageLite implements IosOrBuilder {
            public static final int CURRENT_RADIO_ACCESS_TECHNOLOGY_FIELD_NUMBER = 1;
            public static final int CURRENT_UI_THEME_FIELD_NUMBER = 5;
            private static final Ios DEFAULT_INSTANCE;
            public static final int DEVICE_NAME_FIELD_NUMBER = 6;
            public static final int DEVICE_UP_TIME_WITHOUT_SLEEP_FIELD_NUMBER = 10;
            public static final int DEVICE_UP_TIME_WITH_SLEEP_FIELD_NUMBER = 9;
            public static final int LOCALE_LIST_FIELD_NUMBER = 4;
            public static final int NETWORK_REACHABILITY_FLAGS_FIELD_NUMBER = 2;
            public static final int NW_PATH_INTERFACES_FIELD_NUMBER = 3;
            private static volatile Parser PARSER = null;
            public static final int SCREEN_BRIGHTNESS_FIELD_NUMBER = 11;
            public static final int TRACKING_AUTH_STATUS_FIELD_NUMBER = 8;
            public static final int VOLUME_FIELD_NUMBER = 7;
            private int bitField0_;
            private int currentUiTheme_;
            private long deviceUpTimeWithSleep_;
            private long deviceUpTimeWithoutSleep_;
            private int networkReachabilityFlags_;
            private double screenBrightness_;
            private int trackingAuthStatus_;
            private double volume_;
            private String currentRadioAccessTechnology_ = "";
            private Internal.ProtobufList nwPathInterfaces_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.ProtobufList localeList_ = GeneratedMessageLite.emptyProtobufList();
            private String deviceName_ = "";

            public static final class Builder extends GeneratedMessageLite.Builder implements IosOrBuilder {
                public /* synthetic */ Builder(a aVar) {
                    this();
                }

                public Builder addAllLocaleList(Iterable iterable) {
                    copyOnWrite();
                    Ios.access$5000((Ios) ((GeneratedMessageLite.Builder) this).instance, iterable);
                    return this;
                }

                public Builder addAllNwPathInterfaces(Iterable iterable) {
                    copyOnWrite();
                    Ios.access$4500((Ios) ((GeneratedMessageLite.Builder) this).instance, iterable);
                    return this;
                }

                public Builder addLocaleList(String str) {
                    copyOnWrite();
                    Ios.access$4900((Ios) ((GeneratedMessageLite.Builder) this).instance, str);
                    return this;
                }

                public Builder addLocaleListBytes(ByteString byteString) {
                    copyOnWrite();
                    Ios.access$5200((Ios) ((GeneratedMessageLite.Builder) this).instance, byteString);
                    return this;
                }

                public Builder addNwPathInterfaces(String str) {
                    copyOnWrite();
                    Ios.access$4400((Ios) ((GeneratedMessageLite.Builder) this).instance, str);
                    return this;
                }

                public Builder addNwPathInterfacesBytes(ByteString byteString) {
                    copyOnWrite();
                    Ios.access$4700((Ios) ((GeneratedMessageLite.Builder) this).instance, byteString);
                    return this;
                }

                public Builder clearCurrentRadioAccessTechnology() {
                    copyOnWrite();
                    Ios.access$3900((Ios) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearCurrentUiTheme() {
                    copyOnWrite();
                    Ios.access$5400((Ios) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearDeviceName() {
                    copyOnWrite();
                    Ios.access$5600((Ios) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearDeviceUpTimeWithSleep() {
                    copyOnWrite();
                    Ios.access$6300((Ios) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearDeviceUpTimeWithoutSleep() {
                    copyOnWrite();
                    Ios.access$6500((Ios) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearLocaleList() {
                    copyOnWrite();
                    Ios.access$5100((Ios) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearNetworkReachabilityFlags() {
                    copyOnWrite();
                    Ios.access$4200((Ios) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearNwPathInterfaces() {
                    copyOnWrite();
                    Ios.access$4600((Ios) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearScreenBrightness() {
                    copyOnWrite();
                    Ios.access$6700((Ios) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearTrackingAuthStatus() {
                    copyOnWrite();
                    Ios.access$6100((Ios) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearVolume() {
                    copyOnWrite();
                    Ios.access$5900((Ios) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public String getCurrentRadioAccessTechnology() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getCurrentRadioAccessTechnology();
                }

                public ByteString getCurrentRadioAccessTechnologyBytes() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getCurrentRadioAccessTechnologyBytes();
                }

                public int getCurrentUiTheme() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getCurrentUiTheme();
                }

                public String getDeviceName() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getDeviceName();
                }

                public ByteString getDeviceNameBytes() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getDeviceNameBytes();
                }

                public long getDeviceUpTimeWithSleep() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getDeviceUpTimeWithSleep();
                }

                public long getDeviceUpTimeWithoutSleep() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getDeviceUpTimeWithoutSleep();
                }

                public String getLocaleList(int i) {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getLocaleList(i);
                }

                public ByteString getLocaleListBytes(int i) {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getLocaleListBytes(i);
                }

                public int getLocaleListCount() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getLocaleListCount();
                }

                public List getLocaleListList() {
                    return Collections.unmodifiableList(((Ios) ((GeneratedMessageLite.Builder) this).instance).getLocaleListList());
                }

                public int getNetworkReachabilityFlags() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getNetworkReachabilityFlags();
                }

                public String getNwPathInterfaces(int i) {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getNwPathInterfaces(i);
                }

                public ByteString getNwPathInterfacesBytes(int i) {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getNwPathInterfacesBytes(i);
                }

                public int getNwPathInterfacesCount() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getNwPathInterfacesCount();
                }

                public List getNwPathInterfacesList() {
                    return Collections.unmodifiableList(((Ios) ((GeneratedMessageLite.Builder) this).instance).getNwPathInterfacesList());
                }

                public double getScreenBrightness() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getScreenBrightness();
                }

                public int getTrackingAuthStatus() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getTrackingAuthStatus();
                }

                public double getVolume() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).getVolume();
                }

                public boolean hasCurrentRadioAccessTechnology() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).hasCurrentRadioAccessTechnology();
                }

                public boolean hasCurrentUiTheme() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).hasCurrentUiTheme();
                }

                public boolean hasDeviceName() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).hasDeviceName();
                }

                public boolean hasDeviceUpTimeWithSleep() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).hasDeviceUpTimeWithSleep();
                }

                public boolean hasDeviceUpTimeWithoutSleep() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).hasDeviceUpTimeWithoutSleep();
                }

                public boolean hasNetworkReachabilityFlags() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).hasNetworkReachabilityFlags();
                }

                public boolean hasScreenBrightness() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).hasScreenBrightness();
                }

                public boolean hasTrackingAuthStatus() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).hasTrackingAuthStatus();
                }

                public boolean hasVolume() {
                    return ((Ios) ((GeneratedMessageLite.Builder) this).instance).hasVolume();
                }

                public Builder setCurrentRadioAccessTechnology(String str) {
                    copyOnWrite();
                    Ios.access$3800((Ios) ((GeneratedMessageLite.Builder) this).instance, str);
                    return this;
                }

                public Builder setCurrentRadioAccessTechnologyBytes(ByteString byteString) {
                    copyOnWrite();
                    Ios.access$4000((Ios) ((GeneratedMessageLite.Builder) this).instance, byteString);
                    return this;
                }

                public Builder setCurrentUiTheme(int i) {
                    copyOnWrite();
                    Ios.access$5300((Ios) ((GeneratedMessageLite.Builder) this).instance, i);
                    return this;
                }

                public Builder setDeviceName(String str) {
                    copyOnWrite();
                    Ios.access$5500((Ios) ((GeneratedMessageLite.Builder) this).instance, str);
                    return this;
                }

                public Builder setDeviceNameBytes(ByteString byteString) {
                    copyOnWrite();
                    Ios.access$5700((Ios) ((GeneratedMessageLite.Builder) this).instance, byteString);
                    return this;
                }

                public Builder setDeviceUpTimeWithSleep(long j) {
                    copyOnWrite();
                    Ios.access$6200((Ios) ((GeneratedMessageLite.Builder) this).instance, j);
                    return this;
                }

                public Builder setDeviceUpTimeWithoutSleep(long j) {
                    copyOnWrite();
                    Ios.access$6400((Ios) ((GeneratedMessageLite.Builder) this).instance, j);
                    return this;
                }

                public Builder setLocaleList(int i, String str) {
                    copyOnWrite();
                    Ios.access$4800((Ios) ((GeneratedMessageLite.Builder) this).instance, i, str);
                    return this;
                }

                public Builder setNetworkReachabilityFlags(int i) {
                    copyOnWrite();
                    Ios.access$4100((Ios) ((GeneratedMessageLite.Builder) this).instance, i);
                    return this;
                }

                public Builder setNwPathInterfaces(int i, String str) {
                    copyOnWrite();
                    Ios.access$4300((Ios) ((GeneratedMessageLite.Builder) this).instance, i, str);
                    return this;
                }

                public Builder setScreenBrightness(double d) {
                    copyOnWrite();
                    Ios.access$6600((Ios) ((GeneratedMessageLite.Builder) this).instance, d);
                    return this;
                }

                public Builder setTrackingAuthStatus(int i) {
                    copyOnWrite();
                    Ios.access$6000((Ios) ((GeneratedMessageLite.Builder) this).instance, i);
                    return this;
                }

                public Builder setVolume(double d) {
                    copyOnWrite();
                    Ios.access$5800((Ios) ((GeneratedMessageLite.Builder) this).instance, d);
                    return this;
                }

                private Builder() {
                    super(Ios.access$3700());
                }
            }

            static {
                Ios ios = new Ios();
                DEFAULT_INSTANCE = ios;
                GeneratedMessageLite.registerDefaultInstance(Ios.class, ios);
            }

            private Ios() {
            }

            public static /* synthetic */ Ios access$3700() {
                return DEFAULT_INSTANCE;
            }

            public static /* synthetic */ void access$3800(Ios ios, String str) {
                ios.setCurrentRadioAccessTechnology(str);
            }

            public static /* synthetic */ void access$3900(Ios ios) {
                ios.clearCurrentRadioAccessTechnology();
            }

            public static /* synthetic */ void access$4000(Ios ios, ByteString byteString) {
                ios.setCurrentRadioAccessTechnologyBytes(byteString);
            }

            public static /* synthetic */ void access$4100(Ios ios, int i) {
                ios.setNetworkReachabilityFlags(i);
            }

            public static /* synthetic */ void access$4200(Ios ios) {
                ios.clearNetworkReachabilityFlags();
            }

            public static /* synthetic */ void access$4300(Ios ios, int i, String str) {
                ios.setNwPathInterfaces(i, str);
            }

            public static /* synthetic */ void access$4400(Ios ios, String str) {
                ios.addNwPathInterfaces(str);
            }

            public static /* synthetic */ void access$4500(Ios ios, Iterable iterable) {
                ios.addAllNwPathInterfaces(iterable);
            }

            public static /* synthetic */ void access$4600(Ios ios) {
                ios.clearNwPathInterfaces();
            }

            public static /* synthetic */ void access$4700(Ios ios, ByteString byteString) {
                ios.addNwPathInterfacesBytes(byteString);
            }

            public static /* synthetic */ void access$4800(Ios ios, int i, String str) {
                ios.setLocaleList(i, str);
            }

            public static /* synthetic */ void access$4900(Ios ios, String str) {
                ios.addLocaleList(str);
            }

            public static /* synthetic */ void access$5000(Ios ios, Iterable iterable) {
                ios.addAllLocaleList(iterable);
            }

            public static /* synthetic */ void access$5100(Ios ios) {
                ios.clearLocaleList();
            }

            public static /* synthetic */ void access$5200(Ios ios, ByteString byteString) {
                ios.addLocaleListBytes(byteString);
            }

            public static /* synthetic */ void access$5300(Ios ios, int i) {
                ios.setCurrentUiTheme(i);
            }

            public static /* synthetic */ void access$5400(Ios ios) {
                ios.clearCurrentUiTheme();
            }

            public static /* synthetic */ void access$5500(Ios ios, String str) {
                ios.setDeviceName(str);
            }

            public static /* synthetic */ void access$5600(Ios ios) {
                ios.clearDeviceName();
            }

            public static /* synthetic */ void access$5700(Ios ios, ByteString byteString) {
                ios.setDeviceNameBytes(byteString);
            }

            public static /* synthetic */ void access$5800(Ios ios, double d) {
                ios.setVolume(d);
            }

            public static /* synthetic */ void access$5900(Ios ios) {
                ios.clearVolume();
            }

            public static /* synthetic */ void access$6000(Ios ios, int i) {
                ios.setTrackingAuthStatus(i);
            }

            public static /* synthetic */ void access$6100(Ios ios) {
                ios.clearTrackingAuthStatus();
            }

            public static /* synthetic */ void access$6200(Ios ios, long j) {
                ios.setDeviceUpTimeWithSleep(j);
            }

            public static /* synthetic */ void access$6300(Ios ios) {
                ios.clearDeviceUpTimeWithSleep();
            }

            public static /* synthetic */ void access$6400(Ios ios, long j) {
                ios.setDeviceUpTimeWithoutSleep(j);
            }

            public static /* synthetic */ void access$6500(Ios ios) {
                ios.clearDeviceUpTimeWithoutSleep();
            }

            public static /* synthetic */ void access$6600(Ios ios, double d) {
                ios.setScreenBrightness(d);
            }

            public static /* synthetic */ void access$6700(Ios ios) {
                ios.clearScreenBrightness();
            }

            private void addAllLocaleList(Iterable iterable) {
                ensureLocaleListIsMutable();
                AbstractMessageLite.addAll(iterable, this.localeList_);
            }

            private void addAllNwPathInterfaces(Iterable iterable) {
                ensureNwPathInterfacesIsMutable();
                AbstractMessageLite.addAll(iterable, this.nwPathInterfaces_);
            }

            private void addLocaleList(String str) {
                str.getClass();
                ensureLocaleListIsMutable();
                this.localeList_.add(str);
            }

            private void addLocaleListBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                ensureLocaleListIsMutable();
                this.localeList_.add(byteString.toStringUtf8());
            }

            private void addNwPathInterfaces(String str) {
                str.getClass();
                ensureNwPathInterfacesIsMutable();
                this.nwPathInterfaces_.add(str);
            }

            private void addNwPathInterfacesBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                ensureNwPathInterfacesIsMutable();
                this.nwPathInterfaces_.add(byteString.toStringUtf8());
            }

            private void clearCurrentRadioAccessTechnology() {
                this.bitField0_ &= -2;
                this.currentRadioAccessTechnology_ = getDefaultInstance().getCurrentRadioAccessTechnology();
            }

            private void clearCurrentUiTheme() {
                this.bitField0_ &= -5;
                this.currentUiTheme_ = 0;
            }

            private void clearDeviceName() {
                this.bitField0_ &= -9;
                this.deviceName_ = getDefaultInstance().getDeviceName();
            }

            private void clearDeviceUpTimeWithSleep() {
                this.bitField0_ &= -65;
                this.deviceUpTimeWithSleep_ = 0L;
            }

            private void clearDeviceUpTimeWithoutSleep() {
                this.bitField0_ &= -129;
                this.deviceUpTimeWithoutSleep_ = 0L;
            }

            private void clearLocaleList() {
                this.localeList_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearNetworkReachabilityFlags() {
                this.bitField0_ &= -3;
                this.networkReachabilityFlags_ = 0;
            }

            private void clearNwPathInterfaces() {
                this.nwPathInterfaces_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearScreenBrightness() {
                this.bitField0_ &= -257;
                this.screenBrightness_ = 0.0d;
            }

            private void clearTrackingAuthStatus() {
                this.bitField0_ &= -33;
                this.trackingAuthStatus_ = 0;
            }

            private void clearVolume() {
                this.bitField0_ &= -17;
                this.volume_ = 0.0d;
            }

            private void ensureLocaleListIsMutable() {
                Internal.ProtobufList protobufList = this.localeList_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.localeList_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureNwPathInterfacesIsMutable() {
                Internal.ProtobufList protobufList = this.nwPathInterfaces_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.nwPathInterfaces_ = GeneratedMessageLite.mutableCopy(protobufList);
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

            private void setCurrentRadioAccessTechnology(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.currentRadioAccessTechnology_ = str;
            }

            private void setCurrentRadioAccessTechnologyBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.currentRadioAccessTechnology_ = byteString.toStringUtf8();
                this.bitField0_ |= 1;
            }

            private void setCurrentUiTheme(int i) {
                this.bitField0_ |= 4;
                this.currentUiTheme_ = i;
            }

            private void setDeviceName(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.deviceName_ = str;
            }

            private void setDeviceNameBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.deviceName_ = byteString.toStringUtf8();
                this.bitField0_ |= 8;
            }

            private void setDeviceUpTimeWithSleep(long j) {
                this.bitField0_ |= 64;
                this.deviceUpTimeWithSleep_ = j;
            }

            private void setDeviceUpTimeWithoutSleep(long j) {
                this.bitField0_ |= 128;
                this.deviceUpTimeWithoutSleep_ = j;
            }

            private void setLocaleList(int i, String str) {
                str.getClass();
                ensureLocaleListIsMutable();
                this.localeList_.set(i, str);
            }

            private void setNetworkReachabilityFlags(int i) {
                this.bitField0_ |= 2;
                this.networkReachabilityFlags_ = i;
            }

            private void setNwPathInterfaces(int i, String str) {
                str.getClass();
                ensureNwPathInterfacesIsMutable();
                this.nwPathInterfaces_.set(i, str);
            }

            private void setScreenBrightness(double d) {
                this.bitField0_ |= 256;
                this.screenBrightness_ = d;
            }

            private void setTrackingAuthStatus(int i) {
                this.bitField0_ |= 32;
                this.trackingAuthStatus_ = i;
            }

            private void setVolume(double d) {
                this.bitField0_ |= 16;
                this.volume_ = d;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (a.a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Ios();
                    case 2:
                        return new Builder(null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\u0000\u0001ለ\u0000\u0002ဋ\u0001\u0003Ț\u0004Ț\u0005င\u0002\u0006ለ\u0003\u0007က\u0004\bင\u0005\tဂ\u0006\nဂ\u0007\u000bက\b", new Object[]{"bitField0_", "currentRadioAccessTechnology_", "networkReachabilityFlags_", "nwPathInterfaces_", "localeList_", "currentUiTheme_", "deviceName_", "volume_", "trackingAuthStatus_", "deviceUpTimeWithSleep_", "deviceUpTimeWithoutSleep_", "screenBrightness_"});
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

            public String getCurrentRadioAccessTechnology() {
                return this.currentRadioAccessTechnology_;
            }

            public ByteString getCurrentRadioAccessTechnologyBytes() {
                return ByteString.copyFromUtf8(this.currentRadioAccessTechnology_);
            }

            public int getCurrentUiTheme() {
                return this.currentUiTheme_;
            }

            public String getDeviceName() {
                return this.deviceName_;
            }

            public ByteString getDeviceNameBytes() {
                return ByteString.copyFromUtf8(this.deviceName_);
            }

            public long getDeviceUpTimeWithSleep() {
                return this.deviceUpTimeWithSleep_;
            }

            public long getDeviceUpTimeWithoutSleep() {
                return this.deviceUpTimeWithoutSleep_;
            }

            public String getLocaleList(int i) {
                return (String) this.localeList_.get(i);
            }

            public ByteString getLocaleListBytes(int i) {
                return ByteString.copyFromUtf8((String) this.localeList_.get(i));
            }

            public int getLocaleListCount() {
                return this.localeList_.size();
            }

            public List getLocaleListList() {
                return this.localeList_;
            }

            public int getNetworkReachabilityFlags() {
                return this.networkReachabilityFlags_;
            }

            public String getNwPathInterfaces(int i) {
                return (String) this.nwPathInterfaces_.get(i);
            }

            public ByteString getNwPathInterfacesBytes(int i) {
                return ByteString.copyFromUtf8((String) this.nwPathInterfaces_.get(i));
            }

            public int getNwPathInterfacesCount() {
                return this.nwPathInterfaces_.size();
            }

            public List getNwPathInterfacesList() {
                return this.nwPathInterfaces_;
            }

            public double getScreenBrightness() {
                return this.screenBrightness_;
            }

            public int getTrackingAuthStatus() {
                return this.trackingAuthStatus_;
            }

            public double getVolume() {
                return this.volume_;
            }

            public boolean hasCurrentRadioAccessTechnology() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasCurrentUiTheme() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasDeviceName() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasDeviceUpTimeWithSleep() {
                return (this.bitField0_ & 64) != 0;
            }

            public boolean hasDeviceUpTimeWithoutSleep() {
                return (this.bitField0_ & 128) != 0;
            }

            public boolean hasNetworkReachabilityFlags() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasScreenBrightness() {
                return (this.bitField0_ & 256) != 0;
            }

            public boolean hasTrackingAuthStatus() {
                return (this.bitField0_ & 32) != 0;
            }

            public boolean hasVolume() {
                return (this.bitField0_ & 16) != 0;
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
            String getCurrentRadioAccessTechnology();

            ByteString getCurrentRadioAccessTechnologyBytes();

            int getCurrentUiTheme();

            String getDeviceName();

            ByteString getDeviceNameBytes();

            long getDeviceUpTimeWithSleep();

            long getDeviceUpTimeWithoutSleep();

            String getLocaleList(int i);

            ByteString getLocaleListBytes(int i);

            int getLocaleListCount();

            List getLocaleListList();

            int getNetworkReachabilityFlags();

            String getNwPathInterfaces(int i);

            ByteString getNwPathInterfacesBytes(int i);

            int getNwPathInterfacesCount();

            List getNwPathInterfacesList();

            double getScreenBrightness();

            int getTrackingAuthStatus();

            double getVolume();

            boolean hasCurrentRadioAccessTechnology();

            boolean hasCurrentUiTheme();

            boolean hasDeviceName();

            boolean hasDeviceUpTimeWithSleep();

            boolean hasDeviceUpTimeWithoutSleep();

            boolean hasNetworkReachabilityFlags();

            boolean hasScreenBrightness();

            boolean hasTrackingAuthStatus();

            boolean hasVolume();
        }

        public enum PlatformSpecificCase {
            ANDROID(12),
            IOS(13),
            PLATFORMSPECIFIC_NOT_SET(0);

            private final int value;

            PlatformSpecificCase(int i) {
                this.value = i;
            }

            public static PlatformSpecificCase forNumber(int i) {
                if (i == 0) {
                    return PLATFORMSPECIFIC_NOT_SET;
                }
                if (i == 12) {
                    return ANDROID;
                }
                if (i != 13) {
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
            DynamicDeviceInfo dynamicDeviceInfo = new DynamicDeviceInfo();
            DEFAULT_INSTANCE = dynamicDeviceInfo;
            GeneratedMessageLite.registerDefaultInstance(DynamicDeviceInfo.class, dynamicDeviceInfo);
        }

        private DynamicDeviceInfo() {
        }

        public static /* synthetic */ void access$10000(DynamicDeviceInfo dynamicDeviceInfo, ConnectionType connectionType) {
            dynamicDeviceInfo.setConnectionType(connectionType);
        }

        public static /* synthetic */ void access$10100(DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.clearConnectionType();
        }

        public static /* synthetic */ void access$10200(DynamicDeviceInfo dynamicDeviceInfo, boolean z) {
            dynamicDeviceInfo.setAppActive(z);
        }

        public static /* synthetic */ void access$10300(DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.clearAppActive();
        }

        public static /* synthetic */ void access$10400(DynamicDeviceInfo dynamicDeviceInfo, boolean z) {
            dynamicDeviceInfo.setLowPowerMode(z);
        }

        public static /* synthetic */ void access$10500(DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.clearLowPowerMode();
        }

        public static /* synthetic */ void access$10600(DynamicDeviceInfo dynamicDeviceInfo, String str) {
            dynamicDeviceInfo.setUserId(str);
        }

        public static /* synthetic */ void access$10700(DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.clearUserId();
        }

        public static /* synthetic */ void access$10800(DynamicDeviceInfo dynamicDeviceInfo, ByteString byteString) {
            dynamicDeviceInfo.setUserIdBytes(byteString);
        }

        public static /* synthetic */ void access$10900(DynamicDeviceInfo dynamicDeviceInfo, int i) {
            dynamicDeviceInfo.setScreenWidth(i);
        }

        public static /* synthetic */ void access$11000(DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.clearScreenWidth();
        }

        public static /* synthetic */ void access$11100(DynamicDeviceInfo dynamicDeviceInfo, int i) {
            dynamicDeviceInfo.setScreenHeight(i);
        }

        public static /* synthetic */ void access$11200(DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.clearScreenHeight();
        }

        public static /* synthetic */ void access$11300(DynamicDeviceInfo dynamicDeviceInfo, Android android) {
            dynamicDeviceInfo.setAndroid(android);
        }

        public static /* synthetic */ void access$11400(DynamicDeviceInfo dynamicDeviceInfo, Android android) {
            dynamicDeviceInfo.mergeAndroid(android);
        }

        public static /* synthetic */ void access$11500(DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.clearAndroid();
        }

        public static /* synthetic */ void access$11600(DynamicDeviceInfo dynamicDeviceInfo, Ios ios) {
            dynamicDeviceInfo.setIos(ios);
        }

        public static /* synthetic */ void access$11700(DynamicDeviceInfo dynamicDeviceInfo, Ios ios) {
            dynamicDeviceInfo.mergeIos(ios);
        }

        public static /* synthetic */ void access$11800(DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.clearIos();
        }

        public static /* synthetic */ DynamicDeviceInfo access$6900() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$7000(DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.clearPlatformSpecific();
        }

        public static /* synthetic */ void access$7100(DynamicDeviceInfo dynamicDeviceInfo, String str) {
            dynamicDeviceInfo.setLanguage(str);
        }

        public static /* synthetic */ void access$7200(DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.clearLanguage();
        }

        public static /* synthetic */ void access$7300(DynamicDeviceInfo dynamicDeviceInfo, ByteString byteString) {
            dynamicDeviceInfo.setLanguageBytes(byteString);
        }

        public static /* synthetic */ void access$7400(DynamicDeviceInfo dynamicDeviceInfo, String str) {
            dynamicDeviceInfo.setNetworkOperator(str);
        }

        public static /* synthetic */ void access$7500(DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.clearNetworkOperator();
        }

        public static /* synthetic */ void access$7600(DynamicDeviceInfo dynamicDeviceInfo, ByteString byteString) {
            dynamicDeviceInfo.setNetworkOperatorBytes(byteString);
        }

        public static /* synthetic */ void access$7700(DynamicDeviceInfo dynamicDeviceInfo, String str) {
            dynamicDeviceInfo.setNetworkOperatorName(str);
        }

        public static /* synthetic */ void access$7800(DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.clearNetworkOperatorName();
        }

        public static /* synthetic */ void access$7900(DynamicDeviceInfo dynamicDeviceInfo, ByteString byteString) {
            dynamicDeviceInfo.setNetworkOperatorNameBytes(byteString);
        }

        public static /* synthetic */ void access$8000(DynamicDeviceInfo dynamicDeviceInfo, long j) {
            dynamicDeviceInfo.setFreeDiskSpace(j);
        }

        public static /* synthetic */ void access$8100(DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.clearFreeDiskSpace();
        }

        public static /* synthetic */ void access$8200(DynamicDeviceInfo dynamicDeviceInfo, long j) {
            dynamicDeviceInfo.setFreeRamMemory(j);
        }

        public static /* synthetic */ void access$8300(DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.clearFreeRamMemory();
        }

        public static /* synthetic */ void access$8400(DynamicDeviceInfo dynamicDeviceInfo, boolean z) {
            dynamicDeviceInfo.setWiredHeadset(z);
        }

        public static /* synthetic */ void access$8500(DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.clearWiredHeadset();
        }

        public static /* synthetic */ void access$8600(DynamicDeviceInfo dynamicDeviceInfo, String str) {
            dynamicDeviceInfo.setTimeZone(str);
        }

        public static /* synthetic */ void access$8700(DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.clearTimeZone();
        }

        public static /* synthetic */ void access$8800(DynamicDeviceInfo dynamicDeviceInfo, ByteString byteString) {
            dynamicDeviceInfo.setTimeZoneBytes(byteString);
        }

        public static /* synthetic */ void access$8900(DynamicDeviceInfo dynamicDeviceInfo, long j) {
            dynamicDeviceInfo.setTimeZoneOffset(j);
        }

        public static /* synthetic */ void access$9000(DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.clearTimeZoneOffset();
        }

        public static /* synthetic */ void access$9100(DynamicDeviceInfo dynamicDeviceInfo, boolean z) {
            dynamicDeviceInfo.setLimitedTracking(z);
        }

        public static /* synthetic */ void access$9200(DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.clearLimitedTracking();
        }

        public static /* synthetic */ void access$9300(DynamicDeviceInfo dynamicDeviceInfo, boolean z) {
            dynamicDeviceInfo.setLimitedOpenAdTracking(z);
        }

        public static /* synthetic */ void access$9400(DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.clearLimitedOpenAdTracking();
        }

        public static /* synthetic */ void access$9500(DynamicDeviceInfo dynamicDeviceInfo, double d) {
            dynamicDeviceInfo.setBatteryLevel(d);
        }

        public static /* synthetic */ void access$9600(DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.clearBatteryLevel();
        }

        public static /* synthetic */ void access$9700(DynamicDeviceInfo dynamicDeviceInfo, int i) {
            dynamicDeviceInfo.setBatteryStatus(i);
        }

        public static /* synthetic */ void access$9800(DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.clearBatteryStatus();
        }

        public static /* synthetic */ void access$9900(DynamicDeviceInfo dynamicDeviceInfo, int i) {
            dynamicDeviceInfo.setConnectionTypeValue(i);
        }

        private void clearAndroid() {
            if (this.platformSpecificCase_ == 12) {
                this.platformSpecificCase_ = 0;
                this.platformSpecific_ = null;
            }
        }

        private void clearAppActive() {
            this.bitField0_ &= -8193;
            this.appActive_ = false;
        }

        private void clearBatteryLevel() {
            this.bitField0_ &= -1025;
            this.batteryLevel_ = 0.0d;
        }

        private void clearBatteryStatus() {
            this.bitField0_ &= -2049;
            this.batteryStatus_ = 0;
        }

        private void clearConnectionType() {
            this.bitField0_ &= -4097;
            this.connectionType_ = 0;
        }

        private void clearFreeDiskSpace() {
            this.bitField0_ &= -9;
            this.freeDiskSpace_ = 0L;
        }

        private void clearFreeRamMemory() {
            this.bitField0_ &= -17;
            this.freeRamMemory_ = 0L;
        }

        private void clearIos() {
            if (this.platformSpecificCase_ == 13) {
                this.platformSpecificCase_ = 0;
                this.platformSpecific_ = null;
            }
        }

        private void clearLanguage() {
            this.bitField0_ &= -2;
            this.language_ = getDefaultInstance().getLanguage();
        }

        private void clearLimitedOpenAdTracking() {
            this.bitField0_ &= -513;
            this.limitedOpenAdTracking_ = false;
        }

        private void clearLimitedTracking() {
            this.bitField0_ &= -257;
            this.limitedTracking_ = false;
        }

        private void clearLowPowerMode() {
            this.bitField0_ &= -16385;
            this.lowPowerMode_ = false;
        }

        private void clearNetworkOperator() {
            this.bitField0_ &= -3;
            this.networkOperator_ = getDefaultInstance().getNetworkOperator();
        }

        private void clearNetworkOperatorName() {
            this.bitField0_ &= -5;
            this.networkOperatorName_ = getDefaultInstance().getNetworkOperatorName();
        }

        private void clearPlatformSpecific() {
            this.platformSpecificCase_ = 0;
            this.platformSpecific_ = null;
        }

        private void clearScreenHeight() {
            this.bitField0_ &= -131073;
            this.screenHeight_ = 0;
        }

        private void clearScreenWidth() {
            this.bitField0_ &= -65537;
            this.screenWidth_ = 0;
        }

        private void clearTimeZone() {
            this.bitField0_ &= -65;
            this.timeZone_ = getDefaultInstance().getTimeZone();
        }

        private void clearTimeZoneOffset() {
            this.bitField0_ &= -129;
            this.timeZoneOffset_ = 0L;
        }

        private void clearUserId() {
            this.bitField0_ &= -32769;
            this.userId_ = getDefaultInstance().getUserId();
        }

        private void clearWiredHeadset() {
            this.bitField0_ &= -33;
            this.wiredHeadset_ = false;
        }

        public static DynamicDeviceInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeAndroid(Android android) {
            android.getClass();
            if (this.platformSpecificCase_ != 12 || this.platformSpecific_ == Android.getDefaultInstance()) {
                this.platformSpecific_ = android;
            } else {
                this.platformSpecific_ = ((Android.Builder) Android.newBuilder((Android) this.platformSpecific_).mergeFrom(android)).buildPartial();
            }
            this.platformSpecificCase_ = 12;
        }

        private void mergeIos(Ios ios) {
            ios.getClass();
            if (this.platformSpecificCase_ != 13 || this.platformSpecific_ == Ios.getDefaultInstance()) {
                this.platformSpecific_ = ios;
            } else {
                this.platformSpecific_ = ((Ios.Builder) Ios.newBuilder((Ios) this.platformSpecific_).mergeFrom(ios)).buildPartial();
            }
            this.platformSpecificCase_ = 13;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DynamicDeviceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DynamicDeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DynamicDeviceInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAndroid(Android android) {
            android.getClass();
            this.platformSpecific_ = android;
            this.platformSpecificCase_ = 12;
        }

        private void setAppActive(boolean z) {
            this.bitField0_ |= 8192;
            this.appActive_ = z;
        }

        private void setBatteryLevel(double d) {
            this.bitField0_ |= 1024;
            this.batteryLevel_ = d;
        }

        private void setBatteryStatus(int i) {
            this.bitField0_ |= 2048;
            this.batteryStatus_ = i;
        }

        private void setConnectionType(ConnectionType connectionType) {
            this.connectionType_ = connectionType.getNumber();
            this.bitField0_ |= 4096;
        }

        private void setConnectionTypeValue(int i) {
            this.bitField0_ |= 4096;
            this.connectionType_ = i;
        }

        private void setFreeDiskSpace(long j) {
            this.bitField0_ |= 8;
            this.freeDiskSpace_ = j;
        }

        private void setFreeRamMemory(long j) {
            this.bitField0_ |= 16;
            this.freeRamMemory_ = j;
        }

        private void setIos(Ios ios) {
            ios.getClass();
            this.platformSpecific_ = ios;
            this.platformSpecificCase_ = 13;
        }

        private void setLanguage(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.language_ = str;
        }

        private void setLanguageBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.language_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setLimitedOpenAdTracking(boolean z) {
            this.bitField0_ |= 512;
            this.limitedOpenAdTracking_ = z;
        }

        private void setLimitedTracking(boolean z) {
            this.bitField0_ |= 256;
            this.limitedTracking_ = z;
        }

        private void setLowPowerMode(boolean z) {
            this.bitField0_ |= 16384;
            this.lowPowerMode_ = z;
        }

        private void setNetworkOperator(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.networkOperator_ = str;
        }

        private void setNetworkOperatorBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.networkOperator_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        private void setNetworkOperatorName(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.networkOperatorName_ = str;
        }

        private void setNetworkOperatorNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.networkOperatorName_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        private void setScreenHeight(int i) {
            this.bitField0_ |= 131072;
            this.screenHeight_ = i;
        }

        private void setScreenWidth(int i) {
            this.bitField0_ |= 65536;
            this.screenWidth_ = i;
        }

        private void setTimeZone(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.timeZone_ = str;
        }

        private void setTimeZoneBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.timeZone_ = byteString.toStringUtf8();
            this.bitField0_ |= 64;
        }

        private void setTimeZoneOffset(long j) {
            this.bitField0_ |= 128;
            this.timeZoneOffset_ = j;
        }

        private void setUserId(String str) {
            str.getClass();
            this.bitField0_ |= 32768;
            this.userId_ = str;
        }

        private void setUserIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
            this.bitField0_ |= 32768;
        }

        private void setWiredHeadset(boolean z) {
            this.bitField0_ |= 32;
            this.wiredHeadset_ = z;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new DynamicDeviceInfo();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0001\u0001\u0001\u0015\u0014\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0005ဂ\u0003\u0006ဂ\u0004\u0007ဇ\u0005\bለ\u0006\tဂ\u0007\nဇ\b\u000bဇ\t\f<\u0000\r<\u0000\u000eက\n\u000fင\u000b\u0010ဌ\f\u0011ဇ\r\u0012ဇ\u000e\u0013ለ\u000f\u0014ဋ\u0010\u0015ဋ\u0011", new Object[]{"platformSpecific_", "platformSpecificCase_", "bitField0_", "language_", "networkOperator_", "networkOperatorName_", "freeDiskSpace_", "freeRamMemory_", "wiredHeadset_", "timeZone_", "timeZoneOffset_", "limitedTracking_", "limitedOpenAdTracking_", Android.class, Ios.class, "batteryLevel_", "batteryStatus_", "connectionType_", "appActive_", "lowPowerMode_", "userId_", "screenWidth_", "screenHeight_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (DynamicDeviceInfo.class) {
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
            return this.platformSpecificCase_ == 12 ? (Android) this.platformSpecific_ : Android.getDefaultInstance();
        }

        public boolean getAppActive() {
            return this.appActive_;
        }

        public double getBatteryLevel() {
            return this.batteryLevel_;
        }

        public int getBatteryStatus() {
            return this.batteryStatus_;
        }

        public ConnectionType getConnectionType() {
            ConnectionType forNumber = ConnectionType.forNumber(this.connectionType_);
            return forNumber == null ? ConnectionType.UNRECOGNIZED : forNumber;
        }

        public int getConnectionTypeValue() {
            return this.connectionType_;
        }

        public long getFreeDiskSpace() {
            return this.freeDiskSpace_;
        }

        public long getFreeRamMemory() {
            return this.freeRamMemory_;
        }

        public Ios getIos() {
            return this.platformSpecificCase_ == 13 ? (Ios) this.platformSpecific_ : Ios.getDefaultInstance();
        }

        public String getLanguage() {
            return this.language_;
        }

        public ByteString getLanguageBytes() {
            return ByteString.copyFromUtf8(this.language_);
        }

        public boolean getLimitedOpenAdTracking() {
            return this.limitedOpenAdTracking_;
        }

        public boolean getLimitedTracking() {
            return this.limitedTracking_;
        }

        public boolean getLowPowerMode() {
            return this.lowPowerMode_;
        }

        public String getNetworkOperator() {
            return this.networkOperator_;
        }

        public ByteString getNetworkOperatorBytes() {
            return ByteString.copyFromUtf8(this.networkOperator_);
        }

        public String getNetworkOperatorName() {
            return this.networkOperatorName_;
        }

        public ByteString getNetworkOperatorNameBytes() {
            return ByteString.copyFromUtf8(this.networkOperatorName_);
        }

        public PlatformSpecificCase getPlatformSpecificCase() {
            return PlatformSpecificCase.forNumber(this.platformSpecificCase_);
        }

        public int getScreenHeight() {
            return this.screenHeight_;
        }

        public int getScreenWidth() {
            return this.screenWidth_;
        }

        public String getTimeZone() {
            return this.timeZone_;
        }

        public ByteString getTimeZoneBytes() {
            return ByteString.copyFromUtf8(this.timeZone_);
        }

        public long getTimeZoneOffset() {
            return this.timeZoneOffset_;
        }

        public String getUserId() {
            return this.userId_;
        }

        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        public boolean getWiredHeadset() {
            return this.wiredHeadset_;
        }

        public boolean hasAndroid() {
            return this.platformSpecificCase_ == 12;
        }

        public boolean hasAppActive() {
            return (this.bitField0_ & 8192) != 0;
        }

        public boolean hasBatteryLevel() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasBatteryStatus() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasConnectionType() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasFreeDiskSpace() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasFreeRamMemory() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasIos() {
            return this.platformSpecificCase_ == 13;
        }

        public boolean hasLanguage() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasLimitedOpenAdTracking() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasLimitedTracking() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasLowPowerMode() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasNetworkOperator() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasNetworkOperatorName() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasScreenHeight() {
            return (this.bitField0_ & 131072) != 0;
        }

        public boolean hasScreenWidth() {
            return (this.bitField0_ & 65536) != 0;
        }

        public boolean hasTimeZone() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasTimeZoneOffset() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasUserId() {
            return (this.bitField0_ & 32768) != 0;
        }

        public boolean hasWiredHeadset() {
            return (this.bitField0_ & 32) != 0;
        }

        public static Builder newBuilder(DynamicDeviceInfo dynamicDeviceInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(dynamicDeviceInfo);
        }

        public static DynamicDeviceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DynamicDeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DynamicDeviceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DynamicDeviceInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DynamicDeviceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DynamicDeviceInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DynamicDeviceInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DynamicDeviceInfo parseFrom(InputStream inputStream) throws IOException {
            return (DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DynamicDeviceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DynamicDeviceInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DynamicDeviceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface DynamicDeviceInfoOrBuilder extends MessageLiteOrBuilder {
        DynamicDeviceInfo.Android getAndroid();

        boolean getAppActive();

        double getBatteryLevel();

        int getBatteryStatus();

        ConnectionType getConnectionType();

        int getConnectionTypeValue();

        long getFreeDiskSpace();

        long getFreeRamMemory();

        DynamicDeviceInfo.Ios getIos();

        String getLanguage();

        ByteString getLanguageBytes();

        boolean getLimitedOpenAdTracking();

        boolean getLimitedTracking();

        boolean getLowPowerMode();

        String getNetworkOperator();

        ByteString getNetworkOperatorBytes();

        String getNetworkOperatorName();

        ByteString getNetworkOperatorNameBytes();

        DynamicDeviceInfo.PlatformSpecificCase getPlatformSpecificCase();

        int getScreenHeight();

        int getScreenWidth();

        String getTimeZone();

        ByteString getTimeZoneBytes();

        long getTimeZoneOffset();

        String getUserId();

        ByteString getUserIdBytes();

        boolean getWiredHeadset();

        boolean hasAndroid();

        boolean hasAppActive();

        boolean hasBatteryLevel();

        boolean hasBatteryStatus();

        boolean hasConnectionType();

        boolean hasFreeDiskSpace();

        boolean hasFreeRamMemory();

        boolean hasIos();

        boolean hasLanguage();

        boolean hasLimitedOpenAdTracking();

        boolean hasLimitedTracking();

        boolean hasLowPowerMode();

        boolean hasNetworkOperator();

        boolean hasNetworkOperatorName();

        boolean hasScreenHeight();

        boolean hasScreenWidth();

        boolean hasTimeZone();

        boolean hasTimeZoneOffset();

        boolean hasUserId();

        boolean hasWiredHeadset();
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

    private DynamicDeviceInfoOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
