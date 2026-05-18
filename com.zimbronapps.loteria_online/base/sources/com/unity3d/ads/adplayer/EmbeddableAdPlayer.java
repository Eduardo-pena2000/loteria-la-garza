package com.unity3d.ads.adplayer;

import Ca.I;
import Ga.e;
import Ha.c;
import com.unity3d.ads.adplayer.AdPlayer;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface EmbeddableAdPlayer extends AdPlayer {

    public static final class DefaultImpls {
        public static Object destroy(EmbeddableAdPlayer embeddableAdPlayer, e eVar) {
            Object destroy = AdPlayer.DefaultImpls.destroy(embeddableAdPlayer, eVar);
            return destroy == c.f() ? destroy : I.a;
        }

        public static void show(EmbeddableAdPlayer embeddableAdPlayer, ShowOptions showOptions) {
            t.g(showOptions, "showOptions");
            AdPlayer.DefaultImpls.show(embeddableAdPlayer, showOptions);
        }
    }
}
