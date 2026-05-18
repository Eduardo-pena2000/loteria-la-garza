package com.google.protobuf;

import com.google.protobuf.Api;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ApiKt {
    public static final ApiKt INSTANCE = new ApiKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Api.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Api.Builder builder) {
                kotlin.jvm.internal.t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public static final class MethodsProxy extends DslProxy {
            private MethodsProxy() {
            }
        }

        public static final class MixinsProxy extends DslProxy {
            private MixinsProxy() {
            }
        }

        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public /* synthetic */ Dsl(Api.Builder builder, kotlin.jvm.internal.k kVar) {
            this(builder);
        }

        public final /* synthetic */ Api _build() {
            GeneratedMessageLite build = this._builder.build();
            kotlin.jvm.internal.t.f(build, "_builder.build()");
            return (Api) build;
        }

        public final /* synthetic */ void addAllMethods(DslList dslList, Iterable iterable) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(iterable, "values");
            this._builder.addAllMethods(iterable);
        }

        public final /* synthetic */ void addAllMixins(DslList dslList, Iterable iterable) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(iterable, "values");
            this._builder.addAllMixins(iterable);
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable iterable) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(iterable, "values");
            this._builder.addAllOptions(iterable);
        }

        public final /* synthetic */ void addMethods(DslList dslList, Method method) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(method, "value");
            this._builder.addMethods(method);
        }

        public final /* synthetic */ void addMixins(DslList dslList, Mixin mixin) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(mixin, "value");
            this._builder.addMixins(mixin);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option option) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(option, "value");
            this._builder.addOptions(option);
        }

        public final /* synthetic */ void clearMethods(DslList dslList) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            this._builder.clearMethods();
        }

        public final /* synthetic */ void clearMixins(DslList dslList) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            this._builder.clearMixins();
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

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        public final /* synthetic */ DslList getMethods() {
            List methodsList = this._builder.getMethodsList();
            kotlin.jvm.internal.t.f(methodsList, "_builder.getMethodsList()");
            return new DslList(methodsList);
        }

        public final /* synthetic */ DslList getMixins() {
            List mixinsList = this._builder.getMixinsList();
            kotlin.jvm.internal.t.f(mixinsList, "_builder.getMixinsList()");
            return new DslList(mixinsList);
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

        public final String getVersion() {
            String version = this._builder.getVersion();
            kotlin.jvm.internal.t.f(version, "_builder.getVersion()");
            return version;
        }

        public final boolean hasSourceContext() {
            return this._builder.hasSourceContext();
        }

        public final /* synthetic */ void plusAssignAllMethods(DslList dslList, Iterable iterable) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(iterable, "values");
            addAllMethods(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllMixins(DslList dslList, Iterable iterable) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(iterable, "values");
            addAllMixins(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList dslList, Iterable iterable) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(iterable, "values");
            addAllOptions(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignMethods(DslList dslList, Method method) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(method, "value");
            addMethods(dslList, method);
        }

        public final /* synthetic */ void plusAssignMixins(DslList dslList, Mixin mixin) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(mixin, "value");
            addMixins(dslList, mixin);
        }

        public final /* synthetic */ void plusAssignOptions(DslList dslList, Option option) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(option, "value");
            addOptions(dslList, option);
        }

        public final /* synthetic */ void setMethods(DslList dslList, int i, Method method) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(method, "value");
            this._builder.setMethods(i, method);
        }

        public final /* synthetic */ void setMixins(DslList dslList, int i, Mixin mixin) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(mixin, "value");
            this._builder.setMixins(i, mixin);
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

        public final void setVersion(String str) {
            kotlin.jvm.internal.t.g(str, "value");
            this._builder.setVersion(str);
        }

        private Dsl(Api.Builder builder) {
            this._builder = builder;
        }
    }

    private ApiKt() {
    }
}
