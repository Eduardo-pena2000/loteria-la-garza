package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class GetTokenEventRequestKt {
    public static final GetTokenEventRequestKt INSTANCE = new GetTokenEventRequestKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ GetTokenEventRequestOuterClass.GetTokenEventRequest _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (GetTokenEventRequestOuterClass.GetTokenEventRequest) build;
        }

        public final void clearBanner() {
            this._builder.clearBanner();
        }

        public final void clearInterstitial() {
            this._builder.clearInterstitial();
        }

        public final void clearRewarded() {
            this._builder.clearRewarded();
        }

        public final void clearTokenId() {
            this._builder.clearTokenId();
        }

        public final ByteString getBanner() {
            ByteString banner = this._builder.getBanner();
            t.f(banner, "_builder.getBanner()");
            return banner;
        }

        public final ByteString getInterstitial() {
            ByteString interstitial = this._builder.getInterstitial();
            t.f(interstitial, "_builder.getInterstitial()");
            return interstitial;
        }

        public final ByteString getRewarded() {
            ByteString rewarded = this._builder.getRewarded();
            t.f(rewarded, "_builder.getRewarded()");
            return rewarded;
        }

        public final ByteString getTokenId() {
            ByteString tokenId = this._builder.getTokenId();
            t.f(tokenId, "_builder.getTokenId()");
            return tokenId;
        }

        public final boolean hasBanner() {
            return this._builder.hasBanner();
        }

        public final boolean hasInterstitial() {
            return this._builder.hasInterstitial();
        }

        public final boolean hasRewarded() {
            return this._builder.hasRewarded();
        }

        public final void setBanner(ByteString value) {
            t.g(value, "value");
            this._builder.setBanner(value);
        }

        public final void setInterstitial(ByteString value) {
            t.g(value, "value");
            this._builder.setInterstitial(value);
        }

        public final void setRewarded(ByteString value) {
            t.g(value, "value");
            this._builder.setRewarded(value);
        }

        public final void setTokenId(ByteString value) {
            t.g(value, "value");
            this._builder.setTokenId(value);
        }

        private Dsl(GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private GetTokenEventRequestKt() {
    }
}
