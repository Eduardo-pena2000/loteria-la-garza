package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Ca.I;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.MediaController;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

@SuppressLint({"ViewConstructor"})
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
final class TextureVideoView extends FrameLayout implements MediaController.MediaPlayerControl {
    private boolean autoStart;
    private MediaController controller;
    private boolean firstFrameRendered;
    private final ViewTreeObserver.OnGlobalLayoutListener layoutListener;
    private boolean looping;
    private final boolean muteAudio;
    private Qa.a onReadyCallback;
    private final MediaPlayer player;
    private boolean prepared;
    private boolean released;
    private boolean resumePlayWhenReady;
    private int resumePosMs;
    private ScaleType scaleType;
    private final boolean showControls;
    private final TextureView texture;
    private Uri uri;
    private int videoHeight;
    private int videoWidth;
    private boolean viewTreeObserverListening;

    public static final class 1 implements TextureView.SurfaceTextureListener {
        public 1() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture st, int i, int i2) {
            t.g(st, "st");
            if (TextureVideoView.access$getReleased$p(TextureVideoView.this)) {
                return;
            }
            TextureVideoView.access$getPlayer$p(TextureVideoView.this).setSurface(new Surface(st));
            if (!TextureVideoView.access$getViewTreeObserverListening$p(TextureVideoView.this)) {
                TextureVideoView.this.getViewTreeObserver().addOnGlobalLayoutListener(TextureVideoView.access$getLayoutListener$p(TextureVideoView.this));
                TextureVideoView.access$setViewTreeObserverListening$p(TextureVideoView.this, true);
            }
            if (!TextureVideoView.access$getPrepared$p(TextureVideoView.this)) {
                TextureVideoView.access$prepareIfNeeded(TextureVideoView.this);
                return;
            }
            TextureVideoView textureVideoView = TextureVideoView.this;
            TextureVideoView.access$safeSeekTo(textureVideoView, TextureVideoView.access$getResumePosMs$p(textureVideoView));
            if (TextureVideoView.access$getResumePlayWhenReady$p(TextureVideoView.this)) {
                TextureVideoView.this.start();
            }
            TextureVideoView.access$applySizing(TextureVideoView.this);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture st) {
            t.g(st, "st");
            if (TextureVideoView.access$getReleased$p(TextureVideoView.this)) {
                return true;
            }
            TextureVideoView textureVideoView = TextureVideoView.this;
            TextureVideoView.access$setResumePlayWhenReady$p(textureVideoView, textureVideoView.isPlaying());
            TextureVideoView textureVideoView2 = TextureVideoView.this;
            TextureVideoView.access$setResumePosMs$p(textureVideoView2, textureVideoView2.getCurrentPosition());
            if (TextureVideoView.access$getPrepared$p(TextureVideoView.this)) {
                VideoViewKt.safely$default(new TextureVideoView$1$onSurfaceTextureDestroyed$1(TextureVideoView.this), null, 2, null);
            }
            TextureVideoView.access$getPlayer$p(TextureVideoView.this).setSurface((Surface) null);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture st, int i, int i2) {
            t.g(st, "st");
            TextureVideoView.access$applySizing(TextureVideoView.this);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture st) {
            t.g(st, "st");
            if (TextureVideoView.access$getFirstFrameRendered$p(TextureVideoView.this) || !TextureVideoView.access$getPrepared$p(TextureVideoView.this)) {
                return;
            }
            TextureVideoView.access$setFirstFrameRendered$p(TextureVideoView.this, true);
            Qa.a access$getOnReadyCallback$p = TextureVideoView.access$getOnReadyCallback$p(TextureVideoView.this);
            if (access$getOnReadyCallback$p != null) {
                access$getOnReadyCallback$p.invoke();
            }
        }
    }

    public static final class PlaybackState {
        public static final int $stable = 0;
        private final boolean playWhenReady;
        private final int positionMs;

        public PlaybackState(int i, boolean z) {
            this.positionMs = i;
            this.playWhenReady = z;
        }

        public final boolean getPlayWhenReady() {
            return this.playWhenReady;
        }

        public final int getPositionMs() {
            return this.positionMs;
        }
    }

    public enum ScaleType {
        FIT,
        FILL
    }

    public static final class 1 extends u implements Qa.a {
        public 1() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            TextureVideoView.access$getPlayer$p(TextureVideoView.this).pause();
        }
    }

    public static final class 1 extends u implements Qa.a {
        public 1() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            TextureVideoView.access$getPlayer$p(TextureVideoView.this).stop();
        }
    }

    public static final class 2 extends u implements Qa.a {
        public 2() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            TextureVideoView.access$getPlayer$p(TextureVideoView.this).reset();
        }
    }

    public static final class 1 extends u implements Qa.a {
        final /* synthetic */ int $position;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i) {
            super(0);
            this.$position = i;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            if (!TextureVideoView.access$getPrepared$p(TextureVideoView.this) || this.$position <= 0) {
                return;
            }
            TextureVideoView.access$getPlayer$p(TextureVideoView.this).seekTo(this.$position);
        }
    }

    public static final class 1 extends u implements Qa.a {
        public 1() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            TextureVideoView.access$getPlayer$p(TextureVideoView.this).start();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextureVideoView(Context context, boolean z, boolean z2) {
        this(context, null, z, z2, 2, null);
        t.g(context, "context");
    }

    private static final void _init_$lambda$2(TextureVideoView textureVideoView, View view) {
        MediaController mediaController;
        if (!textureVideoView.showControls || (mediaController = textureVideoView.controller) == null) {
            return;
        }
        mediaController.show();
    }

    public static /* synthetic */ void a(TextureVideoView textureVideoView, MediaPlayer mediaPlayer) {
        prepareIfNeeded$lambda$4(textureVideoView, mediaPlayer);
    }

    public static final /* synthetic */ void access$applySizing(TextureVideoView textureVideoView) {
        textureVideoView.applySizing();
    }

    public static final /* synthetic */ boolean access$getFirstFrameRendered$p(TextureVideoView textureVideoView) {
        return textureVideoView.firstFrameRendered;
    }

    public static final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener access$getLayoutListener$p(TextureVideoView textureVideoView) {
        return textureVideoView.layoutListener;
    }

    public static final /* synthetic */ Qa.a access$getOnReadyCallback$p(TextureVideoView textureVideoView) {
        return textureVideoView.onReadyCallback;
    }

    public static final /* synthetic */ MediaPlayer access$getPlayer$p(TextureVideoView textureVideoView) {
        return textureVideoView.player;
    }

    public static final /* synthetic */ boolean access$getPrepared$p(TextureVideoView textureVideoView) {
        return textureVideoView.prepared;
    }

    public static final /* synthetic */ boolean access$getReleased$p(TextureVideoView textureVideoView) {
        return textureVideoView.released;
    }

    public static final /* synthetic */ boolean access$getResumePlayWhenReady$p(TextureVideoView textureVideoView) {
        return textureVideoView.resumePlayWhenReady;
    }

    public static final /* synthetic */ int access$getResumePosMs$p(TextureVideoView textureVideoView) {
        return textureVideoView.resumePosMs;
    }

    public static final /* synthetic */ boolean access$getViewTreeObserverListening$p(TextureVideoView textureVideoView) {
        return textureVideoView.viewTreeObserverListening;
    }

    public static final /* synthetic */ void access$prepareIfNeeded(TextureVideoView textureVideoView) {
        textureVideoView.prepareIfNeeded();
    }

    public static final /* synthetic */ void access$safeSeekTo(TextureVideoView textureVideoView, int i) {
        textureVideoView.safeSeekTo(i);
    }

    public static final /* synthetic */ void access$setFirstFrameRendered$p(TextureVideoView textureVideoView, boolean z) {
        textureVideoView.firstFrameRendered = z;
    }

    public static final /* synthetic */ void access$setResumePlayWhenReady$p(TextureVideoView textureVideoView, boolean z) {
        textureVideoView.resumePlayWhenReady = z;
    }

    public static final /* synthetic */ void access$setResumePosMs$p(TextureVideoView textureVideoView, int i) {
        textureVideoView.resumePosMs = i;
    }

    public static final /* synthetic */ void access$setViewTreeObserverListening$p(TextureVideoView textureVideoView, boolean z) {
        textureVideoView.viewTreeObserverListening = z;
    }

    private final void applySizing() {
        if (this.released || getWidth() == 0 || getHeight() == 0 || this.videoWidth == 0 || this.videoHeight == 0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float f = width;
        float f2 = height;
        float f3 = f / f2;
        float f4 = this.videoWidth / this.videoHeight;
        FrameLayout.LayoutParams layoutParams = this.texture.getLayoutParams();
        t.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = layoutParams;
        if (this.scaleType == ScaleType.FIT) {
            if (f4 > f3) {
                layoutParams2.width = width;
                layoutParams2.height = (int) (f / f4);
            } else {
                layoutParams2.height = height;
                layoutParams2.width = (int) (f2 * f4);
            }
        } else if (f4 > f3) {
            layoutParams2.height = height;
            layoutParams2.width = (int) (f2 * f4);
        } else {
            layoutParams2.width = width;
            layoutParams2.height = (int) (f / f4);
        }
        layoutParams2.gravity = 17;
        this.texture.setLayoutParams(layoutParams2);
        this.texture.setVisibility(0);
        this.texture.setAlpha(1.0f);
        invalidate();
    }

    public static /* synthetic */ void b(TextureVideoView textureVideoView, MediaPlayer mediaPlayer, int i, int i2) {
        prepareIfNeeded$lambda$5(textureVideoView, mediaPlayer, i, i2);
    }

    public static /* synthetic */ void c(TextureVideoView textureVideoView, View view) {
        _init_$lambda$2(textureVideoView, view);
    }

    public static /* synthetic */ void d(TextureVideoView textureVideoView) {
        layoutListener$lambda$0(textureVideoView);
    }

    private static final void layoutListener$lambda$0(TextureVideoView textureVideoView) {
        textureVideoView.applySizing();
    }

    private final void prepareIfNeeded() {
        I i;
        if (this.released) {
            return;
        }
        Uri uri = this.uri;
        if (uri != null) {
            this.prepared = false;
            this.player.reset();
            this.player.setDataSource(getContext(), uri);
            i = I.a;
        } else {
            i = null;
        }
        if (i == null) {
            return;
        }
        this.player.setOnPreparedListener(new c(this));
        this.player.setOnVideoSizeChangedListener(new d(this));
        try {
            this.player.prepareAsync();
        } catch (IllegalStateException e) {
            if (!this.released) {
                throw e;
            }
        }
    }

    private static final void prepareIfNeeded$lambda$4(TextureVideoView textureVideoView, MediaPlayer mediaPlayer) {
        MediaController mediaController;
        if (textureVideoView.released) {
            return;
        }
        textureVideoView.prepared = true;
        textureVideoView.videoWidth = mediaPlayer.getVideoWidth();
        textureVideoView.videoHeight = mediaPlayer.getVideoHeight();
        mediaPlayer.setLooping(textureVideoView.looping);
        if (textureVideoView.muteAudio) {
            VideoViewKt.access$safely(new TextureVideoView$prepareIfNeeded$2$1(mediaPlayer), TextureVideoView$prepareIfNeeded$2$2.INSTANCE);
        }
        textureVideoView.applySizing();
        int i = textureVideoView.resumePosMs;
        if (i > 0) {
            textureVideoView.safeSeekTo(i);
        } else if (i == 0) {
            textureVideoView.safeSeekTo(1);
        }
        if (textureVideoView.autoStart || textureVideoView.resumePlayWhenReady) {
            textureVideoView.start();
        }
        if (!textureVideoView.showControls || (mediaController = textureVideoView.controller) == null) {
            return;
        }
        mediaController.show();
    }

    private static final void prepareIfNeeded$lambda$5(TextureVideoView textureVideoView, MediaPlayer mediaPlayer, int i, int i2) {
        if (textureVideoView.released) {
            return;
        }
        textureVideoView.videoWidth = i;
        textureVideoView.videoHeight = i2;
        textureVideoView.applySizing();
    }

    private final void safeSeekTo(int i) {
        VideoViewKt.safely$default(new 1(i), null, 2, null);
    }

    public boolean canPause() {
        return true;
    }

    public boolean canSeekBackward() {
        return true;
    }

    public boolean canSeekForward() {
        return true;
    }

    public int getAudioSessionId() {
        return this.player.getAudioSessionId();
    }

    public int getBufferPercentage() {
        return 0;
    }

    public int getCurrentPosition() {
        return (!this.prepared || this.released) ? this.resumePosMs : this.player.getCurrentPosition();
    }

    public int getDuration() {
        if (!this.prepared || this.released) {
            return 0;
        }
        return this.player.getDuration();
    }

    public final PlaybackState getPlaybackState() {
        int i;
        boolean z;
        if (this.prepared) {
            try {
                i = this.player.getCurrentPosition();
            } catch (Throwable unused) {
                i = this.resumePosMs;
            }
        } else {
            i = this.resumePosMs;
        }
        if (this.prepared) {
            try {
                z = this.player.isPlaying();
            } catch (Throwable unused2) {
                z = false;
            }
        } else {
            z = this.resumePlayWhenReady;
        }
        return new PlaybackState(i, z);
    }

    public boolean isPlaying() {
        return this.prepared && !this.released && this.player.isPlaying();
    }

    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        release();
    }

    public void pause() {
        if (!this.prepared || this.released) {
            return;
        }
        VideoViewKt.safely$default(new 1(), null, 2, null);
    }

    public final void release() {
        if (this.released) {
            return;
        }
        MediaController mediaController = this.controller;
        if (mediaController != null) {
            mediaController.hide();
        }
        VideoViewKt.safely$default(new 1(), null, 2, null);
        VideoViewKt.safely$default(new 2(), null, 2, null);
        this.player.release();
        this.released = true;
        if (this.viewTreeObserverListening) {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.layoutListener);
            this.viewTreeObserverListening = false;
        }
    }

    public void seekTo(int i) {
        this.resumePosMs = i;
        safeSeekTo(i);
    }

    public final void setAutoStart(boolean z) {
        this.autoStart = z;
    }

    public final void setLooping(boolean z) {
        this.looping = z;
        if (this.released) {
            return;
        }
        this.player.setLooping(z);
    }

    public final void setOnReadyCallback(Qa.a aVar) {
        this.onReadyCallback = aVar;
        if (!this.firstFrameRendered || aVar == null) {
            return;
        }
        aVar.invoke();
    }

    public final void setPlaybackState(PlaybackState state) {
        t.g(state, "state");
        this.resumePosMs = state.getPositionMs();
        this.resumePlayWhenReady = state.getPlayWhenReady();
        if (this.prepared) {
            safeSeekTo(this.resumePosMs);
            if (this.resumePlayWhenReady) {
                start();
            } else {
                pause();
            }
        }
    }

    public final void setScaleType(ScaleType type) {
        t.g(type, "type");
        this.scaleType = type;
        applySizing();
    }

    public final void setVideoURI(Uri uri) {
        t.g(uri, "uri");
        this.uri = uri;
        this.prepared = false;
        this.firstFrameRendered = false;
        if (this.resumePosMs == 0) {
            this.resumePlayWhenReady = this.autoStart;
        }
        if (!this.texture.isAvailable() || this.released) {
            return;
        }
        prepareIfNeeded();
    }

    public void start() {
        if (!this.prepared || this.released) {
            return;
        }
        VideoViewKt.safely$default(new 1(), null, 2, null);
    }

    public final void startIfNeeded() {
        if (!this.prepared || this.released || this.player.isPlaying() || !this.autoStart) {
            return;
        }
        start();
    }

    public /* synthetic */ TextureVideoView(Context context, AttributeSet attributeSet, boolean z, boolean z2, int i, k kVar) {
        this(context, (i & 2) != 0 ? null : attributeSet, z, z2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextureVideoView(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        super(context, attributeSet);
        t.g(context, "context");
        this.showControls = z;
        this.muteAudio = z2;
        TextureView textureView = new TextureView(context);
        this.texture = textureView;
        this.player = new MediaPlayer();
        this.autoStart = true;
        this.scaleType = ScaleType.FIT;
        this.layoutListener = new a(this);
        setClipToPadding(true);
        setClipChildren(true);
        addView(textureView, new FrameLayout.LayoutParams(-1, -1, 17));
        textureView.setSurfaceTextureListener(new 1());
        MediaController mediaController = new MediaController(context);
        mediaController.setMediaPlayer(this);
        if (z) {
            mediaController.setAnchorView(this);
            mediaController.setEnabled(true);
        }
        this.controller = mediaController;
        setOnClickListener(new b(this));
    }
}
