package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OperativeEventErrorDataKt {
    public static final OperativeEventErrorDataKt INSTANCE = new OperativeEventErrorDataKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final OperativeEventRequestOuterClass.OperativeEventErrorData.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ OperativeEventRequestOuterClass.OperativeEventErrorData _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (OperativeEventRequestOuterClass.OperativeEventErrorData) build;
        }

        public final void clearErrorType() {
            this._builder.clearErrorType();
        }

        public final void clearMessage() {
            this._builder.clearMessage();
        }

        public final OperativeEventRequestOuterClass.OperativeEventErrorType getErrorType() {
            OperativeEventRequestOuterClass.OperativeEventErrorType errorType = this._builder.getErrorType();
            t.f(errorType, "_builder.getErrorType()");
            return errorType;
        }

        public final int getErrorTypeValue() {
            return this._builder.getErrorTypeValue();
        }

        public final String getMessage() {
            String message = this._builder.getMessage();
            t.f(message, "_builder.getMessage()");
            return message;
        }

        public final void setErrorType(OperativeEventRequestOuterClass.OperativeEventErrorType value) {
            t.g(value, "value");
            this._builder.setErrorType(value);
        }

        public final void setErrorTypeValue(int i) {
            this._builder.setErrorTypeValue(i);
        }

        public final void setMessage(String value) {
            t.g(value, "value");
            this._builder.setMessage(value);
        }

        private Dsl(OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builder) {
            this._builder = builder;
        }
    }

    private OperativeEventErrorDataKt() {
    }
}
