package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import com.revenuecat.purchases.PurchasesError;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface VirtualCurrencyBalancesScreenViewState {

    public static final class Error implements VirtualCurrencyBalancesScreenViewState {
        public static final int $stable = 0;
        private final PurchasesError error;

        public Error(PurchasesError error) {
            t.g(error, "error");
            this.error = error;
        }

        public static /* synthetic */ Error copy$default(Error error, PurchasesError purchasesError, int i, Object obj) {
            if ((i & 1) != 0) {
                purchasesError = error.error;
            }
            return error.copy(purchasesError);
        }

        public final PurchasesError component1() {
            return this.error;
        }

        public final Error copy(PurchasesError error) {
            t.g(error, "error");
            return new Error(error);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && t.c(this.error, ((Error) obj).error);
        }

        public final PurchasesError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ')';
        }
    }

    public static final class Loaded implements VirtualCurrencyBalancesScreenViewState {
        public static final int $stable = 8;
        private final List virtualCurrencyBalanceData;

        public Loaded(List virtualCurrencyBalanceData) {
            t.g(virtualCurrencyBalanceData, "virtualCurrencyBalanceData");
            this.virtualCurrencyBalanceData = virtualCurrencyBalanceData;
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = loaded.virtualCurrencyBalanceData;
            }
            return loaded.copy(list);
        }

        public final List component1() {
            return this.virtualCurrencyBalanceData;
        }

        public final Loaded copy(List virtualCurrencyBalanceData) {
            t.g(virtualCurrencyBalanceData, "virtualCurrencyBalanceData");
            return new Loaded(virtualCurrencyBalanceData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && t.c(this.virtualCurrencyBalanceData, ((Loaded) obj).virtualCurrencyBalanceData);
        }

        public final List getVirtualCurrencyBalanceData() {
            return this.virtualCurrencyBalanceData;
        }

        public int hashCode() {
            return this.virtualCurrencyBalanceData.hashCode();
        }

        public String toString() {
            return "Loaded(virtualCurrencyBalanceData=" + this.virtualCurrencyBalanceData + ')';
        }
    }

    public static final class Loading implements VirtualCurrencyBalancesScreenViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }
}
