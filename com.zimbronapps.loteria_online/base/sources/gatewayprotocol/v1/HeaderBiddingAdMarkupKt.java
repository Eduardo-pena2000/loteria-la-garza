package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class HeaderBiddingAdMarkupKt {
    public static final HeaderBiddingAdMarkupKt INSTANCE = new HeaderBiddingAdMarkupKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup) build;
        }

        public final void clearAdData() {
            this._builder.clearAdData();
        }

        public final void clearAdDataVersion() {
            this._builder.clearAdDataVersion();
        }

        public final void clearConfigurationToken() {
            this._builder.clearConfigurationToken();
        }

        public final ByteString getAdData() {
            ByteString adData = this._builder.getAdData();
            t.f(adData, "_builder.getAdData()");
            return adData;
        }

        public final int getAdDataVersion() {
            return this._builder.getAdDataVersion();
        }

        public final ByteString getConfigurationToken() {
            ByteString configurationToken = this._builder.getConfigurationToken();
            t.f(configurationToken, "_builder.getConfigurationToken()");
            return configurationToken;
        }

        public final void setAdData(ByteString value) {
            t.g(value, "value");
            this._builder.setAdData(value);
        }

        public final void setAdDataVersion(int i) {
            this._builder.setAdDataVersion(i);
        }

        public final void setConfigurationToken(ByteString value) {
            t.g(value, "value");
            this._builder.setConfigurationToken(value);
        }

        private Dsl(HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder builder) {
            this._builder = builder;
        }
    }

    private HeaderBiddingAdMarkupKt() {
    }
}
