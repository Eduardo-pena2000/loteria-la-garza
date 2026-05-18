package com.revenuecat.purchases.paywalls.events;

import Ca.e;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.common.events.FeatureEvent;
import com.revenuecat.purchases.utils.serializers.DateSerializer;
import com.revenuecat.purchases.utils.serializers.UUIDSerializer;
import java.util.Date;
import java.util.UUID;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.f0;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallEvent implements FeatureEvent {
    private final CreationData creationData;
    private final Data data;
    private final PaywallEventType type;
    public static final Companion Companion = new Companion(null);
    private static final b[] $childSerializers = {null, null, PaywallEventType.Companion.serializer()};

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return PaywallEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static final class CreationData {
        public static final Companion Companion = new Companion(null);
        private final Date date;
        private final UUID id;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return PaywallEvent$CreationData$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @e
        public /* synthetic */ CreationData(int i, UUID uuid, Date date, t0 t0Var) {
            if (3 != (i & 3)) {
                f0.a(i, 3, PaywallEvent$CreationData$$serializer.INSTANCE.getDescriptor());
            }
            this.id = uuid;
            this.date = date;
        }

        public static /* synthetic */ CreationData copy$default(CreationData creationData, UUID uuid, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = creationData.id;
            }
            if ((i & 2) != 0) {
                date = creationData.date;
            }
            return creationData.copy(uuid, date);
        }

        public static /* synthetic */ void getDate$annotations() {
        }

        public static /* synthetic */ void getId$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(CreationData creationData, d dVar, qb.e eVar) {
            dVar.k(eVar, 0, UUIDSerializer.INSTANCE, creationData.id);
            dVar.k(eVar, 1, DateSerializer.INSTANCE, creationData.date);
        }

        public final UUID component1() {
            return this.id;
        }

        public final Date component2() {
            return this.date;
        }

        public final CreationData copy(UUID uuid, Date date) {
            t.g(uuid, "id");
            t.g(date, "date");
            return new CreationData(uuid, date);
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
    }

    @e
    public /* synthetic */ PaywallEvent(int i, CreationData creationData, Data data, PaywallEventType paywallEventType, t0 t0Var) {
        if (7 != (i & 7)) {
            f0.a(i, 7, PaywallEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.creationData = creationData;
        this.data = data;
        this.type = paywallEventType;
    }

    public static final /* synthetic */ b[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ PaywallEvent copy$default(PaywallEvent paywallEvent, CreationData creationData, Data data, PaywallEventType paywallEventType, int i, Object obj) {
        if ((i & 1) != 0) {
            creationData = paywallEvent.creationData;
        }
        if ((i & 2) != 0) {
            data = paywallEvent.data;
        }
        if ((i & 4) != 0) {
            paywallEventType = paywallEvent.type;
        }
        return paywallEvent.copy(creationData, data, paywallEventType);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PaywallEvent paywallEvent, d dVar, qb.e eVar) {
        ob.k[] kVarArr = $childSerializers;
        dVar.k(eVar, 0, PaywallEvent$CreationData$$serializer.INSTANCE, paywallEvent.creationData);
        dVar.k(eVar, 1, PaywallEventDataSerializer.INSTANCE, paywallEvent.data);
        dVar.k(eVar, 2, kVarArr[2], paywallEvent.type);
    }

    public final CreationData component1() {
        return this.creationData;
    }

    public final Data component2() {
        return this.data;
    }

    public final PaywallEventType component3() {
        return this.type;
    }

    public final PaywallEvent copy(CreationData creationData, Data data, PaywallEventType paywallEventType) {
        t.g(creationData, "creationData");
        t.g(data, "data");
        t.g(paywallEventType, "type");
        return new PaywallEvent(creationData, data, paywallEventType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallEvent)) {
            return false;
        }
        PaywallEvent paywallEvent = (PaywallEvent) obj;
        return t.c(this.creationData, paywallEvent.creationData) && t.c(this.data, paywallEvent.data) && this.type == paywallEvent.type;
    }

    public final CreationData getCreationData() {
        return this.creationData;
    }

    public final Data getData() {
        return this.data;
    }

    public final PaywallEventType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.creationData.hashCode() * 31) + this.data.hashCode()) * 31) + this.type.hashCode();
    }

    public boolean isPriorityEvent() {
        return this.type == PaywallEventType.IMPRESSION;
    }

    public final PaywallPostReceiptData toPaywallPostReceiptData$purchases_defaultsBc8Release() {
        String paywallIdentifier = this.data.getPaywallIdentifier();
        String uuid = this.data.getSessionIdentifier().toString();
        t.f(uuid, "data.sessionIdentifier.toString()");
        return new PaywallPostReceiptData(paywallIdentifier, uuid, this.data.getPaywallRevision(), this.data.getDisplayMode(), this.data.getDarkMode(), this.data.getLocaleIdentifier(), this.data.getPresentedOfferingContext().getOfferingIdentifier());
    }

    public String toString() {
        return "PaywallEvent(creationData=" + this.creationData + ", data=" + this.data + ", type=" + this.type + ')';
    }

    public PaywallEvent(CreationData creationData, Data data, PaywallEventType paywallEventType) {
        t.g(creationData, "creationData");
        t.g(data, "data");
        t.g(paywallEventType, "type");
        this.creationData = creationData;
        this.data = data;
        this.type = paywallEventType;
    }

    public static final class Data {
        public static final Companion Companion = new Companion(null);
        private final boolean darkMode;
        private final String displayMode;
        private final Integer errorCode;
        private final String errorMessage;
        private final ExitOfferType exitOfferType;
        private final String exitOfferingIdentifier;
        private final String localeIdentifier;
        private final String packageIdentifier;
        private final String paywallIdentifier;
        private final int paywallRevision;
        private final PresentedOfferingContext presentedOfferingContext;
        private final String productIdentifier;
        private final UUID sessionIdentifier;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return PaywallEventDataSerializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Data(String str, PresentedOfferingContext presentedOfferingContext, int i, UUID uuid, String str2, String str3, boolean z, ExitOfferType exitOfferType, String str4, String str5, String str6, Integer num, String str7) {
            t.g(presentedOfferingContext, "presentedOfferingContext");
            t.g(uuid, "sessionIdentifier");
            t.g(str2, "displayMode");
            t.g(str3, "localeIdentifier");
            this.paywallIdentifier = str;
            this.presentedOfferingContext = presentedOfferingContext;
            this.paywallRevision = i;
            this.sessionIdentifier = uuid;
            this.displayMode = str2;
            this.localeIdentifier = str3;
            this.darkMode = z;
            this.exitOfferType = exitOfferType;
            this.exitOfferingIdentifier = str4;
            this.packageIdentifier = str5;
            this.productIdentifier = str6;
            this.errorCode = num;
            this.errorMessage = str7;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, PresentedOfferingContext presentedOfferingContext, int i, UUID uuid, String str2, String str3, boolean z, ExitOfferType exitOfferType, String str4, String str5, String str6, Integer num, String str7, int i2, Object obj) {
            return data.copy((i2 & 1) != 0 ? data.paywallIdentifier : str, (i2 & 2) != 0 ? data.presentedOfferingContext : presentedOfferingContext, (i2 & 4) != 0 ? data.paywallRevision : i, (i2 & 8) != 0 ? data.sessionIdentifier : uuid, (i2 & 16) != 0 ? data.displayMode : str2, (i2 & 32) != 0 ? data.localeIdentifier : str3, (i2 & 64) != 0 ? data.darkMode : z, (i2 & 128) != 0 ? data.exitOfferType : exitOfferType, (i2 & 256) != 0 ? data.exitOfferingIdentifier : str4, (i2 & 512) != 0 ? data.packageIdentifier : str5, (i2 & 1024) != 0 ? data.productIdentifier : str6, (i2 & 2048) != 0 ? data.errorCode : num, (i2 & 4096) != 0 ? data.errorMessage : str7);
        }

        public static /* synthetic */ void getSessionIdentifier$annotations() {
        }

        public final String component1() {
            return this.paywallIdentifier;
        }

        public final String component10() {
            return this.packageIdentifier;
        }

        public final String component11() {
            return this.productIdentifier;
        }

        public final Integer component12() {
            return this.errorCode;
        }

        public final String component13() {
            return this.errorMessage;
        }

        public final PresentedOfferingContext component2() {
            return this.presentedOfferingContext;
        }

        public final int component3() {
            return this.paywallRevision;
        }

        public final UUID component4() {
            return this.sessionIdentifier;
        }

        public final String component5() {
            return this.displayMode;
        }

        public final String component6() {
            return this.localeIdentifier;
        }

        public final boolean component7() {
            return this.darkMode;
        }

        public final ExitOfferType component8() {
            return this.exitOfferType;
        }

        public final String component9() {
            return this.exitOfferingIdentifier;
        }

        public final Data copy(String str, PresentedOfferingContext presentedOfferingContext, int i, UUID uuid, String str2, String str3, boolean z, ExitOfferType exitOfferType, String str4, String str5, String str6, Integer num, String str7) {
            t.g(presentedOfferingContext, "presentedOfferingContext");
            t.g(uuid, "sessionIdentifier");
            t.g(str2, "displayMode");
            t.g(str3, "localeIdentifier");
            return new Data(str, presentedOfferingContext, i, uuid, str2, str3, z, exitOfferType, str4, str5, str6, num, str7);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return t.c(this.paywallIdentifier, data.paywallIdentifier) && t.c(this.presentedOfferingContext, data.presentedOfferingContext) && this.paywallRevision == data.paywallRevision && t.c(this.sessionIdentifier, data.sessionIdentifier) && t.c(this.displayMode, data.displayMode) && t.c(this.localeIdentifier, data.localeIdentifier) && this.darkMode == data.darkMode && this.exitOfferType == data.exitOfferType && t.c(this.exitOfferingIdentifier, data.exitOfferingIdentifier) && t.c(this.packageIdentifier, data.packageIdentifier) && t.c(this.productIdentifier, data.productIdentifier) && t.c(this.errorCode, data.errorCode) && t.c(this.errorMessage, data.errorMessage);
        }

        public final boolean getDarkMode() {
            return this.darkMode;
        }

        public final String getDisplayMode() {
            return this.displayMode;
        }

        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final ExitOfferType getExitOfferType() {
            return this.exitOfferType;
        }

        public final String getExitOfferingIdentifier() {
            return this.exitOfferingIdentifier;
        }

        public final String getLocaleIdentifier() {
            return this.localeIdentifier;
        }

        public final String getPackageIdentifier() {
            return this.packageIdentifier;
        }

        public final String getPaywallIdentifier() {
            return this.paywallIdentifier;
        }

        public final int getPaywallRevision() {
            return this.paywallRevision;
        }

        public final PresentedOfferingContext getPresentedOfferingContext() {
            return this.presentedOfferingContext;
        }

        public final String getProductIdentifier() {
            return this.productIdentifier;
        }

        public final UUID getSessionIdentifier() {
            return this.sessionIdentifier;
        }

        public int hashCode() {
            String str = this.paywallIdentifier;
            int hashCode = (((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.presentedOfferingContext.hashCode()) * 31) + Integer.hashCode(this.paywallRevision)) * 31) + this.sessionIdentifier.hashCode()) * 31) + this.displayMode.hashCode()) * 31) + this.localeIdentifier.hashCode()) * 31) + Boolean.hashCode(this.darkMode)) * 31;
            ExitOfferType exitOfferType = this.exitOfferType;
            int hashCode2 = (hashCode + (exitOfferType == null ? 0 : exitOfferType.hashCode())) * 31;
            String str2 = this.exitOfferingIdentifier;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.packageIdentifier;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.productIdentifier;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num = this.errorCode;
            int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            String str5 = this.errorMessage;
            return hashCode6 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "Data(paywallIdentifier=" + this.paywallIdentifier + ", presentedOfferingContext=" + this.presentedOfferingContext + ", paywallRevision=" + this.paywallRevision + ", sessionIdentifier=" + this.sessionIdentifier + ", displayMode=" + this.displayMode + ", localeIdentifier=" + this.localeIdentifier + ", darkMode=" + this.darkMode + ", exitOfferType=" + this.exitOfferType + ", exitOfferingIdentifier=" + this.exitOfferingIdentifier + ", packageIdentifier=" + this.packageIdentifier + ", productIdentifier=" + this.productIdentifier + ", errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ')';
        }

        public /* synthetic */ Data(String str, PresentedOfferingContext presentedOfferingContext, int i, UUID uuid, String str2, String str3, boolean z, ExitOfferType exitOfferType, String str4, String str5, String str6, Integer num, String str7, int i2, k kVar) {
            this(str, presentedOfferingContext, i, uuid, str2, str3, z, (i2 & 128) != 0 ? null : exitOfferType, (i2 & 256) != 0 ? null : str4, (i2 & 512) != 0 ? null : str5, (i2 & 1024) != 0 ? null : str6, (i2 & 2048) != 0 ? null : num, (i2 & 4096) != 0 ? null : str7);
        }
    }
}
