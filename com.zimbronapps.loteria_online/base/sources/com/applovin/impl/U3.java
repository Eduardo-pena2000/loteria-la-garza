package com.applovin.impl;

import com.applovin.impl.s3;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t3;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class u3 {
    private static final HashMap d = new HashMap();
    private static final Object e = new Object();
    private static final HashMap f = new HashMap();
    private static final Object g = new Object();
    private static final HashMap h = new LinkedHashMap();
    private static final Object i = new Object();
    private final com.applovin.impl.sdk.k a;
    private final JSONObject b = a(r3.r8);
    private final JSONObject c = a(r3.q8);

    public u3(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        a((String) a5.a(z4.K, (Object) null, com.applovin.impl.sdk.k.o()), t3.a.AD_UNIT_ID);
        a((String) a5.a(z4.L, (Object) null, com.applovin.impl.sdk.k.o()), t3.a.AD_FORMAT);
    }

    private static /* synthetic */ Long a(Long l, Long l2) {
        return l;
    }

    public static /* synthetic */ Long b(Long l) {
        return a(l);
    }

    public static /* synthetic */ Long c(Long l, Long l2) {
        return a(l, l2);
    }

    private JSONObject a(x4 x4Var) {
        return JsonUtils.jsonObjectFromJsonString((String) this.a.a(x4Var), new JSONObject());
    }

    private Map b(s3 s3Var, t3 t3Var, s3.b bVar) {
        if (!a(s3Var, t3Var, bVar) || !b(s3Var, t3Var)) {
            return null;
        }
        String b = t3Var.b();
        HashMap a = a(t3Var.a());
        Object b2 = b(t3Var.a());
        HashMap hashMap = new HashMap();
        synchronized (b2) {
            try {
                if (t3Var instanceof q3) {
                    a((q3) t3Var, (Map) a);
                }
                HashMap hashMap2 = (HashMap) a.get(b);
                if (hashMap2 == null) {
                    hashMap2 = new HashMap();
                    a.put(b, hashMap2);
                }
                Iterator it = s3Var.b().iterator();
                while (it.hasNext()) {
                    String b3 = ((s3.a) it.next()).b();
                    HashMap hashMap3 = (HashMap) hashMap2.get(b3);
                    if (hashMap3 == null) {
                        hashMap3 = new HashMap();
                        hashMap2.put(b3, hashMap3);
                    }
                    Object a2 = bVar.a(hashMap3.get(s3Var));
                    hashMap3.put(s3Var, a2);
                    hashMap.put(b3, a2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Boolean bool = (Boolean) this.a.a(r3.t8);
        if (s3Var.a(s3.a.INSTALL) && bool.booleanValue()) {
            b(t3Var);
        }
        return hashMap;
    }

    private z4 c(t3.a aVar) {
        if (aVar == t3.a.AD_UNIT_ID) {
            return z4.K;
        }
        if (aVar == t3.a.AD_FORMAT) {
            return z4.L;
        }
        return null;
    }

    public Map a(s3 s3Var, t3 t3Var) {
        return b(s3Var, t3Var, new H6());
    }

    private static /* synthetic */ Long a(Long l) {
        return Long.valueOf(l != null ? 1 + l.longValue() : 1L);
    }

    public void a(s3 s3Var, t3 t3Var, Long l) {
        b(s3Var, t3Var, new G6(l));
    }

    public Map a(s3 s3Var, t3.a aVar) {
        return a(s3Var, aVar, s3.a.SESSION);
    }

    private Map a(s3 s3Var, t3.a aVar, s3.a aVar2) {
        HashMap a = a(aVar);
        Object b = b(aVar);
        HashMap hashMap = new HashMap();
        synchronized (b) {
            try {
                for (String str : a.keySet()) {
                    HashMap hashMap2 = (HashMap) a.get(str);
                    String b2 = aVar2.b();
                    if (hashMap2 != null && hashMap2.containsKey(b2)) {
                        HashMap hashMap3 = (HashMap) hashMap2.get(b2);
                        if (aVar == t3.a.AD) {
                            hashMap.put(j3.a(str).b(), hashMap3.get(s3Var));
                        } else {
                            hashMap.put(str, hashMap3.get(s3Var));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashMap;
    }

    private void a(q3 q3Var, Map map) {
        MaxAdFormat a = q3Var.c().a();
        Integer integer = JsonUtils.getInteger(this.c, a.getLabel(), null);
        if (integer == null) {
            return;
        }
        Iterator it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (j3.a((String) it.next()).a().equals(a)) {
                i2++;
            }
        }
        if (i2 < integer.intValue()) {
            return;
        }
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext() && i2 >= integer.intValue()) {
            if (j3.a((String) ((Map.Entry) it2.next()).getKey()).a().equals(a)) {
                it2.remove();
                i2--;
            }
        }
    }

    private Object b(t3.a aVar) {
        if (aVar == t3.a.AD_UNIT_ID) {
            return e;
        }
        if (aVar == t3.a.AD_FORMAT) {
            return g;
        }
        return i;
    }

    private boolean b(s3 s3Var, t3 t3Var) {
        Iterator keys = this.b.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            if (str.equals(t3Var.a().toString().toLowerCase()) && JsonUtils.valueExists(JsonUtils.getJSONArray(this.b, str, new JSONArray()), s3Var.a())) {
                return false;
            }
        }
        return true;
    }

    private HashMap a(t3.a aVar) {
        if (aVar == t3.a.AD_UNIT_ID) {
            return d;
        }
        if (aVar == t3.a.AD_FORMAT) {
            return f;
        }
        return h;
    }

    private void b(t3 t3Var) {
        z4 c = c(t3Var.a());
        if (c == null) {
            return;
        }
        a5.b(c, a((Map) a(t3Var)), com.applovin.impl.sdk.k.o());
    }

    private boolean a(s3 s3Var, t3 t3Var, s3.b bVar) {
        if (s3Var == null) {
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().b("MediationStatsManager", "Failed to update stat, no stat provided");
            }
            return false;
        }
        if (t3Var == null) {
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().b("MediationStatsManager", "Failed to update stat, no dimension key provided");
            }
            return false;
        }
        if (bVar != null) {
            return true;
        }
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().b("MediationStatsManager", "Failed to update stat, no stat updater provided");
        }
        return false;
    }

    private HashMap a(t3 t3Var) {
        HashMap hashMap = new HashMap();
        HashMap a = a(t3Var.a());
        synchronized (b(t3Var.a())) {
            try {
                for (Map.Entry entry : a.entrySet()) {
                    String str = (String) entry.getKey();
                    HashMap hashMap2 = (HashMap) entry.getValue();
                    if (!CollectionUtils.isEmpty((Map) hashMap2)) {
                        HashMap hashMap3 = (HashMap) hashMap2.get(s3.a.INSTALL.b());
                        if (!CollectionUtils.isEmpty((Map) hashMap3)) {
                            hashMap.put(str, new HashMap(hashMap3));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashMap;
    }

    private String a(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry2 : ((HashMap) entry.getValue()).entrySet()) {
                s3 s3Var = (s3) entry2.getKey();
                Object value = entry2.getValue();
                if (value != null) {
                    JsonUtils.putObject(jSONObject2, s3Var.toString(), value);
                }
            }
            JsonUtils.putJSONObject(jSONObject, (String) entry.getKey(), jSONObject2);
        }
        return jSONObject.toString();
    }

    private void a(String str, t3.a aVar) {
        if (StringUtils.isValidString(str)) {
            HashMap a = a(aVar);
            Object b = b(aVar);
            Map stringObjectMap = JsonUtils.toStringObjectMap(str);
            synchronized (b) {
                try {
                    for (Map.Entry entry : stringObjectMap.entrySet()) {
                        String str2 = (String) entry.getKey();
                        HashMap hashMap = new HashMap();
                        for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                            s3 a2 = s3.a((String) entry2.getKey());
                            if (a2 != null) {
                                hashMap.put(a2, a(entry2.getValue()));
                            }
                        }
                        if (!CollectionUtils.isEmpty((Map) hashMap)) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put(s3.a.INSTALL.b(), hashMap);
                            a.put(str2, hashMap2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private Object a(Object obj) {
        return obj instanceof Integer ? Long.valueOf(((Integer) obj).longValue()) : obj;
    }
}
