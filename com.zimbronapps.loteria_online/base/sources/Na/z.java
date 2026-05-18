package na;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.d;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class z {
    public static FirebaseMessaging a(Map map) {
        return FirebaseMessaging.r();
    }

    public static com.google.firebase.messaging.d b(Map map) {
        Object obj = map.get("message");
        Objects.requireNonNull(obj);
        Map map2 = (Map) obj;
        Object obj2 = map2.get("to");
        Objects.requireNonNull(obj2);
        d.b bVar = new d.b((String) obj2);
        String str = (String) map2.get("collapseKey");
        String str2 = (String) map2.get("messageId");
        String str3 = (String) map2.get("messageType");
        Integer num = (Integer) map2.get("ttl");
        Map map3 = (Map) map2.get("data");
        if (str != null) {
            bVar.b(str);
        }
        if (str3 != null) {
            bVar.e(str3);
        }
        if (str2 != null) {
            bVar.d(str2);
        }
        if (num != null) {
            bVar.f(num.intValue());
        }
        if (map3 != null) {
            bVar.c(map3);
        }
        return bVar.a();
    }

    public static Map c(Map map) {
        Object obj = map.get("message");
        Objects.requireNonNull(obj);
        Map map2 = (Map) obj;
        if (map2.get("notification") == null) {
            return null;
        }
        return (Map) map2.get("notification");
    }

    public static boolean d(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if ((keyguardManager != null && keyguardManager.isKeyguardLocked()) || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        String packageName = context.getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                return true;
            }
        }
        return false;
    }

    public static Map e(d.c cVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (cVar.p() != null) {
            hashMap.put("title", cVar.p());
        }
        if (cVar.r() != null) {
            hashMap.put("titleLocKey", cVar.r());
        }
        if (cVar.q() != null) {
            hashMap.put("titleLocArgs", Arrays.asList(cVar.q()));
        }
        if (cVar.a() != null) {
            hashMap.put("body", cVar.a());
        }
        if (cVar.c() != null) {
            hashMap.put("bodyLocKey", cVar.c());
        }
        if (cVar.b() != null) {
            hashMap.put("bodyLocArgs", Arrays.asList(cVar.b()));
        }
        if (cVar.d() != null) {
            hashMap2.put("channelId", cVar.d());
        }
        if (cVar.e() != null) {
            hashMap2.put("clickAction", cVar.e());
        }
        if (cVar.f() != null) {
            hashMap2.put("color", cVar.f());
        }
        if (cVar.g() != null) {
            hashMap2.put("smallIcon", cVar.g());
        }
        if (cVar.h() != null) {
            hashMap2.put("imageUrl", cVar.h().toString());
        }
        if (cVar.i() != null) {
            hashMap2.put("link", cVar.i().toString());
        }
        if (cVar.k() != null) {
            hashMap2.put("count", cVar.k());
        }
        if (cVar.l() != null) {
            hashMap2.put("priority", cVar.l());
        }
        if (cVar.m() != null) {
            hashMap2.put("sound", cVar.m());
        }
        if (cVar.o() != null) {
            hashMap2.put("ticker", cVar.o());
        }
        if (cVar.s() != null) {
            hashMap2.put("visibility", cVar.s());
        }
        if (cVar.n() != null) {
            hashMap2.put("tag", cVar.n());
        }
        hashMap.put("android", hashMap2);
        return hashMap;
    }

    public static Map f(com.google.firebase.messaging.d dVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (dVar.M1() != null) {
            hashMap.put("collapseKey", dVar.M1());
        }
        if (dVar.O1() != null) {
            hashMap.put("from", dVar.O1());
        }
        if (dVar.V1() != null) {
            hashMap.put("to", dVar.V1());
        }
        if (dVar.P1() != null) {
            hashMap.put("messageId", dVar.P1());
        }
        if (dVar.R1() != null) {
            hashMap.put("messageType", dVar.R1());
        }
        if (!dVar.N1().isEmpty()) {
            for (Map.Entry entry : dVar.N1().entrySet()) {
                hashMap2.put((String) entry.getKey(), entry.getValue());
            }
        }
        hashMap.put("data", hashMap2);
        hashMap.put("ttl", Integer.valueOf(dVar.W1()));
        hashMap.put("sentTime", Long.valueOf(dVar.U1()));
        if (dVar.S1() != null) {
            hashMap.put("notification", e(dVar.S1()));
        }
        return hashMap;
    }
}
