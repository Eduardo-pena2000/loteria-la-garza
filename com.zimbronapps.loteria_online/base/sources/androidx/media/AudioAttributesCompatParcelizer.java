package androidx.media;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(s4.a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.a = (AudioAttributesImpl) aVar.v(audioAttributesCompat.a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, s4.a aVar) {
        aVar.x(false, false);
        aVar.M(audioAttributesCompat.a, 1);
    }
}
