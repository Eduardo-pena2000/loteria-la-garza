package com.revenuecat.purchases.ui.revenuecatui.customercenter.data;

import Da.v;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesState;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.navigation.CustomerCenterDestination;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.navigation.CustomerCenterNavigationState;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class CustomerCenterState {
    public static final int $stable = 0;
    private final NavigationButtonType navigationButtonType;

    public static final class Error extends CustomerCenterState {
        public static final int $stable = 0;
        private final PurchasesError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(PurchasesError error) {
            super(null, 1, null);
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

    public static final class Loading extends CustomerCenterState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null, 1, null);
        }
    }

    public enum NavigationButtonType {
        BACK,
        CLOSE
    }

    public static final class NotLoaded extends CustomerCenterState {
        public static final int $stable = 0;
        public static final NotLoaded INSTANCE = new NotLoaded();

        private NotLoaded() {
            super(null, 1, null);
        }
    }

    public /* synthetic */ CustomerCenterState(NavigationButtonType navigationButtonType, k kVar) {
        this(navigationButtonType);
    }

    public /* synthetic */ NavigationButtonType getNavigationButtonType() {
        return this.navigationButtonType;
    }

    private CustomerCenterState(NavigationButtonType navigationButtonType) {
        this.navigationButtonType = navigationButtonType;
    }

    public /* synthetic */ CustomerCenterState(NavigationButtonType navigationButtonType, int i, k kVar) {
        this((i & 1) != 0 ? NavigationButtonType.CLOSE : navigationButtonType, null);
    }

    public static final class Success extends CustomerCenterState {
        public static final int $stable = 8;
        private final CustomerCenterConfigData customerCenterConfigData;
        private final List detailScreenPaths;
        private final boolean isRefreshing;
        private final List mainScreenPaths;
        private final NavigationButtonType navigationButtonType;
        private final CustomerCenterNavigationState navigationState;
        private final Offering noActiveScreenOffering;
        private final List purchases;
        private final RestorePurchasesState restorePurchasesState;
        private final boolean showSupportTicketSuccessSnackbar;
        private final VirtualCurrencies virtualCurrencies;

        public /* synthetic */ Success(CustomerCenterConfigData customerCenterConfigData, List list, List list2, List list3, RestorePurchasesState restorePurchasesState, Offering offering, CustomerCenterNavigationState customerCenterNavigationState, NavigationButtonType navigationButtonType, VirtualCurrencies virtualCurrencies, boolean z, boolean z2, int i, k kVar) {
            CustomerCenterNavigationState customerCenterNavigationState2;
            List n = (i & 2) != 0 ? v.n() : list;
            List n2 = (i & 4) != 0 ? v.n() : list2;
            List n3 = (i & 8) != 0 ? v.n() : list3;
            RestorePurchasesState restorePurchasesState2 = (i & 16) != 0 ? null : restorePurchasesState;
            Offering offering2 = (i & 32) != 0 ? null : offering;
            if ((i & 64) != 0) {
                boolean z3 = !n.isEmpty();
                CustomerCenterConfigData.Screen managementScreen = customerCenterConfigData.getManagementScreen();
                customerCenterNavigationState2 = new CustomerCenterNavigationState(z3, managementScreen != null ? managementScreen.getTitle() : null, null, 4, null);
            } else {
                customerCenterNavigationState2 = customerCenterNavigationState;
            }
            this(customerCenterConfigData, n, n2, n3, restorePurchasesState2, offering2, customerCenterNavigationState2, (i & 128) != 0 ? NavigationButtonType.CLOSE : navigationButtonType, (i & 256) == 0 ? virtualCurrencies : null, (i & 512) != 0 ? false : z, (i & 1024) == 0 ? z2 : false);
        }

        public static /* synthetic */ Success copy$default(Success success, CustomerCenterConfigData customerCenterConfigData, List list, List list2, List list3, RestorePurchasesState restorePurchasesState, Offering offering, CustomerCenterNavigationState customerCenterNavigationState, NavigationButtonType navigationButtonType, VirtualCurrencies virtualCurrencies, boolean z, boolean z2, int i, Object obj) {
            return success.copy((i & 1) != 0 ? success.customerCenterConfigData : customerCenterConfigData, (i & 2) != 0 ? success.purchases : list, (i & 4) != 0 ? success.mainScreenPaths : list2, (i & 8) != 0 ? success.detailScreenPaths : list3, (i & 16) != 0 ? success.restorePurchasesState : restorePurchasesState, (i & 32) != 0 ? success.noActiveScreenOffering : offering, (i & 64) != 0 ? success.navigationState : customerCenterNavigationState, (i & 128) != 0 ? success.navigationButtonType : navigationButtonType, (i & 256) != 0 ? success.virtualCurrencies : virtualCurrencies, (i & 512) != 0 ? success.showSupportTicketSuccessSnackbar : z, (i & 1024) != 0 ? success.isRefreshing : z2);
        }

        public final CustomerCenterConfigData component1() {
            return this.customerCenterConfigData;
        }

        public final boolean component10() {
            return this.showSupportTicketSuccessSnackbar;
        }

        public final boolean component11() {
            return this.isRefreshing;
        }

        public final List component2() {
            return this.purchases;
        }

        public final List component3() {
            return this.mainScreenPaths;
        }

        public final List component4() {
            return this.detailScreenPaths;
        }

        public final RestorePurchasesState component5() {
            return this.restorePurchasesState;
        }

        public final Offering component6() {
            return this.noActiveScreenOffering;
        }

        public final CustomerCenterNavigationState component7() {
            return this.navigationState;
        }

        public final NavigationButtonType component8() {
            return this.navigationButtonType;
        }

        public final VirtualCurrencies component9() {
            return this.virtualCurrencies;
        }

        public final Success copy(CustomerCenterConfigData customerCenterConfigData, List purchases, List mainScreenPaths, List detailScreenPaths, RestorePurchasesState restorePurchasesState, Offering offering, CustomerCenterNavigationState navigationState, NavigationButtonType navigationButtonType, VirtualCurrencies virtualCurrencies, boolean z, boolean z2) {
            t.g(customerCenterConfigData, "customerCenterConfigData");
            t.g(purchases, "purchases");
            t.g(mainScreenPaths, "mainScreenPaths");
            t.g(detailScreenPaths, "detailScreenPaths");
            t.g(navigationState, "navigationState");
            t.g(navigationButtonType, "navigationButtonType");
            return new Success(customerCenterConfigData, purchases, mainScreenPaths, detailScreenPaths, restorePurchasesState, offering, navigationState, navigationButtonType, virtualCurrencies, z, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return t.c(this.customerCenterConfigData, success.customerCenterConfigData) && t.c(this.purchases, success.purchases) && t.c(this.mainScreenPaths, success.mainScreenPaths) && t.c(this.detailScreenPaths, success.detailScreenPaths) && this.restorePurchasesState == success.restorePurchasesState && t.c(this.noActiveScreenOffering, success.noActiveScreenOffering) && t.c(this.navigationState, success.navigationState) && this.navigationButtonType == success.navigationButtonType && t.c(this.virtualCurrencies, success.virtualCurrencies) && this.showSupportTicketSuccessSnackbar == success.showSupportTicketSuccessSnackbar && this.isRefreshing == success.isRefreshing;
        }

        public final CustomerCenterDestination getCurrentDestination() {
            return this.navigationState.getCurrentDestination();
        }

        public final /* synthetic */ CustomerCenterConfigData getCustomerCenterConfigData() {
            return this.customerCenterConfigData;
        }

        public final /* synthetic */ List getDetailScreenPaths() {
            return this.detailScreenPaths;
        }

        public final /* synthetic */ List getMainScreenPaths() {
            return this.mainScreenPaths;
        }

        public /* synthetic */ NavigationButtonType getNavigationButtonType() {
            return this.navigationButtonType;
        }

        public final /* synthetic */ CustomerCenterNavigationState getNavigationState() {
            return this.navigationState;
        }

        public final /* synthetic */ Offering getNoActiveScreenOffering() {
            return this.noActiveScreenOffering;
        }

        public final /* synthetic */ List getPurchases() {
            return this.purchases;
        }

        public final /* synthetic */ RestorePurchasesState getRestorePurchasesState() {
            return this.restorePurchasesState;
        }

        public final /* synthetic */ boolean getShowSupportTicketSuccessSnackbar() {
            return this.showSupportTicketSuccessSnackbar;
        }

        public final /* synthetic */ VirtualCurrencies getVirtualCurrencies() {
            return this.virtualCurrencies;
        }

        public int hashCode() {
            int hashCode = ((((((this.customerCenterConfigData.hashCode() * 31) + this.purchases.hashCode()) * 31) + this.mainScreenPaths.hashCode()) * 31) + this.detailScreenPaths.hashCode()) * 31;
            RestorePurchasesState restorePurchasesState = this.restorePurchasesState;
            int hashCode2 = (hashCode + (restorePurchasesState == null ? 0 : restorePurchasesState.hashCode())) * 31;
            Offering offering = this.noActiveScreenOffering;
            int hashCode3 = (((((hashCode2 + (offering == null ? 0 : offering.hashCode())) * 31) + this.navigationState.hashCode()) * 31) + this.navigationButtonType.hashCode()) * 31;
            VirtualCurrencies virtualCurrencies = this.virtualCurrencies;
            return ((((hashCode3 + (virtualCurrencies != null ? virtualCurrencies.hashCode() : 0)) * 31) + Boolean.hashCode(this.showSupportTicketSuccessSnackbar)) * 31) + Boolean.hashCode(this.isRefreshing);
        }

        public final /* synthetic */ boolean isRefreshing() {
            return this.isRefreshing;
        }

        public String toString() {
            return "Success(customerCenterConfigData=" + this.customerCenterConfigData + ", purchases=" + this.purchases + ", mainScreenPaths=" + this.mainScreenPaths + ", detailScreenPaths=" + this.detailScreenPaths + ", restorePurchasesState=" + this.restorePurchasesState + ", noActiveScreenOffering=" + this.noActiveScreenOffering + ", navigationState=" + this.navigationState + ", navigationButtonType=" + this.navigationButtonType + ", virtualCurrencies=" + this.virtualCurrencies + ", showSupportTicketSuccessSnackbar=" + this.showSupportTicketSuccessSnackbar + ", isRefreshing=" + this.isRefreshing + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(CustomerCenterConfigData customerCenterConfigData, List purchases, List mainScreenPaths, List detailScreenPaths, RestorePurchasesState restorePurchasesState, Offering offering, CustomerCenterNavigationState navigationState, NavigationButtonType navigationButtonType, VirtualCurrencies virtualCurrencies, boolean z, boolean z2) {
            super(navigationButtonType, null);
            t.g(customerCenterConfigData, "customerCenterConfigData");
            t.g(purchases, "purchases");
            t.g(mainScreenPaths, "mainScreenPaths");
            t.g(detailScreenPaths, "detailScreenPaths");
            t.g(navigationState, "navigationState");
            t.g(navigationButtonType, "navigationButtonType");
            this.customerCenterConfigData = customerCenterConfigData;
            this.purchases = purchases;
            this.mainScreenPaths = mainScreenPaths;
            this.detailScreenPaths = detailScreenPaths;
            this.restorePurchasesState = restorePurchasesState;
            this.noActiveScreenOffering = offering;
            this.navigationState = navigationState;
            this.navigationButtonType = navigationButtonType;
            this.virtualCurrencies = virtualCurrencies;
            this.showSupportTicketSuccessSnackbar = z;
            this.isRefreshing = z2;
        }
    }
}
