package com.applovin.impl.sdk;

import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.f2;
import com.applovin.impl.i5;
import com.applovin.impl.o7;
import com.applovin.impl.q4;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinAdType;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class c {
    private static final File b = new File(k.o().getFilesDir(), "al/persisted-ads");
    private final k a;

    public static class a implements q4 {
        private final String a;
        private final AppLovinAdType b;
        private final boolean c;
        private final long d;
        private final long e;

        public a(String str, AppLovinAdType appLovinAdType, boolean z, long j, long j2) {
            this.a = str;
            this.b = appLovinAdType;
            this.c = z;
            this.d = j;
            this.e = j2;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public long b() {
            return this.e;
        }

        public long c() {
            return this.d;
        }

        public String d() {
            return this.a + "_" + this.b;
        }

        public String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this)) {
                return false;
            }
            String e = e();
            String e2 = aVar.e();
            if (e != null ? !e.equals(e2) : e2 != null) {
                return false;
            }
            AppLovinAdType f = f();
            AppLovinAdType f2 = aVar.f();
            return f != null ? f.equals(f2) : f2 == null;
        }

        public AppLovinAdType f() {
            return this.b;
        }

        public boolean g() {
            return this.c;
        }

        public int hashCode() {
            String e = e();
            int hashCode = e == null ? 43 : e.hashCode();
            AppLovinAdType f = f();
            return ((hashCode + 59) * 59) + (f != null ? f.hashCode() : 43);
        }

        public String toString() {
            return "AdPersistenceFileService.PersistedAdFilePath(id=" + e() + ", type=" + f() + ", isAdServerAd=" + g() + ", expiryTimeMillis=" + c() + ", appLaunchTimestamp=" + b() + ")";
        }

        public static a a(com.applovin.impl.sdk.ad.b bVar) {
            return a(bVar, 0L, 0L);
        }

        public static a a(com.applovin.impl.sdk.ad.b bVar, long j, long j2) {
            if (bVar == null) {
                return null;
            }
            return new a(StringUtils.isValidString(bVar.getMediationServeId()) ? bVar.getMediationServeId() : UUID.randomUUID().toString(), bVar.getType(), bVar instanceof com.applovin.impl.sdk.ad.a, SystemClock.elapsedRealtime() + j, j2);
        }

        public static a a(JSONObject jSONObject, k kVar) {
            String string = JsonUtils.getString(jSONObject, "id", "");
            String string2 = JsonUtils.getString(jSONObject, "type", "");
            Boolean bool = JsonUtils.getBoolean(jSONObject, "is_ad_server_ad", null);
            long j = JsonUtils.getLong(jSONObject, "expiry_time_millis", 0L);
            long j2 = JsonUtils.getLong(jSONObject, "app_launch_timestamp", 0L);
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || bool == null) {
                return null;
            }
            return new a(string, AppLovinAdType.fromString(string2), bool.booleanValue(), j, j2);
        }

        public JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, "id", this.a);
            JsonUtils.putString(jSONObject, "type", this.b.toString());
            JsonUtils.putBoolean(jSONObject, "is_ad_server_ad", this.c);
            JsonUtils.putLong(jSONObject, "expiry_time_millis", this.d);
            JsonUtils.putLong(jSONObject, "app_launch_timestamp", this.e);
            return jSONObject;
        }
    }

    public interface b {
        void a(a aVar);
    }

    public interface c {
        void a(com.applovin.impl.sdk.ad.b bVar, String str);
    }

    public c(k kVar) {
        this.a = kVar;
    }

    public static /* synthetic */ void a(c cVar, com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        cVar.a(bVar, bVar2);
    }

    public static /* synthetic */ void b(c cVar, File file, c cVar2, a aVar) {
        cVar.a(file, cVar2, aVar);
    }

    private /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        a a2 = a.a(bVar, ((Long) this.a.a(x4.Z0)).longValue(), k.n());
        File a3 = a(a2);
        if (a3 == null) {
            a("Could not persist incompatible ad", bVar, bVar2);
            return;
        }
        try {
            JSONObject a4 = bVar.a();
            if (a4 == null) {
                a("Could not serialize ad for persistence", bVar, bVar2);
                return;
            }
            if (this.a.G().a(new ByteArrayInputStream(a4.toString().getBytes("UTF-8")), a3, true)) {
                a(a2, bVar, bVar2);
            } else {
                a("Failed to write persisted ad to disk", bVar, bVar2);
            }
        } catch (Throwable th) {
            a("Ad could not be persisted", bVar, bVar2);
            this.a.D().a("AdPersistenceFileService", th, CollectionUtils.map("error_message", "Ad could not be persisted"));
        }
    }

    public void b(com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        if (b()) {
            this.a.q0().a((i5) new r6(this.a, "persistAd", new A(this, bVar, bVar2)), d6.b.CACHING);
        } else {
            a("Ad Persistence directory could not be created", bVar, bVar2);
        }
    }

    private boolean b() {
        File file = b;
        if (file.exists()) {
            return true;
        }
        return file.mkdir();
    }

    public void b(a aVar) {
        File a2 = a(aVar);
        if (a2 != null) {
            a2.delete();
        }
    }

    public void a(a aVar, c cVar) {
        File a2 = a(aVar);
        if (a2 != null && a2.exists()) {
            this.a.q0().a((i5) new r6(this.a, "retrievePersistedAd", new B(this, a2, cVar, aVar)), d6.b.OTHER);
        } else {
            cVar.a(null, "Persisted ad could not be retrieved: Retrieval failed");
        }
    }

    private /* synthetic */ void a(File file, c cVar, a aVar) {
        com.applovin.impl.sdk.ad.b a2;
        String f = this.a.G().f(file);
        if (f == null) {
            cVar.a(null, "Persisted ad could not be retrieved: Read failed");
            return;
        }
        try {
            JSONObject jsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(f, new JSONObject());
            JsonUtils.putBoolean(JsonUtils.getJSONObject(jsonObjectFromJsonString, "full_response", new JSONObject()), "is_persisted_ad", true);
            if (aVar.g()) {
                a2 = com.applovin.impl.sdk.ad.a.a(jsonObjectFromJsonString, this.a);
            } else {
                a2 = o7.a(jsonObjectFromJsonString, this.a);
            }
            if (a2 == null) {
                cVar.a(null, "Persisted ad could not be retrieved: Deserialization failed");
            } else {
                cVar.a(a2, null);
            }
        } catch (Throwable th) {
            cVar.a(null, "Persisted ad could not be retrieved: Deserialization failed");
            this.a.D().a("AdPersistenceFileService", th, CollectionUtils.map("error_message", "Persisted ad could not be retrieved: Deserialization failed"));
        }
    }

    private File a(a aVar) {
        if (aVar == null) {
            return null;
        }
        return new File(b.getAbsolutePath() + "/" + aVar.d());
    }

    private void a(a aVar, com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        if (bVar2 == null) {
            return;
        }
        this.a.O();
        if (o.a()) {
            this.a.O().a("AdPersistenceFileService", "Ad was persisted successfully");
        }
        bVar2.a(aVar);
        this.a.g().a(d2.U, bVar);
    }

    private void a(String str, com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        if (bVar2 == null) {
            return;
        }
        this.a.O();
        if (o.a()) {
            this.a.O().a("AdPersistenceFileService", str);
        }
        bVar2.a(null);
        Map a2 = f2.a((AppLovinAdImpl) bVar);
        CollectionUtils.putStringIfValid("error_message", str, a2);
        this.a.g().d(d2.V, a2);
    }

    public void a(List list) {
        File[] listFiles = b.listFiles();
        if (listFiles == null) {
            return;
        }
        boolean z = false;
        for (File file : listFiles) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((a) it.next()).d().equals(file.getName())) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z) {
                file.delete();
            }
        }
    }

    public void a() {
        File[] listFiles;
        File file = b;
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                file2.delete();
            }
        }
    }
}
