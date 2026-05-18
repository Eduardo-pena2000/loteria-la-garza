package com.google.protobuf;

import com.google.protobuf.Struct;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class StructKt {
    public static final StructKt INSTANCE = new StructKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Struct.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Struct.Builder builder) {
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

        public /* synthetic */ Dsl(Struct.Builder builder, kotlin.jvm.internal.k kVar) {
            this(builder);
        }

        public final /* synthetic */ Struct _build() {
            GeneratedMessageLite build = this._builder.build();
            kotlin.jvm.internal.t.f(build, "_builder.build()");
            return (Struct) build;
        }

        public final /* synthetic */ void clearFields(DslMap dslMap) {
            kotlin.jvm.internal.t.g(dslMap, "<this>");
            this._builder.clearFields();
        }

        public final /* synthetic */ DslMap getFieldsMap() {
            Map fieldsMap = this._builder.getFieldsMap();
            kotlin.jvm.internal.t.f(fieldsMap, "_builder.getFieldsMap()");
            return new DslMap(fieldsMap);
        }

        public final /* synthetic */ void putAllFields(DslMap dslMap, Map map) {
            kotlin.jvm.internal.t.g(dslMap, "<this>");
            kotlin.jvm.internal.t.g(map, "map");
            this._builder.putAllFields(map);
        }

        public final void putFields(DslMap dslMap, String str, Value value) {
            kotlin.jvm.internal.t.g(dslMap, "<this>");
            kotlin.jvm.internal.t.g(str, "key");
            kotlin.jvm.internal.t.g(value, "value");
            this._builder.putFields(str, value);
        }

        public final /* synthetic */ void removeFields(DslMap dslMap, String str) {
            kotlin.jvm.internal.t.g(dslMap, "<this>");
            kotlin.jvm.internal.t.g(str, "key");
            this._builder.removeFields(str);
        }

        public final /* synthetic */ void setFields(DslMap dslMap, String str, Value value) {
            kotlin.jvm.internal.t.g(dslMap, "<this>");
            kotlin.jvm.internal.t.g(str, "key");
            kotlin.jvm.internal.t.g(value, "value");
            putFields(dslMap, str, value);
        }

        private Dsl(Struct.Builder builder) {
            this._builder = builder;
        }
    }

    private StructKt() {
    }
}
