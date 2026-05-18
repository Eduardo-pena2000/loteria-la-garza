package com.google.protobuf;

import com.google.protobuf.Value;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ValueKt {
    public static final ValueKt INSTANCE = new ValueKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Value.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Value.Builder builder) {
                kotlin.jvm.internal.t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(Value.Builder builder, kotlin.jvm.internal.k kVar) {
            this(builder);
        }

        public final /* synthetic */ Value _build() {
            GeneratedMessageLite build = this._builder.build();
            kotlin.jvm.internal.t.f(build, "_builder.build()");
            return (Value) build;
        }

        public final void clearBoolValue() {
            this._builder.clearBoolValue();
        }

        public final void clearKind() {
            this._builder.clearKind();
        }

        public final void clearListValue() {
            this._builder.clearListValue();
        }

        public final void clearNullValue() {
            this._builder.clearNullValue();
        }

        public final void clearNumberValue() {
            this._builder.clearNumberValue();
        }

        public final void clearStringValue() {
            this._builder.clearStringValue();
        }

        public final void clearStructValue() {
            this._builder.clearStructValue();
        }

        public final boolean getBoolValue() {
            return this._builder.getBoolValue();
        }

        public final Value.KindCase getKindCase() {
            Value.KindCase kindCase = this._builder.getKindCase();
            kotlin.jvm.internal.t.f(kindCase, "_builder.getKindCase()");
            return kindCase;
        }

        public final ListValue getListValue() {
            ListValue listValue = this._builder.getListValue();
            kotlin.jvm.internal.t.f(listValue, "_builder.getListValue()");
            return listValue;
        }

        public final NullValue getNullValue() {
            NullValue nullValue = this._builder.getNullValue();
            kotlin.jvm.internal.t.f(nullValue, "_builder.getNullValue()");
            return nullValue;
        }

        public final int getNullValueValue() {
            return this._builder.getNullValueValue();
        }

        public final double getNumberValue() {
            return this._builder.getNumberValue();
        }

        public final String getStringValue() {
            String stringValue = this._builder.getStringValue();
            kotlin.jvm.internal.t.f(stringValue, "_builder.getStringValue()");
            return stringValue;
        }

        public final Struct getStructValue() {
            Struct structValue = this._builder.getStructValue();
            kotlin.jvm.internal.t.f(structValue, "_builder.getStructValue()");
            return structValue;
        }

        public final boolean hasBoolValue() {
            return this._builder.hasBoolValue();
        }

        public final boolean hasListValue() {
            return this._builder.hasListValue();
        }

        public final boolean hasNullValue() {
            return this._builder.hasNullValue();
        }

        public final boolean hasNumberValue() {
            return this._builder.hasNumberValue();
        }

        public final boolean hasStringValue() {
            return this._builder.hasStringValue();
        }

        public final boolean hasStructValue() {
            return this._builder.hasStructValue();
        }

        public final void setBoolValue(boolean z) {
            this._builder.setBoolValue(z);
        }

        public final void setListValue(ListValue listValue) {
            kotlin.jvm.internal.t.g(listValue, "value");
            this._builder.setListValue(listValue);
        }

        public final void setNullValue(NullValue nullValue) {
            kotlin.jvm.internal.t.g(nullValue, "value");
            this._builder.setNullValue(nullValue);
        }

        public final void setNullValueValue(int i) {
            this._builder.setNullValueValue(i);
        }

        public final void setNumberValue(double d) {
            this._builder.setNumberValue(d);
        }

        public final void setStringValue(String str) {
            kotlin.jvm.internal.t.g(str, "value");
            this._builder.setStringValue(str);
        }

        public final void setStructValue(Struct struct) {
            kotlin.jvm.internal.t.g(struct, "value");
            this._builder.setStructValue(struct);
        }

        private Dsl(Value.Builder builder) {
            this._builder = builder;
        }
    }

    private ValueKt() {
    }
}
