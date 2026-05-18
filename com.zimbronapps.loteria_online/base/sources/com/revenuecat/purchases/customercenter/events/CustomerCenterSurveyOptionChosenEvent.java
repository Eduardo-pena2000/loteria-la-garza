package com.revenuecat.purchases.customercenter.events;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.common.events.FeatureEvent;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import java.util.Date;
import java.util.UUID;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import tb.b;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomerCenterSurveyOptionChosenEvent implements FeatureEvent {
    public static final Companion Companion = new Companion(null);
    private static final b.a json = b.d;
    private final CreationData creationData;
    private final Data data;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ void getJson$purchases_defaultsBc8Release$annotations() {
        }

        public final b.a getJson$purchases_defaultsBc8Release() {
            return CustomerCenterSurveyOptionChosenEvent.access$getJson$cp();
        }

        private Companion() {
        }
    }

    @InternalRevenueCatAPI
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

    public CustomerCenterSurveyOptionChosenEvent(CreationData creationData, Data data) {
        t.g(creationData, "creationData");
        t.g(data, "data");
        this.creationData = creationData;
        this.data = data;
    }

    public static final /* synthetic */ b.a access$getJson$cp() {
        return json;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerCenterSurveyOptionChosenEvent)) {
            return false;
        }
        CustomerCenterSurveyOptionChosenEvent customerCenterSurveyOptionChosenEvent = (CustomerCenterSurveyOptionChosenEvent) obj;
        return t.c(this.creationData, customerCenterSurveyOptionChosenEvent.creationData) && t.c(this.data, customerCenterSurveyOptionChosenEvent.data);
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
        return "CustomerCenterSurveyOptionChosenEvent(creationData=" + this.creationData + ", data=" + this.data + ')';
    }

    public /* synthetic */ CustomerCenterSurveyOptionChosenEvent(CreationData creationData, Data data, int i, k kVar) {
        this((i & 1) != 0 ? new CreationData(null, null, 3, null) : creationData, data);
    }

    @InternalRevenueCatAPI
    public static final class Data {
        private final String additionalContext;
        private final boolean darkMode;
        private final CustomerCenterDisplayMode displayMode;
        private final String locale;
        private final CustomerCenterConfigData.HelpPath.PathType path;
        private final int revisionID;
        private final String surveyOptionID;
        private final Date timestamp;
        private final CustomerCenterEventType type;
        private final String url;
        private final int version;

        public Data(Date date, boolean z, String str, int i, int i2, CustomerCenterDisplayMode customerCenterDisplayMode, CustomerCenterConfigData.HelpPath.PathType pathType, String str2, String str3, String str4) {
            t.g(date, "timestamp");
            t.g(str, "locale");
            t.g(customerCenterDisplayMode, "displayMode");
            t.g(pathType, "path");
            t.g(str3, "surveyOptionID");
            this.timestamp = date;
            this.darkMode = z;
            this.locale = str;
            this.version = i;
            this.revisionID = i2;
            this.displayMode = customerCenterDisplayMode;
            this.path = pathType;
            this.url = str2;
            this.surveyOptionID = str3;
            this.additionalContext = str4;
            this.type = CustomerCenterEventType.SURVEY_OPTION_CHOSEN;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return t.c(this.timestamp, data.timestamp) && this.darkMode == data.darkMode && t.c(this.locale, data.locale) && this.version == data.version && this.revisionID == data.revisionID && this.displayMode == data.displayMode && this.path == data.path && t.c(this.url, data.url) && t.c(this.surveyOptionID, data.surveyOptionID) && t.c(this.additionalContext, data.additionalContext);
        }

        public final String getAdditionalContext() {
            return this.additionalContext;
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

        public final CustomerCenterConfigData.HelpPath.PathType getPath() {
            return this.path;
        }

        public final int getRevisionID() {
            return this.revisionID;
        }

        public final String getSurveyOptionID() {
            return this.surveyOptionID;
        }

        public final Date getTimestamp() {
            return this.timestamp;
        }

        public final CustomerCenterEventType getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            int hashCode = ((((((((((((this.timestamp.hashCode() * 31) + Boolean.hashCode(this.darkMode)) * 31) + this.locale.hashCode()) * 31) + this.version) * 31) + this.revisionID) * 31) + this.displayMode.hashCode()) * 31) + this.path.hashCode()) * 31;
            String str = this.url;
            int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.surveyOptionID.hashCode()) * 31;
            String str2 = this.additionalContext;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Data(timestamp=" + this.timestamp + ", darkMode=" + this.darkMode + ", locale=" + this.locale + ", version=" + this.version + ", revisionID=" + this.revisionID + ", displayMode=" + this.displayMode + ", path=" + this.path + ", url=" + this.url + ", surveyOptionID=" + this.surveyOptionID + ", additionalContext=" + this.additionalContext + ')';
        }

        public /* synthetic */ Data(Date date, boolean z, String str, int i, int i2, CustomerCenterDisplayMode customerCenterDisplayMode, CustomerCenterConfigData.HelpPath.PathType pathType, String str2, String str3, String str4, int i3, k kVar) {
            this(date, z, str, (i3 & 8) != 0 ? 1 : i, (i3 & 16) != 0 ? 1 : i2, (i3 & 32) != 0 ? CustomerCenterDisplayMode.FULL_SCREEN : customerCenterDisplayMode, pathType, str2, str3, (i3 & 512) != 0 ? null : str4);
        }
    }
}
