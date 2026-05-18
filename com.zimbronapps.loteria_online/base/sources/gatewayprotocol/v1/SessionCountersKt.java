package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.SessionCountersOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class SessionCountersKt {
    public static final SessionCountersKt INSTANCE = new SessionCountersKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final SessionCountersOuterClass.SessionCounters.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(SessionCountersOuterClass.SessionCounters.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(SessionCountersOuterClass.SessionCounters.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ SessionCountersOuterClass.SessionCounters _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (SessionCountersOuterClass.SessionCounters) build;
        }

        public final void clearBannerImpressions() {
            this._builder.clearBannerImpressions();
        }

        public final void clearBannerLoadRequests() {
            this._builder.clearBannerLoadRequests();
        }

        public final void clearBannerRequestsAdm() {
            this._builder.clearBannerRequestsAdm();
        }

        public final void clearFocusChangeCount() {
            this._builder.clearFocusChangeCount();
        }

        public final void clearGlobalAdsFocusChangeCount() {
            this._builder.clearGlobalAdsFocusChangeCount();
        }

        public final void clearGlobalAdsFocusTime() {
            this._builder.clearGlobalAdsFocusTime();
        }

        public final void clearLoadRequests() {
            this._builder.clearLoadRequests();
        }

        public final void clearLoadRequestsAdm() {
            this._builder.clearLoadRequestsAdm();
        }

        public final int getBannerImpressions() {
            return this._builder.getBannerImpressions();
        }

        public final int getBannerLoadRequests() {
            return this._builder.getBannerLoadRequests();
        }

        public final int getBannerRequestsAdm() {
            return this._builder.getBannerRequestsAdm();
        }

        public final int getFocusChangeCount() {
            return this._builder.getFocusChangeCount();
        }

        public final int getGlobalAdsFocusChangeCount() {
            return this._builder.getGlobalAdsFocusChangeCount();
        }

        public final int getGlobalAdsFocusTime() {
            return this._builder.getGlobalAdsFocusTime();
        }

        public final int getLoadRequests() {
            return this._builder.getLoadRequests();
        }

        public final int getLoadRequestsAdm() {
            return this._builder.getLoadRequestsAdm();
        }

        public final void setBannerImpressions(int i) {
            this._builder.setBannerImpressions(i);
        }

        public final void setBannerLoadRequests(int i) {
            this._builder.setBannerLoadRequests(i);
        }

        public final void setBannerRequestsAdm(int i) {
            this._builder.setBannerRequestsAdm(i);
        }

        public final void setFocusChangeCount(int i) {
            this._builder.setFocusChangeCount(i);
        }

        public final void setGlobalAdsFocusChangeCount(int i) {
            this._builder.setGlobalAdsFocusChangeCount(i);
        }

        public final void setGlobalAdsFocusTime(int i) {
            this._builder.setGlobalAdsFocusTime(i);
        }

        public final void setLoadRequests(int i) {
            this._builder.setLoadRequests(i);
        }

        public final void setLoadRequestsAdm(int i) {
            this._builder.setLoadRequestsAdm(i);
        }

        private Dsl(SessionCountersOuterClass.SessionCounters.Builder builder) {
            this._builder = builder;
        }
    }

    private SessionCountersKt() {
    }
}
