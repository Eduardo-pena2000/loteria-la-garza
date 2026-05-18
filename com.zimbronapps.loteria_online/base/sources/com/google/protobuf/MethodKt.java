package com.google.protobuf;

import com.google.protobuf.Method;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class MethodKt {
    public static final MethodKt INSTANCE = new MethodKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Method.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Method.Builder builder) {
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

        public /* synthetic */ Dsl(Method.Builder builder, kotlin.jvm.internal.k kVar) {
            this(builder);
        }

        public final /* synthetic */ Method _build() {
            GeneratedMessageLite build = this._builder.build();
            kotlin.jvm.internal.t.f(build, "_builder.build()");
            return (Method) build;
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

        public final void clearName() {
            this._builder.clearName();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            this._builder.clearOptions();
        }

        public final void clearRequestStreaming() {
            this._builder.clearRequestStreaming();
        }

        public final void clearRequestTypeUrl() {
            this._builder.clearRequestTypeUrl();
        }

        public final void clearResponseStreaming() {
            this._builder.clearResponseStreaming();
        }

        public final void clearResponseTypeUrl() {
            this._builder.clearResponseTypeUrl();
        }

        public final void clearSyntax() {
            this._builder.clearSyntax();
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

        public final boolean getRequestStreaming() {
            return this._builder.getRequestStreaming();
        }

        public final String getRequestTypeUrl() {
            String requestTypeUrl = this._builder.getRequestTypeUrl();
            kotlin.jvm.internal.t.f(requestTypeUrl, "_builder.getRequestTypeUrl()");
            return requestTypeUrl;
        }

        public final boolean getResponseStreaming() {
            return this._builder.getResponseStreaming();
        }

        public final String getResponseTypeUrl() {
            String responseTypeUrl = this._builder.getResponseTypeUrl();
            kotlin.jvm.internal.t.f(responseTypeUrl, "_builder.getResponseTypeUrl()");
            return responseTypeUrl;
        }

        public final Syntax getSyntax() {
            Syntax syntax = this._builder.getSyntax();
            kotlin.jvm.internal.t.f(syntax, "_builder.getSyntax()");
            return syntax;
        }

        public final int getSyntaxValue() {
            return this._builder.getSyntaxValue();
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

        public final void setName(String str) {
            kotlin.jvm.internal.t.g(str, "value");
            this._builder.setName(str);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i, Option option) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(option, "value");
            this._builder.setOptions(i, option);
        }

        public final void setRequestStreaming(boolean z) {
            this._builder.setRequestStreaming(z);
        }

        public final void setRequestTypeUrl(String str) {
            kotlin.jvm.internal.t.g(str, "value");
            this._builder.setRequestTypeUrl(str);
        }

        public final void setResponseStreaming(boolean z) {
            this._builder.setResponseStreaming(z);
        }

        public final void setResponseTypeUrl(String str) {
            kotlin.jvm.internal.t.g(str, "value");
            this._builder.setResponseTypeUrl(str);
        }

        public final void setSyntax(Syntax syntax) {
            kotlin.jvm.internal.t.g(syntax, "value");
            this._builder.setSyntax(syntax);
        }

        public final void setSyntaxValue(int i) {
            this._builder.setSyntaxValue(i);
        }

        private Dsl(Method.Builder builder) {
            this._builder = builder;
        }
    }

    private MethodKt() {
    }
}
