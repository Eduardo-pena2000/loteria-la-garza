package com.applovin.impl.sdk.network;

import android.text.TextUtils;
import com.applovin.impl.i5;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.o;
import com.applovin.impl.x4;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class c extends i5 {
    private final b g;
    private final o h;
    private AtomicBoolean i;
    private boolean j;

    public c(b bVar, k kVar) {
        super("PersistentPostbackQueueSaveTask", kVar);
        this.i = new AtomicBoolean();
        this.j = false;
        this.g = bVar;
        this.h = kVar.O();
    }

    public List a(int i) {
        ArrayList arrayList = new ArrayList();
        m G = this.a.G();
        if (!G.b("persistent_postback_cache.json", k.o())) {
            o.h("PersistentPostbackQueueSaveTask", "Postbacks queue file does not exist.");
            return arrayList;
        }
        File a = G.a("persistent_postback_cache.json", k.o());
        String f = G.f(a);
        if (TextUtils.isEmpty(f)) {
            o.h("PersistentPostbackQueueSaveTask", "Postbacks queue file has no content.");
            return arrayList;
        }
        boolean z = false;
        try {
            JSONArray jSONArray = new JSONObject(f).getJSONArray("pb");
            if (o.a()) {
                this.h.a("PersistentPostbackQueueSaveTask", "Deserializing " + jSONArray.length() + " postback(s)...");
            }
            arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
            Integer num = (Integer) this.a.a(x4.I2);
            for (int i2 = 0; i2 < jSONArray.length() && arrayList.size() < i; i2++) {
                try {
                    d dVar = new d(jSONArray.getJSONObject(i2), this.a);
                    if (dVar.c() < num.intValue()) {
                        arrayList.add(dVar);
                    } else {
                        o.h("PersistentPostbackQueueSaveTask", "Skipping deserialization because maximum attempt count exceeded for postback: " + dVar);
                    }
                } catch (Throwable th) {
                    o.c("PersistentPostbackQueueSaveTask", "Unable to deserialize postback from json", th);
                    this.a.D().a("PersistentPostbackQueueSaveTask", "deserializePostback", th);
                }
            }
            if (o.a()) {
                this.h.a("PersistentPostbackQueueSaveTask", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
            }
        } catch (Throwable th2) {
            try {
                o.c("PersistentPostbackQueueSaveTask", "Failed to load postback queue", th2);
                try {
                    this.a.D().a("PersistentPostbackQueueSaveTask", "deserializePostbackQueue", th2);
                    if (((Boolean) this.a.a(x4.N0)).booleanValue()) {
                        G.a(a, "removeAfterDeserializationFail");
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z = true;
                    if (z && ((Boolean) this.a.a(x4.N0)).booleanValue()) {
                        G.a(a, "removeAfterDeserializationFail");
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        this.j = arrayList.isEmpty();
        return arrayList;
    }

    public void run() {
        a(this.g.d());
    }

    private void a(List list) {
        if (!(this.j && list.isEmpty()) && this.i.compareAndSet(false, true)) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                try {
                    jSONArray.put(dVar.q());
                } catch (Throwable th) {
                    o.c("PersistentPostbackQueueSaveTask", "Unable to serialize postback to JSON: " + dVar, th);
                    this.a.D().a("PersistentPostbackQueueSaveTask", "serializePostback", th);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pb", jSONArray);
                InputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes("UTF-8"));
                m G = this.a.G();
                if (G.a(byteArrayInputStream, G.a("persistent_postback_cache.json", k.o()), true)) {
                    if (o.a()) {
                        this.h.a("PersistentPostbackQueueSaveTask", "Exported postback queue to disk.");
                    }
                } else if (o.a()) {
                    this.h.b("PersistentPostbackQueueSaveTask", "Unable to export postback queue to disk.");
                }
            } catch (Throwable th2) {
                o.c("PersistentPostbackQueueSaveTask", "Unable to export postbacks to disk: " + jSONArray, th2);
                this.a.D().a("PersistentPostbackQueueSaveTask", "serializePostbackQueue", th2);
            }
            this.i.set(false);
        }
    }
}
