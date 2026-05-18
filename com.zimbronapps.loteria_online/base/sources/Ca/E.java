package ca;

import android.view.KeyEvent;
import da.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class e {
    public final da.a a;

    public interface a {
        void a(boolean z);
    }

    public static class b {
        public final KeyEvent a;
        public final Character b;

        public b(KeyEvent keyEvent, Character ch) {
            this.a = keyEvent;
            this.b = ch;
        }
    }

    public e(da.b bVar) {
        this.a = new da.a(bVar, "flutter/keyevent", da.e.a);
    }

    public static /* synthetic */ void a(a aVar, Object obj) {
        d(aVar, obj);
    }

    public static a.e b(a aVar) {
        return new d(aVar);
    }

    public static /* synthetic */ void d(a aVar, Object obj) {
        boolean z = false;
        if (obj != null) {
            try {
                z = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e) {
                Q9.b.b("KeyEventChannel", "Unable to unpack JSON message: " + e);
            }
        }
        aVar.a(z);
    }

    public final Map c(b bVar, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", z ? "keyup" : "keydown");
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(bVar.a.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(bVar.a.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(bVar.a.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(bVar.a.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(bVar.a.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(bVar.a.getMetaState()));
        Character ch = bVar.b;
        if (ch != null) {
            hashMap.put("character", ch.toString());
        }
        hashMap.put("source", Integer.valueOf(bVar.a.getSource()));
        hashMap.put("deviceId", Integer.valueOf(bVar.a.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(bVar.a.getRepeatCount()));
        return hashMap;
    }

    public void e(b bVar, boolean z, a aVar) {
        this.a.d(c(bVar, z), b(aVar));
    }
}
