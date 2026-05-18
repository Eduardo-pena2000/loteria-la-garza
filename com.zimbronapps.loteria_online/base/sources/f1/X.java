package f1;

import Z0.W0;
import android.view.inputmethod.ExtractedText;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class x {
    public static final ExtractedText a(U u) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = u.l();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = u.l().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = W0.l(u.k());
        extractedText.selectionEnd = W0.k(u.k());
        extractedText.flags = !Za.E.S(u.l(), '\n', false, 2, (Object) null) ? 1 : 0;
        return extractedText;
    }
}
