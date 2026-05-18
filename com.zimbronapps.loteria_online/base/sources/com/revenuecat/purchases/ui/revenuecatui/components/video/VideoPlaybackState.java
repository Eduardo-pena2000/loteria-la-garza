package com.revenuecat.purchases.ui.revenuecatui.components.video;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoPlaybackState implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator CREATOR = new Creator();
    private final boolean playWhenReady;
    private final int positionMs;

    public static final class Creator implements Parcelable.Creator {
        public final VideoPlaybackState createFromParcel(Parcel parcel) {
            t.g(parcel, "parcel");
            return new VideoPlaybackState(parcel.readInt(), parcel.readInt() != 0);
        }

        public final VideoPlaybackState[] newArray(int i) {
            return new VideoPlaybackState[i];
        }
    }

    public VideoPlaybackState(int i, boolean z) {
        this.positionMs = i;
        this.playWhenReady = z;
    }

    public static /* synthetic */ VideoPlaybackState copy$default(VideoPlaybackState videoPlaybackState, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = videoPlaybackState.positionMs;
        }
        if ((i2 & 2) != 0) {
            z = videoPlaybackState.playWhenReady;
        }
        return videoPlaybackState.copy(i, z);
    }

    public final int component1() {
        return this.positionMs;
    }

    public final boolean component2() {
        return this.playWhenReady;
    }

    public final VideoPlaybackState copy(int i, boolean z) {
        return new VideoPlaybackState(i, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoPlaybackState)) {
            return false;
        }
        VideoPlaybackState videoPlaybackState = (VideoPlaybackState) obj;
        return this.positionMs == videoPlaybackState.positionMs && this.playWhenReady == videoPlaybackState.playWhenReady;
    }

    public final boolean getPlayWhenReady() {
        return this.playWhenReady;
    }

    public final int getPositionMs() {
        return this.positionMs;
    }

    public int hashCode() {
        return (Integer.hashCode(this.positionMs) * 31) + Boolean.hashCode(this.playWhenReady);
    }

    public String toString() {
        return "VideoPlaybackState(positionMs=" + this.positionMs + ", playWhenReady=" + this.playWhenReady + ')';
    }

    public void writeToParcel(Parcel out, int i) {
        t.g(out, "out");
        out.writeInt(this.positionMs);
        out.writeInt(this.playWhenReady ? 1 : 0);
    }
}
