package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ErrorKt {
    public static final ErrorKt INSTANCE = new ErrorKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ErrorOuterClass.Error.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(ErrorOuterClass.Error.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(ErrorOuterClass.Error.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ ErrorOuterClass.Error _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (ErrorOuterClass.Error) build;
        }

        public final void clearErrorText() {
            this._builder.clearErrorText();
        }

        public final String getErrorText() {
            String errorText = this._builder.getErrorText();
            t.f(errorText, "_builder.getErrorText()");
            return errorText;
        }

        public final void setErrorText(String value) {
            t.g(value, "value");
            this._builder.setErrorText(value);
        }

        private Dsl(ErrorOuterClass.Error.Builder builder) {
            this._builder = builder;
        }
    }

    private ErrorKt() {
    }
}
