package T6;

import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface l {

    public static class a implements com.google.android.gms.common.api.k {
        public final a7.a a;
        public final a7.f b;

        public a(a7.a aVar, a7.f fVar) {
            this.a = aVar;
            this.b = fVar;
        }

        public a7.f a() {
            return this.b;
        }

        public void release() {
            this.b.release();
        }
    }

    Task getAllLeaderboardsIntent();

    Task getLeaderboardIntent(String str);

    Task loadCurrentPlayerLeaderboardScore(String str, int i, int i2);

    Task loadPlayerCenteredScores(String str, int i, int i2, int i3, boolean z);

    Task loadTopScores(String str, int i, int i2, int i3, boolean z);

    Task submitScoreImmediate(String str, long j, String str2);
}
