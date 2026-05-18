package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DebugSettingsKt {
    public static final DebugSettingsKt INSTANCE = new DebugSettingsKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.DebugSettings.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.DebugSettings.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.DebugSettings.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.DebugSettings _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (NativeConfigurationOuterClass.DebugSettings) build;
        }

        public final void clearCleanCache() {
            this._builder.clearCleanCache();
        }

        public final void clearEnableTracing() {
            this._builder.clearEnableTracing();
        }

        public final void clearWebviewInspectable() {
            this._builder.clearWebviewInspectable();
        }

        public final boolean getCleanCache() {
            return this._builder.getCleanCache();
        }

        public final boolean getEnableTracing() {
            return this._builder.getEnableTracing();
        }

        public final boolean getWebviewInspectable() {
            return this._builder.getWebviewInspectable();
        }

        public final void setCleanCache(boolean z) {
            this._builder.setCleanCache(z);
        }

        public final void setEnableTracing(boolean z) {
            this._builder.setEnableTracing(z);
        }

        public final void setWebviewInspectable(boolean z) {
            this._builder.setWebviewInspectable(z);
        }

        private Dsl(NativeConfigurationOuterClass.DebugSettings.Builder builder) {
            this._builder = builder;
        }
    }

    private DebugSettingsKt() {
    }
}
