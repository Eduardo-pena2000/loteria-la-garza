package com.abedalkareem.games_services.models;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class LeaderboardScoreData {
    private final String displayScore;
    private final long rank;
    private final long rawScore;
    private final PlayerData scoreHolder;
    private final long timestampMillis;
    private final String token;

    public LeaderboardScoreData(long j, String str, long j2, long j3, PlayerData playerData, String str2) {
        t.g(str, "displayScore");
        t.g(playerData, "scoreHolder");
        this.rank = j;
        this.displayScore = str;
        this.rawScore = j2;
        this.timestampMillis = j3;
        this.scoreHolder = playerData;
        this.token = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardScoreData)) {
            return false;
        }
        LeaderboardScoreData leaderboardScoreData = (LeaderboardScoreData) obj;
        return this.rank == leaderboardScoreData.rank && t.c(this.displayScore, leaderboardScoreData.displayScore) && this.rawScore == leaderboardScoreData.rawScore && this.timestampMillis == leaderboardScoreData.timestampMillis && t.c(this.scoreHolder, leaderboardScoreData.scoreHolder) && t.c(this.token, leaderboardScoreData.token);
    }

    public int hashCode() {
        int hashCode = ((((((((Long.hashCode(this.rank) * 31) + this.displayScore.hashCode()) * 31) + Long.hashCode(this.rawScore)) * 31) + Long.hashCode(this.timestampMillis)) * 31) + this.scoreHolder.hashCode()) * 31;
        String str = this.token;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LeaderboardScoreData(rank=" + this.rank + ", displayScore=" + this.displayScore + ", rawScore=" + this.rawScore + ", timestampMillis=" + this.timestampMillis + ", scoreHolder=" + this.scoreHolder + ", token=" + this.token + ")";
    }
}
