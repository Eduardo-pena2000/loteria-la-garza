package com.google.protobuf;

import com.google.protobuf.Enum;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class EnumKt {
    public static final EnumKt INSTANCE = new EnumKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Enum.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Enum.Builder builder) {
                kotlin.jvm.internal.t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public static final class EnumvalueProxy extends DslProxy {
            private EnumvalueProxy() {
            }
        }

        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public /* synthetic */ Dsl(Enum.Builder builder, kotlin.jvm.internal.k kVar) {
            this(builder);
        }

        public final /* synthetic */ Enum _build() {
            GeneratedMessageLite build = this._builder.build();
            kotlin.jvm.internal.t.f(build, "_builder.build()");
            return (Enum) build;
        }

        public final /* synthetic */ void addAllEnumvalue(DslList dslList, Iterable iterable) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(iterable, "values");
            this._builder.addAllEnumvalue(iterable);
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable iterable) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(iterable, "values");
            this._builder.addAllOptions(iterable);
        }

        public final /* synthetic */ void addEnumvalue(DslList dslList, EnumValue enumValue) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(enumValue, "value");
            this._builder.addEnumvalue(enumValue);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option option) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(option, "value");
            this._builder.addOptions(option);
        }

        public final void clearEdition() {
            this._builder.clearEdition();
        }

        public final /* synthetic */ void clearEnumvalue(DslList dslList) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            this._builder.clearEnumvalue();
        }

        public final void clearName() {
            this._builder.clearName();
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

        public final /* synthetic */ DslList getEnumvalue() {
            List enumvalueList = this._builder.getEnumvalueList();
            kotlin.jvm.internal.t.f(enumvalueList, "_builder.getEnumvalueList()");
            return new DslList(enumvalueList);
        }

        public final String getName() {
            String name = this._builder.getName();
            kotlin.jvm.internal.t.f(name, "_builder.getName()");
            return name;
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

        public final /* synthetic */ void plusAssignAllEnumvalue(DslList dslList, Iterable iterable) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(iterable, "values");
            addAllEnumvalue(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList dslList, Iterable iterable) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(iterable, "values");
            addAllOptions(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignEnumvalue(DslList dslList, EnumValue enumValue) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(enumValue, "value");
            addEnumvalue(dslList, enumValue);
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

        public final /* synthetic */ void setEnumvalue(DslList dslList, int i, EnumValue enumValue) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(enumValue, "value");
            this._builder.setEnumvalue(i, enumValue);
        }

        public final void setName(String str) {
            kotlin.jvm.internal.t.g(str, "value");
            this._builder.setName(str);
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

        private Dsl(Enum.Builder builder) {
            this._builder = builder;
        }
    }

    private EnumKt() {
    }
}
