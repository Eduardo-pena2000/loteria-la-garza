package com.unity3d.services.ads.video;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.widget.VideoView;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class VideoPlayerView extends VideoView {
    private AudioManager _audioManager;
    private final IEventSender _eventSender;
    private boolean _infoListenerEnabled;
    private MediaPlayer _mediaPlayer;
    private Timer _prepareTimer;
    private int _progressEventInterval;
    private Timer _videoTimer;
    private String _videoUrl;
    private Float _volume;

    public class 1 extends TimerTask {
        public 1() {
        }

        public void run() {
            boolean z = false;
            try {
                z = VideoPlayerView.this.isPlaying();
                VideoPlayerView.access$000(VideoPlayerView.this).sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.PROGRESS, Integer.valueOf(VideoPlayerView.this.getCurrentPosition()));
            } catch (IllegalStateException e) {
                DeviceLog.exception("Exception while sending current position to webapp", e);
                VideoPlayerView.access$000(VideoPlayerView.this).sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.ILLEGAL_STATE, VideoPlayerEvent.PROGRESS, VideoPlayerView.access$100(VideoPlayerView.this), Boolean.valueOf(z));
            }
        }
    }

    public class 2 extends TimerTask {
        public 2() {
        }

        public void run() {
            boolean z = false;
            try {
                z = VideoPlayerView.this.isPlaying();
                if (z) {
                    return;
                }
                VideoPlayerView.access$000(VideoPlayerView.this).sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.PREPARE_TIMEOUT, VideoPlayerView.access$100(VideoPlayerView.this));
                DeviceLog.error("Video player prepare timeout: " + VideoPlayerView.access$100(VideoPlayerView.this));
            } catch (IllegalStateException e) {
                DeviceLog.exception("Exception while preparing timer", e);
                VideoPlayerView.access$000(VideoPlayerView.this).sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.ILLEGAL_STATE, VideoPlayerEvent.PREPARE_TIMEOUT, VideoPlayerView.access$100(VideoPlayerView.this), Boolean.valueOf(z));
            }
        }
    }

    public class 3 implements MediaPlayer.OnPreparedListener {
        final /* synthetic */ float val$initialVolume;

        public 3(float f) {
            this.val$initialVolume = f;
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            VideoPlayerView.this.stopPrepareTimer();
            if (mediaPlayer != null) {
                VideoPlayerView.access$202(VideoPlayerView.this, mediaPlayer);
            }
            VideoPlayerView.this.setVolume(Float.valueOf(this.val$initialVolume));
            VideoPlayerView.access$000(VideoPlayerView.this).sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.PREPARED, VideoPlayerView.access$100(VideoPlayerView.this), Integer.valueOf(mediaPlayer.getDuration()), Integer.valueOf(mediaPlayer.getVideoWidth()), Integer.valueOf(mediaPlayer.getVideoHeight()));
        }
    }

    public class 4 implements MediaPlayer.OnErrorListener {
        public 4() {
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            VideoPlayerView.this.stopPrepareTimer();
            if (mediaPlayer != null) {
                VideoPlayerView.access$202(VideoPlayerView.this, mediaPlayer);
            }
            VideoPlayerView.access$000(VideoPlayerView.this).sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.GENERIC_ERROR, VideoPlayerView.access$100(VideoPlayerView.this), Integer.valueOf(i), Integer.valueOf(i2));
            VideoPlayerView.this.stopVideoProgressTimer();
            return true;
        }
    }

    public class 5 implements MediaPlayer.OnCompletionListener {
        public 5() {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            if (mediaPlayer != null) {
                VideoPlayerView.access$202(VideoPlayerView.this, mediaPlayer);
            }
            VideoPlayerView.access$000(VideoPlayerView.this).sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.COMPLETED, VideoPlayerView.access$100(VideoPlayerView.this));
            VideoPlayerView.this.stopVideoProgressTimer();
        }
    }

    public class 6 implements MediaPlayer.OnInfoListener {
        public 6() {
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            VideoPlayerView.access$000(VideoPlayerView.this).sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.INFO, VideoPlayerView.access$100(VideoPlayerView.this), Integer.valueOf(i), Integer.valueOf(i2));
            return true;
        }
    }

    public VideoPlayerView(Context context) {
        this(context, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public static /* synthetic */ IEventSender access$000(VideoPlayerView videoPlayerView) {
        return videoPlayerView._eventSender;
    }

    public static /* synthetic */ String access$100(VideoPlayerView videoPlayerView) {
        return videoPlayerView._videoUrl;
    }

    public static /* synthetic */ MediaPlayer access$202(VideoPlayerView videoPlayerView, MediaPlayer mediaPlayer) {
        videoPlayerView._mediaPlayer = mediaPlayer;
        return mediaPlayer;
    }

    private void startPrepareTimer(long j) {
        Timer timer = new Timer();
        this._prepareTimer = timer;
        timer.schedule(new 2(), j);
    }

    private void startVideoProgressTimer() {
        Timer timer = new Timer();
        this._videoTimer = timer;
        1 r1 = new 1();
        int i = this._progressEventInterval;
        timer.scheduleAtFixedRate(r1, i, i);
    }

    public int getProgressEventInterval() {
        return this._progressEventInterval;
    }

    public int[] getVideoViewRectangle() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        return new int[]{iArr[0], iArr[1], getMeasuredWidth(), getMeasuredHeight()};
    }

    public float getVolume() {
        return this._volume.floatValue();
    }

    public void pause() {
        try {
            super.pause();
            if (Build.VERSION.SDK_INT < 26) {
                AudioManager audioManager = this._audioManager;
                if (audioManager != null) {
                    audioManager.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
                }
            } else {
                a.a(this, 0);
            }
            stopVideoProgressTimer();
            this._eventSender.sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.PAUSE, this._videoUrl);
        } catch (Exception e) {
            this._eventSender.sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.PAUSE_ERROR, this._videoUrl);
            DeviceLog.exception("Error pausing video", e);
        }
    }

    public void play() {
        DeviceLog.entered();
        setOnCompletionListener(new 5());
        try {
            start();
            stopVideoProgressTimer();
            startVideoProgressTimer();
            this._eventSender.sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.PLAY, this._videoUrl);
        } catch (IllegalStateException unused) {
            this._eventSender.sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.ILLEGAL_STATE, this._videoUrl, Boolean.FALSE);
        }
    }

    public boolean prepare(String str, float f, int i) {
        DeviceLog.entered();
        this._videoUrl = str;
        setOnPreparedListener(new 3(f));
        setOnErrorListener(new 4());
        setInfoListenerEnabled(this._infoListenerEnabled);
        if (i > 0) {
            startPrepareTimer(i);
        }
        try {
            if (Build.VERSION.SDK_INT < 26) {
                AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
                this._audioManager = audioManager;
                if (audioManager != null) {
                    audioManager.requestAudioFocus((AudioManager.OnAudioFocusChangeListener) null, 3, 2);
                }
            } else {
                a.a(this, 2);
            }
            setVideoPath(this._videoUrl);
            return true;
        } catch (Exception e) {
            this._eventSender.sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.PREPARE_ERROR, this._videoUrl);
            DeviceLog.exception("Error preparing video: " + this._videoUrl, e);
            return false;
        }
    }

    public void seekTo(int i) {
        try {
            super.seekTo(i);
            this._eventSender.sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.SEEKTO, this._videoUrl);
        } catch (Exception e) {
            this._eventSender.sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.SEEKTO_ERROR, this._videoUrl);
            DeviceLog.exception("Error seeking video", e);
        }
    }

    public void setInfoListenerEnabled(boolean z) {
        this._infoListenerEnabled = z;
        if (z) {
            setOnInfoListener(new 6());
        } else {
            setOnInfoListener((MediaPlayer.OnInfoListener) null);
        }
    }

    public void setProgressEventInterval(int i) {
        this._progressEventInterval = i;
        if (this._videoTimer != null) {
            stopVideoProgressTimer();
            startVideoProgressTimer();
        }
    }

    public void setVolume(Float f) {
        try {
            this._mediaPlayer.setVolume(f.floatValue(), f.floatValue());
            this._volume = f;
        } catch (Exception e) {
            DeviceLog.exception("MediaPlayer generic error", e);
        }
    }

    public void stop() {
        stopPlayback();
        stopVideoProgressTimer();
        if (Build.VERSION.SDK_INT < 26) {
            AudioManager audioManager = this._audioManager;
            if (audioManager != null) {
                audioManager.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
            }
        } else {
            a.a(this, 0);
        }
        this._eventSender.sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.STOP, this._videoUrl);
    }

    public void stopPrepareTimer() {
        Timer timer = this._prepareTimer;
        if (timer != null) {
            timer.cancel();
            this._prepareTimer.purge();
            this._prepareTimer = null;
        }
    }

    public void stopVideoProgressTimer() {
        Timer timer = this._videoTimer;
        if (timer != null) {
            timer.cancel();
            this._videoTimer.purge();
            this._videoTimer = null;
        }
    }

    public VideoPlayerView(Context context, IEventSender iEventSender) {
        super(context);
        this._progressEventInterval = 500;
        this._mediaPlayer = null;
        this._volume = null;
        this._infoListenerEnabled = true;
        this._audioManager = null;
        this._eventSender = iEventSender;
    }
}
