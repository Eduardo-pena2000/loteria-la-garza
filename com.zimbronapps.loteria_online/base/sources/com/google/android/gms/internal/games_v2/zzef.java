package com.google.android.gms.internal.games_v2;

import T6.n;
import T6.t;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzef implements t {
    private final zzaq zza;

    public zzef(zzaq zzaqVar) {
        this.zza = zzaqVar;
    }

    private final Task zza(String str, int i) {
        return this.zza.zzb(new zzdo(str, i));
    }

    private final Task zzb(String str, int i, boolean z) {
        return this.zza.zzb(new zzdp(str, i, z));
    }

    public final Task getCompareProfileIntent(n nVar) {
        return this.zza.zzb(new zzds(nVar));
    }

    public final Task getCompareProfileIntentWithAlternativeNameHints(String str, String str2, String str3) {
        return this.zza.zzb(new zzec(str, str2, str3));
    }

    public final Task getCurrentPlayer() {
        return this.zza.zzb(new zzdy());
    }

    public final Task getCurrentPlayerId() {
        return this.zza.zzb(new zzea());
    }

    public final Task getPlayerSearchIntent() {
        return this.zza.zzb(new zzdw());
    }

    public final Task loadFriends(int i, boolean z) {
        return zzb("friends_all", i, z);
    }

    public final Task loadMoreFriends(int i) {
        return zza("friends_all", i);
    }

    public final Task loadMoreRecentlyPlayedWithPlayers(int i) {
        return zza("played_with", i);
    }

    public final Task loadPlayer(String str) {
        return this.zza.zzb(new zzeb(str, false));
    }

    public final Task loadRecentlyPlayedWithPlayers(int i, boolean z) {
        return zzb("played_with", i, z);
    }

    public final Task getCompareProfileIntent(String str) {
        return this.zza.zzb(new zzec(str, null, null));
    }

    public final Task getCurrentPlayer(boolean z) {
        return this.zza.zzb(new zzdz(z));
    }

    public final Task loadPlayer(String str, boolean z) {
        return this.zza.zzb(new zzeb(str, z));
    }
}
