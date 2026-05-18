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
public final class DiagnosticEventRequestKt {
    public static final DiagnosticEventRequestKt INSTANCE = new DiagnosticEventRequestKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder _builder;

        public static final class BatchProxy extends DslProxy {
            private BatchProxy() {
            }
        }

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ DiagnosticEventRequestOuterClass.DiagnosticEventRequest _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (DiagnosticEventRequestOuterClass.DiagnosticEventRequest) build;
        }

        public final /* synthetic */ void addAllBatch(DslList dslList, Iterable values) {
            t.g(dslList, "<this>");
            t.g(values, "values");
            this._builder.addAllBatch(values);
        }

        public final /* synthetic */ void addBatch(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticEvent value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            this._builder.addBatch(value);
        }

        public final /* synthetic */ void clearBatch(DslList dslList) {
            t.g(dslList, "<this>");
            this._builder.clearBatch();
        }

        public final /* synthetic */ DslList getBatch() {
            List batchList = this._builder.getBatchList();
            t.f(batchList, "_builder.getBatchList()");
            return new DslList(batchList);
        }

        public final /* synthetic */ void plusAssignAllBatch(DslList dslList, Iterable values) {
            t.g(dslList, "<this>");
            t.g(values, "values");
            addAllBatch(dslList, values);
        }

        public final /* synthetic */ void plusAssignBatch(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticEvent value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            addBatch(dslList, value);
        }

        public final /* synthetic */ void setBatch(DslList dslList, int i, DiagnosticEventRequestOuterClass.DiagnosticEvent value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            this._builder.setBatch(i, value);
        }

        private Dsl(DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private DiagnosticEventRequestKt() {
    }
}
