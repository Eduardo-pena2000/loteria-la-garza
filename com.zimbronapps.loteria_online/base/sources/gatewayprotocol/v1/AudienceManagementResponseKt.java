package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AudienceManagementResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AudienceManagementResponseKt {
    public static final AudienceManagementResponseKt INSTANCE = new AudienceManagementResponseKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ AudienceManagementResponseOuterClass.AudienceManagementResponse _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (AudienceManagementResponseOuterClass.AudienceManagementResponse) build;
        }

        public final void clearAudienceManagementData() {
            this._builder.clearAudienceManagementData();
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final ByteString getAudienceManagementData() {
            ByteString audienceManagementData = this._builder.getAudienceManagementData();
            t.f(audienceManagementData, "_builder.getAudienceManagementData()");
            return audienceManagementData;
        }

        public final ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this._builder.getError();
            t.f(error, "_builder.getError()");
            return error;
        }

        public final ErrorOuterClass.Error getErrorOrNull(Dsl dsl) {
            t.g(dsl, "<this>");
            return AudienceManagementResponseKtKt.getErrorOrNull(dsl._builder);
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final void setAudienceManagementData(ByteString value) {
            t.g(value, "value");
            this._builder.setAudienceManagementData(value);
        }

        public final void setError(ErrorOuterClass.Error value) {
            t.g(value, "value");
            this._builder.setError(value);
        }

        private Dsl(AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder builder) {
            this._builder = builder;
        }
    }

    private AudienceManagementResponseKt() {
    }
}
