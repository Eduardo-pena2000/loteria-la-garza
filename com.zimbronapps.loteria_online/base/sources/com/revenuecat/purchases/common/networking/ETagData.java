package com.revenuecat.purchases.common.networking;

import java.util.Date;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ETagData {
    private final String eTag;
    private final Date lastRefreshTime;

    public ETagData(String str, Date date) {
        t.g(str, "eTag");
        this.eTag = str;
        this.lastRefreshTime = date;
    }

    public static /* synthetic */ ETagData copy$default(ETagData eTagData, String str, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eTagData.eTag;
        }
        if ((i & 2) != 0) {
            date = eTagData.lastRefreshTime;
        }
        return eTagData.copy(str, date);
    }

    public final String component1() {
        return this.eTag;
    }

    public final Date component2() {
        return this.lastRefreshTime;
    }

    public final ETagData copy(String str, Date date) {
        t.g(str, "eTag");
        return new ETagData(str, date);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ETagData)) {
            return false;
        }
        ETagData eTagData = (ETagData) obj;
        return t.c(this.eTag, eTagData.eTag) && t.c(this.lastRefreshTime, eTagData.lastRefreshTime);
    }

    public final String getETag() {
        return this.eTag;
    }

    public final Date getLastRefreshTime() {
        return this.lastRefreshTime;
    }

    public int hashCode() {
        int hashCode = this.eTag.hashCode() * 31;
        Date date = this.lastRefreshTime;
        return hashCode + (date == null ? 0 : date.hashCode());
    }

    public String toString() {
        return "ETagData(eTag=" + this.eTag + ", lastRefreshTime=" + this.lastRefreshTime + ')';
    }
}
