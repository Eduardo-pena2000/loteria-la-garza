package com.revenuecat.purchases.paywalls.events;

import com.revenuecat.purchases.common.events.FeatureEvent;
import java.util.Date;
import java.util.UUID;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class CustomPaywallEvent implements FeatureEvent {
    public /* synthetic */ CustomPaywallEvent(k kVar) {
        this();
    }

    public boolean isPriorityEvent() {
        return true;
    }

    public static final class Impression extends CustomPaywallEvent {
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

        public /* synthetic */ Impression(CreationData creationData, Data data, int i, k kVar) {
            this((i & 1) != 0 ? new CreationData(null, null, 3, null) : creationData, data);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impression)) {
                return false;
            }
            Impression impression = (Impression) obj;
            return t.c(this.creationData, impression.creationData) && t.c(this.data, impression.data);
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
            return "Impression(creationData=" + this.creationData + ", data=" + this.data + ')';
        }

        public static final class Data {
            private final String offeringId;
            private final String paywallId;

            public Data(String str, String str2) {
                this.paywallId = str;
                this.offeringId = str2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Data)) {
                    return false;
                }
                Data data = (Data) obj;
                return t.c(this.paywallId, data.paywallId) && t.c(this.offeringId, data.offeringId);
            }

            public final String getOfferingId() {
                return this.offeringId;
            }

            public final String getPaywallId() {
                return this.paywallId;
            }

            public int hashCode() {
                String str = this.paywallId;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.offeringId;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "Data(paywallId=" + this.paywallId + ", offeringId=" + this.offeringId + ')';
            }

            public /* synthetic */ Data(String str, String str2, int i, k kVar) {
                this(str, (i & 2) != 0 ? null : str2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Impression(CreationData creationData, Data data) {
            super(null);
            t.g(creationData, "creationData");
            t.g(data, "data");
            this.creationData = creationData;
            this.data = data;
        }
    }

    private CustomPaywallEvent() {
    }
}
