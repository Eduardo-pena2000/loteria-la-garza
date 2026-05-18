package com.google.android.gms.internal.games_v2;

import T6.l;
import a7.f;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzdj implements l {
    private final zzaq zza;

    public zzdj(zzaq zzaqVar) {
        this.zza = zzaqVar;
    }

    public final Task getAllLeaderboardsIntent() {
        return this.zza.zzb(new zzdc());
    }

    public final Task getLeaderboardIntent(String str) {
        return getLeaderboardIntent(str, -1, -1);
    }

    public final Task loadCurrentPlayerLeaderboardScore(String str, int i, int i2) {
        return this.zza.zzb(new zzcu(str, i, i2));
    }

    public final Task loadLeaderboardMetadata(String str, boolean z) {
        return this.zza.zzb(new zzdb(str, z));
    }

    public final Task loadMoreScores(f fVar, int i, int i2) {
        return this.zza.zzb(new zzda(fVar, i, i2));
    }

    public final Task loadPlayerCenteredScores(String str, int i, int i2, int i3) {
        return this.zza.zzb(new zzcr(str, i, i2, i3, false));
    }

    public final Task loadTopScores(String str, int i, int i2, int i3) {
        return this.zza.zzb(new zzdh(str, i, i2, i3, false));
    }

    public final void submitScore(String str, long j) {
        this.zza.zzb(new zzcp(str, j));
    }

    public final Task submitScoreImmediate(String str, long j) {
        return this.zza.zzb(new zzcp(str, j));
    }

    public final Task getLeaderboardIntent(String str, int i) {
        return getLeaderboardIntent(str, i, -1);
    }

    public final Task loadLeaderboardMetadata(boolean z) {
        return this.zza.zzb(new zzdi(z));
    }

    public final Task loadPlayerCenteredScores(String str, int i, int i2, int i3, boolean z) {
        return this.zza.zzb(new zzcr(str, i, i2, i3, z));
    }

    public final Task loadTopScores(String str, int i, int i2, int i3, boolean z) {
        return this.zza.zzb(new zzdh(str, i, i2, i3, z));
    }

    public final void submitScore(String str, long j, String str2) {
        this.zza.zzb(new zzdg(str, j, str2));
    }

    public final Task submitScoreImmediate(String str, long j, String str2) {
        return this.zza.zzb(new zzdg(str, j, str2));
    }

    public final Task getLeaderboardIntent(String str, int i, int i2) {
        return this.zza.zzb(new zzcw(str, i, i2));
    }
}
