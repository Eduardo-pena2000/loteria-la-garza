package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MediationInfoKt {
    public static final MediationInfoKt INSTANCE = new MediationInfoKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final MediationInfoOuterClass.MediationInfo.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(MediationInfoOuterClass.MediationInfo.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(MediationInfoOuterClass.MediationInfo.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ MediationInfoOuterClass.MediationInfo _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (MediationInfoOuterClass.MediationInfo) build;
        }

        public final void clearAdapterVersion() {
            this._builder.clearAdapterVersion();
        }

        public final void clearCustomName() {
            this._builder.clearCustomName();
        }

        public final void clearProvider() {
            this._builder.clearProvider();
        }

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        public final String getAdapterVersion() {
            String adapterVersion = this._builder.getAdapterVersion();
            t.f(adapterVersion, "_builder.getAdapterVersion()");
            return adapterVersion;
        }

        public final String getCustomName() {
            String customName = this._builder.getCustomName();
            t.f(customName, "_builder.getCustomName()");
            return customName;
        }

        public final ClientInfoOuterClass.MediationProvider getProvider() {
            ClientInfoOuterClass.MediationProvider provider = this._builder.getProvider();
            t.f(provider, "_builder.getProvider()");
            return provider;
        }

        public final int getProviderValue() {
            return this._builder.getProviderValue();
        }

        public final String getVersion() {
            String version = this._builder.getVersion();
            t.f(version, "_builder.getVersion()");
            return version;
        }

        public final boolean hasAdapterVersion() {
            return this._builder.hasAdapterVersion();
        }

        public final boolean hasCustomName() {
            return this._builder.hasCustomName();
        }

        public final boolean hasVersion() {
            return this._builder.hasVersion();
        }

        public final void setAdapterVersion(String value) {
            t.g(value, "value");
            this._builder.setAdapterVersion(value);
        }

        public final void setCustomName(String value) {
            t.g(value, "value");
            this._builder.setCustomName(value);
        }

        public final void setProvider(ClientInfoOuterClass.MediationProvider value) {
            t.g(value, "value");
            this._builder.setProvider(value);
        }

        public final void setProviderValue(int i) {
            this._builder.setProviderValue(i);
        }

        public final void setVersion(String value) {
            t.g(value, "value");
            this._builder.setVersion(value);
        }

        private Dsl(MediationInfoOuterClass.MediationInfo.Builder builder) {
            this._builder = builder;
        }
    }

    private MediationInfoKt() {
    }
}
