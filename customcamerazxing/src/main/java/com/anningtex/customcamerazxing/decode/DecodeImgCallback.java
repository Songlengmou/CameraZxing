package com.anningtex.customcamerazxing.decode;

import com.google.zxing.Result;

/**
 * @author Song
 * desc: 解析图片的回调
 */

public interface DecodeImgCallback {
    void onImageDecodeSuccess(Result result);

    void onImageDecodeFailed();
}
