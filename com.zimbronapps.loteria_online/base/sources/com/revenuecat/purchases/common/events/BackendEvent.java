package com.revenuecat.purchases.common.events;

import Ca.e;
import Ca.l;
import Ca.m;
import Ca.n;
import Xa.c;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.customercenter.events.CustomerCenterDisplayMode;
import com.revenuecat.purchases.customercenter.events.CustomerCenterEventType;
import com.revenuecat.purchases.utils.Event;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ob.b;
import ob.h;
import rb.d;
import sb.J;
import sb.Q;
import sb.f0;
import sb.t0;
import sb.x0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class BackendEvent implements Event {
    public static final int AD_EVENT_SCHEMA_VERSION = 1;
    public static final int CUSTOMER_CENTER_EVENT_SCHEMA_VERSION = 1;
    public static final int CUSTOM_PAYWALL_EVENT_SCHEMA_VERSION = 1;
    public static final int PAYWALL_EVENT_SCHEMA_VERSION = 1;
    public static final Companion Companion = new Companion(null);
    private static final l $cachedSerializer$delegate = m.a(n.b, Companion.1.INSTANCE);

    public static final class Ad extends BackendEvent {
        public static final Companion Companion = new Companion(null);
        private final String adFormat;
        private final String adUnitId;
        private final String appSessionID;
        private final String appUserID;
        private final String currency;
        private final String id;
        private final String impressionId;
        private final Integer mediatorErrorCode;
        private final String mediatorName;
        private final String networkName;
        private final String placement;
        private final String precision;
        private final Long revenueMicros;
        private final long timestamp;
        private final String type;
        private final int version;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return BackendEvent$Ad$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @e
        public /* synthetic */ Ad(int i, String str, int i2, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Long l, String str11, String str12, Integer num, t0 t0Var) {
            super(i, t0Var);
            if (4015 != (i & 4015)) {
                f0.a(i, 4015, BackendEvent$Ad$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.version = i2;
            this.type = str2;
            this.timestamp = j;
            if ((i & 16) == 0) {
                this.networkName = null;
            } else {
                this.networkName = str3;
            }
            this.mediatorName = str4;
            if ((i & 64) == 0) {
                this.adFormat = null;
            } else {
                this.adFormat = str5;
            }
            this.placement = str6;
            this.adUnitId = str7;
            this.impressionId = str8;
            this.appUserID = str9;
            this.appSessionID = str10;
            if ((i & 4096) == 0) {
                this.revenueMicros = null;
            } else {
                this.revenueMicros = l;
            }
            if ((i & 8192) == 0) {
                this.currency = null;
            } else {
                this.currency = str11;
            }
            if ((i & 16384) == 0) {
                this.precision = null;
            } else {
                this.precision = str12;
            }
            if ((i & 32768) == 0) {
                this.mediatorErrorCode = null;
            } else {
                this.mediatorErrorCode = num;
            }
        }

        public static /* synthetic */ Ad copy$default(Ad ad, String str, int i, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Long l, String str11, String str12, Integer num, int i2, Object obj) {
            return ad.copy((i2 & 1) != 0 ? ad.id : str, (i2 & 2) != 0 ? ad.version : i, (i2 & 4) != 0 ? ad.type : str2, (i2 & 8) != 0 ? ad.timestamp : j, (i2 & 16) != 0 ? ad.networkName : str3, (i2 & 32) != 0 ? ad.mediatorName : str4, (i2 & 64) != 0 ? ad.adFormat : str5, (i2 & 128) != 0 ? ad.placement : str6, (i2 & 256) != 0 ? ad.adUnitId : str7, (i2 & 512) != 0 ? ad.impressionId : str8, (i2 & 1024) != 0 ? ad.appUserID : str9, (i2 & 2048) != 0 ? ad.appSessionID : str10, (i2 & 4096) != 0 ? ad.revenueMicros : l, (i2 & 8192) != 0 ? ad.currency : str11, (i2 & 16384) != 0 ? ad.precision : str12, (i2 & 32768) != 0 ? ad.mediatorErrorCode : num);
        }

        public static /* synthetic */ void getAdFormat$annotations() {
        }

        public static /* synthetic */ void getAdUnitId$annotations() {
        }

        public static /* synthetic */ void getAppSessionID$annotations() {
        }

        public static /* synthetic */ void getAppUserID$annotations() {
        }

        public static /* synthetic */ void getImpressionId$annotations() {
        }

        public static /* synthetic */ void getMediatorErrorCode$annotations() {
        }

        public static /* synthetic */ void getMediatorName$annotations() {
        }

        public static /* synthetic */ void getNetworkName$annotations() {
        }

        public static /* synthetic */ void getRevenueMicros$annotations() {
        }

        public static /* synthetic */ void getTimestamp$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Ad ad, d dVar, qb.e eVar) {
            BackendEvent.write$Self(ad, dVar, eVar);
            dVar.v(eVar, 0, ad.id);
            dVar.n(eVar, 1, ad.version);
            dVar.v(eVar, 2, ad.type);
            dVar.o(eVar, 3, ad.timestamp);
            if (dVar.e(eVar, 4) || ad.networkName != null) {
                dVar.j(eVar, 4, x0.a, ad.networkName);
            }
            dVar.v(eVar, 5, ad.mediatorName);
            if (dVar.e(eVar, 6) || ad.adFormat != null) {
                dVar.j(eVar, 6, x0.a, ad.adFormat);
            }
            x0 x0Var = x0.a;
            dVar.j(eVar, 7, x0Var, ad.placement);
            dVar.v(eVar, 8, ad.adUnitId);
            dVar.j(eVar, 9, x0Var, ad.impressionId);
            dVar.v(eVar, 10, ad.appUserID);
            dVar.v(eVar, 11, ad.appSessionID);
            if (dVar.e(eVar, 12) || ad.revenueMicros != null) {
                dVar.j(eVar, 12, Q.a, ad.revenueMicros);
            }
            if (dVar.e(eVar, 13) || ad.currency != null) {
                dVar.j(eVar, 13, x0Var, ad.currency);
            }
            if (dVar.e(eVar, 14) || ad.precision != null) {
                dVar.j(eVar, 14, x0Var, ad.precision);
            }
            if (!dVar.e(eVar, 15) && ad.mediatorErrorCode == null) {
                return;
            }
            dVar.j(eVar, 15, J.a, ad.mediatorErrorCode);
        }

        public final String component1() {
            return this.id;
        }

        public final String component10() {
            return this.impressionId;
        }

        public final String component11() {
            return this.appUserID;
        }

        public final String component12() {
            return this.appSessionID;
        }

        public final Long component13() {
            return this.revenueMicros;
        }

        public final String component14() {
            return this.currency;
        }

        public final String component15() {
            return this.precision;
        }

        public final Integer component16() {
            return this.mediatorErrorCode;
        }

        public final int component2() {
            return this.version;
        }

        public final String component3() {
            return this.type;
        }

        public final long component4() {
            return this.timestamp;
        }

        public final String component5() {
            return this.networkName;
        }

        public final String component6() {
            return this.mediatorName;
        }

        public final String component7() {
            return this.adFormat;
        }

        public final String component8() {
            return this.placement;
        }

        public final String component9() {
            return this.adUnitId;
        }

        public final Ad copy(String str, int i, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Long l, String str11, String str12, Integer num) {
            t.g(str, "id");
            t.g(str2, "type");
            t.g(str4, "mediatorName");
            t.g(str7, "adUnitId");
            t.g(str9, "appUserID");
            t.g(str10, "appSessionID");
            return new Ad(str, i, str2, j, str3, str4, str5, str6, str7, str8, str9, str10, l, str11, str12, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ad)) {
                return false;
            }
            Ad ad = (Ad) obj;
            return t.c(this.id, ad.id) && this.version == ad.version && t.c(this.type, ad.type) && this.timestamp == ad.timestamp && t.c(this.networkName, ad.networkName) && t.c(this.mediatorName, ad.mediatorName) && t.c(this.adFormat, ad.adFormat) && t.c(this.placement, ad.placement) && t.c(this.adUnitId, ad.adUnitId) && t.c(this.impressionId, ad.impressionId) && t.c(this.appUserID, ad.appUserID) && t.c(this.appSessionID, ad.appSessionID) && t.c(this.revenueMicros, ad.revenueMicros) && t.c(this.currency, ad.currency) && t.c(this.precision, ad.precision) && t.c(this.mediatorErrorCode, ad.mediatorErrorCode);
        }

        public final String getAdFormat() {
            return this.adFormat;
        }

        public final String getAdUnitId() {
            return this.adUnitId;
        }

        public final String getAppSessionID() {
            return this.appSessionID;
        }

        public final String getAppUserID() {
            return this.appUserID;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final String getId() {
            return this.id;
        }

        public final String getImpressionId() {
            return this.impressionId;
        }

        public final Integer getMediatorErrorCode() {
            return this.mediatorErrorCode;
        }

        public final String getMediatorName() {
            return this.mediatorName;
        }

        public final String getNetworkName() {
            return this.networkName;
        }

        public final String getPlacement() {
            return this.placement;
        }

        public final String getPrecision() {
            return this.precision;
        }

        public final Long getRevenueMicros() {
            return this.revenueMicros;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final String getType() {
            return this.type;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            int hashCode = ((((((this.id.hashCode() * 31) + Integer.hashCode(this.version)) * 31) + this.type.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31;
            String str = this.networkName;
            int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.mediatorName.hashCode()) * 31;
            String str2 = this.adFormat;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.placement;
            int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.adUnitId.hashCode()) * 31;
            String str4 = this.impressionId;
            int hashCode5 = (((((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.appUserID.hashCode()) * 31) + this.appSessionID.hashCode()) * 31;
            Long l = this.revenueMicros;
            int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
            String str5 = this.currency;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.precision;
            int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num = this.mediatorErrorCode;
            return hashCode8 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "Ad(id=" + this.id + ", version=" + this.version + ", type=" + this.type + ", timestamp=" + this.timestamp + ", networkName=" + this.networkName + ", mediatorName=" + this.mediatorName + ", adFormat=" + this.adFormat + ", placement=" + this.placement + ", adUnitId=" + this.adUnitId + ", impressionId=" + this.impressionId + ", appUserID=" + this.appUserID + ", appSessionID=" + this.appSessionID + ", revenueMicros=" + this.revenueMicros + ", currency=" + this.currency + ", precision=" + this.precision + ", mediatorErrorCode=" + this.mediatorErrorCode + ')';
        }

        public /* synthetic */ Ad(String str, int i, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Long l, String str11, String str12, Integer num, int i2, k kVar) {
            this(str, i, str2, j, (i2 & 16) != 0 ? null : str3, str4, (i2 & 64) != 0 ? null : str5, str6, str7, str8, str9, str10, (i2 & 4096) != 0 ? null : l, (i2 & 8192) != 0 ? null : str11, (i2 & 16384) != 0 ? null : str12, (i2 & 32768) != 0 ? null : num);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ad(String str, int i, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Long l, String str11, String str12, Integer num) {
            super(null);
            t.g(str, "id");
            t.g(str2, "type");
            t.g(str4, "mediatorName");
            t.g(str7, "adUnitId");
            t.g(str9, "appUserID");
            t.g(str10, "appSessionID");
            this.id = str;
            this.version = i;
            this.type = str2;
            this.timestamp = j;
            this.networkName = str3;
            this.mediatorName = str4;
            this.adFormat = str5;
            this.placement = str6;
            this.adUnitId = str7;
            this.impressionId = str8;
            this.appUserID = str9;
            this.appSessionID = str10;
            this.revenueMicros = l;
            this.currency = str11;
            this.precision = str12;
            this.mediatorErrorCode = num;
        }
    }

    public static final class Companion {

        public static final class 1 extends u implements Qa.a {
            public static final 1 INSTANCE = new 1();

            public 1() {
                super(0);
            }

            public final b invoke() {
                return new h("com.revenuecat.purchases.common.events.BackendEvent", P.b(BackendEvent.class), new c[]{P.b(Ad.class), P.b(CustomPaywall.class), P.b(CustomerCenter.class), P.b(Paywalls.class)}, new b[]{BackendEvent$Ad$$serializer.INSTANCE, BackendEvent$CustomPaywall$$serializer.INSTANCE, BackendEvent$CustomerCenter$$serializer.INSTANCE, BackendEvent$Paywalls$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final /* synthetic */ b get$cachedSerializer() {
            return (b) BackendEvent.access$get$cachedSerializer$delegate$cp().getValue();
        }

        public final b serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    public static final class CustomPaywall extends BackendEvent {
        public static final Companion Companion = new Companion(null);
        private final String appSessionID;
        private final String appUserID;
        private final String id;
        private final String offeringID;
        private final String paywallID;
        private final long timestamp;
        private final String type;
        private final int version;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return BackendEvent$CustomPaywall$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @e
        public /* synthetic */ CustomPaywall(int i, String str, int i2, String str2, String str3, String str4, long j, String str5, String str6, t0 t0Var) {
            super(i, t0Var);
            if (47 != (i & 47)) {
                f0.a(i, 47, BackendEvent$CustomPaywall$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.version = i2;
            this.type = str2;
            this.appUserID = str3;
            if ((i & 16) == 0) {
                this.appSessionID = null;
            } else {
                this.appSessionID = str4;
            }
            this.timestamp = j;
            if ((i & 64) == 0) {
                this.paywallID = null;
            } else {
                this.paywallID = str5;
            }
            if ((i & 128) == 0) {
                this.offeringID = null;
            } else {
                this.offeringID = str6;
            }
        }

        public static /* synthetic */ CustomPaywall copy$default(CustomPaywall customPaywall, String str, int i, String str2, String str3, String str4, long j, String str5, String str6, int i2, Object obj) {
            return customPaywall.copy((i2 & 1) != 0 ? customPaywall.id : str, (i2 & 2) != 0 ? customPaywall.version : i, (i2 & 4) != 0 ? customPaywall.type : str2, (i2 & 8) != 0 ? customPaywall.appUserID : str3, (i2 & 16) != 0 ? customPaywall.appSessionID : str4, (i2 & 32) != 0 ? customPaywall.timestamp : j, (i2 & 64) != 0 ? customPaywall.paywallID : str5, (i2 & 128) != 0 ? customPaywall.offeringID : str6);
        }

        public static /* synthetic */ void getAppSessionID$annotations() {
        }

        public static /* synthetic */ void getAppUserID$annotations() {
        }

        public static /* synthetic */ void getOfferingID$annotations() {
        }

        public static /* synthetic */ void getPaywallID$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(CustomPaywall customPaywall, d dVar, qb.e eVar) {
            BackendEvent.write$Self(customPaywall, dVar, eVar);
            dVar.v(eVar, 0, customPaywall.id);
            dVar.n(eVar, 1, customPaywall.version);
            dVar.v(eVar, 2, customPaywall.type);
            dVar.v(eVar, 3, customPaywall.appUserID);
            if (dVar.e(eVar, 4) || customPaywall.appSessionID != null) {
                dVar.j(eVar, 4, x0.a, customPaywall.appSessionID);
            }
            dVar.o(eVar, 5, customPaywall.timestamp);
            if (dVar.e(eVar, 6) || customPaywall.paywallID != null) {
                dVar.j(eVar, 6, x0.a, customPaywall.paywallID);
            }
            if (!dVar.e(eVar, 7) && customPaywall.offeringID == null) {
                return;
            }
            dVar.j(eVar, 7, x0.a, customPaywall.offeringID);
        }

        public final String component1() {
            return this.id;
        }

        public final int component2() {
            return this.version;
        }

        public final String component3() {
            return this.type;
        }

        public final String component4() {
            return this.appUserID;
        }

        public final String component5() {
            return this.appSessionID;
        }

        public final long component6() {
            return this.timestamp;
        }

        public final String component7() {
            return this.paywallID;
        }

        public final String component8() {
            return this.offeringID;
        }

        public final CustomPaywall copy(String str, int i, String str2, String str3, String str4, long j, String str5, String str6) {
            t.g(str, "id");
            t.g(str2, "type");
            t.g(str3, "appUserID");
            return new CustomPaywall(str, i, str2, str3, str4, j, str5, str6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomPaywall)) {
                return false;
            }
            CustomPaywall customPaywall = (CustomPaywall) obj;
            return t.c(this.id, customPaywall.id) && this.version == customPaywall.version && t.c(this.type, customPaywall.type) && t.c(this.appUserID, customPaywall.appUserID) && t.c(this.appSessionID, customPaywall.appSessionID) && this.timestamp == customPaywall.timestamp && t.c(this.paywallID, customPaywall.paywallID) && t.c(this.offeringID, customPaywall.offeringID);
        }

        public final String getAppSessionID() {
            return this.appSessionID;
        }

        public final String getAppUserID() {
            return this.appUserID;
        }

        public final String getId() {
            return this.id;
        }

        public final String getOfferingID() {
            return this.offeringID;
        }

        public final String getPaywallID() {
            return this.paywallID;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final String getType() {
            return this.type;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            int hashCode = ((((((this.id.hashCode() * 31) + Integer.hashCode(this.version)) * 31) + this.type.hashCode()) * 31) + this.appUserID.hashCode()) * 31;
            String str = this.appSessionID;
            int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.timestamp)) * 31;
            String str2 = this.paywallID;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.offeringID;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "CustomPaywall(id=" + this.id + ", version=" + this.version + ", type=" + this.type + ", appUserID=" + this.appUserID + ", appSessionID=" + this.appSessionID + ", timestamp=" + this.timestamp + ", paywallID=" + this.paywallID + ", offeringID=" + this.offeringID + ')';
        }

        public /* synthetic */ CustomPaywall(String str, int i, String str2, String str3, String str4, long j, String str5, String str6, int i2, k kVar) {
            this(str, i, str2, str3, (i2 & 16) != 0 ? null : str4, j, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : str6);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomPaywall(String str, int i, String str2, String str3, String str4, long j, String str5, String str6) {
            super(null);
            t.g(str, "id");
            t.g(str2, "type");
            t.g(str3, "appUserID");
            this.id = str;
            this.version = i;
            this.type = str2;
            this.appUserID = str3;
            this.appSessionID = str4;
            this.timestamp = j;
            this.paywallID = str5;
            this.offeringID = str6;
        }
    }

    public static final class CustomerCenter extends BackendEvent {
        private final String appSessionID;
        private final String appUserID;
        private final boolean darkMode;
        private final CustomerCenterDisplayMode displayMode;
        private final String id;
        private final String locale;
        private final CustomerCenterConfigData.HelpPath.PathType path;
        private final int revisionID;
        private final String surveyOptionID;
        private final long timestamp;
        private final CustomerCenterEventType type;
        private final String url;
        public static final Companion Companion = new Companion(null);
        private static final b[] $childSerializers = {null, null, CustomerCenterEventType.Companion.serializer(), null, null, null, null, null, CustomerCenterDisplayMode.Companion.serializer(), CustomerCenterConfigData.HelpPath.PathType.Companion.serializer(), null, null};

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return BackendEvent$CustomerCenter$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @e
        public /* synthetic */ CustomerCenter(int i, String str, int i2, CustomerCenterEventType customerCenterEventType, String str2, String str3, long j, boolean z, String str4, CustomerCenterDisplayMode customerCenterDisplayMode, CustomerCenterConfigData.HelpPath.PathType pathType, String str5, String str6, t0 t0Var) {
            super(i, t0Var);
            if (4095 != (i & 4095)) {
                f0.a(i, 4095, BackendEvent$CustomerCenter$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.revisionID = i2;
            this.type = customerCenterEventType;
            this.appUserID = str2;
            this.appSessionID = str3;
            this.timestamp = j;
            this.darkMode = z;
            this.locale = str4;
            this.displayMode = customerCenterDisplayMode;
            this.path = pathType;
            this.url = str5;
            this.surveyOptionID = str6;
        }

        public static final /* synthetic */ b[] access$get$childSerializers$cp() {
            return $childSerializers;
        }

        public static /* synthetic */ CustomerCenter copy$default(CustomerCenter customerCenter, String str, int i, CustomerCenterEventType customerCenterEventType, String str2, String str3, long j, boolean z, String str4, CustomerCenterDisplayMode customerCenterDisplayMode, CustomerCenterConfigData.HelpPath.PathType pathType, String str5, String str6, int i2, Object obj) {
            return customerCenter.copy((i2 & 1) != 0 ? customerCenter.id : str, (i2 & 2) != 0 ? customerCenter.revisionID : i, (i2 & 4) != 0 ? customerCenter.type : customerCenterEventType, (i2 & 8) != 0 ? customerCenter.appUserID : str2, (i2 & 16) != 0 ? customerCenter.appSessionID : str3, (i2 & 32) != 0 ? customerCenter.timestamp : j, (i2 & 64) != 0 ? customerCenter.darkMode : z, (i2 & 128) != 0 ? customerCenter.locale : str4, (i2 & 256) != 0 ? customerCenter.displayMode : customerCenterDisplayMode, (i2 & 512) != 0 ? customerCenter.path : pathType, (i2 & 1024) != 0 ? customerCenter.url : str5, (i2 & 2048) != 0 ? customerCenter.surveyOptionID : str6);
        }

        public static /* synthetic */ void getAppSessionID$annotations() {
        }

        public static /* synthetic */ void getAppUserID$annotations() {
        }

        public static /* synthetic */ void getDarkMode$annotations() {
        }

        public static /* synthetic */ void getDisplayMode$annotations() {
        }

        public static /* synthetic */ void getRevisionID$annotations() {
        }

        public static /* synthetic */ void getSurveyOptionID$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(CustomerCenter customerCenter, d dVar, qb.e eVar) {
            BackendEvent.write$Self(customerCenter, dVar, eVar);
            ob.k[] kVarArr = $childSerializers;
            dVar.v(eVar, 0, customerCenter.id);
            dVar.n(eVar, 1, customerCenter.revisionID);
            dVar.k(eVar, 2, kVarArr[2], customerCenter.type);
            dVar.v(eVar, 3, customerCenter.appUserID);
            dVar.v(eVar, 4, customerCenter.appSessionID);
            dVar.o(eVar, 5, customerCenter.timestamp);
            dVar.B(eVar, 6, customerCenter.darkMode);
            dVar.v(eVar, 7, customerCenter.locale);
            dVar.k(eVar, 8, kVarArr[8], customerCenter.displayMode);
            dVar.j(eVar, 9, kVarArr[9], customerCenter.path);
            x0 x0Var = x0.a;
            dVar.j(eVar, 10, x0Var, customerCenter.url);
            dVar.j(eVar, 11, x0Var, customerCenter.surveyOptionID);
        }

        public final String component1() {
            return this.id;
        }

        public final CustomerCenterConfigData.HelpPath.PathType component10() {
            return this.path;
        }

        public final String component11() {
            return this.url;
        }

        public final String component12() {
            return this.surveyOptionID;
        }

        public final int component2() {
            return this.revisionID;
        }

        public final CustomerCenterEventType component3() {
            return this.type;
        }

        public final String component4() {
            return this.appUserID;
        }

        public final String component5() {
            return this.appSessionID;
        }

        public final long component6() {
            return this.timestamp;
        }

        public final boolean component7() {
            return this.darkMode;
        }

        public final String component8() {
            return this.locale;
        }

        public final CustomerCenterDisplayMode component9() {
            return this.displayMode;
        }

        public final CustomerCenter copy(String str, int i, CustomerCenterEventType customerCenterEventType, String str2, String str3, long j, boolean z, String str4, CustomerCenterDisplayMode customerCenterDisplayMode, CustomerCenterConfigData.HelpPath.PathType pathType, String str5, String str6) {
            t.g(str, "id");
            t.g(customerCenterEventType, "type");
            t.g(str2, "appUserID");
            t.g(str3, "appSessionID");
            t.g(str4, "locale");
            t.g(customerCenterDisplayMode, "displayMode");
            return new CustomerCenter(str, i, customerCenterEventType, str2, str3, j, z, str4, customerCenterDisplayMode, pathType, str5, str6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomerCenter)) {
                return false;
            }
            CustomerCenter customerCenter = (CustomerCenter) obj;
            return t.c(this.id, customerCenter.id) && this.revisionID == customerCenter.revisionID && this.type == customerCenter.type && t.c(this.appUserID, customerCenter.appUserID) && t.c(this.appSessionID, customerCenter.appSessionID) && this.timestamp == customerCenter.timestamp && this.darkMode == customerCenter.darkMode && t.c(this.locale, customerCenter.locale) && this.displayMode == customerCenter.displayMode && this.path == customerCenter.path && t.c(this.url, customerCenter.url) && t.c(this.surveyOptionID, customerCenter.surveyOptionID);
        }

        public final String getAppSessionID() {
            return this.appSessionID;
        }

        public final String getAppUserID() {
            return this.appUserID;
        }

        public final boolean getDarkMode() {
            return this.darkMode;
        }

        public final CustomerCenterDisplayMode getDisplayMode() {
            return this.displayMode;
        }

        public final String getId() {
            return this.id;
        }

        public final String getLocale() {
            return this.locale;
        }

        public final CustomerCenterConfigData.HelpPath.PathType getPath() {
            return this.path;
        }

        public final int getRevisionID() {
            return this.revisionID;
        }

        public final String getSurveyOptionID() {
            return this.surveyOptionID;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final CustomerCenterEventType getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int hashCode = ((((((((((((((((this.id.hashCode() * 31) + Integer.hashCode(this.revisionID)) * 31) + this.type.hashCode()) * 31) + this.appUserID.hashCode()) * 31) + this.appSessionID.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + Boolean.hashCode(this.darkMode)) * 31) + this.locale.hashCode()) * 31) + this.displayMode.hashCode()) * 31;
            CustomerCenterConfigData.HelpPath.PathType pathType = this.path;
            int hashCode2 = (hashCode + (pathType == null ? 0 : pathType.hashCode())) * 31;
            String str = this.url;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.surveyOptionID;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "CustomerCenter(id=" + this.id + ", revisionID=" + this.revisionID + ", type=" + this.type + ", appUserID=" + this.appUserID + ", appSessionID=" + this.appSessionID + ", timestamp=" + this.timestamp + ", darkMode=" + this.darkMode + ", locale=" + this.locale + ", displayMode=" + this.displayMode + ", path=" + this.path + ", url=" + this.url + ", surveyOptionID=" + this.surveyOptionID + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomerCenter(String str, int i, CustomerCenterEventType customerCenterEventType, String str2, String str3, long j, boolean z, String str4, CustomerCenterDisplayMode customerCenterDisplayMode, CustomerCenterConfigData.HelpPath.PathType pathType, String str5, String str6) {
            super(null);
            t.g(str, "id");
            t.g(customerCenterEventType, "type");
            t.g(str2, "appUserID");
            t.g(str3, "appSessionID");
            t.g(str4, "locale");
            t.g(customerCenterDisplayMode, "displayMode");
            this.id = str;
            this.revisionID = i;
            this.type = customerCenterEventType;
            this.appUserID = str2;
            this.appSessionID = str3;
            this.timestamp = j;
            this.darkMode = z;
            this.locale = str4;
            this.displayMode = customerCenterDisplayMode;
            this.path = pathType;
            this.url = str5;
            this.surveyOptionID = str6;
        }
    }

    public static final class Paywalls extends BackendEvent {
        public static final Companion Companion = new Companion(null);
        private final String appUserID;
        private final boolean darkMode;
        private final String displayMode;
        private final Integer errorCode;
        private final String errorMessage;
        private final String exitOfferType;
        private final String exitOfferingID;
        private final String id;
        private final String localeIdentifier;
        private final String offeringID;
        private final String packageID;
        private final String paywallID;
        private final int paywallRevision;
        private final String productID;
        private final String sessionID;
        private final long timestamp;
        private final String type;
        private final int version;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return BackendEvent$Paywalls$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @e
        public /* synthetic */ Paywalls(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, int i3, long j, String str7, boolean z, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, t0 t0Var) {
            super(i, t0Var);
            if (4095 != (i & 4095)) {
                f0.a(i, 4095, BackendEvent$Paywalls$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.version = i2;
            this.type = str2;
            this.appUserID = str3;
            this.sessionID = str4;
            this.offeringID = str5;
            this.paywallID = str6;
            this.paywallRevision = i3;
            this.timestamp = j;
            this.displayMode = str7;
            this.darkMode = z;
            this.localeIdentifier = str8;
            if ((i & 4096) == 0) {
                this.exitOfferType = null;
            } else {
                this.exitOfferType = str9;
            }
            if ((i & 8192) == 0) {
                this.exitOfferingID = null;
            } else {
                this.exitOfferingID = str10;
            }
            if ((i & 16384) == 0) {
                this.packageID = null;
            } else {
                this.packageID = str11;
            }
            if ((32768 & i) == 0) {
                this.productID = null;
            } else {
                this.productID = str12;
            }
            if ((65536 & i) == 0) {
                this.errorCode = null;
            } else {
                this.errorCode = num;
            }
            if ((i & 131072) == 0) {
                this.errorMessage = null;
            } else {
                this.errorMessage = str13;
            }
        }

        public static /* synthetic */ Paywalls copy$default(Paywalls paywalls, String str, int i, String str2, String str3, String str4, String str5, String str6, int i2, long j, String str7, boolean z, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, int i3, Object obj) {
            return paywalls.copy((i3 & 1) != 0 ? paywalls.id : str, (i3 & 2) != 0 ? paywalls.version : i, (i3 & 4) != 0 ? paywalls.type : str2, (i3 & 8) != 0 ? paywalls.appUserID : str3, (i3 & 16) != 0 ? paywalls.sessionID : str4, (i3 & 32) != 0 ? paywalls.offeringID : str5, (i3 & 64) != 0 ? paywalls.paywallID : str6, (i3 & 128) != 0 ? paywalls.paywallRevision : i2, (i3 & 256) != 0 ? paywalls.timestamp : j, (i3 & 512) != 0 ? paywalls.displayMode : str7, (i3 & 1024) != 0 ? paywalls.darkMode : z, (i3 & 2048) != 0 ? paywalls.localeIdentifier : str8, (i3 & 4096) != 0 ? paywalls.exitOfferType : str9, (i3 & 8192) != 0 ? paywalls.exitOfferingID : str10, (i3 & 16384) != 0 ? paywalls.packageID : str11, (i3 & 32768) != 0 ? paywalls.productID : str12, (i3 & 65536) != 0 ? paywalls.errorCode : num, (i3 & 131072) != 0 ? paywalls.errorMessage : str13);
        }

        public static /* synthetic */ void getAppUserID$annotations() {
        }

        public static /* synthetic */ void getDarkMode$annotations() {
        }

        public static /* synthetic */ void getDisplayMode$annotations() {
        }

        public static /* synthetic */ void getErrorCode$annotations() {
        }

        public static /* synthetic */ void getErrorMessage$annotations() {
        }

        public static /* synthetic */ void getExitOfferType$annotations() {
        }

        public static /* synthetic */ void getExitOfferingID$annotations() {
        }

        public static /* synthetic */ void getLocaleIdentifier$annotations() {
        }

        public static /* synthetic */ void getOfferingID$annotations() {
        }

        public static /* synthetic */ void getPackageID$annotations() {
        }

        public static /* synthetic */ void getPaywallID$annotations() {
        }

        public static /* synthetic */ void getPaywallRevision$annotations() {
        }

        public static /* synthetic */ void getProductID$annotations() {
        }

        public static /* synthetic */ void getSessionID$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Paywalls paywalls, d dVar, qb.e eVar) {
            BackendEvent.write$Self(paywalls, dVar, eVar);
            dVar.v(eVar, 0, paywalls.id);
            dVar.n(eVar, 1, paywalls.version);
            dVar.v(eVar, 2, paywalls.type);
            dVar.v(eVar, 3, paywalls.appUserID);
            dVar.v(eVar, 4, paywalls.sessionID);
            dVar.v(eVar, 5, paywalls.offeringID);
            x0 x0Var = x0.a;
            dVar.j(eVar, 6, x0Var, paywalls.paywallID);
            dVar.n(eVar, 7, paywalls.paywallRevision);
            dVar.o(eVar, 8, paywalls.timestamp);
            dVar.v(eVar, 9, paywalls.displayMode);
            dVar.B(eVar, 10, paywalls.darkMode);
            dVar.v(eVar, 11, paywalls.localeIdentifier);
            if (dVar.e(eVar, 12) || paywalls.exitOfferType != null) {
                dVar.j(eVar, 12, x0Var, paywalls.exitOfferType);
            }
            if (dVar.e(eVar, 13) || paywalls.exitOfferingID != null) {
                dVar.j(eVar, 13, x0Var, paywalls.exitOfferingID);
            }
            if (dVar.e(eVar, 14) || paywalls.packageID != null) {
                dVar.j(eVar, 14, x0Var, paywalls.packageID);
            }
            if (dVar.e(eVar, 15) || paywalls.productID != null) {
                dVar.j(eVar, 15, x0Var, paywalls.productID);
            }
            if (dVar.e(eVar, 16) || paywalls.errorCode != null) {
                dVar.j(eVar, 16, J.a, paywalls.errorCode);
            }
            if (!dVar.e(eVar, 17) && paywalls.errorMessage == null) {
                return;
            }
            dVar.j(eVar, 17, x0Var, paywalls.errorMessage);
        }

        public final String component1() {
            return this.id;
        }

        public final String component10() {
            return this.displayMode;
        }

        public final boolean component11() {
            return this.darkMode;
        }

        public final String component12() {
            return this.localeIdentifier;
        }

        public final String component13() {
            return this.exitOfferType;
        }

        public final String component14() {
            return this.exitOfferingID;
        }

        public final String component15() {
            return this.packageID;
        }

        public final String component16() {
            return this.productID;
        }

        public final Integer component17() {
            return this.errorCode;
        }

        public final String component18() {
            return this.errorMessage;
        }

        public final int component2() {
            return this.version;
        }

        public final String component3() {
            return this.type;
        }

        public final String component4() {
            return this.appUserID;
        }

        public final String component5() {
            return this.sessionID;
        }

        public final String component6() {
            return this.offeringID;
        }

        public final String component7() {
            return this.paywallID;
        }

        public final int component8() {
            return this.paywallRevision;
        }

        public final long component9() {
            return this.timestamp;
        }

        public final Paywalls copy(String str, int i, String str2, String str3, String str4, String str5, String str6, int i2, long j, String str7, boolean z, String str8, String str9, String str10, String str11, String str12, Integer num, String str13) {
            t.g(str, "id");
            t.g(str2, "type");
            t.g(str3, "appUserID");
            t.g(str4, "sessionID");
            t.g(str5, "offeringID");
            t.g(str7, "displayMode");
            t.g(str8, "localeIdentifier");
            return new Paywalls(str, i, str2, str3, str4, str5, str6, i2, j, str7, z, str8, str9, str10, str11, str12, num, str13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Paywalls)) {
                return false;
            }
            Paywalls paywalls = (Paywalls) obj;
            return t.c(this.id, paywalls.id) && this.version == paywalls.version && t.c(this.type, paywalls.type) && t.c(this.appUserID, paywalls.appUserID) && t.c(this.sessionID, paywalls.sessionID) && t.c(this.offeringID, paywalls.offeringID) && t.c(this.paywallID, paywalls.paywallID) && this.paywallRevision == paywalls.paywallRevision && this.timestamp == paywalls.timestamp && t.c(this.displayMode, paywalls.displayMode) && this.darkMode == paywalls.darkMode && t.c(this.localeIdentifier, paywalls.localeIdentifier) && t.c(this.exitOfferType, paywalls.exitOfferType) && t.c(this.exitOfferingID, paywalls.exitOfferingID) && t.c(this.packageID, paywalls.packageID) && t.c(this.productID, paywalls.productID) && t.c(this.errorCode, paywalls.errorCode) && t.c(this.errorMessage, paywalls.errorMessage);
        }

        public final String getAppUserID() {
            return this.appUserID;
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

        public final String getExitOfferType() {
            return this.exitOfferType;
        }

        public final String getExitOfferingID() {
            return this.exitOfferingID;
        }

        public final String getId() {
            return this.id;
        }

        public final String getLocaleIdentifier() {
            return this.localeIdentifier;
        }

        public final String getOfferingID() {
            return this.offeringID;
        }

        public final String getPackageID() {
            return this.packageID;
        }

        public final String getPaywallID() {
            return this.paywallID;
        }

        public final int getPaywallRevision() {
            return this.paywallRevision;
        }

        public final String getProductID() {
            return this.productID;
        }

        public final String getSessionID() {
            return this.sessionID;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final String getType() {
            return this.type;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            int hashCode = ((((((((((this.id.hashCode() * 31) + Integer.hashCode(this.version)) * 31) + this.type.hashCode()) * 31) + this.appUserID.hashCode()) * 31) + this.sessionID.hashCode()) * 31) + this.offeringID.hashCode()) * 31;
            String str = this.paywallID;
            int hashCode2 = (((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.paywallRevision)) * 31) + Long.hashCode(this.timestamp)) * 31) + this.displayMode.hashCode()) * 31) + Boolean.hashCode(this.darkMode)) * 31) + this.localeIdentifier.hashCode()) * 31;
            String str2 = this.exitOfferType;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.exitOfferingID;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.packageID;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.productID;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num = this.errorCode;
            int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
            String str6 = this.errorMessage;
            return hashCode7 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "Paywalls(id=" + this.id + ", version=" + this.version + ", type=" + this.type + ", appUserID=" + this.appUserID + ", sessionID=" + this.sessionID + ", offeringID=" + this.offeringID + ", paywallID=" + this.paywallID + ", paywallRevision=" + this.paywallRevision + ", timestamp=" + this.timestamp + ", displayMode=" + this.displayMode + ", darkMode=" + this.darkMode + ", localeIdentifier=" + this.localeIdentifier + ", exitOfferType=" + this.exitOfferType + ", exitOfferingID=" + this.exitOfferingID + ", packageID=" + this.packageID + ", productID=" + this.productID + ", errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ')';
        }

        public /* synthetic */ Paywalls(String str, int i, String str2, String str3, String str4, String str5, String str6, int i2, long j, String str7, boolean z, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, int i3, k kVar) {
            this(str, i, str2, str3, str4, str5, str6, i2, j, str7, z, str8, (i3 & 4096) != 0 ? null : str9, (i3 & 8192) != 0 ? null : str10, (i3 & 16384) != 0 ? null : str11, (32768 & i3) != 0 ? null : str12, (65536 & i3) != 0 ? null : num, (i3 & 131072) != 0 ? null : str13);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Paywalls(String str, int i, String str2, String str3, String str4, String str5, String str6, int i2, long j, String str7, boolean z, String str8, String str9, String str10, String str11, String str12, Integer num, String str13) {
            super(null);
            t.g(str, "id");
            t.g(str2, "type");
            t.g(str3, "appUserID");
            t.g(str4, "sessionID");
            t.g(str5, "offeringID");
            t.g(str7, "displayMode");
            t.g(str8, "localeIdentifier");
            this.id = str;
            this.version = i;
            this.type = str2;
            this.appUserID = str3;
            this.sessionID = str4;
            this.offeringID = str5;
            this.paywallID = str6;
            this.paywallRevision = i2;
            this.timestamp = j;
            this.displayMode = str7;
            this.darkMode = z;
            this.localeIdentifier = str8;
            this.exitOfferType = str9;
            this.exitOfferingID = str10;
            this.packageID = str11;
            this.productID = str12;
            this.errorCode = num;
            this.errorMessage = str13;
        }
    }

    public /* synthetic */ BackendEvent(k kVar) {
        this();
    }

    public static final /* synthetic */ l access$get$cachedSerializer$delegate$cp() {
        return $cachedSerializer$delegate;
    }

    private BackendEvent() {
    }

    @e
    public /* synthetic */ BackendEvent(int i, t0 t0Var) {
    }

    public static final /* synthetic */ void write$Self(BackendEvent backendEvent, d dVar, qb.e eVar) {
    }
}
