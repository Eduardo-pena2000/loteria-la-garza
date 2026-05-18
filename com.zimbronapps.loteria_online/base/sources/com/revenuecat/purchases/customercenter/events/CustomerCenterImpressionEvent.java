package com.revenuecat.purchases.customercenter.events;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.common.events.FeatureEvent;
import java.util.Date;
import java.util.UUID;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomerCenterImpressionEvent implements FeatureEvent {
    private final CreationData creationData;
    private final Data data;

    public static final class CreationData {
        private final Date date;
        private final UUID id;

        public CreationData() {
            this(null, null, 3, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreationData)) {
                return false;
            }
            CreationData creationData = (CreationData) obj;
            return t.c(this.id, creationData.id) && t.c(this.date, creationData.date);
        }

        public final Date getDate() {
            return this.date;
        }

        public final UUID getId() {
            return this.id;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.date.hashCode();
        }

        public String toString() {
            return "CreationData(id=" + this.id + ", date=" + this.date + ')';
        }

        public CreationData(UUID uuid, Date date) {
            t.g(uuid, "id");
            t.g(date, "date");
            this.id = uuid;
            this.date = date;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ CreationData(UUID uuid, Date date, int i, k kVar) {
            if ((i & 1) != 0) {
                uuid = UUID.randomUUID();
                t.f(uuid, "randomUUID()");
            }
            this(uuid, (i & 2) != 0 ? new Date() : date);
        }
    }

    public CustomerCenterImpressionEvent(CreationData creationData, Data data) {
        t.g(creationData, "creationData");
        t.g(data, "data");
        this.creationData = creationData;
        this.data = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerCenterImpressionEvent)) {
            return false;
        }
        CustomerCenterImpressionEvent customerCenterImpressionEvent = (CustomerCenterImpressionEvent) obj;
        return t.c(this.creationData, customerCenterImpressionEvent.creationData) && t.c(this.data, customerCenterImpressionEvent.data);
    }

    public final CreationData getCreationData() {
        return this.creationData;
    }

    public final Data getData() {
        return this.data;
    }

    public int hashCode() {
        return (this.creationData.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        return "CustomerCenterImpressionEvent(creationData=" + this.creationData + ", data=" + this.data + ')';
    }

    public /* synthetic */ CustomerCenterImpressionEvent(CreationData creationData, Data data, int i, k kVar) {
        this((i & 1) != 0 ? new CreationData(null, null, 3, null) : creationData, data);
    }

    public static final class Data {
        private final boolean darkMode;
        private final CustomerCenterDisplayMode displayMode;
        private final String locale;
        private final int revisionID;
        private final Date timestamp;
        private final CustomerCenterEventType type;
        private final int version;

        public Data(Date date, boolean z, String str, int i, int i2, CustomerCenterDisplayMode customerCenterDisplayMode) {
            t.g(date, "timestamp");
            t.g(str, "locale");
            t.g(customerCenterDisplayMode, "displayMode");
            this.timestamp = date;
            this.darkMode = z;
            this.locale = str;
            this.version = i;
            this.revisionID = i2;
            this.displayMode = customerCenterDisplayMode;
            this.type = CustomerCenterEventType.IMPRESSION;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return t.c(this.timestamp, data.timestamp) && this.darkMode == data.darkMode && t.c(this.locale, data.locale) && this.version == data.version && this.revisionID == data.revisionID && this.displayMode == data.displayMode;
        }

        public final boolean getDarkMode() {
            return this.darkMode;
        }

        public final CustomerCenterDisplayMode getDisplayMode() {
            return this.displayMode;
        }

        public final String getLocale() {
            return this.locale;
        }

        public final int getRevisionID() {
            return this.revisionID;
        }

        public final Date getTimestamp() {
            return this.timestamp;
        }

        public final CustomerCenterEventType getType() {
            return this.type;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            return (((((((((this.timestamp.hashCode() * 31) + Boolean.hashCode(this.darkMode)) * 31) + this.locale.hashCode()) * 31) + this.version) * 31) + this.revisionID) * 31) + this.displayMode.hashCode();
        }

        public String toString() {
            return "Data(timestamp=" + this.timestamp + ", darkMode=" + this.darkMode + ", locale=" + this.locale + ", version=" + this.version + ", revisionID=" + this.revisionID + ", displayMode=" + this.displayMode + ')';
        }

        public /* synthetic */ Data(Date date, boolean z, String str, int i, int i2, CustomerCenterDisplayMode customerCenterDisplayMode, int i3, k kVar) {
            this(date, z, str, (i3 & 8) != 0 ? 1 : i, (i3 & 16) != 0 ? 1 : i2, (i3 & 32) != 0 ? CustomerCenterDisplayMode.FULL_SCREEN : customerCenterDisplayMode);
        }
    }
}
