package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TransactionEventRequestKt {
    public static final TransactionEventRequestKt INSTANCE = new TransactionEventRequestKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final TransactionEventRequestOuterClass.TransactionEventRequest.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public static final class TransactionDataProxy extends DslProxy {
            private TransactionDataProxy() {
            }
        }

        public /* synthetic */ Dsl(TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ TransactionEventRequestOuterClass.TransactionEventRequest _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (TransactionEventRequestOuterClass.TransactionEventRequest) build;
        }

        public final /* synthetic */ void addAllTransactionData(DslList dslList, Iterable values) {
            t.g(dslList, "<this>");
            t.g(values, "values");
            this._builder.addAllTransactionData(values);
        }

        public final /* synthetic */ void addTransactionData(DslList dslList, TransactionEventRequestOuterClass.TransactionData value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            this._builder.addTransactionData(value);
        }

        public final void clearAppStore() {
            this._builder.clearAppStore();
        }

        public final void clearCustomStore() {
            this._builder.clearCustomStore();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final void clearGooglePlayBillingLibraryVersion() {
            this._builder.clearGooglePlayBillingLibraryVersion();
        }

        public final void clearOrigin() {
            this._builder.clearOrigin();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final void clearStoreKitVersion() {
            this._builder.clearStoreKitVersion();
        }

        public final /* synthetic */ void clearTransactionData(DslList dslList) {
            t.g(dslList, "<this>");
            this._builder.clearTransactionData();
        }

        public final TransactionEventRequestOuterClass.StoreType getAppStore() {
            TransactionEventRequestOuterClass.StoreType appStore = this._builder.getAppStore();
            t.f(appStore, "_builder.getAppStore()");
            return appStore;
        }

        public final int getAppStoreValue() {
            return this._builder.getAppStoreValue();
        }

        public final String getCustomStore() {
            String customStore = this._builder.getCustomStore();
            t.f(customStore, "_builder.getCustomStore()");
            return customStore;
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            t.f(dynamicDeviceInfo, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfo;
        }

        public final String getGooglePlayBillingLibraryVersion() {
            String googlePlayBillingLibraryVersion = this._builder.getGooglePlayBillingLibraryVersion();
            t.f(googlePlayBillingLibraryVersion, "_builder.getGooglePlayBillingLibraryVersion()");
            return googlePlayBillingLibraryVersion;
        }

        public final TransactionEventRequestOuterClass.TransactionOrigin getOrigin() {
            TransactionEventRequestOuterClass.TransactionOrigin origin = this._builder.getOrigin();
            t.f(origin, "_builder.getOrigin()");
            return origin;
        }

        public final int getOriginValue() {
            return this._builder.getOriginValue();
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            t.f(staticDeviceInfo, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfo;
        }

        public final TransactionEventRequestOuterClass.StoreKitVersion getStoreKitVersion() {
            TransactionEventRequestOuterClass.StoreKitVersion storeKitVersion = this._builder.getStoreKitVersion();
            t.f(storeKitVersion, "_builder.getStoreKitVersion()");
            return storeKitVersion;
        }

        public final int getStoreKitVersionValue() {
            return this._builder.getStoreKitVersionValue();
        }

        public final /* synthetic */ DslList getTransactionData() {
            List transactionDataList = this._builder.getTransactionDataList();
            t.f(transactionDataList, "_builder.getTransactionDataList()");
            return new DslList(transactionDataList);
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final /* synthetic */ void plusAssignAllTransactionData(DslList dslList, Iterable values) {
            t.g(dslList, "<this>");
            t.g(values, "values");
            addAllTransactionData(dslList, values);
        }

        public final /* synthetic */ void plusAssignTransactionData(DslList dslList, TransactionEventRequestOuterClass.TransactionData value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            addTransactionData(dslList, value);
        }

        public final void setAppStore(TransactionEventRequestOuterClass.StoreType value) {
            t.g(value, "value");
            this._builder.setAppStore(value);
        }

        public final void setAppStoreValue(int i) {
            this._builder.setAppStoreValue(i);
        }

        public final void setCustomStore(String value) {
            t.g(value, "value");
            this._builder.setCustomStore(value);
        }

        public final void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo value) {
            t.g(value, "value");
            this._builder.setDynamicDeviceInfo(value);
        }

        public final void setGooglePlayBillingLibraryVersion(String value) {
            t.g(value, "value");
            this._builder.setGooglePlayBillingLibraryVersion(value);
        }

        public final void setOrigin(TransactionEventRequestOuterClass.TransactionOrigin value) {
            t.g(value, "value");
            this._builder.setOrigin(value);
        }

        public final void setOriginValue(int i) {
            this._builder.setOriginValue(i);
        }

        public final void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo value) {
            t.g(value, "value");
            this._builder.setStaticDeviceInfo(value);
        }

        public final void setStoreKitVersion(TransactionEventRequestOuterClass.StoreKitVersion value) {
            t.g(value, "value");
            this._builder.setStoreKitVersion(value);
        }

        public final void setStoreKitVersionValue(int i) {
            this._builder.setStoreKitVersionValue(i);
        }

        public final /* synthetic */ void setTransactionData(DslList dslList, int i, TransactionEventRequestOuterClass.TransactionData value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            this._builder.setTransactionData(i, value);
        }

        private Dsl(TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private TransactionEventRequestKt() {
    }
}
