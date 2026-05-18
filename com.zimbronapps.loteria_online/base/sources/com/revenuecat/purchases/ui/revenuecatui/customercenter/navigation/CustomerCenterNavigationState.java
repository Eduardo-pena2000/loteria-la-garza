package com.revenuecat.purchases.ui.revenuecatui.customercenter.navigation;

import Da.D;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.navigation.CustomerCenterDestination;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CustomerCenterNavigationState {
    public static final int $stable = 0;
    private final Deque backStack;
    private final String managementScreenTitle;
    private final boolean showingActivePurchasesScreen;

    public CustomerCenterNavigationState(boolean z, String str, Deque backStack) {
        t.g(backStack, "backStack");
        this.showingActivePurchasesScreen = z;
        this.managementScreenTitle = str;
        this.backStack = backStack;
    }

    private final boolean component1() {
        return this.showingActivePurchasesScreen;
    }

    private final String component2() {
        return this.managementScreenTitle;
    }

    public static /* synthetic */ CustomerCenterNavigationState copy$default(CustomerCenterNavigationState customerCenterNavigationState, boolean z, String str, Deque deque, int i, Object obj) {
        if ((i & 1) != 0) {
            z = customerCenterNavigationState.showingActivePurchasesScreen;
        }
        if ((i & 2) != 0) {
            str = customerCenterNavigationState.managementScreenTitle;
        }
        if ((i & 4) != 0) {
            deque = customerCenterNavigationState.backStack;
        }
        return customerCenterNavigationState.copy(z, str, deque);
    }

    public final Deque component3() {
        return this.backStack;
    }

    public final CustomerCenterNavigationState copy(boolean z, String str, Deque backStack) {
        t.g(backStack, "backStack");
        return new CustomerCenterNavigationState(z, str, backStack);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerCenterNavigationState)) {
            return false;
        }
        CustomerCenterNavigationState customerCenterNavigationState = (CustomerCenterNavigationState) obj;
        return this.showingActivePurchasesScreen == customerCenterNavigationState.showingActivePurchasesScreen && t.c(this.managementScreenTitle, customerCenterNavigationState.managementScreenTitle) && t.c(this.backStack, customerCenterNavigationState.backStack);
    }

    public final Deque getBackStack() {
        return this.backStack;
    }

    public final boolean getCanNavigateBack() {
        return this.backStack.size() > 1;
    }

    public final CustomerCenterDestination getCurrentDestination() {
        CustomerCenterDestination customerCenterDestination = (CustomerCenterDestination) this.backStack.peek();
        return customerCenterDestination == null ? new CustomerCenterDestination.Main(this.showingActivePurchasesScreen, this.managementScreenTitle) : customerCenterDestination;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.showingActivePurchasesScreen) * 31;
        String str = this.managementScreenTitle;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.backStack.hashCode();
    }

    public final boolean isBackwardTransition(CustomerCenterDestination from, CustomerCenterDestination to) {
        t.g(from, "from");
        t.g(to, "to");
        if ((to instanceof CustomerCenterDestination.Main) && !(from instanceof CustomerCenterDestination.Main)) {
            return true;
        }
        List L0 = D.L0(this.backStack);
        int indexOf = L0.indexOf(from);
        int indexOf2 = L0.indexOf(to);
        if (indexOf2 == -1 || indexOf == -1) {
            Logger.INSTANCE.e("One of the destinations (" + from + " [" + indexOf + "], " + to + " [" + indexOf2 + "]) is not in the back stack. Assuming forward transition.");
        } else if (indexOf2 > indexOf) {
            return true;
        }
        return false;
    }

    public final CustomerCenterNavigationState pop() {
        if (!getCanNavigateBack()) {
            return this;
        }
        ArrayDeque arrayDeque = new ArrayDeque(this.backStack);
        arrayDeque.pop();
        return copy$default(this, false, null, arrayDeque, 3, null);
    }

    public final CustomerCenterNavigationState popToMain() {
        ArrayDeque arrayDeque = new ArrayDeque(this.backStack);
        while (!arrayDeque.isEmpty() && !(arrayDeque.peek() instanceof CustomerCenterDestination.Main)) {
            arrayDeque.pop();
        }
        if (!arrayDeque.isEmpty()) {
            return copy$default(this, false, null, arrayDeque, 3, null);
        }
        Logger.INSTANCE.e("Could not find Main destination in the back stack. Returning unchanged state.");
        return this;
    }

    public final CustomerCenterNavigationState push(CustomerCenterDestination destination) {
        t.g(destination, "destination");
        ArrayDeque arrayDeque = new ArrayDeque(this.backStack);
        arrayDeque.push(destination);
        return copy$default(this, false, null, arrayDeque, 3, null);
    }

    public String toString() {
        return "CustomerCenterNavigationState(showingActivePurchasesScreen=" + this.showingActivePurchasesScreen + ", managementScreenTitle=" + this.managementScreenTitle + ", backStack=" + this.backStack + ')';
    }

    public /* synthetic */ CustomerCenterNavigationState(boolean z, String str, Deque deque, int i, k kVar) {
        if ((i & 4) != 0) {
            deque = new ArrayDeque();
            deque.push(new CustomerCenterDestination.Main(z, str));
        }
        this(z, str, deque);
    }
}
