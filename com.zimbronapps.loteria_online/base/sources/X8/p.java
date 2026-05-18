package x8;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class p {
    public static final Map c = new HashMap();
    public final Context a;
    public final String b;

    public p(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public static synchronized p c(Context context, String str) {
        p pVar;
        synchronized (p.class) {
            try {
                Map map = c;
                if (!map.containsKey(str)) {
                    map.put(str, new p(context, str));
                }
                pVar = (p) map.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVar;
    }

    public synchronized Void a() {
        this.a.deleteFile(this.b);
        return null;
    }

    public String b() {
        return this.b;
    }

    public synchronized com.google.firebase.remoteconfig.internal.b d() {
        FileInputStream fileInputStream;
        Throwable th;
        try {
            fileInputStream = this.a.openFileInput(this.b);
        } catch (JSONException | FileNotFoundException unused) {
            fileInputStream = null;
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
        }
        try {
            int available = fileInputStream.available();
            byte[] bArr = new byte[available];
            fileInputStream.read(bArr, 0, available);
            com.google.firebase.remoteconfig.internal.b b = com.google.firebase.remoteconfig.internal.b.b(new JSONObject(new String(bArr, "UTF-8")));
            fileInputStream.close();
            return b;
        } catch (JSONException | FileNotFoundException unused2) {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
    }

    public synchronized Void e(com.google.firebase.remoteconfig.internal.b bVar) {
        FileOutputStream openFileOutput = this.a.openFileOutput(this.b, 0);
        try {
            openFileOutput.write(bVar.toString().getBytes("UTF-8"));
        } finally {
            openFileOutput.close();
        }
        return null;
    }
}
