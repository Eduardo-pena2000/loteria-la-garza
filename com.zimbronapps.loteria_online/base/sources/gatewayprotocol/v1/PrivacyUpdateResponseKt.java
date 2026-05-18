package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PrivacyUpdateResponseKt {
    public static final PrivacyUpdateResponseKt INSTANCE = new PrivacyUpdateResponseKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse) build;
        }

        public final void clearContent() {
            this._builder.clearContent();
        }

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        public final ByteString getContent() {
            ByteString content = this._builder.getContent();
            t.f(content, "_builder.getContent()");
            return content;
        }

        public final int getVersion() {
            return this._builder.getVersion();
        }

        public final void setContent(ByteString value) {
            t.g(value, "value");
            this._builder.setContent(value);
        }

        public final void setVersion(int i) {
            this._builder.setVersion(i);
        }

        private Dsl(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder builder) {
            this._builder = builder;
        }
    }

    private PrivacyUpdateResponseKt() {
    }
}
