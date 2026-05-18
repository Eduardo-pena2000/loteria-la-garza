package com.revenuecat.purchases.data;

import com.revenuecat.purchases.CustomerInfo;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class LogInResult {
    private final boolean created;
    private final CustomerInfo customerInfo;

    public LogInResult(CustomerInfo customerInfo, boolean z) {
        t.g(customerInfo, "customerInfo");
        this.customerInfo = customerInfo;
        this.created = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogInResult)) {
            return false;
        }
        LogInResult logInResult = (LogInResult) obj;
        return t.c(this.customerInfo, logInResult.customerInfo) && this.created == logInResult.created;
    }

    public final boolean getCreated() {
        return this.created;
    }

    public final CustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    public int hashCode() {
        return (this.customerInfo.hashCode() * 31) + Boolean.hashCode(this.created);
    }

    public String toString() {
        return "LogInResult(customerInfo=" + this.customerInfo + ", created=" + this.created + ')';
    }
}
