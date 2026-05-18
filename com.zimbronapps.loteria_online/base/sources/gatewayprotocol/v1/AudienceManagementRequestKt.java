package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AudienceManagementRequestOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AudienceManagementRequestKt {
    public static final AudienceManagementRequestKt INSTANCE = new AudienceManagementRequestKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AudienceManagementRequestOuterClass.AudienceManagementRequest.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(AudienceManagementRequestOuterClass.AudienceManagementRequest.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(AudienceManagementRequestOuterClass.AudienceManagementRequest.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ AudienceManagementRequestOuterClass.AudienceManagementRequest _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (AudienceManagementRequestOuterClass.AudienceManagementRequest) build;
        }

        public final void clearAudienceManagementData() {
            this._builder.clearAudienceManagementData();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final ByteString getAudienceManagementData() {
            ByteString audienceManagementData = this._builder.getAudienceManagementData();
            t.f(audienceManagementData, "_builder.getAudienceManagementData()");
            return audienceManagementData;
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            t.f(dynamicDeviceInfo, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfo;
        }

        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this._builder.getSessionCounters();
            t.f(sessionCounters, "_builder.getSessionCounters()");
            return sessionCounters;
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            t.f(staticDeviceInfo, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfo;
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasSessionCounters() {
            return this._builder.hasSessionCounters();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final void setAudienceManagementData(ByteString value) {
            t.g(value, "value");
            this._builder.setAudienceManagementData(value);
        }

        public final void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo value) {
            t.g(value, "value");
            this._builder.setDynamicDeviceInfo(value);
        }

        public final void setSessionCounters(SessionCountersOuterClass.SessionCounters value) {
            t.g(value, "value");
            this._builder.setSessionCounters(value);
        }

        public final void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo value) {
            t.g(value, "value");
            this._builder.setStaticDeviceInfo(value);
        }

        private Dsl(AudienceManagementRequestOuterClass.AudienceManagementRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private AudienceManagementRequestKt() {
    }
}
