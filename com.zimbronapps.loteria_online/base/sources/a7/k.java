package a7;

import android.util.SparseArray;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.games_v2.zzz;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class k {
    public String a;
    public String b;
    public int c;
    public SparseArray d = new SparseArray();

    public static final class a {
        public final long a;
        public final String b;
        public final String c;
        public final boolean d;

        public a(long j, String str, String str2, boolean z) {
            this.a = j;
            this.b = str;
            this.c = str2;
            this.d = z;
        }

        public String toString() {
            return r.d(this).a("RawScore", Long.valueOf(this.a)).a("FormattedScore", this.b).a("ScoreTag", this.c).a("NewBest", Boolean.valueOf(this.d)).toString();
        }
    }

    public k(DataHolder dataHolder) {
        this.c = dataHolder.Q1();
        int count = dataHolder.getCount();
        t.a(count == 3);
        int i = 0;
        while (i < count) {
            int S1 = dataHolder.S1(i);
            if (i == 0) {
                this.a = dataHolder.R1("leaderboardId", 0, S1);
                this.b = dataHolder.R1("playerId", 0, S1);
                i = 0;
            }
            if (dataHolder.M1("hasResult", i, S1)) {
                this.d.put(dataHolder.N1("timeSpan", i, S1), new a(dataHolder.O1("rawScore", i, S1), dataHolder.R1("formattedScore", i, S1), dataHolder.R1("scoreTag", i, S1), dataHolder.M1("newBest", i, S1)));
            }
            i++;
        }
    }

    public String toString() {
        r.a a2 = r.d(this).a("PlayerId", this.b).a("StatusCode", Integer.valueOf(this.c));
        for (int i = 0; i < 3; i++) {
            a aVar = (a) this.d.get(i);
            a2.a("TimesSpan", zzz.zza(i));
            a2.a("Result", aVar == null ? "null" : aVar.toString());
        }
        return a2.toString();
    }
}
