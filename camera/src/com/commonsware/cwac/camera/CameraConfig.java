package com.commonsware.cwac.camera;

import java.nio.charset.CodingErrorAction;

/**
 * Created by gregoire barret on 7/21/15.
 * For MasuProj project.
 */
public class CameraConfig {
    public static final String TAG = "CameraConfig";

    private int mMaxWidth;
    private int mMaxHeight;
    private static CameraConfig sInstance;

    public CameraConfig(int maxWidth, int maxHeight) {
        this.mMaxWidth = maxWidth;
        this.mMaxHeight = maxHeight;
        this.sInstance = this;
    }

    public static CameraConfig getInstance(){
        return sInstance;
    }

    public int getMaxWidth() {
        return mMaxWidth;
    }

    public int getMaxHeight() {
        return mMaxHeight;
    }

    public static class  Builder{
        public int mMaxWidth = 0;
        public int mMaxHeight = 0;

        public Builder setMaxWidth(int maxWidth) {
            this.mMaxWidth = maxWidth;
            return this;
        }

        public Builder setMaxHeight(int maxHeight) {
            this.mMaxHeight = maxHeight;
            return this;
        }

        public CameraConfig build(){
            return new CameraConfig(mMaxWidth , mMaxHeight);
        }
    }
}
