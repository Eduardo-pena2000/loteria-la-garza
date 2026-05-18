package com.revenuecat.purchases.common.diagnostics;

import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.utils.Event;
import com.revenuecat.purchases.utils.Iso8601Utils;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DiagnosticsEntry implements Event {

    @Deprecated
    public static final String APP_SESSION_ID_KEY = "app_session_id";
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String ID_KEY = "id";

    @Deprecated
    public static final String NAME_KEY = "name";

    @Deprecated
    public static final String PROPERTIES_KEY = "properties";

    @Deprecated
    public static final String TIMESTAMP_KEY = "timestamp";

    @Deprecated
    public static final int VERSION = 1;

    @Deprecated
    public static final String VERSION_KEY = "version";
    private final UUID appSessionID;
    private final DateProvider dateProvider;
    private final Date dateTime;
    private final UUID id;
    private final DiagnosticsEntryName name;
    private final Map properties;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public DiagnosticsEntry(UUID uuid, DiagnosticsEntryName diagnosticsEntryName, Map map, UUID uuid2, DateProvider dateProvider, Date date) {
        t.g(uuid, "id");
        t.g(diagnosticsEntryName, "name");
        t.g(map, "properties");
        t.g(uuid2, "appSessionID");
        t.g(dateProvider, "dateProvider");
        t.g(date, "dateTime");
        this.id = uuid;
        this.name = diagnosticsEntryName;
        this.properties = map;
        this.appSessionID = uuid2;
        this.dateProvider = dateProvider;
        this.dateTime = date;
    }

    public static /* synthetic */ DiagnosticsEntry copy$default(DiagnosticsEntry diagnosticsEntry, UUID uuid, DiagnosticsEntryName diagnosticsEntryName, Map map, UUID uuid2, DateProvider dateProvider, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = diagnosticsEntry.id;
        }
        if ((i & 2) != 0) {
            diagnosticsEntryName = diagnosticsEntry.name;
        }
        DiagnosticsEntryName diagnosticsEntryName2 = diagnosticsEntryName;
        if ((i & 4) != 0) {
            map = diagnosticsEntry.properties;
        }
        Map map2 = map;
        if ((i & 8) != 0) {
            uuid2 = diagnosticsEntry.appSessionID;
        }
        UUID uuid3 = uuid2;
        if ((i & 16) != 0) {
            dateProvider = diagnosticsEntry.dateProvider;
        }
        DateProvider dateProvider2 = dateProvider;
        if ((i & 32) != 0) {
            date = diagnosticsEntry.dateTime;
        }
        return diagnosticsEntry.copy(uuid, diagnosticsEntryName2, map2, uuid3, dateProvider2, date);
    }

    private final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.id);
        jSONObject.put("version", 1);
        String lowerCase = this.name.name().toLowerCase(Locale.ROOT);
        t.f(lowerCase, "toLowerCase(...)");
        jSONObject.put("name", lowerCase);
        jSONObject.put("properties", new JSONObject(this.properties));
        jSONObject.put("app_session_id", this.appSessionID);
        jSONObject.put("timestamp", Iso8601Utils.format(this.dateTime));
        return jSONObject;
    }

    public final UUID component1() {
        return this.id;
    }

    public final DiagnosticsEntryName component2() {
        return this.name;
    }

    public final Map component3() {
        return this.properties;
    }

    public final UUID component4() {
        return this.appSessionID;
    }

    public final DateProvider component5() {
        return this.dateProvider;
    }

    public final Date component6() {
        return this.dateTime;
    }

    public final DiagnosticsEntry copy(UUID uuid, DiagnosticsEntryName diagnosticsEntryName, Map map, UUID uuid2, DateProvider dateProvider, Date date) {
        t.g(uuid, "id");
        t.g(diagnosticsEntryName, "name");
        t.g(map, "properties");
        t.g(uuid2, "appSessionID");
        t.g(dateProvider, "dateProvider");
        t.g(date, "dateTime");
        return new DiagnosticsEntry(uuid, diagnosticsEntryName, map, uuid2, dateProvider, date);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiagnosticsEntry)) {
            return false;
        }
        DiagnosticsEntry diagnosticsEntry = (DiagnosticsEntry) obj;
        return t.c(this.id, diagnosticsEntry.id) && this.name == diagnosticsEntry.name && t.c(this.properties, diagnosticsEntry.properties) && t.c(this.appSessionID, diagnosticsEntry.appSessionID) && t.c(this.dateProvider, diagnosticsEntry.dateProvider) && t.c(this.dateTime, diagnosticsEntry.dateTime);
    }

    public final UUID getAppSessionID() {
        return this.appSessionID;
    }

    public final DateProvider getDateProvider() {
        return this.dateProvider;
    }

    public final Date getDateTime() {
        return this.dateTime;
    }

    public final UUID getId() {
        return this.id;
    }

    public final DiagnosticsEntryName getName() {
        return this.name;
    }

    public final Map getProperties() {
        return this.properties;
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.properties.hashCode()) * 31) + this.appSessionID.hashCode()) * 31) + this.dateProvider.hashCode()) * 31) + this.dateTime.hashCode();
    }

    public String toString() {
        String jSONObject = toJSONObject().toString();
        t.f(jSONObject, "toJSONObject().toString()");
        return jSONObject;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DiagnosticsEntry(UUID uuid, DiagnosticsEntryName diagnosticsEntryName, Map map, UUID uuid2, DateProvider dateProvider, Date date, int i, k kVar) {
        if ((i & 1) != 0) {
            uuid = UUID.randomUUID();
            t.f(uuid, "randomUUID()");
        }
        UUID uuid3 = uuid;
        DateProvider defaultDateProvider = (i & 16) != 0 ? new DefaultDateProvider() : dateProvider;
        this(uuid3, diagnosticsEntryName, map, uuid2, defaultDateProvider, (i & 32) != 0 ? defaultDateProvider.getNow() : date);
    }
}
