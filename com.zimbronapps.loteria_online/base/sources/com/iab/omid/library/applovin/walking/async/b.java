package com.iab.omid.library.applovin.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class b extends AsyncTask {
    private a a;
    protected final b b;

    public interface a {
        void a(b bVar);
    }

    public interface b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(b bVar) {
        this.b = bVar;
    }

    public void a(a aVar) {
        this.a = aVar;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
