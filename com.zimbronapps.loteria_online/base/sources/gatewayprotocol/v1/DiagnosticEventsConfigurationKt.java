package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DiagnosticEventsConfigurationKt {
    public static final DiagnosticEventsConfigurationKt INSTANCE = new DiagnosticEventsConfigurationKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder _builder;

        public static final class AllowedEventsProxy extends DslProxy {
            private AllowedEventsProxy() {
            }
        }

        public static final class BlockedEventsProxy extends DslProxy {
            private BlockedEventsProxy() {
            }
        }

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.DiagnosticEventsConfiguration _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (NativeConfigurationOuterClass.DiagnosticEventsConfiguration) build;
        }

        public final /* synthetic */ void addAllAllowedEvents(DslList dslList, Iterable values) {
            t.g(dslList, "<this>");
            t.g(values, "values");
            this._builder.addAllAllowedEvents(values);
        }

        public final /* synthetic */ void addAllBlockedEvents(DslList dslList, Iterable values) {
            t.g(dslList, "<this>");
            t.g(values, "values");
            this._builder.addAllBlockedEvents(values);
        }

        public final /* synthetic */ void addAllowedEvents(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            this._builder.addAllowedEvents(value);
        }

        public final /* synthetic */ void addBlockedEvents(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            this._builder.addBlockedEvents(value);
        }

        public final /* synthetic */ void clearAllowedEvents(DslList dslList) {
            t.g(dslList, "<this>");
            this._builder.clearAllowedEvents();
        }

        public final /* synthetic */ void clearBlockedEvents(DslList dslList) {
            t.g(dslList, "<this>");
            this._builder.clearBlockedEvents();
        }

        public final void clearEnabled() {
            this._builder.clearEnabled();
        }

        public final void clearMaxBatchIntervalMs() {
            this._builder.clearMaxBatchIntervalMs();
        }

        public final void clearMaxBatchSize() {
            this._builder.clearMaxBatchSize();
        }

        public final void clearSeverity() {
            this._builder.clearSeverity();
        }

        public final void clearTtmEnabled() {
            this._builder.clearTtmEnabled();
        }

        public final /* synthetic */ DslList getAllowedEvents() {
            List allowedEventsList = this._builder.getAllowedEventsList();
            t.f(allowedEventsList, "_builder.getAllowedEventsList()");
            return new DslList(allowedEventsList);
        }

        public final /* synthetic */ DslList getBlockedEvents() {
            List blockedEventsList = this._builder.getBlockedEventsList();
            t.f(blockedEventsList, "_builder.getBlockedEventsList()");
            return new DslList(blockedEventsList);
        }

        public final boolean getEnabled() {
            return this._builder.getEnabled();
        }

        public final int getMaxBatchIntervalMs() {
            return this._builder.getMaxBatchIntervalMs();
        }

        public final int getMaxBatchSize() {
            return this._builder.getMaxBatchSize();
        }

        public final DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity getSeverity() {
            DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity severity = this._builder.getSeverity();
            t.f(severity, "_builder.getSeverity()");
            return severity;
        }

        public final int getSeverityValue() {
            return this._builder.getSeverityValue();
        }

        public final boolean getTtmEnabled() {
            return this._builder.getTtmEnabled();
        }

        public final /* synthetic */ void plusAssignAllAllowedEvents(DslList dslList, Iterable values) {
            t.g(dslList, "<this>");
            t.g(values, "values");
            addAllAllowedEvents(dslList, values);
        }

        public final /* synthetic */ void plusAssignAllBlockedEvents(DslList dslList, Iterable values) {
            t.g(dslList, "<this>");
            t.g(values, "values");
            addAllBlockedEvents(dslList, values);
        }

        public final /* synthetic */ void plusAssignAllowedEvents(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            addAllowedEvents(dslList, value);
        }

        public final /* synthetic */ void plusAssignBlockedEvents(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            addBlockedEvents(dslList, value);
        }

        public final /* synthetic */ void setAllowedEvents(DslList dslList, int i, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            this._builder.setAllowedEvents(i, value);
        }

        public final /* synthetic */ void setBlockedEvents(DslList dslList, int i, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            this._builder.setBlockedEvents(i, value);
        }

        public final void setEnabled(boolean z) {
            this._builder.setEnabled(z);
        }

        public final void setMaxBatchIntervalMs(int i) {
            this._builder.setMaxBatchIntervalMs(i);
        }

        public final void setMaxBatchSize(int i) {
            this._builder.setMaxBatchSize(i);
        }

        public final void setSeverity(DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity value) {
            t.g(value, "value");
            this._builder.setSeverity(value);
        }

        public final void setSeverityValue(int i) {
            this._builder.setSeverityValue(i);
        }

        public final void setTtmEnabled(boolean z) {
            this._builder.setTtmEnabled(z);
        }

        private Dsl(NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builder) {
            this._builder = builder;
        }
    }

    private DiagnosticEventsConfigurationKt() {
    }
}
