package com.google.protobuf;

import com.google.protobuf.Field;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class FieldKt {
    public static final FieldKt INSTANCE = new FieldKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Field.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Field.Builder builder) {
                kotlin.jvm.internal.t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public /* synthetic */ Dsl(Field.Builder builder, kotlin.jvm.internal.k kVar) {
            this(builder);
        }

        public final /* synthetic */ Field _build() {
            GeneratedMessageLite build = this._builder.build();
            kotlin.jvm.internal.t.f(build, "_builder.build()");
            return (Field) build;
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable iterable) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(iterable, "values");
            this._builder.addAllOptions(iterable);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option option) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(option, "value");
            this._builder.addOptions(option);
        }

        public final void clearCardinality() {
            this._builder.clearCardinality();
        }

        public final void clearDefaultValue() {
            this._builder.clearDefaultValue();
        }

        public final void clearJsonName() {
            this._builder.clearJsonName();
        }

        public final void clearKind() {
            this._builder.clearKind();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearNumber() {
            this._builder.clearNumber();
        }

        public final void clearOneofIndex() {
            this._builder.clearOneofIndex();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            this._builder.clearOptions();
        }

        public final void clearPacked() {
            this._builder.clearPacked();
        }

        public final void clearTypeUrl() {
            this._builder.clearTypeUrl();
        }

        public final Field.Cardinality getCardinality() {
            Field.Cardinality cardinality = this._builder.getCardinality();
            kotlin.jvm.internal.t.f(cardinality, "_builder.getCardinality()");
            return cardinality;
        }

        public final int getCardinalityValue() {
            return this._builder.getCardinalityValue();
        }

        public final String getDefaultValue() {
            String defaultValue = this._builder.getDefaultValue();
            kotlin.jvm.internal.t.f(defaultValue, "_builder.getDefaultValue()");
            return defaultValue;
        }

        public final String getJsonName() {
            String jsonName = this._builder.getJsonName();
            kotlin.jvm.internal.t.f(jsonName, "_builder.getJsonName()");
            return jsonName;
        }

        public final Field.Kind getKind() {
            Field.Kind kind = this._builder.getKind();
            kotlin.jvm.internal.t.f(kind, "_builder.getKind()");
            return kind;
        }

        public final int getKindValue() {
            return this._builder.getKindValue();
        }

        public final String getName() {
            String name = this._builder.getName();
            kotlin.jvm.internal.t.f(name, "_builder.getName()");
            return name;
        }

        public final int getNumber() {
            return this._builder.getNumber();
        }

        public final int getOneofIndex() {
            return this._builder.getOneofIndex();
        }

        public final /* synthetic */ DslList getOptions() {
            List optionsList = this._builder.getOptionsList();
            kotlin.jvm.internal.t.f(optionsList, "_builder.getOptionsList()");
            return new DslList(optionsList);
        }

        public final boolean getPacked() {
            return this._builder.getPacked();
        }

        public final String getTypeUrl() {
            String typeUrl = this._builder.getTypeUrl();
            kotlin.jvm.internal.t.f(typeUrl, "_builder.getTypeUrl()");
            return typeUrl;
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList dslList, Iterable iterable) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(iterable, "values");
            addAllOptions(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignOptions(DslList dslList, Option option) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(option, "value");
            addOptions(dslList, option);
        }

        public final void setCardinality(Field.Cardinality cardinality) {
            kotlin.jvm.internal.t.g(cardinality, "value");
            this._builder.setCardinality(cardinality);
        }

        public final void setCardinalityValue(int i) {
            this._builder.setCardinalityValue(i);
        }

        public final void setDefaultValue(String str) {
            kotlin.jvm.internal.t.g(str, "value");
            this._builder.setDefaultValue(str);
        }

        public final void setJsonName(String str) {
            kotlin.jvm.internal.t.g(str, "value");
            this._builder.setJsonName(str);
        }

        public final void setKind(Field.Kind kind) {
            kotlin.jvm.internal.t.g(kind, "value");
            this._builder.setKind(kind);
        }

        public final void setKindValue(int i) {
            this._builder.setKindValue(i);
        }

        public final void setName(String str) {
            kotlin.jvm.internal.t.g(str, "value");
            this._builder.setName(str);
        }

        public final void setNumber(int i) {
            this._builder.setNumber(i);
        }

        public final void setOneofIndex(int i) {
            this._builder.setOneofIndex(i);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i, Option option) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(option, "value");
            this._builder.setOptions(i, option);
        }

        public final void setPacked(boolean z) {
            this._builder.setPacked(z);
        }

        public final void setTypeUrl(String str) {
            kotlin.jvm.internal.t.g(str, "value");
            this._builder.setTypeUrl(str);
        }

        private Dsl(Field.Builder builder) {
            this._builder = builder;
        }
    }

    private FieldKt() {
    }
}
