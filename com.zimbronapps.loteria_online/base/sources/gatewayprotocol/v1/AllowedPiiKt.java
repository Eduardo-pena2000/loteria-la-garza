package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AllowedPiiKt {
    public static final AllowedPiiKt INSTANCE = new AllowedPiiKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AllowedPiiOuterClass.AllowedPii.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(AllowedPiiOuterClass.AllowedPii.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(AllowedPiiOuterClass.AllowedPii.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ AllowedPiiOuterClass.AllowedPii _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (AllowedPiiOuterClass.AllowedPii) build;
        }

        public final void clearAppsetId() {
            this._builder.clearAppsetId();
        }

        public final void clearFid() {
            this._builder.clearFid();
        }

        public final void clearIdfa() {
            this._builder.clearIdfa();
        }

        public final void clearIdfv() {
            this._builder.clearIdfv();
        }

        public final boolean getAppsetId() {
            return this._builder.getAppsetId();
        }

        public final boolean getFid() {
            return this._builder.getFid();
        }

        public final boolean getIdfa() {
            return this._builder.getIdfa();
        }

        public final boolean getIdfv() {
            return this._builder.getIdfv();
        }

        public final void setAppsetId(boolean z) {
            this._builder.setAppsetId(z);
        }

        public final void setFid(boolean z) {
            this._builder.setFid(z);
        }

        public final void setIdfa(boolean z) {
            this._builder.setIdfa(z);
        }

        public final void setIdfv(boolean z) {
            this._builder.setIdfv(z);
        }

        private Dsl(AllowedPiiOuterClass.AllowedPii.Builder builder) {
            this._builder = builder;
        }
    }

    private AllowedPiiKt() {
    }
}
