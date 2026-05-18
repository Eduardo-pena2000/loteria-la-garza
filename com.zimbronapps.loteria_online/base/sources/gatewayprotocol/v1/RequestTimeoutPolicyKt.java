package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RequestTimeoutPolicyKt {
    public static final RequestTimeoutPolicyKt INSTANCE = new RequestTimeoutPolicyKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.RequestTimeoutPolicy _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (NativeConfigurationOuterClass.RequestTimeoutPolicy) build;
        }

        public final void clearConnectTimeoutMs() {
            this._builder.clearConnectTimeoutMs();
        }

        public final void clearOverallTimeoutMs() {
            this._builder.clearOverallTimeoutMs();
        }

        public final void clearReadTimeoutMs() {
            this._builder.clearReadTimeoutMs();
        }

        public final void clearWriteTimeoutMs() {
            this._builder.clearWriteTimeoutMs();
        }

        public final int getConnectTimeoutMs() {
            return this._builder.getConnectTimeoutMs();
        }

        public final int getOverallTimeoutMs() {
            return this._builder.getOverallTimeoutMs();
        }

        public final int getReadTimeoutMs() {
            return this._builder.getReadTimeoutMs();
        }

        public final int getWriteTimeoutMs() {
            return this._builder.getWriteTimeoutMs();
        }

        public final void setConnectTimeoutMs(int i) {
            this._builder.setConnectTimeoutMs(i);
        }

        public final void setOverallTimeoutMs(int i) {
            this._builder.setOverallTimeoutMs(i);
        }

        public final void setReadTimeoutMs(int i) {
            this._builder.setReadTimeoutMs(i);
        }

        public final void setWriteTimeoutMs(int i) {
            this._builder.setWriteTimeoutMs(i);
        }

        private Dsl(NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builder) {
            this._builder = builder;
        }
    }

    private RequestTimeoutPolicyKt() {
    }
}
