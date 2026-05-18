package com.google.protobuf;

import com.google.protobuf.ListValue;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ListValueKt {
    public static final ListValueKt INSTANCE = new ListValueKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ListValue.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(ListValue.Builder builder) {
                kotlin.jvm.internal.t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public static final class ValuesProxy extends DslProxy {
            private ValuesProxy() {
            }
        }

        public /* synthetic */ Dsl(ListValue.Builder builder, kotlin.jvm.internal.k kVar) {
            this(builder);
        }

        public final /* synthetic */ ListValue _build() {
            GeneratedMessageLite build = this._builder.build();
            kotlin.jvm.internal.t.f(build, "_builder.build()");
            return (ListValue) build;
        }

        public final /* synthetic */ void addAllValues(DslList dslList, Iterable iterable) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(iterable, "values");
            this._builder.addAllValues(iterable);
        }

        public final /* synthetic */ void addValues(DslList dslList, Value value) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(value, "value");
            this._builder.addValues(value);
        }

        public final /* synthetic */ void clearValues(DslList dslList) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            this._builder.clearValues();
        }

        public final /* synthetic */ DslList getValues() {
            List valuesList = this._builder.getValuesList();
            kotlin.jvm.internal.t.f(valuesList, "_builder.getValuesList()");
            return new DslList(valuesList);
        }

        public final /* synthetic */ void plusAssignAllValues(DslList dslList, Iterable iterable) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(iterable, "values");
            addAllValues(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignValues(DslList dslList, Value value) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(value, "value");
            addValues(dslList, value);
        }

        public final /* synthetic */ void setValues(DslList dslList, int i, Value value) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(value, "value");
            this._builder.setValues(i, value);
        }

        private Dsl(ListValue.Builder builder) {
            this._builder = builder;
        }
    }

    private ListValueKt() {
    }
}
