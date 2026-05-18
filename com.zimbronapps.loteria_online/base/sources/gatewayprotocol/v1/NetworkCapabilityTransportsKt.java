package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class NetworkCapabilityTransportsKt {
    public static final NetworkCapabilityTransportsKt INSTANCE = new NetworkCapabilityTransportsKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) build;
        }

        public final void clearBluetooth() {
            this._builder.clearBluetooth();
        }

        public final void clearCellular() {
            this._builder.clearCellular();
        }

        public final void clearEthernet() {
            this._builder.clearEthernet();
        }

        public final void clearLowpan() {
            this._builder.clearLowpan();
        }

        public final void clearSatellite() {
            this._builder.clearSatellite();
        }

        public final void clearThread() {
            this._builder.clearThread();
        }

        public final void clearUsb() {
            this._builder.clearUsb();
        }

        public final void clearVpn() {
            this._builder.clearVpn();
        }

        public final void clearWifi() {
            this._builder.clearWifi();
        }

        public final void clearWifiAware() {
            this._builder.clearWifiAware();
        }

        public final boolean getBluetooth() {
            return this._builder.getBluetooth();
        }

        public final boolean getCellular() {
            return this._builder.getCellular();
        }

        public final boolean getEthernet() {
            return this._builder.getEthernet();
        }

        public final boolean getLowpan() {
            return this._builder.getLowpan();
        }

        public final boolean getSatellite() {
            return this._builder.getSatellite();
        }

        public final boolean getThread() {
            return this._builder.getThread();
        }

        public final boolean getUsb() {
            return this._builder.getUsb();
        }

        public final boolean getVpn() {
            return this._builder.getVpn();
        }

        public final boolean getWifi() {
            return this._builder.getWifi();
        }

        public final boolean getWifiAware() {
            return this._builder.getWifiAware();
        }

        public final boolean hasBluetooth() {
            return this._builder.hasBluetooth();
        }

        public final boolean hasCellular() {
            return this._builder.hasCellular();
        }

        public final boolean hasEthernet() {
            return this._builder.hasEthernet();
        }

        public final boolean hasLowpan() {
            return this._builder.hasLowpan();
        }

        public final boolean hasSatellite() {
            return this._builder.hasSatellite();
        }

        public final boolean hasThread() {
            return this._builder.hasThread();
        }

        public final boolean hasUsb() {
            return this._builder.hasUsb();
        }

        public final boolean hasVpn() {
            return this._builder.hasVpn();
        }

        public final boolean hasWifi() {
            return this._builder.hasWifi();
        }

        public final boolean hasWifiAware() {
            return this._builder.hasWifiAware();
        }

        public final void setBluetooth(boolean z) {
            this._builder.setBluetooth(z);
        }

        public final void setCellular(boolean z) {
            this._builder.setCellular(z);
        }

        public final void setEthernet(boolean z) {
            this._builder.setEthernet(z);
        }

        public final void setLowpan(boolean z) {
            this._builder.setLowpan(z);
        }

        public final void setSatellite(boolean z) {
            this._builder.setSatellite(z);
        }

        public final void setThread(boolean z) {
            this._builder.setThread(z);
        }

        public final void setUsb(boolean z) {
            this._builder.setUsb(z);
        }

        public final void setVpn(boolean z) {
            this._builder.setVpn(z);
        }

        public final void setWifi(boolean z) {
            this._builder.setWifi(z);
        }

        public final void setWifiAware(boolean z) {
            this._builder.setWifiAware(z);
        }

        private Dsl(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder builder) {
            this._builder = builder;
        }
    }

    private NetworkCapabilityTransportsKt() {
    }
}
