package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class NativeConfigurationKt {
    public static final NativeConfigurationKt INSTANCE = new NativeConfigurationKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.NativeConfiguration.Builder _builder;

        public static final class AdditionalStorePackagesProxy extends DslProxy {
            private AdditionalStorePackagesProxy() {
            }
        }

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.NativeConfiguration.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public static final class ObservableAndroidActivitiesProxy extends DslProxy {
            private ObservableAndroidActivitiesProxy() {
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.NativeConfiguration.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.NativeConfiguration _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (NativeConfigurationOuterClass.NativeConfiguration) build;
        }

        public final /* synthetic */ void addAdditionalStorePackages(DslList dslList, String value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            this._builder.addAdditionalStorePackages(value);
        }

        public final /* synthetic */ void addAllAdditionalStorePackages(DslList dslList, Iterable values) {
            t.g(dslList, "<this>");
            t.g(values, "values");
            this._builder.addAllAdditionalStorePackages(values);
        }

        public final /* synthetic */ void addAllObservableAndroidActivities(DslList dslList, Iterable values) {
            t.g(dslList, "<this>");
            t.g(values, "values");
            this._builder.addAllObservableAndroidActivities(values);
        }

        public final /* synthetic */ void addObservableAndroidActivities(DslList dslList, ByteString value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            this._builder.addObservableAndroidActivities(value);
        }

        public final void clearAdOperations() {
            this._builder.clearAdOperations();
        }

        public final void clearAdPolicy() {
            this._builder.clearAdPolicy();
        }

        public final /* synthetic */ void clearAdditionalStorePackages(DslList dslList) {
            t.g(dslList, "<this>");
            this._builder.clearAdditionalStorePackages();
        }

        public final void clearCachedAssetsConfiguration() {
            this._builder.clearCachedAssetsConfiguration();
        }

        public final void clearCachedWebviewFilesConfiguration() {
            this._builder.clearCachedWebviewFilesConfiguration();
        }

        public final void clearDebugSettings() {
            this._builder.clearDebugSettings();
        }

        public final void clearDefaultShowCompletionState() {
            this._builder.clearDefaultShowCompletionState();
        }

        public final void clearDiagnosticEvents() {
            this._builder.clearDiagnosticEvents();
        }

        public final void clearDownloadPolicy() {
            this._builder.clearDownloadPolicy();
        }

        public final void clearEnableIapEvent() {
            this._builder.clearEnableIapEvent();
        }

        public final void clearEnableOm() {
            this._builder.clearEnableOm();
        }

        public final void clearFeatureFlags() {
            this._builder.clearFeatureFlags();
        }

        public final void clearInitPolicy() {
            this._builder.clearInitPolicy();
        }

        public final /* synthetic */ void clearObservableAndroidActivities(DslList dslList) {
            t.g(dslList, "<this>");
            this._builder.clearObservableAndroidActivities();
        }

        public final void clearOperativeEventPolicy() {
            this._builder.clearOperativeEventPolicy();
        }

        public final void clearOtherPolicy() {
            this._builder.clearOtherPolicy();
        }

        public final NativeConfigurationOuterClass.AdOperationsConfiguration getAdOperations() {
            NativeConfigurationOuterClass.AdOperationsConfiguration adOperations = this._builder.getAdOperations();
            t.f(adOperations, "_builder.getAdOperations()");
            return adOperations;
        }

        public final NativeConfigurationOuterClass.RequestPolicy getAdPolicy() {
            NativeConfigurationOuterClass.RequestPolicy adPolicy = this._builder.getAdPolicy();
            t.f(adPolicy, "_builder.getAdPolicy()");
            return adPolicy;
        }

        public final DslList getAdditionalStorePackages() {
            List additionalStorePackagesList = this._builder.getAdditionalStorePackagesList();
            t.f(additionalStorePackagesList, "_builder.getAdditionalStorePackagesList()");
            return new DslList(additionalStorePackagesList);
        }

        public final NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedAssetsConfiguration() {
            NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = this._builder.getCachedAssetsConfiguration();
            t.f(cachedAssetsConfiguration, "_builder.getCachedAssetsConfiguration()");
            return cachedAssetsConfiguration;
        }

        public final NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedWebviewFilesConfiguration() {
            NativeConfigurationOuterClass.CachedAssetsConfiguration cachedWebviewFilesConfiguration = this._builder.getCachedWebviewFilesConfiguration();
            t.f(cachedWebviewFilesConfiguration, "_builder.getCachedWebviewFilesConfiguration()");
            return cachedWebviewFilesConfiguration;
        }

        public final NativeConfigurationOuterClass.DebugSettings getDebugSettings() {
            NativeConfigurationOuterClass.DebugSettings debugSettings = this._builder.getDebugSettings();
            t.f(debugSettings, "_builder.getDebugSettings()");
            return debugSettings;
        }

        public final NativeConfigurationOuterClass.ShowCompletionState getDefaultShowCompletionState() {
            NativeConfigurationOuterClass.ShowCompletionState defaultShowCompletionState = this._builder.getDefaultShowCompletionState();
            t.f(defaultShowCompletionState, "_builder.getDefaultShowCompletionState()");
            return defaultShowCompletionState;
        }

        public final int getDefaultShowCompletionStateValue() {
            return this._builder.getDefaultShowCompletionStateValue();
        }

        public final NativeConfigurationOuterClass.DiagnosticEventsConfiguration getDiagnosticEvents() {
            NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEvents = this._builder.getDiagnosticEvents();
            t.f(diagnosticEvents, "_builder.getDiagnosticEvents()");
            return diagnosticEvents;
        }

        public final NativeConfigurationOuterClass.RequestPolicy getDownloadPolicy() {
            NativeConfigurationOuterClass.RequestPolicy downloadPolicy = this._builder.getDownloadPolicy();
            t.f(downloadPolicy, "_builder.getDownloadPolicy()");
            return downloadPolicy;
        }

        public final boolean getEnableIapEvent() {
            return this._builder.getEnableIapEvent();
        }

        public final boolean getEnableOm() {
            return this._builder.getEnableOm();
        }

        public final NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
            NativeConfigurationOuterClass.FeatureFlags featureFlags = this._builder.getFeatureFlags();
            t.f(featureFlags, "_builder.getFeatureFlags()");
            return featureFlags;
        }

        public final NativeConfigurationOuterClass.RequestPolicy getInitPolicy() {
            NativeConfigurationOuterClass.RequestPolicy initPolicy = this._builder.getInitPolicy();
            t.f(initPolicy, "_builder.getInitPolicy()");
            return initPolicy;
        }

        public final /* synthetic */ DslList getObservableAndroidActivities() {
            List observableAndroidActivitiesList = this._builder.getObservableAndroidActivitiesList();
            t.f(observableAndroidActivitiesList, "_builder.getObservableAndroidActivitiesList()");
            return new DslList(observableAndroidActivitiesList);
        }

        public final NativeConfigurationOuterClass.RequestPolicy getOperativeEventPolicy() {
            NativeConfigurationOuterClass.RequestPolicy operativeEventPolicy = this._builder.getOperativeEventPolicy();
            t.f(operativeEventPolicy, "_builder.getOperativeEventPolicy()");
            return operativeEventPolicy;
        }

        public final NativeConfigurationOuterClass.RequestPolicy getOtherPolicy() {
            NativeConfigurationOuterClass.RequestPolicy otherPolicy = this._builder.getOtherPolicy();
            t.f(otherPolicy, "_builder.getOtherPolicy()");
            return otherPolicy;
        }

        public final boolean hasAdOperations() {
            return this._builder.hasAdOperations();
        }

        public final boolean hasAdPolicy() {
            return this._builder.hasAdPolicy();
        }

        public final boolean hasCachedAssetsConfiguration() {
            return this._builder.hasCachedAssetsConfiguration();
        }

        public final boolean hasCachedWebviewFilesConfiguration() {
            return this._builder.hasCachedWebviewFilesConfiguration();
        }

        public final boolean hasDebugSettings() {
            return this._builder.hasDebugSettings();
        }

        public final boolean hasDiagnosticEvents() {
            return this._builder.hasDiagnosticEvents();
        }

        public final boolean hasDownloadPolicy() {
            return this._builder.hasDownloadPolicy();
        }

        public final boolean hasFeatureFlags() {
            return this._builder.hasFeatureFlags();
        }

        public final boolean hasInitPolicy() {
            return this._builder.hasInitPolicy();
        }

        public final boolean hasOperativeEventPolicy() {
            return this._builder.hasOperativeEventPolicy();
        }

        public final boolean hasOtherPolicy() {
            return this._builder.hasOtherPolicy();
        }

        public final /* synthetic */ void plusAssignAdditionalStorePackages(DslList dslList, String value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            addAdditionalStorePackages(dslList, value);
        }

        public final /* synthetic */ void plusAssignAllAdditionalStorePackages(DslList dslList, Iterable values) {
            t.g(dslList, "<this>");
            t.g(values, "values");
            addAllAdditionalStorePackages(dslList, values);
        }

        public final /* synthetic */ void plusAssignAllObservableAndroidActivities(DslList dslList, Iterable values) {
            t.g(dslList, "<this>");
            t.g(values, "values");
            addAllObservableAndroidActivities(dslList, values);
        }

        public final /* synthetic */ void plusAssignObservableAndroidActivities(DslList dslList, ByteString value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            addObservableAndroidActivities(dslList, value);
        }

        public final void setAdOperations(NativeConfigurationOuterClass.AdOperationsConfiguration value) {
            t.g(value, "value");
            this._builder.setAdOperations(value);
        }

        public final void setAdPolicy(NativeConfigurationOuterClass.RequestPolicy value) {
            t.g(value, "value");
            this._builder.setAdPolicy(value);
        }

        public final /* synthetic */ void setAdditionalStorePackages(DslList dslList, int i, String value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            this._builder.setAdditionalStorePackages(i, value);
        }

        public final void setCachedAssetsConfiguration(NativeConfigurationOuterClass.CachedAssetsConfiguration value) {
            t.g(value, "value");
            this._builder.setCachedAssetsConfiguration(value);
        }

        public final void setCachedWebviewFilesConfiguration(NativeConfigurationOuterClass.CachedAssetsConfiguration value) {
            t.g(value, "value");
            this._builder.setCachedWebviewFilesConfiguration(value);
        }

        public final void setDebugSettings(NativeConfigurationOuterClass.DebugSettings value) {
            t.g(value, "value");
            this._builder.setDebugSettings(value);
        }

        public final void setDefaultShowCompletionState(NativeConfigurationOuterClass.ShowCompletionState value) {
            t.g(value, "value");
            this._builder.setDefaultShowCompletionState(value);
        }

        public final void setDefaultShowCompletionStateValue(int i) {
            this._builder.setDefaultShowCompletionStateValue(i);
        }

        public final void setDiagnosticEvents(NativeConfigurationOuterClass.DiagnosticEventsConfiguration value) {
            t.g(value, "value");
            this._builder.setDiagnosticEvents(value);
        }

        public final void setDownloadPolicy(NativeConfigurationOuterClass.RequestPolicy value) {
            t.g(value, "value");
            this._builder.setDownloadPolicy(value);
        }

        public final void setEnableIapEvent(boolean z) {
            this._builder.setEnableIapEvent(z);
        }

        public final void setEnableOm(boolean z) {
            this._builder.setEnableOm(z);
        }

        public final void setFeatureFlags(NativeConfigurationOuterClass.FeatureFlags value) {
            t.g(value, "value");
            this._builder.setFeatureFlags(value);
        }

        public final void setInitPolicy(NativeConfigurationOuterClass.RequestPolicy value) {
            t.g(value, "value");
            this._builder.setInitPolicy(value);
        }

        public final /* synthetic */ void setObservableAndroidActivities(DslList dslList, int i, ByteString value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            this._builder.setObservableAndroidActivities(i, value);
        }

        public final void setOperativeEventPolicy(NativeConfigurationOuterClass.RequestPolicy value) {
            t.g(value, "value");
            this._builder.setOperativeEventPolicy(value);
        }

        public final void setOtherPolicy(NativeConfigurationOuterClass.RequestPolicy value) {
            t.g(value, "value");
            this._builder.setOtherPolicy(value);
        }

        private Dsl(NativeConfigurationOuterClass.NativeConfiguration.Builder builder) {
            this._builder = builder;
        }
    }

    private NativeConfigurationKt() {
    }
}
