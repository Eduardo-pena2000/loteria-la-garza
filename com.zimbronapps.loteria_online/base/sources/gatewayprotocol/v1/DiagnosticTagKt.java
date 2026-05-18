package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DiagnosticTagKt {
    public static final DiagnosticTagKt INSTANCE = new DiagnosticTagKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DiagnosticEventRequestOuterClass.DiagnosticTag.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DiagnosticEventRequestOuterClass.DiagnosticTag.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public static final class TagTypeProxy extends DslProxy {
            private TagTypeProxy() {
            }
        }

        public /* synthetic */ Dsl(DiagnosticEventRequestOuterClass.DiagnosticTag.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ DiagnosticEventRequestOuterClass.DiagnosticTag _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (DiagnosticEventRequestOuterClass.DiagnosticTag) build;
        }

        public final /* synthetic */ void addAllTagType(DslList dslList, Iterable values) {
            t.g(dslList, "<this>");
            t.g(values, "values");
            this._builder.addAllTagType(values);
        }

        public final /* synthetic */ void addTagType(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticTagType value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            this._builder.addTagType(value);
        }

        public final void clearCustomTagType() {
            this._builder.clearCustomTagType();
        }

        public final void clearIntValue() {
            this._builder.clearIntValue();
        }

        public final void clearStringValue() {
            this._builder.clearStringValue();
        }

        public final /* synthetic */ void clearTagType(DslList dslList) {
            t.g(dslList, "<this>");
            this._builder.clearTagType();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final String getCustomTagType() {
            String customTagType = this._builder.getCustomTagType();
            t.f(customTagType, "_builder.getCustomTagType()");
            return customTagType;
        }

        public final int getIntValue() {
            return this._builder.getIntValue();
        }

        public final String getStringValue() {
            String stringValue = this._builder.getStringValue();
            t.f(stringValue, "_builder.getStringValue()");
            return stringValue;
        }

        public final /* synthetic */ DslList getTagType() {
            List tagTypeList = this._builder.getTagTypeList();
            t.f(tagTypeList, "_builder.getTagTypeList()");
            return new DslList(tagTypeList);
        }

        public final DiagnosticEventRequestOuterClass.DiagnosticTag.ValueCase getValueCase() {
            DiagnosticEventRequestOuterClass.DiagnosticTag.ValueCase valueCase = this._builder.getValueCase();
            t.f(valueCase, "_builder.getValueCase()");
            return valueCase;
        }

        public final boolean hasCustomTagType() {
            return this._builder.hasCustomTagType();
        }

        public final boolean hasIntValue() {
            return this._builder.hasIntValue();
        }

        public final boolean hasStringValue() {
            return this._builder.hasStringValue();
        }

        public final /* synthetic */ void plusAssignAllTagType(DslList dslList, Iterable values) {
            t.g(dslList, "<this>");
            t.g(values, "values");
            addAllTagType(dslList, values);
        }

        public final /* synthetic */ void plusAssignTagType(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticTagType value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            addTagType(dslList, value);
        }

        public final void setCustomTagType(String value) {
            t.g(value, "value");
            this._builder.setCustomTagType(value);
        }

        public final void setIntValue(int i) {
            this._builder.setIntValue(i);
        }

        public final void setStringValue(String value) {
            t.g(value, "value");
            this._builder.setStringValue(value);
        }

        public final /* synthetic */ void setTagType(DslList dslList, int i, DiagnosticEventRequestOuterClass.DiagnosticTagType value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            this._builder.setTagType(i, value);
        }

        private Dsl(DiagnosticEventRequestOuterClass.DiagnosticTag.Builder builder) {
            this._builder = builder;
        }
    }

    private DiagnosticTagKt() {
    }
}
