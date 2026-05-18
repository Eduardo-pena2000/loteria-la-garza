package U2;

import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract /* synthetic */ class z0 {
    public static /* bridge */ /* synthetic */ void a(PlaybackSession playbackSession, TrackChangeEvent trackChangeEvent) {
        playbackSession.reportTrackChangeEvent(trackChangeEvent);
    }
}
