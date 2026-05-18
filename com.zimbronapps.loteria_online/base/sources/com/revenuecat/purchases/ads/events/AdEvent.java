package com.revenuecat.purchases.ads.events;

import com.revenuecat.purchases.common.events.FeatureEvent;
import java.util.UUID;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface AdEvent extends FeatureEvent {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean isPriorityEvent(AdEvent adEvent) {
            return AdEvent.access$isPriorityEvent$jd(adEvent);
        }
    }

    public static final class Displayed implements AdEvent {
        private final String adFormat;
        private final String adUnitId;
        private final int eventVersion;
        private final String id;
        private final String impressionId;
        private final String mediatorName;
        private final String networkName;
        private final String placement;
        private final long timestamp;
        private final AdEventType type;

        public /* synthetic */ Displayed(String str, int i, AdEventType adEventType, long j, String str2, String str3, String str4, String str5, String str6, String str7, k kVar) {
            this(str, i, adEventType, j, str2, str3, str4, str5, str6, str7);
        }

        public String getAdFormat-y0COY5Q() {
            return this.adFormat;
        }

        public String getAdUnitId() {
            return this.adUnitId;
        }

        public int getEventVersion() {
            return this.eventVersion;
        }

        public String getId() {
            return this.id;
        }

        public String getImpressionId() {
            return this.impressionId;
        }

        public String getMediatorName-GyoM_N4() {
            return this.mediatorName;
        }

        public String getNetworkName() {
            return this.networkName;
        }

        public String getPlacement() {
            return this.placement;
        }

        public long getTimestamp() {
            return this.timestamp;
        }

        public AdEventType getType() {
            return this.type;
        }

        private Displayed(String str, int i, AdEventType adEventType, long j, String str2, String str3, String str4, String str5, String str6, String str7) {
            t.g(str, "id");
            t.g(adEventType, "type");
            t.g(str3, "mediatorName");
            t.g(str4, "adFormat");
            t.g(str6, "adUnitId");
            t.g(str7, "impressionId");
            this.id = str;
            this.eventVersion = i;
            this.type = adEventType;
            this.timestamp = j;
            this.networkName = str2;
            this.mediatorName = str3;
            this.adFormat = str4;
            this.placement = str5;
            this.adUnitId = str6;
            this.impressionId = str7;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Displayed(String str, int i, AdEventType adEventType, long j, String str2, String str3, String str4, String str5, String str6, String str7, int i2, k kVar) {
            String str8;
            if ((i2 & 1) != 0) {
                String uuid = UUID.randomUUID().toString();
                t.f(uuid, "randomUUID().toString()");
                str8 = uuid;
            } else {
                str8 = str;
            }
            this(str8, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? AdEventType.DISPLAYED : adEventType, (i2 & 8) != 0 ? System.currentTimeMillis() : j, str2, str3, str4, str5, str6, str7, null);
        }
    }

    public static final class FailedToLoad implements AdEvent {
        private final String adFormat;
        private final String adUnitId;
        private final int eventVersion;
        private final String id;
        private final String impressionId;
        private final Integer mediatorErrorCode;
        private final String mediatorName;
        private final String networkName;
        private final String placement;
        private final long timestamp;
        private final AdEventType type;

        public /* synthetic */ FailedToLoad(String str, int i, AdEventType adEventType, long j, String str2, String str3, String str4, String str5, String str6, Integer num, k kVar) {
            this(str, i, adEventType, j, str2, str3, str4, str5, str6, num);
        }

        public String getAdFormat-y0COY5Q() {
            return this.adFormat;
        }

        public String getAdUnitId() {
            return this.adUnitId;
        }

        public int getEventVersion() {
            return this.eventVersion;
        }

        public String getId() {
            return this.id;
        }

        public String getImpressionId() {
            return this.impressionId;
        }

        public final Integer getMediatorErrorCode() {
            return this.mediatorErrorCode;
        }

        public String getMediatorName-GyoM_N4() {
            return this.mediatorName;
        }

        public String getNetworkName() {
            return this.networkName;
        }

        public String getPlacement() {
            return this.placement;
        }

        public long getTimestamp() {
            return this.timestamp;
        }

        public AdEventType getType() {
            return this.type;
        }

        private FailedToLoad(String str, int i, AdEventType adEventType, long j, String str2, String str3, String str4, String str5, String str6, Integer num) {
            t.g(str, "id");
            t.g(adEventType, "type");
            t.g(str2, "mediatorName");
            t.g(str3, "adFormat");
            t.g(str5, "adUnitId");
            this.id = str;
            this.eventVersion = i;
            this.type = adEventType;
            this.timestamp = j;
            this.mediatorName = str2;
            this.adFormat = str3;
            this.placement = str4;
            this.adUnitId = str5;
            this.impressionId = str6;
            this.mediatorErrorCode = num;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ FailedToLoad(String str, int i, AdEventType adEventType, long j, String str2, String str3, String str4, String str5, String str6, Integer num, int i2, k kVar) {
            String str7;
            if ((i2 & 1) != 0) {
                String uuid = UUID.randomUUID().toString();
                t.f(uuid, "randomUUID().toString()");
                str7 = uuid;
            } else {
                str7 = str;
            }
            this(str7, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? AdEventType.FAILED_TO_LOAD : adEventType, (i2 & 8) != 0 ? System.currentTimeMillis() : j, str2, str3, str4, str5, (i2 & 256) != 0 ? null : str6, num, null);
        }
    }

    public static final class Loaded implements AdEvent {
        private final String adFormat;
        private final String adUnitId;
        private final int eventVersion;
        private final String id;
        private final String impressionId;
        private final String mediatorName;
        private final String networkName;
        private final String placement;
        private final long timestamp;
        private final AdEventType type;

        public /* synthetic */ Loaded(String str, int i, AdEventType adEventType, long j, String str2, String str3, String str4, String str5, String str6, String str7, k kVar) {
            this(str, i, adEventType, j, str2, str3, str4, str5, str6, str7);
        }

        public String getAdFormat-y0COY5Q() {
            return this.adFormat;
        }

        public String getAdUnitId() {
            return this.adUnitId;
        }

        public int getEventVersion() {
            return this.eventVersion;
        }

        public String getId() {
            return this.id;
        }

        public String getImpressionId() {
            return this.impressionId;
        }

        public String getMediatorName-GyoM_N4() {
            return this.mediatorName;
        }

        public String getNetworkName() {
            return this.networkName;
        }

        public String getPlacement() {
            return this.placement;
        }

        public long getTimestamp() {
            return this.timestamp;
        }

        public AdEventType getType() {
            return this.type;
        }

        private Loaded(String str, int i, AdEventType adEventType, long j, String str2, String str3, String str4, String str5, String str6, String str7) {
            t.g(str, "id");
            t.g(adEventType, "type");
            t.g(str3, "mediatorName");
            t.g(str4, "adFormat");
            t.g(str6, "adUnitId");
            t.g(str7, "impressionId");
            this.id = str;
            this.eventVersion = i;
            this.type = adEventType;
            this.timestamp = j;
            this.networkName = str2;
            this.mediatorName = str3;
            this.adFormat = str4;
            this.placement = str5;
            this.adUnitId = str6;
            this.impressionId = str7;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Loaded(String str, int i, AdEventType adEventType, long j, String str2, String str3, String str4, String str5, String str6, String str7, int i2, k kVar) {
            String str8;
            if ((i2 & 1) != 0) {
                String uuid = UUID.randomUUID().toString();
                t.f(uuid, "randomUUID().toString()");
                str8 = uuid;
            } else {
                str8 = str;
            }
            this(str8, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? AdEventType.LOADED : adEventType, (i2 & 8) != 0 ? System.currentTimeMillis() : j, str2, str3, str4, str5, str6, str7, null);
        }
    }

    public static final class Open implements AdEvent {
        private final String adFormat;
        private final String adUnitId;
        private final int eventVersion;
        private final String id;
        private final String impressionId;
        private final String mediatorName;
        private final String networkName;
        private final String placement;
        private final long timestamp;
        private final AdEventType type;

        public /* synthetic */ Open(String str, int i, AdEventType adEventType, long j, String str2, String str3, String str4, String str5, String str6, String str7, k kVar) {
            this(str, i, adEventType, j, str2, str3, str4, str5, str6, str7);
        }

        public String getAdFormat-y0COY5Q() {
            return this.adFormat;
        }

        public String getAdUnitId() {
            return this.adUnitId;
        }

        public int getEventVersion() {
            return this.eventVersion;
        }

        public String getId() {
            return this.id;
        }

        public String getImpressionId() {
            return this.impressionId;
        }

        public String getMediatorName-GyoM_N4() {
            return this.mediatorName;
        }

        public String getNetworkName() {
            return this.networkName;
        }

        public String getPlacement() {
            return this.placement;
        }

        public long getTimestamp() {
            return this.timestamp;
        }

        public AdEventType getType() {
            return this.type;
        }

        private Open(String str, int i, AdEventType adEventType, long j, String str2, String str3, String str4, String str5, String str6, String str7) {
            t.g(str, "id");
            t.g(adEventType, "type");
            t.g(str3, "mediatorName");
            t.g(str4, "adFormat");
            t.g(str6, "adUnitId");
            t.g(str7, "impressionId");
            this.id = str;
            this.eventVersion = i;
            this.type = adEventType;
            this.timestamp = j;
            this.networkName = str2;
            this.mediatorName = str3;
            this.adFormat = str4;
            this.placement = str5;
            this.adUnitId = str6;
            this.impressionId = str7;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Open(String str, int i, AdEventType adEventType, long j, String str2, String str3, String str4, String str5, String str6, String str7, int i2, k kVar) {
            String str8;
            if ((i2 & 1) != 0) {
                String uuid = UUID.randomUUID().toString();
                t.f(uuid, "randomUUID().toString()");
                str8 = uuid;
            } else {
                str8 = str;
            }
            this(str8, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? AdEventType.OPENED : adEventType, (i2 & 8) != 0 ? System.currentTimeMillis() : j, str2, str3, str4, str5, str6, str7, null);
        }
    }

    public static final class Revenue implements AdEvent {
        private final String adFormat;
        private final String adUnitId;
        private final String currency;
        private final int eventVersion;
        private final String id;
        private final String impressionId;
        private final String mediatorName;
        private final String networkName;
        private final String placement;
        private final String precision;
        private final long revenueMicros;
        private final long timestamp;
        private final AdEventType type;

        public /* synthetic */ Revenue(String str, int i, AdEventType adEventType, long j, String str2, String str3, String str4, String str5, String str6, String str7, long j2, String str8, String str9, k kVar) {
            this(str, i, adEventType, j, str2, str3, str4, str5, str6, str7, j2, str8, str9);
        }

        public String getAdFormat-y0COY5Q() {
            return this.adFormat;
        }

        public String getAdUnitId() {
            return this.adUnitId;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public int getEventVersion() {
            return this.eventVersion;
        }

        public String getId() {
            return this.id;
        }

        public String getImpressionId() {
            return this.impressionId;
        }

        public String getMediatorName-GyoM_N4() {
            return this.mediatorName;
        }

        public String getNetworkName() {
            return this.networkName;
        }

        public String getPlacement() {
            return this.placement;
        }

        public final String getPrecision-rAcPn4k() {
            return this.precision;
        }

        public final long getRevenueMicros() {
            return this.revenueMicros;
        }

        public long getTimestamp() {
            return this.timestamp;
        }

        public AdEventType getType() {
            return this.type;
        }

        private Revenue(String str, int i, AdEventType adEventType, long j, String str2, String str3, String str4, String str5, String str6, String str7, long j2, String str8, String str9) {
            t.g(str, "id");
            t.g(adEventType, "type");
            t.g(str3, "mediatorName");
            t.g(str4, "adFormat");
            t.g(str6, "adUnitId");
            t.g(str7, "impressionId");
            t.g(str8, "currency");
            t.g(str9, "precision");
            this.id = str;
            this.eventVersion = i;
            this.type = adEventType;
            this.timestamp = j;
            this.networkName = str2;
            this.mediatorName = str3;
            this.adFormat = str4;
            this.placement = str5;
            this.adUnitId = str6;
            this.impressionId = str7;
            this.revenueMicros = j2;
            this.currency = str8;
            this.precision = str9;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Revenue(String str, int i, AdEventType adEventType, long j, String str2, String str3, String str4, String str5, String str6, String str7, long j2, String str8, String str9, int i2, k kVar) {
            String str10;
            if ((i2 & 1) != 0) {
                String uuid = UUID.randomUUID().toString();
                t.f(uuid, "randomUUID().toString()");
                str10 = uuid;
            } else {
                str10 = str;
            }
            this(str10, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? AdEventType.REVENUE : adEventType, (i2 & 8) != 0 ? System.currentTimeMillis() : j, str2, str3, str4, str5, str6, str7, j2, str8, str9, null);
        }
    }

    static /* synthetic */ boolean access$isPriorityEvent$jd(AdEvent adEvent) {
        return super.isPriorityEvent();
    }

    String getAdFormat-y0COY5Q();

    String getAdUnitId();

    int getEventVersion();

    String getId();

    String getImpressionId();

    String getMediatorName-GyoM_N4();

    String getNetworkName();

    String getPlacement();

    long getTimestamp();

    AdEventType getType();
}
