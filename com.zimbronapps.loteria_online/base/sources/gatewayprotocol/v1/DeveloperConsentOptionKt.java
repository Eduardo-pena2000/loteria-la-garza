package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DeveloperConsentOptionKt {
    public static final DeveloperConsentOptionKt INSTANCE = new DeveloperConsentOptionKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DeveloperConsentOuterClass.DeveloperConsentOption.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ DeveloperConsentOuterClass.DeveloperConsentOption _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (DeveloperConsentOuterClass.DeveloperConsentOption) build;
        }

        public final void clearCustomType() {
            this._builder.clearCustomType();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final String getCustomType() {
            String customType = this._builder.getCustomType();
            t.f(customType, "_builder.getCustomType()");
            return customType;
        }

        public final DeveloperConsentOuterClass.DeveloperConsentType getType() {
            DeveloperConsentOuterClass.DeveloperConsentType type = this._builder.getType();
            t.f(type, "_builder.getType()");
            return type;
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        public final DeveloperConsentOuterClass.DeveloperConsentChoice getValue() {
            DeveloperConsentOuterClass.DeveloperConsentChoice value = this._builder.getValue();
            t.f(value, "_builder.getValue()");
            return value;
        }

        public final int getValueValue() {
            return this._builder.getValueValue();
        }

        public final boolean hasCustomType() {
            return this._builder.hasCustomType();
        }

        public final void setCustomType(String value) {
            t.g(value, "value");
            this._builder.setCustomType(value);
        }

        public final void setType(DeveloperConsentOuterClass.DeveloperConsentType value) {
            t.g(value, "value");
            this._builder.setType(value);
        }

        public final void setTypeValue(int i) {
            this._builder.setTypeValue(i);
        }

        public final void setValue(DeveloperConsentOuterClass.DeveloperConsentChoice value) {
            t.g(value, "value");
            this._builder.setValue(value);
        }

        public final void setValueValue(int i) {
            this._builder.setValueValue(i);
        }

        private Dsl(DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder) {
            this._builder = builder;
        }
    }

    private DeveloperConsentOptionKt() {
    }
}
