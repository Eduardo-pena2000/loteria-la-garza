package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AdRequestOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class BannerSizeKt {
    public static final BannerSizeKt INSTANCE = new BannerSizeKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AdRequestOuterClass.BannerSize.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(AdRequestOuterClass.BannerSize.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(AdRequestOuterClass.BannerSize.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ AdRequestOuterClass.BannerSize _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (AdRequestOuterClass.BannerSize) build;
        }

        public final void clearHeight() {
            this._builder.clearHeight();
        }

        public final void clearWidth() {
            this._builder.clearWidth();
        }

        public final int getHeight() {
            return this._builder.getHeight();
        }

        public final int getWidth() {
            return this._builder.getWidth();
        }

        public final void setHeight(int i) {
            this._builder.setHeight(i);
        }

        public final void setWidth(int i) {
            this._builder.setWidth(i);
        }

        private Dsl(AdRequestOuterClass.BannerSize.Builder builder) {
            this._builder = builder;
        }
    }

    private BannerSizeKt() {
    }
}
