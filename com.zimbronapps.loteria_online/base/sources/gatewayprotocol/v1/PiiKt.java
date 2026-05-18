package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.PiiOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PiiKt {
    public static final PiiKt INSTANCE = new PiiKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final PiiOuterClass.Pii.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(PiiOuterClass.Pii.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(PiiOuterClass.Pii.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ PiiOuterClass.Pii _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (PiiOuterClass.Pii) build;
        }

        public final void clearAdvertisingId() {
            this._builder.clearAdvertisingId();
        }

        public final void clearAppsetId() {
            this._builder.clearAppsetId();
        }

        public final void clearFid() {
            this._builder.clearFid();
        }

        public final void clearOpenAdvertisingTrackingId() {
            this._builder.clearOpenAdvertisingTrackingId();
        }

        public final void clearVendorId() {
            this._builder.clearVendorId();
        }

        public final ByteString getAdvertisingId() {
            ByteString advertisingId = this._builder.getAdvertisingId();
            t.f(advertisingId, "_builder.getAdvertisingId()");
            return advertisingId;
        }

        public final String getAppsetId() {
            String appsetId = this._builder.getAppsetId();
            t.f(appsetId, "_builder.getAppsetId()");
            return appsetId;
        }

        public final String getFid() {
            String fid = this._builder.getFid();
            t.f(fid, "_builder.getFid()");
            return fid;
        }

        public final ByteString getOpenAdvertisingTrackingId() {
            ByteString openAdvertisingTrackingId = this._builder.getOpenAdvertisingTrackingId();
            t.f(openAdvertisingTrackingId, "_builder.getOpenAdvertisingTrackingId()");
            return openAdvertisingTrackingId;
        }

        public final ByteString getVendorId() {
            ByteString vendorId = this._builder.getVendorId();
            t.f(vendorId, "_builder.getVendorId()");
            return vendorId;
        }

        public final boolean hasAppsetId() {
            return this._builder.hasAppsetId();
        }

        public final boolean hasFid() {
            return this._builder.hasFid();
        }

        public final void setAdvertisingId(ByteString value) {
            t.g(value, "value");
            this._builder.setAdvertisingId(value);
        }

        public final void setAppsetId(String value) {
            t.g(value, "value");
            this._builder.setAppsetId(value);
        }

        public final void setFid(String value) {
            t.g(value, "value");
            this._builder.setFid(value);
        }

        public final void setOpenAdvertisingTrackingId(ByteString value) {
            t.g(value, "value");
            this._builder.setOpenAdvertisingTrackingId(value);
        }

        public final void setVendorId(ByteString value) {
            t.g(value, "value");
            this._builder.setVendorId(value);
        }

        private Dsl(PiiOuterClass.Pii.Builder builder) {
            this._builder = builder;
        }
    }

    private PiiKt() {
    }
}
