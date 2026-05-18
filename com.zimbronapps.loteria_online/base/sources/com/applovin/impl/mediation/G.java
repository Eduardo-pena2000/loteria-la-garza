package com.applovin.impl.mediation;

import android.text.TextUtils;
import com.applovin.impl.k3;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class g {
    private final com.applovin.impl.sdk.k b;
    private final com.applovin.impl.sdk.o c;
    private final Map a = Collections.synchronizedMap(new HashMap(16));
    private final Object d = new Object();
    private final Map e = new HashMap();
    private final Set f = new HashSet();
    private final Object g = new Object();
    private final Set h = new HashSet();

    public static class a {
        private final String a;
        private final String b;
        private final MaxAdFormat c;
        private final JSONObject d;

        public a(String str, String str2, y2 y2Var, com.applovin.impl.sdk.k kVar) {
            this.a = str;
            this.b = str2;
            JSONObject jSONObject = new JSONObject();
            this.d = jSONObject;
            JsonUtils.putString(jSONObject, "class", str);
            JsonUtils.putString(jSONObject, "operation", str2);
            if (y2Var == null) {
                this.c = null;
            } else {
                this.c = y2Var.getFormat();
                JsonUtils.putString(jSONObject, "format", y2Var.getFormat().getLabel());
            }
        }

        public JSONObject a() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.a.equals(aVar.a) || !this.b.equals(aVar.b)) {
                return false;
            }
            MaxAdFormat maxAdFormat = this.c;
            MaxAdFormat maxAdFormat2 = aVar.c;
            return maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2);
        }

        public int hashCode() {
            int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
            MaxAdFormat maxAdFormat = this.c;
            return hashCode + (maxAdFormat != null ? maxAdFormat.hashCode() : 0);
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.a + "', operationTag='" + this.b + "', format=" + this.c + '}';
        }
    }

    public g(com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.b = kVar;
        this.c = kVar.O();
    }

    public Collection a() {
        ArrayList arrayList;
        synchronized (this.g) {
            try {
                arrayList = new ArrayList(this.h.size());
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    arrayList.add(((a) it.next()).a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public Collection b() {
        Set unmodifiableSet;
        synchronized (this.d) {
            unmodifiableSet = Collections.unmodifiableSet(this.f);
        }
        return unmodifiableSet;
    }

    public Collection c() {
        Set unmodifiableSet;
        synchronized (this.d) {
            try {
                HashSet hashSet = new HashSet(this.e.size());
                Iterator it = this.e.values().iterator();
                while (it.hasNext()) {
                    hashSet.add(((Class) it.next()).getName());
                }
                unmodifiableSet = Collections.unmodifiableSet(hashSet);
            } catch (Throwable th) {
                throw th;
            }
        }
        return unmodifiableSet;
    }

    public h a(k3 k3Var) {
        return a(k3Var, false);
    }

    public h a(k3 k3Var, boolean z) {
        Class a2;
        h hVar;
        if (k3Var != null) {
            String c = k3Var.c();
            String b = k3Var.b();
            if (TextUtils.isEmpty(c)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.c.b("MediationAdapterManager", "No adapter name provided for " + b + ", not loading the adapter ");
                }
                return null;
            }
            if (TextUtils.isEmpty(b)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.c.b("MediationAdapterManager", "Unable to find default className for '" + c + "'");
                }
                return null;
            }
            if (z && (hVar = (h) this.a.get(b)) != null) {
                return hVar;
            }
            synchronized (this.d) {
                try {
                    if (!this.f.contains(b)) {
                        if (this.e.containsKey(b)) {
                            a2 = (Class) this.e.get(b);
                        } else {
                            a2 = a(b);
                            if (a2 == null) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.c.k("MediationAdapterManager", "Adapter " + c + " could not be loaded, class " + b + " not found");
                                }
                                this.f.add(b);
                                return null;
                            }
                        }
                        h a3 = a(k3Var, a2, z);
                        if (a3 != null) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.c.a("MediationAdapterManager", "Loaded " + c);
                            }
                            this.e.put(b, a2);
                            if (z) {
                                this.a.put(k3Var.b(), a3);
                            }
                            return a3;
                        }
                        if (com.applovin.impl.sdk.o.a()) {
                            this.c.b("MediationAdapterManager", "Failed to load " + c);
                        }
                        this.f.add(b);
                        return null;
                    }
                    if (com.applovin.impl.sdk.o.a()) {
                        this.c.a("MediationAdapterManager", "Not attempting to load " + c + " due to prior errors");
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException("No adapter spec specified");
    }

    public void a(String str, String str2, y2 y2Var) {
        synchronized (this.g) {
            try {
                this.b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.b.O().b("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
                }
                this.h.add(new a(str, str2, y2Var, this.b));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private h a(k3 k3Var, Class cls, boolean z) {
        try {
            return new h(k3Var, (MediationAdapterBase) cls.getConstructor(new Class[]{AppLovinSdk.class}).newInstance(new Object[]{this.b.y0()}), z, this.b);
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("MediationAdapterManager", "Failed to load adapter: " + k3Var, th);
            return null;
        }
    }

    private Class a(String str) {
        try {
            Class cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return cls.asSubclass(MaxAdapter.class);
            }
            com.applovin.impl.sdk.o.h("MediationAdapterManager", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
