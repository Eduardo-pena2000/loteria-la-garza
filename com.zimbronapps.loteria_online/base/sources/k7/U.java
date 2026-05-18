package k7;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class u {
    public final String a;
    public long b;
    public final /* synthetic */ w c;

    public u(w wVar, String str) {
        Objects.requireNonNull(wVar);
        this.c = wVar;
        com.google.android.gms.common.internal.t.f(str);
        this.a = str;
        this.b = -1L;
    }

    public final List a() {
        List arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = this.c.u0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{this.a, String.valueOf(this.b)}, (String) null, (String) null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    do {
                        long j = cursor.getLong(0);
                        long j2 = cursor.getLong(3);
                        boolean z = cursor.getLong(5) == 1;
                        byte[] blob = cursor.getBlob(4);
                        if (j > this.b) {
                            this.b = j;
                        }
                        try {
                            zzhr zzhrVar = (zzhr) g7.W(zzhs.zzk(), blob);
                            String string = cursor.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            zzhrVar.zzl(string);
                            zzhrVar.zzo(cursor.getLong(2));
                            arrayList.add(new t(j, j2, z, (zzhs) zzhrVar.zzbc()));
                        } catch (IOException e) {
                            this.c.a.a().o().c("Data loss. Failed to merge raw event. appId", C2.x(this.a), e);
                        }
                    } while (cursor.moveToNext());
                } else {
                    arrayList = Collections.emptyList();
                }
            } catch (SQLiteException e2) {
                this.c.a.a().o().c("Data loss. Error querying raw events batch. appId", C2.x(this.a), e2);
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursor.close();
            }
        }
    }

    public u(w wVar, String str, long j) {
        Objects.requireNonNull(wVar);
        this.c = wVar;
        com.google.android.gms.common.internal.t.f(str);
        this.a = str;
        this.b = wVar.b0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }
}
