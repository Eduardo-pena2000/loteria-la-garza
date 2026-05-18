package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DeveloperConsentKt {
    public static final DeveloperConsentKt INSTANCE = new DeveloperConsentKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DeveloperConsentOuterClass.DeveloperConsent.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DeveloperConsentOuterClass.DeveloperConsent.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public /* synthetic */ Dsl(DeveloperConsentOuterClass.DeveloperConsent.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ DeveloperConsentOuterClass.DeveloperConsent _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (DeveloperConsentOuterClass.DeveloperConsent) build;
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable values) {
            t.g(dslList, "<this>");
            t.g(values, "values");
            this._builder.addAllOptions(values);
        }

        public final /* synthetic */ void addOptions(DslList dslList, DeveloperConsentOuterClass.DeveloperConsentOption value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            this._builder.addOptions(value);
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            t.g(dslList, "<this>");
            this._builder.clearOptions();
        }

        public final /* synthetic */ DslList getOptions() {
            List optionsList = this._builder.getOptionsList();
            t.f(optionsList, "_builder.getOptionsList()");
            return new DslList(optionsList);
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList dslList, Iterable values) {
            t.g(dslList, "<this>");
            t.g(values, "values");
            addAllOptions(dslList, values);
        }

        public final /* synthetic */ void plusAssignOptions(DslList dslList, DeveloperConsentOuterClass.DeveloperConsentOption value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            addOptions(dslList, value);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i, DeveloperConsentOuterClass.DeveloperConsentOption value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            this._builder.setOptions(i, value);
        }

        private Dsl(DeveloperConsentOuterClass.DeveloperConsent.Builder builder) {
            this._builder = builder;
        }
    }

    private DeveloperConsentKt() {
    }
}
