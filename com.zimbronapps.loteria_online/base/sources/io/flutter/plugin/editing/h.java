package io.flutter.plugin.editing;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import ca.s;
import ca.x;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.i;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class h extends BaseInputConnection implements i.b {
    public final View a;
    public final int b;
    public final s c;
    public final x d;
    public final i e;
    public final EditorInfo f;
    public ExtractedTextRequest g;
    public boolean h;
    public CursorAnchorInfo.Builder i;
    public ExtractedText j;
    public InputMethodManager k;
    public final Layout l;
    public io.flutter.plugin.editing.a m;
    public final a n;
    public int o;

    public interface a {
        boolean a(KeyEvent keyEvent);
    }

    public h(View view, int i, x xVar, s sVar, a aVar, i iVar, EditorInfo editorInfo, FlutterJNI flutterJNI) {
        super(view, true);
        this.h = false;
        this.j = new ExtractedText();
        this.o = 0;
        this.a = view;
        this.b = i;
        this.d = xVar;
        this.c = sVar;
        this.e = iVar;
        iVar.a(this);
        this.f = editorInfo;
        this.n = aVar;
        this.m = new io.flutter.plugin.editing.a(flutterJNI);
        this.l = new DynamicLayout(iVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.k = (InputMethodManager) view.getContext().getSystemService("input_method");
    }

    public void b(boolean z, boolean z2, boolean z3) {
        this.k.updateSelection(this.a, this.e.i(), this.e.h(), this.e.g(), this.e.f());
        ExtractedTextRequest extractedTextRequest = this.g;
        if (extractedTextRequest != null) {
            this.k.updateExtractedText(this.a, extractedTextRequest.token, e(extractedTextRequest));
        }
        if (this.h) {
            this.k.updateCursorAnchorInfo(this.a, d());
        }
    }

    public boolean beginBatchEdit() {
        this.e.b();
        this.o++;
        return super.beginBatchEdit();
    }

    public final boolean c(int i) {
        if (i == 16908319) {
            setSelection(0, this.e.length());
            return true;
        }
        if (i == 16908320) {
            int selectionStart = Selection.getSelectionStart(this.e);
            int selectionEnd = Selection.getSelectionEnd(this.e);
            if (selectionStart != selectionEnd) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                ((ClipboardManager) this.a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.e.subSequence(min, max)));
                this.e.delete(min, max);
                setSelection(min, min);
            }
            return true;
        }
        if (i == 16908321) {
            int selectionStart2 = Selection.getSelectionStart(this.e);
            int selectionEnd2 = Selection.getSelectionEnd(this.e);
            if (selectionStart2 != selectionEnd2) {
                ((ClipboardManager) this.a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.e.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        }
        if (i != 16908322) {
            return false;
        }
        ClipData primaryClip = ((ClipboardManager) this.a.getContext().getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip != null) {
            CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(this.a.getContext());
            int max2 = Math.max(0, Selection.getSelectionStart(this.e));
            int max3 = Math.max(0, Selection.getSelectionEnd(this.e));
            int min2 = Math.min(max2, max3);
            int max4 = Math.max(max2, max3);
            if (min2 != max4) {
                this.e.delete(min2, max4);
            }
            this.e.insert(min2, coerceToText);
            int length = min2 + coerceToText.length();
            setSelection(length, length);
        }
        return true;
    }

    public boolean clearMetaKeyStates(int i) {
        return super.clearMetaKeyStates(i);
    }

    public void closeConnection() {
        super.closeConnection();
        this.e.l(this);
        while (this.o > 0) {
            endBatchEdit();
            this.o--;
        }
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                d.a(inputContentInfo);
                if (e.a(inputContentInfo).getMimeTypeCount() > 0) {
                    d.a(inputContentInfo);
                    Uri a2 = f.a(inputContentInfo);
                    String mimeType = e.a(inputContentInfo).getMimeType(0);
                    Context context = this.a.getContext();
                    if (a2 != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(a2);
                            if (openInputStream != null) {
                                byte[] i2 = i(openInputStream, 65536);
                                Map hashMap = new HashMap();
                                hashMap.put("mimeType", mimeType);
                                hashMap.put("data", i2);
                                hashMap.put("uri", a2.toString());
                                this.d.b(this.b, hashMap);
                                g.a(inputContentInfo);
                                return true;
                            }
                        } catch (FileNotFoundException unused) {
                            g.a(inputContentInfo);
                            return false;
                        }
                    }
                    g.a(inputContentInfo);
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    public boolean commitText(CharSequence charSequence, int i) {
        return super.commitText(charSequence, i);
    }

    public final CursorAnchorInfo d() {
        CursorAnchorInfo.Builder builder = this.i;
        if (builder == null) {
            this.i = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        this.i.setSelectionRange(this.e.i(), this.e.h());
        int g = this.e.g();
        int f = this.e.f();
        if (g < 0 || f <= g) {
            this.i.setComposingText(-1, "");
        } else {
            this.i.setComposingText(g, this.e.toString().subSequence(g, f));
        }
        return this.i.build();
    }

    public boolean deleteSurroundingText(int i, int i2) {
        if (this.e.i() == -1) {
            return true;
        }
        return super.deleteSurroundingText(i, i2);
    }

    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return super.deleteSurroundingTextInCodePoints(i, i2);
    }

    public final ExtractedText e(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.j;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = this.e.i();
        this.j.selectionEnd = this.e.h();
        this.j.text = (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) ? this.e.toString() : this.e;
        return this.j;
    }

    public boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.o--;
        this.e.d();
        return endBatchEdit;
    }

    public final boolean f(boolean z, boolean z2) {
        int selectionStart = Selection.getSelectionStart(this.e);
        int selectionEnd = Selection.getSelectionEnd(this.e);
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        int max = z ? Math.max(this.m.b(this.e, selectionEnd), 0) : Math.min(this.m.a(this.e, selectionEnd), this.e.length());
        if (selectionStart != selectionEnd || z2) {
            setSelection(selectionStart, max);
            return true;
        }
        setSelection(max, max);
        return true;
    }

    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    public boolean g(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 21) {
                return f(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 22) {
                return f(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 19) {
                return h(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 20) {
                return h(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                EditorInfo editorInfo = this.f;
                if ((editorInfo.inputType & 131072) == 0) {
                    performEditorAction(editorInfo.imeOptions & 255);
                    return true;
                }
            }
            int selectionStart = Selection.getSelectionStart(this.e);
            int selectionEnd = Selection.getSelectionEnd(this.e);
            int unicodeChar = keyEvent.getUnicodeChar();
            if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                beginBatchEdit();
                if (min != max) {
                    this.e.delete(min, max);
                }
                this.e.insert(min, String.valueOf((char) unicodeChar));
                int i = min + 1;
                setSelection(i, i);
                endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public Editable getEditable() {
        return this.e;
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        if (z == (this.g == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled text monitoring ");
            sb.append(z ? "on" : "off");
            Q9.b.a("InputConnectionAdaptor", sb.toString());
        }
        this.g = z ? extractedTextRequest : null;
        return e(extractedTextRequest);
    }

    public final boolean h(boolean z, boolean z2) {
        int selectionStart = Selection.getSelectionStart(this.e);
        int selectionEnd = Selection.getSelectionEnd(this.e);
        boolean z3 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z2) {
            z3 = true;
        }
        beginBatchEdit();
        if (z3) {
            if (z) {
                Selection.moveUp(this.e, this.l);
            } else {
                Selection.moveDown(this.e, this.l);
            }
            int selectionStart2 = Selection.getSelectionStart(this.e);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z) {
                Selection.extendUp(this.e, this.l);
            } else {
                Selection.extendDown(this.e, this.l);
            }
            setSelection(Selection.getSelectionStart(this.e), Selection.getSelectionEnd(this.e));
        }
        endBatchEdit();
        return true;
    }

    public final byte[] i(InputStream inputStream, int i) {
        int i2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i];
        while (true) {
            try {
                i2 = inputStream.read(bArr);
            } catch (IOException unused) {
                i2 = -1;
            }
            if (i2 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }

    public boolean performContextMenuAction(int i) {
        beginBatchEdit();
        boolean c = c(i);
        endBatchEdit();
        return c;
    }

    public boolean performEditorAction(int i) {
        if (i == 0) {
            this.d.o(this.b);
        } else if (i == 1) {
            this.d.g(this.b);
        } else if (i == 2) {
            this.d.f(this.b);
        } else if (i == 3) {
            this.d.l(this.b);
        } else if (i == 4) {
            this.d.m(this.b);
        } else if (i == 5) {
            this.d.h(this.b);
        } else if (i != 7) {
            this.d.e(this.b);
        } else {
            this.d.j(this.b);
        }
        return true;
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        this.d.i(this.b, str, bundle);
        return true;
    }

    public boolean requestCursorUpdates(int i) {
        if ((i & 1) != 0) {
            this.k.updateCursorAnchorInfo(this.a, d());
        }
        boolean z = (i & 2) != 0;
        if (z != this.h) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled cursor monitoring ");
            sb.append(z ? "on" : "off");
            Q9.b.a("InputConnectionAdaptor", sb.toString());
        }
        this.h = z;
        return true;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.n.a(keyEvent);
    }

    public boolean setComposingRegion(int i, int i2) {
        return super.setComposingRegion(i, i2);
    }

    public boolean setComposingText(CharSequence charSequence, int i) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, i) : super.setComposingText(charSequence, i);
        endBatchEdit();
        return commitText;
    }

    public boolean setSelection(int i, int i2) {
        beginBatchEdit();
        boolean selection = super.setSelection(i, i2);
        endBatchEdit();
        return selection;
    }

    public h(View view, int i, x xVar, s sVar, a aVar, i iVar, EditorInfo editorInfo) {
        this(view, i, xVar, sVar, aVar, iVar, editorInfo, new FlutterJNI());
    }
}
