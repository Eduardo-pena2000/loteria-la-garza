package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MutableDataKt {
    public static final MutableDataKt INSTANCE = new MutableDataKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final MutableDataOuterClass.MutableData.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(MutableDataOuterClass.MutableData.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(MutableDataOuterClass.MutableData.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ MutableDataOuterClass.MutableData _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (MutableDataOuterClass.MutableData) build;
        }

        public final void clearAllowedPii() {
            this._builder.clearAllowedPii();
        }

        public final void clearCache() {
            this._builder.clearCache();
        }

        public final void clearCurrentState() {
            this._builder.clearCurrentState();
        }

        public final void clearPrivacy() {
            this._builder.clearPrivacy();
        }

        public final void clearPrivacyFsm() {
            this._builder.clearPrivacyFsm();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearSessionToken() {
            this._builder.clearSessionToken();
        }

        public final AllowedPiiOuterClass.AllowedPii getAllowedPii() {
            AllowedPiiOuterClass.AllowedPii allowedPii = this._builder.getAllowedPii();
            t.f(allowedPii, "_builder.getAllowedPii()");
            return allowedPii;
        }

        public final AllowedPiiOuterClass.AllowedPii getAllowedPiiOrNull(Dsl dsl) {
            t.g(dsl, "<this>");
            return MutableDataKtKt.getAllowedPiiOrNull(dsl._builder);
        }

        public final ByteString getCache() {
            ByteString cache = this._builder.getCache();
            t.f(cache, "_builder.getCache()");
            return cache;
        }

        public final ByteString getCurrentState() {
            ByteString currentState = this._builder.getCurrentState();
            t.f(currentState, "_builder.getCurrentState()");
            return currentState;
        }

        public final ByteString getPrivacy() {
            ByteString privacy = this._builder.getPrivacy();
            t.f(privacy, "_builder.getPrivacy()");
            return privacy;
        }

        public final ByteString getPrivacyFsm() {
            ByteString privacyFsm = this._builder.getPrivacyFsm();
            t.f(privacyFsm, "_builder.getPrivacyFsm()");
            return privacyFsm;
        }

        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this._builder.getSessionCounters();
            t.f(sessionCounters, "_builder.getSessionCounters()");
            return sessionCounters;
        }

        public final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(Dsl dsl) {
            t.g(dsl, "<this>");
            return MutableDataKtKt.getSessionCountersOrNull(dsl._builder);
        }

        public final ByteString getSessionToken() {
            ByteString sessionToken = this._builder.getSessionToken();
            t.f(sessionToken, "_builder.getSessionToken()");
            return sessionToken;
        }

        public final boolean hasAllowedPii() {
            return this._builder.hasAllowedPii();
        }

        public final boolean hasCache() {
            return this._builder.hasCache();
        }

        public final boolean hasCurrentState() {
            return this._builder.hasCurrentState();
        }

        public final boolean hasPrivacy() {
            return this._builder.hasPrivacy();
        }

        public final boolean hasPrivacyFsm() {
            return this._builder.hasPrivacyFsm();
        }

        public final boolean hasSessionCounters() {
            return this._builder.hasSessionCounters();
        }

        public final boolean hasSessionToken() {
            return this._builder.hasSessionToken();
        }

        public final void setAllowedPii(AllowedPiiOuterClass.AllowedPii value) {
            t.g(value, "value");
            this._builder.setAllowedPii(value);
        }

        public final void setCache(ByteString value) {
            t.g(value, "value");
            this._builder.setCache(value);
        }

        public final void setCurrentState(ByteString value) {
            t.g(value, "value");
            this._builder.setCurrentState(value);
        }

        public final void setPrivacy(ByteString value) {
            t.g(value, "value");
            this._builder.setPrivacy(value);
        }

        public final void setPrivacyFsm(ByteString value) {
            t.g(value, "value");
            this._builder.setPrivacyFsm(value);
        }

        public final void setSessionCounters(SessionCountersOuterClass.SessionCounters value) {
            t.g(value, "value");
            this._builder.setSessionCounters(value);
        }

        public final void setSessionToken(ByteString value) {
            t.g(value, "value");
            this._builder.setSessionToken(value);
        }

        private Dsl(MutableDataOuterClass.MutableData.Builder builder) {
            this._builder = builder;
        }
    }

    private MutableDataKt() {
    }
}
