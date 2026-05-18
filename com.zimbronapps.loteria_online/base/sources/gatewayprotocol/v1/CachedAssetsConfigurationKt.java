package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CachedAssetsConfigurationKt {
    public static final CachedAssetsConfigurationKt INSTANCE = new CachedAssetsConfigurationKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.CachedAssetsConfiguration _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (NativeConfigurationOuterClass.CachedAssetsConfiguration) build;
        }

        public final void clearMaxCachedAssetAgeMs() {
            this._builder.clearMaxCachedAssetAgeMs();
        }

        public final void clearMaxCachedAssetSizeMb() {
            this._builder.clearMaxCachedAssetSizeMb();
        }

        public final long getMaxCachedAssetAgeMs() {
            return this._builder.getMaxCachedAssetAgeMs();
        }

        public final int getMaxCachedAssetSizeMb() {
            return this._builder.getMaxCachedAssetSizeMb();
        }

        public final void setMaxCachedAssetAgeMs(long j) {
            this._builder.setMaxCachedAssetAgeMs(j);
        }

        public final void setMaxCachedAssetSizeMb(int i) {
            this._builder.setMaxCachedAssetSizeMb(i);
        }

        private Dsl(NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder builder) {
            this._builder = builder;
        }
    }

    private CachedAssetsConfigurationKt() {
    }
}
