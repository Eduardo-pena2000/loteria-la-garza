package com.revenuecat.purchases.utils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DateActive {
    private final boolean inGracePeriod;
    private final boolean isActive;

    public DateActive(boolean z, boolean z2) {
        this.isActive = z;
        this.inGracePeriod = z2;
    }

    public static /* synthetic */ DateActive copy$default(DateActive dateActive, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dateActive.isActive;
        }
        if ((i & 2) != 0) {
            z2 = dateActive.inGracePeriod;
        }
        return dateActive.copy(z, z2);
    }

    public final boolean component1() {
        return this.isActive;
    }

    public final boolean component2() {
        return this.inGracePeriod;
    }

    public final DateActive copy(boolean z, boolean z2) {
        return new DateActive(z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateActive)) {
            return false;
        }
        DateActive dateActive = (DateActive) obj;
        return this.isActive == dateActive.isActive && this.inGracePeriod == dateActive.inGracePeriod;
    }

    public final boolean getInGracePeriod() {
        return this.inGracePeriod;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isActive) * 31) + Boolean.hashCode(this.inGracePeriod);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public String toString() {
        return "DateActive(isActive=" + this.isActive + ", inGracePeriod=" + this.inGracePeriod + ')';
    }
}
