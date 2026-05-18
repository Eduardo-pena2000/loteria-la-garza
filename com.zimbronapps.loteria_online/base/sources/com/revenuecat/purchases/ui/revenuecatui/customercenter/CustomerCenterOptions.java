package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import com.revenuecat.purchases.customercenter.CustomerCenterListener;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CustomerCenterOptions {
    public static final int $stable = 8;
    private final CustomerCenterListener listener;

    public static final class Builder {
        public static final int $stable = 8;
        private CustomerCenterListener listener;

        public final CustomerCenterOptions build() {
            return new CustomerCenterOptions(this);
        }

        public final CustomerCenterListener getListener$revenuecatui_defaultsBc8Release() {
            return this.listener;
        }

        public final Builder setListener(CustomerCenterListener customerCenterListener) {
            this.listener = customerCenterListener;
            return this;
        }

        public final void setListener$revenuecatui_defaultsBc8Release(CustomerCenterListener customerCenterListener) {
            this.listener = customerCenterListener;
        }
    }

    public CustomerCenterOptions(CustomerCenterListener customerCenterListener) {
        this.listener = customerCenterListener;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.c(CustomerCenterOptions.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.e(obj, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterOptions");
        return t.c(this.listener, ((CustomerCenterOptions) obj).listener);
    }

    public final CustomerCenterListener getListener$revenuecatui_defaultsBc8Release() {
        return this.listener;
    }

    public int hashCode() {
        CustomerCenterListener customerCenterListener = this.listener;
        if (customerCenterListener != null) {
            return customerCenterListener.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "CustomerCenterOptions(listener=" + this.listener + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomerCenterOptions(Builder builder) {
        this(builder.getListener$revenuecatui_defaultsBc8Release());
        t.g(builder, "builder");
    }
}
