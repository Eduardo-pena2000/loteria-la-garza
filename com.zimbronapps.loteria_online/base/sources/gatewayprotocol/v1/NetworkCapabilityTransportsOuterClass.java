package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class NetworkCapabilityTransportsOuterClass {

    public static final class NetworkCapabilityTransports extends GeneratedMessageLite implements NetworkCapabilityTransportsOrBuilder {
        public static final int BLUETOOTH_FIELD_NUMBER = 1;
        public static final int CELLULAR_FIELD_NUMBER = 2;
        private static final NetworkCapabilityTransports DEFAULT_INSTANCE;
        public static final int ETHERNET_FIELD_NUMBER = 3;
        public static final int LOWPAN_FIELD_NUMBER = 4;
        private static volatile Parser PARSER = null;
        public static final int SATELLITE_FIELD_NUMBER = 5;
        public static final int THREAD_FIELD_NUMBER = 6;
        public static final int USB_FIELD_NUMBER = 7;
        public static final int VPN_FIELD_NUMBER = 8;
        public static final int WIFI_AWARE_FIELD_NUMBER = 10;
        public static final int WIFI_FIELD_NUMBER = 9;
        private int bitField0_;
        private boolean bluetooth_;
        private boolean cellular_;
        private boolean ethernet_;
        private boolean lowpan_;
        private boolean satellite_;
        private boolean thread_;
        private boolean usb_;
        private boolean vpn_;
        private boolean wifiAware_;
        private boolean wifi_;

        public static final class Builder extends GeneratedMessageLite.Builder implements NetworkCapabilityTransportsOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearBluetooth() {
                copyOnWrite();
                NetworkCapabilityTransports.access$200((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearCellular() {
                copyOnWrite();
                NetworkCapabilityTransports.access$400((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearEthernet() {
                copyOnWrite();
                NetworkCapabilityTransports.access$600((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearLowpan() {
                copyOnWrite();
                NetworkCapabilityTransports.access$800((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearSatellite() {
                copyOnWrite();
                NetworkCapabilityTransports.access$1000((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearThread() {
                copyOnWrite();
                NetworkCapabilityTransports.access$1200((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearUsb() {
                copyOnWrite();
                NetworkCapabilityTransports.access$1400((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearVpn() {
                copyOnWrite();
                NetworkCapabilityTransports.access$1600((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearWifi() {
                copyOnWrite();
                NetworkCapabilityTransports.access$1800((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearWifiAware() {
                copyOnWrite();
                NetworkCapabilityTransports.access$2000((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public boolean getBluetooth() {
                return ((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance).getBluetooth();
            }

            public boolean getCellular() {
                return ((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance).getCellular();
            }

            public boolean getEthernet() {
                return ((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance).getEthernet();
            }

            public boolean getLowpan() {
                return ((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance).getLowpan();
            }

            public boolean getSatellite() {
                return ((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance).getSatellite();
            }

            public boolean getThread() {
                return ((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance).getThread();
            }

            public boolean getUsb() {
                return ((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance).getUsb();
            }

            public boolean getVpn() {
                return ((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance).getVpn();
            }

            public boolean getWifi() {
                return ((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance).getWifi();
            }

            public boolean getWifiAware() {
                return ((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance).getWifiAware();
            }

            public boolean hasBluetooth() {
                return ((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance).hasBluetooth();
            }

            public boolean hasCellular() {
                return ((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance).hasCellular();
            }

            public boolean hasEthernet() {
                return ((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance).hasEthernet();
            }

            public boolean hasLowpan() {
                return ((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance).hasLowpan();
            }

            public boolean hasSatellite() {
                return ((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance).hasSatellite();
            }

            public boolean hasThread() {
                return ((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance).hasThread();
            }

            public boolean hasUsb() {
                return ((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance).hasUsb();
            }

            public boolean hasVpn() {
                return ((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance).hasVpn();
            }

            public boolean hasWifi() {
                return ((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance).hasWifi();
            }

            public boolean hasWifiAware() {
                return ((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance).hasWifiAware();
            }

            public Builder setBluetooth(boolean z) {
                copyOnWrite();
                NetworkCapabilityTransports.access$100((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setCellular(boolean z) {
                copyOnWrite();
                NetworkCapabilityTransports.access$300((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setEthernet(boolean z) {
                copyOnWrite();
                NetworkCapabilityTransports.access$500((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setLowpan(boolean z) {
                copyOnWrite();
                NetworkCapabilityTransports.access$700((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setSatellite(boolean z) {
                copyOnWrite();
                NetworkCapabilityTransports.access$900((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setThread(boolean z) {
                copyOnWrite();
                NetworkCapabilityTransports.access$1100((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setUsb(boolean z) {
                copyOnWrite();
                NetworkCapabilityTransports.access$1300((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setVpn(boolean z) {
                copyOnWrite();
                NetworkCapabilityTransports.access$1500((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setWifi(boolean z) {
                copyOnWrite();
                NetworkCapabilityTransports.access$1700((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setWifiAware(boolean z) {
                copyOnWrite();
                NetworkCapabilityTransports.access$1900((NetworkCapabilityTransports) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            private Builder() {
                super(NetworkCapabilityTransports.access$000());
            }
        }

        static {
            NetworkCapabilityTransports networkCapabilityTransports = new NetworkCapabilityTransports();
            DEFAULT_INSTANCE = networkCapabilityTransports;
            GeneratedMessageLite.registerDefaultInstance(NetworkCapabilityTransports.class, networkCapabilityTransports);
        }

        private NetworkCapabilityTransports() {
        }

        public static /* synthetic */ NetworkCapabilityTransports access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(NetworkCapabilityTransports networkCapabilityTransports, boolean z) {
            networkCapabilityTransports.setBluetooth(z);
        }

        public static /* synthetic */ void access$1000(NetworkCapabilityTransports networkCapabilityTransports) {
            networkCapabilityTransports.clearSatellite();
        }

        public static /* synthetic */ void access$1100(NetworkCapabilityTransports networkCapabilityTransports, boolean z) {
            networkCapabilityTransports.setThread(z);
        }

        public static /* synthetic */ void access$1200(NetworkCapabilityTransports networkCapabilityTransports) {
            networkCapabilityTransports.clearThread();
        }

        public static /* synthetic */ void access$1300(NetworkCapabilityTransports networkCapabilityTransports, boolean z) {
            networkCapabilityTransports.setUsb(z);
        }

        public static /* synthetic */ void access$1400(NetworkCapabilityTransports networkCapabilityTransports) {
            networkCapabilityTransports.clearUsb();
        }

        public static /* synthetic */ void access$1500(NetworkCapabilityTransports networkCapabilityTransports, boolean z) {
            networkCapabilityTransports.setVpn(z);
        }

        public static /* synthetic */ void access$1600(NetworkCapabilityTransports networkCapabilityTransports) {
            networkCapabilityTransports.clearVpn();
        }

        public static /* synthetic */ void access$1700(NetworkCapabilityTransports networkCapabilityTransports, boolean z) {
            networkCapabilityTransports.setWifi(z);
        }

        public static /* synthetic */ void access$1800(NetworkCapabilityTransports networkCapabilityTransports) {
            networkCapabilityTransports.clearWifi();
        }

        public static /* synthetic */ void access$1900(NetworkCapabilityTransports networkCapabilityTransports, boolean z) {
            networkCapabilityTransports.setWifiAware(z);
        }

        public static /* synthetic */ void access$200(NetworkCapabilityTransports networkCapabilityTransports) {
            networkCapabilityTransports.clearBluetooth();
        }

        public static /* synthetic */ void access$2000(NetworkCapabilityTransports networkCapabilityTransports) {
            networkCapabilityTransports.clearWifiAware();
        }

        public static /* synthetic */ void access$300(NetworkCapabilityTransports networkCapabilityTransports, boolean z) {
            networkCapabilityTransports.setCellular(z);
        }

        public static /* synthetic */ void access$400(NetworkCapabilityTransports networkCapabilityTransports) {
            networkCapabilityTransports.clearCellular();
        }

        public static /* synthetic */ void access$500(NetworkCapabilityTransports networkCapabilityTransports, boolean z) {
            networkCapabilityTransports.setEthernet(z);
        }

        public static /* synthetic */ void access$600(NetworkCapabilityTransports networkCapabilityTransports) {
            networkCapabilityTransports.clearEthernet();
        }

        public static /* synthetic */ void access$700(NetworkCapabilityTransports networkCapabilityTransports, boolean z) {
            networkCapabilityTransports.setLowpan(z);
        }

        public static /* synthetic */ void access$800(NetworkCapabilityTransports networkCapabilityTransports) {
            networkCapabilityTransports.clearLowpan();
        }

        public static /* synthetic */ void access$900(NetworkCapabilityTransports networkCapabilityTransports, boolean z) {
            networkCapabilityTransports.setSatellite(z);
        }

        private void clearBluetooth() {
            this.bitField0_ &= -2;
            this.bluetooth_ = false;
        }

        private void clearCellular() {
            this.bitField0_ &= -3;
            this.cellular_ = false;
        }

        private void clearEthernet() {
            this.bitField0_ &= -5;
            this.ethernet_ = false;
        }

        private void clearLowpan() {
            this.bitField0_ &= -9;
            this.lowpan_ = false;
        }

        private void clearSatellite() {
            this.bitField0_ &= -17;
            this.satellite_ = false;
        }

        private void clearThread() {
            this.bitField0_ &= -33;
            this.thread_ = false;
        }

        private void clearUsb() {
            this.bitField0_ &= -65;
            this.usb_ = false;
        }

        private void clearVpn() {
            this.bitField0_ &= -129;
            this.vpn_ = false;
        }

        private void clearWifi() {
            this.bitField0_ &= -257;
            this.wifi_ = false;
        }

        private void clearWifiAware() {
            this.bitField0_ &= -513;
            this.wifiAware_ = false;
        }

        public static NetworkCapabilityTransports getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static NetworkCapabilityTransports parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NetworkCapabilityTransports parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setBluetooth(boolean z) {
            this.bitField0_ |= 1;
            this.bluetooth_ = z;
        }

        private void setCellular(boolean z) {
            this.bitField0_ |= 2;
            this.cellular_ = z;
        }

        private void setEthernet(boolean z) {
            this.bitField0_ |= 4;
            this.ethernet_ = z;
        }

        private void setLowpan(boolean z) {
            this.bitField0_ |= 8;
            this.lowpan_ = z;
        }

        private void setSatellite(boolean z) {
            this.bitField0_ |= 16;
            this.satellite_ = z;
        }

        private void setThread(boolean z) {
            this.bitField0_ |= 32;
            this.thread_ = z;
        }

        private void setUsb(boolean z) {
            this.bitField0_ |= 64;
            this.usb_ = z;
        }

        private void setVpn(boolean z) {
            this.bitField0_ |= 128;
            this.vpn_ = z;
        }

        private void setWifi(boolean z) {
            this.bitField0_ |= 256;
            this.wifi_ = z;
        }

        private void setWifiAware(boolean z) {
            this.bitField0_ |= 512;
            this.wifiAware_ = z;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new NetworkCapabilityTransports();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဇ\t", new Object[]{"bitField0_", "bluetooth_", "cellular_", "ethernet_", "lowpan_", "satellite_", "thread_", "usb_", "vpn_", "wifi_", "wifiAware_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (NetworkCapabilityTransports.class) {
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

        public boolean getBluetooth() {
            return this.bluetooth_;
        }

        public boolean getCellular() {
            return this.cellular_;
        }

        public boolean getEthernet() {
            return this.ethernet_;
        }

        public boolean getLowpan() {
            return this.lowpan_;
        }

        public boolean getSatellite() {
            return this.satellite_;
        }

        public boolean getThread() {
            return this.thread_;
        }

        public boolean getUsb() {
            return this.usb_;
        }

        public boolean getVpn() {
            return this.vpn_;
        }

        public boolean getWifi() {
            return this.wifi_;
        }

        public boolean getWifiAware() {
            return this.wifiAware_;
        }

        public boolean hasBluetooth() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasCellular() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasEthernet() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasLowpan() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasSatellite() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasThread() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasUsb() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasVpn() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasWifi() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasWifiAware() {
            return (this.bitField0_ & 512) != 0;
        }

        public static Builder newBuilder(NetworkCapabilityTransports networkCapabilityTransports) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(networkCapabilityTransports);
        }

        public static NetworkCapabilityTransports parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NetworkCapabilityTransports parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NetworkCapabilityTransports parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NetworkCapabilityTransports parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NetworkCapabilityTransports parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NetworkCapabilityTransports parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NetworkCapabilityTransports parseFrom(InputStream inputStream) throws IOException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NetworkCapabilityTransports parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NetworkCapabilityTransports parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NetworkCapabilityTransports parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface NetworkCapabilityTransportsOrBuilder extends MessageLiteOrBuilder {
        boolean getBluetooth();

        boolean getCellular();

        boolean getEthernet();

        boolean getLowpan();

        boolean getSatellite();

        boolean getThread();

        boolean getUsb();

        boolean getVpn();

        boolean getWifi();

        boolean getWifiAware();

        boolean hasBluetooth();

        boolean hasCellular();

        boolean hasEthernet();

        boolean hasLowpan();

        boolean hasSatellite();

        boolean hasThread();

        boolean hasUsb();

        boolean hasVpn();

        boolean hasWifi();

        boolean hasWifiAware();
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

    private NetworkCapabilityTransportsOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
