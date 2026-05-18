package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.InitializationDataOuterClass;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializationDataKt {
    public static final InitializationDataKt INSTANCE = new InitializationDataKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationDataOuterClass.InitializationData.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationDataOuterClass.InitializationData.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(InitializationDataOuterClass.InitializationData.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationDataOuterClass.InitializationData _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (InitializationDataOuterClass.InitializationData) build;
        }

        public final void clearInitializationRequest() {
            this._builder.clearInitializationRequest();
        }

        public final void clearSharedData() {
            this._builder.clearSharedData();
        }

        public final InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
            InitializationRequestOuterClass.InitializationRequest initializationRequest = this._builder.getInitializationRequest();
            t.f(initializationRequest, "_builder.getInitializationRequest()");
            return initializationRequest;
        }

        public final InitializationRequestOuterClass.InitializationRequest getInitializationRequestOrNull(Dsl dsl) {
            t.g(dsl, "<this>");
            return InitializationDataKtKt.getInitializationRequestOrNull(dsl._builder);
        }

        public final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData() {
            UniversalRequestOuterClass.UniversalRequest.SharedData sharedData = this._builder.getSharedData();
            t.f(sharedData, "_builder.getSharedData()");
            return sharedData;
        }

        public final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedDataOrNull(Dsl dsl) {
            t.g(dsl, "<this>");
            return InitializationDataKtKt.getSharedDataOrNull(dsl._builder);
        }

        public final boolean hasInitializationRequest() {
            return this._builder.hasInitializationRequest();
        }

        public final boolean hasSharedData() {
            return this._builder.hasSharedData();
        }

        public final void setInitializationRequest(InitializationRequestOuterClass.InitializationRequest value) {
            t.g(value, "value");
            this._builder.setInitializationRequest(value);
        }

        public final void setSharedData(UniversalRequestOuterClass.UniversalRequest.SharedData value) {
            t.g(value, "value");
            this._builder.setSharedData(value);
        }

        private Dsl(InitializationDataOuterClass.InitializationData.Builder builder) {
            this._builder = builder;
        }
    }

    private InitializationDataKt() {
    }
}
