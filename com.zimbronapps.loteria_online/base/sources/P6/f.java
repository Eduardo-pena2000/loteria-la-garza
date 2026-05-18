package p6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth-api.zbbb;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class f implements Runnable {
    public static final A6.a c = new A6.a("RevokeAccessOperation", new String[0]);
    public final String a;
    public final com.google.android.gms.common.api.internal.v b = new com.google.android.gms.common.api.internal.v(null);

    public f(String str) {
        this.a = com.google.android.gms.common.internal.t.f(str);
    }

    public static com.google.android.gms.common.api.i a(String str) {
        if (str == null) {
            return com.google.android.gms.common.api.j.a(new Status(4), null);
        }
        f fVar = new f(str);
        new Thread(fVar).start();
        return fVar.b;
    }

    public final void run() {
        Status status = Status.h;
        try {
            String str = this.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
            sb.append("https://accounts.google.com/o/oauth2/revoke?token=");
            sb.append(str);
            URL url = new URL(sb.toString());
            int i = zbbb.zbb;
            HttpURLConnection openConnection = url.openConnection();
            openConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = openConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f;
            } else {
                c.c("Unable to revoke access!", new Object[0]);
            }
            A6.a aVar = c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(responseCode).length() + 15);
            sb2.append("Response Code: ");
            sb2.append(responseCode);
            aVar.a(sb2.toString(), new Object[0]);
        } catch (Exception e) {
            c.c("Exception when revoking access: ".concat(String.valueOf(e.toString())), new Object[0]);
        } catch (IOException e2) {
            c.c("IOException when revoking access: ".concat(String.valueOf(e2.toString())), new Object[0]);
        }
        this.b.setResult(status);
    }
}
