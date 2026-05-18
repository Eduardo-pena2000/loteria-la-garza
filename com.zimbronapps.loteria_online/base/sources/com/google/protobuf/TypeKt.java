package com.google.protobuf;

import com.google.protobuf.Type;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class TypeKt {
    public static final TypeKt INSTANCE = new TypeKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Type.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Type.Builder builder) {
                kotlin.jvm.internal.t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public static final class FieldsProxy extends DslProxy {
            private FieldsProxy() {
            }
        }

        public static final class OneofsProxy extends DslProxy {
            private OneofsProxy() {
            }
        }

        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public /* synthetic */ Dsl(Type.Builder builder, kotlin.jvm.internal.k kVar) {
            this(builder);
        }

        public final /* synthetic */ Type _build() {
            GeneratedMessageLite build = this._builder.build();
            kotlin.jvm.internal.t.f(build, "_builder.build()");
            return (Type) build;
        }

        public final /* synthetic */ void addAllFields(DslList dslList, Iterable iterable) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(iterable, "values");
            this._builder.addAllFields(iterable);
        }

        public final /* synthetic */ void addAllOneofs(DslList dslList, Iterable iterable) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(iterable, "values");
            this._builder.addAllOneofs(iterable);
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable iterable) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(iterable, "values");
            this._builder.addAllOptions(iterable);
        }

        public final /* synthetic */ void addFields(DslList dslList, Field field) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(field, "value");
            this._builder.addFields(field);
        }

        public final /* synthetic */ void addOneofs(DslList dslList, String str) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(str, "value");
            this._builder.addOneofs(str);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option option) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(option, "value");
            this._builder.addOptions(option);
        }

        public final void clearEdition() {
            this._builder.clearEdition();
        }

        public final /* synthetic */ void clearFields(DslList dslList) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            this._builder.clearFields();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final /* synthetic */ void clearOneofs(DslList dslList) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            this._builder.clearOneofs();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            this._builder.clearOptions();
        }

        public final void clearSourceContext() {
            this._builder.clearSourceContext();
        }

        public final void clearSyntax() {
            this._builder.clearSyntax();
        }

        public final String getEdition() {
            String edition = this._builder.getEdition();
            kotlin.jvm.internal.t.f(edition, "_builder.getEdition()");
            return edition;
        }

        public final /* synthetic */ DslList getFields() {
            List fieldsList = this._builder.getFieldsList();
            kotlin.jvm.internal.t.f(fieldsList, "_builder.getFieldsList()");
            return new DslList(fieldsList);
        }

        public final String getName() {
            String name = this._builder.getName();
            kotlin.jvm.internal.t.f(name, "_builder.getName()");
            return name;
        }

        public final DslList getOneofs() {
            List oneofsList = this._builder.getOneofsList();
            kotlin.jvm.internal.t.f(oneofsList, "_builder.getOneofsList()");
            return new DslList(oneofsList);
        }

        public final /* synthetic */ DslList getOptions() {
            List optionsList = this._builder.getOptionsList();
            kotlin.jvm.internal.t.f(optionsList, "_builder.getOptionsList()");
            return new DslList(optionsList);
        }

        public final SourceContext getSourceContext() {
            SourceContext sourceContext = this._builder.getSourceContext();
            kotlin.jvm.internal.t.f(sourceContext, "_builder.getSourceContext()");
            return sourceContext;
        }

        public final Syntax getSyntax() {
            Syntax syntax = this._builder.getSyntax();
            kotlin.jvm.internal.t.f(syntax, "_builder.getSyntax()");
            return syntax;
        }

        public final int getSyntaxValue() {
            return this._builder.getSyntaxValue();
        }

        public final boolean hasSourceContext() {
            return this._builder.hasSourceContext();
        }

        public final /* synthetic */ void plusAssignAllFields(DslList dslList, Iterable iterable) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(iterable, "values");
            addAllFields(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllOneofs(DslList dslList, Iterable iterable) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(iterable, "values");
            addAllOneofs(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList dslList, Iterable iterable) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(iterable, "values");
            addAllOptions(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignFields(DslList dslList, Field field) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(field, "value");
            addFields(dslList, field);
        }

        public final /* synthetic */ void plusAssignOneofs(DslList dslList, String str) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(str, "value");
            addOneofs(dslList, str);
        }

        public final /* synthetic */ void plusAssignOptions(DslList dslList, Option option) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(option, "value");
            addOptions(dslList, option);
        }

        public final void setEdition(String str) {
            kotlin.jvm.internal.t.g(str, "value");
            this._builder.setEdition(str);
        }

        public final /* synthetic */ void setFields(DslList dslList, int i, Field field) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(field, "value");
            this._builder.setFields(i, field);
        }

        public final void setName(String str) {
            kotlin.jvm.internal.t.g(str, "value");
            this._builder.setName(str);
        }

        public final /* synthetic */ void setOneofs(DslList dslList, int i, String str) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(str, "value");
            this._builder.setOneofs(i, str);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i, Option option) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(option, "value");
            this._builder.setOptions(i, option);
        }

        public final void setSourceContext(SourceContext sourceContext) {
            kotlin.jvm.internal.t.g(sourceContext, "value");
            this._builder.setSourceContext(sourceContext);
        }

        public final void setSyntax(Syntax syntax) {
            kotlin.jvm.internal.t.g(syntax, "value");
            this._builder.setSyntax(syntax);
        }

        public final void setSyntaxValue(int i) {
            this._builder.setSyntaxValue(i);
        }

        private Dsl(Type.Builder builder) {
            this._builder = builder;
        }
    }

    private TypeKt() {
    }
}
