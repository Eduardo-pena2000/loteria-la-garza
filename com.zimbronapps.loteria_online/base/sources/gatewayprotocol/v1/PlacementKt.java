package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PlacementKt {
    public static final PlacementKt INSTANCE = new PlacementKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationResponseOuterClass.Placement.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationResponseOuterClass.Placement.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(InitializationResponseOuterClass.Placement.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationResponseOuterClass.Placement _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (InitializationResponseOuterClass.Placement) build;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            t.f(adFormat, "_builder.getAdFormat()");
            return adFormat;
        }

        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        public final void setAdFormat(AdFormatOuterClass.AdFormat value) {
            t.g(value, "value");
            this._builder.setAdFormat(value);
        }

        public final void setAdFormatValue(int i) {
            this._builder.setAdFormatValue(i);
        }

        private Dsl(InitializationResponseOuterClass.Placement.Builder builder) {
            this._builder = builder;
        }
    }

    private PlacementKt() {
    }
}
