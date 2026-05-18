package com.google.android.gms.games.internal.v2.appshortcuts;

import Y6.b;
import android.app.Activity;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.internal.games_v2.zzad;
import com.google.android.gms.internal.games_v2.zzfl;

@zzad
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class PlayGamesAppShortcutsActivity extends Activity {
    public Intent a;

    public static /* synthetic */ void a(PlayGamesAppShortcutsActivity playGamesAppShortcutsActivity) {
        playGamesAppShortcutsActivity.startActivityForResult(playGamesAppShortcutsActivity.a, 1005000001);
        playGamesAppShortcutsActivity.finish();
        System.exit(0);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1005000000) {
            return;
        }
        if (i2 != -1) {
            finish();
        } else {
            new zzfl(Looper.getMainLooper()).postDelayed(new b(this), 50L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.games.internal.v2.appshortcuts.PlayGamesAppShortcutsActivity.onCreate(android.os.Bundle):void");
    }
}
